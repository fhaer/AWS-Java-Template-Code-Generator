/**
 */
package de.uniba.wiai.seda.fha.som.aws.soa.soa;

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
 * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaFactory
 * @model kind="package"
 * @generated
 */
public interface SoaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "soa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/fha/som/aws/soa/Soa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "soa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SoaPackage eINSTANCE = de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl <em>SOA Aw S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getSOA_AwS()
   * @generated
   */
  int SOA_AW_S = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__VERSION = 1;

  /**
   * The feature id for the '<em><b>Vos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__VOS = 2;

  /**
   * The feature id for the '<em><b>Kos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__KOS = 3;

  /**
   * The feature id for the '<em><b>Vorgangsservices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__VORGANGSSERVICES = 4;

  /**
   * The feature id for the '<em><b>Entityservices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S__ENTITYSERVICES = 5;

  /**
   * The number of structural features of the '<em>SOA Aw S</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOA_AW_S_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getService()
   * @generated
   */
  int SERVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl <em>Vorgangsservice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getVorgangsservice()
   * @generated
   */
  int VORGANGSSERVICE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE__NAME = SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Choreographie IF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE__CHOREOGRAPHIE_IF = SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vorgangsservices Elementar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR = SERVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Workflow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE__WORKFLOW = SERVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Vorgangsservice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl <em>Vorgangsservice Elementar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getVorgangsserviceElementar()
   * @generated
   */
  int VORGANGSSERVICE_ELEMENTAR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE_ELEMENTAR__NAME = SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Komponenten Objekttyp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP = SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE_ELEMENTAR__INTERFACE = SERVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vorgangsservice Elementar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORGANGSSERVICE_ELEMENTAR_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.InterfaceImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Methoden</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__METHODEN = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceMethodeImpl <em>Service Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceMethodeImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getServiceMethode()
   * @generated
   */
  int SERVICE_METHODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHODE__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Service Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl <em>Workflow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getWorkflow()
   * @generated
   */
  int WORKFLOW = 6;

  /**
   * The feature id for the '<em><b>Orchestrierung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__ORCHESTRIERUNG = 0;

  /**
   * The feature id for the '<em><b>Choreographie</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__CHOREOGRAPHIE = 1;

  /**
   * The number of structural features of the '<em>Workflow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl <em>Orchestrierung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getOrchestrierung()
   * @generated
   */
  int ORCHESTRIERUNG = 7;

  /**
   * The feature id for the '<em><b>Bedingung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRIERUNG__BEDINGUNG = 0;

  /**
   * The feature id for the '<em><b>Methode1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRIERUNG__METHODE1 = 1;

  /**
   * The feature id for the '<em><b>Methode2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRIERUNG__METHODE2 = 2;

  /**
   * The number of structural features of the '<em>Orchestrierung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRIERUNG_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ChoreographieLokalImpl <em>Choreographie Lokal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ChoreographieLokalImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getChoreographieLokal()
   * @generated
   */
  int CHOREOGRAPHIE_LOKAL = 8;

  /**
   * The feature id for the '<em><b>Bedingung</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHIE_LOKAL__BEDINGUNG = 0;

  /**
   * The feature id for the '<em><b>Methode1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHIE_LOKAL__METHODE1 = 1;

  /**
   * The feature id for the '<em><b>Service2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHIE_LOKAL__SERVICE2 = 2;

  /**
   * The feature id for the '<em><b>Methode2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHIE_LOKAL__METHODE2 = 3;

  /**
   * The number of structural features of the '<em>Choreographie Lokal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHIE_LOKAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.BedingungImpl <em>Bedingung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.BedingungImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getBedingung()
   * @generated
   */
  int BEDINGUNG = 9;

  /**
   * The feature id for the '<em><b>Bedingung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEDINGUNG__BEDINGUNG = 0;

  /**
   * The number of structural features of the '<em>Bedingung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEDINGUNG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityserviceImpl <em>Entityservice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityserviceImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getEntityservice()
   * @generated
   */
  int ENTITYSERVICE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITYSERVICE__NAME = SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITYSERVICE__INTERFACE = SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITYSERVICE__ENTITIES = SERVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entityservice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITYSERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityImpl
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Komponenten Objekttyp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__KOMPONENTEN_OBJEKTTYP = 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__INTERFACE = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS <em>SOA Aw S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SOA Aw S</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS
   * @generated
   */
  EClass getSOA_AwS();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getName()
   * @see #getSOA_AwS()
   * @generated
   */
  EAttribute getSOA_AwS_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVersion()
   * @see #getSOA_AwS()
   * @generated
   */
  EAttribute getSOA_AwS_Version();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVos <em>Vos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vos</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVos()
   * @see #getSOA_AwS()
   * @generated
   */
  EReference getSOA_AwS_Vos();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getKos <em>Kos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kos</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getKos()
   * @see #getSOA_AwS()
   * @generated
   */
  EReference getSOA_AwS_Kos();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVorgangsservices <em>Vorgangsservices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vorgangsservices</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getVorgangsservices()
   * @see #getSOA_AwS()
   * @generated
   */
  EReference getSOA_AwS_Vorgangsservices();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getEntityservices <em>Entityservices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entityservices</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS#getEntityservices()
   * @see #getSOA_AwS()
   * @generated
   */
  EReference getSOA_AwS_Entityservices();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice <em>Vorgangsservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vorgangsservice</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice
   * @generated
   */
  EClass getVorgangsservice();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getChoreographieIF <em>Choreographie IF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreographie IF</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getChoreographieIF()
   * @see #getVorgangsservice()
   * @generated
   */
  EReference getVorgangsservice_ChoreographieIF();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getVorgangsservicesElementar <em>Vorgangsservices Elementar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vorgangsservices Elementar</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getVorgangsservicesElementar()
   * @see #getVorgangsservice()
   * @generated
   */
  EReference getVorgangsservice_VorgangsservicesElementar();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getWorkflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workflow</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice#getWorkflow()
   * @see #getVorgangsservice()
   * @generated
   */
  EReference getVorgangsservice_Workflow();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar <em>Vorgangsservice Elementar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vorgangsservice Elementar</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar
   * @generated
   */
  EClass getVorgangsserviceElementar();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getKomponentenObjekttyp <em>Komponenten Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Komponenten Objekttyp</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getKomponentenObjekttyp()
   * @see #getVorgangsserviceElementar()
   * @generated
   */
  EReference getVorgangsserviceElementar_KomponentenObjekttyp();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar#getInterface()
   * @see #getVorgangsserviceElementar()
   * @generated
   */
  EReference getVorgangsserviceElementar_Interface();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface#getMethoden <em>Methoden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methoden</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface#getMethoden()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Methoden();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode <em>Service Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Methode</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode
   * @generated
   */
  EClass getServiceMethode();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode#getName()
   * @see #getServiceMethode()
   * @generated
   */
  EAttribute getServiceMethode_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode#getParameter()
   * @see #getServiceMethode()
   * @generated
   */
  EAttribute getServiceMethode_Parameter();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow
   * @generated
   */
  EClass getWorkflow();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getOrchestrierung <em>Orchestrierung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orchestrierung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getOrchestrierung()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Orchestrierung();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getChoreographie <em>Choreographie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choreographie</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow#getChoreographie()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Choreographie();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung <em>Orchestrierung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orchestrierung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung
   * @generated
   */
  EClass getOrchestrierung();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getBedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getBedingung()
   * @see #getOrchestrierung()
   * @generated
   */
  EReference getOrchestrierung_Bedingung();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode1 <em>Methode1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Methode1</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode1()
   * @see #getOrchestrierung()
   * @generated
   */
  EReference getOrchestrierung_Methode1();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode2 <em>Methode2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Methode2</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung#getMethode2()
   * @see #getOrchestrierung()
   * @generated
   */
  EReference getOrchestrierung_Methode2();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal <em>Choreographie Lokal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choreographie Lokal</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal
   * @generated
   */
  EClass getChoreographieLokal();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getBedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getBedingung()
   * @see #getChoreographieLokal()
   * @generated
   */
  EReference getChoreographieLokal_Bedingung();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getMethode1 <em>Methode1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Methode1</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getMethode1()
   * @see #getChoreographieLokal()
   * @generated
   */
  EReference getChoreographieLokal_Methode1();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getService2 <em>Service2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service2</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getService2()
   * @see #getChoreographieLokal()
   * @generated
   */
  EReference getChoreographieLokal_Service2();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getMethode2 <em>Methode2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Methode2</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal#getMethode2()
   * @see #getChoreographieLokal()
   * @generated
   */
  EReference getChoreographieLokal_Methode2();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung
   * @generated
   */
  EClass getBedingung();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung#getBedingung <em>Bedingung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bedingung</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung#getBedingung()
   * @see #getBedingung()
   * @generated
   */
  EAttribute getBedingung_Bedingung();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice <em>Entityservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entityservice</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice
   * @generated
   */
  EClass getEntityservice();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice#getInterface()
   * @see #getEntityservice()
   * @generated
   */
  EReference getEntityservice_Interface();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice#getEntities()
   * @see #getEntityservice()
   * @generated
   */
  EReference getEntityservice_Entities();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getKomponentenObjekttyp <em>Komponenten Objekttyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Komponenten Objekttyp</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getKomponentenObjekttyp()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_KomponentenObjekttyp();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity#getInterface()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Interface();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SoaFactory getSoaFactory();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl <em>SOA Aw S</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SOA_AwSImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getSOA_AwS()
     * @generated
     */
    EClass SOA_AW_S = eINSTANCE.getSOA_AwS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOA_AW_S__NAME = eINSTANCE.getSOA_AwS_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOA_AW_S__VERSION = eINSTANCE.getSOA_AwS_Version();

    /**
     * The meta object literal for the '<em><b>Vos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOA_AW_S__VOS = eINSTANCE.getSOA_AwS_Vos();

    /**
     * The meta object literal for the '<em><b>Kos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOA_AW_S__KOS = eINSTANCE.getSOA_AwS_Kos();

    /**
     * The meta object literal for the '<em><b>Vorgangsservices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOA_AW_S__VORGANGSSERVICES = eINSTANCE.getSOA_AwS_Vorgangsservices();

    /**
     * The meta object literal for the '<em><b>Entityservices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOA_AW_S__ENTITYSERVICES = eINSTANCE.getSOA_AwS_Entityservices();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl <em>Vorgangsservice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getVorgangsservice()
     * @generated
     */
    EClass VORGANGSSERVICE = eINSTANCE.getVorgangsservice();

    /**
     * The meta object literal for the '<em><b>Choreographie IF</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORGANGSSERVICE__CHOREOGRAPHIE_IF = eINSTANCE.getVorgangsservice_ChoreographieIF();

    /**
     * The meta object literal for the '<em><b>Vorgangsservices Elementar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORGANGSSERVICE__VORGANGSSERVICES_ELEMENTAR = eINSTANCE.getVorgangsservice_VorgangsservicesElementar();

    /**
     * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORGANGSSERVICE__WORKFLOW = eINSTANCE.getVorgangsservice_Workflow();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl <em>Vorgangsservice Elementar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.VorgangsserviceElementarImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getVorgangsserviceElementar()
     * @generated
     */
    EClass VORGANGSSERVICE_ELEMENTAR = eINSTANCE.getVorgangsserviceElementar();

    /**
     * The meta object literal for the '<em><b>Komponenten Objekttyp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP = eINSTANCE.getVorgangsserviceElementar_KomponentenObjekttyp();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORGANGSSERVICE_ELEMENTAR__INTERFACE = eINSTANCE.getVorgangsserviceElementar_Interface();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.InterfaceImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Methoden</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__METHODEN = eINSTANCE.getInterface_Methoden();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceMethodeImpl <em>Service Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ServiceMethodeImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getServiceMethode()
     * @generated
     */
    EClass SERVICE_METHODE = eINSTANCE.getServiceMethode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHODE__NAME = eINSTANCE.getServiceMethode_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHODE__PARAMETER = eINSTANCE.getServiceMethode_Parameter();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl <em>Workflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.WorkflowImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getWorkflow()
     * @generated
     */
    EClass WORKFLOW = eINSTANCE.getWorkflow();

    /**
     * The meta object literal for the '<em><b>Orchestrierung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__ORCHESTRIERUNG = eINSTANCE.getWorkflow_Orchestrierung();

    /**
     * The meta object literal for the '<em><b>Choreographie</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__CHOREOGRAPHIE = eINSTANCE.getWorkflow_Choreographie();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl <em>Orchestrierung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.OrchestrierungImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getOrchestrierung()
     * @generated
     */
    EClass ORCHESTRIERUNG = eINSTANCE.getOrchestrierung();

    /**
     * The meta object literal for the '<em><b>Bedingung</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRIERUNG__BEDINGUNG = eINSTANCE.getOrchestrierung_Bedingung();

    /**
     * The meta object literal for the '<em><b>Methode1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRIERUNG__METHODE1 = eINSTANCE.getOrchestrierung_Methode1();

    /**
     * The meta object literal for the '<em><b>Methode2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRIERUNG__METHODE2 = eINSTANCE.getOrchestrierung_Methode2();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ChoreographieLokalImpl <em>Choreographie Lokal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.ChoreographieLokalImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getChoreographieLokal()
     * @generated
     */
    EClass CHOREOGRAPHIE_LOKAL = eINSTANCE.getChoreographieLokal();

    /**
     * The meta object literal for the '<em><b>Bedingung</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHIE_LOKAL__BEDINGUNG = eINSTANCE.getChoreographieLokal_Bedingung();

    /**
     * The meta object literal for the '<em><b>Methode1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHIE_LOKAL__METHODE1 = eINSTANCE.getChoreographieLokal_Methode1();

    /**
     * The meta object literal for the '<em><b>Service2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHIE_LOKAL__SERVICE2 = eINSTANCE.getChoreographieLokal_Service2();

    /**
     * The meta object literal for the '<em><b>Methode2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHIE_LOKAL__METHODE2 = eINSTANCE.getChoreographieLokal_Methode2();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.BedingungImpl <em>Bedingung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.BedingungImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getBedingung()
     * @generated
     */
    EClass BEDINGUNG = eINSTANCE.getBedingung();

    /**
     * The meta object literal for the '<em><b>Bedingung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEDINGUNG__BEDINGUNG = eINSTANCE.getBedingung_Bedingung();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityserviceImpl <em>Entityservice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityserviceImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getEntityservice()
     * @generated
     */
    EClass ENTITYSERVICE = eINSTANCE.getEntityservice();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITYSERVICE__INTERFACE = eINSTANCE.getEntityservice_Interface();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITYSERVICE__ENTITIES = eINSTANCE.getEntityservice_Entities();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.EntityImpl
     * @see de.uniba.wiai.seda.fha.som.aws.soa.soa.impl.SoaPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Komponenten Objekttyp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__KOMPONENTEN_OBJEKTTYP = eINSTANCE.getEntity_KomponentenObjekttyp();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__INTERFACE = eINSTANCE.getEntity_Interface();

  }

} //SoaPackage
