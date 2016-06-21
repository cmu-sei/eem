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

import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.Goal;
import edu.cmu.sei.eebm.eEBM.Rationale;
import edu.cmu.sei.eebm.eEBM.Reference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.GoalImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends IntentionalElementImpl implements Goal
{
  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected Rationale rationale;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Reference ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalImpl()
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
    return EEBMPackage.Literals.GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale getRationale()
  {
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRationale(Rationale newRationale, NotificationChain msgs)
  {
    Rationale oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EEBMPackage.GOAL__RATIONALE, oldRationale, newRationale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationale(Rationale newRationale)
  {
    if (newRationale != rationale)
    {
      NotificationChain msgs = null;
      if (rationale != null)
        msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.GOAL__RATIONALE, null, msgs);
      if (newRationale != null)
        msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.GOAL__RATIONALE, null, msgs);
      msgs = basicSetRationale(newRationale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.GOAL__RATIONALE, newRationale, newRationale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(Reference newRef, NotificationChain msgs)
  {
    Reference oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EEBMPackage.GOAL__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Reference newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.GOAL__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EEBMPackage.GOAL__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.GOAL__REF, newRef, newRef));
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
      case EEBMPackage.GOAL__RATIONALE:
        return basicSetRationale(null, msgs);
      case EEBMPackage.GOAL__REF:
        return basicSetRef(null, msgs);
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
      case EEBMPackage.GOAL__RATIONALE:
        return getRationale();
      case EEBMPackage.GOAL__REF:
        return getRef();
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
      case EEBMPackage.GOAL__RATIONALE:
        setRationale((Rationale)newValue);
        return;
      case EEBMPackage.GOAL__REF:
        setRef((Reference)newValue);
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
      case EEBMPackage.GOAL__RATIONALE:
        setRationale((Rationale)null);
        return;
      case EEBMPackage.GOAL__REF:
        setRef((Reference)null);
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
      case EEBMPackage.GOAL__RATIONALE:
        return rationale != null;
      case EEBMPackage.GOAL__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //GoalImpl
