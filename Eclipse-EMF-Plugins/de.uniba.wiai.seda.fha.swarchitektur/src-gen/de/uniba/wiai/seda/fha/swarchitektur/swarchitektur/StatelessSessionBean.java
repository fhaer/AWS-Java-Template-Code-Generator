/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateless Session Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getStatelessSessionBean()
 * @model
 * @generated
 */
public interface StatelessSessionBean extends SessionBean
{
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
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage#getStatelessSessionBean_Methode()
   * @model containment="true"
   * @generated
   */
  EList<Methode> getMethode();

} // StatelessSessionBean
