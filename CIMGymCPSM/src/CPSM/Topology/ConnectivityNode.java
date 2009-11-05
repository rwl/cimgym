/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Topology;

import CPSM.Core.ConnectivityNodeContainer;
import CPSM.Core.IdentifiedObject;
import CPSM.Core.Terminal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Topology.ConnectivityNode#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link CPSM.Topology.ConnectivityNode#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Topology.TopologyPackage#getConnectivityNode()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance.'"
 * @generated
 */
public interface ConnectivityNode extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see CPSM.Topology.TopologyPackage#getConnectivityNode_Terminals()
	 * @see CPSM.Core.Terminal#getConnectivityNode
	 * @model opposite="ConnectivityNode"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * Returns the value of the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Equipment Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Equipment Container</em>' reference.
	 * @see #setMemberOf_EquipmentContainer(ConnectivityNodeContainer)
	 * @see CPSM.Topology.TopologyPackage#getConnectivityNode_MemberOf_EquipmentContainer()
	 * @see CPSM.Core.ConnectivityNodeContainer#getConnectivityNodes
	 * @model opposite="ConnectivityNodes" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Container of this connectivity node.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Container of this connectivity node.'"
	 * @generated
	 */
	ConnectivityNodeContainer getMemberOf_EquipmentContainer();

	/**
	 * Sets the value of the '{@link CPSM.Topology.ConnectivityNode#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Equipment Container</em>' reference.
	 * @see #getMemberOf_EquipmentContainer()
	 * @generated
	 */
	void setMemberOf_EquipmentContainer(ConnectivityNodeContainer value);

} // ConnectivityNode
