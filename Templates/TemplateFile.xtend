package de.uniba.wiai.seda.fha.swarchitektur.templates

import java.nio.file.Path
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace

/**
 * Repräsentiert ein Template für eine zu generierende Datei.
 */
interface TemplateFile {
	
	/**
	 * Speicherort für Eclipse-Projekte.
	 */
	def void setEclipseDir(String eclipseDir)
	
	/**
	 * Speicherort für Eclipse-Projekte.
	 */
	def String getEclipseDir()
	
	/**
	 * Legt fest, zu welchem Modul die Datei gehört.
	 */
	def void setModule(EJBModule module)
	
	/**
	 * Legt fest, zu welchem Modul die Datei gehört.
	 */
	def EJBModule getModule()
	
	/**
	 * Legt das Verzeichnis unterhalb des Moduls fest (siehe getPath-Methode).
	 */
	def void setModuleDir(String moduleDir)
	
	/**
	 * Legt das Verzeichnis unterhalb des Moduls fest (siehe getPath-Methode).
	 */
	def String getModuleDir()
	
	/**
	 * Legt fest, welchen Namespace (voller Package-Name) die Datei hat. 
	 * Dateien ohne Namespace müssen diesen Setter nicht verwenden.
	 */
	def void setNamespace(Namespace namespace)
	
	/**
	 * Legt fest, welchen Namespace (voller Package-Name) die Datei hat. 
	 * Dateien ohne Namespace müssen diesen Setter nicht verwenden.
	 */
	def Namespace getNamespace()
	
	/**
	 * Legt den Namen der zu generierenden Datei fest.
	 * @param name Name der Datei
	 * @param erweiterung Dateiendung
	 */
	def void setFileName(String name, String erweiterung)
	
	/**
	 * Legt den Namen der zu generierenden Datei fest.
	 */
	def String getFileName()
	
	/**
	 * Legt fest, ob die Zieldatei überschrieben wird, wenn sie schon existiert.
	 */
	def void setOverwriteExistingFile(boolean overwriteExistingFile)
	
	/**
	 * Legt fest, ob die Zieldatei überschrieben wird, wenn sie schon existiert.
	 */
	def boolean getOverwriteExistingFile()
	
	/**
	 * Gibt den Pfad der zu generierenden Datei zurück. Der Pfad ergibt sich
	 * aus <Eclipse-Dir>/<Modul-Name>/<Modul-Dir>/<Namespace-Dir>/<Datei>, 
	 * sofern alle Bestandteile definiert sind. Fehlen Bestandteile wird ein 
	 * entsprechend kürzerer Pfad zurückgegeben.
	 */
	def Path getPath()
	
	/**
	 * Generiert den Dateiinhalt und gibt ihn zurück.
	 */
	def CharSequence generate()
}
