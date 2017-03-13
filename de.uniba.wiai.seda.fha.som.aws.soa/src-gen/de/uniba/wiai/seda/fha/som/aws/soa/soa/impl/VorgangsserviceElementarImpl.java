/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.aws.VOT;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vorgangsservice Elementar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl#getKomponentenObjekttyp <em>Komponenten Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VorgangsserviceElementarImpl extends ServiceImpl implements VorgangsserviceElementar
{
  /**
   * The cached value of the '{@link #getKomponentenObjekttyp() <em>Komponenten Objekttyp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKomponentenObjekttyp()
   * @generated
   * @ordered
   */
  protected VOT komponentenObjekttyp;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface interface_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VorgangsserviceElementarImpl()
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
    return SoaPackage.Literals.VORGANGSSERVICE_ELEMENTAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VOT getKomponentenObjekttyp()
  {
    if (komponentenObjekttyp != null && komponentenObjekttyp.eIsProxy())
    {
      InternalEObject oldKomponentenObjekttyp = (InternalEObject)komponentenObjekttyp;
      komponentenObjekttyp = (VOT)eResolveProxy(oldKomponentenObjekttyp);
      if (komponentenObjekttyp != oldKomponentenObjekttyp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP, oldKomponentenObjekttyp, komponentenObjekttyp));
      }
    }
    return komponentenObjekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VOT basicGetKomponentenObjekttyp()
  {
    return komponentenObjekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKomponentenObjekttyp(VOT newKomponentenObjekttyp)
  {
    VOT oldKomponentenObjekttyp = komponentenObjekttyp;
    komponentenObjekttyp = newKomponentenObjekttyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP, oldKomponentenObjekttyp, komponentenObjekttyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs)
  {
    Interface oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE, oldInterface, newInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface newInterface)
  {
    if (newInterface != interface_)
    {
      NotificationChain msgs = null;
      if (interface_ != null)
        msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE, null, msgs);
      if (newInterface != null)
        msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE, null, msgs);
      msgs = basicSetInterface(newInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE, newInterface, newInterface));
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
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE:
        return basicSetInterface(null, msgs);
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
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP:
        if (resolve) return getKomponentenObjekttyp();
        return basicGetKomponentenObjekttyp();
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE:
        return getInterface();
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
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP:
        setKomponentenObjekttyp((VOT)newValue);
        return;
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE:
        setInterface((Interface)newValue);
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
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP:
        setKomponentenObjekttyp((VOT)null);
        return;
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE:
        setInterface((Interface)null);
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
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP:
        return komponentenObjekttyp != null;
      case SoaPackage.VORGANGSSERVICE_ELEMENTAR__INTERFACE:
        return interface_ != null;
    }
    return super.eIsSet(featureID);
  }

} //VorgangsserviceElementarImpl
