/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architektur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getPakete <em>Pakete</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getArchitektur()
 * @model
 * @generated
 */
public interface Architektur extends EObject
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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getArchitektur_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getArchitektur_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Pakete</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pakete</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pakete</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getArchitektur_Pakete()
   * @model containment="true"
   * @generated
   */
  EList<de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package> getPakete();

} // Architektur
