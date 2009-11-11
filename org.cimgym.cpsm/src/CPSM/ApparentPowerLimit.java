/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apparent Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ApparentPowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getApparentPowerLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Apparent power limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power limit.'"
 * @generated
 */
public interface ApparentPowerLimit extends OperationalLimit {
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
	 * @see CPSM.CPSMPackage#getApparentPowerLimit_Value()
	 * @model dataType="CPSM.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The apparent power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The apparent power limit.'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link CPSM.ApparentPowerLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ApparentPowerLimit
