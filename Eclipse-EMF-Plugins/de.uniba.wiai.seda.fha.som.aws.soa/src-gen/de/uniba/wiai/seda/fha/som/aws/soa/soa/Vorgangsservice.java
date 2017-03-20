/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorgangsservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getChoreographieIF <em>Choreographie IF</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getVorgangsservicesElementar <em>Vorgangsservices Elementar</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsservice()
 * @model
 * @generated
 */
public interface Vorgangsservice extends Service
{
  /**
   * Returns the value of the '<em><b>Choreographie IF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreographie IF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreographie IF</em>' containment reference.
   * @see #setChoreographieIF(Interface)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsservice_ChoreographieIF()
   * @model containment="true"
   * @generated
   */
  Interface getChoreographieIF();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getChoreographieIF <em>Choreographie IF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreographie IF</em>' containment reference.
   * @see #getChoreographieIF()
   * @generated
   */
  void setChoreographieIF(Interface value);

  /**
   * Returns the value of the '<em><b>Vorgangsservices Elementar</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorgangsservices Elementar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorgangsservices Elementar</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsservice_VorgangsservicesElementar()
   * @model containment="true"
   * @generated
   */
  EList<VorgangsserviceElementar> getVorgangsservicesElementar();

  /**
   * Returns the value of the '<em><b>Workflow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workflow</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workflow</em>' containment reference.
   * @see #setWorkflow(Workflow)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsservice_Workflow()
   * @model containment="true"
   * @generated
   */
  Workflow getWorkflow();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getWorkflow <em>Workflow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workflow</em>' containment reference.
   * @see #getWorkflow()
   * @generated
   */
  void setWorkflow(Workflow value);

} // Vorgangsservice
