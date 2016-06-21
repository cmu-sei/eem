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
   * Returns a new object of class '<em>Intentional Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intentional Element</em>'.
   * @generated
   */
  IntentionalElement createIntentionalElement();

  /**
   * Returns a new object of class '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refinement</em>'.
   * @generated
   */
  Refinement createRefinement();

  /**
   * Returns a new object of class '<em>And Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Refinement</em>'.
   * @generated
   */
  AndRefinement createAndRefinement();

  /**
   * Returns a new object of class '<em>Or Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Refinement</em>'.
   * @generated
   */
  OrRefinement createOrRefinement();

  /**
   * Returns a new object of class '<em>Conflict</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conflict</em>'.
   * @generated
   */
  Conflict createConflict();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Softgoal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Softgoal</em>'.
   * @generated
   */
  Softgoal createSoftgoal();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Rationale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rationale</em>'.
   * @generated
   */
  Rationale createRationale();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Preference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preference</em>'.
   * @generated
   */
  Preference createPreference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EEBMPackage getEEBMPackage();

} //EEBMFactory
