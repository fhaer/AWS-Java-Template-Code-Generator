/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws.impl;

import de.uniba.wiai.seda.fha.annotation.annotation.Annotation;

import de.uniba.wiai.seda.fha.som.aws.aws.Attribut;
import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;
import de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp;
import de.uniba.wiai.seda.fha.som.aws.aws.Operator;

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
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl#getOperatoren <em>Operatoren</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjekttypImpl extends MinimalEObjectImpl.Container implements Objekttyp
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected Annotation annotation;

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
    return AwsPackage.Literals.OBJEKTTYP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation getAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
  {
    Annotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AwsPackage.OBJEKTTYP__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation)
  {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AwsPackage.OBJEKTTYP__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AwsPackage.OBJEKTTYP__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AwsPackage.OBJEKTTYP__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AwsPackage.OBJEKTTYP__NAME, oldName, name));
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
      attribute = new EObjectContainmentEList<Attribut>(Attribut.class, this, AwsPackage.OBJEKTTYP__ATTRIBUTE);
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
      operatoren = new EObjectContainmentEList<Operator>(Operator.class, this, AwsPackage.OBJEKTTYP__OPERATOREN);
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
      case AwsPackage.OBJEKTTYP__ANNOTATION:
        return basicSetAnnotation(null, msgs);
      case AwsPackage.OBJEKTTYP__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case AwsPackage.OBJEKTTYP__OPERATOREN:
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
      case AwsPackage.OBJEKTTYP__ANNOTATION:
        return getAnnotation();
      case AwsPackage.OBJEKTTYP__NAME:
        return getName();
      case AwsPackage.OBJEKTTYP__ATTRIBUTE:
        return getAttribute();
      case AwsPackage.OBJEKTTYP__OPERATOREN:
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
      case AwsPackage.OBJEKTTYP__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case AwsPackage.OBJEKTTYP__NAME:
        setName((String)newValue);
        return;
      case AwsPackage.OBJEKTTYP__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribut>)newValue);
        return;
      case AwsPackage.OBJEKTTYP__OPERATOREN:
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
      case AwsPackage.OBJEKTTYP__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case AwsPackage.OBJEKTTYP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AwsPackage.OBJEKTTYP__ATTRIBUTE:
        getAttribute().clear();
        return;
      case AwsPackage.OBJEKTTYP__OPERATOREN:
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
      case AwsPackage.OBJEKTTYP__ANNOTATION:
        return annotation != null;
      case AwsPackage.OBJEKTTYP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AwsPackage.OBJEKTTYP__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case AwsPackage.OBJEKTTYP__OPERATOREN:
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
