/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.RoadmapImpl <em>Roadmap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.RoadmapImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRoadmap()
   * @generated
   */
  int ROADMAP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP__COMPONENTS = 1;

  /**
   * The feature id for the '<em><b>People</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP__PEOPLE = 2;

  /**
   * The feature id for the '<em><b>Trajectories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP__TRAJECTORIES = 3;

  /**
   * The number of structural features of the '<em>Roadmap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getIntentionalElement()
   * @generated
   */
  int INTENTIONAL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.PathImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPath()
   * @generated
   */
  int PATH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__PATH = 1;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.OptionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getOption()
   * @generated
   */
  int OPTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TITLE = INTENTIONAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__REFINES_REFERENCE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__CONFLICTS_REFERENCE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__PRIORITY = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__TIME = INTENTIONAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__COST = INTENTIONAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__DATE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__COD = INTENTIONAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.StakeholderImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = 0;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.ParticipantImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__NAME = STAKEHOLDER__NAME;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__PREFERENCES = STAKEHOLDER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = STAKEHOLDER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.ConsultantImpl <em>Consultant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.ConsultantImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getConsultant()
   * @generated
   */
  int CONSULTANT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSULTANT__NAME = STAKEHOLDER__NAME;

  /**
   * The number of structural features of the '<em>Consultant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSULTANT_FEATURE_COUNT = STAKEHOLDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl <em>Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.DecisionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDecision()
   * @generated
   */
  int DECISION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__NAME = 0;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__RATIONALE = 1;

  /**
   * The feature id for the '<em><b>Responsible</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__RESPONSIBLE = 2;

  /**
   * The feature id for the '<em><b>Response measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__RESPONSE_MEASURE = 3;

  /**
   * The feature id for the '<em><b>Due</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__DUE = 4;

  /**
   * The feature id for the '<em><b>Options</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION__OPTIONS = 5;

  /**
   * The number of structural features of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl <em>Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPreference()
   * @generated
   */
  int PREFERENCE = 8;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__FIRST = 0;

  /**
   * The feature id for the '<em><b>Last</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE__LAST = 1;

  /**
   * The number of structural features of the '<em>Preference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.GoalImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = INTENTIONAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SUPER_TYPE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 10;

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
  int DESCRIPTION_ELEMENT = 11;

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
  int RATIONALE = 12;

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
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.PriorityEnum <em>Priority Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.PriorityEnum
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPriorityEnum()
   * @generated
   */
  int PRIORITY_ENUM = 13;


  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Roadmap <em>Roadmap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Roadmap</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap
   * @generated
   */
  EClass getRoadmap();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap#getName()
   * @see #getRoadmap()
   * @generated
   */
  EAttribute getRoadmap_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap#getComponents()
   * @see #getRoadmap()
   * @generated
   */
  EReference getRoadmap_Components();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getPeople <em>People</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>People</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap#getPeople()
   * @see #getRoadmap()
   * @generated
   */
  EReference getRoadmap_People();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getTrajectories <em>Trajectories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trajectories</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap#getTrajectories()
   * @see #getRoadmap()
   * @generated
   */
  EReference getRoadmap_Trajectories();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement <em>Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intentional Element</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement
   * @generated
   */
  EClass getIntentionalElement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getName()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getTitle()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Title();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getDescription()
   * @see #getIntentionalElement()
   * @generated
   */
  EReference getIntentionalElement_Description();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Path#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Path#getName()
   * @see #getPath()
   * @generated
   */
  EAttribute getPath_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Path#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Path</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Path#getPath()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Path();

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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.eebm.eEBM.Option#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getRefinesReference()
   * @see #getOption()
   * @generated
   */
  EReference getOption_RefinesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.eebm.eEBM.Option#getConflictsReference <em>Conflicts Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conflicts Reference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getConflictsReference()
   * @see #getOption()
   * @generated
   */
  EReference getOption_ConflictsReference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getPriority()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Priority();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getTime()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Time();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getCost()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Cost();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getDate()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Date();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Option#getCod <em>Cod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cod</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Option#getCod()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Cod();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Stakeholder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Stakeholder#getName()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Name();

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
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Participant#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Preferences</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Participant#getPreferences()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_Preferences();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Consultant <em>Consultant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consultant</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Consultant
   * @generated
   */
  EClass getConsultant();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision
   * @generated
   */
  EClass getDecision();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Decision#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getName()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Decision#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getRationale()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_Rationale();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Decision#getResponsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Responsible</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getResponsible()
   * @see #getDecision()
   * @generated
   */
  EReference getDecision_Responsible();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Decision#getResponse_measure <em>Response measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response measure</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getResponse_measure()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_Response_measure();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Decision#getDue <em>Due</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Due</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getDue()
   * @see #getDecision()
   * @generated
   */
  EAttribute getDecision_Due();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.eebm.eEBM.Decision#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Options</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Decision#getOptions()
   * @see #getDecision()
   * @generated
   */
  EReference getDecision_Options();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Preference <em>Preference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Preference
   * @generated
   */
  EClass getPreference();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Preference#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Preference#getFirst()
   * @see #getPreference()
   * @generated
   */
  EReference getPreference_First();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Preference#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Last</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Preference#getLast()
   * @see #getPreference()
   * @generated
   */
  EReference getPreference_Last();

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
   * Returns the meta object for enum '{@link edu.cmu.sei.eebm.eEBM.PriorityEnum <em>Priority Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Priority Enum</em>'.
   * @see edu.cmu.sei.eebm.eEBM.PriorityEnum
   * @generated
   */
  EEnum getPriorityEnum();

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
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.RoadmapImpl <em>Roadmap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.RoadmapImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRoadmap()
     * @generated
     */
    EClass ROADMAP = eINSTANCE.getRoadmap();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROADMAP__NAME = eINSTANCE.getRoadmap_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROADMAP__COMPONENTS = eINSTANCE.getRoadmap_Components();

    /**
     * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROADMAP__PEOPLE = eINSTANCE.getRoadmap_People();

    /**
     * The meta object literal for the '<em><b>Trajectories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROADMAP__TRAJECTORIES = eINSTANCE.getRoadmap_Trajectories();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getIntentionalElement()
     * @generated
     */
    EClass INTENTIONAL_ELEMENT = eINSTANCE.getIntentionalElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__NAME = eINSTANCE.getIntentionalElement_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__TITLE = eINSTANCE.getIntentionalElement_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENTIONAL_ELEMENT__DESCRIPTION = eINSTANCE.getIntentionalElement_Description();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.PathImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH__NAME = eINSTANCE.getPath_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__PATH = eINSTANCE.getPath_Path();

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
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__REFINES_REFERENCE = eINSTANCE.getOption_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Conflicts Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__CONFLICTS_REFERENCE = eINSTANCE.getOption_ConflictsReference();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__PRIORITY = eINSTANCE.getOption_Priority();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__TIME = eINSTANCE.getOption_Time();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__COST = eINSTANCE.getOption_Cost();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__DATE = eINSTANCE.getOption_Date();

    /**
     * The meta object literal for the '<em><b>Cod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__COD = eINSTANCE.getOption_Cod();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.StakeholderImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

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
     * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__PREFERENCES = eINSTANCE.getParticipant_Preferences();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.ConsultantImpl <em>Consultant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.ConsultantImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getConsultant()
     * @generated
     */
    EClass CONSULTANT = eINSTANCE.getConsultant();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl <em>Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.DecisionImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDecision()
     * @generated
     */
    EClass DECISION = eINSTANCE.getDecision();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__NAME = eINSTANCE.getDecision_Name();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__RATIONALE = eINSTANCE.getDecision_Rationale();

    /**
     * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION__RESPONSIBLE = eINSTANCE.getDecision_Responsible();

    /**
     * The meta object literal for the '<em><b>Response measure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__RESPONSE_MEASURE = eINSTANCE.getDecision_Response_measure();

    /**
     * The meta object literal for the '<em><b>Due</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECISION__DUE = eINSTANCE.getDecision_Due();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION__OPTIONS = eINSTANCE.getDecision_Options();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl <em>Preference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPreference()
     * @generated
     */
    EClass PREFERENCE = eINSTANCE.getPreference();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE__FIRST = eINSTANCE.getPreference_First();

    /**
     * The meta object literal for the '<em><b>Last</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFERENCE__LAST = eINSTANCE.getPreference_Last();

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
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__SUPER_TYPE = eINSTANCE.getGoal_SuperType();

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

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.PriorityEnum <em>Priority Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.PriorityEnum
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPriorityEnum()
     * @generated
     */
    EEnum PRIORITY_ENUM = eINSTANCE.getPriorityEnum();

  }

} //EEBMPackage
