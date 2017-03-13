package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class JdtCorePrefsTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''.settings'''
		fileName='''org.eclipse.jdt.core.prefs'''	
	}
	
	override generate()
		'''
		eclipse.preferences.version=1
		org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
		org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.7
		org.eclipse.jdt.core.compiler.compliance=1.7
		org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
		org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
		org.eclipse.jdt.core.compiler.source=1.7
		'''
	
}