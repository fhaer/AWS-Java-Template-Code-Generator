/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aufruf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl#getMethode <em>Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AufrufImpl extends MinimalEObjectImpl.Container implements Aufruf
{
  /**
   * The default value of the '{@link #getObjekt() <em>Objekt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekt()
   * @generated
   * @ordered
   */
  protected static final String OBJEKT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjekt() <em>Objekt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekt()
   * @generated
   * @ordered
   */
  protected String objekt = OBJEKT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethode() <em>Methode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethode()
   * @generated
   * @ordered
   */
  protected Methodensignatur methode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AufrufImpl()
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
    return SwarchitekturPackage.Literals.AUFRUF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjekt()
  {
    return objekt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjekt(String newObjekt)
  {
    String oldObjekt = objekt;
    objekt = newObjekt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.AUFRUF__OBJEKT, oldObjekt, objekt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodensignatur getMethode()
  {
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethode(Methodensignatur newMethode, NotificationChain msgs)
  {
    Methodensignatur oldMethode = methode;
    methode = newMethode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.AUFRUF__METHODE, oldMethode, newMethode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethode(Methodensignatur newMethode)
  {
    if (newMethode != methode)
    {
      NotificationChain msgs = null;
      if (methode != null)
        msgs = ((InternalEObject)methode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwarchitekturPackage.AUFRUF__METHODE, null, msgs);
      if (newMethode != null)
        msgs = ((InternalEObject)newMethode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwarchitekturPackage.AUFRUF__METHODE, null, msgs);
      msgs = basicSetMethode(newMethode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.AUFRUF__METHODE, newMethode, newMethode));
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
      case SwarchitekturPackage.AUFRUF__METHODE:
        return basicSetMethode(null, msgs);
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
      case SwarchitekturPackage.AUFRUF__OBJEKT:
        return getObjekt();
      case SwarchitekturPackage.AUFRUF__METHODE:
        return getMethode();
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
      case SwarchitekturPackage.AUFRUF__OBJEKT:
        setObjekt((String)newValue);
        return;
      case SwarchitekturPackage.AUFRUF__METHODE:
        setMethode((Methodensignatur)newValue);
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
      case SwarchitekturPackage.AUFRUF__OBJEKT:
        setObjekt(OBJEKT_EDEFAULT);
        return;
      case SwarchitekturPackage.AUFRUF__METHODE:
        setMethode((Methodensignatur)null);
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
      case SwarchitekturPackage.AUFRUF__OBJEKT:
        return OBJEKT_EDEFAULT == null ? objekt != null : !OBJEKT_EDEFAULT.equals(objekt);
      case SwarchitekturPackage.AUFRUF__METHODE:
        return methode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (objekt: ");
    result.append(objekt);
    result.append(')');
    return result.toString();
  }

} //AufrufImpl
