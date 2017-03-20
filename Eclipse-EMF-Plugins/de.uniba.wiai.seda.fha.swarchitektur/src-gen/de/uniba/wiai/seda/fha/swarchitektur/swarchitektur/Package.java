/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getKomponenten <em>Komponenten</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getPakete <em>Pakete</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Komponenten</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Komponenten</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Komponenten</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getPackage_Komponenten()
   * @model containment="true"
   * @generated
   */
  EList<EJB> getKomponenten();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getPackage_Entities()
   * @model containment="true"
   * @generated
   */
  EList<JPAEntity> getEntities();

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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getPackage_Pakete()
   * @model containment="true"
   * @generated
   */
  EList<Package> getPakete();

} // Package
