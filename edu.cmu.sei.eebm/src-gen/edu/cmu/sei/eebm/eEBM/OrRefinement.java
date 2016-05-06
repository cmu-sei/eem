/**
 */
package edu.cmu.sei.eebm.eEBM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.OrRefinement#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOrRefinement()
 * @model
 * @generated
 */
public interface OrRefinement extends Refinement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOrRefinement_Source()
   * @model
   * @generated
   */
  IntentionalElement getSource();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.OrRefinement#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(IntentionalElement value);

} // OrRefinement
