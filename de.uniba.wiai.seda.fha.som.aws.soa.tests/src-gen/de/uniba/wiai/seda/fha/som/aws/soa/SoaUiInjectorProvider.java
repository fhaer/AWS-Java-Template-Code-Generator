/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.som.aws.soa;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SoaUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uniba.wiai.seda.fha.som.aws.soa.ui.internal.SoaActivator.getInstance().getInjector("de.uniba.wiai.seda.fha.som.aws.soa.Soa");
	}
	
}
