/**
 */
package de.uniba.wiai.seda.somsl.somSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uniba.wiai.seda.somsl.somSL.SomSLFactory
 * @model kind="package"
 * @generated
 */
public interface SomSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "somSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/somsl/SomSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "somSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SomSLPackage eINSTANCE = de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl <em>Metamodell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getMetamodell()
   * @generated
   */
  int METAMODELL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODELL__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODELL__VERSION = 1;

  /**
   * The feature id for the '<em><b>Objekttyp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODELL__OBJEKTTYP = 2;

  /**
   * The feature id for the '<em><b>Beziehung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODELL__BEZIEHUNG = 3;

  /**
   * The number of structural features of the '<em>Metamodell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODELL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getObjekttyp()
   * @generated
   */
  int OBJEKTTYP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__OPERATOREN = 2;

  /**
   * The number of structural features of the '<em>Objekttyp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 2;

  /**
   * The feature id for the '<em><b>Objekttyp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__OBJEKTTYP = 0;

  /**
   * The feature id for the '<em><b>Datentyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__DATENTYP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Anweisungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__ANWEISUNGEN = 2;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl <em>Anweisung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getAnweisung()
   * @generated
   */
  int ANWEISUNG = 4;

  /**
   * The feature id for the '<em><b>Kontrollstruktur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG__KONTROLLSTRUKTUR = 0;

  /**
   * The feature id for the '<em><b>Bedingung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG__BEDINGUNG = 1;

  /**
   * The feature id for the '<em><b>Bedigte Anweisungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG__BEDIGTE_ANWEISUNGEN = 2;

  /**
   * The feature id for the '<em><b>Objekt</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG__OBJEKT = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG__OPERATOR = 4;

  /**
   * The number of structural features of the '<em>Anweisung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANWEISUNG_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.KOTImpl <em>KOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.KOTImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKOT()
   * @generated
   */
  int KOT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOT__NAME = OBJEKTTYP__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOT__ATTRIBUTE = OBJEKTTYP__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOT__OPERATOREN = OBJEKTTYP__OPERATOREN;

  /**
   * The number of structural features of the '<em>KOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOT_FEATURE_COUNT = OBJEKTTYP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.VOTImpl <em>VOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.VOTImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getVOT()
   * @generated
   */
  int VOT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOT__NAME = OBJEKTTYP__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOT__ATTRIBUTE = OBJEKTTYP__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOT__OPERATOREN = OBJEKTTYP__OPERATOREN;

  /**
   * The number of structural features of the '<em>VOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOT_FEATURE_COUNT = OBJEKTTYP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.OOTImpl <em>OOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.OOTImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getOOT()
   * @generated
   */
  int OOT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOT__NAME = KOT__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOT__ATTRIBUTE = KOT__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOT__OPERATOREN = KOT__OPERATOREN;

  /**
   * The number of structural features of the '<em>OOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOT_FEATURE_COUNT = KOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.LOTImpl <em>LOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.LOTImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getLOT()
   * @generated
   */
  int LOT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOT__NAME = KOT__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOT__ATTRIBUTE = KOT__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOT__OPERATOREN = KOT__OPERATOREN;

  /**
   * The number of structural features of the '<em>LOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOT_FEATURE_COUNT = KOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.TOTImpl <em>TOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.TOTImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getTOT()
   * @generated
   */
  int TOT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOT__NAME = KOT__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOT__ATTRIBUTE = KOT__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOT__OPERATOREN = KOT__OPERATOREN;

  /**
   * The number of structural features of the '<em>TOT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOT_FEATURE_COUNT = KOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.BeziehungImpl <em>Beziehung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.BeziehungImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getBeziehung()
   * @generated
   */
  int BEZIEHUNG = 10;

  /**
   * The feature id for the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__OBJEKTTYP1 = 0;

  /**
   * The feature id for the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__KARDINALITAET = 1;

  /**
   * The feature id for the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__OBJEKTTYP2 = 2;

  /**
   * The number of structural features of the '<em>Beziehung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Interacts_withImpl <em>Interacts with</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Interacts_withImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getInteracts_with()
   * @generated
   */
  int INTERACTS_WITH = 11;

  /**
   * The feature id for the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTS_WITH__OBJEKTTYP1 = BEZIEHUNG__OBJEKTTYP1;

  /**
   * The feature id for the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTS_WITH__KARDINALITAET = BEZIEHUNG__KARDINALITAET;

  /**
   * The feature id for the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTS_WITH__OBJEKTTYP2 = BEZIEHUNG__OBJEKTTYP2;

  /**
   * The number of structural features of the '<em>Interacts with</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTS_WITH_FEATURE_COUNT = BEZIEHUNG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Is_aImpl <em>Is a</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Is_aImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getIs_a()
   * @generated
   */
  int IS_A = 12;

  /**
   * The feature id for the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_A__OBJEKTTYP1 = BEZIEHUNG__OBJEKTTYP1;

  /**
   * The feature id for the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_A__KARDINALITAET = BEZIEHUNG__KARDINALITAET;

  /**
   * The feature id for the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_A__OBJEKTTYP2 = BEZIEHUNG__OBJEKTTYP2;

  /**
   * The number of structural features of the '<em>Is a</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_A_FEATURE_COUNT = BEZIEHUNG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Is_part_ofImpl <em>Is part of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Is_part_ofImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getIs_part_of()
   * @generated
   */
  int IS_PART_OF = 13;

  /**
   * The feature id for the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PART_OF__OBJEKTTYP1 = BEZIEHUNG__OBJEKTTYP1;

  /**
   * The feature id for the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PART_OF__KARDINALITAET = BEZIEHUNG__KARDINALITAET;

  /**
   * The feature id for the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PART_OF__OBJEKTTYP2 = BEZIEHUNG__OBJEKTTYP2;

  /**
   * The number of structural features of the '<em>Is part of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PART_OF_FEATURE_COUNT = BEZIEHUNG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.KardinalitaetImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet()
   * @generated
   */
  int KARDINALITAET = 14;

  /**
   * The number of structural features of the '<em>Kardinalitaet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet01Impl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet01()
   * @generated
   */
  int KARDINALITAET01 = 15;

  /**
   * The number of structural features of the '<em>Kardinalitaet01</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET01_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet0xImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet0x()
   * @generated
   */
  int KARDINALITAET0X = 16;

  /**
   * The number of structural features of the '<em>Kardinalitaet0x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET0X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet11Impl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet11()
   * @generated
   */
  int KARDINALITAET11 = 17;

  /**
   * The number of structural features of the '<em>Kardinalitaet11</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET11_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet1xImpl
   * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet1x()
   * @generated
   */
  int KARDINALITAET1X = 18;

  /**
   * The number of structural features of the '<em>Kardinalitaet1x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET1X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell <em>Metamodell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodell</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Metamodell
   * @generated
   */
  EClass getMetamodell();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Metamodell#getName()
   * @see #getMetamodell()
   * @generated
   */
  EAttribute getMetamodell_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Metamodell#getVersion()
   * @see #getMetamodell()
   * @generated
   */
  EAttribute getMetamodell_Version();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getObjekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Metamodell#getObjekttyp()
   * @see #getMetamodell()
   * @generated
   */
  EReference getMetamodell_Objekttyp();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Metamodell#getBeziehung <em>Beziehung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beziehung</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Metamodell#getBeziehung()
   * @see #getMetamodell()
   * @generated
   */
  EReference getMetamodell_Beziehung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Objekttyp
   * @generated
   */
  EClass getObjekttyp();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Objekttyp#getName()
   * @see #getObjekttyp()
   * @generated
   */
  EAttribute getObjekttyp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Objekttyp#getAttribute()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Objekttyp#getOperatoren <em>Operatoren</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operatoren</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Objekttyp#getOperatoren()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Operatoren();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribut</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Attribut
   * @generated
   */
  EClass getAttribut();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somsl.somSL.Attribut#getObjekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Attribut#getObjekttyp()
   * @see #getAttribut()
   * @generated
   */
  EReference getAttribut_Objekttyp();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Attribut#getDatentyp <em>Datentyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datentyp</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Attribut#getDatentyp()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Datentyp();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Attribut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Attribut#getName()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Operator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Operator#getName()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Name();

  /**
   * Returns the meta object for the reference list '{@link de.uniba.wiai.seda.somsl.somSL.Operator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Operator#getParameter()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Operator#getAnweisungen <em>Anweisungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anweisungen</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Operator#getAnweisungen()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Anweisungen();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung <em>Anweisung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anweisung</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung
   * @generated
   */
  EClass getAnweisung();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung#getKontrollstruktur <em>Kontrollstruktur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kontrollstruktur</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung#getKontrollstruktur()
   * @see #getAnweisung()
   * @generated
   */
  EAttribute getAnweisung_Kontrollstruktur();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung#getBedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung#getBedingung()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_Bedingung();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung#getBedigteAnweisungen <em>Bedigte Anweisungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bedigte Anweisungen</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung#getBedigteAnweisungen()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_BedigteAnweisungen();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung#getObjekt <em>Objekt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekt</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung#getObjekt()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_Objekt();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somsl.somSL.Anweisung#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Anweisung#getOperator()
   * @see #getAnweisung()
   * @generated
   */
  EAttribute getAnweisung_Operator();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.KOT <em>KOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KOT</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.KOT
   * @generated
   */
  EClass getKOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.VOT <em>VOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VOT</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.VOT
   * @generated
   */
  EClass getVOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.OOT <em>OOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OOT</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.OOT
   * @generated
   */
  EClass getOOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.LOT <em>LOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LOT</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.LOT
   * @generated
   */
  EClass getLOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.TOT <em>TOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TOT</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.TOT
   * @generated
   */
  EClass getTOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Beziehung <em>Beziehung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beziehung</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Beziehung
   * @generated
   */
  EClass getBeziehung();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somsl.somSL.Beziehung#getObjekttyp1 <em>Objekttyp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp1</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Beziehung#getObjekttyp1()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp1();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somsl.somSL.Beziehung#getKardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Beziehung#getKardinalitaet()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Kardinalitaet();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somsl.somSL.Beziehung#getObjekttyp2 <em>Objekttyp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp2</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Beziehung#getObjekttyp2()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp2();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Interacts_with <em>Interacts with</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interacts with</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Interacts_with
   * @generated
   */
  EClass getInteracts_with();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Is_a <em>Is a</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is a</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Is_a
   * @generated
   */
  EClass getIs_a();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Is_part_of <em>Is part of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is part of</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Is_part_of
   * @generated
   */
  EClass getIs_part_of();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Kardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Kardinalitaet
   * @generated
   */
  EClass getKardinalitaet();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Kardinalitaet01 <em>Kardinalitaet01</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet01</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Kardinalitaet01
   * @generated
   */
  EClass getKardinalitaet01();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Kardinalitaet0x <em>Kardinalitaet0x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet0x</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Kardinalitaet0x
   * @generated
   */
  EClass getKardinalitaet0x();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Kardinalitaet11 <em>Kardinalitaet11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet11</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Kardinalitaet11
   * @generated
   */
  EClass getKardinalitaet11();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somsl.somSL.Kardinalitaet1x <em>Kardinalitaet1x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet1x</em>'.
   * @see de.uniba.wiai.seda.somsl.somSL.Kardinalitaet1x
   * @generated
   */
  EClass getKardinalitaet1x();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SomSLFactory getSomSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl <em>Metamodell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.MetamodellImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getMetamodell()
     * @generated
     */
    EClass METAMODELL = eINSTANCE.getMetamodell();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODELL__NAME = eINSTANCE.getMetamodell_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODELL__VERSION = eINSTANCE.getMetamodell_Version();

    /**
     * The meta object literal for the '<em><b>Objekttyp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODELL__OBJEKTTYP = eINSTANCE.getMetamodell_Objekttyp();

    /**
     * The meta object literal for the '<em><b>Beziehung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODELL__BEZIEHUNG = eINSTANCE.getMetamodell_Beziehung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.ObjekttypImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getObjekttyp()
     * @generated
     */
    EClass OBJEKTTYP = eINSTANCE.getObjekttyp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJEKTTYP__NAME = eINSTANCE.getObjekttyp_Name();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJEKTTYP__ATTRIBUTE = eINSTANCE.getObjekttyp_Attribute();

    /**
     * The meta object literal for the '<em><b>Operatoren</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJEKTTYP__OPERATOREN = eINSTANCE.getObjekttyp_Operatoren();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl <em>Attribut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.AttributImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getAttribut()
     * @generated
     */
    EClass ATTRIBUT = eINSTANCE.getAttribut();

    /**
     * The meta object literal for the '<em><b>Objekttyp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUT__OBJEKTTYP = eINSTANCE.getAttribut_Objekttyp();

    /**
     * The meta object literal for the '<em><b>Datentyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__DATENTYP = eINSTANCE.getAttribut_Datentyp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.OperatorImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__NAME = eINSTANCE.getOperator_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__PARAMETER = eINSTANCE.getOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Anweisungen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__ANWEISUNGEN = eINSTANCE.getOperator_Anweisungen();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl <em>Anweisung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.AnweisungImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getAnweisung()
     * @generated
     */
    EClass ANWEISUNG = eINSTANCE.getAnweisung();

    /**
     * The meta object literal for the '<em><b>Kontrollstruktur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANWEISUNG__KONTROLLSTRUKTUR = eINSTANCE.getAnweisung_Kontrollstruktur();

    /**
     * The meta object literal for the '<em><b>Bedingung</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANWEISUNG__BEDINGUNG = eINSTANCE.getAnweisung_Bedingung();

    /**
     * The meta object literal for the '<em><b>Bedigte Anweisungen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANWEISUNG__BEDIGTE_ANWEISUNGEN = eINSTANCE.getAnweisung_BedigteAnweisungen();

    /**
     * The meta object literal for the '<em><b>Objekt</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANWEISUNG__OBJEKT = eINSTANCE.getAnweisung_Objekt();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANWEISUNG__OPERATOR = eINSTANCE.getAnweisung_Operator();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.KOTImpl <em>KOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.KOTImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKOT()
     * @generated
     */
    EClass KOT = eINSTANCE.getKOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.VOTImpl <em>VOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.VOTImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getVOT()
     * @generated
     */
    EClass VOT = eINSTANCE.getVOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.OOTImpl <em>OOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.OOTImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getOOT()
     * @generated
     */
    EClass OOT = eINSTANCE.getOOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.LOTImpl <em>LOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.LOTImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getLOT()
     * @generated
     */
    EClass LOT = eINSTANCE.getLOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.TOTImpl <em>TOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.TOTImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getTOT()
     * @generated
     */
    EClass TOT = eINSTANCE.getTOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.BeziehungImpl <em>Beziehung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.BeziehungImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getBeziehung()
     * @generated
     */
    EClass BEZIEHUNG = eINSTANCE.getBeziehung();

    /**
     * The meta object literal for the '<em><b>Objekttyp1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEZIEHUNG__OBJEKTTYP1 = eINSTANCE.getBeziehung_Objekttyp1();

    /**
     * The meta object literal for the '<em><b>Kardinalitaet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEZIEHUNG__KARDINALITAET = eINSTANCE.getBeziehung_Kardinalitaet();

    /**
     * The meta object literal for the '<em><b>Objekttyp2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEZIEHUNG__OBJEKTTYP2 = eINSTANCE.getBeziehung_Objekttyp2();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Interacts_withImpl <em>Interacts with</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Interacts_withImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getInteracts_with()
     * @generated
     */
    EClass INTERACTS_WITH = eINSTANCE.getInteracts_with();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Is_aImpl <em>Is a</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Is_aImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getIs_a()
     * @generated
     */
    EClass IS_A = eINSTANCE.getIs_a();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Is_part_ofImpl <em>Is part of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Is_part_ofImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getIs_part_of()
     * @generated
     */
    EClass IS_PART_OF = eINSTANCE.getIs_part_of();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.KardinalitaetImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet()
     * @generated
     */
    EClass KARDINALITAET = eINSTANCE.getKardinalitaet();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet01Impl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet01()
     * @generated
     */
    EClass KARDINALITAET01 = eINSTANCE.getKardinalitaet01();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet0xImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet0x()
     * @generated
     */
    EClass KARDINALITAET0X = eINSTANCE.getKardinalitaet0x();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet11Impl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet11()
     * @generated
     */
    EClass KARDINALITAET11 = eINSTANCE.getKardinalitaet11();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somsl.somSL.impl.Kardinalitaet1xImpl
     * @see de.uniba.wiai.seda.somsl.somSL.impl.SomSLPackageImpl#getKardinalitaet1x()
     * @generated
     */
    EClass KARDINALITAET1X = eINSTANCE.getKardinalitaet1x();

  }

} //SomSLPackage
