/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits;

import CPSM.Core.Equipment;
import CPSM.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link CPSM.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A set of limits associated with equipmnet.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of limits associated with equipmnet.'"
 * @generated
 */
public interface OperationalLimitSet extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet_Equipment()
	 * @see CPSM.Core.Equipment#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The equpment to which the limit set applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equpment to which the limit set applies.'"
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link CPSM.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

	/**
	 * Returns the value of the '<em><b>Operational Limit Value</b></em>' reference list.
	 * The list contents are of type {@link CPSM.OperationalLimits.OperationalLimit}.
	 * It is bidirectional and its opposite is '{@link CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Value</em>' reference list.
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet_OperationalLimitValue()
	 * @see CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Values of equipment limits.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Values of equipment limits.' Profile\040documentation=''"
	 * @generated
	 */
	EList<OperationalLimit> getOperationalLimitValue();

} // OperationalLimitSet
