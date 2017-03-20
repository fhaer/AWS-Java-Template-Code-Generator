/**
 */
package myPackage609e4f9c.impl;

import myPackage609e4f9c.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyPackage609e4f9cFactoryImpl extends EFactoryImpl implements MyPackage609e4f9cFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyPackage609e4f9cFactory init() {
		try {
			MyPackage609e4f9cFactory theMyPackage609e4f9cFactory = (MyPackage609e4f9cFactory)EPackage.Registry.INSTANCE.getEFactory(MyPackage609e4f9cPackage.eNS_URI);
			if (theMyPackage609e4f9cFactory != null) {
				return theMyPackage609e4f9cFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyPackage609e4f9cFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyPackage609e4f9cFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyPackage609e4f9cPackage.MY_GREETING_ECLASS397CBC52: return createmyGreetingEclass397cbc52();
			case MyPackage609e4f9cPackage.MY_GREETING_ECLASS2C2FC8FA: return createmyGreetingEclass2c2fc8fa();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myGreetingEclass397cbc52 createmyGreetingEclass397cbc52() {
		myGreetingEclass397cbc52Impl myGreetingEclass397cbc52 = new myGreetingEclass397cbc52Impl();
		return myGreetingEclass397cbc52;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myGreetingEclass2c2fc8fa createmyGreetingEclass2c2fc8fa() {
		myGreetingEclass2c2fc8faImpl myGreetingEclass2c2fc8fa = new myGreetingEclass2c2fc8faImpl();
		return myGreetingEclass2c2fc8fa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyPackage609e4f9cPackage getMyPackage609e4f9cPackage() {
		return (MyPackage609e4f9cPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyPackage609e4f9cPackage getPackage() {
		return MyPackage609e4f9cPackage.eINSTANCE;
	}

} //MyPackage609e4f9cFactoryImpl
