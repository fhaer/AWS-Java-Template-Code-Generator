/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.annotation;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AnnotationStandaloneSetup extends AnnotationStandaloneSetupGenerated{

	public static void doSetup() {
		new AnnotationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
