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
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Terminal#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CPSM.Terminal#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CPSM.Terminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link CPSM.Terminal#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getTerminal()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\".'"
 * @generated
 */
public interface Terminal extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Measurement}.
	 * It is bidirectional and its opposite is '{@link CPSM.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CPSM.CPSMPackage#getTerminal_Measurements()
	 * @see CPSM.Measurement#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='One or more measurements may be associated with a terminal in the network. Measurement-Terminal defines where the measurement is placed in the network topology.\nSome Measurements represent quantities related to a particular sensor position, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is captured by the Measurement - Terminal association that makes it possible to place the sensing position at a  well defined place. The place is defined by the connection of the Terminal to ConductingEquipment.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One or more measurements may be associated with a terminal in the network. Measurement-Terminal defines where the measurement is placed in the network topology.\nSome Measurements represent quantities related to a particular sensor position, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is captured by the Measurement - Terminal association that makes it possible to place the sensing position at a  well defined place. The place is defined by the connection of the Terminal to ConductingEquipment.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference list.
	 * The list contents are of type {@link CPSM.RegulatingControl}.
	 * It is bidirectional and its opposite is '{@link CPSM.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference list.
	 * @see CPSM.CPSMPackage#getTerminal_RegulatingControl()
	 * @see CPSM.RegulatingControl#getTerminal
	 * @model opposite="Terminal"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The terminal is regulated by a control.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal is regulated by a control.' Profile\040documentation=''"
	 * @generated
	 */
	EList<RegulatingControl> getRegulatingControl();

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference.
	 * @see #setConnectivityNode(ConnectivityNode)
	 * @see CPSM.CPSMPackage#getTerminal_ConnectivityNode()
	 * @see CPSM.ConnectivityNode#getTerminals
	 * @model opposite="Terminals"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals.'"
	 * @generated
	 */
	ConnectivityNode getConnectivityNode();

	/**
	 * Sets the value of the '{@link CPSM.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' reference.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	void setConnectivityNode(ConnectivityNode value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CPSM.CPSMPackage#getTerminal_ConductingEquipment()
	 * @see CPSM.ConductingEquipment#getTerminals
	 * @model opposite="Terminals" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link CPSM.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

} // Terminal
