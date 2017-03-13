/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject
{
  /**
   * Returns the value of the '<em><b>Typ</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typ</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typ</em>' reference.
   * @see #setTyp(Objekttyp)
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getAttribut_Typ()
   * @model
   * @generated
   */
  Objekttyp getTyp();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getTyp <em>Typ</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' reference.
   * @see #getTyp()
   * @generated
   */
  void setTyp(Objekttyp value);

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
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getAttribut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribut
