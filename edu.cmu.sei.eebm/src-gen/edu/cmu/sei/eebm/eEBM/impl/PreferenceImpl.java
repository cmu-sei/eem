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
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.Preference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl#getFirst <em>First</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.PreferenceImpl#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferenceImpl extends MinimalEObjectImpl.Container implements Preference
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected IntentionalElement first;

  /**
   * The cached value of the '{@link #getLast() <em>Last</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected IntentionalElement last;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceImpl()
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
    return EEBMPackage.Literals.PREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getFirst()
  {
    if (first != null && first.eIsProxy())
    {
      InternalEObject oldFirst = (InternalEObject)first;
      first = (IntentionalElement)eResolveProxy(oldFirst);
      if (first != oldFirst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEBMPackage.PREFERENCE__FIRST, oldFirst, first));
      }
    }
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(IntentionalElement newFirst)
  {
    IntentionalElement oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.PREFERENCE__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getLast()
  {
    if (last != null && last.eIsProxy())
    {
      InternalEObject oldLast = (InternalEObject)last;
      last = (IntentionalElement)eResolveProxy(oldLast);
      if (last != oldLast)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEBMPackage.PREFERENCE__LAST, oldLast, last));
      }
    }
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(IntentionalElement newLast)
  {
    IntentionalElement oldLast = last;
    last = newLast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.PREFERENCE__LAST, oldLast, last));
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
      case EEBMPackage.PREFERENCE__FIRST:
        if (resolve) return getFirst();
        return basicGetFirst();
      case EEBMPackage.PREFERENCE__LAST:
        if (resolve) return getLast();
        return basicGetLast();
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
      case EEBMPackage.PREFERENCE__FIRST:
        setFirst((IntentionalElement)newValue);
        return;
      case EEBMPackage.PREFERENCE__LAST:
        setLast((IntentionalElement)newValue);
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
      case EEBMPackage.PREFERENCE__FIRST:
        setFirst((IntentionalElement)null);
        return;
      case EEBMPackage.PREFERENCE__LAST:
        setLast((IntentionalElement)null);
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
      case EEBMPackage.PREFERENCE__FIRST:
        return first != null;
      case EEBMPackage.PREFERENCE__LAST:
        return last != null;
    }
    return super.eIsSet(featureID);
  }

} //PreferenceImpl
