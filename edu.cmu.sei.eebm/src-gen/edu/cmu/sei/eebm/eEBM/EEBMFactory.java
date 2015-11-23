/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage
 * @generated
 */
public interface EEBMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EEBMFactory eINSTANCE = edu.cmu.sei.eebm.eEBM.impl.EEBMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Roadmap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Roadmap</em>'.
   * @generated
   */
  Roadmap createRoadmap();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stakeholder</em>'.
   * @generated
   */
  Stakeholder createStakeholder();

  /**
   * Returns a new object of class '<em>Participant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant</em>'.
   * @generated
   */
  Participant createParticipant();

  /**
   * Returns a new object of class '<em>Consultant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Consultant</em>'.
   * @generated
   */
  Consultant createConsultant();

  /**
   * Returns a new object of class '<em>Preference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preference</em>'.
   * @generated
   */
  Preference createPreference();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Description Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description Element</em>'.
   * @generated
   */
  DescriptionElement createDescriptionElement();

  /**
   * Returns a new object of class '<em>Rationale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rationale</em>'.
   * @generated
   */
  Rationale createRationale();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EEBMPackage getEEBMPackage();

} //EEBMFactory
