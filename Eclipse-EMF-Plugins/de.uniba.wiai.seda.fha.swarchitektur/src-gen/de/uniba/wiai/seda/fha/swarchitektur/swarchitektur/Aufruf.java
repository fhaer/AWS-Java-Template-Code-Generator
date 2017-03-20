/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufruf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getAufruf()
 * @model
 * @generated
 */
public interface Aufruf extends EObject
{
  /**
   * Returns the value of the '<em><b>Objekt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekt</em>' attribute.
   * @see #setObjekt(String)
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getAufruf_Objekt()
   * @model
   * @generated
   */
  String getObjekt();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getObjekt <em>Objekt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objekt</em>' attribute.
   * @see #getObjekt()
   * @generated
   */
  void setObjekt(String value);

  /**
   * Returns the value of the '<em><b>Methode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode</em>' containment reference.
   * @see #setMethode(Methodensignatur)
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getAufruf_Methode()
   * @model containment="true"
   * @generated
   */
  Methodensignatur getMethode();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getMethode <em>Methode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methode</em>' containment reference.
   * @see #getMethode()
   * @generated
   */
  void setMethode(Methodensignatur value);

} // Aufruf
