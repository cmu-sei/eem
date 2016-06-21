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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getSoftgoal()
 * @model
 * @generated
 */
public interface Softgoal extends IntentionalElement
{
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getSoftgoal_Rationale()
   * @model containment="true"
   * @generated
   */
  Rationale getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRationale <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' containment reference.
   * @see #getRationale()
   * @generated
   */
  void setRationale(Rationale value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(Reference)
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getSoftgoal_Ref()
   * @model containment="true"
   * @generated
   */
  Reference getRef();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Softgoal#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Reference value);

} // Softgoal
