/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur;

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
 * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturFactory
 * @model kind="package"
 * @generated
 */
public interface SwarchitekturPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "swarchitektur";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/fha/swarchitektur/Swarchitektur";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "swarchitektur";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwarchitekturPackage eINSTANCE = de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl <em>Architektur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getArchitektur()
   * @generated
   */
  int ARCHITEKTUR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITEKTUR__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITEKTUR__VERSION = 1;

  /**
   * The feature id for the '<em><b>Pakete</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITEKTUR__PAKETE = 2;

  /**
   * The number of structural features of the '<em>Architektur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITEKTUR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Komponenten</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__KOMPONENTEN = 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENTITIES = 2;

  /**
   * The feature id for the '<em><b>Pakete</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PAKETE = 3;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.EJBImpl <em>EJB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.EJBImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getEJB()
   * @generated
   */
  int EJB = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__NAME = 0;

  /**
   * The number of structural features of the '<em>EJB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SessionBeanImpl <em>Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SessionBeanImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getSessionBean()
   * @generated
   */
  int SESSION_BEAN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__NAME = EJB__NAME;

  /**
   * The number of structural features of the '<em>Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.BusinessInterfaceImpl <em>Business Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.BusinessInterfaceImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getBusinessInterface()
   * @generated
   */
  int BUSINESS_INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INTERFACE__NAME = EJB__NAME;

  /**
   * The feature id for the '<em><b>Methoden</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INTERFACE__METHODEN = EJB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Business Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_INTERFACE_FEATURE_COUNT = EJB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodensignaturImpl <em>Methodensignatur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodensignaturImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMethodensignatur()
   * @generated
   */
  int METHODENSIGNATUR = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODENSIGNATUR__NAME = 0;

  /**
   * The number of structural features of the '<em>Methodensignatur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODENSIGNATUR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatefulSessionBeanImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getStatefulSessionBean()
   * @generated
   */
  int STATEFUL_SESSION_BEAN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__ATTRIBUTE = SESSION_BEAN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__METHODE = SESSION_BEAN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stateful Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AttributImpl <em>Attribut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AttributImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getAttribut()
   * @generated
   */
  int ATTRIBUT = 7;

  /**
   * The feature id for the '<em><b>Typ</b></em>' attribute.
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
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodeImpl <em>Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodeImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMethode()
   * @generated
   */
  int METHODE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Aufruf</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__AUFRUF = 1;

  /**
   * The number of structural features of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl <em>Aufruf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getAufruf()
   * @generated
   */
  int AUFRUF = 9;

  /**
   * The feature id for the '<em><b>Objekt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUFRUF__OBJEKT = 0;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUFRUF__METHODE = 1;

  /**
   * The number of structural features of the '<em>Aufruf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUFRUF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatelessSessionBeanImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getStatelessSessionBean()
   * @generated
   */
  int STATELESS_SESSION_BEAN = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__METHODE = SESSION_BEAN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stateless Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.JPAEntityImpl <em>JPA Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.JPAEntityImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getJPAEntity()
   * @generated
   */
  int JPA_ENTITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY__METHODE = 2;

  /**
   * The number of structural features of the '<em>JPA Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPA_ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MessageDrivenBeanImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMessageDrivenBean()
   * @generated
   */
  int MESSAGE_DRIVEN_BEAN = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DRIVEN_BEAN__NAME = EJB__NAME;

  /**
   * The number of structural features of the '<em>Message Driven Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_DRIVEN_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SingletonSessionBeanImpl <em>Singleton Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SingletonSessionBeanImpl
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getSingletonSessionBean()
   * @generated
   */
  int SINGLETON_SESSION_BEAN = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

  /**
   * The number of structural features of the '<em>Singleton Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLETON_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur <em>Architektur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architektur</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur
   * @generated
   */
  EClass getArchitektur();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getName()
   * @see #getArchitektur()
   * @generated
   */
  EAttribute getArchitektur_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getVersion()
   * @see #getArchitektur()
   * @generated
   */
  EAttribute getArchitektur_Version();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getPakete <em>Pakete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pakete</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur#getPakete()
   * @see #getArchitektur()
   * @generated
   */
  EReference getArchitektur_Pakete();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getKomponenten <em>Komponenten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Komponenten</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getKomponenten()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Komponenten();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getEntities()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getPakete <em>Pakete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pakete</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package#getPakete()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Pakete();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB <em>EJB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EJB</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB
   * @generated
   */
  EClass getEJB();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB#getName()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean <em>Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session Bean</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean
   * @generated
   */
  EClass getSessionBean();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface <em>Business Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Interface</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface
   * @generated
   */
  EClass getBusinessInterface();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface#getMethoden <em>Methoden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methoden</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface#getMethoden()
   * @see #getBusinessInterface()
   * @generated
   */
  EReference getBusinessInterface_Methoden();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur <em>Methodensignatur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methodensignatur</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur
   * @generated
   */
  EClass getMethodensignatur();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur#getName()
   * @see #getMethodensignatur()
   * @generated
   */
  EAttribute getMethodensignatur_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stateful Session Bean</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean
   * @generated
   */
  EClass getStatefulSessionBean();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getAttribute()
   * @see #getStatefulSessionBean()
   * @generated
   */
  EReference getStatefulSessionBean_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methode</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean#getMethode()
   * @see #getStatefulSessionBean()
   * @generated
   */
  EReference getStatefulSessionBean_Methode();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribut</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut
   * @generated
   */
  EClass getAttribut();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut#getTyp <em>Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typ</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut#getTyp()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Typ();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut#getName()
   * @see #getAttribut()
   * @generated
   */
  EAttribute getAttribut_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methode</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode
   * @generated
   */
  EClass getMethode();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode#getName()
   * @see #getMethode()
   * @generated
   */
  EAttribute getMethode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode#getAufruf <em>Aufruf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aufruf</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode#getAufruf()
   * @see #getMethode()
   * @generated
   */
  EReference getMethode_Aufruf();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf <em>Aufruf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aufruf</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf
   * @generated
   */
  EClass getAufruf();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getObjekt <em>Objekt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objekt</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getObjekt()
   * @see #getAufruf()
   * @generated
   */
  EAttribute getAufruf_Objekt();

  /**
   * Returns the meta object for the containment reference '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Methode</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf#getMethode()
   * @see #getAufruf()
   * @generated
   */
  EReference getAufruf_Methode();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean <em>Stateless Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stateless Session Bean</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean
   * @generated
   */
  EClass getStatelessSessionBean();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methode</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean#getMethode()
   * @see #getStatelessSessionBean()
   * @generated
   */
  EReference getStatelessSessionBean_Methode();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity <em>JPA Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JPA Entity</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity
   * @generated
   */
  EClass getJPAEntity();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getName()
   * @see #getJPAEntity()
   * @generated
   */
  EAttribute getJPAEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getAttribute()
   * @see #getJPAEntity()
   * @generated
   */
  EReference getJPAEntity_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methode</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity#getMethode()
   * @see #getJPAEntity()
   * @generated
   */
  EReference getJPAEntity_Methode();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean <em>Message Driven Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Driven Bean</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean
   * @generated
   */
  EClass getMessageDrivenBean();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean <em>Singleton Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Singleton Session Bean</em>'.
   * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean
   * @generated
   */
  EClass getSingletonSessionBean();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SwarchitekturFactory getSwarchitekturFactory();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl <em>Architektur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.ArchitekturImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getArchitektur()
     * @generated
     */
    EClass ARCHITEKTUR = eINSTANCE.getArchitektur();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITEKTUR__NAME = eINSTANCE.getArchitektur_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITEKTUR__VERSION = eINSTANCE.getArchitektur_Version();

    /**
     * The meta object literal for the '<em><b>Pakete</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITEKTUR__PAKETE = eINSTANCE.getArchitektur_Pakete();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.PackageImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Komponenten</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__KOMPONENTEN = eINSTANCE.getPackage_Komponenten();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENTITIES = eINSTANCE.getPackage_Entities();

    /**
     * The meta object literal for the '<em><b>Pakete</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PAKETE = eINSTANCE.getPackage_Pakete();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.EJBImpl <em>EJB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.EJBImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getEJB()
     * @generated
     */
    EClass EJB = eINSTANCE.getEJB();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__NAME = eINSTANCE.getEJB_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SessionBeanImpl <em>Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SessionBeanImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getSessionBean()
     * @generated
     */
    EClass SESSION_BEAN = eINSTANCE.getSessionBean();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.BusinessInterfaceImpl <em>Business Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.BusinessInterfaceImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getBusinessInterface()
     * @generated
     */
    EClass BUSINESS_INTERFACE = eINSTANCE.getBusinessInterface();

    /**
     * The meta object literal for the '<em><b>Methoden</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_INTERFACE__METHODEN = eINSTANCE.getBusinessInterface_Methoden();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodensignaturImpl <em>Methodensignatur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodensignaturImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMethodensignatur()
     * @generated
     */
    EClass METHODENSIGNATUR = eINSTANCE.getMethodensignatur();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODENSIGNATUR__NAME = eINSTANCE.getMethodensignatur_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatefulSessionBeanImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getStatefulSessionBean()
     * @generated
     */
    EClass STATEFUL_SESSION_BEAN = eINSTANCE.getStatefulSessionBean();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEFUL_SESSION_BEAN__ATTRIBUTE = eINSTANCE.getStatefulSessionBean_Attribute();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEFUL_SESSION_BEAN__METHODE = eINSTANCE.getStatefulSessionBean_Methode();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AttributImpl <em>Attribut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AttributImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getAttribut()
     * @generated
     */
    EClass ATTRIBUT = eINSTANCE.getAttribut();

    /**
     * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__TYP = eINSTANCE.getAttribut_Typ();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUT__NAME = eINSTANCE.getAttribut_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodeImpl <em>Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MethodeImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMethode()
     * @generated
     */
    EClass METHODE = eINSTANCE.getMethode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODE__NAME = eINSTANCE.getMethode_Name();

    /**
     * The meta object literal for the '<em><b>Aufruf</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODE__AUFRUF = eINSTANCE.getMethode_Aufruf();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl <em>Aufruf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.AufrufImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getAufruf()
     * @generated
     */
    EClass AUFRUF = eINSTANCE.getAufruf();

    /**
     * The meta object literal for the '<em><b>Objekt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUFRUF__OBJEKT = eINSTANCE.getAufruf_Objekt();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUFRUF__METHODE = eINSTANCE.getAufruf_Methode();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.StatelessSessionBeanImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getStatelessSessionBean()
     * @generated
     */
    EClass STATELESS_SESSION_BEAN = eINSTANCE.getStatelessSessionBean();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATELESS_SESSION_BEAN__METHODE = eINSTANCE.getStatelessSessionBean_Methode();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.JPAEntityImpl <em>JPA Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.JPAEntityImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getJPAEntity()
     * @generated
     */
    EClass JPA_ENTITY = eINSTANCE.getJPAEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JPA_ENTITY__NAME = eINSTANCE.getJPAEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPA_ENTITY__ATTRIBUTE = eINSTANCE.getJPAEntity_Attribute();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPA_ENTITY__METHODE = eINSTANCE.getJPAEntity_Methode();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.MessageDrivenBeanImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getMessageDrivenBean()
     * @generated
     */
    EClass MESSAGE_DRIVEN_BEAN = eINSTANCE.getMessageDrivenBean();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SingletonSessionBeanImpl <em>Singleton Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SingletonSessionBeanImpl
     * @see de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl.SwarchitekturPackageImpl#getSingletonSessionBean()
     * @generated
     */
    EClass SINGLETON_SESSION_BEAN = eINSTANCE.getSingletonSessionBean();

  }

} //SwarchitekturPackage
