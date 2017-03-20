/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.util;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage
 * @generated
 */
public class SoaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SoaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SoaPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected SoaSwitch<Adapter> modelSwitch =
    new SoaSwitch<Adapter>()
    {
      @Override
      public Adapter caseSOA_AwS(SOA_AwS object)
      {
        return createSOA_AwSAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseVorgangsservice(Vorgangsservice object)
      {
        return createVorgangsserviceAdapter();
      }
      @Override
      public Adapter caseVorgangsserviceElementar(VorgangsserviceElementar object)
      {
        return createVorgangsserviceElementarAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseServiceMethode(ServiceMethode object)
      {
        return createServiceMethodeAdapter();
      }
      @Override
      public Adapter caseWorkflow(Workflow object)
      {
        return createWorkflowAdapter();
      }
      @Override
      public Adapter caseOrchestrierung(Orchestrierung object)
      {
        return createOrchestrierungAdapter();
      }
      @Override
      public Adapter caseChoreographieLokal(ChoreographieLokal object)
      {
        return createChoreographieLokalAdapter();
      }
      @Override
      public Adapter caseBedingung(Bedingung object)
      {
        return createBedingungAdapter();
      }
      @Override
      public Adapter caseEntityservice(Entityservice object)
      {
        return createEntityserviceAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS <em>SOA Aw S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS
   * @generated
   */
  public Adapter createSOA_AwSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice <em>Vorgangsservice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice
   * @generated
   */
  public Adapter createVorgangsserviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar <em>Vorgangsservice Elementar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar
   * @generated
   */
  public Adapter createVorgangsserviceElementarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode <em>Service Methode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode
   * @generated
   */
  public Adapter createServiceMethodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow
   * @generated
   */
  public Adapter createWorkflowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung <em>Orchestrierung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung
   * @generated
   */
  public Adapter createOrchestrierungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal <em>Choreographie Lokal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal
   * @generated
   */
  public Adapter createChoreographieLokalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung
   * @generated
   */
  public Adapter createBedingungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice <em>Entityservice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice
   * @generated
   */
  public Adapter createEntityserviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SoaAdapterFactory
