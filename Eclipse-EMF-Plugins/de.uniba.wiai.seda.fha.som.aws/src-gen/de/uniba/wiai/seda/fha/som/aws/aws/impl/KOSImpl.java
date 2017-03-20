/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws.impl;

import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;
import de.uniba.wiai.seda.fha.som.aws.aws.KOS;
import de.uniba.wiai.seda.fha.som.aws.aws.KOT;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KOS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl#getObjekttypen <em>Objekttypen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl#getGliederung <em>Gliederung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KOSImpl extends SchemaImpl implements KOS
{
  /**
   * The cached value of the '{@link #getObjekttypen() <em>Objekttypen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttypen()
   * @generated
   * @ordered
   */
  protected EList<KOT> objekttypen;

  /**
   * The cached value of the '{@link #getGliederung() <em>Gliederung</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGliederung()
   * @generated
   * @ordered
   */
  protected EList<KOS> gliederung;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KOSImpl()
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
    return AwsPackage.Literals.KOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KOT> getObjekttypen()
  {
    if (objekttypen == null)
    {
      objekttypen = new EObjectContainmentEList<KOT>(KOT.class, this, AwsPackage.KOS__OBJEKTTYPEN);
    }
    return objekttypen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KOS> getGliederung()
  {
    if (gliederung == null)
    {
      gliederung = new EObjectContainmentEList<KOS>(KOS.class, this, AwsPackage.KOS__GLIEDERUNG);
    }
    return gliederung;
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
      case AwsPackage.KOS__OBJEKTTYPEN:
        return ((InternalEList<?>)getObjekttypen()).basicRemove(otherEnd, msgs);
      case AwsPackage.KOS__GLIEDERUNG:
        return ((InternalEList<?>)getGliederung()).basicRemove(otherEnd, msgs);
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
      case AwsPackage.KOS__OBJEKTTYPEN:
        return getObjekttypen();
      case AwsPackage.KOS__GLIEDERUNG:
        return getGliederung();
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
      case AwsPackage.KOS__OBJEKTTYPEN:
        getObjekttypen().clear();
        getObjekttypen().addAll((Collection<? extends KOT>)newValue);
        return;
      case AwsPackage.KOS__GLIEDERUNG:
        getGliederung().clear();
        getGliederung().addAll((Collection<? extends KOS>)newValue);
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
      case AwsPackage.KOS__OBJEKTTYPEN:
        getObjekttypen().clear();
        return;
      case AwsPackage.KOS__GLIEDERUNG:
        getGliederung().clear();
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
      case AwsPackage.KOS__OBJEKTTYPEN:
        return objekttypen != null && !objekttypen.isEmpty();
      case AwsPackage.KOS__GLIEDERUNG:
        return gliederung != null && !gliederung.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KOSImpl
