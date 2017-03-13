package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class WstCommonCorePrefsTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''.settings'''
		fileName='''org.eclipse.wst.common.project.facet.core.prefs.xml'''
	}
	
	override generate()
		'''
		<root>
		  <facet id="jpt.jaxb">
		    <node name="libprov">
		      <attribute name="provider-id" value="jaxb-jre-library-provider"/>
		    </node>
		    <node name="platform">
		      <attribute name="platform-id" value="generic_2_1"/>
		    </node>
		  </facet>
		  <facet id="jpt.jpa">
		    <node name="libprov">
		      <attribute name="provider-id" value="GlassFish-4-SystemLibrary-JPA"/>
		    </node>
		  </facet>
		</root>
		'''
	
}