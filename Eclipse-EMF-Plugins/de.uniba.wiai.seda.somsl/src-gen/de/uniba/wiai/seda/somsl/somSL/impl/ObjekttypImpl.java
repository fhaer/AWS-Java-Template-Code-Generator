/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Attribut;
import de.uniba.wiai.seda.somsl.somSL.Objekttyp;
import de.uniba.wiai.seda.somsl.somSL.Operator;
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
 * An implementation of the model object '<em><b>Objekttyp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl#getOperatoren <em>Operatoren</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjekttypImpl extends MinimalEObjectImpl.Container implements Objekttyp
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
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribut> attribute;

  /**
   * The cached value of the '{@link #getOperatoren() <em>Operatoren</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatoren()
   * @generated
   * @ordered
   */
  protected EList<Operator> operatoren;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjekttypImpl()
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
    return SomSLPackage.Literals.OBJEKTTYP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.OBJEKTTYP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribut> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribut>(Attribut.class, this, SomSLPackage.OBJEKTTYP__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operator> getOperatoren()
  {
    if (operatoren == null)
    {
      operatoren = new EObjectContainmentEList<Operator>(Operator.class, this, SomSLPackage.OBJEKTTYP__OPERATOREN);
    }
    return operatoren;
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
      case SomSLPackage.OBJEKTTYP__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case SomSLPackage.OBJEKTTYP__OPERATOREN:
        return ((InternalEList<?>)getOperatoren()).basicRemove(otherEnd, msgs);
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
      case SomSLPackage.OBJEKTTYP__NAME:
        return getName();
      case SomSLPackage.OBJEKTTYP__ATTRIBUTE:
        return getAttribute();
      case SomSLPackage.OBJEKTTYP__OPERATOREN:
        return getOperatoren();
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
      case SomSLPackage.OBJEKTTYP__NAME:
        setName((String)newValue);
        return;
      case SomSLPackage.OBJEKTTYP__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribut>)newValue);
        return;
      case SomSLPackage.OBJEKTTYP__OPERATOREN:
        getOperatoren().clear();
        getOperatoren().addAll((Collection<? extends Operator>)newValue);
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
      case SomSLPackage.OBJEKTTYP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SomSLPackage.OBJEKTTYP__ATTRIBUTE:
        getAttribute().clear();
        return;
      case SomSLPackage.OBJEKTTYP__OPERATOREN:
        getOperatoren().clear();
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
      case SomSLPackage.OBJEKTTYP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SomSLPackage.OBJEKTTYP__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case SomSLPackage.OBJEKTTYP__OPERATOREN:
        return operatoren != null && !operatoren.isEmpty();
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

} //ObjekttypImpl
