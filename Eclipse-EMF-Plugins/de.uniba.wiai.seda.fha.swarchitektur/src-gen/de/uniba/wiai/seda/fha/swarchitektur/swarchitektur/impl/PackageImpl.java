/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity;
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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl#getKomponenten <em>Komponenten</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl#getPakete <em>Pakete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package
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
   * The cached value of the '{@link #getKomponenten() <em>Komponenten</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKomponenten()
   * @generated
   * @ordered
   */
  protected EList<EJB> komponenten;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<JPAEntity> entities;

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
  protected PackageImpl()
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
    return SwarchitekturPackage.Literals.PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwarchitekturPackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EJB> getKomponenten()
  {
    if (komponenten == null)
    {
      komponenten = new EObjectContainmentEList<EJB>(EJB.class, this, SwarchitekturPackage.PACKAGE__KOMPONENTEN);
    }
    return komponenten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JPAEntity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<JPAEntity>(JPAEntity.class, this, SwarchitekturPackage.PACKAGE__ENTITIES);
    }
    return entities;
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
      pakete = new EObjectContainmentEList<de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package>(de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package.class, this, SwarchitekturPackage.PACKAGE__PAKETE);
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
      case SwarchitekturPackage.PACKAGE__KOMPONENTEN:
        return ((InternalEList<?>)getKomponenten()).basicRemove(otherEnd, msgs);
      case SwarchitekturPackage.PACKAGE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case SwarchitekturPackage.PACKAGE__PAKETE:
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
      case SwarchitekturPackage.PACKAGE__NAME:
        return getName();
      case SwarchitekturPackage.PACKAGE__KOMPONENTEN:
        return getKomponenten();
      case SwarchitekturPackage.PACKAGE__ENTITIES:
        return getEntities();
      case SwarchitekturPackage.PACKAGE__PAKETE:
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
      case SwarchitekturPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case SwarchitekturPackage.PACKAGE__KOMPONENTEN:
        getKomponenten().clear();
        getKomponenten().addAll((Collection<? extends EJB>)newValue);
        return;
      case SwarchitekturPackage.PACKAGE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends JPAEntity>)newValue);
        return;
      case SwarchitekturPackage.PACKAGE__PAKETE:
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
      case SwarchitekturPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SwarchitekturPackage.PACKAGE__KOMPONENTEN:
        getKomponenten().clear();
        return;
      case SwarchitekturPackage.PACKAGE__ENTITIES:
        getEntities().clear();
        return;
      case SwarchitekturPackage.PACKAGE__PAKETE:
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
      case SwarchitekturPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SwarchitekturPackage.PACKAGE__KOMPONENTEN:
        return komponenten != null && !komponenten.isEmpty();
      case SwarchitekturPackage.PACKAGE__ENTITIES:
        return entities != null && !entities.isEmpty();
      case SwarchitekturPackage.PACKAGE__PAKETE:
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
    result.append(')');
    return result.toString();
  }

} //PackageImpl
