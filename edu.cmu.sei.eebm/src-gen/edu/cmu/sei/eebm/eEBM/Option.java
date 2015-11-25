/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getConflictsReference <em>Conflicts Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getTime <em>Time</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getCost <em>Cost</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getDate <em>Date</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Option#getCod <em>Cod</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends IntentionalElement
{
  /**
   * Returns the value of the '<em><b>Refines Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines Reference</em>' reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_RefinesReference()
   * @model
   * @generated
   */
  EList<IntentionalElement> getRefinesReference();

  /**
   * Returns the value of the '<em><b>Conflicts Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflicts Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflicts Reference</em>' reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_ConflictsReference()
   * @model
   * @generated
   */
  EList<IntentionalElement> getConflictsReference();

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The literals are from the enumeration {@link edu.cmu.sei.eebm.eEBM.PriorityEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see edu.cmu.sei.eebm.eEBM.PriorityEnum
   * @see #setPriority(PriorityEnum)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_Priority()
   * @model
   * @generated
   */
  PriorityEnum getPriority();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Option#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see edu.cmu.sei.eebm.eEBM.PriorityEnum
   * @see #getPriority()
   * @generated
   */
  void setPriority(PriorityEnum value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Option#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Option#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Option#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Cod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cod</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cod</em>' attribute.
   * @see #setCod(int)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getOption_Cod()
   * @model
   * @generated
   */
  int getCod();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Option#getCod <em>Cod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cod</em>' attribute.
   * @see #getCod()
   * @generated
   */
  void setCod(int value);

} // Option
