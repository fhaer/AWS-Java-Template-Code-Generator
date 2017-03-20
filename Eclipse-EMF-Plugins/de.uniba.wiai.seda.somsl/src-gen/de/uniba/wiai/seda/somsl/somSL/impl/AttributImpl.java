/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Attribut;
import de.uniba.wiai.seda.somsl.somSL.Objekttyp;
import de.uniba.wiai.seda.somsl.somSL.SomSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl#getObjekttyp <em>Objekttyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl#getDatentyp <em>Datentyp</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut
{
  /**
   * The cached value of the '{@link #getObjekttyp() <em>Objekttyp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttyp()
   * @generated
   * @ordered
   */
  protected Objekttyp objekttyp;

  /**
   * The default value of the '{@link #getDatentyp() <em>Datentyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatentyp()
   * @generated
   * @ordered
   */
  protected static final String DATENTYP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatentyp() <em>Datentyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatentyp()
   * @generated
   * @ordered
   */
  protected String datentyp = DATENTYP_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributImpl()
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
    return SomSLPackage.Literals.ATTRIBUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp getObjekttyp()
  {
    if (objekttyp != null && objekttyp.eIsProxy())
    {
      InternalEObject oldObjekttyp = (InternalEObject)objekttyp;
      objekttyp = (Objekttyp)eResolveProxy(oldObjekttyp);
      if (objekttyp != oldObjekttyp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SomSLPackage.ATTRIBUT__OBJEKTTYP, oldObjekttyp, objekttyp));
      }
    }
    return objekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp basicGetObjekttyp()
  {
    return objekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjekttyp(Objekttyp newObjekttyp)
  {
    Objekttyp oldObjekttyp = objekttyp;
    objekttyp = newObjekttyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ATTRIBUT__OBJEKTTYP, oldObjekttyp, objekttyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatentyp()
  {
    return datentyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatentyp(String newDatentyp)
  {
    String oldDatentyp = datentyp;
    datentyp = newDatentyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ATTRIBUT__DATENTYP, oldDatentyp, datentyp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ATTRIBUT__NAME, oldName, name));
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
      case SomSLPackage.ATTRIBUT__OBJEKTTYP:
        if (resolve) return getObjekttyp();
        return basicGetObjekttyp();
      case SomSLPackage.ATTRIBUT__DATENTYP:
        return getDatentyp();
      case SomSLPackage.ATTRIBUT__NAME:
        return getName();
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
      case SomSLPackage.ATTRIBUT__OBJEKTTYP:
        setObjekttyp((Objekttyp)newValue);
        return;
      case SomSLPackage.ATTRIBUT__DATENTYP:
        setDatentyp((String)newValue);
        return;
      case SomSLPackage.ATTRIBUT__NAME:
        setName((String)newValue);
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
      case SomSLPackage.ATTRIBUT__OBJEKTTYP:
        setObjekttyp((Objekttyp)null);
        return;
      case SomSLPackage.ATTRIBUT__DATENTYP:
        setDatentyp(DATENTYP_EDEFAULT);
        return;
      case SomSLPackage.ATTRIBUT__NAME:
        setName(NAME_EDEFAULT);
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
      case SomSLPackage.ATTRIBUT__OBJEKTTYP:
        return objekttyp != null;
      case SomSLPackage.ATTRIBUT__DATENTYP:
        return DATENTYP_EDEFAULT == null ? datentyp != null : !DATENTYP_EDEFAULT.equals(datentyp);
      case SomSLPackage.ATTRIBUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (datentyp: ");
    result.append(datentyp);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AttributImpl
