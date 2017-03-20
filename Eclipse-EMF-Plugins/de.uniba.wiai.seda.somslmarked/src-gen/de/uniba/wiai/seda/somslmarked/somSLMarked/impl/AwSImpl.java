/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked.impl;

import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.KOS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage;
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aw S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl#getKos <em>Kos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl#getVos <em>Vos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwSImpl extends MinimalEObjectImpl.Container implements AwS
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getKos() <em>Kos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKos()
   * @generated
   * @ordered
   */
  protected KOS kos;

  /**
   * The cached value of the '{@link #getVos() <em>Vos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVos()
   * @generated
   * @ordered
   */
  protected VOS vos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AwSImpl()
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
    return SomSLMarkedPackage.Literals.AW_S;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KOS getKos()
  {
    return kos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKos(KOS newKos, NotificationChain msgs)
  {
    KOS oldKos = kos;
    kos = newKos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__KOS, oldKos, newKos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKos(KOS newKos)
  {
    if (newKos != kos)
    {
      NotificationChain msgs = null;
      if (kos != null)
        msgs = ((InternalEObject)kos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.AW_S__KOS, null, msgs);
      if (newKos != null)
        msgs = ((InternalEObject)newKos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.AW_S__KOS, null, msgs);
      msgs = basicSetKos(newKos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__KOS, newKos, newKos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VOS getVos()
  {
    return vos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVos(VOS newVos, NotificationChain msgs)
  {
    VOS oldVos = vos;
    vos = newVos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__VOS, oldVos, newVos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVos(VOS newVos)
  {
    if (newVos != vos)
    {
      NotificationChain msgs = null;
      if (vos != null)
        msgs = ((InternalEObject)vos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.AW_S__VOS, null, msgs);
      if (newVos != null)
        msgs = ((InternalEObject)newVos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.AW_S__VOS, null, msgs);
      msgs = basicSetVos(newVos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.AW_S__VOS, newVos, newVos));
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
      case SomSLMarkedPackage.AW_S__KOS:
        return basicSetKos(null, msgs);
      case SomSLMarkedPackage.AW_S__VOS:
        return basicSetVos(null, msgs);
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
      case SomSLMarkedPackage.AW_S__NAME:
        return getName();
      case SomSLMarkedPackage.AW_S__VERSION:
        return getVersion();
      case SomSLMarkedPackage.AW_S__KOS:
        return getKos();
      case SomSLMarkedPackage.AW_S__VOS:
        return getVos();
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
      case SomSLMarkedPackage.AW_S__NAME:
        setName((String)newValue);
        return;
      case SomSLMarkedPackage.AW_S__VERSION:
        setVersion((String)newValue);
        return;
      case SomSLMarkedPackage.AW_S__KOS:
        setKos((KOS)newValue);
        return;
      case SomSLMarkedPackage.AW_S__VOS:
        setVos((VOS)newValue);
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
      case SomSLMarkedPackage.AW_S__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SomSLMarkedPackage.AW_S__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case SomSLMarkedPackage.AW_S__KOS:
        setKos((KOS)null);
        return;
      case SomSLMarkedPackage.AW_S__VOS:
        setVos((VOS)null);
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
      case SomSLMarkedPackage.AW_S__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SomSLMarkedPackage.AW_S__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case SomSLMarkedPackage.AW_S__KOS:
        return kos != null;
      case SomSLMarkedPackage.AW_S__VOS:
        return vos != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //AwSImpl
