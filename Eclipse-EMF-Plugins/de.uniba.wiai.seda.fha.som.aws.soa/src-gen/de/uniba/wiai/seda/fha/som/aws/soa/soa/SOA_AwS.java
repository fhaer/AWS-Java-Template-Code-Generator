/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import de.uniba.wiai.seda.fha.som.aws.aws.KOS;
import de.uniba.wiai.seda.fha.som.aws.aws.VOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOA Aw S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVos <em>Vos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getKos <em>Kos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVorgangsservices <em>Vorgangsservices</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getEntityservices <em>Entityservices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS()
 * @model
 * @generated
 */
public interface SOA_AwS extends EObject
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
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getName <em>Name</em>}' attribute.
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
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

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
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Vos()
   * @model containment="true"
   * @generated
   */
  VOS getVos();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVos <em>Vos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vos</em>' containment reference.
   * @see #getVos()
   * @generated
   */
  void setVos(VOS value);

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
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Kos()
   * @model containment="true"
   * @generated
   */
  KOS getKos();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getKos <em>Kos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kos</em>' containment reference.
   * @see #getKos()
   * @generated
   */
  void setKos(KOS value);

  /**
   * Returns the value of the '<em><b>Vorgangsservices</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorgangsservices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorgangsservices</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Vorgangsservices()
   * @model containment="true"
   * @generated
   */
  EList<Vorgangsservice> getVorgangsservices();

  /**
   * Returns the value of the '<em><b>Entityservices</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entityservices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entityservices</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getSOA_AwS_Entityservices()
   * @model containment="true"
   * @generated
   */
  EList<Entityservice> getEntityservices();

} // SOA_AwS
