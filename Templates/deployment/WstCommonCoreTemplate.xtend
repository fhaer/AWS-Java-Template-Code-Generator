package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class WstCommonCoreTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''.settings'''
		fileName='''org.eclipse.wst.common.project.facet.core.xml'''
	}
	
	override generate()
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<faceted-project>
		  <runtime name="GlassFish 4.0"/>
		  <fixed facet="jst.ejb"/>
		  <fixed facet="java"/>
		  <installed facet="java" version="1.7"/>
		  <installed facet="jpt.jaxb" version="2.1"/>
		  <installed facet="jpt.jpa" version="2.0"/>
		  <installed facet="jst.ejb" version="3.1"/>
		  <installed facet="glassfish.ejb" version="4.0"/>
		</faceted-project>
		'''
	
}