/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anweisung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getKontrollstruktur <em>Kontrollstruktur</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedingung <em>Bedingung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedigteAnweisungen <em>Bedigte Anweisungen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung()
 * @model
 * @generated
 */
public interface Anweisung extends EObject
{
  /**
   * Returns the value of the '<em><b>Kontrollstruktur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kontrollstruktur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kontrollstruktur</em>' attribute.
   * @see #setKontrollstruktur(String)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung_Kontrollstruktur()
   * @model
   * @generated
   */
  String getKontrollstruktur();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getKontrollstruktur <em>Kontrollstruktur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kontrollstruktur</em>' attribute.
   * @see #getKontrollstruktur()
   * @generated
   */
  void setKontrollstruktur(String value);

  /**
   * Returns the value of the '<em><b>Bedingung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bedingung</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bedingung</em>' containment reference.
   * @see #setBedingung(Anweisung)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung_Bedingung()
   * @model containment="true"
   * @generated
   */
  Anweisung getBedingung();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedingung <em>Bedingung</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bedingung</em>' containment reference.
   * @see #getBedingung()
   * @generated
   */
  void setBedingung(Anweisung value);

  /**
   * Returns the value of the '<em><b>Bedigte Anweisungen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bedigte Anweisungen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bedigte Anweisungen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung_BedigteAnweisungen()
   * @model containment="true"
   * @generated
   */
  EList<Anweisung> getBedigteAnweisungen();

  /**
   * Returns the value of the '<em><b>Objekt</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekt</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekt</em>' reference.
   * @see #setObjekt(Objekttyp)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung_Objekt()
   * @model
   * @generated
   */
  Objekttyp getObjekt();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getObjekt <em>Objekt</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objekt</em>' reference.
   * @see #getObjekt()
   * @generated
   */
  void setObjekt(Objekttyp value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getAnweisung_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

} // Anweisung
