/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPA Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getJPAEntity()
 * @model
 * @generated
 */
public interface JPAEntity extends EObject
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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getJPAEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getJPAEntity_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttribute();

  /**
   * Returns the value of the '<em><b>Methode</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getJPAEntity_Methode()
   * @model containment="true"
   * @generated
   */
  EList<Methode> getMethode();

} // JPAEntity
