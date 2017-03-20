/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getObjekttypen <em>Objekttypen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getBeziehungen <em>Beziehungen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getGliederung <em>Gliederung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getVOS()
 * @model
 * @generated
 */
public interface VOS extends Schema
{
  /**
   * Returns the value of the '<em><b>Objekttypen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objekttypen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objekttypen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getVOS_Objekttypen()
   * @model containment="true"
   * @generated
   */
  EList<VOT> getObjekttypen();

  /**
   * Returns the value of the '<em><b>Beziehungen</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.Interacts_with}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beziehungen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beziehungen</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getVOS_Beziehungen()
   * @model containment="true"
   * @generated
   */
  EList<Interacts_with> getBeziehungen();

  /**
   * Returns the value of the '<em><b>Gliederung</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gliederung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gliederung</em>' containment reference list.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage#getVOS_Gliederung()
   * @model containment="true"
   * @generated
   */
  EList<VOS> getGliederung();

} // VOS
