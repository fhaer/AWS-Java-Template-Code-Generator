/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws.impl;

import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;
import de.uniba.wiai.seda.fha.som.aws.aws.VOS;
import de.uniba.wiai.seda.fha.som.aws.aws.VOT;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VOS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl#getObjekttypen <em>Objekttypen</em>}</li>
 *   <li>{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl#getGliederung <em>Gliederung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VOSImpl extends SchemaImpl implements VOS
{
  /**
   * The cached value of the '{@link #getObjekttypen() <em>Objekttypen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjekttypen()
   * @generated
   * @ordered
   */
  protected EList<VOT> objekttypen;

  /**
   * The cached value of the '{@link #getGliederung() <em>Gliederung</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGliederung()
   * @generated
   * @ordered
   */
  protected EList<VOS> gliederung;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VOSImpl()
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
    return AwsPackage.Literals.VOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VOT> getObjekttypen()
  {
    if (objekttypen == null)
    {
      objekttypen = new EObjectContainmentEList<VOT>(VOT.class, this, AwsPackage.VOS__OBJEKTTYPEN);
    }
    return objekttypen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VOS> getGliederung()
  {
    if (gliederung == null)
    {
      gliederung = new EObjectContainmentEList<VOS>(VOS.class, this, AwsPackage.VOS__GLIEDERUNG);
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
      case AwsPackage.VOS__OBJEKTTYPEN:
        return ((InternalEList<?>)getObjekttypen()).basicRemove(otherEnd, msgs);
      case AwsPackage.VOS__GLIEDERUNG:
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
      case AwsPackage.VOS__OBJEKTTYPEN:
        return getObjekttypen();
      case AwsPackage.VOS__GLIEDERUNG:
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
      case AwsPackage.VOS__OBJEKTTYPEN:
        getObjekttypen().clear();
        getObjekttypen().addAll((Collection<? extends VOT>)newValue);
        return;
      case AwsPackage.VOS__GLIEDERUNG:
        getGliederung().clear();
        getGliederung().addAll((Collection<? extends VOS>)newValue);
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
      case AwsPackage.VOS__OBJEKTTYPEN:
        getObjekttypen().clear();
        return;
      case AwsPackage.VOS__GLIEDERUNG:
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
      case AwsPackage.VOS__OBJEKTTYPEN:
        return objekttypen != null && !objekttypen.isEmpty();
      case AwsPackage.VOS__GLIEDERUNG:
        return gliederung != null && !gliederung.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VOSImpl
