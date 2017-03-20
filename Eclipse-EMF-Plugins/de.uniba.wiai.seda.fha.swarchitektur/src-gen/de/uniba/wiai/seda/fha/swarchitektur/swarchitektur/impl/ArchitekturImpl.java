/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

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
 * An implementation of the model object '<em><b>Architektur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl#getPakete <em>Pakete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitekturImpl extends MinimalEObjectImpl.Container implements Architektur
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
   * The cached value of the '{@link #getPakete() <em>Pakete</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPakete()
   * @generated
   * @ordered
   */
  protected EList<de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package> pakete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitekturImpl()
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
    return SwarchitekturPackage.Literals.ARCHITEKTUR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.ARCHITEKTUR__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.ARCHITEKTUR__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package> getPakete()
  {
    if (pakete == null)
    {
      pakete = new EObjectContainmentEList<de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package>(de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, this, SwarchitekturPackage.ARCHITEKTUR__PAKETE);
    }
    return pakete;
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
      case SwarchitekturPackage.ARCHITEKTUR__PAKETE:
        return ((InternalEList<?>)getPakete()).basicRemove(otherEnd, msgs);
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
      case SwarchitekturPackage.ARCHITEKTUR__NAME:
        return getName();
      case SwarchitekturPackage.ARCHITEKTUR__VERSION:
        return getVersion();
      case SwarchitekturPackage.ARCHITEKTUR__PAKETE:
        return getPakete();
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
      case SwarchitekturPackage.ARCHITEKTUR__NAME:
        setName((String)newValue);
        return;
      case SwarchitekturPackage.ARCHITEKTUR__VERSION:
        setVersion((String)newValue);
        return;
      case SwarchitekturPackage.ARCHITEKTUR__PAKETE:
        getPakete().clear();
        getPakete().addAll((Collection<? extends de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package>)newValue);
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
      case SwarchitekturPackage.ARCHITEKTUR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SwarchitekturPackage.ARCHITEKTUR__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case SwarchitekturPackage.ARCHITEKTUR__PAKETE:
        getPakete().clear();
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
      case SwarchitekturPackage.ARCHITEKTUR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SwarchitekturPackage.ARCHITEKTUR__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case SwarchitekturPackage.ARCHITEKTUR__PAKETE:
        return pakete != null && !pakete.isEmpty();
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

} //ArchitekturImpl
