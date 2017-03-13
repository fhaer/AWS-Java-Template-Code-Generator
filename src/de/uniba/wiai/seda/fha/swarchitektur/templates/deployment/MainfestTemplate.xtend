package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert ein Manifest
 */
class ManifestTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''ejbModule\META-INF'''
		fileName='''MANIFEST.MF'''
	}
	
	override generate()
		'''
		Manifest-Version: 1.0
		Class-Path: 
		'''
	
}