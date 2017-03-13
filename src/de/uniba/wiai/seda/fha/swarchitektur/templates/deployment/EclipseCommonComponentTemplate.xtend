package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class EclipseCommonComponentTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir = '''.settings'''
		fileName = '''org.eclipse.wst.common.component'''
	}

	override generate() 
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<project-modules id="moduleCoreId" project-version="1.5.0">
		    <wb-module deploy-name="«module.name»">
		        <wb-resource deploy-path="/" source-path="/ejbModule" tag="defaultRootSource"/>
		        <property name="java-output-path" value="/«module.name»/build/classes"/>
		    </wb-module>
		</project-modules>
		'''
}