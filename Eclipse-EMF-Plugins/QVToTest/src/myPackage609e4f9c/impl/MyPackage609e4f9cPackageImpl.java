/**
 */
package myPackage609e4f9c.impl;

import myPackage609e4f9c.MyPackage609e4f9cFactory;
import myPackage609e4f9c.MyPackage609e4f9cPackage;
import myPackage609e4f9c.myGreetingEclass2c2fc8fa;
import myPackage609e4f9c.myGreetingEclass397cbc52;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyPackage609e4f9cPackageImpl extends EPackageImpl implements MyPackage609e4f9cPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myGreetingEclass397cbc52EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myGreetingEclass2c2fc8faEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see myPackage609e4f9c.MyPackage609e4f9cPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyPackage609e4f9cPackageImpl() {
		super(eNS_URI, MyPackage609e4f9cFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MyPackage609e4f9cPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyPackage609e4f9cPackage init() {
		if (isInited) return (MyPackage609e4f9cPackage)EPackage.Registry.INSTANCE.getEPackage(MyPackage609e4f9cPackage.eNS_URI);

		// Obtain or create and register package
		MyPackage609e4f9cPackageImpl theMyPackage609e4f9cPackage = (MyPackage609e4f9cPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyPackage609e4f9cPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyPackage609e4f9cPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMyPackage609e4f9cPackage.createPackageContents();

		// Initialize created meta-data
		theMyPackage609e4f9cPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyPackage609e4f9cPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyPackage609e4f9cPackage.eNS_URI, theMyPackage609e4f9cPackage);
		return theMyPackage609e4f9cPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyGreetingEclass397cbc52() {
		return myGreetingEclass397cbc52EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyGreetingEclass2c2fc8fa() {
		return myGreetingEclass2c2fc8faEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyPackage609e4f9cFactory getMyPackage609e4f9cFactory() {
		return (MyPackage609e4f9cFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		myGreetingEclass397cbc52EClass = createEClass(MY_GREETING_ECLASS397CBC52);

		myGreetingEclass2c2fc8faEClass = createEClass(MY_GREETING_ECLASS2C2FC8FA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(myGreetingEclass397cbc52EClass, myGreetingEclass397cbc52.class, "myGreetingEclass397cbc52", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myGreetingEclass2c2fc8faEClass, myGreetingEclass2c2fc8fa.class, "myGreetingEclass2c2fc8fa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MyPackage609e4f9cPackageImpl
