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
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage
 * @generated
 */
public class SwarchitekturSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwarchitekturPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwarchitekturSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SwarchitekturPackage.eINSTANCE;
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
      case SwarchitekturPackage.ARCHITEKTUR:
      {
        Architektur architektur = (Architektur)theEObject;
        T result = caseArchitektur(architektur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.PACKAGE:
      {
        de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package package_ = (de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.EJB:
      {
        EJB ejb = (EJB)theEObject;
        T result = caseEJB(ejb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.SESSION_BEAN:
      {
        SessionBean sessionBean = (SessionBean)theEObject;
        T result = caseSessionBean(sessionBean);
        if (result == null) result = caseEJB(sessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.BUSINESS_INTERFACE:
      {
        BusinessInterface businessInterface = (BusinessInterface)theEObject;
        T result = caseBusinessInterface(businessInterface);
        if (result == null) result = caseEJB(businessInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.METHODENSIGNATUR:
      {
        Methodensignatur methodensignatur = (Methodensignatur)theEObject;
        T result = caseMethodensignatur(methodensignatur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.STATEFUL_SESSION_BEAN:
      {
        StatefulSessionBean statefulSessionBean = (StatefulSessionBean)theEObject;
        T result = caseStatefulSessionBean(statefulSessionBean);
        if (result == null) result = caseSessionBean(statefulSessionBean);
        if (result == null) result = caseEJB(statefulSessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.ATTRIBUT:
      {
        Attribut attribut = (Attribut)theEObject;
        T result = caseAttribut(attribut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.METHODE:
      {
        Methode methode = (Methode)theEObject;
        T result = caseMethode(methode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.AUFRUF:
      {
        Aufruf aufruf = (Aufruf)theEObject;
        T result = caseAufruf(aufruf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.STATELESS_SESSION_BEAN:
      {
        StatelessSessionBean statelessSessionBean = (StatelessSessionBean)theEObject;
        T result = caseStatelessSessionBean(statelessSessionBean);
        if (result == null) result = caseSessionBean(statelessSessionBean);
        if (result == null) result = caseEJB(statelessSessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.JPA_ENTITY:
      {
        JPAEntity jpaEntity = (JPAEntity)theEObject;
        T result = caseJPAEntity(jpaEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.MESSAGE_DRIVEN_BEAN:
      {
        MessageDrivenBean messageDrivenBean = (MessageDrivenBean)theEObject;
        T result = caseMessageDrivenBean(messageDrivenBean);
        if (result == null) result = caseEJB(messageDrivenBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwarchitekturPackage.SINGLETON_SESSION_BEAN:
      {
        SingletonSessionBean singletonSessionBean = (SingletonSessionBean)theEObject;
        T result = caseSingletonSessionBean(singletonSessionBean);
        if (result == null) result = caseSessionBean(singletonSessionBean);
        if (result == null) result = caseEJB(singletonSessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architektur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architektur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitektur(Architektur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EJB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EJB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEJB(EJB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSessionBean(SessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessInterface(BusinessInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methodensignatur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methodensignatur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodensignatur(Methodensignatur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatefulSessionBean(StatefulSessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribut(Attribut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethode(Methode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aufruf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aufruf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAufruf(Aufruf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatelessSessionBean(StatelessSessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JPA Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JPA Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPAEntity(JPAEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Driven Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Driven Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageDrivenBean(MessageDrivenBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Singleton Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Singleton Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingletonSessionBean(SingletonSessionBean object)
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

} //SwarchitekturSwitch
