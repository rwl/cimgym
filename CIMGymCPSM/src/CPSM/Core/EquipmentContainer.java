/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.EquipmentContainer#getContains_Equipments <em>Contains Equipments</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getEquipmentContainer()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A modeling construct to provide a root class for all Equipment classes'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A modeling construct to provide a root class for all Equipment classes'"
 * @generated
 */
public interface EquipmentContainer extends ConnectivityNodeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Contains Equipments</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.Equipment}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Equipment#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Equipments</em>' reference list.
	 * @see CPSM.Core.CorePackage#getEquipmentContainer_Contains_Equipments()
	 * @see CPSM.Core.Equipment#getMemberOf_EquipmentContainer
	 * @model opposite="MemberOf_EquipmentContainer"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Equipment> getContains_Equipments();

} // EquipmentContainer
