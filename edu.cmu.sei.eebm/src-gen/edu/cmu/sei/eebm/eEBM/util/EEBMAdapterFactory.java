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
package edu.cmu.sei.eebm.eEBM.util;

import edu.cmu.sei.eebm.eEBM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage
 * @generated
 */
public class EEBMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EEBMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEBMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EEBMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EEBMSwitch<Adapter> modelSwitch =
    new EEBMSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoadmap(Roadmap object)
      {
        return createRoadmapAdapter();
      }
      @Override
      public Adapter caseIntentionalElement(IntentionalElement object)
      {
        return createIntentionalElementAdapter();
      }
      @Override
      public Adapter caseRefinement(Refinement object)
      {
        return createRefinementAdapter();
      }
      @Override
      public Adapter caseAndRefinement(AndRefinement object)
      {
        return createAndRefinementAdapter();
      }
      @Override
      public Adapter caseOrRefinement(OrRefinement object)
      {
        return createOrRefinementAdapter();
      }
      @Override
      public Adapter caseConflict(Conflict object)
      {
        return createConflictAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseSoftgoal(Softgoal object)
      {
        return createSoftgoalAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseRationale(Rationale object)
      {
        return createRationaleAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter casePreference(Preference object)
      {
        return createPreferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Roadmap <em>Roadmap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Roadmap
   * @generated
   */
  public Adapter createRoadmapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement <em>Intentional Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.IntentionalElement
   * @generated
   */
  public Adapter createIntentionalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Refinement
   * @generated
   */
  public Adapter createRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.AndRefinement <em>And Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.AndRefinement
   * @generated
   */
  public Adapter createAndRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.OrRefinement <em>Or Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.OrRefinement
   * @generated
   */
  public Adapter createOrRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Conflict <em>Conflict</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Conflict
   * @generated
   */
  public Adapter createConflictAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Softgoal <em>Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Softgoal
   * @generated
   */
  public Adapter createSoftgoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Rationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Rationale
   * @generated
   */
  public Adapter createRationaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Preference <em>Preference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Preference
   * @generated
   */
  public Adapter createPreferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EEBMAdapterFactory
