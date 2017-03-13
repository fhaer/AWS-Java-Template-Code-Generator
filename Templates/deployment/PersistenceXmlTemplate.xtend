package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile

/**
 * generiert Eclipse-Konfiguration
 */
class PersistenceXmlTemplate extends AbstractTemplateFile {
	
	new() {
		moduleDir='''ejbModule\META-INF'''
		fileName='''persistence.xml'''
	}
	
	override generate()
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<persistence version="2.0" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd">
			<persistence-unit name="«module.name»" >
			    <properties>
			    <!-- Tabellen automatisch erstellen -->
			   	<property name="eclipselink.ddl-generation" value="create-tables"/>
			   	<!-- Weaving von Entities deaktivieren -->
				<property name="eclipselink.weaving" value="false"/>
			 	</properties>
		  	</persistence-unit>
		</persistence>
		'''
	
}