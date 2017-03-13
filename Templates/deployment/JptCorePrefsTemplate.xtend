package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class JptCorePrefsTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''.settings'''
		fileName='''org.eclipse.jpt.core.prefs'''	
	}
	
	override generate()
		'''
		eclipse.preferences.version=1
		org.eclipse.jpt.core.platform=generic2_0
		org.eclipse.jpt.jpa.core.discoverAnnotatedClasses=true
		'''
	
}