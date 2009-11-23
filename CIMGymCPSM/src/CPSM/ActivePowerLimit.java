/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ActivePowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getActivePowerLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Limit on active power flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on active power flow.'"
 * @generated
 */
public interface ActivePowerLimit extends OperationalLimit {
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
	 * @see CPSM.CPSMPackage#getActivePowerLimit_Value()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Value of active power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of active power limit.'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link CPSM.ActivePowerLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ActivePowerLimit
