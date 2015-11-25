/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Goal#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Goal#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Goal#getDocReference <em>Doc Reference</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends IntentionalElement
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Goal)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getGoal_SuperType()
   * @model
   * @generated
   */
  Goal getSuperType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Goal#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Goal value);

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' containment reference.
   * @see #setRationale(Rationale)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getGoal_Rationale()
   * @model containment="true"
   * @generated
   */
  Rationale getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Goal#getRationale <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' containment reference.
   * @see #getRationale()
   * @generated
   */
  void setRationale(Rationale value);

  /**
   * Returns the value of the '<em><b>Doc Reference</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Reference</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Reference</em>' attribute list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getGoal_DocReference()
   * @model unique="false"
   * @generated
   */
  EList<String> getDocReference();

} // Goal
