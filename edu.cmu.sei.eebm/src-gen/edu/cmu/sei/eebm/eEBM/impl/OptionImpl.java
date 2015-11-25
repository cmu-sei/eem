/**
 */
package edu.cmu.sei.eebm.eEBM.impl;

import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.Option;
import edu.cmu.sei.eebm.eEBM.PriorityEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getConflictsReference <em>Conflicts Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.OptionImpl#getCod <em>Cod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends IntentionalElementImpl implements Option
{
  /**
   * The cached value of the '{@link #getRefinesReference() <em>Refines Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinesReference()
   * @generated
   * @ordered
   */
  protected EList<IntentionalElement> refinesReference;

  /**
   * The cached value of the '{@link #getConflictsReference() <em>Conflicts Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictsReference()
   * @generated
   * @ordered
   */
  protected EList<IntentionalElement> conflictsReference;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final PriorityEnum PRIORITY_EDEFAULT = PriorityEnum.HIGH;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected PriorityEnum priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getCod() <em>Cod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCod()
   * @generated
   * @ordered
   */
  protected static final int COD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCod() <em>Cod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCod()
   * @generated
   * @ordered
   */
  protected int cod = COD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EEBMPackage.Literals.OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntentionalElement> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<IntentionalElement>(IntentionalElement.class, this, EEBMPackage.OPTION__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntentionalElement> getConflictsReference()
  {
    if (conflictsReference == null)
    {
      conflictsReference = new EObjectResolvingEList<IntentionalElement>(IntentionalElement.class, this, EEBMPackage.OPTION__CONFLICTS_REFERENCE);
    }
    return conflictsReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PriorityEnum getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(PriorityEnum newPriority)
  {
    PriorityEnum oldPriority = priority;
    priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.OPTION__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.OPTION__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.OPTION__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.OPTION__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCod()
  {
    return cod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCod(int newCod)
  {
    int oldCod = cod;
    cod = newCod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.OPTION__COD, oldCod, cod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EEBMPackage.OPTION__REFINES_REFERENCE:
        return getRefinesReference();
      case EEBMPackage.OPTION__CONFLICTS_REFERENCE:
        return getConflictsReference();
      case EEBMPackage.OPTION__PRIORITY:
        return getPriority();
      case EEBMPackage.OPTION__TIME:
        return getTime();
      case EEBMPackage.OPTION__COST:
        return getCost();
      case EEBMPackage.OPTION__DATE:
        return getDate();
      case EEBMPackage.OPTION__COD:
        return getCod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EEBMPackage.OPTION__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends IntentionalElement>)newValue);
        return;
      case EEBMPackage.OPTION__CONFLICTS_REFERENCE:
        getConflictsReference().clear();
        getConflictsReference().addAll((Collection<? extends IntentionalElement>)newValue);
        return;
      case EEBMPackage.OPTION__PRIORITY:
        setPriority((PriorityEnum)newValue);
        return;
      case EEBMPackage.OPTION__TIME:
        setTime((Integer)newValue);
        return;
      case EEBMPackage.OPTION__COST:
        setCost((Integer)newValue);
        return;
      case EEBMPackage.OPTION__DATE:
        setDate((String)newValue);
        return;
      case EEBMPackage.OPTION__COD:
        setCod((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EEBMPackage.OPTION__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case EEBMPackage.OPTION__CONFLICTS_REFERENCE:
        getConflictsReference().clear();
        return;
      case EEBMPackage.OPTION__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case EEBMPackage.OPTION__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EEBMPackage.OPTION__COST:
        setCost(COST_EDEFAULT);
        return;
      case EEBMPackage.OPTION__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case EEBMPackage.OPTION__COD:
        setCod(COD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EEBMPackage.OPTION__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case EEBMPackage.OPTION__CONFLICTS_REFERENCE:
        return conflictsReference != null && !conflictsReference.isEmpty();
      case EEBMPackage.OPTION__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case EEBMPackage.OPTION__TIME:
        return time != TIME_EDEFAULT;
      case EEBMPackage.OPTION__COST:
        return cost != COST_EDEFAULT;
      case EEBMPackage.OPTION__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case EEBMPackage.OPTION__COD:
        return cod != COD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (priority: ");
    result.append(priority);
    result.append(", time: ");
    result.append(time);
    result.append(", cost: ");
    result.append(cost);
    result.append(", date: ");
    result.append(date);
    result.append(", cod: ");
    result.append(cod);
    result.append(')');
    return result.toString();
  }

} //OptionImpl
