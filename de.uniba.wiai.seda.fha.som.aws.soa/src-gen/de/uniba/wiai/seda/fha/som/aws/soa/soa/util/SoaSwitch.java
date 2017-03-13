/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.util;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage
 * @generated
 */
public class SoaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SoaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SoaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SoaPackage.SOA_AW_S:
      {
        SOA_AwS soA_AwS = (SOA_AwS)theEObject;
        T result = caseSOA_AwS(soA_AwS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.VORGANGSSERVICE:
      {
        Vorgangsservice vorgangsservice = (Vorgangsservice)theEObject;
        T result = caseVorgangsservice(vorgangsservice);
        if (result == null) result = caseService(vorgangsservice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR:
      {
        VorgangsserviceElementar vorgangsserviceElementar = (VorgangsserviceElementar)theEObject;
        T result = caseVorgangsserviceElementar(vorgangsserviceElementar);
        if (result == null) result = caseService(vorgangsserviceElementar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.SERVICE_METHODE:
      {
        ServiceMethode serviceMethode = (ServiceMethode)theEObject;
        T result = caseServiceMethode(serviceMethode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.WORKFLOW:
      {
        Workflow workflow = (Workflow)theEObject;
        T result = caseWorkflow(workflow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.ORCHESTRIERUNG:
      {
        Orchestrierung orchestrierung = (Orchestrierung)theEObject;
        T result = caseOrchestrierung(orchestrierung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.CHOREOGRAPHIE_LOKAL:
      {
        ChoreographieLokal choreographieLokal = (ChoreographieLokal)theEObject;
        T result = caseChoreographieLokal(choreographieLokal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.BEDINGUNG:
      {
        Bedingung bedingung = (Bedingung)theEObject;
        T result = caseBedingung(bedingung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.ENTITYSERVICE:
      {
        Entityservice entityservice = (Entityservice)theEObject;
        T result = caseEntityservice(entityservice);
        if (result == null) result = caseService(entityservice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoaPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SOA Aw S</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SOA Aw S</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSOA_AwS(SOA_AwS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vorgangsservice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vorgangsservice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVorgangsservice(Vorgangsservice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vorgangsservice Elementar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vorgangsservice Elementar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVorgangsserviceElementar(VorgangsserviceElementar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Methode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Methode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceMethode(ServiceMethode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflow(Workflow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orchestrierung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orchestrierung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrchestrierung(Orchestrierung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choreographie Lokal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choreographie Lokal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoreographieLokal(ChoreographieLokal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bedingung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bedingung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBedingung(Bedingung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entityservice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entityservice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityservice(Entityservice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SoaSwitch
