/**
 */
package de.uniba.wiai.seda.fha.annotation.annotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.uniba.wiai.seda.fha.annotation.annotation.AnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "annotation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniba.de/wiai/seda/fha/annotation/Annotation";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "annotation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnnotationPackage eINSTANCE = de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationImpl
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.NameImpl
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getName_()
   * @generated
   */
  int NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.MergeImpl <em>Merge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.MergeImpl
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getMerge()
   * @generated
   */
  int MERGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__NAME = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Merge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.IgnoreImpl <em>Ignore</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.IgnoreImpl
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getIgnore()
   * @generated
   */
  int IGNORE = 3;

  /**
   * The number of structural features of the '<em>Ignore</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGNORE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.VersionImpl
   * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__VERSION = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.annotation.annotation.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.annotation.annotation.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.annotation.annotation.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.annotation.annotation.Merge <em>Merge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Merge</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Merge
   * @generated
   */
  EClass getMerge();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.annotation.annotation.Merge#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Merge#getName()
   * @see #getMerge()
   * @generated
   */
  EAttribute getMerge_Name();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.annotation.annotation.Ignore <em>Ignore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ignore</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Ignore
   * @generated
   */
  EClass getIgnore();

  /**
   * Returns the meta object for class '{@link de.uniba.wiai.seda.fha.annotation.annotation.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link de.uniba.wiai.seda.fha.annotation.annotation.Version#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see de.uniba.wiai.seda.fha.annotation.annotation.Version#getVersion()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Version();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AnnotationFactory getAnnotationFactory();

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
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationImpl
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.NameImpl
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.MergeImpl <em>Merge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.MergeImpl
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getMerge()
     * @generated
     */
    EClass MERGE = eINSTANCE.getMerge();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERGE__NAME = eINSTANCE.getMerge_Name();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.IgnoreImpl <em>Ignore</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.IgnoreImpl
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getIgnore()
     * @generated
     */
    EClass IGNORE = eINSTANCE.getIgnore();

    /**
     * The meta object literal for the '{@link de.uniba.wiai.seda.fha.annotation.annotation.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.VersionImpl
     * @see de.uniba.wiai.seda.fha.annotation.annotation.impl.AnnotationPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__VERSION = eINSTANCE.getVersion_Version();

  }

} //AnnotationPackage
