/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roadmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getPeople <em>People</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getTrajectories <em>Trajectories</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap()
 * @model
 * @generated
 */
public interface Roadmap extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Components()
   * @model containment="true"
   * @generated
   */
  EList<IntentionalElement> getComponents();

  /**
   * Returns the value of the '<em><b>People</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>People</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>People</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_People()
   * @model containment="true"
   * @generated
   */
  EList<Stakeholder> getPeople();

  /**
   * Returns the value of the '<em><b>Trajectories</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trajectories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trajectories</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Trajectories()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTrajectories();

} // Roadmap
