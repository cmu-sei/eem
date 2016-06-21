/**
 * /** Copyright (c) 2016 Carnegie Mellon University.
 * All Rights Reserved.
 * 
 *   * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY, EXCLUSIVITY,
 * OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT
 * MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK,
 * OR COPYRIGHT INFRINGEMENT.
 * 
 *   * Released under a BSD-style license, please see COPYRIGHT or contact
 * permission@sei.cmu.edu for full terms.  DM-0003721
 * 
 *   * This Software includes and/or makes use of the following
 * Third-Party Software subject to its own license:
 * a.       Eclipse libraries (https://eclipse.org/)
 * b.      Xtext https://eclipse.org/Xtext/
 * Complete information can be found in build.xml
 * 
 * 
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
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP__RELATIONS = 2;

  /**
   * The number of structural features of the '<em>Roadmap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROADMAP_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__TIME = 4;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__COST = 5;

  /**
   * The feature id for the '<em><b>Benefit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__BENEFIT = 6;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__DATE = 7;

  /**
   * The feature id for the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT__COD = 8;

  /**
   * The number of structural features of the '<em>Intentional Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENTIONAL_ELEMENT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.RefinementImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__DEST = 1;

  /**
   * The number of structural features of the '<em>Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.AndRefinementImpl <em>And Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.AndRefinementImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getAndRefinement()
   * @generated
   */
  int AND_REFINEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT__NAME = REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT__DEST = REFINEMENT__DEST;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT__SOURCE = REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.OrRefinementImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getOrRefinement()
   * @generated
   */
  int OR_REFINEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT__NAME = REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT__DEST = REFINEMENT__DEST;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT__SOURCE = REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.ConflictImpl <em>Conflict</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.ConflictImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getConflict()
   * @generated
   */
  int CONFLICT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT__DEST = 2;

  /**
   * The number of structural features of the '<em>Conflict</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFLICT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.GoalImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 6;

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
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = INTENTIONAL_ELEMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TIME = INTENTIONAL_ELEMENT__TIME;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__COST = INTENTIONAL_ELEMENT__COST;

  /**
   * The feature id for the '<em><b>Benefit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__BENEFIT = INTENTIONAL_ELEMENT__BENEFIT;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DATE = INTENTIONAL_ELEMENT__DATE;

  /**
   * The feature id for the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__COD = INTENTIONAL_ELEMENT__COD;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REF = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.SoftgoalImpl <em>Softgoal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.SoftgoalImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getSoftgoal()
   * @generated
   */
  int SOFTGOAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__TITLE = INTENTIONAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__PRIORITY = INTENTIONAL_ELEMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__TIME = INTENTIONAL_ELEMENT__TIME;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__COST = INTENTIONAL_ELEMENT__COST;

  /**
   * The feature id for the '<em><b>Benefit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__BENEFIT = INTENTIONAL_ELEMENT__BENEFIT;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__DATE = INTENTIONAL_ELEMENT__DATE;

  /**
   * The feature id for the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__COD = INTENTIONAL_ELEMENT__COD;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__RATIONALE = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL__REF = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Softgoal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFTGOAL_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.TaskImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getTask()
   * @generated
   */
  int TASK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = INTENTIONAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TITLE = INTENTIONAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = INTENTIONAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PRIORITY = INTENTIONAL_ELEMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TIME = INTENTIONAL_ELEMENT__TIME;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COST = INTENTIONAL_ELEMENT__COST;

  /**
   * The feature id for the '<em><b>Benefit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__BENEFIT = INTENTIONAL_ELEMENT__BENEFIT;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DATE = INTENTIONAL_ELEMENT__DATE;

  /**
   * The feature id for the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COD = INTENTIONAL_ELEMENT__COD;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.DescriptionImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 9;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.RationaleImpl <em>Rationale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.RationaleImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRationale()
   * @generated
   */
  int RATIONALE = 10;

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
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.ReferenceImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DOC_REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl <em>Preference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl
   * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getPreference()
   * @generated
   */
  int PREFERENCE = 12;

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
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap#getRelations()
   * @see #getRoadmap()
   * @generated
   */
  EReference getRoadmap_Relations();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getPriority()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Priority();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getTime()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Time();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getCost()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Cost();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getBenefit <em>Benefit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Benefit</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getBenefit()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Benefit();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getDate()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Date();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCod <em>Cod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cod</em>'.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement#getCod()
   * @see #getIntentionalElement()
   * @generated
   */
  EAttribute getIntentionalElement_Cod();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refinement</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Refinement
   * @generated
   */
  EClass getRefinement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Refinement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Refinement#getName()
   * @see #getRefinement()
   * @generated
   */
  EAttribute getRefinement_Name();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.eebm.eEBM.Refinement#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dest</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Refinement#getDest()
   * @see #getRefinement()
   * @generated
   */
  EReference getRefinement_Dest();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.AndRefinement <em>And Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Refinement</em>'.
   * @see edu.cmu.sei.eebm.eEBM.AndRefinement
   * @generated
   */
  EClass getAndRefinement();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.eebm.eEBM.AndRefinement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see edu.cmu.sei.eebm.eEBM.AndRefinement#getSource()
   * @see #getAndRefinement()
   * @generated
   */
  EReference getAndRefinement_Source();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.OrRefinement <em>Or Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Refinement</em>'.
   * @see edu.cmu.sei.eebm.eEBM.OrRefinement
   * @generated
   */
  EClass getOrRefinement();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.OrRefinement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see edu.cmu.sei.eebm.eEBM.OrRefinement#getSource()
   * @see #getOrRefinement()
   * @generated
   */
  EReference getOrRefinement_Source();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Conflict <em>Conflict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conflict</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Conflict
   * @generated
   */
  EClass getConflict();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Conflict#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Conflict#getName()
   * @see #getConflict()
   * @generated
   */
  EAttribute getConflict_Name();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Conflict#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Conflict#getSource()
   * @see #getConflict()
   * @generated
   */
  EReference getConflict_Source();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.eebm.eEBM.Conflict#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Conflict#getDest()
   * @see #getConflict()
   * @generated
   */
  EReference getConflict_Dest();

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
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Goal#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Goal#getRef()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Ref();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Softgoal <em>Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Softgoal</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Softgoal
   * @generated
   */
  EClass getSoftgoal();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rationale</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Softgoal#getRationale()
   * @see #getSoftgoal()
   * @generated
   */
  EReference getSoftgoal_Rationale();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Softgoal#getRef()
   * @see #getSoftgoal()
   * @generated
   */
  EReference getSoftgoal_Ref();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Task
   * @generated
   */
  EClass getTask();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.eebm.eEBM.Description#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Description#getText()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Text();

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
   * Returns the meta object for class '{@link edu.cmu.sei.eebm.eEBM.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.eebm.eEBM.Reference#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.eebm.eEBM.Reference#getDocReference()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_DocReference();

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
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROADMAP__RELATIONS = eINSTANCE.getRoadmap_Relations();

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
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__PRIORITY = eINSTANCE.getIntentionalElement_Priority();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__TIME = eINSTANCE.getIntentionalElement_Time();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__COST = eINSTANCE.getIntentionalElement_Cost();

    /**
     * The meta object literal for the '<em><b>Benefit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__BENEFIT = eINSTANCE.getIntentionalElement_Benefit();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__DATE = eINSTANCE.getIntentionalElement_Date();

    /**
     * The meta object literal for the '<em><b>Cod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENTIONAL_ELEMENT__COD = eINSTANCE.getIntentionalElement_Cod();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.RefinementImpl <em>Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.RefinementImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getRefinement()
     * @generated
     */
    EClass REFINEMENT = eINSTANCE.getRefinement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFINEMENT__NAME = eINSTANCE.getRefinement_Name();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINEMENT__DEST = eINSTANCE.getRefinement_Dest();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.AndRefinementImpl <em>And Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.AndRefinementImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getAndRefinement()
     * @generated
     */
    EClass AND_REFINEMENT = eINSTANCE.getAndRefinement();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_REFINEMENT__SOURCE = eINSTANCE.getAndRefinement_Source();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.OrRefinementImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getOrRefinement()
     * @generated
     */
    EClass OR_REFINEMENT = eINSTANCE.getOrRefinement();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_REFINEMENT__SOURCE = eINSTANCE.getOrRefinement_Source();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.ConflictImpl <em>Conflict</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.ConflictImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getConflict()
     * @generated
     */
    EClass CONFLICT = eINSTANCE.getConflict();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFLICT__NAME = eINSTANCE.getConflict_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFLICT__SOURCE = eINSTANCE.getConflict_Source();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFLICT__DEST = eINSTANCE.getConflict_Dest();

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
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__RATIONALE = eINSTANCE.getGoal_Rationale();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__REF = eINSTANCE.getGoal_Ref();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.SoftgoalImpl <em>Softgoal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.SoftgoalImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getSoftgoal()
     * @generated
     */
    EClass SOFTGOAL = eINSTANCE.getSoftgoal();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFTGOAL__RATIONALE = eINSTANCE.getSoftgoal_Rationale();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFTGOAL__REF = eINSTANCE.getSoftgoal_Ref();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.TaskImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

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
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

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
     * The meta object literal for the '{@link edu.cmu.sei.eebm.eEBM.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.eebm.eEBM.impl.ReferenceImpl
     * @see edu.cmu.sei.eebm.eEBM.impl.EEBMPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__DOC_REFERENCE = eINSTANCE.getReference_DocReference();

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
