package de.uniba.wiai.seda.fha.swarchitektur.templates.javaee

import de.uniba.wiai.seda.fha.swarchitektur.swdesign.StatefulSessionBean
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
 * generiert Stateless/Stateful Session Beans
 */
class SessionBeanTemplate extends AbstractTemplateFile {
	
	private SessionBean bean
	private List<Namespace> importNs
	private String stateAnnotation
	private NamespaceManager nsManager
	private String name
	private String interfaceName
	private String baseClassName
	
	public static final String CLASS_NAME_SUFFIX = "_Impl"
	
	new() {
		moduleDir='''ejbModule'''
		overwriteExistingFile = false
	}

	def setBean(SessionBean bean) {
		this.bean = bean
		stateAnnotation = "@Stateless"
		if (bean instanceof StatefulSessionBean) {
			stateAnnotation = "@Stateful"
		}
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
		// setze Klasse, von der geerbt wird
		this.baseClassName = name.toFirstUpper + AbstractSessionBeanTemplate.CLASS_NAME_SUFFIX
	}
	
	def setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName
	}
	
	override generate() {
		// Attribute generieren, falls diese nicht geerbt werden
		var String extendsClause = ""
		if (baseClassName != null) {
			extendsClause = "extends " + baseClassName
		}
		'''
	  	package «namespace»;
	  	import javax.ejb.*;
	  	
	  	«NamespaceTemplate.genImportNamespaces(namespace, importNs)»
	  	
	  	«genJavaDoc()»
	  	«stateAnnotation»
	  	public class «name» extends «baseClassName» implements «interfaceName» {
	  		
	  		«IF extendsClause.empty»
	  		«FOR attribut : bean.attribute»
	  		«AttributTemplate.genAttribut(attribut, "private", getAttributeAnnotation(attribut), namespace)»
	  		
	  		«ENDFOR»
	  		«ELSE»
	  		// Attribute werden von der abstrakten Superklasse geerbt
	  		«ENDIF»

	  		public «name»() {}  // default Konstruktor
	  		
	  		«FOR m : bean.methode»
	  		«MethodeTemplate.genOverrideMethode(m, namespace)»
	  		
	  		«ENDFOR»
	  	}
		'''
	}
	
	/**
	 * generiert eine Annotation für ein Attribut
	 */
	def getAttributeAnnotation(Attribut attribut) {
		if (nsManager.getEntitaetNamespace(attribut.name) === null) {
			// Entität nicht im Namespace-Manager => EJB
			return "@EJB"
		} else {
			return ""
		}
	}
	
	def static genJavaDoc() {
		'''
		/**
		 * Stateful/Stateless Session Bean zur Realisierung eines Vorgangs-Service.
		 *
		 * Implementierungsklasse zur manuellen Erweiterung ("Extension Point"):
		 *
		 * Die Methoden der Klasse beinhalten keine Funktionalitaet, sondern rufen nur
		 * generierten Code auf. Alle Methoden koennen manuell erzaengt oder
		 * ueberschrieben werden. Falls Aufrufe auf generierten Code entfernt werden,
		 * muss die entsprechende Funktionalitaet manuell implementiert werden.
		 * 
		 * Diese Klasse wird bei erneuter Generierung nicht ueberschrieben.
		 */
		'''
	}
}