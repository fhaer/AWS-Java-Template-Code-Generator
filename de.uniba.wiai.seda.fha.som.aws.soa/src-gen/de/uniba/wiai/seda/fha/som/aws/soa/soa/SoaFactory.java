/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage
 * @generated
 */
public interface SoaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SoaFactory eINSTANCE = de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SOA Aw S</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SOA Aw S</em>'.
   * @generated
   */
  SOA_AwS createSOA_AwS();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Vorgangsservice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vorgangsservice</em>'.
   * @generated
   */
  Vorgangsservice createVorgangsservice();

  /**
   * Returns a new object of class '<em>Vorgangsservice Elementar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vorgangsservice Elementar</em>'.
   * @generated
   */
  VorgangsserviceElementar createVorgangsserviceElementar();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Service Methode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Methode</em>'.
   * @generated
   */
  ServiceMethode createServiceMethode();

  /**
   * Returns a new object of class '<em>Workflow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow</em>'.
   * @generated
   */
  Workflow createWorkflow();

  /**
   * Returns a new object of class '<em>Orchestrierung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orchestrierung</em>'.
   * @generated
   */
  Orchestrierung createOrchestrierung();

  /**
   * Returns a new object of class '<em>Choreographie Lokal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choreographie Lokal</em>'.
   * @generated
   */
  ChoreographieLokal createChoreographieLokal();

  /**
   * Returns a new object of class '<em>Bedingung</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bedingung</em>'.
   * @generated
   */
  Bedingung createBedingung();

  /**
   * Returns a new object of class '<em>Entityservice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entityservice</em>'.
   * @generated
   */
  Entityservice createEntityservice();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SoaPackage getSoaPackage();

} //SoaFactory
