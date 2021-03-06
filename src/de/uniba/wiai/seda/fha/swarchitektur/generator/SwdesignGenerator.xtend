/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.fha.swarchitektur.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Design

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SwdesignGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var Generator generator = new Generator()
	    for (a : resource.allContents.toIterable.filter(Design)) {
			generator.genArchitektur(a)
    	} 
  	}
}
