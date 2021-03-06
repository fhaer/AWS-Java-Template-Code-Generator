/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.fha.som.aws.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import de.uniba.wiai.seda.fha.som.aws.aws.AwS
import org.eclipse.xtext.scoping.Scopes
import de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class AwsScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	
	/**
	 * sets global scope for Objekttyp
	 */
	override getScope(EObject context, EReference reference) {
		if (reference.EType.name.equals("Objekttyp")) {
			return getGlobalScope(context, typeof(Objekttyp))
		}
		super.getScope(context, reference)
	}

	/**
     * returns the global scope for the given type
     */
	def <T extends EObject> IScope getGlobalScope(EObject anyObject, Class<T> typ) {
		var EObject aws = anyObject
		
		// find root object
		while (!(aws instanceof AwS)) {
			aws = aws.eContainer
		}
		val typs = aws.eAllContents.filter(typ).toIterable;
		return Scopes.scopeFor(typs)
	}
	
}
