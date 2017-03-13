package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class GlassfishEjbJarTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''ejbModule\META-INF'''
		fileName='''glassfish-ejb-jar.xml'''
	}
			
	override generate() 
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE glassfish-ejb-jar PUBLIC "-//GlassFish.org//DTD GlassFish Application Server 3.1 EJB 3.1//EN" "http://glassfish.org/dtds/glassfish-ejb-jar_3_1-1.dtd">
		<glassfish-ejb-jar>
		    <enterprise-beans/>
		</glassfish-ejb-jar>
		'''
	
}