/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.CPSMPackage
 * @generated
 */
public interface CPSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CPSMFactory eINSTANCE = CPSM.impl.CPSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IEC61970CIM Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC61970CIM Version</em>'.
	 * @generated
	 */
	IEC61970CIMVersion createIEC61970CIMVersion();

	/**
	 * Returns a new object of class '<em>Common Power System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Power System Model</em>'.
	 * @generated
	 */
	CommonPowerSystemModel createCommonPowerSystemModel();

	/**
	 * Returns a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * @generated
	 */
	GrossToNetActivePowerCurve createGrossToNetActivePowerCurve();

	/**
	 * Returns a new object of class '<em>Hydro Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Generating Unit</em>'.
	 * @generated
	 */
	HydroGeneratingUnit createHydroGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Thermal Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thermal Generating Unit</em>'.
	 * @generated
	 */
	ThermalGeneratingUnit createThermalGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generating Unit</em>'.
	 * @generated
	 */
	GeneratingUnit createGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Operational Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Limit Set</em>'.
	 * @generated
	 */
	OperationalLimitSet createOperationalLimitSet();

	/**
	 * Returns a new object of class '<em>Active Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Power Limit</em>'.
	 * @generated
	 */
	ActivePowerLimit createActivePowerLimit();

	/**
	 * Returns a new object of class '<em>Apparent Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apparent Power Limit</em>'.
	 * @generated
	 */
	ApparentPowerLimit createApparentPowerLimit();

	/**
	 * Returns a new object of class '<em>Voltage Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Limit</em>'.
	 * @generated
	 */
	VoltageLimit createVoltageLimit();

	/**
	 * Returns a new object of class '<em>Current Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Limit</em>'.
	 * @generated
	 */
	CurrentLimit createCurrentLimit();

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
	 * Returns a new object of class '<em>Discrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Value</em>'.
	 * @generated
	 */
	DiscreteValue createDiscreteValue();

	/**
	 * Returns a new object of class '<em>Measurement Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value Source</em>'.
	 * @generated
	 */
	MeasurementValueSource createMeasurementValueSource();

	/**
	 * Returns a new object of class '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog</em>'.
	 * @generated
	 */
	Analog createAnalog();

	/**
	 * Returns a new object of class '<em>Analog Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Value</em>'.
	 * @generated
	 */
	AnalogValue createAnalogValue();

	/**
	 * Returns a new object of class '<em>Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Type</em>'.
	 * @generated
	 */
	MeasurementType createMeasurementType();

	/**
	 * Returns a new object of class '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete</em>'.
	 * @generated
	 */
	Discrete createDiscrete();

	/**
	 * Returns a new object of class '<em>Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit Set</em>'.
	 * @generated
	 */
	LimitSet createLimitSet();

	/**
	 * Returns a new object of class '<em>Non Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load Group</em>'.
	 * @generated
	 */
	NonConformLoadGroup createNonConformLoadGroup();

	/**
	 * Returns a new object of class '<em>Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load Schedule</em>'.
	 * @generated
	 */
	ConformLoadSchedule createConformLoadSchedule();

	/**
	 * Returns a new object of class '<em>Customer Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Load</em>'.
	 * @generated
	 */
	CustomerLoad createCustomerLoad();

	/**
	 * Returns a new object of class '<em>Non Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load</em>'.
	 * @generated
	 */
	NonConformLoad createNonConformLoad();

	/**
	 * Returns a new object of class '<em>Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Type</em>'.
	 * @generated
	 */
	DayType createDayType();

	/**
	 * Returns a new object of class '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Season</em>'.
	 * @generated
	 */
	Season createSeason();

	/**
	 * Returns a new object of class '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load</em>'.
	 * @generated
	 */
	Load createLoad();

	/**
	 * Returns a new object of class '<em>Station Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Supply</em>'.
	 * @generated
	 */
	StationSupply createStationSupply();

	/**
	 * Returns a new object of class '<em>Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load Group</em>'.
	 * @generated
	 */
	ConformLoadGroup createConformLoadGroup();

	/**
	 * Returns a new object of class '<em>Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Area</em>'.
	 * @generated
	 */
	LoadArea createLoadArea();

	/**
	 * Returns a new object of class '<em>Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Load Area</em>'.
	 * @generated
	 */
	SubLoadArea createSubLoadArea();

	/**
	 * Returns a new object of class '<em>Load Response Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Response Characteristic</em>'.
	 * @generated
	 */
	LoadResponseCharacteristic createLoadResponseCharacteristic();

	/**
	 * Returns a new object of class '<em>Non Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load Schedule</em>'.
	 * @generated
	 */
	NonConformLoadSchedule createNonConformLoadSchedule();

	/**
	 * Returns a new object of class '<em>Induction Motor Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Induction Motor Load</em>'.
	 * @generated
	 */
	InductionMotorLoad createInductionMotorLoad();

	/**
	 * Returns a new object of class '<em>Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load</em>'.
	 * @generated
	 */
	ConformLoad createConformLoad();

	/**
	 * Returns a new object of class '<em>Equivalent Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Network</em>'.
	 * @generated
	 */
	EquivalentNetwork createEquivalentNetwork();

	/**
	 * Returns a new object of class '<em>Equivalent Shunt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Shunt</em>'.
	 * @generated
	 */
	EquivalentShunt createEquivalentShunt();

	/**
	 * Returns a new object of class '<em>Equivalent Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Branch</em>'.
	 * @generated
	 */
	EquivalentBranch createEquivalentBranch();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Base Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Voltage</em>'.
	 * @generated
	 */
	BaseVoltage createBaseVoltage();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Level</em>'.
	 * @generated
	 */
	VoltageLevel createVoltageLevel();

	/**
	 * Returns a new object of class '<em>Bay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bay</em>'.
	 * @generated
	 */
	Bay createBay();

	/**
	 * Returns a new object of class '<em>Sub Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Geographical Region</em>'.
	 * @generated
	 */
	SubGeographicalRegion createSubGeographicalRegion();

	/**
	 * Returns a new object of class '<em>Regular Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Time Point</em>'.
	 * @generated
	 */
	RegularTimePoint createRegularTimePoint();

	/**
	 * Returns a new object of class '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substation</em>'.
	 * @generated
	 */
	Substation createSubstation();

	/**
	 * Returns a new object of class '<em>Curve Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curve Data</em>'.
	 * @generated
	 */
	CurveData createCurveData();

	/**
	 * Returns a new object of class '<em>Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geographical Region</em>'.
	 * @generated
	 */
	GeographicalRegion createGeographicalRegion();

	/**
	 * Returns a new object of class '<em>Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Area</em>'.
	 * @generated
	 */
	ControlArea createControlArea();

	/**
	 * Returns a new object of class '<em>Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tie Flow</em>'.
	 * @generated
	 */
	TieFlow createTieFlow();

	/**
	 * Returns a new object of class '<em>Control Area Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Area Generating Unit</em>'.
	 * @generated
	 */
	ControlAreaGeneratingUnit createControlAreaGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectivity Node</em>'.
	 * @generated
	 */
	ConnectivityNode createConnectivityNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CPSMPackage getCPSMPackage();

} //CPSMFactory
