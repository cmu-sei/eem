/**
 */
package edu.cmu.sei.eebm.eEBM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTime <em>Time</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCost <em>Cost</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDate <em>Date</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCod <em>Cod</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends EObject
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Priority()
   * @model
   * @generated
   */
  PriorityEnum getPriority();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getPriority <em>Priority</em>}' attribute.
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getTime <em>Time</em>}' attribute.
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Benefit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Benefit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Benefit</em>' attribute.
   * @see #setBenefit(int)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Benefit()
   * @model
   * @generated
   */
  int getBenefit();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getBenefit <em>Benefit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Benefit</em>' attribute.
   * @see #getBenefit()
   * @generated
   */
  void setBenefit(int value);

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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getDate <em>Date</em>}' attribute.
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getIntentionalElement_Cod()
   * @model
   * @generated
   */
  int getCod();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.IntentionalElement#getCod <em>Cod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cod</em>' attribute.
   * @see #getCod()
   * @generated
   */
  void setCod(int value);

} // IntentionalElement
