package de.uniba.wiai.seda.fha.swarchitektur.templates.utilities

import java.util.List
import java.util.Set
import java.util.HashSet
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace

/**
 * Hilfsklasse zur Generierung von Namespaces
 */
 class NamespaceTemplate {
	
	/**
	 * Generiert eine Zeile für jeden übergebenen Namespace, sofern es nicht der eigene ist.
	 * 
	 * @param ns eigener Namespace
	 * @param importNs Liste zu importierender Namespaces
	 * 
	 * @return generierte Import-Statements der Liste importNs
	 */
	def static genImportNamespaces(Namespace ns, List<Namespace> importNs) {
		'''
		«FOR namespace : removeDuplicates(importNs)»
		«IF !namespace.equals(ns)»
		import «namespace».*;
		«ENDIF»
		«ENDFOR»
		'''
	}
	
	/**
	 * entfernt Duplikate aus zu generierenden Namespaces
	 */
	def static removeDuplicates(List<Namespace> importNamespaces) {
		var Set<Namespace> ns = new HashSet<Namespace>()
		ns.addAll(importNamespaces)
		return ns
	}
}