/**
 */
package de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.impl;

import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.EJB;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturFactory;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;

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
public class SwarchitekturFactoryImpl extends EFactoryImpl implements SwarchitekturFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SwarchitekturFactory init()
  {
    try
    {
      SwarchitekturFactory theSwarchitekturFactory = (SwarchitekturFactory)EPackage.Registry.INSTANCE.getEFactory(SwarchitekturPackage.eNS_URI);
      if (theSwarchitekturFactory != null)
      {
        return theSwarchitekturFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SwarchitekturFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwarchitekturFactoryImpl()
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
      case SwarchitekturPackage.ARCHITEKTUR: return createArchitektur();
      case SwarchitekturPackage.PACKAGE: return createPackage();
      case SwarchitekturPackage.EJB: return createEJB();
      case SwarchitekturPackage.SESSION_BEAN: return createSessionBean();
      case SwarchitekturPackage.BUSINESS_INTERFACE: return createBusinessInterface();
      case SwarchitekturPackage.METHODENSIGNATUR: return createMethodensignatur();
      case SwarchitekturPackage.STATEFUL_SESSION_BEAN: return createStatefulSessionBean();
      case SwarchitekturPackage.ATTRIBUT: return createAttribut();
      case SwarchitekturPackage.METHODE: return createMethode();
      case SwarchitekturPackage.AUFRUF: return createAufruf();
      case SwarchitekturPackage.STATELESS_SESSION_BEAN: return createStatelessSessionBean();
      case SwarchitekturPackage.JPA_ENTITY: return createJPAEntity();
      case SwarchitekturPackage.MESSAGE_DRIVEN_BEAN: return createMessageDrivenBean();
      case SwarchitekturPackage.SINGLETON_SESSION_BEAN: return createSingletonSessionBean();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architektur createArchitektur()
  {
    ArchitekturImpl architektur = new ArchitekturImpl();
    return architektur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EJB createEJB()
  {
    EJBImpl ejb = new EJBImpl();
    return ejb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SessionBean createSessionBean()
  {
    SessionBeanImpl sessionBean = new SessionBeanImpl();
    return sessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessInterface createBusinessInterface()
  {
    BusinessInterfaceImpl businessInterface = new BusinessInterfaceImpl();
    return businessInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodensignatur createMethodensignatur()
  {
    MethodensignaturImpl methodensignatur = new MethodensignaturImpl();
    return methodensignatur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatefulSessionBean createStatefulSessionBean()
  {
    StatefulSessionBeanImpl statefulSessionBean = new StatefulSessionBeanImpl();
    return statefulSessionBean;
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
  public Methode createMethode()
  {
    MethodeImpl methode = new MethodeImpl();
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aufruf createAufruf()
  {
    AufrufImpl aufruf = new AufrufImpl();
    return aufruf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatelessSessionBean createStatelessSessionBean()
  {
    StatelessSessionBeanImpl statelessSessionBean = new StatelessSessionBeanImpl();
    return statelessSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAEntity createJPAEntity()
  {
    JPAEntityImpl jpaEntity = new JPAEntityImpl();
    return jpaEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageDrivenBean createMessageDrivenBean()
  {
    MessageDrivenBeanImpl messageDrivenBean = new MessageDrivenBeanImpl();
    return messageDrivenBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingletonSessionBean createSingletonSessionBean()
  {
    SingletonSessionBeanImpl singletonSessionBean = new SingletonSessionBeanImpl();
    return singletonSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwarchitekturPackage getSwarchitekturPackage()
  {
    return (SwarchitekturPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SwarchitekturPackage getPackage()
  {
    return SwarchitekturPackage.eINSTANCE;
  }

} //SwarchitekturFactoryImpl
