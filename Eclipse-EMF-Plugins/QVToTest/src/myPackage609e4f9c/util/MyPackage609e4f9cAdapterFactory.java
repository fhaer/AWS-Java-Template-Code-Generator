/**
 */
package myPackage609e4f9c.util;

import myPackage609e4f9c.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see myPackage609e4f9c.MyPackage609e4f9cPackage
 * @generated
 */
public class MyPackage609e4f9cAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyPackage609e4f9cPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyPackage609e4f9cAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyPackage609e4f9cPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyPackage609e4f9cSwitch<Adapter> modelSwitch =
		new MyPackage609e4f9cSwitch<Adapter>() {
			@Override
			public Adapter casemyGreetingEclass397cbc52(myGreetingEclass397cbc52 object) {
				return createmyGreetingEclass397cbc52Adapter();
			}
			@Override
			public Adapter casemyGreetingEclass2c2fc8fa(myGreetingEclass2c2fc8fa object) {
				return createmyGreetingEclass2c2fc8faAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link myPackage609e4f9c.myGreetingEclass397cbc52 <em>my Greeting Eclass397cbc52</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myPackage609e4f9c.myGreetingEclass397cbc52
	 * @generated
	 */
	public Adapter createmyGreetingEclass397cbc52Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link myPackage609e4f9c.myGreetingEclass2c2fc8fa <em>my Greeting Eclass2c2fc8fa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see myPackage609e4f9c.myGreetingEclass2c2fc8fa
	 * @generated
	 */
	public Adapter createmyGreetingEclass2c2fc8faAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyPackage609e4f9cAdapterFactory
