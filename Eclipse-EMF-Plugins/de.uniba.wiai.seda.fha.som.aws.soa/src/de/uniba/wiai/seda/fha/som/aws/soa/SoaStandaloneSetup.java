/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.som.aws.soa;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SoaStandaloneSetup extends SoaStandaloneSetupGenerated{

	public static void doSetup() {
		new SoaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
