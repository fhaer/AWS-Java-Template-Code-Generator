/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS#getObjekttypen <em>Objekttypen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS#getGliederung <em>Gliederung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getVOS()
 * @model
 * @generated
 */
public interface VOS extends Schema
{
  /**
   * Returns the value of the '<em><b>Objekttypen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.aws.VOT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttypen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttypen</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getVOS_Objekttypen()
   * @model containment="true"
   * @generated
   */
  EList<VOT> getObjekttypen();

  /**
   * Returns the value of the '<em><b>Gliederung</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.aws.VOS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gliederung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gliederung</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getVOS_Gliederung()
   * @model containment="true"
   * @generated
   */
  EList<VOS> getGliederung();

} // VOS
