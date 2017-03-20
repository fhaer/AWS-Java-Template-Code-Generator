/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

import de.uniba.wiai.seda.fha.som.aws.aws.VOT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorgangsservice Elementar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getKomponentenObjekttyp <em>Komponenten Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsserviceElementar()
 * @model
 * @generated
 */
public interface VorgangsserviceElementar extends Service
{
  /**
   * Returns the value of the '<em><b>Komponenten Objekttyp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Komponenten Objekttyp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Komponenten Objekttyp</em>' reference.
   * @see #setKomponentenObjekttyp(VOT)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsserviceElementar_KomponentenObjekttyp()
   * @model
   * @generated
   */
  VOT getKomponentenObjekttyp();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getKomponentenObjekttyp <em>Komponenten Objekttyp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Komponenten Objekttyp</em>' reference.
   * @see #getKomponentenObjekttyp()
   * @generated
   */
  void setKomponentenObjekttyp(VOT value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference.
   * @see #setInterface(Interface)
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage#getVorgangsserviceElementar_Interface()
   * @model containment="true"
   * @generated
   */
  Interface getInterface();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getInterface <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' containment reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface value);

} // VorgangsserviceElementar
