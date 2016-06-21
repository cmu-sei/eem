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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Priority Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.eebm.eEBM.EEBMPackage#getPriorityEnum()
 * @model
 * @generated
 */
public enum PriorityEnum implements Enumerator
{
  /**
   * The '<em><b>NA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NA_VALUE
   * @generated
   * @ordered
   */
  NA(0, "NA", "NA"),

  /**
   * The '<em><b>LOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOW_VALUE
   * @generated
   * @ordered
   */
  LOW(1, "LOW", "LOW"),

  /**
   * The '<em><b>MED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MED_VALUE
   * @generated
   * @ordered
   */
  MED(2, "MED", "MED"),

  /**
   * The '<em><b>HIGH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIGH_VALUE
   * @generated
   * @ordered
   */
  HIGH(3, "HIGH", "HIGH");

  /**
   * The '<em><b>NA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NA
   * @model
   * @generated
   * @ordered
   */
  public static final int NA_VALUE = 0;

  /**
   * The '<em><b>LOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOW
   * @model
   * @generated
   * @ordered
   */
  public static final int LOW_VALUE = 1;

  /**
   * The '<em><b>MED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MED
   * @model
   * @generated
   * @ordered
   */
  public static final int MED_VALUE = 2;

  /**
   * The '<em><b>HIGH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HIGH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIGH
   * @model
   * @generated
   * @ordered
   */
  public static final int HIGH_VALUE = 3;

  /**
   * An array of all the '<em><b>Priority Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PriorityEnum[] VALUES_ARRAY =
    new PriorityEnum[]
    {
      NA,
      LOW,
      MED,
      HIGH,
    };

  /**
   * A public read-only list of all the '<em><b>Priority Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PriorityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Priority Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PriorityEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PriorityEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Priority Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PriorityEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PriorityEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Priority Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PriorityEnum get(int value)
  {
    switch (value)
    {
      case NA_VALUE: return NA;
      case LOW_VALUE: return LOW;
      case MED_VALUE: return MED;
      case HIGH_VALUE: return HIGH;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PriorityEnum(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PriorityEnum
