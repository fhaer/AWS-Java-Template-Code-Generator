package de.uniba.wiai.seda.fha.swarchitektur.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Design
import com.google.inject.Injector
import org.eclipse.emf.common.util.EList
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule
import de.uniba.wiai.seda.fha.swarchitektur.SwdesignStandaloneSetup
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.List
import java.io.InputStream
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

/**
 * Codegenerator für Ecore-Modelle des Softwaredesigns
 */
class Generator {

	/**
	 * zu transformierendes Modee
	 */
	private String model
	
	/**
	 * Zielverzeichnis der generierten Artefakte
	 */
	private String targetDir
	
	/**
	 * Namespace für generierte Artefakte
	 */
	private final Namespace BASE_NAMESPACE
	
	/**
	 * Verzeichnis mit Quellcode
	 */
	private final String SOURCE_DIR
	
	/**
	 * Verzeichnis für nicht-generierten Quellcode
	 */
	private final String SRC_STATIC_DIR
	
	/**
	 * nicht-generierter Quellcode mit Methoden für alle Vorgangs-Services
	 */
	private final String SRC_STATIC_VORGANGS_SERVICE
	
	/**
	 * nicht-generierter Quellcode mit Methoden für alle Entitäts-Services
	 */
	private final String SRC_STATIC_ENTITAETS_SERVICE
	
	/**
	 * Verwaltung von Namespaces
	 */
	private NamespaceManager namespaceManager
	
	/** 
	 * Erzeugung (Schreiben) von Dateien 
	 */
	private TemplateFileWriter fileGenerator
	
	/**
	 * Generator für Konfigurationsdateien
	 */
	private DeploymentFileGenerator deploymentFileGenerator
	
	/**
	 * Generator für Java-EE-Quellcode
	 */
	private JavaEEFileGenerator javaEEFileGenerator
	
	/**
	 * Grafische Benutzeroberfläche
	 */
	private View view

	/**
	 * Konstruktor: initialisiert Variablen
	 */
	new() {
		BASE_NAMESPACE = new Namespace("de.uniba.wiai.seda.fha.awsgen")
		SOURCE_DIR = "ejbModule"
		
		SRC_STATIC_DIR = "/src-static"
		SRC_STATIC_VORGANGS_SERVICE = "VorgangsService.java"
		SRC_STATIC_ENTITAETS_SERVICE = "EntitaetsService.java"
		
		namespaceManager = new NamespaceManager()
		
		fileGenerator = new TemplateFileWriter()
		fileGenerator.setBasePath(targetDir)
		
		javaEEFileGenerator = new JavaEEFileGenerator()
		javaEEFileGenerator.setBaseNamespace(BASE_NAMESPACE)
		javaEEFileGenerator.setFileGenerator(fileGenerator)
		javaEEFileGenerator.setNamespaceManager(namespaceManager)
		
		deploymentFileGenerator = new DeploymentFileGenerator()
		deploymentFileGenerator.setFileGenerator(fileGenerator)
	}

	/**
	 * Startmethode des Generators, startet die GUI
	 */
 	def static void main(String[] args) {
  		var SwdesignStandaloneSetup setup = new SwdesignStandaloneSetup()
  		var Injector injector = setup.createInjectorAndDoEMFRegistration()
  		var Generator generator = injector.getProvider(typeof(Generator)).get
  		var View v = new View
  		generator.setView(v)
  		v.setGenerator(generator)
  		v.initView
	}
	
	/**
	 * setzt ein zu transformierendes Modell
	 */
	def setModel(String model) {
		// Modell testweise laden
		loadModelResource(model)
		// keine Exception: Modell setzen
		this.model = model
	}
	
	/**
	 * setzt das Zielverzeichnis für generierte Artefakte
	 */
	def setTargetDir(String targetDir) {
		this.targetDir = targetDir
	}
	
	/**
	 * setzt eine Referenz auf die grafische Oberfläche
	 */
	def setView(View view) {
		this.view = view
		deploymentFileGenerator.setView(view)
		javaEEFileGenerator.setView(view)
		fileGenerator.setView(view)
	}
	
