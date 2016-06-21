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

import edu.cmu.sei.eebm.eEBM.AndRefinement;
import edu.cmu.sei.eebm.eEBM.Conflict;
import edu.cmu.sei.eebm.eEBM.Description;
import edu.cmu.sei.eebm.eEBM.EEBMFactory;
import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.Goal;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.OrRefinement;
import edu.cmu.sei.eebm.eEBM.Preference;
import edu.cmu.sei.eebm.eEBM.PriorityEnum;
import edu.cmu.sei.eebm.eEBM.Rationale;
import edu.cmu.sei.eebm.eEBM.Reference;
import edu.cmu.sei.eebm.eEBM.Refinement;
import edu.cmu.sei.eebm.eEBM.Roadmap;
import edu.cmu.sei.eebm.eEBM.Softgoal;
import edu.cmu.sei.eebm.eEBM.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EEBMPackageImpl extends EPackageImpl implements EEBMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roadmapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentionalElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conflictEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass softgoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rationaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum priorityEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EEBMPackageImpl()
  {
    super(eNS_URI, EEBMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EEBMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EEBMPackage init()
  {
    if (isInited) return (EEBMPackage)EPackage.Registry.INSTANCE.getEPackage(EEBMPackage.eNS_URI);

    // Obtain or create and register package
    EEBMPackageImpl theEEBMPackage = (EEBMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EEBMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EEBMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEEBMPackage.createPackageContents();

    // Initialize created meta-data
    theEEBMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEEBMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EEBMPackage.eNS_URI, theEEBMPackage);
    return theEEBMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoadmap()
  {
    return roadmapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoadmap_Name()
  {
    return (EAttribute)roadmapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoadmap_Components()
  {
    return (EReference)roadmapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoadmap_Relations()
  {
    return (EReference)roadmapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntentionalElement()
  {
    return intentionalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Name()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Title()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntentionalElement_Description()
  {
    return (EReference)intentionalElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Priority()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Time()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Cost()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Benefit()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Date()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentionalElement_Cod()
  {
    return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefinement()
  {
    return refinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefinement_Name()
  {
    return (EAttribute)refinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefinement_Dest()
  {
    return (EReference)refinementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndRefinement()
  {
    return andRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndRefinement_Source()
  {
    return (EReference)andRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrRefinement()
  {
    return orRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrRefinement_Source()
  {
    return (EReference)orRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConflict()
  {
    return conflictEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConflict_Name()
  {
    return (EAttribute)conflictEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConflict_Source()
  {
    return (EReference)conflictEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConflict_Dest()
  {
    return (EReference)conflictEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal()
  {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_Rationale()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_Ref()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoftgoal()
  {
    return softgoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftgoal_Rationale()
  {
    return (EReference)softgoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftgoal_Ref()
  {
    return (EReference)softgoalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Text()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRationale()
  {
    return rationaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRationale_Text()
  {
    return (EAttribute)rationaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_DocReference()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreference()
  {
    return preferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreference_First()
  {
    return (EReference)preferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreference_Last()
  {
    return (EReference)preferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPriorityEnum()
  {
    return priorityEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEBMFactory getEEBMFactory()
  {
    return (EEBMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    roadmapEClass = createEClass(ROADMAP);
    createEAttribute(roadmapEClass, ROADMAP__NAME);
    createEReference(roadmapEClass, ROADMAP__COMPONENTS);
    createEReference(roadmapEClass, ROADMAP__RELATIONS);

    intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__NAME);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__TITLE);
    createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__DESCRIPTION);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__PRIORITY);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__TIME);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__COST);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__BENEFIT);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__DATE);
    createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__COD);

    refinementEClass = createEClass(REFINEMENT);
    createEAttribute(refinementEClass, REFINEMENT__NAME);
    createEReference(refinementEClass, REFINEMENT__DEST);

    andRefinementEClass = createEClass(AND_REFINEMENT);
    createEReference(andRefinementEClass, AND_REFINEMENT__SOURCE);

    orRefinementEClass = createEClass(OR_REFINEMENT);
    createEReference(orRefinementEClass, OR_REFINEMENT__SOURCE);

    conflictEClass = createEClass(CONFLICT);
    createEAttribute(conflictEClass, CONFLICT__NAME);
    createEReference(conflictEClass, CONFLICT__SOURCE);
    createEReference(conflictEClass, CONFLICT__DEST);

    goalEClass = createEClass(GOAL);
    createEReference(goalEClass, GOAL__RATIONALE);
    createEReference(goalEClass, GOAL__REF);

    softgoalEClass = createEClass(SOFTGOAL);
    createEReference(softgoalEClass, SOFTGOAL__RATIONALE);
    createEReference(softgoalEClass, SOFTGOAL__REF);

    taskEClass = createEClass(TASK);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__TEXT);

    rationaleEClass = createEClass(RATIONALE);
    createEAttribute(rationaleEClass, RATIONALE__TEXT);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__DOC_REFERENCE);

    preferenceEClass = createEClass(PREFERENCE);
    createEReference(preferenceEClass, PREFERENCE__FIRST);
    createEReference(preferenceEClass, PREFERENCE__LAST);

    // Create enums
    priorityEnumEEnum = createEEnum(PRIORITY_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    andRefinementEClass.getESuperTypes().add(this.getRefinement());
    orRefinementEClass.getESuperTypes().add(this.getRefinement());
    goalEClass.getESuperTypes().add(this.getIntentionalElement());
    softgoalEClass.getESuperTypes().add(this.getIntentionalElement());
    taskEClass.getESuperTypes().add(this.getIntentionalElement());

    // Initialize classes and features; add operations and parameters
    initEClass(roadmapEClass, Roadmap.class, "Roadmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoadmap_Name(), ecorePackage.getEString(), "name", null, 0, 1, Roadmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoadmap_Components(), this.getIntentionalElement(), null, "components", null, 0, -1, Roadmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoadmap_Relations(), ecorePackage.getEObject(), null, "relations", null, 0, -1, Roadmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentionalElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Title(), ecorePackage.getEString(), "title", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntentionalElement_Description(), this.getDescription(), null, "description", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Priority(), this.getPriorityEnum(), "priority", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Time(), ecorePackage.getEInt(), "time", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Benefit(), ecorePackage.getEInt(), "benefit", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Date(), ecorePackage.getEString(), "date", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntentionalElement_Cod(), ecorePackage.getEInt(), "cod", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefinement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefinement_Dest(), this.getIntentionalElement(), null, "dest", null, 0, -1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andRefinementEClass, AndRefinement.class, "AndRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndRefinement_Source(), this.getIntentionalElement(), null, "source", null, 0, -1, AndRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orRefinementEClass, OrRefinement.class, "OrRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrRefinement_Source(), this.getIntentionalElement(), null, "source", null, 0, 1, OrRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConflict_Name(), ecorePackage.getEString(), "name", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConflict_Source(), this.getIntentionalElement(), null, "source", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConflict_Dest(), this.getIntentionalElement(), null, "dest", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoal_Rationale(), this.getRationale(), null, "rationale", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_Ref(), this.getReference(), null, "ref", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoftgoal_Rationale(), this.getRationale(), null, "rationale", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSoftgoal_Ref(), this.getReference(), null, "ref", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Text(), ecorePackage.getEString(), "text", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRationale_Text(), ecorePackage.getEString(), "text", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_DocReference(), ecorePackage.getEString(), "docReference", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreference_First(), this.getIntentionalElement(), null, "first", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreference_Last(), this.getIntentionalElement(), null, "last", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(priorityEnumEEnum, PriorityEnum.class, "PriorityEnum");
    addEEnumLiteral(priorityEnumEEnum, PriorityEnum.NA);
    addEEnumLiteral(priorityEnumEEnum, PriorityEnum.LOW);
    addEEnumLiteral(priorityEnumEEnum, PriorityEnum.MED);
    addEEnumLiteral(priorityEnumEEnum, PriorityEnum.HIGH);

    // Create resource
    createResource(eNS_URI);
  }

} //EEBMPackageImpl
