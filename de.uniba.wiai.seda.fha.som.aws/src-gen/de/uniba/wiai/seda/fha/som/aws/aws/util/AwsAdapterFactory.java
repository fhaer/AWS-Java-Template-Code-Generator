/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws.util;

import de.uniba.wiai.seda.fha.som.aws.aws.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage
 * @generated
 */
public class AwsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AwsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AwsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AwsPackage.eINSTANCE;
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
  protected AwsSwitch<Adapter> modelSwitch =
    new AwsSwitch<Adapter>()
    {
      @Override
      public Adapter caseAwS(AwS object)
      {
        return createAwSAdapter();
      }
      @Override
      public Adapter caseSchema(Schema object)
      {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseVOS(VOS object)
      {
        return createVOSAdapter();
      }
      @Override
      public Adapter caseKOS(KOS object)
      {
        return createKOSAdapter();
      }
      @Override
      public Adapter caseObjekttyp(Objekttyp object)
      {
        return createObjekttypAdapter();
      }
      @Override
      public Adapter caseVOT(VOT object)
      {
        return createVOTAdapter();
      }
      @Override
      public Adapter caseKOT(KOT object)
      {
        return createKOTAdapter();
      }
      @Override
      public Adapter caseOOT(OOT object)
      {
        return createOOTAdapter();
      }
      @Override
      public Adapter caseLOT(LOT object)
      {
        return createLOTAdapter();
      }
      @Override
      public Adapter caseTOT(TOT object)
      {
        return createTOTAdapter();
      }
      @Override
      public Adapter caseAttribut(Attribut object)
      {
        return createAttributAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseBeziehung(Beziehung object)
      {
        return createBeziehungAdapter();
      }
      @Override
      public Adapter caseInteracts_with(Interacts_with object)
      {
        return createInteracts_withAdapter();
      }
      @Override
      public Adapter caseIs_a(Is_a object)
      {
        return createIs_aAdapter();
      }
      @Override
      public Adapter caseIs_part_of(Is_part_of object)
      {
        return createIs_part_ofAdapter();
      }
      @Override
      public Adapter caseKardinalitaet(Kardinalitaet object)
      {
        return createKardinalitaetAdapter();
      }
      @Override
      public Adapter caseKardinalitaet01(Kardinalitaet01 object)
      {
        return createKardinalitaet01Adapter();
      }
      @Override
      public Adapter caseKardinalitaet0x(Kardinalitaet0x object)
      {
        return createKardinalitaet0xAdapter();
      }
      @Override
      public Adapter caseKardinalitaet11(Kardinalitaet11 object)
      {
        return createKardinalitaet11Adapter();
      }
      @Override
      public Adapter caseKardinalitaet1x(Kardinalitaet1x object)
      {
        return createKardinalitaet1xAdapter();
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
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS <em>Aw S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS
   * @generated
   */
  public Adapter createAwSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Schema
   * @generated
   */
  public Adapter createSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS <em>VOS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOS
   * @generated
   */
  public Adapter createVOSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOS <em>KOS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOS
   * @generated
   */
  public Adapter createKOSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp
   * @generated
   */
  public Adapter createObjekttypAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOT <em>VOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOT
   * @generated
   */
  public Adapter createVOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOT <em>KOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOT
   * @generated
   */
  public Adapter createKOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.OOT <em>OOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.OOT
   * @generated
   */
  public Adapter createOOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.LOT <em>LOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.LOT
   * @generated
   */
  public Adapter createLOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.TOT <em>TOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.TOT
   * @generated
   */
  public Adapter createTOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Attribut
   * @generated
   */
  public Adapter createAttributAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung <em>Beziehung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung
   * @generated
   */
  public Adapter createBeziehungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with <em>Interacts with</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with
   * @generated
   */
  public Adapter createInteracts_withAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Is_a <em>Is a</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Is_a
   * @generated
   */
  public Adapter createIs_aAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of <em>Is part of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of
   * @generated
   */
  public Adapter createIs_part_ofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet
   * @generated
   */
  public Adapter createKardinalitaetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01 <em>Kardinalitaet01</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01
   * @generated
   */
  public Adapter createKardinalitaet01Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x <em>Kardinalitaet0x</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x
   * @generated
   */
  public Adapter createKardinalitaet0xAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11 <em>Kardinalitaet11</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11
   * @generated
   */
  public Adapter createKardinalitaet11Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x <em>Kardinalitaet1x</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x
   * @generated
   */
  public Adapter createKardinalitaet1xAdapter()
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

} //AwsAdapterFactory
