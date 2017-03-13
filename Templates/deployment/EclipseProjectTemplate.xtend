package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class EclipseProjectTemplate extends AbstractTemplateFile {
	
	new() {
		fileName = '''.project'''
	}
	
	override generate() 
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<projectDescription>
			<name>«module.name»</name>
			<comment></comment>
			<projects>
			</projects>
			<buildSpec>
				<buildCommand>
					<name>org.eclipse.jdt.core.javabuilder</name>
					<arguments>
					</arguments>
				</buildCommand>
				<buildCommand>
					<name>org.eclipse.wst.common.project.facet.core.builder</name>
					<arguments>
					</arguments>
				</buildCommand>
				<buildCommand>
					<name>org.eclipse.wst.validation.validationbuilder</name>
					<arguments>
					</arguments>
				</buildCommand>
			</buildSpec>
			<natures>
				<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>
				<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>
				<nature>org.eclipse.wst.common.project.facet.core.nature</nature>
				<nature>org.eclipse.jdt.core.javanature</nature>
			</natures>
		</projectDescription>
		'''
}