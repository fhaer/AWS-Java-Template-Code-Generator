package de.uniba.wiai.seda.fha.swarchitektur.generator

import java.util.HashMap
import java.util.Map
import java.util.List
import java.util.HashSet
import java.util.Set
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Methodensignatur
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.InvokeQueueAsync
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.InvokeEJBSync
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Attribut
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Methode
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule

/**
 * Verwaltung verwendeter Namespaces
 */
class NamespaceManager {
	
	/**
	 * speichert Namespaces für Entitäten
	 */
	private Map<String, Namespace> entitaetNamespaces
	
	/**
	 * speichert Namespaces für Services
	 */
	private Map<String, Namespace> entitaetsServiceNamespaces
	
	new() {
		entitaetNamespaces = new HashMap<String, Namespace>()
		entitaetsServiceNamespaces = new HashMap<String, Namespace>()
	}
	
	/**
	 * fügt einen Namespace unter dem Namen einer Entität
	 */
	def addEntitaet(String name, Namespace namespace) {
		entitaetNamespaces.put(name, namespace)
		entitaetsServiceNamespaces.put(name, namespace.entitaetsServiceNamespace)
	}
	
	/**
	 * fügt einen Namespace unter dem Namen eines Entitäts-Service
	 */
	def addEntitaetsService(String name, Namespace namespace) {
		entitaetsServiceNamespaces.put(name, namespace)
	}
	
	/**
	 * liefert den Namespace der Entität mit dem übergebenem Namen zurück
	 */
	def getEntitaetNamespace(String name) {
		return entitaetNamespaces.get(name)
	}
	
	/**
	 * liefert den Namespace des Entitäts-Service mit dem übergebenem Namen zurück
	 */
	def getEntitaetsServiceNamespace(String name) {
		return entitaetsServiceNamespaces.get(name)
	}
	
	/**
	 * liefert Namespaces zu allen übergebenen Entity-Namen zurück 
	 */
	def getEntitaetNamespaces(Set<String> entities) {
		var Set<Namespace> namespaces = new HashSet<Namespace>();
		for (entity : entities) {
			if (entitaetNamespaces.get(entity) != null) {
				namespaces.add(entitaetNamespaces.get(entity) as Namespace);
			}
		}
		return namespaces;
	}
	
	/**
	 * liefert Namespaces im übergebenen Module zurück
	 */
	def getNamespaces(EJBModule module, Namespace baseNamespace) {
		var namespaces = new HashSet<Namespace>()
		for (ejb : module.ejb) {
			namespaces.add(baseNamespace.append(ejb.package))
		}
		for (iface : module.interfaces) {
			namespaces.add(baseNamespace.append(iface.package))
		}
		for (entity : module.entities) {
			namespaces.add(baseNamespace.append(entity.package))
		}
		return namespaces.toList
	}
	
	/**
	 * liefert Namespaces der Entitaeten in aller übergenen Methodensignaturen zurück
	 */
	def getEntitaetNamespaces(List<Methodensignatur> methodensignatur) {
		var Set<String> typen = new HashSet<String>();
		for (methode : methodensignatur) {
			typen.add(methode.outputTyp)
			typen.addAll(methode.inputTypen)
		}
		return getEntitaetNamespaces(typen);
	}
	
	/**
	 * liefert Namespaces aller Entitaeten in den übergebenen Methoden und Attribute zurück
	 */
	def getEntitaetNamespaces(List<Methode> methoden, List<Attribut> attribute) {
		var Set<String> typen = new HashSet<String>();
		for (attribut : attribute) {
			typen.add(attribut.typ)
		}
		for (methode : methoden) {
			typen.add(methode.outputTyp)
			typen.addAll(methode.inputTypen)
			for (invoke : methode.invoke) {
				if (invoke instanceof InvokeEJBSync) {
					var i = invoke as InvokeEJBSync
					typen.addAll(i.parameterTypen)
					if (i.methodensignatur != null) {
						typen.add(i.methodensignatur.outputTyp)
						typen.addAll(i.methodensignatur.inputTypen)
					}
					if (i.ejb != null) {
						typen.add(i.ejb.name)	
					}
				}
				if (invoke instanceof InvokeQueueAsync) {
					typen.addAll((invoke as InvokeQueueAsync).nachrichtenTypen)
				}
			}
		}
		return getEntitaetNamespaces(typen);
	}
	
}