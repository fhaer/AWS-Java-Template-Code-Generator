package de.uniba.wiai.seda.fha.swarchitektur.generator

import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.EclipseCommonComponentTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.PersistenceXmlTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.EclipseProjectTemplate
import java.util.List
import java.util.ArrayList
import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.ClasspathTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.GlassfishEjbJarTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.JdtCorePrefsTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.JptCorePrefsTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.ManifestTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.WstCommonCorePrefsTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.WstCommonCoreTemplate
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.MessageDrivenBean
import de.uniba.wiai.seda.fha.swarchitektur.templates.deployment.QueueCreateScriptTemplate

/**
 * Klasse zur Generierung von Konfigurationsdateien
 */
class DeploymentFileGenerator {
	
	/**
	 * Schreiben von Templates
	 */
	private TemplateFileWriter fileGenerator
	
	/** 
	 * Referenz auf die grafische Benutzeroberfläche
	 */
	private View view
	
	/**
	 * Setzt eine Referenz zum Schreiben von Templates 
	 */
	def setFileGenerator(TemplateFileWriter f) {
		fileGenerator = f
	}
	
	/**
	 * Setzt eine Referenz auf die grafische Benutzeroberfläche
	 */
	def setView(View view) {
		this.view = view
	}
	
	/**
	 * generiert Eclipse-Projektdateien für alle Module
	 */
	def void genEclipseFiles(List<EJBModule> modules) {
		for (module : modules) {
		    view.addStatusText("  EJB-Modul " + module.name)
			genEclipseFiles(module)
		}
	}
	
	/**
	 * generiert Eclipse-Projektdateien für ein Modul
	 */
	def genEclipseFiles(EJBModule module) {
		var List<AbstractTemplateFile> templates
		templates = new ArrayList<AbstractTemplateFile>()
		
		templates.add(new ClasspathTemplate())
		templates.add(new EclipseCommonComponentTemplate())
		templates.add(new EclipseProjectTemplate())
		templates.add(new GlassfishEjbJarTemplate())
		templates.add(new JdtCorePrefsTemplate())
		templates.add(new JptCorePrefsTemplate())
		templates.add(new ManifestTemplate())
		templates.add(new PersistenceXmlTemplate())
		templates.add(new WstCommonCorePrefsTemplate())
		templates.add(new WstCommonCoreTemplate())
		
		setNameAndPath(templates, module)
		addToFileGenerator(templates, fileGenerator)
	}

	/**
	 * generiert ein Skript zur Erstellung von Message Queues mit GlassFish
	 */
	def void genQueueCreateScript(List<EJBModule> modules) {
		var List<String> queueNames = new ArrayList<String>()
		for (module : modules) {
			for (ejb : module.ejb) {
				if (ejb instanceof MessageDrivenBean) {
					var queue = (ejb as MessageDrivenBean).queue
					queueNames.add(queue.name)
				}
			}
			var configSkript = new QueueCreateScriptTemplate()
			configSkript.setModule(module)
			configSkript.setQueueNames(queueNames)
			fileGenerator.add(configSkript)
		}
	}
	
	/**
	 * Setzt Name und Pfad der zu erstellenden Artefakte
	 */
	def setNameAndPath(List<AbstractTemplateFile> files, EJBModule module) {
		for (file : files) {
			file.setModule(module)
		}
	}

	/**
	 * fügt eine Datei zum späteren Wegschreiben hinzu
	 */
	def addToFileGenerator(List<AbstractTemplateFile> templates, TemplateFileWriter fileGenerator) {
		for (file : templates) {
			fileGenerator.add(file)
		}
	}
		
}