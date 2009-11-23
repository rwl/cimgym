/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.util;

import CPSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.CPSMPackage
 * @generated
 */
public class CPSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CPSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CPSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPSMSwitch<Adapter> modelSwitch =
		new CPSMSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIEC61970CIMVersion(IEC61970CIMVersion object) {
				return createIEC61970CIMVersionAdapter();
			}
			@Override
			public Adapter caseCommonPowerSystemModel(CommonPowerSystemModel object) {
				return createCommonPowerSystemModelAdapter();
			}
			@Override
			public Adapter caseGrossToNetActivePowerCurve(GrossToNetActivePowerCurve object) {
				return createGrossToNetActivePowerCurveAdapter();
			}
			@Override
			public Adapter caseHydroGeneratingUnit(HydroGeneratingUnit object) {
				return createHydroGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseThermalGeneratingUnit(ThermalGeneratingUnit object) {
				return createThermalGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseGeneratingUnit(GeneratingUnit object) {
				return createGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseOperationalLimit(OperationalLimit object) {
				return createOperationalLimitAdapter();
			}
			@Override
			public Adapter caseOperationalLimitSet(OperationalLimitSet object) {
				return createOperationalLimitSetAdapter();
			}
			@Override
			public Adapter caseActivePowerLimit(ActivePowerLimit object) {
				return createActivePowerLimitAdapter();
			}
			@Override
			public Adapter caseApparentPowerLimit(ApparentPowerLimit object) {
				return createApparentPowerLimitAdapter();
			}
			@Override
			public Adapter caseVoltageLimit(VoltageLimit object) {
				return createVoltageLimitAdapter();
			}
			@Override
			public Adapter caseCurrentLimit(CurrentLimit object) {
				return createCurrentLimitAdapter();
			}
			@Override
			public Adapter casePowerTransformer(PowerTransformer object) {
				return createPowerTransformerAdapter();
			}
			@Override
			public Adapter caseDisconnector(Disconnector object) {
				return createDisconnectorAdapter();
			}
			@Override
			public Adapter caseSynchronousMachine(SynchronousMachine object) {
				return createSynchronousMachineAdapter();
			}
			@Override
			public Adapter caseBusbarSection(BusbarSection object) {
				return createBusbarSectionAdapter();
			}
			@Override
			public Adapter caseShuntCompensator(ShuntCompensator object) {
				return createShuntCompensatorAdapter();
			}
			@Override
			public Adapter caseLoadBreakSwitch(LoadBreakSwitch object) {
				return createLoadBreakSwitchAdapter();
			}
			@Override
			public Adapter caseRegulatingCondEq(RegulatingCondEq object) {
				return createRegulatingCondEqAdapter();
			}
			@Override
			public Adapter caseEnergyConsumer(EnergyConsumer object) {
				return createEnergyConsumerAdapter();
			}
			@Override
			public Adapter caseTransformerWinding(TransformerWinding object) {
				return createTransformerWindingAdapter();
			}
			@Override
			public Adapter caseRegulatingControl(RegulatingControl object) {
				return createRegulatingControlAdapter();
			}
			@Override
			public Adapter caseRegulationSchedule(RegulationSchedule object) {
				return createRegulationScheduleAdapter();
			}
			@Override
			public Adapter caseACLineSegment(ACLineSegment object) {
				return createACLineSegmentAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseConductor(Conductor object) {
				return createConductorAdapter();
			}
			@Override
			public Adapter caseReactiveCapabilityCurve(ReactiveCapabilityCurve object) {
				return createReactiveCapabilityCurveAdapter();
			}
			@Override
			public Adapter caseTapChanger(TapChanger object) {
				return createTapChangerAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseStaticVarCompensator(StaticVarCompensator object) {
				return createStaticVarCompensatorAdapter();
			}
			@Override
			public Adapter caseSeriesCompensator(SeriesCompensator object) {
				return createSeriesCompensatorAdapter();
			}
			@Override
			public Adapter caseBreaker(Breaker object) {
				return createBreakerAdapter();
			}
			@Override
			public Adapter caseDiscreteValue(DiscreteValue object) {
				return createDiscreteValueAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseMeasurementValue(MeasurementValue object) {
				return createMeasurementValueAdapter();
			}
			@Override
			public Adapter caseMeasurementValueSource(MeasurementValueSource object) {
				return createMeasurementValueSourceAdapter();
			}
			@Override
			public Adapter caseAnalog(Analog object) {
				return createAnalogAdapter();
			}
			@Override
			public Adapter caseAnalogValue(AnalogValue object) {
				return createAnalogValueAdapter();
			}
			@Override
			public Adapter caseMeasurementType(MeasurementType object) {
				return createMeasurementTypeAdapter();
			}
			@Override
			public Adapter caseDiscrete(Discrete object) {
				return createDiscreteAdapter();
			}
			@Override
			public Adapter caseLimitSet(LimitSet object) {
				return createLimitSetAdapter();
			}
			@Override
			public Adapter caseNonConformLoadGroup(NonConformLoadGroup object) {
				return createNonConformLoadGroupAdapter();
			}
			@Override
			public Adapter caseConformLoadSchedule(ConformLoadSchedule object) {
				return createConformLoadScheduleAdapter();
			}
			@Override
			public Adapter caseCustomerLoad(CustomerLoad object) {
				return createCustomerLoadAdapter();
			}
			@Override
			public Adapter caseNonConformLoad(NonConformLoad object) {
				return createNonConformLoadAdapter();
			}
			@Override
			public Adapter caseDayType(DayType object) {
				return createDayTypeAdapter();
			}
			@Override
			public Adapter caseSeason(Season object) {
				return createSeasonAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseStationSupply(StationSupply object) {
				return createStationSupplyAdapter();
			}
			@Override
			public Adapter caseSeasonDayTypeSchedule(SeasonDayTypeSchedule object) {
				return createSeasonDayTypeScheduleAdapter();
			}
			@Override
			public Adapter caseLoadGroup(LoadGroup object) {
				return createLoadGroupAdapter();
			}
			@Override
			public Adapter caseEnergyArea(EnergyArea object) {
				return createEnergyAreaAdapter();
			}
			@Override
			public Adapter caseConformLoadGroup(ConformLoadGroup object) {
				return createConformLoadGroupAdapter();
			}
			@Override
			public Adapter caseLoadArea(LoadArea object) {
				return createLoadAreaAdapter();
			}
			@Override
			public Adapter caseSubLoadArea(SubLoadArea object) {
				return createSubLoadAreaAdapter();
			}
			@Override
			public Adapter caseLoadResponseCharacteristic(LoadResponseCharacteristic object) {
				return createLoadResponseCharacteristicAdapter();
			}
			@Override
			public Adapter caseNonConformLoadSchedule(NonConformLoadSchedule object) {
				return createNonConformLoadScheduleAdapter();
			}
			@Override
			public Adapter caseInductionMotorLoad(InductionMotorLoad object) {
				return createInductionMotorLoadAdapter();
			}
			@Override
			public Adapter caseConformLoad(ConformLoad object) {
				return createConformLoadAdapter();
			}
			@Override
			public Adapter caseEquivalentNetwork(EquivalentNetwork object) {
				return createEquivalentNetworkAdapter();
			}
			@Override
			public Adapter caseEquivalentShunt(EquivalentShunt object) {
				return createEquivalentShuntAdapter();
			}
			@Override
			public Adapter caseEquivalentEquipment(EquivalentEquipment object) {
				return createEquivalentEquipmentAdapter();
			}
			@Override
			public Adapter caseEquivalentBranch(EquivalentBranch object) {
				return createEquivalentBranchAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseBaseVoltage(BaseVoltage object) {
				return createBaseVoltageAdapter();
			}
			@Override
			public Adapter caseRegularIntervalSchedule(RegularIntervalSchedule object) {
				return createRegularIntervalScheduleAdapter();
			}
			@Override
			public Adapter caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
				return createConnectivityNodeContainerAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseEquipmentContainer(EquipmentContainer object) {
				return createEquipmentContainerAdapter();
			}
			@Override
			public Adapter caseVoltageLevel(VoltageLevel object) {
				return createVoltageLevelAdapter();
			}
			@Override
			public Adapter caseBay(Bay object) {
				return createBayAdapter();
			}
			@Override
			public Adapter caseSubGeographicalRegion(SubGeographicalRegion object) {
				return createSubGeographicalRegionAdapter();
			}
			@Override
			public Adapter caseRegularTimePoint(RegularTimePoint object) {
				return createRegularTimePointAdapter();
			}
			@Override
			public Adapter caseEquipment(Equipment object) {
				return createEquipmentAdapter();
			}
			@Override
			public Adapter caseSubstation(Substation object) {
				return createSubstationAdapter();
			}
			@Override
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseBasicIntervalSchedule(BasicIntervalSchedule object) {
				return createBasicIntervalScheduleAdapter();
			}
			@Override
			public Adapter caseCurveData(CurveData object) {
				return createCurveDataAdapter();
			}
			@Override
			public Adapter caseGeographicalRegion(GeographicalRegion object) {
				return createGeographicalRegionAdapter();
			}
			@Override
			public Adapter caseConductingEquipment(ConductingEquipment object) {
				return createConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseControlArea(ControlArea object) {
				return createControlAreaAdapter();
			}
			@Override
			public Adapter caseTieFlow(TieFlow object) {
				return createTieFlowAdapter();
			}
			@Override
			public Adapter caseControlAreaGeneratingUnit(ControlAreaGeneratingUnit object) {
				return createControlAreaGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseConnectivityNode(ConnectivityNode object) {
				return createConnectivityNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.IEC61970CIMVersion <em>IEC61970CIM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.IEC61970CIMVersion
	 * @generated
	 */
	public Adapter createIEC61970CIMVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.CommonPowerSystemModel <em>Common Power System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.CommonPowerSystemModel
	 * @generated
	 */
	public Adapter createCommonPowerSystemModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.GrossToNetActivePowerCurve
	 * @generated
	 */
	public Adapter createGrossToNetActivePowerCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.HydroGeneratingUnit
	 * @generated
	 */
	public Adapter createHydroGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ThermalGeneratingUnit
	 * @generated
	 */
	public Adapter createThermalGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.GeneratingUnit
	 * @generated
	 */
	public Adapter createGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimit
	 * @generated
	 */
	public Adapter createOperationalLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimitSet
	 * @generated
	 */
	public Adapter createOperationalLimitSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ActivePowerLimit
	 * @generated
	 */
	public Adapter createActivePowerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ApparentPowerLimit
	 * @generated
	 */
	public Adapter createApparentPowerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.VoltageLimit
	 * @generated
	 */
	public Adapter createVoltageLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.CurrentLimit
	 * @generated
	 */
	public Adapter createCurrentLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.PowerTransformer
	 * @generated
	 */
	public Adapter createPowerTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Disconnector
	 * @generated
	 */
	public Adapter createDisconnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.SynchronousMachine
	 * @generated
	 */
	public Adapter createSynchronousMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.BusbarSection
	 * @generated
	 */
	public Adapter createBusbarSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ShuntCompensator
	 * @generated
	 */
	public Adapter createShuntCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.LoadBreakSwitch
	 * @generated
	 */
	public Adapter createLoadBreakSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.RegulatingCondEq
	 * @generated
	 */
	public Adapter createRegulatingCondEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.TransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.TransformerWinding
	 * @generated
	 */
	public Adapter createTransformerWindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.RegulatingControl
	 * @generated
	 */
	public Adapter createRegulatingControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.RegulationSchedule
	 * @generated
	 */
	public Adapter createRegulationScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ACLineSegment
	 * @generated
	 */
	public Adapter createACLineSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Conductor
	 * @generated
	 */
	public Adapter createConductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ReactiveCapabilityCurve
	 * @generated
	 */
	public Adapter createReactiveCapabilityCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.TapChanger
	 * @generated
	 */
	public Adapter createTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.StaticVarCompensator
	 * @generated
	 */
	public Adapter createStaticVarCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.SeriesCompensator
	 * @generated
	 */
	public Adapter createSeriesCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Breaker
	 * @generated
	 */
	public Adapter createBreakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.DiscreteValue <em>Discrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.DiscreteValue
	 * @generated
	 */
	public Adapter createDiscreteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.MeasurementValue
	 * @generated
	 */
	public Adapter createMeasurementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.MeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.MeasurementValueSource
	 * @generated
	 */
	public Adapter createMeasurementValueSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Analog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Analog
	 * @generated
	 */
	public Adapter createAnalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.AnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.AnalogValue
	 * @generated
	 */
	public Adapter createAnalogValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.MeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.MeasurementType
	 * @generated
	 */
	public Adapter createMeasurementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Discrete
	 * @generated
	 */
	public Adapter createDiscreteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.LimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.LimitSet
	 * @generated
	 */
	public Adapter createLimitSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.NonConformLoadGroup
	 * @generated
	 */
	public Adapter createNonConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConformLoadSchedule
	 * @generated
	 */
	public Adapter createConformLoadScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.CustomerLoad <em>Customer Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.CustomerLoad
	 * @generated
	 */
	public Adapter createCustomerLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.NonConformLoad
	 * @generated
	 */
	public Adapter createNonConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.DayType
	 * @generated
	 */
	public Adapter createDayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Season
	 * @generated
	 */
	public Adapter createSeasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.StationSupply
	 * @generated
	 */
	public Adapter createStationSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.SeasonDayTypeSchedule
	 * @generated
	 */
	public Adapter createSeasonDayTypeScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.LoadGroup
	 * @generated
	 */
	public Adapter createLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EnergyArea
	 * @generated
	 */
	public Adapter createEnergyAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConformLoadGroup
	 * @generated
	 */
	public Adapter createConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.LoadArea
	 * @generated
	 */
	public Adapter createLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.SubLoadArea
	 * @generated
	 */
	public Adapter createSubLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.LoadResponseCharacteristic
	 * @generated
	 */
	public Adapter createLoadResponseCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.NonConformLoadSchedule
	 * @generated
	 */
	public Adapter createNonConformLoadScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.InductionMotorLoad <em>Induction Motor Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.InductionMotorLoad
	 * @generated
	 */
	public Adapter createInductionMotorLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConformLoad
	 * @generated
	 */
	public Adapter createConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EquivalentNetwork
	 * @generated
	 */
	public Adapter createEquivalentNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EquivalentShunt <em>Equivalent Shunt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EquivalentShunt
	 * @generated
	 */
	public Adapter createEquivalentShuntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EquivalentEquipment <em>Equivalent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EquivalentEquipment
	 * @generated
	 */
	public Adapter createEquivalentEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EquivalentBranch <em>Equivalent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EquivalentBranch
	 * @generated
	 */
	public Adapter createEquivalentBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.BaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.BaseVoltage
	 * @generated
	 */
	public Adapter createBaseVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.RegularIntervalSchedule
	 * @generated
	 */
	public Adapter createRegularIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConnectivityNodeContainer
	 * @generated
	 */
	public Adapter createConnectivityNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.EquipmentContainer
	 * @generated
	 */
	public Adapter createEquipmentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.VoltageLevel
	 * @generated
	 */
	public Adapter createVoltageLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Bay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Bay
	 * @generated
	 */
	public Adapter createBayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.SubGeographicalRegion
	 * @generated
	 */
	public Adapter createSubGeographicalRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.RegularTimePoint <em>Regular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.RegularTimePoint
	 * @generated
	 */
	public Adapter createRegularTimePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Equipment
	 * @generated
	 */
	public Adapter createEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Substation
	 * @generated
	 */
	public Adapter createSubstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Curve
	 * @generated
	 */
	public Adapter createCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.BasicIntervalSchedule
	 * @generated
	 */
	public Adapter createBasicIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.CurveData <em>Curve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.CurveData
	 * @generated
	 */
	public Adapter createCurveDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.GeographicalRegion
	 * @generated
	 */
	public Adapter createGeographicalRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConductingEquipment
	 * @generated
	 */
	public Adapter createConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ControlArea
	 * @generated
	 */
	public Adapter createControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.TieFlow
	 * @generated
	 */
	public Adapter createTieFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ControlAreaGeneratingUnit
	 * @generated
	 */
	public Adapter createControlAreaGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.ConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.ConnectivityNode
	 * @generated
	 */
	public Adapter createConnectivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CPSMAdapterFactory
