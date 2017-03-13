/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getOperator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getOperator_Parameter()
   * @model
   * @generated
   */
  EList<Objekttyp> getParameter();

} // Operator
