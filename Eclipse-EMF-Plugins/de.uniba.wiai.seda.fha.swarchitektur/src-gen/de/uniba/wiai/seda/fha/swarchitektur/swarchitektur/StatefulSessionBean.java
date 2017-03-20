/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Session Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getStatefulSessionBean()
 * @model
 * @generated
 */
public interface StatefulSessionBean extends SessionBean
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getStatefulSessionBean_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttribute();

  /**
   * Returns the value of the '<em><b>Methode</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methode</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getStatefulSessionBean_Methode()
   * @model containment="true"
   * @generated
   */
  EList<Methode> getMethode();

} // StatefulSessionBean
