/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Bay#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getBay()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.'"
 * @generated
 */
public interface Bay extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Member Of Voltage Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.VoltageLevel#getContains_Bays <em>Contains Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Voltage Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Voltage Level</em>' reference.
	 * @see #setMemberOf_VoltageLevel(VoltageLevel)
	 * @see CPSM.CPSMPackage#getBay_MemberOf_VoltageLevel()
	 * @see CPSM.VoltageLevel#getContains_Bays
	 * @model opposite="Contains_Bays" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	VoltageLevel getMemberOf_VoltageLevel();

	/**
	 * Sets the value of the '{@link CPSM.Bay#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Voltage Level</em>' reference.
	 * @see #getMemberOf_VoltageLevel()
	 * @generated
	 */
	void setMemberOf_VoltageLevel(VoltageLevel value);

} // Bay
