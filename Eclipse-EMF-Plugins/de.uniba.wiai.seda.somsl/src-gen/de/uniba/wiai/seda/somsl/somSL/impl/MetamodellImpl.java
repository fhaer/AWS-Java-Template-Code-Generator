/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Beziehung;
import de.uniba.wiai.seda.somsl.somSL.Metamodell;
import de.uniba.wiai.seda.somsl.somSL.Objekttyp;
import de.uniba.wiai.seda.somsl.somSL.SomSLPackage;

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
 * An implementation of the model object '<em><b>Metamodell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl#getObjekttyp <em>Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl#getBeziehung <em>Beziehung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodellImpl extends MinimalEObjectImpl.Container implements Metamodell
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
   * The cached value of the '{@link #getObjekttyp() <em>Objekttyp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttyp()
   * @generated
   * @ordered
   */
  protected EList<Objekttyp> objekttyp;

  /**
   * The cached value of the '{@link #getBeziehung() <em>Beziehung</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeziehung()
   * @generated
   * @ordered
   */
  protected EList<Beziehung> beziehung;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodellImpl()
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
    return SomSLPackage.Literals.METAMODELL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.METAMODELL__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.METAMODELL__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objekttyp> getObjekttyp()
  {
    if (objekttyp == null)
    {
      objekttyp = new EObjectContainmentEList<Objekttyp>(Objekttyp.class, this, SomSLPackage.METAMODELL__OBJEKTTYP);
    }
    return objekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Beziehung> getBeziehung()
  {
    if (beziehung == null)
    {
      beziehung = new EObjectContainmentEList<Beziehung>(Beziehung.class, this, SomSLPackage.METAMODELL__BEZIEHUNG);
    }
    return beziehung;
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
      case SomSLPackage.METAMODELL__OBJEKTTYP:
        return ((InternalEList<?>)getObjekttyp()).basicRemove(otherEnd, msgs);
      case SomSLPackage.METAMODELL__BEZIEHUNG:
        return ((InternalEList<?>)getBeziehung()).basicRemove(otherEnd, msgs);
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
      case SomSLPackage.METAMODELL__NAME:
        return getName();
      case SomSLPackage.METAMODELL__VERSION:
        return getVersion();
      case SomSLPackage.METAMODELL__OBJEKTTYP:
        return getObjekttyp();
      case SomSLPackage.METAMODELL__BEZIEHUNG:
        return getBeziehung();
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
      case SomSLPackage.METAMODELL__NAME:
        setName((String)newValue);
        return;
      case SomSLPackage.METAMODELL__VERSION:
        setVersion((String)newValue);
        return;
      case SomSLPackage.METAMODELL__OBJEKTTYP:
        getObjekttyp().clear();
        getObjekttyp().addAll((Collection<? extends Objekttyp>)newValue);
        return;
      case SomSLPackage.METAMODELL__BEZIEHUNG:
        getBeziehung().clear();
        getBeziehung().addAll((Collection<? extends Beziehung>)newValue);
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
      case SomSLPackage.METAMODELL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SomSLPackage.METAMODELL__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case SomSLPackage.METAMODELL__OBJEKTTYP:
        getObjekttyp().clear();
        return;
      case SomSLPackage.METAMODELL__BEZIEHUNG:
        getBeziehung().clear();
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
      case SomSLPackage.METAMODELL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SomSLPackage.METAMODELL__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case SomSLPackage.METAMODELL__OBJEKTTYP:
        return objekttyp != null && !objekttyp.isEmpty();
      case SomSLPackage.METAMODELL__BEZIEHUNG:
        return beziehung != null && !beziehung.isEmpty();
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

} //MetamodellImpl
