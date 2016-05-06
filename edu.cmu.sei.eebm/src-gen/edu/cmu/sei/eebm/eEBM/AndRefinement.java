/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.AndRefinement#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getAndRefinement()
 * @model
 * @generated
 */
public interface AndRefinement extends Refinement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getAndRefinement_Source()
   * @model
   * @generated
   */
  EList<IntentionalElement> getSource();

} // AndRefinement
