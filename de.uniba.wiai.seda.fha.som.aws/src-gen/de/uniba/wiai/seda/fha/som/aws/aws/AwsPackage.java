/**
 */
package de.uniba.wiai.seda.fha.som.aws.aws;

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
 * @see de.uniba.wiai.seda.fha.som.aws.aws.AwsFactory
 * @model kind="package"
 * @generated
 */
public interface AwsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aws";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/fha/som/aws/Aws";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aws";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AwsPackage eINSTANCE = de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.AwSImpl <em>Aw S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwSImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getAwS()
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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.SchemaImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getSchema()
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
   * The feature id for the '<em><b>Beziehungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__BEZIEHUNGEN = 1;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl <em>VOS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getVOS()
   * @generated
   */
  int VOS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__NAME = SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Beziehungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__BEZIEHUNGEN = SCHEMA__BEZIEHUNGEN;

  /**
   * The feature id for the '<em><b>Objekttypen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__OBJEKTTYPEN = SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gliederung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS__GLIEDERUNG = SCHEMA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VOS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOS_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl <em>KOS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKOS()
   * @generated
   */
  int KOS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__NAME = SCHEMA__NAME;

  /**
   * The feature id for the '<em><b>Beziehungen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__BEZIEHUNGEN = SCHEMA__BEZIEHUNGEN;

  /**
   * The feature id for the '<em><b>Objekttypen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__OBJEKTTYPEN = SCHEMA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gliederung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS__GLIEDERUNG = SCHEMA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>KOS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KOS_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getObjekttyp()
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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOTImpl <em>VOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.VOTImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getVOT()
   * @generated
   */
  int VOT = 5;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOTImpl <em>KOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KOTImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKOT()
   * @generated
   */
  int KOT = 6;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.OOTImpl <em>OOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.OOTImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getOOT()
   * @generated
   */
  int OOT = 7;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.LOTImpl <em>LOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.LOTImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getLOT()
   * @generated
   */
  int LOT = 8;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.TOTImpl <em>TOT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.TOTImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getTOT()
   * @generated
   */
  int TOT = 9;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AttributImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 10;

  /**
   * The feature id for the '<em><b>Typ</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__TYP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT__NAME = 1;

  /**
   * The number of structural features of the '<em>Attribut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.OperatorImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 11;

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
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.BeziehungImpl <em>Beziehung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.BeziehungImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getBeziehung()
   * @generated
   */
  int BEZIEHUNG = 12;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Interacts_withImpl <em>Interacts with</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Interacts_withImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getInteracts_with()
   * @generated
   */
  int INTERACTS_WITH = 13;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_aImpl <em>Is a</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_aImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getIs_a()
   * @generated
   */
  int IS_A = 14;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_part_ofImpl <em>Is part of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_part_ofImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getIs_part_of()
   * @generated
   */
  int IS_PART_OF = 15;

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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KardinalitaetImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet()
   * @generated
   */
  int KARDINALITAET = 16;

  /**
   * The number of structural features of the '<em>Kardinalitaet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet01Impl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet01()
   * @generated
   */
  int KARDINALITAET01 = 17;

  /**
   * The number of structural features of the '<em>Kardinalitaet01</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET01_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet0xImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet0x()
   * @generated
   */
  int KARDINALITAET0X = 18;

  /**
   * The number of structural features of the '<em>Kardinalitaet0x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET0X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet11Impl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet11()
   * @generated
   */
  int KARDINALITAET11 = 19;

  /**
   * The number of structural features of the '<em>Kardinalitaet11</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET11_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet1xImpl
   * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet1x()
   * @generated
   */
  int KARDINALITAET1X = 20;

  /**
   * The number of structural features of the '<em>Kardinalitaet1x</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KARDINALITAET1X_FEATURE_COUNT = KARDINALITAET_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS <em>Aw S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aw S</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS
   * @generated
   */
  EClass getAwS();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS#getName()
   * @see #getAwS()
   * @generated
   */
  EAttribute getAwS_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS#getVersion()
   * @see #getAwS()
   * @generated
   */
  EAttribute getAwS_Version();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS#getKos <em>Kos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kos</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS#getKos()
   * @see #getAwS()
   * @generated
   */
  EReference getAwS_Kos();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.AwS#getVos <em>Vos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vos</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.AwS#getVos()
   * @see #getAwS()
   * @generated
   */
  EReference getAwS_Vos();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.Schema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Schema#getName()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.Schema#getBeziehungen <em>Beziehungen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beziehungen</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Schema#getBeziehungen()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Beziehungen();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS <em>VOS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VOS</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOS
   * @generated
   */
  EClass getVOS();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS#getObjekttypen <em>Objekttypen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objekttypen</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOS#getObjekttypen()
   * @see #getVOS()
   * @generated
   */
  EReference getVOS_Objekttypen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOS#getGliederung <em>Gliederung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gliederung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOS#getGliederung()
   * @see #getVOS()
   * @generated
   */
  EReference getVOS_Gliederung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOS <em>KOS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KOS</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOS
   * @generated
   */
  EClass getKOS();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOS#getObjekttypen <em>Objekttypen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objekttypen</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOS#getObjekttypen()
   * @see #getKOS()
   * @generated
   */
  EReference getKOS_Objekttypen();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOS#getGliederung <em>Gliederung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Gliederung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOS#getGliederung()
   * @see #getKOS()
   * @generated
   */
  EReference getKOS_Gliederung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp <em>Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objekttyp</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp
   * @generated
   */
  EClass getObjekttyp();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getAnnotation()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Annotation();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getName()
   * @see #getObjekttyp()
   * @generated
   */
  EAttribute getObjekttyp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getAttribute()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getOperatoren <em>Operatoren</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operatoren</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Objekttyp#getOperatoren()
   * @see #getObjekttyp()
   * @generated
   */
  EReference getObjekttyp_Operatoren();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.VOT <em>VOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VOT</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.VOT
   * @generated
   */
  EClass getVOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.KOT <em>KOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KOT</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.KOT
   * @generated
   */
  EClass getKOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.OOT <em>OOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OOT</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.OOT
   * @generated
   */
  EClass getOOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.LOT <em>LOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LOT</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.LOT
   * @generated
   */
  EClass getLOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.TOT <em>TOT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TOT</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.TOT
   * @generated
   */
  EClass getTOT();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribut</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Attribut
   * @generated
   */
  EClass getAttribut();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getTyp <em>Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typ</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getTyp()
   * @see #getAttribut()
   * @generated
   */
  EReference getAttribut_Typ();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Attribut#getName()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Operator#getName()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Name();

  /**
   * Returns the meta object for the reference list '{@link de.uniba.wiai.seda.fha.som.aws.aws.Operator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Operator#getParameter()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Parameter();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung <em>Beziehung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beziehung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung
   * @generated
   */
  EClass getBeziehung();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getAnnotation()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Annotation();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp1 <em>Objekttyp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp1</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp1()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp1();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getKardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getKardinalitaet()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Kardinalitaet();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp2 <em>Objekttyp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objekttyp2</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Beziehung#getObjekttyp2()
   * @see #getBeziehung()
   * @generated
   */
  EReference getBeziehung_Objekttyp2();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with <em>Interacts with</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interacts with</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with
   * @generated
   */
  EClass getInteracts_with();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Is_a <em>Is a</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is a</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Is_a
   * @generated
   */
  EClass getIs_a();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of <em>Is part of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is part of</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of
   * @generated
   */
  EClass getIs_part_of();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet <em>Kardinalitaet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet
   * @generated
   */
  EClass getKardinalitaet();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01 <em>Kardinalitaet01</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet01</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01
   * @generated
   */
  EClass getKardinalitaet01();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x <em>Kardinalitaet0x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet0x</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x
   * @generated
   */
  EClass getKardinalitaet0x();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11 <em>Kardinalitaet11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet11</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11
   * @generated
   */
  EClass getKardinalitaet11();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x <em>Kardinalitaet1x</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kardinalitaet1x</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x
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
  AwsFactory getAwsFactory();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.AwSImpl <em>Aw S</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwSImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getAwS()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.SchemaImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getSchema()
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
     * The meta object literal for the '<em><b>Beziehungen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__BEZIEHUNGEN = eINSTANCE.getSchema_Beziehungen();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl <em>VOS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.VOSImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getVOS()
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
     * The meta object literal for the '<em><b>Gliederung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOS__GLIEDERUNG = eINSTANCE.getVOS_Gliederung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl <em>KOS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KOSImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKOS()
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
     * The meta object literal for the '<em><b>Gliederung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KOS__GLIEDERUNG = eINSTANCE.getKOS_Gliederung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl <em>Objekttyp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.ObjekttypImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getObjekttyp()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.VOTImpl <em>VOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.VOTImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getVOT()
     * @generated
     */
    EClass VOT = eINSTANCE.getVOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KOTImpl <em>KOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KOTImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKOT()
     * @generated
     */
    EClass KOT = eINSTANCE.getKOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.OOTImpl <em>OOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.OOTImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getOOT()
     * @generated
     */
    EClass OOT = eINSTANCE.getOOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.LOTImpl <em>LOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.LOTImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getLOT()
     * @generated
     */
    EClass LOT = eINSTANCE.getLOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.TOTImpl <em>TOT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.TOTImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getTOT()
     * @generated
     */
    EClass TOT = eINSTANCE.getTOT();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.AttributImpl <em>Attribut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AttributImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getAttribut()
     * @generated
     */
    EClass ATTRIBUT = eINSTANCE.getAttribut();

    /**
     * The meta object literal for the '<em><b>Typ</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUT__TYP = eINSTANCE.getAttribut_Typ();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.OperatorImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getOperator()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.BeziehungImpl <em>Beziehung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.BeziehungImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getBeziehung()
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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Interacts_withImpl <em>Interacts with</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Interacts_withImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getInteracts_with()
     * @generated
     */
    EClass INTERACTS_WITH = eINSTANCE.getInteracts_with();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_aImpl <em>Is a</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_aImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getIs_a()
     * @generated
     */
    EClass IS_A = eINSTANCE.getIs_a();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_part_ofImpl <em>Is part of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Is_part_ofImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getIs_part_of()
     * @generated
     */
    EClass IS_PART_OF = eINSTANCE.getIs_part_of();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.KardinalitaetImpl <em>Kardinalitaet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.KardinalitaetImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet()
     * @generated
     */
    EClass KARDINALITAET = eINSTANCE.getKardinalitaet();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet01Impl <em>Kardinalitaet01</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet01Impl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet01()
     * @generated
     */
    EClass KARDINALITAET01 = eINSTANCE.getKardinalitaet01();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet0xImpl <em>Kardinalitaet0x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet0xImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet0x()
     * @generated
     */
    EClass KARDINALITAET0X = eINSTANCE.getKardinalitaet0x();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet11Impl <em>Kardinalitaet11</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet11Impl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet11()
     * @generated
     */
    EClass KARDINALITAET11 = eINSTANCE.getKardinalitaet11();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet1xImpl <em>Kardinalitaet1x</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.Kardinalitaet1xImpl
     * @see de.uniba.wiai.seda.fha.som.aws.aws.impl.AwsPackageImpl#getKardinalitaet1x()
     * @generated
     */
    EClass KARDINALITAET1X = eINSTANCE.getKardinalitaet1x();

  }

} //AwsPackage
