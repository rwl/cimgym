/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apparent Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Apparent power limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power limit.'"
 * @generated
 */
public interface ApparentPowerLimit extends OperationalLimit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit_Value()
	 * @model dataType="CPSM.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The apparent power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The apparent power limit.'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link CPSM.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ApparentPowerLimit
