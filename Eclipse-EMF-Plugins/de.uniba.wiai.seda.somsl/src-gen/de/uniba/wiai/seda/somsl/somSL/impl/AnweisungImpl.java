/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.Anweisung;
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
 * An implementation of the model object '<em><b>Anweisung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl#getKontrollstruktur <em>Kontrollstruktur</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl#getBedingung <em>Bedingung</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl#getBedigteAnweisungen <em>Bedigte Anweisungen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnweisungImpl extends MinimalEObjectImpl.Container implements Anweisung
{
  /**
   * The default value of the '{@link #getKontrollstruktur() <em>Kontrollstruktur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKontrollstruktur()
   * @generated
   * @ordered
   */
  protected static final String KONTROLLSTRUKTUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKontrollstruktur() <em>Kontrollstruktur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKontrollstruktur()
   * @generated
   * @ordered
   */
  protected String kontrollstruktur = KONTROLLSTRUKTUR_EDEFAULT;

  /**
   * The cached value of the '{@link #getBedingung() <em>Bedingung</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBedingung()
   * @generated
   * @ordered
   */
  protected Anweisung bedingung;

  /**
   * The cached value of the '{@link #getBedigteAnweisungen() <em>Bedigte Anweisungen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBedigteAnweisungen()
   * @generated
   * @ordered
   */
  protected EList<Anweisung> bedigteAnweisungen;

  /**
   * The cached value of the '{@link #getObjekt() <em>Objekt</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekt()
   * @generated
   * @ordered
   */
  protected Objekttyp objekt;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnweisungImpl()
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
    return SomSLPackage.Literals.ANWEISUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKontrollstruktur()
  {
    return kontrollstruktur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKontrollstruktur(String newKontrollstruktur)
  {
    String oldKontrollstruktur = kontrollstruktur;
    kontrollstruktur = newKontrollstruktur;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ANWEISUNG__KONTROLLSTRUKTUR, oldKontrollstruktur, kontrollstruktur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anweisung getBedingung()
  {
    return bedingung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBedingung(Anweisung newBedingung, NotificationChain msgs)
  {
    Anweisung oldBedingung = bedingung;
    bedingung = newBedingung;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SomSLPackage.ANWEISUNG__BEDINGUNG, oldBedingung, newBedingung);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBedingung(Anweisung newBedingung)
  {
    if (newBedingung != bedingung)
    {
      NotificationChain msgs = null;
      if (bedingung != null)
        msgs = ((InternalEObject)bedingung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SomSLPackage.ANWEISUNG__BEDINGUNG, null, msgs);
      if (newBedingung != null)
        msgs = ((InternalEObject)newBedingung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SomSLPackage.ANWEISUNG__BEDINGUNG, null, msgs);
      msgs = basicSetBedingung(newBedingung, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ANWEISUNG__BEDINGUNG, newBedingung, newBedingung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Anweisung> getBedigteAnweisungen()
  {
    if (bedigteAnweisungen == null)
    {
      bedigteAnweisungen = new EObjectContainmentEList<Anweisung>(Anweisung.class, this, SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN);
    }
    return bedigteAnweisungen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp getObjekt()
  {
    if (objekt != null && objekt.eIsProxy())
    {
      InternalEObject oldObjekt = (InternalEObject)objekt;
      objekt = (Objekttyp)eResolveProxy(oldObjekt);
      if (objekt != oldObjekt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SomSLPackage.ANWEISUNG__OBJEKT, oldObjekt, objekt));
      }
    }
    return objekt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp basicGetObjekt()
  {
    return objekt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjekt(Objekttyp newObjekt)
  {
    Objekttyp oldObjekt = objekt;
    objekt = newObjekt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ANWEISUNG__OBJEKT, oldObjekt, objekt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SomSLPackage.ANWEISUNG__OPERATOR, oldOperator, operator));
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
      case SomSLPackage.ANWEISUNG__BEDINGUNG:
        return basicSetBedingung(null, msgs);
      case SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN:
        return ((InternalEList<?>)getBedigteAnweisungen()).basicRemove(otherEnd, msgs);
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
      case SomSLPackage.ANWEISUNG__KONTROLLSTRUKTUR:
        return getKontrollstruktur();
      case SomSLPackage.ANWEISUNG__BEDINGUNG:
        return getBedingung();
      case SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN:
        return getBedigteAnweisungen();
      case SomSLPackage.ANWEISUNG__OBJEKT:
        if (resolve) return getObjekt();
        return basicGetObjekt();
      case SomSLPackage.ANWEISUNG__OPERATOR:
        return getOperator();
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
      case SomSLPackage.ANWEISUNG__KONTROLLSTRUKTUR:
        setKontrollstruktur((String)newValue);
        return;
      case SomSLPackage.ANWEISUNG__BEDINGUNG:
        setBedingung((Anweisung)newValue);
        return;
      case SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN:
        getBedigteAnweisungen().clear();
        getBedigteAnweisungen().addAll((Collection<? extends Anweisung>)newValue);
        return;
      case SomSLPackage.ANWEISUNG__OBJEKT:
        setObjekt((Objekttyp)newValue);
        return;
      case SomSLPackage.ANWEISUNG__OPERATOR:
        setOperator((String)newValue);
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
      case SomSLPackage.ANWEISUNG__KONTROLLSTRUKTUR:
        setKontrollstruktur(KONTROLLSTRUKTUR_EDEFAULT);
        return;
      case SomSLPackage.ANWEISUNG__BEDINGUNG:
        setBedingung((Anweisung)null);
        return;
      case SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN:
        getBedigteAnweisungen().clear();
        return;
      case SomSLPackage.ANWEISUNG__OBJEKT:
        setObjekt((Objekttyp)null);
        return;
      case SomSLPackage.ANWEISUNG__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
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
      case SomSLPackage.ANWEISUNG__KONTROLLSTRUKTUR:
        return KONTROLLSTRUKTUR_EDEFAULT == null ? kontrollstruktur != null : !KONTROLLSTRUKTUR_EDEFAULT.equals(kontrollstruktur);
      case SomSLPackage.ANWEISUNG__BEDINGUNG:
        return bedingung != null;
      case SomSLPackage.ANWEISUNG__BEDIGTE_ANWEISUNGEN:
        return bedigteAnweisungen != null && !bedigteAnweisungen.isEmpty();
      case SomSLPackage.ANWEISUNG__OBJEKT:
        return objekt != null;
      case SomSLPackage.ANWEISUNG__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
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
    result.append(" (kontrollstruktur: ");
    result.append(kontrollstruktur);
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //AnweisungImpl
