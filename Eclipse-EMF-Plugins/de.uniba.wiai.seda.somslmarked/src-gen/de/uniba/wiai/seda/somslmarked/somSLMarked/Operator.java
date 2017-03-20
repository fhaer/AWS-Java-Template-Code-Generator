/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

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
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getAnweisungen <em>Anweisungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getOperator()
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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getOperator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getOperator_Parameter()
   * @model
   * @generated
   */
  EList<Objekttyp> getParameter();

  /**
   * Returns the value of the '<em><b>Anweisungen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anweisungen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anweisungen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getOperator_Anweisungen()
   * @model containment="true"
   * @generated
   */
  EList<Anweisung> getAnweisungen();

} // Operator
