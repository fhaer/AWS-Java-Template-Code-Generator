/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws.impl;

import de.uniba.wiai.seda.fha.annotation.annotation.AnnotationPackage;

import de.uniba.wiai.seda.fha.som.aws.aws.Attribut;
import de.uniba.wiai.seda.fha.som.aws.aws.AwS;
import de.uniba.wiai.seda.fha.som.aws.aws.AwsFactory;
import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;
import de.uniba.wiai.seda.fha.som.aws.aws.Beziehung;
import de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with;
import de.uniba.wiai.seda.fha.som.aws.aws.Is_a;
import de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x;
import de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp;
import de.uniba.wiai.seda.fha.som.aws.aws.Operator;
import de.uniba.wiai.seda.fha.som.aws.aws.Schema;

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
public class AwsPackageImpl extends EPackageImpl implements AwsPackage
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
  private EClass vosEClass = null;

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
  private EClass objekttypEClass = null;

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
  private EClass kotEClass = null;

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
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AwsPackageImpl()
  {
    super(eNS_URI, AwsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AwsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AwsPackage init()
  {
    if (isInited) return (AwsPackage)EPackage.Registry.INSTANCE.getEPackage(AwsPackage.eNS_URI);

    // Obtain or create and register package
    AwsPackageImpl theAwsPackage = (AwsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AwsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AwsPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AnnotationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAwsPackage.createPackageContents();

    // Initialize created meta-data
    theAwsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAwsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AwsPackage.eNS_URI, theAwsPackage);
    return theAwsPackage;
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
  public EReference getSchema_Beziehungen()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(1);
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
  public EReference getVOS_Gliederung()
  {
    return (EReference)vosEClass.getEStructuralFeatures().get(1);
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
  public EReference getKOS_Gliederung()
  {
    return (EReference)kosEClass.getEStructuralFeatures().get(1);
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
  public EClass getVOT()
  {
    return votEClass;
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
  public EClass getAttribut()
  {
    return attributEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribut_Typ()
  {
    return (EReference)attributEClass.getEStructuralFeatures().get(0);
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
  public AwsFactory getAwsFactory()
  {
    return (AwsFactory)getEFactoryInstance();
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
    createEReference(schemaEClass, SCHEMA__BEZIEHUNGEN);

    vosEClass = createEClass(VOS);
    createEReference(vosEClass, VOS__OBJEKTTYPEN);
    createEReference(vosEClass, VOS__GLIEDERUNG);

    kosEClass = createEClass(KOS);
    createEReference(kosEClass, KOS__OBJEKTTYPEN);
    createEReference(kosEClass, KOS__GLIEDERUNG);

    objekttypEClass = createEClass(OBJEKTTYP);
    createEReference(objekttypEClass, OBJEKTTYP__ANNOTATION);
    createEAttribute(objekttypEClass, OBJEKTTYP__NAME);
    createEReference(objekttypEClass, OBJEKTTYP__ATTRIBUTE);
    createEReference(objekttypEClass, OBJEKTTYP__OPERATOREN);

    votEClass = createEClass(VOT);

    kotEClass = createEClass(KOT);

    ootEClass = createEClass(OOT);

    lotEClass = createEClass(LOT);

    totEClass = createEClass(TOT);

    attributEClass = createEClass(ATTRIBUT);
    createEReference(attributEClass, ATTRIBUT__TYP);
    createEAttribute(attributEClass, ATTRIBUT__NAME);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__NAME);
    createEReference(operatorEClass, OPERATOR__PARAMETER);

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
    vosEClass.getESuperTypes().add(this.getSchema());
    kosEClass.getESuperTypes().add(this.getSchema());
    votEClass.getESuperTypes().add(this.getObjekttyp());
    kotEClass.getESuperTypes().add(this.getObjekttyp());
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
    initEReference(getSchema_Beziehungen(), this.getBeziehung(), null, "beziehungen", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vosEClass, de.uniba.wiai.seda.fha.som.aws.aws.VOS.class, "VOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVOS_Objekttypen(), this.getVOT(), null, "objekttypen", null, 0, -1, de.uniba.wiai.seda.fha.som.aws.aws.VOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVOS_Gliederung(), this.getVOS(), null, "gliederung", null, 0, -1, de.uniba.wiai.seda.fha.som.aws.aws.VOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kosEClass, de.uniba.wiai.seda.fha.som.aws.aws.KOS.class, "KOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKOS_Objekttypen(), this.getKOT(), null, "objekttypen", null, 0, -1, de.uniba.wiai.seda.fha.som.aws.aws.KOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKOS_Gliederung(), this.getKOS(), null, "gliederung", null, 0, -1, de.uniba.wiai.seda.fha.som.aws.aws.KOS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objekttypEClass, Objekttyp.class, "Objekttyp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjekttyp_Annotation(), theAnnotationPackage.getAnnotation(), null, "annotation", null, 0, 1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjekttyp_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjekttyp_Attribute(), this.getAttribut(), null, "attribute", null, 0, -1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjekttyp_Operatoren(), this.getOperator(), null, "operatoren", null, 0, -1, Objekttyp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(votEClass, de.uniba.wiai.seda.fha.som.aws.aws.VOT.class, "VOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kotEClass, de.uniba.wiai.seda.fha.som.aws.aws.KOT.class, "KOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ootEClass, de.uniba.wiai.seda.fha.som.aws.aws.OOT.class, "OOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lotEClass, de.uniba.wiai.seda.fha.som.aws.aws.LOT.class, "LOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(totEClass, de.uniba.wiai.seda.fha.som.aws.aws.TOT.class, "TOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributEClass, Attribut.class, "Attribut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribut_Typ(), this.getObjekttyp(), null, "typ", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribut_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Parameter(), this.getObjekttyp(), null, "parameter", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //AwsPackageImpl
