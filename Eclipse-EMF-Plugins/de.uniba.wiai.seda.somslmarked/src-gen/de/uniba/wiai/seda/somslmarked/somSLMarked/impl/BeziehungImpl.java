/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked.impl;

import de.uniba.wiai.seda.somsl.annotation.annotation.Annotation;

import de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beziehung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl#getObjekttyp1 <em>Objekttyp1</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl#getKardinalitaet <em>Kardinalitaet</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl#getObjekttyp2 <em>Objekttyp2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeziehungImpl extends MinimalEObjectImpl.Container implements Beziehung
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
   * The cached value of the '{@link #getObjekttyp1() <em>Objekttyp1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttyp1()
   * @generated
   * @ordered
   */
  protected Objekttyp objekttyp1;

  /**
   * The cached value of the '{@link #getKardinalitaet() <em>Kardinalitaet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKardinalitaet()
   * @generated
   * @ordered
   */
  protected Kardinalitaet kardinalitaet;

  /**
   * The cached value of the '{@link #getObjekttyp2() <em>Objekttyp2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttyp2()
   * @generated
   * @ordered
   */
  protected Objekttyp objekttyp2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeziehungImpl()
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
    return SomSLMarkedPackage.Literals.BEZIEHUNG;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.BEZIEHUNG__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.BEZIEHUNG__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp getObjekttyp1()
  {
    if (objekttyp1 != null && objekttyp1.eIsProxy())
    {
      InternalEObject oldObjekttyp1 = (InternalEObject)objekttyp1;
      objekttyp1 = (Objekttyp)eResolveProxy(oldObjekttyp1);
      if (objekttyp1 != oldObjekttyp1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1, oldObjekttyp1, objekttyp1));
      }
    }
    return objekttyp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp basicGetObjekttyp1()
  {
    return objekttyp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjekttyp1(Objekttyp newObjekttyp1)
  {
    Objekttyp oldObjekttyp1 = objekttyp1;
    objekttyp1 = newObjekttyp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1, oldObjekttyp1, objekttyp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet getKardinalitaet()
  {
    return kardinalitaet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKardinalitaet(Kardinalitaet newKardinalitaet, NotificationChain msgs)
  {
    Kardinalitaet oldKardinalitaet = kardinalitaet;
    kardinalitaet = newKardinalitaet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET, oldKardinalitaet, newKardinalitaet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKardinalitaet(Kardinalitaet newKardinalitaet)
  {
    if (newKardinalitaet != kardinalitaet)
    {
      NotificationChain msgs = null;
      if (kardinalitaet != null)
        msgs = ((InternalEObject)kardinalitaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET, null, msgs);
      if (newKardinalitaet != null)
        msgs = ((InternalEObject)newKardinalitaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET, null, msgs);
      msgs = basicSetKardinalitaet(newKardinalitaet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET, newKardinalitaet, newKardinalitaet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp getObjekttyp2()
  {
    if (objekttyp2 != null && objekttyp2.eIsProxy())
    {
      InternalEObject oldObjekttyp2 = (InternalEObject)objekttyp2;
      objekttyp2 = (Objekttyp)eResolveProxy(oldObjekttyp2);
      if (objekttyp2 != oldObjekttyp2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2, oldObjekttyp2, objekttyp2));
      }
    }
    return objekttyp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp basicGetObjekttyp2()
  {
    return objekttyp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjekttyp2(Objekttyp newObjekttyp2)
  {
    Objekttyp oldObjekttyp2 = objekttyp2;
    objekttyp2 = newObjekttyp2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2, oldObjekttyp2, objekttyp2));
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
      case SomSLMarkedPackage.BEZIEHUNG__ANNOTATION:
        return basicSetAnnotation(null, msgs);
      case SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET:
        return basicSetKardinalitaet(null, msgs);
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
      case SomSLMarkedPackage.BEZIEHUNG__ANNOTATION:
        return getAnnotation();
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1:
        if (resolve) return getObjekttyp1();
        return basicGetObjekttyp1();
      case SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET:
        return getKardinalitaet();
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2:
        if (resolve) return getObjekttyp2();
        return basicGetObjekttyp2();
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
      case SomSLMarkedPackage.BEZIEHUNG__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1:
        setObjekttyp1((Objekttyp)newValue);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET:
        setKardinalitaet((Kardinalitaet)newValue);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2:
        setObjekttyp2((Objekttyp)newValue);
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
      case SomSLMarkedPackage.BEZIEHUNG__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1:
        setObjekttyp1((Objekttyp)null);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET:
        setKardinalitaet((Kardinalitaet)null);
        return;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2:
        setObjekttyp2((Objekttyp)null);
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
      case SomSLMarkedPackage.BEZIEHUNG__ANNOTATION:
        return annotation != null;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP1:
        return objekttyp1 != null;
      case SomSLMarkedPackage.BEZIEHUNG__KARDINALITAET:
        return kardinalitaet != null;
      case SomSLMarkedPackage.BEZIEHUNG__OBJEKTTYP2:
        return objekttyp2 != null;
    }
    return super.eIsSet(featureID);
  }

} //BeziehungImpl
