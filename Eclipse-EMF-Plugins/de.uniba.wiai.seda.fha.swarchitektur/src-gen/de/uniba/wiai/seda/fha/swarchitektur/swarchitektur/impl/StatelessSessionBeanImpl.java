/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateless Session Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatelessSessionBeanImpl#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatelessSessionBeanImpl extends SessionBeanImpl implements StatelessSessionBean
{
  /**
   * The cached value of the '{@link #getMethode() <em>Methode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethode()
   * @generated
   * @ordered
   */
  protected EList<Methode> methode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatelessSessionBeanImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SwarchitekturPackage.Literals.STATELESS_SESSION_BEAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Methode> getMethode()
  {
    if (methode == null)
    {
      methode = new EObjectContainmentEList<Methode>(Methode.class, this, SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE);
    }
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE:
        return ((InternalEList<?>)getMethode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE:
        return getMethode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE:
        getMethode().clear();
        getMethode().addAll((Collection<? extends Methode>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE:
        getMethode().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SwarchitekturPackage.STATELESS_SESSION_BEAN__METHODE:
        return methode != null && !methode.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatelessSessionBeanImpl
