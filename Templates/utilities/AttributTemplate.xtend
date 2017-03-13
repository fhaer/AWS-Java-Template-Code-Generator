package de.uniba.wiai.seda.fha.swarchitektur.templates.utilities

import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Attribut
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace

/**
 * Hilfsklasse zur Generierung von Attributen
 */
class AttributTemplate {
	
    /**
     * generiert Attribute
     */ 
	def static genAttribut(Attribut a, String modifier, String annotation, Namespace ns) {
		var typ = getTyp(a, ns)
		if (a.name.equalsIgnoreCase("ID"))
			typ = "Integer"
		'''
		«genJavaDoc()»
		«annotation»
		«modifier» «typ» «a.name.toFirstLower»;
		'''
	}

	/**
	 * gibt den Typ des Attributs zurück
	 */
	def static getTyp(Attribut a, Namespace ns) {
		var typ = "String"
		if (a.typ != null && a.typ.length > 0) {
			typ = a.typ.toFirstUpper
		}
		return typ
	}

	/**
	 * generiert JavaDoc
	 */
	def static genJavaDoc() {
		'''
		/**
		 * @generated
		 */
		'''
	}
}