/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Preference#getFirst <em>First</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Preference#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference()
 * @model
 * @generated
 */
public interface Preference extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_First()
   * @model
   * @generated
   */
  IntentionalElement getFirst();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(IntentionalElement value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' reference.
   * @see #setLast(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_Last()
   * @model
   * @generated
   */
  IntentionalElement getLast();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getLast <em>Last</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' reference.
   * @see #getLast()
   * @generated
   */
  void setLast(IntentionalElement value);

} // Preference
