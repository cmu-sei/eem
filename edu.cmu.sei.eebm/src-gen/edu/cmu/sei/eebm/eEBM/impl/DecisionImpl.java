/**
 */
package edu.cmu.sei.eebm.eEBM.impl;

import edu.cmu.sei.eebm.eEBM.Decision;
import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.Option;
import edu.cmu.sei.eebm.eEBM.Stakeholder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getResponse_measure <em>Response measure</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getDue <em>Due</em>}</li>
 *   <li>{@link edu.cmu.sei.eebm.eEBM.impl.DecisionImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision
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
   * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected static final String RATIONALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected String rationale = RATIONALE_EDEFAULT;

  /**
   * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsible()
   * @generated
   * @ordered
   */
  protected Stakeholder responsible;

  /**
   * The default value of the '{@link #getResponse_measure() <em>Response measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse_measure()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE_MEASURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse_measure() <em>Response measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse_measure()
   * @generated
   * @ordered
   */
  protected String response_measure = RESPONSE_MEASURE_EDEFAULT;

  /**
   * The default value of the '{@link #getDue() <em>Due</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDue()
   * @generated
   * @ordered
   */
  protected static final String DUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDue() <em>Due</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDue()
   * @generated
   * @ordered
   */
  protected String due = DUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionImpl()
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
    return EEBMPackage.Literals.DECISION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.DECISION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRationale()
  {
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationale(String newRationale)
  {
    String oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.DECISION__RATIONALE, oldRationale, rationale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder getResponsible()
  {
    if (responsible != null && responsible.eIsProxy())
    {
      InternalEObject oldResponsible = (InternalEObject)responsible;
      responsible = (Stakeholder)eResolveProxy(oldResponsible);
      if (responsible != oldResponsible)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EEBMPackage.DECISION__RESPONSIBLE, oldResponsible, responsible));
      }
    }
    return responsible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetResponsible()
  {
    return responsible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsible(Stakeholder newResponsible)
  {
    Stakeholder oldResponsible = responsible;
    responsible = newResponsible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.DECISION__RESPONSIBLE, oldResponsible, responsible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse_measure()
  {
    return response_measure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse_measure(String newResponse_measure)
  {
    String oldResponse_measure = response_measure;
    response_measure = newResponse_measure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.DECISION__RESPONSE_MEASURE, oldResponse_measure, response_measure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDue()
  {
    return due;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDue(String newDue)
  {
    String oldDue = due;
    due = newDue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EEBMPackage.DECISION__DUE, oldDue, due));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectResolvingEList<Option>(Option.class, this, EEBMPackage.DECISION__OPTIONS);
    }
    return options;
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
      case EEBMPackage.DECISION__NAME:
        return getName();
      case EEBMPackage.DECISION__RATIONALE:
        return getRationale();
      case EEBMPackage.DECISION__RESPONSIBLE:
        if (resolve) return getResponsible();
        return basicGetResponsible();
      case EEBMPackage.DECISION__RESPONSE_MEASURE:
        return getResponse_measure();
      case EEBMPackage.DECISION__DUE:
        return getDue();
      case EEBMPackage.DECISION__OPTIONS:
        return getOptions();
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
      case EEBMPackage.DECISION__NAME:
        setName((String)newValue);
        return;
      case EEBMPackage.DECISION__RATIONALE:
        setRationale((String)newValue);
        return;
      case EEBMPackage.DECISION__RESPONSIBLE:
        setResponsible((Stakeholder)newValue);
        return;
      case EEBMPackage.DECISION__RESPONSE_MEASURE:
        setResponse_measure((String)newValue);
        return;
      case EEBMPackage.DECISION__DUE:
        setDue((String)newValue);
        return;
      case EEBMPackage.DECISION__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
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
      case EEBMPackage.DECISION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EEBMPackage.DECISION__RATIONALE:
        setRationale(RATIONALE_EDEFAULT);
        return;
      case EEBMPackage.DECISION__RESPONSIBLE:
        setResponsible((Stakeholder)null);
        return;
      case EEBMPackage.DECISION__RESPONSE_MEASURE:
        setResponse_measure(RESPONSE_MEASURE_EDEFAULT);
        return;
      case EEBMPackage.DECISION__DUE:
        setDue(DUE_EDEFAULT);
        return;
      case EEBMPackage.DECISION__OPTIONS:
        getOptions().clear();
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
      case EEBMPackage.DECISION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EEBMPackage.DECISION__RATIONALE:
        return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
      case EEBMPackage.DECISION__RESPONSIBLE:
        return responsible != null;
      case EEBMPackage.DECISION__RESPONSE_MEASURE:
        return RESPONSE_MEASURE_EDEFAULT == null ? response_measure != null : !RESPONSE_MEASURE_EDEFAULT.equals(response_measure);
      case EEBMPackage.DECISION__DUE:
        return DUE_EDEFAULT == null ? due != null : !DUE_EDEFAULT.equals(due);
      case EEBMPackage.DECISION__OPTIONS:
        return options != null && !options.isEmpty();
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
    result.append(", rationale: ");
    result.append(rationale);
    result.append(", response_measure: ");
    result.append(response_measure);
    result.append(", due: ");
    result.append(due);
    result.append(')');
    return result.toString();
  }

} //DecisionImpl
