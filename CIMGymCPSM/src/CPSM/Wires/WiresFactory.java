/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.Wires.WiresPackage
 * @generated
 */
public interface WiresFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresFactory eINSTANCE = CPSM.Wires.impl.WiresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Transformer</em>'.
	 * @generated
	 */
	PowerTransformer createPowerTransformer();

	/**
	 * Returns a new object of class '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnector</em>'.
	 * @generated
	 */
	Disconnector createDisconnector();

	/**
	 * Returns a new object of class '<em>Synchronous Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Machine</em>'.
	 * @generated
	 */
	SynchronousMachine createSynchronousMachine();

	/**
	 * Returns a new object of class '<em>Busbar Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Busbar Section</em>'.
	 * @generated
	 */
	BusbarSection createBusbarSection();

	/**
	 * Returns a new object of class '<em>Shunt Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shunt Compensator</em>'.
	 * @generated
	 */
	ShuntCompensator createShuntCompensator();

	/**
	 * Returns a new object of class '<em>Load Break Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Break Switch</em>'.
	 * @generated
	 */
	LoadBreakSwitch createLoadBreakSwitch();

	/**
	 * Returns a new object of class '<em>Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer Winding</em>'.
	 * @generated
	 */
	TransformerWinding createTransformerWinding();

	/**
	 * Returns a new object of class '<em>Regulating Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulating Control</em>'.
	 * @generated
	 */
	RegulatingControl createRegulatingControl();

	/**
	 * Returns a new object of class '<em>Regulation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulation Schedule</em>'.
	 * @generated
	 */
	RegulationSchedule createRegulationSchedule();

	/**
	 * Returns a new object of class '<em>AC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AC Line Segment</em>'.
	 * @generated
	 */
	ACLineSegment createACLineSegment();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Reactive Capability Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Capability Curve</em>'.
	 * @generated
	 */
	ReactiveCapabilityCurve createReactiveCapabilityCurve();

	/**
	 * Returns a new object of class '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap Changer</em>'.
	 * @generated
	 */
	TapChanger createTapChanger();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Static Var Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Var Compensator</em>'.
	 * @generated
	 */
	StaticVarCompensator createStaticVarCompensator();

	/**
	 * Returns a new object of class '<em>Series Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Series Compensator</em>'.
	 * @generated
	 */
	SeriesCompensator createSeriesCompensator();

	/**
	 * Returns a new object of class '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breaker</em>'.
	 * @generated
	 */
	Breaker createBreaker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiresPackage getWiresPackage();

} //WiresFactory
