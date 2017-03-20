/**
 */
package myPackage609e4f9c.util;

import myPackage609e4f9c.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see myPackage609e4f9c.MyPackage609e4f9cPackage
 * @generated
 */
public class MyPackage609e4f9cSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyPackage609e4f9cPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyPackage609e4f9cSwitch() {
		if (modelPackage == null) {
			modelPackage = MyPackage609e4f9cPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MyPackage609e4f9cPackage.MY_GREETING_ECLASS397CBC52: {
				myGreetingEclass397cbc52 myGreetingEclass397cbc52 = (myGreetingEclass397cbc52)theEObject;
				T result = casemyGreetingEclass397cbc52(myGreetingEclass397cbc52);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyPackage609e4f9cPackage.MY_GREETING_ECLASS2C2FC8FA: {
				myGreetingEclass2c2fc8fa myGreetingEclass2c2fc8fa = (myGreetingEclass2c2fc8fa)theEObject;
				T result = casemyGreetingEclass2c2fc8fa(myGreetingEclass2c2fc8fa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Greeting Eclass397cbc52</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Greeting Eclass397cbc52</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyGreetingEclass397cbc52(myGreetingEclass397cbc52 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Greeting Eclass2c2fc8fa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Greeting Eclass2c2fc8fa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyGreetingEclass2c2fc8fa(myGreetingEclass2c2fc8fa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MyPackage609e4f9cSwitch
