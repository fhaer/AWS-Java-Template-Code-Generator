/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.somsl.annotation.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAnnotationValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationPackage.eINSTANCE);
		return result;
	}
}