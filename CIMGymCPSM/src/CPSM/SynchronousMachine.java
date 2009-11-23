/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link CPSM.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CPSM.SynchronousMachine#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}</li>
 *   <li>{@link CPSM.SynchronousMachine#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link CPSM.SynchronousMachine#getType <em>Type</em>}</li>
 *   <li>{@link CPSM.SynchronousMachine#getMaxQ <em>Max Q</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getSynchronousMachine()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.'"
 * @generated
 */
public interface SynchronousMachine extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine <em>Initially Used By Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Reactive Capability Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_InitialReactiveCapabilityCurve()
	 * @see CPSM.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine
	 * @model opposite="InitiallyUsedBySynchronousMachine"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The default ReactiveCapabilityCurve for use by a SynchronousMachine'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The default ReactiveCapabilityCurve for use by a SynchronousMachine'"
	 * @generated
	 */
	ReactiveCapabilityCurve getInitialReactiveCapabilityCurve();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 */
	void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve value);

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.SynchronousMachineOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see CPSM.SynchronousMachineOperatingMode
	 * @see #setOperatingMode(SynchronousMachineOperatingMode)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_OperatingMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Current mode of operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current mode of operation.'"
	 * @generated
	 */
	SynchronousMachineOperatingMode getOperatingMode();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see CPSM.SynchronousMachineOperatingMode
	 * @see #getOperatingMode()
	 * @generated
	 */
	void setOperatingMode(SynchronousMachineOperatingMode value);

	/**
	 * Returns the value of the '<em><b>Member Of Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.GeneratingUnit#getContains_SynchronousMachines <em>Contains Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Generating Unit</em>' reference.
	 * @see #setMemberOf_GeneratingUnit(GeneratingUnit)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_MemberOf_GeneratingUnit()
	 * @see CPSM.GeneratingUnit#getContains_SynchronousMachines
	 * @model opposite="Contains_SynchronousMachines" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 * @generated
	 */
	GeneratingUnit getMemberOf_GeneratingUnit();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Generating Unit</em>' reference.
	 * @see #getMemberOf_GeneratingUnit()
	 * @generated
	 */
	void setMemberOf_GeneratingUnit(GeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Q</em>' attribute.
	 * @see #setMinQ(double)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_MinQ()
	 * @model dataType="CPSM.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Minimum reactive power limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum reactive power limit for the unit.'"
	 * @generated
	 */
	double getMinQ();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Q</em>' attribute.
	 * @see #getMinQ()
	 * @generated
	 */
	void setMinQ(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.SynchronousMachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CPSM.SynchronousMachineType
	 * @see #setType(SynchronousMachineType)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Modes that this synchronous machine can operate in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Modes that this synchronous machine can operate in.'"
	 * @generated
	 */
	SynchronousMachineType getType();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CPSM.SynchronousMachineType
	 * @see #getType()
	 * @generated
	 */
	void setType(SynchronousMachineType value);

	/**
	 * Returns the value of the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Q</em>' attribute.
	 * @see #setMaxQ(double)
	 * @see CPSM.CPSMPackage#getSynchronousMachine_MaxQ()
	 * @model dataType="CPSM.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.'"
	 * @generated
	 */
	double getMaxQ();

	/**
	 * Sets the value of the '{@link CPSM.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Q</em>' attribute.
	 * @see #getMaxQ()
	 * @generated
	 */
	void setMaxQ(double value);

} // SynchronousMachine
