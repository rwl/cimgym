/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.OperationalLimits.OperationalLimitSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.Equipment#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}</li>
 *   <li>{@link CPSM.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getEquipment()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The parts of a power system that are physical devices, electronic or mechanical'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parts of a power system that are physical devices, electronic or mechanical'"
 * @generated
 */
public interface Equipment extends PowerSystemResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.EquipmentContainer#getContains_Equipments <em>Contains Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Equipment Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Equipment Container</em>' reference.
	 * @see #setMemberOf_EquipmentContainer(EquipmentContainer)
	 * @see CPSM.Core.CorePackage#getEquipment_MemberOf_EquipmentContainer()
	 * @see CPSM.Core.EquipmentContainer#getContains_Equipments
	 * @model opposite="Contains_Equipments" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EquipmentContainer getMemberOf_EquipmentContainer();

	/**
	 * Sets the value of the '{@link CPSM.Core.Equipment#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Equipment Container</em>' reference.
	 * @see #getMemberOf_EquipmentContainer()
	 * @generated
	 */
	void setMemberOf_EquipmentContainer(EquipmentContainer value);

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
	 * The list contents are of type {@link CPSM.OperationalLimits.OperationalLimitSet}.
	 * It is bidirectional and its opposite is '{@link CPSM.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference list.
	 * @see CPSM.Core.CorePackage#getEquipment_OperationalLimitSet()
	 * @see CPSM.OperationalLimits.OperationalLimitSet#getEquipment
	 * @model opposite="Equipment"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The equipment limit sets associated with the equipment.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equipment limit sets associated with the equipment.' Profile\040documentation=''"
	 * @generated
	 */
	EList<OperationalLimitSet> getOperationalLimitSet();

} // Equipment
