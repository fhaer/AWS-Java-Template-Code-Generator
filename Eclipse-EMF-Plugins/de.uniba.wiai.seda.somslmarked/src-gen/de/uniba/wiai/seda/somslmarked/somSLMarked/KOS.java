/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getObjekttypen <em>Objekttypen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getBeziehungen <em>Beziehungen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getGliederung <em>Gliederung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getKOS()
 * @model
 * @generated
 */
public interface KOS extends Schema
{
  /**
   * Returns the value of the '<em><b>Objekttypen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttypen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttypen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getKOS_Objekttypen()
   * @model containment="true"
   * @generated
   */
  EList<KOT> getObjekttypen();

  /**
   * Returns the value of the '<em><b>Beziehungen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beziehungen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beziehungen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getKOS_Beziehungen()
   * @model containment="true"
   * @generated
   */
  EList<Beziehung> getBeziehungen();

  /**
   * Returns the value of the '<em><b>Gliederung</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gliederung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gliederung</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getKOS_Gliederung()
   * @model containment="true"
   * @generated
   */
  EList<KOS> getGliederung();

} // KOS
