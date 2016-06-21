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
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_First()
   * @model
   * @generated
   */
  IntentionalElement getFirst();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(IntentionalElement value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' reference.
   * @see #setLast(IntentionalElement)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPreference_Last()
   * @model
   * @generated
   */
  IntentionalElement getLast();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Preference#getLast <em>Last</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' reference.
   * @see #getLast()
   * @generated
   */
  void setLast(IntentionalElement value);

} // Preference
