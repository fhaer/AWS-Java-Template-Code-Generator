/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Anweisung;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl#getAnweisungen <em>Anweisungen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container implements Operator
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
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Objekttyp> parameter;

  /**
   * The cached value of the '{@link #getAnweisungen() <em>Anweisungen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnweisungen()
   * @generated
   * @ordered
   */
  protected EList<Anweisung> anweisungen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorImpl()
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
    return SomSLPackage.Literals.OPERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.OPERATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objekttyp> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectResolvingEList<Objekttyp>(Objekttyp.class, this, SomSLPackage.OPERATOR__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Anweisung> getAnweisungen()
  {
    if (anweisungen == null)
    {
      anweisungen = new EObjectContainmentEList<Anweisung>(Anweisung.class, this, SomSLPackage.OPERATOR__ANWEISUNGEN);
    }
    return anweisungen;
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
      case SomSLPackage.OPERATOR__ANWEISUNGEN:
        return ((InternalEList<?>)getAnweisungen()).basicRemove(otherEnd, msgs);
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
      case SomSLPackage.OPERATOR__NAME:
        return getName();
      case SomSLPackage.OPERATOR__PARAMETER:
        return getParameter();
      case SomSLPackage.OPERATOR__ANWEISUNGEN:
        return getAnweisungen();
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
      case SomSLPackage.OPERATOR__NAME:
        setName((String)newValue);
        return;
      case SomSLPackage.OPERATOR__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Objekttyp>)newValue);
        return;
      case SomSLPackage.OPERATOR__ANWEISUNGEN:
        getAnweisungen().clear();
        getAnweisungen().addAll((Collection<? extends Anweisung>)newValue);
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
      case SomSLPackage.OPERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SomSLPackage.OPERATOR__PARAMETER:
        getParameter().clear();
        return;
      case SomSLPackage.OPERATOR__ANWEISUNGEN:
        getAnweisungen().clear();
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
      case SomSLPackage.OPERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SomSLPackage.OPERATOR__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case SomSLPackage.OPERATOR__ANWEISUNGEN:
        return anweisungen != null && !anweisungen.isEmpty();
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

} //OperatorImpl
