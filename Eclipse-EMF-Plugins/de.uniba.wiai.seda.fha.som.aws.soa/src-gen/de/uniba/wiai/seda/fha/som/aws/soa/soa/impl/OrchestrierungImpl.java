/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestrierung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl#getBedingung <em>Bedingung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl#getMethode1 <em>Methode1</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl#getMethode2 <em>Methode2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrchestrierungImpl extends MinimalEObjectImpl.Container implements Orchestrierung
{
  /**
   * The cached value of the '{@link #getBedingung() <em>Bedingung</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBedingung()
   * @generated
   * @ordered
   */
  protected Bedingung bedingung;

  /**
   * The cached value of the '{@link #getMethode1() <em>Methode1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethode1()
   * @generated
   * @ordered
   */
  protected ServiceMethode methode1;

  /**
   * The cached value of the '{@link #getMethode2() <em>Methode2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethode2()
   * @generated
   * @ordered
   */
  protected ServiceMethode methode2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrchestrierungImpl()
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
    return SoaPackage.Literals.ORCHESTRIERUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bedingung getBedingung()
  {
    return bedingung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBedingung(Bedingung newBedingung, NotificationChain msgs)
  {
    Bedingung oldBedingung = bedingung;
    bedingung = newBedingung;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.ORCHESTRIERUNG__BEDINGUNG, oldBedingung, newBedingung);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBedingung(Bedingung newBedingung)
  {
    if (newBedingung != bedingung)
    {
      NotificationChain msgs = null;
      if (bedingung != null)
        msgs = ((InternalEObject)bedingung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.ORCHESTRIERUNG__BEDINGUNG, null, msgs);
      if (newBedingung != null)
        msgs = ((InternalEObject)newBedingung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.ORCHESTRIERUNG__BEDINGUNG, null, msgs);
      msgs = basicSetBedingung(newBedingung, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.ORCHESTRIERUNG__BEDINGUNG, newBedingung, newBedingung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethode getMethode1()
  {
    if (methode1 != null && methode1.eIsProxy())
    {
      InternalEObject oldMethode1 = (InternalEObject)methode1;
      methode1 = (ServiceMethode)eResolveProxy(oldMethode1);
      if (methode1 != oldMethode1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaPackage.ORCHESTRIERUNG__METHODE1, oldMethode1, methode1));
      }
    }
    return methode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethode basicGetMethode1()
  {
    return methode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethode1(ServiceMethode newMethode1)
  {
    ServiceMethode oldMethode1 = methode1;
    methode1 = newMethode1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.ORCHESTRIERUNG__METHODE1, oldMethode1, methode1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethode getMethode2()
  {
    if (methode2 != null && methode2.eIsProxy())
    {
      InternalEObject oldMethode2 = (InternalEObject)methode2;
      methode2 = (ServiceMethode)eResolveProxy(oldMethode2);
      if (methode2 != oldMethode2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaPackage.ORCHESTRIERUNG__METHODE2, oldMethode2, methode2));
      }
    }
    return methode2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethode basicGetMethode2()
  {
    return methode2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethode2(ServiceMethode newMethode2)
  {
    ServiceMethode oldMethode2 = methode2;
    methode2 = newMethode2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.ORCHESTRIERUNG__METHODE2, oldMethode2, methode2));
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
      case SoaPackage.ORCHESTRIERUNG__BEDINGUNG:
        return basicSetBedingung(null, msgs);
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
      case SoaPackage.ORCHESTRIERUNG__BEDINGUNG:
        return getBedingung();
      case SoaPackage.ORCHESTRIERUNG__METHODE1:
        if (resolve) return getMethode1();
        return basicGetMethode1();
      case SoaPackage.ORCHESTRIERUNG__METHODE2:
        if (resolve) return getMethode2();
        return basicGetMethode2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SoaPackage.ORCHESTRIERUNG__BEDINGUNG:
        setBedingung((Bedingung)newValue);
        return;
      case SoaPackage.ORCHESTRIERUNG__METHODE1:
        setMethode1((ServiceMethode)newValue);
        return;
      case SoaPackage.ORCHESTRIERUNG__METHODE2:
        setMethode2((ServiceMethode)newValue);
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
      case SoaPackage.ORCHESTRIERUNG__BEDINGUNG:
        setBedingung((Bedingung)null);
        return;
      case SoaPackage.ORCHESTRIERUNG__METHODE1:
        setMethode1((ServiceMethode)null);
        return;
      case SoaPackage.ORCHESTRIERUNG__METHODE2:
        setMethode2((ServiceMethode)null);
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
      case SoaPackage.ORCHESTRIERUNG__BEDINGUNG:
        return bedingung != null;
      case SoaPackage.ORCHESTRIERUNG__METHODE1:
        return methode1 != null;
      case SoaPackage.ORCHESTRIERUNG__METHODE2:
        return methode2 != null;
    }
    return super.eIsSet(featureID);
  }

} //OrchestrierungImpl
