/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws;

import de.uniba.wiai.seda.fha.annotation.annotation.Annotation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beziehung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp1 <em>Objekttyp1</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getKardinalitaet <em>Kardinalitaet</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp2 <em>Objekttyp2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getBeziehung()
 * @model
 * @generated
 */
public interface Beziehung extends EObject
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
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getBeziehung_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttyp1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttyp1</em>' reference.
   * @see #setObjekttyp1(Objekttyp)
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getBeziehung_Objekttyp1()
   * @model
   * @generated
   */
  Objekttyp getObjekttyp1();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp1 <em>Objekttyp1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objekttyp1</em>' reference.
   * @see #getObjekttyp1()
   * @generated
   */
  void setObjekttyp1(Objekttyp value);

  /**
   * Returns the value of the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kardinalitaet</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kardinalitaet</em>' containment reference.
   * @see #setKardinalitaet(Kardinalitaet)
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getBeziehung_Kardinalitaet()
   * @model containment="true"
   * @generated
   */
  Kardinalitaet getKardinalitaet();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getKardinalitaet <em>Kardinalitaet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kardinalitaet</em>' containment reference.
   * @see #getKardinalitaet()
   * @generated
   */
  void setKardinalitaet(Kardinalitaet value);

  /**
   * Returns the value of the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttyp2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttyp2</em>' reference.
   * @see #setObjekttyp2(Objekttyp)
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage#getBeziehung_Objekttyp2()
   * @model
   * @generated
   */
  Objekttyp getObjekttyp2();

  /**
   * Sets the value of the '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp2 <em>Objekttyp2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objekttyp2</em>' reference.
   * @see #getObjekttyp2()
   * @generated
   */
  void setObjekttyp2(Objekttyp value);

} // Beziehung
