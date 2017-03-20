/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl#getOrchestrierung <em>Orchestrierung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl#getChoreographie <em>Choreographie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow
{
  /**
   * The cached value of the '{@link #getOrchestrierung() <em>Orchestrierung</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrchestrierung()
   * @generated
   * @ordered
   */
  protected EList<Orchestrierung> orchestrierung;

  /**
   * The cached value of the '{@link #getChoreographie() <em>Choreographie</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoreographie()
   * @generated
   * @ordered
   */
  protected EList<ChoreographieLokal> choreographie;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkflowImpl()
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
    return SoaPackage.Literals.WORKFLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Orchestrierung> getOrchestrierung()
  {
    if (orchestrierung == null)
    {
      orchestrierung = new EObjectContainmentEList<Orchestrierung>(Orchestrierung.class, this, SoaPackage.WORKFLOW__ORCHESTRIERUNG);
    }
    return orchestrierung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChoreographieLokal> getChoreographie()
  {
    if (choreographie == null)
    {
      choreographie = new EObjectContainmentEList<ChoreographieLokal>(ChoreographieLokal.class, this, SoaPackage.WORKFLOW__CHOREOGRAPHIE);
    }
    return choreographie;
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
      case SoaPackage.WORKFLOW__ORCHESTRIERUNG:
        return ((InternalEList<?>)getOrchestrierung()).basicRemove(otherEnd, msgs);
      case SoaPackage.WORKFLOW__CHOREOGRAPHIE:
        return ((InternalEList<?>)getChoreographie()).basicRemove(otherEnd, msgs);
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
      case SoaPackage.WORKFLOW__ORCHESTRIERUNG:
        return getOrchestrierung();
      case SoaPackage.WORKFLOW__CHOREOGRAPHIE:
        return getChoreographie();
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
      case SoaPackage.WORKFLOW__ORCHESTRIERUNG:
        getOrchestrierung().clear();
        getOrchestrierung().addAll((Collection<? extends Orchestrierung>)newValue);
        return;
      case SoaPackage.WORKFLOW__CHOREOGRAPHIE:
        getChoreographie().clear();
        getChoreographie().addAll((Collection<? extends ChoreographieLokal>)newValue);
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
      case SoaPackage.WORKFLOW__ORCHESTRIERUNG:
        getOrchestrierung().clear();
        return;
      case SoaPackage.WORKFLOW__CHOREOGRAPHIE:
        getChoreographie().clear();
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
      case SoaPackage.WORKFLOW__ORCHESTRIERUNG:
        return orchestrierung != null && !orchestrierung.isEmpty();
      case SoaPackage.WORKFLOW__CHOREOGRAPHIE:
        return choreographie != null && !choreographie.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WorkflowImpl
