/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getObjekttyp <em>Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getDatentyp <em>Datentyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject
{
  /**
   * Returns the value of the '<em><b>Objekttyp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttyp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttyp</em>' reference.
   * @see #setObjekttyp(Objekttyp)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAttribut_Objekttyp()
   * @model
   * @generated
   */
  Objekttyp getObjekttyp();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getObjekttyp <em>Objekttyp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objekttyp</em>' reference.
   * @see #getObjekttyp()
   * @generated
   */
  void setObjekttyp(Objekttyp value);

  /**
   * Returns the value of the '<em><b>Datentyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datentyp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datentyp</em>' attribute.
   * @see #setDatentyp(String)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAttribut_Datentyp()
   * @model
   * @generated
   */
  String getDatentyp();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getDatentyp <em>Datentyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datentyp</em>' attribute.
   * @see #getDatentyp()
   * @generated
   */
  void setDatentyp(String value);

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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAttribut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribut
