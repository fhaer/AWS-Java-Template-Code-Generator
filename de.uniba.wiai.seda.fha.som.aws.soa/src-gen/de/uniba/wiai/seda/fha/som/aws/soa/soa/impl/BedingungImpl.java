/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa.impl;

import de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.BedingungImpl#getBedingung <em>Bedingung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BedingungImpl extends MinimalEObjectImpl.Container implements Bedingung
{
  /**
   * The default value of the '{@link #getBedingung() <em>Bedingung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBedingung()
   * @generated
   * @ordered
   */
  protected static final String BEDINGUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBedingung() <em>Bedingung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBedingung()
   * @generated
   * @ordered
   */
  protected String bedingung = BEDINGUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BedingungImpl()
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
    return SoaPackage.Literals.BEDINGUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBedingung()
  {
    return bedingung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBedingung(String newBedingung)
  {
    String oldBedingung = bedingung;
    bedingung = newBedingung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoaPackage.BEDINGUNG__BEDINGUNG, oldBedingung, bedingung));
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
      case SoaPackage.BEDINGUNG__BEDINGUNG:
        return getBedingung();
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
      case SoaPackage.BEDINGUNG__BEDINGUNG:
        setBedingung((String)newValue);
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
      case SoaPackage.BEDINGUNG__BEDINGUNG:
        setBedingung(BEDINGUNG_EDEFAULT);
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
      case SoaPackage.BEDINGUNG__BEDINGUNG:
        return BEDINGUNG_EDEFAULT == null ? bedingung != null : !BEDINGUNG_EDEFAULT.equals(bedingung);
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
    result.append(" (bedingung: ");
    result.append(bedingung);
    result.append(')');
    return result.toString();
  }

} //BedingungImpl
