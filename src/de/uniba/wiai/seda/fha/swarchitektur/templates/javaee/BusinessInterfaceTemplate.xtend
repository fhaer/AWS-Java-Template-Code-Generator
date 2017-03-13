package de.uniba.wiai.seda.fha.swarchitektur.templates.javaee

import java.util.List
import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.BusinessInterface
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.NamespaceTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.MethodeTemplate

/**
 * Generiert ein Business Interface
 */
class BusinessInterfaceTemplate extends AbstractTemplateFile {
	
	private BusinessInterface bi
	private List<Namespace> importNs
	
	new() {
		moduleDir='''ejbModule'''
	}
	
	new(BusinessInterfaceTemplate source) {
		bi = source.bi
		importNs = source.importNs
		eclipseDir = source.getEclipseDir
		fileName = source.fileName
		module = source.module
		moduleDir = source.moduleDir
		namespace = source.namespace
	}
	
	def setInterface(BusinessInterface bi) {
		this.bi = bi
	}

	def setImportNs(List<Namespace> importNs) {
		this.importNs = importNs
	}
	
	override generate()
		'''
	  	package «namespace»;
	  	
	  	import javax.ejb.Remote;
	  	«NamespaceTemplate.genImportNamespaces(namespace, importNs)»
	  	
	  	«genJavaDoc()»
	  	@Remote
	  	public interface «bi.name.toFirstUpper» {
	  		
	  		«FOR m : bi.methoden»
	  		«MethodeTemplate.genMethodensignatur(m, namespace)»
	  		
	  		«ENDFOR»
	  	}
		'''
		
	/**
	 * generiert JavaDoc mit "generated"-Tag
	 */
	def static genJavaDoc() {
		'''
		/**
		 * @generated
		 */
		'''
	}
}