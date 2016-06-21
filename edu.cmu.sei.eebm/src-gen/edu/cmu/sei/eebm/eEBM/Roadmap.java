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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roadmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.Roadmap#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap()
 * @model
 * @generated
 */
public interface Roadmap extends EObject
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
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.eebm.eEBM.Roadmap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.eebm.eEBM.IntentionalElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Components()
   * @model containment="true"
   * @generated
   */
  EList<IntentionalElement> getComponents();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getRoadmap_Relations()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getRelations();

} // Roadmap
