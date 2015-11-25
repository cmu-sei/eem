/**
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
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseStakeholder(Stakeholder object)
      {
        return createStakeholderAdapter();
      }
      @Override
      public Adapter caseParticipant(Participant object)
      {
        return createParticipantAdapter();
      }
      @Override
      public Adapter caseConsultant(Consultant object)
      {
        return createConsultantAdapter();
      }
      @Override
      public Adapter caseDecision(Decision object)
      {
        return createDecisionAdapter();
      }
      @Override
      public Adapter casePreference(Preference object)
      {
        return createPreferenceAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseDescriptionElement(DescriptionElement object)
      {
        return createDescriptionElementAdapter();
      }
      @Override
      public Adapter caseRationale(Rationale object)
      {
        return createRationaleAdapter();
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
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Participant
   * @generated
   */
  public Adapter createParticipantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Consultant <em>Consultant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Consultant
   * @generated
   */
  public Adapter createConsultantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.Decision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.Decision
   * @generated
   */
  public Adapter createDecisionAdapter()
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
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.eebm.eEBM.DescriptionElement <em>Description Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.eebm.eEBM.DescriptionElement
   * @generated
   */
  public Adapter createDescriptionElementAdapter()
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
