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
package edu.cmu.sei.eebm.eEBM.impl;

import edu.cmu.sei.eebm.eEBM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EEBMFactoryImpl extends EFactoryImpl implements EEBMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EEBMFactory init()
  {
    try
    {
      EEBMFactory theEEBMFactory = (EEBMFactory)EPackage.Registry.INSTANCE.getEFactory(EEBMPackage.eNS_URI);
      if (theEEBMFactory != null)
      {
        return theEEBMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EEBMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEBMFactoryImpl()
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
      case EEBMPackage.ROADMAP: return createRoadmap();
      case EEBMPackage.INTENTIONAL_ELEMENT: return createIntentionalElement();
      case EEBMPackage.REFINEMENT: return createRefinement();
      case EEBMPackage.AND_REFINEMENT: return createAndRefinement();
      case EEBMPackage.OR_REFINEMENT: return createOrRefinement();
      case EEBMPackage.CONFLICT: return createConflict();
      case EEBMPackage.GOAL: return createGoal();
      case EEBMPackage.SOFTGOAL: return createSoftgoal();
      case EEBMPackage.TASK: return createTask();
      case EEBMPackage.DESCRIPTION: return createDescription();
      case EEBMPackage.RATIONALE: return createRationale();
      case EEBMPackage.REFERENCE: return createReference();
      case EEBMPackage.PREFERENCE: return createPreference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EEBMPackage.PRIORITY_ENUM:
        return createPriorityEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EEBMPackage.PRIORITY_ENUM:
        return convertPriorityEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Roadmap createRoadmap()
  {
    RoadmapImpl roadmap = new RoadmapImpl();
    return roadmap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement createIntentionalElement()
  {
    IntentionalElementImpl intentionalElement = new IntentionalElementImpl();
    return intentionalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refinement createRefinement()
  {
    RefinementImpl refinement = new RefinementImpl();
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndRefinement createAndRefinement()
  {
    AndRefinementImpl andRefinement = new AndRefinementImpl();
    return andRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrRefinement createOrRefinement()
  {
    OrRefinementImpl orRefinement = new OrRefinementImpl();
    return orRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conflict createConflict()
  {
    ConflictImpl conflict = new ConflictImpl();
    return conflict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Softgoal createSoftgoal()
  {
    SoftgoalImpl softgoal = new SoftgoalImpl();
    return softgoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale createRationale()
  {
    RationaleImpl rationale = new RationaleImpl();
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preference createPreference()
  {
    PreferenceImpl preference = new PreferenceImpl();
    return preference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PriorityEnum createPriorityEnumFromString(EDataType eDataType, String initialValue)
  {
    PriorityEnum result = PriorityEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPriorityEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEBMPackage getEEBMPackage()
  {
    return (EEBMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EEBMPackage getPackage()
  {
    return EEBMPackage.eINSTANCE;
  }

} //EEBMFactoryImpl
