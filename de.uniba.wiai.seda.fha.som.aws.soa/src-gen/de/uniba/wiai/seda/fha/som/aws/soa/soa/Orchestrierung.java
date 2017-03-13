/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestrierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getBedingung <em>Bedingung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode1 <em>Methode1</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode2 <em>Methode2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getOrchestrierung()
 * @model
 * @generated
 */
public interface Orchestrierung extends EObject
{
  /**
   * Returns the value of the '<em><b>Bedingung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bedingung</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bedingung</em>' containment reference.
   * @see #setBedingung(Bedingung)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getOrchestrierung_Bedingung()
   * @model containment="true"
   * @generated
   */
  Bedingung getBedingung();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getBedingung <em>Bedingung</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bedingung</em>' containment reference.
   * @see #getBedingung()
   * @generated
   */
  void setBedingung(Bedingung value);

  /**
   * Returns the value of the '<em><b>Methode1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode1</em>' reference.
   * @see #setMethode1(ServiceMethode)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getOrchestrierung_Methode1()
   * @model
   * @generated
   */
  ServiceMethode getMethode1();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode1 <em>Methode1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methode1</em>' reference.
   * @see #getMethode1()
   * @generated
   */
  void setMethode1(ServiceMethode value);

  /**
   * Returns the value of the '<em><b>Methode2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode2</em>' reference.
   * @see #setMethode2(ServiceMethode)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getOrchestrierung_Methode2()
   * @model
   * @generated
   */
  ServiceMethode getMethode2();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode2 <em>Methode2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methode2</em>' reference.
   * @see #getMethode2()
   * @generated
   */
  void setMethode2(ServiceMethode value);

} // Orchestrierung
