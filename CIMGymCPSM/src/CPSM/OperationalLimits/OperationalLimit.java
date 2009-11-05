/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits;

import CPSM.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link CPSM.OperationalLimits.OperationalLimit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A value associated with a specific kind of limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A value associated with a specific kind of limit.'"
 * @generated
 */
public interface OperationalLimit extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference.
	 * @see #setOperationalLimitSet(OperationalLimitSet)
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimit_OperationalLimitSet()
	 * @see CPSM.OperationalLimits.OperationalLimitSet#getOperationalLimitValue
	 * @model opposite="OperationalLimitValue" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The limit set to which the limit values belong.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit set to which the limit values belong.'"
	 * @generated
	 */
	OperationalLimitSet getOperationalLimitSet();

	/**
	 * Sets the value of the '{@link CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Limit Set</em>' reference.
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	void setOperationalLimitSet(OperationalLimitSet value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getOperationalLimit_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Used to specify high/low and limit levels.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to specify high/low and limit levels.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CPSM.OperationalLimits.OperationalLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // OperationalLimit
