/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getConnectivityNodeContainer()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A base class for all objects that may contain ConnectivityNodes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A base class for all objects that may contain ConnectivityNodes.'"
 * @generated
 */
public interface ConnectivityNodeContainer extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * The list contents are of type {@link CPSM.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link CPSM.ConnectivityNode#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Nodes</em>' reference list.
	 * @see CPSM.CPSMPackage#getConnectivityNodeContainer_ConnectivityNodes()
	 * @see CPSM.ConnectivityNode#getMemberOf_EquipmentContainer
	 * @model opposite="MemberOf_EquipmentContainer"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Connectivity nodes contained by this container.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Connectivity nodes contained by this container.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ConnectivityNode> getConnectivityNodes();

} // ConnectivityNodeContainer
