/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.fha.annotation.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.uniba.wiai.seda.fha.annotation.ui.internal.AnnotationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AnnotationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AnnotationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AnnotationActivator.getInstance().getInjector(AnnotationActivator.DE_UNIBA_WIAI_SEDA_FHA_ANNOTATION_ANNOTATION);
	}
	
}
