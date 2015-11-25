/**
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
      case EEBMPackage.PATH: return createPath();
      case EEBMPackage.OPTION: return createOption();
      case EEBMPackage.STAKEHOLDER: return createStakeholder();
      case EEBMPackage.PARTICIPANT: return createParticipant();
      case EEBMPackage.CONSULTANT: return createConsultant();
      case EEBMPackage.DECISION: return createDecision();
      case EEBMPackage.PREFERENCE: return createPreference();
      case EEBMPackage.GOAL: return createGoal();
      case EEBMPackage.DESCRIPTION: return createDescription();
      case EEBMPackage.DESCRIPTION_ELEMENT: return createDescriptionElement();
      case EEBMPackage.RATIONALE: return createRationale();
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
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder createStakeholder()
  {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipant()
  {
    ParticipantImpl participant = new ParticipantImpl();
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consultant createConsultant()
  {
    ConsultantImpl consultant = new ConsultantImpl();
    return consultant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decision createDecision()
  {
    DecisionImpl decision = new DecisionImpl();
    return decision;
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
  public DescriptionElement createDescriptionElement()
  {
    DescriptionElementImpl descriptionElement = new DescriptionElementImpl();
    return descriptionElement;
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
