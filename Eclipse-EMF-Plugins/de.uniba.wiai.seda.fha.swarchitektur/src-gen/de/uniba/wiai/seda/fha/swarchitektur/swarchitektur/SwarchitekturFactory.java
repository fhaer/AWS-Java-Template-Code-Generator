/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage
 * @generated
 */
public interface SwarchitekturFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwarchitekturFactory eINSTANCE = de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Architektur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architektur</em>'.
   * @generated
   */
  Architektur createArchitektur();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>EJB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EJB</em>'.
   * @generated
   */
  EJB createEJB();

  /**
   * Returns a new object of class '<em>Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Session Bean</em>'.
   * @generated
   */
  SessionBean createSessionBean();

  /**
   * Returns a new object of class '<em>Business Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Interface</em>'.
   * @generated
   */
  BusinessInterface createBusinessInterface();

  /**
   * Returns a new object of class '<em>Methodensignatur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Methodensignatur</em>'.
   * @generated
   */
  Methodensignatur createMethodensignatur();

  /**
   * Returns a new object of class '<em>Stateful Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stateful Session Bean</em>'.
   * @generated
   */
  StatefulSessionBean createStatefulSessionBean();

  /**
   * Returns a new object of class '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribut</em>'.
   * @generated
   */
  Attribut createAttribut();

  /**
   * Returns a new object of class '<em>Methode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Methode</em>'.
   * @generated
   */
  Methode createMethode();

  /**
   * Returns a new object of class '<em>Aufruf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aufruf</em>'.
   * @generated
   */
  Aufruf createAufruf();

  /**
   * Returns a new object of class '<em>Stateless Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stateless Session Bean</em>'.
   * @generated
   */
  StatelessSessionBean createStatelessSessionBean();

  /**
   * Returns a new object of class '<em>JPA Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JPA Entity</em>'.
   * @generated
   */
  JPAEntity createJPAEntity();

  /**
   * Returns a new object of class '<em>Message Driven Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Driven Bean</em>'.
   * @generated
   */
  MessageDrivenBean createMessageDrivenBean();

  /**
   * Returns a new object of class '<em>Singleton Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Singleton Session Bean</em>'.
   * @generated
   */
  SingletonSessionBean createSingletonSessionBean();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SwarchitekturPackage getSwarchitekturPackage();

} //SwarchitekturFactory
