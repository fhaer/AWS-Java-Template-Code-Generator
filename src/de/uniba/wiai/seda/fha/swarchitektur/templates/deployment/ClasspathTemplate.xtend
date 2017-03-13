package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert die Classpath-Datei
 */
class ClasspathTemplate extends AbstractTemplateFile {
	
	new() {
		fileName = '''.classpath'''
	}
	
	override generate()
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<classpath>
			<classpathentry kind="src" path="ejbModule"/>
			<classpathentry kind="con" path="oracle.eclipse.tools.glassfish.lib.system">
				<attributes>
					<attribute name="owner.project.facets" value="jst.ejb"/>
				</attributes>
			</classpathentry>
			<classpathentry kind="con" path="org.eclipse.jst.j2ee.internal.module.container"/>
			<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/jdk1.7.0_25"/>
			<classpathentry kind="output" path="build/classes"/>
		</classpath>
		'''
	
}