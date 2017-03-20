/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.util;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage
 * @generated
 */
public class SwarchitekturAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwarchitekturPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwarchitekturAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SwarchitekturPackage.eINSTANCE;
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
  protected SwarchitekturSwitch<Adapter> modelSwitch =
    new SwarchitekturSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchitektur(Architektur object)
      {
        return createArchitekturAdapter();
      }
      @Override
      public Adapter casePackage(de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseEJB(EJB object)
      {
        return createEJBAdapter();
      }
      @Override
      public Adapter caseSessionBean(SessionBean object)
      {
        return createSessionBeanAdapter();
      }
      @Override
      public Adapter caseBusinessInterface(BusinessInterface object)
      {
        return createBusinessInterfaceAdapter();
      }
      @Override
      public Adapter caseMethodensignatur(Methodensignatur object)
      {
        return createMethodensignaturAdapter();
      }
      @Override
      public Adapter caseStatefulSessionBean(StatefulSessionBean object)
      {
        return createStatefulSessionBeanAdapter();
      }
      @Override
      public Adapter caseAttribut(Attribut object)
      {
        return createAttributAdapter();
      }
      @Override
      public Adapter caseMethode(Methode object)
      {
        return createMethodeAdapter();
      }
      @Override
      public Adapter caseAufruf(Aufruf object)
      {
        return createAufrufAdapter();
      }
      @Override
      public Adapter caseStatelessSessionBean(StatelessSessionBean object)
      {
        return createStatelessSessionBeanAdapter();
      }
      @Override
      public Adapter caseJPAEntity(JPAEntity object)
      {
        return createJPAEntityAdapter();
      }
      @Override
      public Adapter caseMessageDrivenBean(MessageDrivenBean object)
      {
        return createMessageDrivenBeanAdapter();
      }
      @Override
      public Adapter caseSingletonSessionBean(SingletonSessionBean object)
      {
        return createSingletonSessionBeanAdapter();
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
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur <em>Architektur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur
   * @generated
   */
  public Adapter createArchitekturAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB <em>EJB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB
   * @generated
   */
  public Adapter createEJBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean <em>Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean
   * @generated
   */
  public Adapter createSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface <em>Business Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface
   * @generated
   */
  public Adapter createBusinessInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur <em>Methodensignatur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur
   * @generated
   */
  public Adapter createMethodensignaturAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean
   * @generated
   */
  public Adapter createStatefulSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut
   * @generated
   */
  public Adapter createAttributAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode
   * @generated
   */
  public Adapter createMethodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf <em>Aufruf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf
   * @generated
   */
  public Adapter createAufrufAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean <em>Stateless Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean
   * @generated
   */
  public Adapter createStatelessSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity <em>JPA Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity
   * @generated
   */
  public Adapter createJPAEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean <em>Message Driven Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean
   * @generated
   */
  public Adapter createMessageDrivenBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean <em>Singleton Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean
   * @generated
   */
  public Adapter createSingletonSessionBeanAdapter()
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

} //SwarchitekturAdapterFactory
