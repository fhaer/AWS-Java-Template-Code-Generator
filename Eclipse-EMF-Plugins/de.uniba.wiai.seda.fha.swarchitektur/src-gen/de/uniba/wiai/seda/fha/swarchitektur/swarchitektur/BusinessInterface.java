/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface#getMethoden <em>Methoden</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getBusinessInterface()
 * @model
 * @generated
 */
public interface BusinessInterface extends EJB
{
  /**
   * Returns the value of the '<em><b>Methoden</b></em>' containment reference list.
   * The list contents are of type {@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methoden</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methoden</em>' containment reference list.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getBusinessInterface_Methoden()
   * @model containment="true"
   * @generated
   */
  EList<Methodensignatur> getMethoden();

} // BusinessInterface
