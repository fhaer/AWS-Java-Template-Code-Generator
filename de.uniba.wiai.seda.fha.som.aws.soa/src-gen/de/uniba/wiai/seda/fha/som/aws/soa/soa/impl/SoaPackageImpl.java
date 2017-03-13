/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Service;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaFactory;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow;

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
public class SoaPackageImpl extends EPackageImpl implements SoaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass soA_AwSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vorgangsserviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vorgangsserviceElementarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceMethodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orchestrierungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choreographieLokalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bedingungEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityserviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

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
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SoaPackageImpl()
  {
    super(eNS_URI, SoaFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SoaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SoaPackage init()
  {
    if (isInited) return (SoaPackage)EPackage.Registry.INSTANCE.getEPackage(SoaPackage.eNS_URI);

    // Obtain or create and register package
    SoaPackageImpl theSoaPackage = (SoaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoaPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AwsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSoaPackage.createPackageContents();

    // Initialize created meta-data
    theSoaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSoaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SoaPackage.eNS_URI, theSoaPackage);
    return theSoaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSOA_AwS()
  {
    return soA_AwSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSOA_AwS_Name()
  {
    return (EAttribute)soA_AwSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSOA_AwS_Version()
  {
    return (EAttribute)soA_AwSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSOA_AwS_Vos()
  {
    return (EReference)soA_AwSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSOA_AwS_Kos()
  {
    return (EReference)soA_AwSEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSOA_AwS_Vorgangsservices()
  {
    return (EReference)soA_AwSEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSOA_AwS_Entityservices()
  {
    return (EReference)soA_AwSEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVorgangsservice()
  {
    return vorgangsserviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVorgangsservice_ChoreographieIF()
  {
    return (EReference)vorgangsserviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVorgangsservice_VorgangsservicesElementar()
  {
    return (EReference)vorgangsserviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVorgangsservice_Workflow()
  {
    return (EReference)vorgangsserviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVorgangsserviceElementar()
  {
    return vorgangsserviceElementarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVorgangsserviceElementar_KomponentenObjekttyp()
  {
    return (EReference)vorgangsserviceElementarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVorgangsserviceElementar_Interface()
  {
    return (EReference)vorgangsserviceElementarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Name()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Methoden()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceMethode()
  {
    return serviceMethodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethode_Name()
  {
    return (EAttribute)serviceMethodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethode_Parameter()
  {
    return (EAttribute)serviceMethodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflow()
  {
    return workflowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflow_Orchestrierung()
  {
    return (EReference)workflowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflow_Choreographie()
  {
    return (EReference)workflowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrchestrierung()
  {
    return orchestrierungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrierung_Bedingung()
  {
    return (EReference)orchestrierungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrierung_Methode1()
  {
    return (EReference)orchestrierungEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrierung_Methode2()
  {
    return (EReference)orchestrierungEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoreographieLokal()
  {
    return choreographieLokalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreographieLokal_Bedingung()
  {
    return (EReference)choreographieLokalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreographieLokal_Methode1()
  {
    return (EReference)choreographieLokalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreographieLokal_Service2()
  {
    return (EReference)choreographieLokalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreographieLokal_Methode2()
  {
    return (EReference)choreographieLokalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBedingung()
  {
    return bedingungEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBedingung_Bedingung()
  {
    return (EAttribute)bedingungEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityservice()
  {
    return entityserviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityservice_Interface()
  {
    return (EReference)entityserviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityservice_Entities()
  {
    return (EReference)entityserviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_KomponentenObjekttyp()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Interface()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaFactory getSoaFactory()
  {
    return (SoaFactory)getEFactoryInstance();
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
    soA_AwSEClass = createEClass(SOA_AW_S);
    createEAttribute(soA_AwSEClass, SOA_AW_S__NAME);
    createEAttribute(soA_AwSEClass, SOA_AW_S__VERSION);
    createEReference(soA_AwSEClass, SOA_AW_S__VOS);
    createEReference(soA_AwSEClass, SOA_AW_S__KOS);
    createEReference(soA_AwSEClass, SOA_AW_S__VORGANGSSERVICES);
    createEReference(soA_AwSEClass, SOA_AW_S__ENTITYSERVICES);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);

    vorgangsserviceEClass = createEClass(VORGANGSSERVICE);
    createEReference(vorgangsserviceEClass, VORGANGSSERVICE__CHOREOGRAPHIE_IF);
    createEReference(vorgangsserviceEClass, VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR);
    createEReference(vorgangsserviceEClass, VORGANGSSERVICE__WORKFLOW);

    vorgangsserviceElementarEClass = createEClass(VORGANGSSERVICE_ELEMENTAR);
    createEReference(vorgangsserviceElementarEClass, VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP);
    createEReference(vorgangsserviceElementarEClass, VORGANGSSERVICE_ELEMENTAR__INTERFACE);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__NAME);
    createEReference(interfaceEClass, INTERFACE__METHODEN);

    serviceMethodeEClass = createEClass(SERVICE_METHODE);
    createEAttribute(serviceMethodeEClass, SERVICE_METHODE__NAME);
    createEAttribute(serviceMethodeEClass, SERVICE_METHODE__PARAMETER);

    workflowEClass = createEClass(WORKFLOW);
    createEReference(workflowEClass, WORKFLOW__ORCHESTRIERUNG);
    createEReference(workflowEClass, WORKFLOW__CHOREOGRAPHIE);

    orchestrierungEClass = createEClass(ORCHESTRIERUNG);
    createEReference(orchestrierungEClass, ORCHESTRIERUNG__BEDINGUNG);
    createEReference(orchestrierungEClass, ORCHESTRIERUNG__METHODE1);
    createEReference(orchestrierungEClass, ORCHESTRIERUNG__METHODE2);

    choreographieLokalEClass = createEClass(CHOREOGRAPHIE_LOKAL);
    createEReference(choreographieLokalEClass, CHOREOGRAPHIE_LOKAL__BEDINGUNG);
    createEReference(choreographieLokalEClass, CHOREOGRAPHIE_LOKAL__METHODE1);
    createEReference(choreographieLokalEClass, CHOREOGRAPHIE_LOKAL__SERVICE2);
    createEReference(choreographieLokalEClass, CHOREOGRAPHIE_LOKAL__METHODE2);

    bedingungEClass = createEClass(BEDINGUNG);
    createEAttribute(bedingungEClass, BEDINGUNG__BEDINGUNG);

    entityserviceEClass = createEClass(ENTITYSERVICE);
    createEReference(entityserviceEClass, ENTITYSERVICE__INTERFACE);
    createEReference(entityserviceEClass, ENTITYSERVICE__ENTITIES);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEReference(entityEClass, ENTITY__KOMPONENTEN_OBJEKTTYP);
    createEReference(entityEClass, ENTITY__INTERFACE);
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
    AwsPackage theAwsPackage = (AwsPackage)EPackage.Registry.INSTANCE.getEPackage(AwsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    vorgangsserviceEClass.getESuperTypes().add(this.getService());
    vorgangsserviceElementarEClass.getESuperTypes().add(this.getService());
    entityserviceEClass.getESuperTypes().add(this.getService());

    // Initialize classes and features; add operations and parameters
    initEClass(soA_AwSEClass, SOA_AwS.class, "SOA_AwS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSOA_AwS_Name(), ecorePackage.getEString(), "name", null, 0, 1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSOA_AwS_Version(), ecorePackage.getEString(), "version", null, 0, 1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSOA_AwS_Vos(), theAwsPackage.getVOS(), null, "vos", null, 0, 1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSOA_AwS_Kos(), theAwsPackage.getKOS(), null, "kos", null, 0, 1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSOA_AwS_Vorgangsservices(), this.getVorgangsservice(), null, "vorgangsservices", null, 0, -1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSOA_AwS_Entityservices(), this.getEntityservice(), null, "entityservices", null, 0, -1, SOA_AwS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vorgangsserviceEClass, Vorgangsservice.class, "Vorgangsservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVorgangsservice_ChoreographieIF(), this.getInterface(), null, "choreographieIF", null, 0, 1, Vorgangsservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVorgangsservice_VorgangsservicesElementar(), this.getVorgangsserviceElementar(), null, "vorgangsservicesElementar", null, 0, -1, Vorgangsservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVorgangsservice_Workflow(), this.getWorkflow(), null, "workflow", null, 0, 1, Vorgangsservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vorgangsserviceElementarEClass, VorgangsserviceElementar.class, "VorgangsserviceElementar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVorgangsserviceElementar_KomponentenObjekttyp(), theAwsPackage.getVOT(), null, "komponentenObjekttyp", null, 0, 1, VorgangsserviceElementar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVorgangsserviceElementar_Interface(), this.getInterface(), null, "interface", null, 0, 1, VorgangsserviceElementar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Methoden(), this.getServiceMethode(), null, "methoden", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceMethodeEClass, ServiceMethode.class, "ServiceMethode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceMethode_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceMethode_Parameter(), ecorePackage.getEString(), "parameter", null, 0, -1, ServiceMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflow_Orchestrierung(), this.getOrchestrierung(), null, "orchestrierung", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflow_Choreographie(), this.getChoreographieLokal(), null, "choreographie", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orchestrierungEClass, Orchestrierung.class, "Orchestrierung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrchestrierung_Bedingung(), this.getBedingung(), null, "bedingung", null, 0, 1, Orchestrierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrierung_Methode1(), this.getServiceMethode(), null, "methode1", null, 0, 1, Orchestrierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrierung_Methode2(), this.getServiceMethode(), null, "methode2", null, 0, 1, Orchestrierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choreographieLokalEClass, ChoreographieLokal.class, "ChoreographieLokal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoreographieLokal_Bedingung(), this.getBedingung(), null, "bedingung", null, 0, 1, ChoreographieLokal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoreographieLokal_Methode1(), this.getServiceMethode(), null, "methode1", null, 0, 1, ChoreographieLokal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoreographieLokal_Service2(), this.getService(), null, "service2", null, 0, 1, ChoreographieLokal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoreographieLokal_Methode2(), this.getServiceMethode(), null, "methode2", null, 0, 1, ChoreographieLokal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bedingungEClass, Bedingung.class, "Bedingung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBedingung_Bedingung(), ecorePackage.getEString(), "bedingung", null, 0, 1, Bedingung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityserviceEClass, Entityservice.class, "Entityservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityservice_Interface(), this.getInterface(), null, "interface", null, 0, 1, Entityservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityservice_Entities(), this.getEntity(), null, "entities", null, 0, -1, Entityservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_KomponentenObjekttyp(), theAwsPackage.getKOT(), null, "komponentenObjekttyp", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Interface(), this.getInterface(), null, "interface", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SoaPackageImpl