	/**
	 * startet den Generator
	 */
	def void generate() throws RuntimeException {
		if (model == null) {
			throw new IllegalArgumentException("Kein Modell ausgewählt.")
		}
		if (targetDir == null) {
			throw new IllegalArgumentException("Kein Ausgabeverzeichnis ausgewählt.")
		}
		view.clearStatusText
    	val resource = loadModelResource(model)
        for (content : resource.contents) {
    		if (content instanceof Design) {
    			var architektur = content as Design
				genArchitektur(architektur)
	    	}
   		}
		fileGenerator.setGlobalEclipseDir(targetDir)
		fileGenerator.writeFiles
		view.addStatusText("\nCodegenerierung abgeschlossen")
		view.setGeneratorFinished
   	}

	/**
	 * lädt das übergebene Modell als Resource
	 */
	def loadModelResource(String model) {
		val resourceSet = new ResourceSetImpl 
    	// eindeutigen Namen für Ressource anlegen
		var resourceName = "_input" + System.currentTimeMillis + ".ecore"
    	val resource = resourceSet.createResource(URI.createFileURI(resourceName))
    	var Path path = Paths.get(model);
		var byte[] data = Files.readAllBytes(path);
        var InputStream in = new ByteArrayInputStream(data)
        resource.load(in, resourceSet.getLoadOptions())
		return resource
	}
	
	/**
	 * generiert alle Bestandteile des Softwaredesigns
	 */
	def genArchitektur(Design architektur) {
		genEJBModules(architektur.modules)
		genEntities(architektur.modules)
		genEJB(architektur.modules)
		genInterfaces(architektur.modules)
	}
	
	/**
	 * generiert Verzeichnisse mit Konfigurationsdateien
	 */
	def genEJBModules(EList<EJBModule> modules) {
		view.addStatusText("Generiere Konfiguration für EJB-Module ...")
		deploymentFileGenerator.genEclipseFiles(modules)
		deploymentFileGenerator.genQueueCreateScript(modules)
		copyStaticFiles(modules)
	}
	
	/**
	 * generiert Entities, die in den übergebenen Modulen enthalten sind
	 */ 
	def void genEntities(EList<EJBModule> moduleList) {
		view.addStatusText("Generiere JPA-Entities ...")
		for (module : moduleList) {
			if (module.entities.size > 0) {
    			javaEEFileGenerator.genEntities(module, module.entities, moduleList)
    		}
		}
	}
	
	/**
	 * generiert EJBs, die in den übergebenen Modulen enthalten sind
	 */ 
	def void genEJB(EList<EJBModule> moduleList) {
		view.addStatusText("Generiere EJBs ...")
		for (module : moduleList) {
			var importNamespaces = namespaceManager.getNamespaces(module, BASE_NAMESPACE);
    		javaEEFileGenerator.genEJB(module.ejb, module, importNamespaces)
		}
	}
	
	/**
	 * generiert Interfaces, die in den übergebenen Modulen enthalten sind
	 */ 
	def void genInterfaces(EList<EJBModule> moduleList) {
		view.addStatusText("Generiere Business Interfaces ...")
		for (module : moduleList) {
			view.addStatusText("  " + module.name)
    		javaEEFileGenerator.genInterfaces(module.interfaces, module, moduleList)
    	}
	}
		
	
	/**
	 * kopiert nicht-generierten Quellcode
	 */
	 def copyStaticFiles(List<EJBModule> moduleList) {
	 	// Resourcen einlesen
		var vorgangsServiceFile = readRessourceFile(SRC_STATIC_DIR + "/" + SRC_STATIC_VORGANGS_SERVICE)
		var entitaetsServiceFile = readRessourceFile(SRC_STATIC_DIR + "/" + SRC_STATIC_ENTITAETS_SERVICE)
		// Resourcen zu allen Modulen hinzufügen
		for (module : moduleList) {
			var file = vorgangsServiceFile
			var name = SRC_STATIC_VORGANGS_SERVICE
			if (module.entities.size > 0) {
				// Entitäts-Service
				file = entitaetsServiceFile
			    name = SRC_STATIC_ENTITAETS_SERVICE
			}
			var Path target = Paths.get(targetDir, module.name, SOURCE_DIR, BASE_NAMESPACE.directory, name)
			if (!Files.exists(target.getParent)) {
				Files.createDirectories(target.getParent);
			}
			if (!Files.exists(target)) {
				Files.write(target, file)
			}
		}
	}
	
	/**
	 * liest die angegebene Resource ein und gibt sie als byte-Array zurück
	 */
	def readRessourceFile(String ressource) {
		var InputStream is = this.getClass().getResourceAsStream(ressource);
		var ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
		while (is.available > 0) {
			byteArrayStream.write(is.read());
		}
		return byteArrayStream.toByteArray
	}
	
}