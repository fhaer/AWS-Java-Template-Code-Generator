/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aw S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getKos <em>Kos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVos <em>Vos</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAwS()
 * @model
 * @generated
 */
public interface AwS extends EObject
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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAwS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getName <em>Name</em>}' attribute.
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
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAwS_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Kos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kos</em>' containment reference.
   * @see #setKos(KOS)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAwS_Kos()
   * @model containment="true"
   * @generated
   */
  KOS getKos();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getKos <em>Kos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kos</em>' containment reference.
   * @see #getKos()
   * @generated
   */
  void setKos(KOS value);

  /**
   * Returns the value of the '<em><b>Vos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vos</em>' containment reference.
   * @see #setVos(VOS)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAwS_Vos()
   * @model containment="true"
   * @generated
   */
  VOS getVos();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVos <em>Vos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vos</em>' containment reference.
   * @see #getVos()
   * @generated
   */
  void setVos(VOS value);

} // AwS
