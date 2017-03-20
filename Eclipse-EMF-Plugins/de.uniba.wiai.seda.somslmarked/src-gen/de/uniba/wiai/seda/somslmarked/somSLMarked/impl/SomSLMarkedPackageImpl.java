/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked.impl;

import de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationPackage;

import de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut;
import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Interacts_with;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Is_a;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Is_part_of;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet01;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet0x;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet11;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet1x;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Operator;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Schema;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedFactory;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage;

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
public class SomSLMarkedPackageImpl extends EPackageImpl implements SomSLMarkedPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vosEClass = null;

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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SomSLMarkedPackageImpl()
  {
    super(eNS_URI, SomSLMarkedFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SomSLMarkedPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SomSLMarkedPackage init()
  {
    if (isInited) return (SomSLMarkedPackage)EPackage.Registry.INSTANCE.getEPackage(SomSLMarkedPackage.eNS_URI);

    // Obtain or create and register package
    SomSLMarkedPackageImpl theSomSLMarkedPackage = (SomSLMarkedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SomSLMarkedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SomSLMarkedPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AnnotationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSomSLMarkedPackage.createPackageContents();

    // Initialize created meta-data
    theSomSLMarkedPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSomSLMarkedPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SomSLMarkedPackage.eNS_URI, theSomSLMarkedPackage);
    return theSomSLMarkedPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwS()
  {
    return awSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAwS_Name()
  {
    return (EAttribute)awSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAwS_Version()
  {
    return (EAttribute)awSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwS_Kos()
  {
    return (EReference)awSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwS_Vos()
  {
    return (EReference)awSEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchema()
  {
    return schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchema_Name()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKOS()
  {
    return kosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKOS_Objekttypen()
  {
    return (EReference)kosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKOS_Beziehungen()
  {
    return (EReference)kosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKOS_Gliederung()
  {
    return (EReference)kosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVOS()
  {
    return vosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVOS_Objekttypen()
  {
    return (EReference)vosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVOS_Beziehungen()
  {
    return (EReference)vosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVOS_Gliederung()
  {
    return (EReference)vosEClass.getEStructuralFeatures().get(2);
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
  public EReference getObjekttyp_Annotation()
  {
    return (EReference)objekttypEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjekttyp_Name()
  {
    return (EAttribute)objekttypEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjekttyp_Attribute()
  {
    return (EReference)objekttypEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjekttyp_Operatoren()
  {
    return (EReference)objekttypEClass.getEStructuralFeatures().get(3);
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
  public EReference getBeziehung_Annotation()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Objekttyp1()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Kardinalitaet()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeziehung_Objekttyp2()
  {
    return (EReference)beziehungEClass.getEStructuralFeatures().get(3);
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
  public SomSLMarkedFactory getSomSLMarkedFactory()
  {
    return (SomSLMarkedFactory)getEFactoryInstance();
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
    awSEClass = createEClass(AW_S);
    createEAttribute(awSEClass, AW_S__NAME);
    createEAttribute(awSEClass, AW_S__VERSION);
    createEReference(awSEClass, AW_S__KOS);
    createEReference(awSEClass, AW_S__VOS);

    schemaEClass = createEClass(SCHEMA);
    createEAttribute(schemaEClass, SCHEMA__NAME);

    kosEClass = createEClass(KOS);
    createEReference(kosEClass, KOS__OBJEKTTYPEN);
    createEReference(kosEClass, KOS__BEZIEHUNGEN);
    createEReference(kosEClass, KOS__GLIEDERUNG);

    vosEClass = createEClass(VOS);
    createEReference(vosEClass, VOS__OBJEKTTYPEN);
    createEReference(vosEClass, VOS__BEZIEHUNGEN);
    createEReference(vosEClass, VOS__GLIEDERUNG);

    objekttypEClass = createEClass(OBJEKTTYP);
    createEReference(objekttypEClass, OBJEKTTYP__ANNOTATION);
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
    createEReference(beziehungEClass, BEZIEHUNG__ANNOTATION);
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

    // Obtain other dependent packages
    AnnotationPackage theAnnotationPackage = (AnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    kosEClass.getESuperTypes().add(this.getSchema());
    vosEClass.getESuperTypes().add(this.getSchema());
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
    initEClass(awSEClass, AwS.class, "AwS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAwS_Name(), ecorePackage.getEString(), "name", null, 0, 1, AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAwS_Version(), ecorePackage.getEString(), "version", null, 0, 1, AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAwS_Kos(), this.getKOS(), null, "kos", null, 0, 1, AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAwS_Vos(), this.getVOS(), null, "vos", null, 0, 1, AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kosEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.KOS.class, "KOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKOS_Objekttypen(), this.getKOT(), null, "objekttypen", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.KOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKOS_Beziehungen(), this.getBeziehung(), null, "beziehungen", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.KOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKOS_Gliederung(), this.getKOS(), null, "gliederung", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.KOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vosEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.VOS.class, "VOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVOS_Objekttypen(), this.getVOT(), null, "objekttypen", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.VOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVOS_Beziehungen(), this.getInteracts_with(), null, "beziehungen", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.VOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVOS_Gliederung(), this.getVOS(), null, "gliederung", null, 0, -1, de.uniba.wiai.seda.somslmarked.somSLMarked.VOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objekttypEClass, Objekttyp.class, "Objekttyp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjekttyp_Annotation(), theAnnotationPackage.getAnnotation(), null, "annotation", null, 0, 1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

    initEClass(kotEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.KOT.class, "KOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(votEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.VOT.class, "VOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ootEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.OOT.class, "OOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lotEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.LOT.class, "LOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(totEClass, de.uniba.wiai.seda.somslmarked.somSLMarked.TOT.class, "TOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beziehungEClass, Beziehung.class, "Beziehung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBeziehung_Annotation(), theAnnotationPackage.getAnnotation(), null, "annotation", null, 0, 1, Beziehung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

} //SomSLMarkedPackageImpl
