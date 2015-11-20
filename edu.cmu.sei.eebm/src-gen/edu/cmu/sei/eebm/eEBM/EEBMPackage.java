/**
 */
package edu.cmu.sei.eebm.eEBM;

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
 * @see edu.cmu.sei.eebm.eEBM.EEBMFactory
 * @model kind="package"
 * @generated
 */
public interface EEBMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eEBM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmu.edu/sei/eebm/EEBM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eEBM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EEBMPackage eINSTANCE = edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.PlanImpl <em>Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.PlanImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPlan()
   * @generated
   */
  int PLAN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__PARTS = 1;

  /**
   * The number of structural features of the '<em>Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.OptionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getOption()
   * @generated
   */
  int OPTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__NAME = 0;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.GoalImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SUPER_TYPE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = 4;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ISSUES = 6;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionElementImpl <em>Description Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionElementImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescriptionElement()
   * @generated
   */
  int DESCRIPTION_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Description Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.RationaleImpl <em>Rationale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.RationaleImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRationale()
   * @generated
   */
  int RATIONALE = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__TEXT = 0;

  /**
   * The number of structural features of the '<em>Rationale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Plan <em>Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plan</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Plan
   * @generated
   */
  EClass getPlan();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Plan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Plan#getName()
   * @see #getPlan()
   * @generated
   */
  EAttribute getPlan_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Plan#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Plan#getParts()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Parts();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getName()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getTitle()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Title();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Option#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getDescription()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Description();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Participant
   * @generated
   */
  EClass getParticipant();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Participant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Participant#getName()
   * @see #getParticipant()
   * @generated
   */
  EAttribute getParticipant_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Goal#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getTitle()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Title();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Goal#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getSuperType()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Goal#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getDescription()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Description();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Goal#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getRationale()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.eebm.eEBM.Goal#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getDocReference()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_DocReference();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.eebm.eEBM.Goal#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getIssues()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Issues();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Description#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Description#getDescription()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Description();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.DescriptionElement <em>Description Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Element</em>'.
   * @see edu.cmu.sei.eebm.eEBM.DescriptionElement
   * @generated
   */
  EClass getDescriptionElement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.DescriptionElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see edu.cmu.sei.eebm.eEBM.DescriptionElement#getText()
   * @see #getDescriptionElement()
   * @generated
   */
  EAttribute getDescriptionElement_Text();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Rationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rationale</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Rationale
   * @generated
   */
  EClass getRationale();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Rationale#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Rationale#getText()
   * @see #getRationale()
   * @generated
   */
  EAttribute getRationale_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EEBMFactory getEEBMFactory();

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
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.PlanImpl <em>Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.PlanImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPlan()
     * @generated
     */
    EClass PLAN = eINSTANCE.getPlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__PARTS = eINSTANCE.getPlan_Parts();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.OptionImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__TITLE = eINSTANCE.getOption_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__DESCRIPTION = eINSTANCE.getOption_Description();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getParticipant()
     * @generated
     */
    EClass PARTICIPANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.GoalImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__TITLE = eINSTANCE.getGoal_Title();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__SUPER_TYPE = eINSTANCE.getGoal_SuperType();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__RATIONALE = eINSTANCE.getGoal_Rationale();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__DOC_REFERENCE = eINSTANCE.getGoal_DocReference();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ISSUES = eINSTANCE.getGoal_Issues();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionElementImpl <em>Description Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionElementImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescriptionElement()
     * @generated
     */
    EClass DESCRIPTION_ELEMENT = eINSTANCE.getDescriptionElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION_ELEMENT__TEXT = eINSTANCE.getDescriptionElement_Text();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.RationaleImpl <em>Rationale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.RationaleImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRationale()
     * @generated
     */
    EClass RATIONALE = eINSTANCE.getRationale();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATIONALE__TEXT = eINSTANCE.getRationale_Text();

  }

} //EEBMPackage
