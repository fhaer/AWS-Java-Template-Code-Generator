/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vorgangsservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl#getChoreographieIF <em>Choreographie IF</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl#getVorgangsservicesElementar <em>Vorgangsservices Elementar</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VorgangsserviceImpl extends ServiceImpl implements Vorgangsservice
{
  /**
   * The cached value of the '{@link #getChoreographieIF() <em>Choreographie IF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoreographieIF()
   * @generated
   * @ordered
   */
  protected Interface choreographieIF;

  /**
   * The cached value of the '{@link #getVorgangsservicesElementar() <em>Vorgangsservices Elementar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorgangsservicesElementar()
   * @generated
   * @ordered
   */
  protected EList<VorgangsserviceElementar> vorgangsservicesElementar;

  /**
   * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkflow()
   * @generated
   * @ordered
   */
  protected Workflow workflow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VorgangsserviceImpl()
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
    return SoaPackage.Literals.VORGANGSSERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getChoreographieIF()
  {
    return choreographieIF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoreographieIF(Interface newChoreographieIF, NotificationChain msgs)
  {
    Interface oldChoreographieIF = choreographieIF;
    choreographieIF = newChoreographieIF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF, oldChoreographieIF, newChoreographieIF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoreographieIF(Interface newChoreographieIF)
  {
    if (newChoreographieIF != choreographieIF)
    {
      NotificationChain msgs = null;
      if (choreographieIF != null)
        msgs = ((InternalEObject)choreographieIF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF, null, msgs);
      if (newChoreographieIF != null)
        msgs = ((InternalEObject)newChoreographieIF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF, null, msgs);
      msgs = basicSetChoreographieIF(newChoreographieIF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF, newChoreographieIF, newChoreographieIF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VorgangsserviceElementar> getVorgangsservicesElementar()
  {
    if (vorgangsservicesElementar == null)
    {
      vorgangsservicesElementar = new EObjectContainmentEList<VorgangsserviceElementar>(VorgangsserviceElementar.class, this, SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR);
    }
    return vorgangsservicesElementar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workflow getWorkflow()
  {
    return workflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkflow(Workflow newWorkflow, NotificationChain msgs)
  {
    Workflow oldWorkflow = workflow;
    workflow = newWorkflow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE__WORKFLOW, oldWorkflow, newWorkflow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkflow(Workflow newWorkflow)
  {
    if (newWorkflow != workflow)
    {
      NotificationChain msgs = null;
      if (workflow != null)
        msgs = ((InternalEObject)workflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE__WORKFLOW, null, msgs);
      if (newWorkflow != null)
        msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE__WORKFLOW, null, msgs);
      msgs = basicSetWorkflow(newWorkflow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE__WORKFLOW, newWorkflow, newWorkflow));
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
      case SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF:
        return basicSetChoreographieIF(null, msgs);
      case SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR:
        return ((InternalEList<?>)getVorgangsservicesElementar()).basicRemove(otherEnd, msgs);
      case SoaPackage.VORGANGSSERVICE__WORKFLOW:
        return basicSetWorkflow(null, msgs);
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
      case SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF:
        return getChoreographieIF();
      case SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR:
        return getVorgangsservicesElementar();
      case SoaPackage.VORGANGSSERVICE__WORKFLOW:
        return getWorkflow();
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
      case SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF:
        setChoreographieIF((Interface)newValue);
        return;
      case SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR:
        getVorgangsservicesElementar().clear();
        getVorgangsservicesElementar().addAll((Collection<? extends VorgangsserviceElementar>)newValue);
        return;
      case SoaPackage.VORGANGSSERVICE__WORKFLOW:
        setWorkflow((Workflow)newValue);
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
      case SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF:
        setChoreographieIF((Interface)null);
        return;
      case SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR:
        getVorgangsservicesElementar().clear();
        return;
      case SoaPackage.VORGANGSSERVICE__WORKFLOW:
        setWorkflow((Workflow)null);
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
      case SoaPackage.VORGANGSSERVICE__CHOREOGRAPHIE_IF:
        return choreographieIF != null;
      case SoaPackage.VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR:
        return vorgangsservicesElementar != null && !vorgangsservicesElementar.isEmpty();
      case SoaPackage.VORGANGSSERVICE__WORKFLOW:
        return workflow != null;
    }
    return super.eIsSet(featureID);
  }

} //VorgangsserviceImpl
