package de.uniba.wiai.seda.fha.swarchitektur.generator

import de.uniba.wiai.seda.fha.swarchitektur.templates.TemplateFile
import java.util.List
import java.util.ArrayList
import java.nio.file.Path
import java.nio.file.Files

/**
 * schreibt Quellcodedateien weg
 */
class TemplateFileWriter {
	
	/**
	 * Ausgabeverzeichnis
	 */
	private String basePath
	
	/**
	 * Liste aller Template-Files, die geschrieben werden sollen
	 */
	private List<TemplateFile> templateFiles
	
	/**
	 *  Referenz auf die GUI
	 */
	private View view
	
	new() {
		templateFiles = new ArrayList<TemplateFile>()
	}
	
	/**
	 *  setzt den Zielort für generierte Artefakte
	 */
	def setBasePath(String basePath) {
		this.basePath = basePath
	}
	/**
	 * gibt den Zielort für generierte Artefakte zurück
	 */
	def getBasePath() {
		return basePath
	}
	
	/**
	 * fügt ein Template hinzu, das geschrieben werden soll
	 */
	def add(TemplateFile t) {
		templateFiles.add(t)
	}
	
	/**
	 * setzt eine Referenz auf die GUI
	 */
	def setView(View view) {
		this.view = view
	}
	
	/** 
	 * schreibt alle Dateien weg
	 */
	def void writeFiles() {
		view.addStatusText("\nSchreibe Dateien ...")
		for (template : templateFiles) {
			writeFile(template)
		}
	}
	
	/** 
	 * schreibt eine Datei weg
	 */
	def writeFile(TemplateFile template) {
		var String content = template.generate.toString()
		var Path file = template.path
		
		if (!Files.exists(file.getParent)) {
			view.addStatusText("  " + file.getParent)
			Files.createDirectories(file.getParent)
		}

		if (!Files.exists(file) || template.overwriteExistingFile) {
			view.addStatusText("  " + file)
			Files.write(file, content.bytes)
		} else {
			view.addStatusText("  Datei existiert bereits: " + file)
		}
	}
	
	/**
	 * setzt die Eclipse-Projekt-Directory für jedes Template-File
	 */
	def setGlobalEclipseDir(String eclipseDir) {
		for (file : templateFiles) {
			file.setEclipseDir(eclipseDir)
		}
	}
	
}