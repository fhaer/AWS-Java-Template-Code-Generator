package de.uniba.wiai.seda.fha.swarchitektur.templates

import java.nio.file.Paths
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace

/**
 * Basisklasse für Template-Klassen, enhthält Attribute zur 
 * Definition von Dateinamen und Pfaden.
 */
abstract class AbstractTemplateFile implements TemplateFile {

	protected String eclipseDir
	protected String moduleDir
	protected EJBModule module
	protected Namespace namespace
	protected String fileName

	/**
	 * "true" überschreibt eine existierende Zieldatei, "false" nicht
	 */
	protected boolean overwriteExistingFile = true

	/**
	 * Speicherort für Eclipse-Projekte.
	 */
	override setEclipseDir(String eclipseDir) {
		this.eclipseDir = eclipseDir
	}

	/**
	 * Speicherort für Eclipse-Projekte.
	 */
	override getEclipseDir() {
		return eclipseDir
	}

	/**
	 * Legt fest, zu welchem Modul die Datei gehört.
	 */
	override setModule(EJBModule module) {
		this.module = module
	}

	/**
	 * Legt fest, zu welchem Modul die Datei gehört.
	 */
	override getModule() {
		return module
	}

	/**
	 * Legt das Verzeichnis unterhalb des Moduls fest (siehe getPath-Methode).
	 */
	override setModuleDir(String moduleDir) {
		this.moduleDir = moduleDir
	}

	/**
	 * Legt das Verzeichnis unterhalb des Moduls fest (siehe getPath-Methode).
	 */
	override getModuleDir() {
		return moduleDir
	}

	/**
	 * Legt fest, welchen Namespace (voller Package-Name) die Datei hat. 
	 * Dateien ohne Namespace müssen diesen Setter nicht verwenden.
	 */
	override setNamespace(Namespace namespace) {
		this.namespace = namespace
	}

	/**
	 * Legt fest, welchen Namespace (voller Package-Name) die Datei hat. 
	 * Dateien ohne Namespace müssen diesen Setter nicht verwenden.
	 */
	override getNamespace() {
		return namespace
	}

	/**
	 * Legt den Namen der zu generierenden Datei fest.
	 * @param name Name der Datei
	 * @param erweiterung Dateiendung
	 */
	override setFileName(String fileName, String erweiterung) {
		this.fileName = fileName + '.' + erweiterung
	}

	/**
	 * Legt den Namen der zu generierenden Datei fest
	 */
	override getFileName() {
		return fileName
	}

	/**
	 * Legt fest, ob die Zieldatei überschrieben wird, wenn sie schon existiert.
	 */
	override setOverwriteExistingFile(boolean overwriteExistingFile) {
		this.overwriteExistingFile = overwriteExistingFile
	}

	/**
	 * Legt fest, ob die Zieldatei überschrieben wird, wenn sie schon existiert.
	 */
	override getOverwriteExistingFile() {
		return overwriteExistingFile
	}

	/**
	 * Gibt den Pfad der zu generierenden Datei zurück. Der Pfad ergibt sich
	 * aus <Eclipse-Dir>/<Modul-Name>/<Modul-Dir>/<Namespace-Dir>/<Datei>, 
	 * sofern alle Bestandteile definiert sind. Fehlen Bestandteile wird ein 
	 * entsprechend kürzerer Pfad zurückgegeben.
	 */
	override getPath() {

		if (eclipseDir != null && module != null && moduleDir != null && namespace != null)
			return Paths.get(eclipseDir, module.name, moduleDir, namespace.directory, fileName)
		if (eclipseDir != null && module != null && moduleDir != null)
			return Paths.get(eclipseDir, module.name, moduleDir, fileName)
		if (eclipseDir != null && module != null)
			return Paths.get(eclipseDir, module.name, fileName)
		if (eclipseDir != null)
			return Paths.get(eclipseDir, fileName)

		return Paths.get(fileName)
	}

}
