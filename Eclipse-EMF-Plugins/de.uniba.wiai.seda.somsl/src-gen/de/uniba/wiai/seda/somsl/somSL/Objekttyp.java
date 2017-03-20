/**
 */
package de.uniba.wiai.seda.somsl.somSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objekttyp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getOperatoren <em>Operatoren</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getObjekttyp()
 * @model
 * @generated
 */
public interface Objekttyp extends EObject
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
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getObjekttyp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somsl.somSL.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getObjekttyp_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttribute();

  /**
   * Returns the value of the '<em><b>Operatoren</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somsl.somSL.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operatoren</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operatoren</em>' containment reference list.
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getObjekttyp_Operatoren()
   * @model containment="true"
   * @generated
   */
  EList<Operator> getOperatoren();

} // Objekttyp
