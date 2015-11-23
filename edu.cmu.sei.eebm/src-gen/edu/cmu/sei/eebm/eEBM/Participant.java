/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Participant#getPreferences <em>Preferences</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends Stakeholder
{
  /**
   * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.Preference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preferences</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getParticipant_Preferences()
   * @model containment="true"
   * @generated
   */
  EList<Preference> getPreferences();

} // Participant
