/**
 */
package de.uniba.wiai.seda.somsl.somSL.util;

import de.uniba.wiai.seda.somsl.somSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.somsl.somSL.SomSLPackage
 * @generated
 */
public class SomSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SomSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SomSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SomSLPackage.METAMODELL:
      {
        Metamodell metamodell = (Metamodell)theEObject;
        T result = caseMetamodell(metamodell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.OBJEKTTYP:
      {
        Objekttyp objekttyp = (Objekttyp)theEObject;
        T result = caseObjekttyp(objekttyp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.ATTRIBUT:
      {
        Attribut attribut = (Attribut)theEObject;
        T result = caseAttribut(attribut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.ANWEISUNG:
      {
        Anweisung anweisung = (Anweisung)theEObject;
        T result = caseAnweisung(anweisung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KOT:
      {
        KOT kot = (KOT)theEObject;
        T result = caseKOT(kot);
        if (result == null) result = caseObjekttyp(kot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.VOT:
      {
        VOT vot = (VOT)theEObject;
        T result = caseVOT(vot);
        if (result == null) result = caseObjekttyp(vot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.OOT:
      {
        OOT oot = (OOT)theEObject;
        T result = caseOOT(oot);
        if (result == null) result = caseKOT(oot);
        if (result == null) result = caseObjekttyp(oot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.LOT:
      {
        LOT lot = (LOT)theEObject;
        T result = caseLOT(lot);
        if (result == null) result = caseKOT(lot);
        if (result == null) result = caseObjekttyp(lot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.TOT:
      {
        TOT tot = (TOT)theEObject;
        T result = caseTOT(tot);
        if (result == null) result = caseKOT(tot);
        if (result == null) result = caseObjekttyp(tot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.BEZIEHUNG:
      {
        Beziehung beziehung = (Beziehung)theEObject;
        T result = caseBeziehung(beziehung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.INTERACTS_WITH:
      {
        Interacts_with interacts_with = (Interacts_with)theEObject;
        T result = caseInteracts_with(interacts_with);
        if (result == null) result = caseBeziehung(interacts_with);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.IS_A:
      {
        Is_a is_a = (Is_a)theEObject;
        T result = caseIs_a(is_a);
        if (result == null) result = caseBeziehung(is_a);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.IS_PART_OF:
      {
        Is_part_of is_part_of = (Is_part_of)theEObject;
        T result = caseIs_part_of(is_part_of);
        if (result == null) result = caseBeziehung(is_part_of);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KARDINALITAET:
      {
        Kardinalitaet kardinalitaet = (Kardinalitaet)theEObject;
        T result = caseKardinalitaet(kardinalitaet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KARDINALITAET01:
      {
        Kardinalitaet01 kardinalitaet01 = (Kardinalitaet01)theEObject;
        T result = caseKardinalitaet01(kardinalitaet01);
        if (result == null) result = caseKardinalitaet(kardinalitaet01);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KARDINALITAET0X:
      {
        Kardinalitaet0x kardinalitaet0x = (Kardinalitaet0x)theEObject;
        T result = caseKardinalitaet0x(kardinalitaet0x);
        if (result == null) result = caseKardinalitaet(kardinalitaet0x);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KARDINALITAET11:
      {
        Kardinalitaet11 kardinalitaet11 = (Kardinalitaet11)theEObject;
        T result = caseKardinalitaet11(kardinalitaet11);
        if (result == null) result = caseKardinalitaet(kardinalitaet11);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SomSLPackage.KARDINALITAET1X:
      {
        Kardinalitaet1x kardinalitaet1x = (Kardinalitaet1x)theEObject;
        T result = caseKardinalitaet1x(kardinalitaet1x);
        if (result == null) result = caseKardinalitaet(kardinalitaet1x);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodell(Metamodell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objekttyp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objekttyp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjekttyp(Objekttyp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribut(Attribut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anweisung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anweisung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnweisung(Anweisung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKOT(KOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVOT(VOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOOT(OOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLOT(LOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TOT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TOT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTOT(TOT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Beziehung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Beziehung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeziehung(Beziehung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interacts with</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interacts with</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteracts_with(Interacts_with object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is a</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is a</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIs_a(Is_a object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is part of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is part of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIs_part_of(Is_part_of object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kardinalitaet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kardinalitaet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKardinalitaet(Kardinalitaet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kardinalitaet01</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kardinalitaet01</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKardinalitaet01(Kardinalitaet01 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kardinalitaet0x</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kardinalitaet0x</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKardinalitaet0x(Kardinalitaet0x object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kardinalitaet11</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kardinalitaet11</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKardinalitaet11(Kardinalitaet11 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kardinalitaet1x</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kardinalitaet1x</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKardinalitaet1x(Kardinalitaet1x object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SomSLSwitch
