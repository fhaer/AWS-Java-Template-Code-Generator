/**
 */
package de.uniba.wiai.seda.somsl.somSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getObjekttyp <em>Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getBeziehung <em>Beziehung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getMetamodell()
 * @model
 * @generated
 */
public interface Metamodell extends EObject
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
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getMetamodell_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getName <em>Name</em>}' attribute.
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
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getMetamodell_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Objekttyp</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somsl.somSL.Objekttyp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttyp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttyp</em>' containment reference list.
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getMetamodell_Objekttyp()
   * @model containment="true"
   * @generated
   */
  EList<Objekttyp> getObjekttyp();

  /**
   * Returns the value of the '<em><b>Beziehung</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somsl.somSL.Beziehung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beziehung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beziehung</em>' containment reference list.
   * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage#getMetamodell_Beziehung()
   * @model containment="true"
   * @generated
   */
  EList<Beziehung> getBeziehung();

} // Metamodell
