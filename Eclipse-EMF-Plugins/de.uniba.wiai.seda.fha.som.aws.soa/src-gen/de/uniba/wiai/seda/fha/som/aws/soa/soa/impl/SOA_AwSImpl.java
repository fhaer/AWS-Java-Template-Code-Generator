/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.aws.KOS;
import de.uniba.wiai.seda.fha.som.aws.aws.VOS;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOA Aw S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getVos <em>Vos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getKos <em>Kos</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getVorgangsservices <em>Vorgangsservices</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl#getEntityservices <em>Entityservices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOA_AwSImpl extends MinimalEObjectImpl.Container implements SOA_AwS
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
   * The cached value of the '{@link #getVos() <em>Vos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVos()
   * @generated
   * @ordered
   */
  protected VOS vos;

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
   * The cached value of the '{@link #getVorgangsservices() <em>Vorgangsservices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorgangsservices()
   * @generated
   * @ordered
   */
  protected EList<Vorgangsservice> vorgangsservices;

  /**
   * The cached value of the '{@link #getEntityservices() <em>Entityservices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityservices()
   * @generated
   * @ordered
   */
  protected EList<Entityservice> entityservices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SOA_AwSImpl()
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
    return SoaPackage.Literals.SOA_AW_S;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__VERSION, oldVersion, version));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__VOS, oldVos, newVos);
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
        msgs = ((InternalEObject)vos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.SOA_AW_S__VOS, null, msgs);
      if (newVos != null)
        msgs = ((InternalEObject)newVos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.SOA_AW_S__VOS, null, msgs);
      msgs = basicSetVos(newVos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__VOS, newVos, newVos));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__KOS, oldKos, newKos);
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
        msgs = ((InternalEObject)kos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoaPackage.SOA_AW_S__KOS, null, msgs);
      if (newKos != null)
        msgs = ((InternalEObject)newKos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoaPackage.SOA_AW_S__KOS, null, msgs);
      msgs = basicSetKos(newKos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.SOA_AW_S__KOS, newKos, newKos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Vorgangsservice> getVorgangsservices()
  {
    if (vorgangsservices == null)
    {
      vorgangsservices = new EObjectContainmentEList<Vorgangsservice>(Vorgangsservice.class, this, SoaPackage.SOA_AW_S__VORGANGSSERVICES);
    }
    return vorgangsservices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entityservice> getEntityservices()
  {
    if (entityservices == null)
    {
      entityservices = new EObjectContainmentEList<Entityservice>(Entityservice.class, this, SoaPackage.SOA_AW_S__ENTITYSERVICES);
    }
    return entityservices;
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
      case SoaPackage.SOA_AW_S__VOS:
        return basicSetVos(null, msgs);
      case SoaPackage.SOA_AW_S__KOS:
        return basicSetKos(null, msgs);
      case SoaPackage.SOA_AW_S__VORGANGSSERVICES:
        return ((InternalEList<?>)getVorgangsservices()).basicRemove(otherEnd, msgs);
      case SoaPackage.SOA_AW_S__ENTITYSERVICES:
        return ((InternalEList<?>)getEntityservices()).basicRemove(otherEnd, msgs);
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
      case SoaPackage.SOA_AW_S__NAME:
        return getName();
      case SoaPackage.SOA_AW_S__VERSION:
        return getVersion();
      case SoaPackage.SOA_AW_S__VOS:
        return getVos();
      case SoaPackage.SOA_AW_S__KOS:
        return getKos();
      case SoaPackage.SOA_AW_S__VORGANGSSERVICES:
        return getVorgangsservices();
      case SoaPackage.SOA_AW_S__ENTITYSERVICES:
        return getEntityservices();
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
      case SoaPackage.SOA_AW_S__NAME:
        setName((String)newValue);
        return;
      case SoaPackage.SOA_AW_S__VERSION:
        setVersion((String)newValue);
        return;
      case SoaPackage.SOA_AW_S__VOS:
        setVos((VOS)newValue);
        return;
      case SoaPackage.SOA_AW_S__KOS:
        setKos((KOS)newValue);
        return;
      case SoaPackage.SOA_AW_S__VORGANGSSERVICES:
        getVorgangsservices().clear();
        getVorgangsservices().addAll((Collection<? extends Vorgangsservice>)newValue);
        return;
      case SoaPackage.SOA_AW_S__ENTITYSERVICES:
        getEntityservices().clear();
        getEntityservices().addAll((Collection<? extends Entityservice>)newValue);
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
      case SoaPackage.SOA_AW_S__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoaPackage.SOA_AW_S__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case SoaPackage.SOA_AW_S__VOS:
        setVos((VOS)null);
        return;
      case SoaPackage.SOA_AW_S__KOS:
        setKos((KOS)null);
        return;
      case SoaPackage.SOA_AW_S__VORGANGSSERVICES:
        getVorgangsservices().clear();
        return;
      case SoaPackage.SOA_AW_S__ENTITYSERVICES:
        getEntityservices().clear();
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
      case SoaPackage.SOA_AW_S__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoaPackage.SOA_AW_S__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case SoaPackage.SOA_AW_S__VOS:
        return vos != null;
      case SoaPackage.SOA_AW_S__KOS:
        return kos != null;
      case SoaPackage.SOA_AW_S__VORGANGSSERVICES:
        return vorgangsservices != null && !vorgangsservices.isEmpty();
      case SoaPackage.SOA_AW_S__ENTITYSERVICES:
        return entityservices != null && !entityservices.isEmpty();
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

} //SOA_AwSImpl
