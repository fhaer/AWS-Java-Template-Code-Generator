/**
 */
package de.uniba.wiai.seda.somsl.somSL.impl;

import de.uniba.wiai.seda.somsl.somSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SomSLFactoryImpl extends EFactoryImpl implements SomSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SomSLFactory init()
  {
    try
    {
      SomSLFactory theSomSLFactory = (SomSLFactory)EPackage.Registry.INSTANCE.getEFactory(SomSLPackage.eNS_URI);
      if (theSomSLFactory != null)
      {
        return theSomSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SomSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SomSLPackage.METAMODELL: return createMetamodell();
      case SomSLPackage.OBJEKTTYP: return createObjekttyp();
      case SomSLPackage.ATTRIBUT: return createAttribut();
      case SomSLPackage.OPERATOR: return createOperator();
      case SomSLPackage.ANWEISUNG: return createAnweisung();
      case SomSLPackage.KOT: return createKOT();
      case SomSLPackage.VOT: return createVOT();
      case SomSLPackage.OOT: return createOOT();
      case SomSLPackage.LOT: return createLOT();
      case SomSLPackage.TOT: return createTOT();
      case SomSLPackage.BEZIEHUNG: return createBeziehung();
      case SomSLPackage.INTERACTS_WITH: return createInteracts_with();
      case SomSLPackage.IS_A: return createIs_a();
      case SomSLPackage.IS_PART_OF: return createIs_part_of();
      case SomSLPackage.KARDINALITAET: return createKardinalitaet();
      case SomSLPackage.KARDINALITAET01: return createKardinalitaet01();
      case SomSLPackage.KARDINALITAET0X: return createKardinalitaet0x();
      case SomSLPackage.KARDINALITAET11: return createKardinalitaet11();
      case SomSLPackage.KARDINALITAET1X: return createKardinalitaet1x();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodell createMetamodell()
  {
    MetamodellImpl metamodell = new MetamodellImpl();
    return metamodell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objekttyp createObjekttyp()
  {
    ObjekttypImpl objekttyp = new ObjekttypImpl();
    return objekttyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribut createAttribut()
  {
    AttributImpl attribut = new AttributImpl();
    return attribut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anweisung createAnweisung()
  {
    AnweisungImpl anweisung = new AnweisungImpl();
    return anweisung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KOT createKOT()
  {
    KOTImpl kot = new KOTImpl();
    return kot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VOT createVOT()
  {
    VOTImpl vot = new VOTImpl();
    return vot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OOT createOOT()
  {
    OOTImpl oot = new OOTImpl();
    return oot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LOT createLOT()
  {
    LOTImpl lot = new LOTImpl();
    return lot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOT createTOT()
  {
    TOTImpl tot = new TOTImpl();
    return tot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Beziehung createBeziehung()
  {
    BeziehungImpl beziehung = new BeziehungImpl();
    return beziehung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interacts_with createInteracts_with()
  {
    Interacts_withImpl interacts_with = new Interacts_withImpl();
    return interacts_with;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Is_a createIs_a()
  {
    Is_aImpl is_a = new Is_aImpl();
    return is_a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Is_part_of createIs_part_of()
  {
    Is_part_ofImpl is_part_of = new Is_part_ofImpl();
    return is_part_of;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet createKardinalitaet()
  {
    KardinalitaetImpl kardinalitaet = new KardinalitaetImpl();
    return kardinalitaet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet01 createKardinalitaet01()
  {
    Kardinalitaet01Impl kardinalitaet01 = new Kardinalitaet01Impl();
    return kardinalitaet01;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet0x createKardinalitaet0x()
  {
    Kardinalitaet0xImpl kardinalitaet0x = new Kardinalitaet0xImpl();
    return kardinalitaet0x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet11 createKardinalitaet11()
  {
    Kardinalitaet11Impl kardinalitaet11 = new Kardinalitaet11Impl();
    return kardinalitaet11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kardinalitaet1x createKardinalitaet1x()
  {
    Kardinalitaet1xImpl kardinalitaet1x = new Kardinalitaet1xImpl();
    return kardinalitaet1x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomSLPackage getSomSLPackage()
  {
    return (SomSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SomSLPackage getPackage()
  {
    return SomSLPackage.eINSTANCE;
  }

} //SomSLFactoryImpl
