/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somslmarked;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SomSLMarkedStandaloneSetup extends SomSLMarkedStandaloneSetupGenerated{

	public static void doSetup() {
		new SomSLMarkedStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

