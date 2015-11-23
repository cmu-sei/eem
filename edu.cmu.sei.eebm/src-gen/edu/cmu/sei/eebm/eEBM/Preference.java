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
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(Option)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_First()
   * @model containment="true"
   * @generated
   */
  Option getFirst();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Option value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' containment reference.
   * @see #setLast(Option)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_Last()
   * @model containment="true"
   * @generated
   */
  Option getLast();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getLast <em>Last</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' containment reference.
   * @see #getLast()
   * @generated
   */
  void setLast(Option value);

} // Preference
