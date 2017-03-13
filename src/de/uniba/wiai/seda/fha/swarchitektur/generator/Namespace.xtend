package de.uniba.wiai.seda.fha.swarchitektur.generator

import java.io.File

/**
 * Repräsentiert einen Namespace
 */
class Namespace {
	
	/**
	 * Package für Vorgangs-Services
	 */
	public static final String VORGANGS_SERVICE_PACKAGE = "vorgangsservices"
	
	/**
	 * Package für Entitäts-Services
	 */
	public static final String ENTITAETS_SERVICE_PACKAGE = "entitaetsservices"
	
	/**
	 * Package-Name für Entitäten
	 */
	public static final String ENTITAETEN_PACKAGE = "entitaeten"
	
	/**
	 * der repräsentierte Namespace
	 */
	val public String NAMESPACE
	
	/**
	 * erstellt einen neuen Namespace aus dem übergebenen String
	 */
	new(String namespace) {
		var toLower = namespace.toLowerCase;
		NAMESPACE = toLower;
	}
	
	/**
	 * fügt den übergebenen Package-Namen dem Namespace hinzu und gibt ihn zrück
	 */
	def append(String packageName) {
		var toLower = packageName.toLowerCase;
		return new Namespace(NAMESPACE + "." + toLower);
	}
	
	/**
	 * gibt den Package-Namen des obersten Pakets zurück
	 */
	def getPackageName() {
		return NAMESPACE.replaceAll(".*\\.", "");
	}
	
	/**
	 * gibt den Namen eines Entitäts-Services zurück
	 */
	def getEntitaetsServiceNamespace() {
		var servicePackage = getEntitaetsServicePackageName()
		var length = NAMESPACE.indexOf(servicePackage, 0) + servicePackage.length
		var String namespace = NAMESPACE.substring(0, length)
		return new Namespace(namespace)
	}
	
	/**
	 * gibt den Paket-Namen eines Entitäts-Service zurück
	 */
	def getEntitaetsServicePackageName() {
		var String servicePackage = NAMESPACE.replaceAll(".*\\." + ENTITAETS_SERVICE_PACKAGE + "\\.", "")
		var int length = servicePackage.indexOf(".", 0)
		return servicePackage.substring(0, length)
	}
	
	/**
	 * gibt den Namespace als String zurück
	 */
	override toString() {
		return NAMESPACE;
	}
	
	/** 
	 * gibt den Namespace als Pfad zurück
	 */
	def getDirectory() {
		return NAMESPACE.replace('.', File.separator);
	}
	
	/**
	 * gibt true zurück, wenn der übergebene Name in dem 
	 * Paket enthalten ist - sonst false
	 */
	def containsPackageName(String packageName) {
		if (NAMESPACE.matches(".*\\." + packageName + "\\..*$")) {
			return true
		}
		if (NAMESPACE.matches(".*\\." + packageName + "$")) {
			return true
		}
		return false
	}
	
	/**
	 * vergleicht Namespaces
	 */
	override equals(Object obj) {
		if (obj instanceof Namespace) {
			var Namespace ns = obj as Namespace;
			return ns.NAMESPACE.equals(NAMESPACE);	
		}
		return false
	}
	
	/** 
	 * Hashcode der String-Repräsentation von Namespace
	 */
	override hashCode() {
		return NAMESPACE.hashCode
	}
	
	/**
	 * gibt true zurück, wenn der Namespace zu einem Entitäts-Service gehört
	 */
	def isEntitaetsService() {
		return containsPackageName(ENTITAETS_SERVICE_PACKAGE)
	}
	
	def isVorgangsService() {
		return containsPackageName(VORGANGS_SERVICE_PACKAGE)
	}
	
	def isVorgangsServiceNichtElementar() {
		return NAMESPACE.endsWith(VORGANGS_SERVICE_PACKAGE)
	}
	
	def isEntitaet() {
		return containsPackageName(ENTITAETEN_PACKAGE)
	}
}