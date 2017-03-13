/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.*;

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
public class SoaFactoryImpl extends EFactoryImpl implements SoaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SoaFactory init()
  {
    try
    {
      SoaFactory theSoaFactory = (SoaFactory)EPackage.Registry.INSTANCE.getEFactory(SoaPackage.eNS_URI);
      if (theSoaFactory != null)
      {
        return theSoaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SoaPackage.SOA_AW_S: return createSOA_AwS();
      case SoaPackage.SERVICE: return createService();
      case SoaPackage.VORGANGSSERVICE: return createVorgangsservice();
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR: return createVorgangsserviceElementar();
      case SoaPackage.INTERFACE: return createInterface();
      case SoaPackage.SERVICE_METHODE: return createServiceMethode();
      case SoaPackage.WORKFLOW: return createWorkflow();
      case SoaPackage.ORCHESTRIERUNG: return createOrchestrierung();
      case SoaPackage.CHOREOGRAPHIE_LOKAL: return createChoreographieLokal();
      case SoaPackage.BEDINGUNG: return createBedingung();
      case SoaPackage.ENTITYSERVICE: return createEntityservice();
      case SoaPackage.ENTITY: return createEntity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SOA_AwS createSOA_AwS()
  {
    SOA_AwSImpl soA_AwS = new SOA_AwSImpl();
    return soA_AwS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vorgangsservice createVorgangsservice()
  {
    VorgangsserviceImpl vorgangsservice = new VorgangsserviceImpl();
    return vorgangsservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VorgangsserviceElementar createVorgangsserviceElementar()
  {
    VorgangsserviceElementarImpl vorgangsserviceElementar = new VorgangsserviceElementarImpl();
    return vorgangsserviceElementar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethode createServiceMethode()
  {
    ServiceMethodeImpl serviceMethode = new ServiceMethodeImpl();
    return serviceMethode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workflow createWorkflow()
  {
    WorkflowImpl workflow = new WorkflowImpl();
    return workflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrierung createOrchestrierung()
  {
    OrchestrierungImpl orchestrierung = new OrchestrierungImpl();
    return orchestrierung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoreographieLokal createChoreographieLokal()
  {
    ChoreographieLokalImpl choreographieLokal = new ChoreographieLokalImpl();
    return choreographieLokal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bedingung createBedingung()
  {
    BedingungImpl bedingung = new BedingungImpl();
    return bedingung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entityservice createEntityservice()
  {
    EntityserviceImpl entityservice = new EntityserviceImpl();
    return entityservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaPackage getSoaPackage()
  {
    return (SoaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SoaPackage getPackage()
  {
    return SoaPackage.eINSTANCE;
  }

} //SoaFactoryImpl
