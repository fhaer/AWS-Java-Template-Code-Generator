package de.uniba.wiai.seda.fha.swarchitektur.templates.javaee

import java.util.List
import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.SessionBean
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.NamespaceTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.AttributTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.MethodeTemplate
import de.uniba.wiai.seda.fha.swarchitektur.generator.NamespaceManager
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Attribut

/**
 * Tempalte für die abstrakte Basisklasse, von der eine SessionBean erbt
 */
class AbstractSessionBeanTemplate extends AbstractTemplateFile {
	
	private SessionBean bean
	private List<Namespace> importNs
	private NamespaceManager nsManager
	private String name
	private String interfaceName
	
	public static final String CLASS_NAME_SUFFIX = "_Abs"
	
	new() {
		moduleDir='''ejbModule'''
	}

	def setBean(SessionBean bean) {
		this.bean = bean
	}

	def setImportNs(List<Namespace> importNs) {
		this.importNs = importNs
	}

	def setNsManager(NamespaceManager nsManager) {
		this.nsManager = nsManager
	}
	
	override setFileName(String name, String erweiterung) {
		this.name = name.toFirstUpper + CLASS_NAME_SUFFIX
		this.fileName = this.name + "." + erweiterung
	}
	
	def getNameWithoutSuffix() {
		return name.substring(0, name.length - CLASS_NAME_SUFFIX.length)
	}
	
	def setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName
	}
	
	override generate() {
		var boolean genPersistenceFeatures = namespace.isEntitaetsService()
		
		'''
	  	package «namespace»;
	  	
	  	import javax.ejb.*;
	  	«IF genPersistenceFeatures»
	  	import javax.persistence.*;
	  	«ENDIF»
	  	«NamespaceTemplate.genImportNamespaces(namespace, importNs)»
	  	
	  	«genJavaDoc()»
	  	@SuppressWarnings("all")
	  	public abstract class «name» «genExtends()» implements «interfaceName» {
	  		
	  		«FOR attribut : bean.attribute»
	  		«AttributTemplate.genAttribut(attribut, "protected", getAttributeAnnotation(attribut), namespace)»
	  		
	  		«ENDFOR»
	  		
	  		«FOR m : bean.methode»
	  		«MethodeTemplate.genMethode(m, getNameWithoutSuffix(), namespace)»
	  		
	  		«ENDFOR»
	  		
	  	}
		'''
	}
	
	/**
	 * generiert das "extends" Schlüsselwort mit der Klasse, von der geerbt wird
	 */
	def genExtends() {
		// Erbe von einer nicht generierten Basisklasse für Session Beans
		if (namespace.isEntitaetsService()) {
			return '''extends EntitaetsService'''
		}
		if (namespace.isVorgangsService()) {
			return '''extends VorgangsService'''
		}
	}
	
	def getAttributeAnnotation(Attribut attribut) {
		if (attribut.name == "messageDrivenBean") {
			// statischer Zugriff, keine Annotation nötig
			return ""
		}
		if (nsManager.getEntitaetNamespace(attribut.name) == null) {
			// Entität nicht im Namespace-Manager => EJB
			return "@EJB"
		}
		return ""
	}
	

	/**
	 * generiert JavaDoc mit "generated"-Tag
	 */
	def static genJavaDoc() {
		'''
		/**
		 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
		 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
		 * 
		 * @generated
		 */
		'''
	}
}