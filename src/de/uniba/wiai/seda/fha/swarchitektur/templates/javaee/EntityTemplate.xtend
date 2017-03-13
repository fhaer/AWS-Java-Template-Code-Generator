package de.uniba.wiai.seda.fha.swarchitektur.templates.javaee

import java.util.List
import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.MethodeTemplate
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.JPAEntity
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.AttributTemplate
import de.uniba.wiai.seda.fha.swarchitektur.generator.NamespaceManager
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Attribut

/**
 * generiert JPA-Entitäten
 */
class EntityTemplate extends AbstractTemplateFile {
	
	private JPAEntity entity
	private List<Namespace> importNs
	private NamespaceManager nsManager
	private boolean hasIdAttribute
	
	new() {
		moduleDir='''ejbModule'''
		hasIdAttribute = false
	}
	
	new(EntityTemplate source) {
		entity = source.entity
		importNs = source.importNs
		eclipseDir = source.getEclipseDir
		fileName = source.fileName
		module = source.module
		moduleDir = source.moduleDir
		namespace = source.namespace
		nsManager = source.nsManager
	}
	
	def setEntity(JPAEntity entity) {
		this.entity = entity
	}

	def setImportNs(List<Namespace> importNs) {
		this.importNs = importNs
	}
	
	def setNsManager(NamespaceManager nsManager) {
		this.nsManager = nsManager
	}
	
	override generate()
		'''
	  	package «namespace»;
	  	
	  	import java.io.*;
	  	import javax.persistence.*;
	  	
	  	«genJavaDoc(entity.name)»
	  	@Entity
	  	public class «entity.name.toFirstUpper» implements Serializable {
	  		
	  		private static final long serialVersionUID = 1L;
	  		
	  		«FOR attribut : entity.attribute»
	  		«AttributTemplate.genAttribut(attribut, "private", genAnnotation(attribut), namespace)»
	  		
	  		«ENDFOR»
	  		«IF !hasIdAttribute»
	  		«genIdAttribute()»
	  		«ENDIF»
	  		
	  		«FOR m : entity.methode»
	  		«MethodeTemplate.genMethode(m, entity.name, namespace)»
	  		
	  		«ENDFOR»
	  	}
		'''
	
	def genIdAttribute() 
		'''
		/**
		 * generierter Primaerschluessel
		 * @generated
		 */
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer iD;
		'''
	
	// generiert eine Annotation
	def genAnnotation(Attribut attribut) {
		if (attribut.name.equalsIgnoreCase("ID")) {
			hasIdAttribute = true
			return 
			'''
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			'''
		}
		return ''''''
	}
	
	def static genJavaDoc(String name) {
		'''
		/**
		 * Repraesentiert die Entitaet «name.toFirstUpper»
		 *
		 * @generated
		 */
		'''
	}
}