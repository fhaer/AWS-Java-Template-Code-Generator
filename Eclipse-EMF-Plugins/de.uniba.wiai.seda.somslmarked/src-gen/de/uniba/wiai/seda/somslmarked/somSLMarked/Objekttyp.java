/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import de.uniba.wiai.seda.somsl.annotation.annotation.Annotation;

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
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getOperatoren <em>Operatoren</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getObjekttyp()
 * @model
 * @generated
 */
public interface Objekttyp extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getObjekttyp_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getObjekttyp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getObjekttyp_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttribute();

  /**
   * Returns the value of the '<em><b>Operatoren</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operatoren</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operatoren</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getObjekttyp_Operatoren()
   * @model containment="true"
   * @generated
   */
  EList<Operator> getOperatoren();

} // Objekttyp
