/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getResponse_measure <em>Response measure</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getDue <em>Due</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Decision#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Decision#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' attribute.
   * @see #setRationale(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Decision#getRationale <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' attribute.
   * @see #getRationale()
   * @generated
   */
  void setRationale(String value);

  /**
   * Returns the value of the '<em><b>Responsible</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsible</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsible</em>' reference.
   * @see #setResponsible(Stakeholder)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Responsible()
   * @model
   * @generated
   */
  Stakeholder getResponsible();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Decision#getResponsible <em>Responsible</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsible</em>' reference.
   * @see #getResponsible()
   * @generated
   */
  void setResponsible(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Response measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response measure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response measure</em>' attribute.
   * @see #setResponse_measure(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Response_measure()
   * @model
   * @generated
   */
  String getResponse_measure();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Decision#getResponse_measure <em>Response measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response measure</em>' attribute.
   * @see #getResponse_measure()
   * @generated
   */
  void setResponse_measure(String value);

  /**
   * Returns the value of the '<em><b>Due</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Due</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Due</em>' attribute.
   * @see #setDue(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Due()
   * @model
   * @generated
   */
  String getDue();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Decision#getDue <em>Due</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Due</em>' attribute.
   * @see #getDue()
   * @generated
   */
  void setDue(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getDecision_Options()
   * @model
   * @generated
   */
  EList<Option> getOptions();

} // Decision
