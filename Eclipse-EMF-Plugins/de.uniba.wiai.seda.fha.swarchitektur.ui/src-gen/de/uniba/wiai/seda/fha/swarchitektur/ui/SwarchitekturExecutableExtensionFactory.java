/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.fha.swarchitektur.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.uniba.wiai.seda.fha.swarchitektur.ui.internal.SwarchitekturActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SwarchitekturExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SwarchitekturActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SwarchitekturActivator.getInstance().getInjector(SwarchitekturActivator.DE_UNIBA_WIAI_SEDA_FHA_SWARCHITEKTUR_SWARCHITEKTUR);
	}
	
}
