/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturFactory;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwarchitekturPackageImpl extends EPackageImpl implements SwarchitekturPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architekturEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ejbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessInterfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodensignaturEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statefulSessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aufrufEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statelessSessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpaEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageDrivenBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singletonSessionBeanEClass = null;

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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SwarchitekturPackageImpl()
  {
    super(eNS_URI, SwarchitekturFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SwarchitekturPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SwarchitekturPackage init()
  {
    if (isInited) return (SwarchitekturPackage)EPackage.Registry.INSTANCE.getEPackage(SwarchitekturPackage.eNS_URI);

    // Obtain or create and register package
    SwarchitekturPackageImpl theSwarchitekturPackage = (SwarchitekturPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwarchitekturPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwarchitekturPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSwarchitekturPackage.createPackageContents();

    // Initialize created meta-data
    theSwarchitekturPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSwarchitekturPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SwarchitekturPackage.eNS_URI, theSwarchitekturPackage);
    return theSwarchitekturPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitektur()
  {
    return architekturEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitektur_Name()
  {
    return (EAttribute)architekturEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitektur_Version()
  {
    return (EAttribute)architekturEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitektur_Pakete()
  {
    return (EReference)architekturEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Komponenten()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Entities()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Pakete()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEJB()
  {
    return ejbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_Name()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSessionBean()
  {
    return sessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessInterface()
  {
    return businessInterfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessInterface_Methoden()
  {
    return (EReference)businessInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodensignatur()
  {
    return methodensignaturEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodensignatur_Name()
  {
    return (EAttribute)methodensignaturEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatefulSessionBean()
  {
    return statefulSessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatefulSessionBean_Attribute()
  {
    return (EReference)statefulSessionBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatefulSessionBean_Methode()
  {
    return (EReference)statefulSessionBeanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribut()
  {
    return attributEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribut_Typ()
  {
    return (EAttribute)attributEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribut_Name()
  {
    return (EAttribute)attributEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethode()
  {
    return methodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethode_Name()
  {
    return (EAttribute)methodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethode_Aufruf()
  {
    return (EReference)methodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAufruf()
  {
    return aufrufEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAufruf_Objekt()
  {
    return (EAttribute)aufrufEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAufruf_Methode()
  {
    return (EReference)aufrufEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatelessSessionBean()
  {
    return statelessSessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatelessSessionBean_Methode()
  {
    return (EReference)statelessSessionBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPAEntity()
  {
    return jpaEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJPAEntity_Name()
  {
    return (EAttribute)jpaEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPAEntity_Attribute()
  {
    return (EReference)jpaEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPAEntity_Methode()
  {
    return (EReference)jpaEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageDrivenBean()
  {
    return messageDrivenBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingletonSessionBean()
  {
    return singletonSessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwarchitekturFactory getSwarchitekturFactory()
  {
    return (SwarchitekturFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    architekturEClass = createEClass(ARCHITEKTUR);
    createEAttribute(architekturEClass, ARCHITEKTUR__NAME);
    createEAttribute(architekturEClass, ARCHITEKTUR__VERSION);
    createEReference(architekturEClass, ARCHITEKTUR__PAKETE);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__KOMPONENTEN);
    createEReference(packageEClass, PACKAGE__ENTITIES);
    createEReference(packageEClass, PACKAGE__PAKETE);

    ejbEClass = createEClass(EJB);
    createEAttribute(ejbEClass, EJB__NAME);

    sessionBeanEClass = createEClass(SESSION_BEAN);

    businessInterfaceEClass = createEClass(BUSINESS_INTERFACE);
    createEReference(businessInterfaceEClass, BUSINESS_INTERFACE__METHODEN);

    methodensignaturEClass = createEClass(METHODENSIGNATUR);
    createEAttribute(methodensignaturEClass, METHODENSIGNATUR__NAME);

    statefulSessionBeanEClass = createEClass(STATEFUL_SESSION_BEAN);
    createEReference(statefulSessionBeanEClass, STATEFUL_SESSION_BEAN__ATTRIBUTE);
    createEReference(statefulSessionBeanEClass, STATEFUL_SESSION_BEAN__METHODE);

    attributEClass = createEClass(ATTRIBUT);
    createEAttribute(attributEClass, ATTRIBUT__TYP);
    createEAttribute(attributEClass, ATTRIBUT__NAME);

    methodeEClass = createEClass(METHODE);
    createEAttribute(methodeEClass, METHODE__NAME);
    createEReference(methodeEClass, METHODE__AUFRUF);

    aufrufEClass = createEClass(AUFRUF);
    createEAttribute(aufrufEClass, AUFRUF__OBJEKT);
    createEReference(aufrufEClass, AUFRUF__METHODE);

    statelessSessionBeanEClass = createEClass(STATELESS_SESSION_BEAN);
    createEReference(statelessSessionBeanEClass, STATELESS_SESSION_BEAN__METHODE);

    jpaEntityEClass = createEClass(JPA_ENTITY);
    createEAttribute(jpaEntityEClass, JPA_ENTITY__NAME);
    createEReference(jpaEntityEClass, JPA_ENTITY__ATTRIBUTE);
    createEReference(jpaEntityEClass, JPA_ENTITY__METHODE);

    messageDrivenBeanEClass = createEClass(MESSAGE_DRIVEN_BEAN);

    singletonSessionBeanEClass = createEClass(SINGLETON_SESSION_BEAN);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sessionBeanEClass.getESuperTypes().add(this.getEJB());
    businessInterfaceEClass.getESuperTypes().add(this.getEJB());
    statefulSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
    statelessSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
    messageDrivenBeanEClass.getESuperTypes().add(this.getEJB());
    singletonSessionBeanEClass.getESuperTypes().add(this.getSessionBean());

    // Initialize classes and features; add operations and parameters
    initEClass(architekturEClass, Architektur.class, "Architektur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArchitektur_Name(), ecorePackage.getEString(), "name", null, 0, 1, Architektur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArchitektur_Version(), ecorePackage.getEString(), "version", null, 0, 1, Architektur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitektur_Pakete(), this.getPackage(), null, "pakete", null, 0, -1, Architektur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Komponenten(), this.getEJB(), null, "komponenten", null, 0, -1, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Entities(), this.getJPAEntity(), null, "entities", null, 0, -1, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Pakete(), this.getPackage(), null, "pakete", null, 0, -1, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ejbEClass, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB.class, "EJB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEJB_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sessionBeanEClass, SessionBean.class, "SessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(businessInterfaceEClass, BusinessInterface.class, "BusinessInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBusinessInterface_Methoden(), this.getMethodensignatur(), null, "methoden", null, 0, -1, BusinessInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodensignaturEClass, Methodensignatur.class, "Methodensignatur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodensignatur_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methodensignatur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statefulSessionBeanEClass, StatefulSessionBean.class, "StatefulSessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatefulSessionBean_Attribute(), this.getAttribut(), null, "attribute", null, 0, -1, StatefulSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatefulSessionBean_Methode(), this.getMethode(), null, "methode", null, 0, -1, StatefulSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributEClass, Attribut.class, "Attribut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribut_Typ(), ecorePackage.getEString(), "typ", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribut_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodeEClass, Methode.class, "Methode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethode_Aufruf(), this.getAufruf(), null, "aufruf", null, 0, -1, Methode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aufrufEClass, Aufruf.class, "Aufruf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAufruf_Objekt(), ecorePackage.getEString(), "objekt", null, 0, 1, Aufruf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAufruf_Methode(), this.getMethodensignatur(), null, "methode", null, 0, 1, Aufruf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statelessSessionBeanEClass, StatelessSessionBean.class, "StatelessSessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatelessSessionBean_Methode(), this.getMethode(), null, "methode", null, 0, -1, StatelessSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jpaEntityEClass, JPAEntity.class, "JPAEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJPAEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, JPAEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJPAEntity_Attribute(), this.getAttribut(), null, "attribute", null, 0, -1, JPAEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJPAEntity_Methode(), this.getMethode(), null, "methode", null, 0, -1, JPAEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageDrivenBeanEClass, MessageDrivenBean.class, "MessageDrivenBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singletonSessionBeanEClass, SingletonSessionBean.class, "SingletonSessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SwarchitekturPackageImpl
