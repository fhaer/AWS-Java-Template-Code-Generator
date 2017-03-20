/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Anweisung;
import de.uniba.wiai.seda.somsl.somSL.Attribut;
import de.uniba.wiai.seda.somsl.somSL.Beziehung;
import de.uniba.wiai.seda.somsl.somSL.Interacts_with;
import de.uniba.wiai.seda.somsl.somSL.Is_a;
import de.uniba.wiai.seda.somsl.somSL.Is_part_of;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet01;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet0x;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet11;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet1x;
import de.uniba.wiai.seda.somsl.somSL.Metamodell;
import de.uniba.wiai.seda.somsl.somSL.Objekttyp;
import de.uniba.wiai.seda.somsl.somSL.Operator;
import de.uniba.wiai.seda.somsl.somSL.SomSLFactory;
import de.uniba.wiai.seda.somsl.somSL.SomSLPackage;

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
public class SomSLPackageImpl extends EPackageImpl implements SomSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objekttypEClass = null;

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
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anweisungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass votEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass totEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beziehungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interacts_withEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass is_aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass is_part_ofEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kardinalitaetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kardinalitaet01EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kardinalitaet0xEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kardinalitaet11EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kardinalitaet1xEClass = null;

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
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SomSLPackageImpl()
  {
    super(eNS_URI, SomSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SomSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SomSLPackage init()
  {
    if (isInited) return (SomSLPackage)EPackage.Registry.INSTANCE.getEPackage(SomSLPackage.eNS_URI);

    // Obtain or create and register package
    SomSLPackageImpl theSomSLPackage = (SomSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SomSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SomSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSomSLPackage.createPackageContents();

    // Initialize created meta-data
    theSomSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSomSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SomSLPackage.eNS_URI, theSomSLPackage);
    return theSomSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodell()
  {
    return metamodellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodell_Name()
  {
    return (EAttribute)metamodellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodell_Version()
  {
    return (EAttribute)metamodellEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodell_Objekttyp()
  {
    return (EReference)metamodellEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodell_Beziehung()
  {
    return (EReference)metamodellEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjekttyp()
  {
    return objekttypEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjekttyp_Name()
  {
    return (EAttribute)objekttypEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjekttyp_Attribute()
  {
    return (EReference)objekttypEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjekttyp_Operatoren()
  {
    return (EReference)objekttypEClass.getEStructuralFeatures().get(2);
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
  public EReference getAttribut_Objekttyp()
  {
    return (EReference)attributEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribut_Datentyp()
  {
    return (EAttribute)attributEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribut_Name()
  {
    return (EAttribute)attributEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_Name()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Parameter()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Anweisungen()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnweisung()
  {
    return anweisungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnweisung_Kontrollstruktur()
  {
    return (EAttribute)anweisungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnweisung_Bedingung()
  {
    return (EReference)anweisungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnweisung_BedigteAnweisungen()
  {
    return (EReference)anweisungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnweisung_Objekt()
  {
    return (EReference)anweisungEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnweisung_Operator()
  {
    return (EAttribute)anweisungEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKOT()
  {
    return kotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVOT()
  {
    return votEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOOT()
  {
    return ootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLOT()
  {
    return lotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTOT()
  {
    return totEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeziehung()
  {
    return beziehungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Objekttyp1()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Kardinalitaet()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Objekttyp2()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteracts_with()
  {
    return interacts_withEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIs_a()
  {
    return is_aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIs_part_of()
  {
    return is_part_ofEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKardinalitaet()
  {
    return kardinalitaetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKardinalitaet01()
  {
    return kardinalitaet01EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKardinalitaet0x()
  {
    return kardinalitaet0xEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKardinalitaet11()
  {
    return kardinalitaet11EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKardinalitaet1x()
  {
    return kardinalitaet1xEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomSLFactory getSomSLFactory()
  {
    return (SomSLFactory)getEFactoryInstance();
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
    metamodellEClass = createEClass(METAMODELL);
    createEAttribute(metamodellEClass, METAMODELL__NAME);
    createEAttribute(metamodellEClass, METAMODELL__VERSION);
    createEReference(metamodellEClass, METAMODELL__OBJEKTTYP);
    createEReference(metamodellEClass, METAMODELL__BEZIEHUNG);

    objekttypEClass = createEClass(OBJEKTTYP);
    createEAttribute(objekttypEClass, OBJEKTTYP__NAME);
    createEReference(objekttypEClass, OBJEKTTYP__ATTRIBUTE);
    createEReference(objekttypEClass, OBJEKTTYP__OPERATOREN);

    attributEClass = createEClass(ATTRIBUT);
    createEReference(attributEClass, ATTRIBUT__OBJEKTTYP);
    createEAttribute(attributEClass, ATTRIBUT__DATENTYP);
    createEAttribute(attributEClass, ATTRIBUT__NAME);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__NAME);
    createEReference(operatorEClass, OPERATOR__PARAMETER);
    createEReference(operatorEClass, OPERATOR__ANWEISUNGEN);

    anweisungEClass = createEClass(ANWEISUNG);
    createEAttribute(anweisungEClass, ANWEISUNG__KONTROLLSTRUKTUR);
    createEReference(anweisungEClass, ANWEISUNG__BEDINGUNG);
    createEReference(anweisungEClass, ANWEISUNG__BEDIGTE_ANWEISUNGEN);
    createEReference(anweisungEClass, ANWEISUNG__OBJEKT);
    createEAttribute(anweisungEClass, ANWEISUNG__OPERATOR);

    kotEClass = createEClass(KOT);

    votEClass = createEClass(VOT);

    ootEClass = createEClass(OOT);

    lotEClass = createEClass(LOT);

    totEClass = createEClass(TOT);

    beziehungEClass = createEClass(BEZIEHUNG);
    createEReference(beziehungEClass, BEZIEHUNG__OBJEKTTYP1);
    createEReference(beziehungEClass, BEZIEHUNG__KARDINALITAET);
    createEReference(beziehungEClass, BEZIEHUNG__OBJEKTTYP2);

    interacts_withEClass = createEClass(INTERACTS_WITH);

    is_aEClass = createEClass(IS_A);

    is_part_ofEClass = createEClass(IS_PART_OF);

    kardinalitaetEClass = createEClass(KARDINALITAET);

    kardinalitaet01EClass = createEClass(KARDINALITAET01);

    kardinalitaet0xEClass = createEClass(KARDINALITAET0X);

    kardinalitaet11EClass = createEClass(KARDINALITAET11);

    kardinalitaet1xEClass = createEClass(KARDINALITAET1X);
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
    kotEClass.getESuperTypes().add(this.getObjekttyp());
    votEClass.getESuperTypes().add(this.getObjekttyp());
    ootEClass.getESuperTypes().add(this.getKOT());
    lotEClass.getESuperTypes().add(this.getKOT());
    totEClass.getESuperTypes().add(this.getKOT());
    interacts_withEClass.getESuperTypes().add(this.getBeziehung());
    is_aEClass.getESuperTypes().add(this.getBeziehung());
    is_part_ofEClass.getESuperTypes().add(this.getBeziehung());
    kardinalitaet01EClass.getESuperTypes().add(this.getKardinalitaet());
    kardinalitaet0xEClass.getESuperTypes().add(this.getKardinalitaet());
    kardinalitaet11EClass.getESuperTypes().add(this.getKardinalitaet());
    kardinalitaet1xEClass.getESuperTypes().add(this.getKardinalitaet());

    // Initialize classes and features; add operations and parameters
    initEClass(metamodellEClass, Metamodell.class, "Metamodell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetamodell_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metamodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetamodell_Version(), ecorePackage.getEString(), "version", null, 0, 1, Metamodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetamodell_Objekttyp(), this.getObjekttyp(), null, "objekttyp", null, 0, -1, Metamodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetamodell_Beziehung(), this.getBeziehung(), null, "beziehung", null, 0, -1, Metamodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objekttypEClass, Objekttyp.class, "Objekttyp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjekttyp_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjekttyp_Attribute(), this.getAttribut(), null, "attribute", null, 0, -1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjekttyp_Operatoren(), this.getOperator(), null, "operatoren", null, 0, -1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributEClass, Attribut.class, "Attribut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribut_Objekttyp(), this.getObjekttyp(), null, "objekttyp", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribut_Datentyp(), ecorePackage.getEString(), "datentyp", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribut_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Parameter(), this.getObjekttyp(), null, "parameter", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Anweisungen(), this.getAnweisung(), null, "anweisungen", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anweisungEClass, Anweisung.class, "Anweisung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnweisung_Kontrollstruktur(), ecorePackage.getEString(), "kontrollstruktur", null, 0, 1, Anweisung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnweisung_Bedingung(), this.getAnweisung(), null, "bedingung", null, 0, 1, Anweisung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnweisung_BedigteAnweisungen(), this.getAnweisung(), null, "bedigteAnweisungen", null, 0, -1, Anweisung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnweisung_Objekt(), this.getObjekttyp(), null, "objekt", null, 0, 1, Anweisung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnweisung_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Anweisung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kotEClass, de.uniba.wiai.seda.somsl.somSL.KOT.class, "KOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(votEClass, de.uniba.wiai.seda.somsl.somSL.VOT.class, "VOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ootEClass, de.uniba.wiai.seda.somsl.somSL.OOT.class, "OOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lotEClass, de.uniba.wiai.seda.somsl.somSL.LOT.class, "LOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(totEClass, de.uniba.wiai.seda.somsl.somSL.TOT.class, "TOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beziehungEClass, Beziehung.class, "Beziehung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBeziehung_Objekttyp1(), this.getObjekttyp(), null, "objekttyp1", null, 0, 1, Beziehung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeziehung_Kardinalitaet(), this.getKardinalitaet(), null, "kardinalitaet", null, 0, 1, Beziehung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeziehung_Objekttyp2(), this.getObjekttyp(), null, "objekttyp2", null, 0, 1, Beziehung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interacts_withEClass, Interacts_with.class, "Interacts_with", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(is_aEClass, Is_a.class, "Is_a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(is_part_ofEClass, Is_part_of.class, "Is_part_of", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kardinalitaetEClass, Kardinalitaet.class, "Kardinalitaet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kardinalitaet01EClass, Kardinalitaet01.class, "Kardinalitaet01", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kardinalitaet0xEClass, Kardinalitaet0x.class, "Kardinalitaet0x", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kardinalitaet11EClass, Kardinalitaet11.class, "Kardinalitaet11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kardinalitaet1xEClass, Kardinalitaet1x.class, "Kardinalitaet1x", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SomSLPackageImpl
