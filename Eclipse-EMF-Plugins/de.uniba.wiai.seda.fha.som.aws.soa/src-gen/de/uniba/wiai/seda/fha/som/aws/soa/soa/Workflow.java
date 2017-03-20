/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getOrchestrierung <em>Orchestrierung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getChoreographie <em>Choreographie</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject
{
  /**
   * Returns the value of the '<em><b>Orchestrierung</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orchestrierung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orchestrierung</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getWorkflow_Orchestrierung()
   * @model containment="true"
   * @generated
   */
  EList<Orchestrierung> getOrchestrierung();

  /**
   * Returns the value of the '<em><b>Choreographie</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreographie</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreographie</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getWorkflow_Choreographie()
   * @model containment="true"
   * @generated
   */
  EList<ChoreographieLokal> getChoreographie();

} // Workflow
