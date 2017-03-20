/**
 */
package de.uniba.wiai.seda.somslmarked.somSLMarked;

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
 * @see de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedFactory
 * @model kind="package"
 * @generated
 */
public interface SomSLMarkedPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "somSLMarked";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/somslmarked/SomSLMarked";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "somSLMarked";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SomSLMarkedPackage eINSTANCE = de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl <em>Aw S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAwS()
   * @generated
   */
  int AW_S = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AW_S__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AW_S__VERSION = 1;

  /**
   * The feature id for the '<em><b>Kos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AW_S__KOS = 2;

  /**
   * The feature id for the '<em><b>Vos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AW_S__VOS = 3;

  /**
   * The number of structural features of the '<em>Aw S</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AW_S_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SchemaImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = 0;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOSImpl <em>KOS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOSImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKOS()
   * @generated
   */
  int KOS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__NAME = SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Objekttypen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__OBJEKTTYPEN = SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Beziehungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__BEZIEHUNGEN = SCHEMA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gliederung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__GLIEDERUNG = SCHEMA_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>KOS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOSImpl <em>VOS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOSImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getVOS()
   * @generated
   */
  int VOS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__NAME = SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Objekttypen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__OBJEKTTYPEN = SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Beziehungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__BEZIEHUNGEN = SCHEMA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gliederung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__GLIEDERUNG = SCHEMA_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>VOS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.ObjekttypImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getObjekttyp()
   * @generated
   */
  int OBJEKTTYP = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__NAME = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Operatoren</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP__OPERATOREN = 3;

  /**
   * The number of structural features of the '<em>Objekttyp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJEKTTYP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AttributImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 5;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OperatorImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 6;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AnweisungImpl <em>Anweisung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AnweisungImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAnweisung()
   * @generated
   */
  int ANWEISUNG = 7;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOTImpl <em>KOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOTImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKOT()
   * @generated
   */
  int KOT = 8;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOT__ANNOTATION = OBJEKTTYP__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOTImpl <em>VOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOTImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getVOT()
   * @generated
   */
  int VOT = 9;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOT__ANNOTATION = OBJEKTTYP__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OOTImpl <em>OOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OOTImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getOOT()
   * @generated
   */
  int OOT = 10;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOT__ANNOTATION = KOT__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.LOTImpl <em>LOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.LOTImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getLOT()
   * @generated
   */
  int LOT = 11;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOT__ANNOTATION = KOT__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.TOTImpl <em>TOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.TOTImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getTOT()
   * @generated
   */
  int TOT = 12;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOT__ANNOTATION = KOT__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl <em>Beziehung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getBeziehung()
   * @generated
   */
  int BEZIEHUNG = 13;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Objekttyp1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__OBJEKTTYP1 = 1;

  /**
   * The feature id for the '<em><b>Kardinalitaet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__KARDINALITAET = 2;

  /**
   * The feature id for the '<em><b>Objekttyp2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG__OBJEKTTYP2 = 3;

  /**
   * The number of structural features of the '<em>Beziehung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEZIEHUNG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Interacts_withImpl <em>Interacts with</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Interacts_withImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getInteracts_with()
   * @generated
   */
  int INTERACTS_WITH = 14;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTS_WITH__ANNOTATION = BEZIEHUNG__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_aImpl <em>Is a</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_aImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getIs_a()
   * @generated
   */
  int IS_A = 15;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_A__ANNOTATION = BEZIEHUNG__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_part_ofImpl <em>Is part of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_part_ofImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getIs_part_of()
   * @generated
   */
  int IS_PART_OF = 16;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_PART_OF__ANNOTATION = BEZIEHUNG__ANNOTATION;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KardinalitaetImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet()
   * @generated
   */
  int KARDINALITAET = 17;

  /**
   * The number of structural features of the '<em>Kardinalitaet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet01Impl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet01()
   * @generated
   */
  int KARDINALITAET01 = 18;

  /**
   * The number of structural features of the '<em>Kardinalitaet01</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET01_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet0xImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet0x()
   * @generated
   */
  int KARDINALITAET0X = 19;

  /**
   * The number of structural features of the '<em>Kardinalitaet0x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET0X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet11Impl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet11()
   * @generated
   */
  int KARDINALITAET11 = 20;

  /**
   * The number of structural features of the '<em>Kardinalitaet11</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET11_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet1xImpl
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet1x()
   * @generated
   */
  int KARDINALITAET1X = 21;

  /**
   * The number of structural features of the '<em>Kardinalitaet1x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET1X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS <em>Aw S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aw S</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.AwS
   * @generated
   */
  EClass getAwS();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getName()
   * @see #getAwS()
   * @generated
   */
  EAttribute getAwS_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVersion()
   * @see #getAwS()
   * @generated
   */
  EAttribute getAwS_Version();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getKos <em>Kos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kos</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getKos()
   * @see #getAwS()
   * @generated
   */
  EReference getAwS_Kos();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVos <em>Vos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vos</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.AwS#getVos()
   * @see #getAwS()
   * @generated
   */
  EReference getAwS_Vos();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Schema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Schema#getName()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS <em>KOS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KOS</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.KOS
   * @generated
   */
  EClass getKOS();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getObjekttypen <em>Objekttypen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objekttypen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getObjekttypen()
   * @see #getKOS()
   * @generated
   */
  EReference getKOS_Objekttypen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getBeziehungen <em>Beziehungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beziehungen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getBeziehungen()
   * @see #getKOS()
   * @generated
   */
  EReference getKOS_Beziehungen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getGliederung <em>Gliederung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gliederung</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.KOS#getGliederung()
   * @see #getKOS()
   * @generated
   */
  EReference getKOS_Gliederung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS <em>VOS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VOS</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.VOS
   * @generated
   */
  EClass getVOS();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getObjekttypen <em>Objekttypen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objekttypen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getObjekttypen()
   * @see #getVOS()
   * @generated
   */
  EReference getVOS_Objekttypen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getBeziehungen <em>Beziehungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beziehungen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getBeziehungen()
   * @see #getVOS()
   * @generated
   */
  EReference getVOS_Beziehungen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getGliederung <em>Gliederung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gliederung</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.VOS#getGliederung()
   * @see #getVOS()
   * @generated
   */
  EReference getVOS_Gliederung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp
   * @generated
   */
  EClass getObjekttyp();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAnnotation()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Annotation();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getName()
   * @see #getObjekttyp()
   * @generated
   */
  EAttribute getObjekttyp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getAttribute()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getOperatoren <em>Operatoren</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operatoren</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp#getOperatoren()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Operatoren();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribut</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut
   * @generated
   */
  EClass getAttribut();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getObjekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getObjekttyp()
   * @see #getAttribut()
   * @generated
   */
  EReference getAttribut_Objekttyp();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getDatentyp <em>Datentyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datentyp</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getDatentyp()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Datentyp();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut#getName()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getName()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Name();

  /**
   * Returns the meta object for the reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getParameter()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getAnweisungen <em>Anweisungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anweisungen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Operator#getAnweisungen()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Anweisungen();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung <em>Anweisung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anweisung</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung
   * @generated
   */
  EClass getAnweisung();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getKontrollstruktur <em>Kontrollstruktur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kontrollstruktur</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getKontrollstruktur()
   * @see #getAnweisung()
   * @generated
   */
  EAttribute getAnweisung_Kontrollstruktur();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedingung()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_Bedingung();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedigteAnweisungen <em>Bedigte Anweisungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bedigte Anweisungen</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getBedigteAnweisungen()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_BedigteAnweisungen();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getObjekt <em>Objekt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekt</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getObjekt()
   * @see #getAnweisung()
   * @generated
   */
  EReference getAnweisung_Objekt();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung#getOperator()
   * @see #getAnweisung()
   * @generated
   */
  EAttribute getAnweisung_Operator();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.KOT <em>KOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KOT</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.KOT
   * @generated
   */
  EClass getKOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.VOT <em>VOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VOT</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.VOT
   * @generated
   */
  EClass getVOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.OOT <em>OOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OOT</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.OOT
   * @generated
   */
  EClass getOOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.LOT <em>LOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LOT</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.LOT
   * @generated
   */
  EClass getLOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.TOT <em>TOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TOT</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.TOT
   * @generated
   */
  EClass getTOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung <em>Beziehung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beziehung</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung
   * @generated
   */
  EClass getBeziehung();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getAnnotation()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Annotation();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getObjekttyp1 <em>Objekttyp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp1</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getObjekttyp1()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp1();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getKardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getKardinalitaet()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Kardinalitaet();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getObjekttyp2 <em>Objekttyp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp2</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung#getObjekttyp2()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp2();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Interacts_with <em>Interacts with</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interacts with</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Interacts_with
   * @generated
   */
  EClass getInteracts_with();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Is_a <em>Is a</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is a</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Is_a
   * @generated
   */
  EClass getIs_a();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Is_part_of <em>Is part of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is part of</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Is_part_of
   * @generated
   */
  EClass getIs_part_of();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet
   * @generated
   */
  EClass getKardinalitaet();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet01 <em>Kardinalitaet01</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet01</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet01
   * @generated
   */
  EClass getKardinalitaet01();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet0x <em>Kardinalitaet0x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet0x</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet0x
   * @generated
   */
  EClass getKardinalitaet0x();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet11 <em>Kardinalitaet11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet11</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet11
   * @generated
   */
  EClass getKardinalitaet11();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet1x <em>Kardinalitaet1x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet1x</em>'.
   * @see de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet1x
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
  SomSLMarkedFactory getSomSLMarkedFactory();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl <em>Aw S</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AwSImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAwS()
     * @generated
     */
    EClass AW_S = eINSTANCE.getAwS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AW_S__NAME = eINSTANCE.getAwS_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AW_S__VERSION = eINSTANCE.getAwS_Version();

    /**
     * The meta object literal for the '<em><b>Kos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AW_S__KOS = eINSTANCE.getAwS_Kos();

    /**
     * The meta object literal for the '<em><b>Vos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AW_S__VOS = eINSTANCE.getAwS_Vos();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SchemaImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOSImpl <em>KOS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOSImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKOS()
     * @generated
     */
    EClass KOS = eINSTANCE.getKOS();

    /**
     * The meta object literal for the '<em><b>Objekttypen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KOS__OBJEKTTYPEN = eINSTANCE.getKOS_Objekttypen();

    /**
     * The meta object literal for the '<em><b>Beziehungen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KOS__BEZIEHUNGEN = eINSTANCE.getKOS_Beziehungen();

    /**
     * The meta object literal for the '<em><b>Gliederung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KOS__GLIEDERUNG = eINSTANCE.getKOS_Gliederung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOSImpl <em>VOS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOSImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getVOS()
     * @generated
     */
    EClass VOS = eINSTANCE.getVOS();

    /**
     * The meta object literal for the '<em><b>Objekttypen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOS__OBJEKTTYPEN = eINSTANCE.getVOS_Objekttypen();

    /**
     * The meta object literal for the '<em><b>Beziehungen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOS__BEZIEHUNGEN = eINSTANCE.getVOS_Beziehungen();

    /**
     * The meta object literal for the '<em><b>Gliederung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOS__GLIEDERUNG = eINSTANCE.getVOS_Gliederung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.ObjekttypImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getObjekttyp()
     * @generated
     */
    EClass OBJEKTTYP = eINSTANCE.getObjekttyp();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJEKTTYP__ANNOTATION = eINSTANCE.getObjekttyp_Annotation();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AttributImpl <em>Attribut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AttributImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAttribut()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OperatorImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getOperator()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AnweisungImpl <em>Anweisung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.AnweisungImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getAnweisung()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOTImpl <em>KOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KOTImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKOT()
     * @generated
     */
    EClass KOT = eINSTANCE.getKOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOTImpl <em>VOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.VOTImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getVOT()
     * @generated
     */
    EClass VOT = eINSTANCE.getVOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OOTImpl <em>OOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.OOTImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getOOT()
     * @generated
     */
    EClass OOT = eINSTANCE.getOOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.LOTImpl <em>LOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.LOTImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getLOT()
     * @generated
     */
    EClass LOT = eINSTANCE.getLOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.TOTImpl <em>TOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.TOTImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getTOT()
     * @generated
     */
    EClass TOT = eINSTANCE.getTOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl <em>Beziehung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.BeziehungImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getBeziehung()
     * @generated
     */
    EClass BEZIEHUNG = eINSTANCE.getBeziehung();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEZIEHUNG__ANNOTATION = eINSTANCE.getBeziehung_Annotation();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Interacts_withImpl <em>Interacts with</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Interacts_withImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getInteracts_with()
     * @generated
     */
    EClass INTERACTS_WITH = eINSTANCE.getInteracts_with();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_aImpl <em>Is a</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_aImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getIs_a()
     * @generated
     */
    EClass IS_A = eINSTANCE.getIs_a();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_part_ofImpl <em>Is part of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Is_part_ofImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getIs_part_of()
     * @generated
     */
    EClass IS_PART_OF = eINSTANCE.getIs_part_of();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.KardinalitaetImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet()
     * @generated
     */
    EClass KARDINALITAET = eINSTANCE.getKardinalitaet();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet01Impl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet01()
     * @generated
     */
    EClass KARDINALITAET01 = eINSTANCE.getKardinalitaet01();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet0xImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet0x()
     * @generated
     */
    EClass KARDINALITAET0X = eINSTANCE.getKardinalitaet0x();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet11Impl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet11()
     * @generated
     */
    EClass KARDINALITAET11 = eINSTANCE.getKardinalitaet11();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.Kardinalitaet1xImpl
     * @see de.uniba.wiai.seda.somslmarked.somSLMarked.impl.SomSLMarkedPackageImpl#getKardinalitaet1x()
     * @generated
     */
    EClass KARDINALITAET1X = eINSTANCE.getKardinalitaet1x();

  }

} //SomSLMarkedPackage
