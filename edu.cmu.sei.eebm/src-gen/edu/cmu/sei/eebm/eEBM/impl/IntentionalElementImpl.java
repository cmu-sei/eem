/**
 * /** Copyright (c) 2016 Carnegie Mellon University.
 * All Rights Reserved.
 * 
 *   * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY, EXCLUSIVITY,
 * OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT
 * MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK,
 * OR COPYRIGHT INFRINGEMENT.
 * 
 *   * Released under a BSD-style license, please see COPYRIGHT or contact
 * permission@sei.cmu.edu for full terms.  DM-0003721
 * 
 *   * This Software includes and/or makes use of the following
 * Third-Party Software subject to its own license:
 * a.       Eclipse libraries (https://eclipse.org/)
 * b.      Xtext https://eclipse.org/Xtext/
 * Complete information can be found in build.xml
 * 
 * 
 */
package edu.cmu.sei.eebm.eEBM.impl;

import edu.cmu.sei.eebm.eEBM.Description;
import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.PriorityEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getTime <em>Time</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.IntentionalElementImpl#getCod <em>Cod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentionalElementImpl extends MinimalEObjectImpl.Container implements IntentionalElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected Description description;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final PriorityEnum PRIORITY_EDEFAULT = PriorityEnum.NA;

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
   * The default value of the '{@link #getBenefit() <em>Benefit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenefit()
   * @generated
   * @ordered
   */
  protected static final int BENEFIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBenefit() <em>Benefit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenefit()
   * @generated
   * @ordered
   */
  protected int benefit = BENEFIT_EDEFAULT;

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
  protected IntentionalElementImpl()
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
    return EEBMPackage.Literals.INTENTIONAL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs)
  {
    Description oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(Description newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION, newDescription, newDescription));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__PRIORITY, oldPriority, priority));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__TIME, oldTime, time));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBenefit()
  {
    return benefit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBenefit(int newBenefit)
  {
    int oldBenefit = benefit;
    benefit = newBenefit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__BENEFIT, oldBenefit, benefit));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__DATE, oldDate, date));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.INTENTIONAL_ELEMENT__COD, oldCod, cod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        return basicSetDescription(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EEBMPackage.INTENTIONAL_ELEMENT__NAME:
        return getName();
      case EEBMPackage.INTENTIONAL_ELEMENT__TITLE:
        return getTitle();
      case EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        return getDescription();
      case EEBMPackage.INTENTIONAL_ELEMENT__PRIORITY:
        return getPriority();
      case EEBMPackage.INTENTIONAL_ELEMENT__TIME:
        return getTime();
      case EEBMPackage.INTENTIONAL_ELEMENT__COST:
        return getCost();
      case EEBMPackage.INTENTIONAL_ELEMENT__BENEFIT:
        return getBenefit();
      case EEBMPackage.INTENTIONAL_ELEMENT__DATE:
        return getDate();
      case EEBMPackage.INTENTIONAL_ELEMENT__COD:
        return getCod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EEBMPackage.INTENTIONAL_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__TITLE:
        setTitle((String)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        setDescription((Description)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__PRIORITY:
        setPriority((PriorityEnum)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__TIME:
        setTime((Integer)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__COST:
        setCost((Integer)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__BENEFIT:
        setBenefit((Integer)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__DATE:
        setDate((String)newValue);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__COD:
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
      case EEBMPackage.INTENTIONAL_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        setDescription((Description)null);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__COST:
        setCost(COST_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__BENEFIT:
        setBenefit(BENEFIT_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case EEBMPackage.INTENTIONAL_ELEMENT__COD:
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
      case EEBMPackage.INTENTIONAL_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EEBMPackage.INTENTIONAL_ELEMENT__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case EEBMPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        return description != null;
      case EEBMPackage.INTENTIONAL_ELEMENT__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case EEBMPackage.INTENTIONAL_ELEMENT__TIME:
        return time != TIME_EDEFAULT;
      case EEBMPackage.INTENTIONAL_ELEMENT__COST:
        return cost != COST_EDEFAULT;
      case EEBMPackage.INTENTIONAL_ELEMENT__BENEFIT:
        return benefit != BENEFIT_EDEFAULT;
      case EEBMPackage.INTENTIONAL_ELEMENT__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case EEBMPackage.INTENTIONAL_ELEMENT__COD:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", priority: ");
    result.append(priority);
    result.append(", time: ");
    result.append(time);
    result.append(", cost: ");
    result.append(cost);
    result.append(", benefit: ");
    result.append(benefit);
    result.append(", date: ");
    result.append(date);
    result.append(", cod: ");
    result.append(cod);
    result.append(')');
    return result.toString();
  }

} //IntentionalElementImpl
