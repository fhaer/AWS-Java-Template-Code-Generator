/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somsl.annotation;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AnnotationUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uniba.wiai.seda.somsl.annotation.ui.internal.AnnotationActivator.getInstance().getInjector("de.uniba.wiai.seda.somsl.annotation.Annotation");
	}
	
}
