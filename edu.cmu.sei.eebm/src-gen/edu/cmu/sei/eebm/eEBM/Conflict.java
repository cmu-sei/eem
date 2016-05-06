/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Conflict#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Conflict#getSource <em>Source</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Conflict#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getConflict()
 * @model
 * @generated
 */
public interface Conflict extends EObject
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getConflict_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Conflict#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getConflict_Source()
   * @model containment="true"
   * @generated
   */
  IntentionalElement getSource();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Conflict#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(IntentionalElement value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' containment reference.
   * @see #setDest(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getConflict_Dest()
   * @model containment="true"
   * @generated
   */
  IntentionalElement getDest();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Conflict#getDest <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' containment reference.
   * @see #getDest()
   * @generated
   */
  void setDest(IntentionalElement value);

} // Conflict
