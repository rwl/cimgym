/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPSMFactoryImpl extends EFactoryImpl implements CPSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPSMFactory init() {
		try {
			CPSMFactory theCPSMFactory = (CPSMFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#"); 
			if (theCPSMFactory != null) {
				return theCPSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CPSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CPSMPackage.IEC61970CIM_VERSION: return createIEC61970CIMVersion();
			case CPSMPackage.COMMON_POWER_SYSTEM_MODEL: return createCommonPowerSystemModel();
			case CPSMPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: return createGrossToNetActivePowerCurve();
			case CPSMPackage.HYDRO_GENERATING_UNIT: return createHydroGeneratingUnit();
			case CPSMPackage.THERMAL_GENERATING_UNIT: return createThermalGeneratingUnit();
			case CPSMPackage.GENERATING_UNIT: return createGeneratingUnit();
			case CPSMPackage.OPERATIONAL_LIMIT_SET: return createOperationalLimitSet();
			case CPSMPackage.ACTIVE_POWER_LIMIT: return createActivePowerLimit();
			case CPSMPackage.APPARENT_POWER_LIMIT: return createApparentPowerLimit();
			case CPSMPackage.VOLTAGE_LIMIT: return createVoltageLimit();
			case CPSMPackage.CURRENT_LIMIT: return createCurrentLimit();
			case CPSMPackage.POWER_TRANSFORMER: return createPowerTransformer();
			case CPSMPackage.DISCONNECTOR: return createDisconnector();
			case CPSMPackage.SYNCHRONOUS_MACHINE: return createSynchronousMachine();
			case CPSMPackage.BUSBAR_SECTION: return createBusbarSection();
			case CPSMPackage.SHUNT_COMPENSATOR: return createShuntCompensator();
			case CPSMPackage.LOAD_BREAK_SWITCH: return createLoadBreakSwitch();
			case CPSMPackage.TRANSFORMER_WINDING: return createTransformerWinding();
			case CPSMPackage.REGULATING_CONTROL: return createRegulatingControl();
			case CPSMPackage.REGULATION_SCHEDULE: return createRegulationSchedule();
			case CPSMPackage.AC_LINE_SEGMENT: return createACLineSegment();
			case CPSMPackage.SWITCH: return createSwitch();
			case CPSMPackage.REACTIVE_CAPABILITY_CURVE: return createReactiveCapabilityCurve();
			case CPSMPackage.TAP_CHANGER: return createTapChanger();
			case CPSMPackage.LINE: return createLine();
			case CPSMPackage.STATIC_VAR_COMPENSATOR: return createStaticVarCompensator();
			case CPSMPackage.SERIES_COMPENSATOR: return createSeriesCompensator();
			case CPSMPackage.BREAKER: return createBreaker();
			case CPSMPackage.DISCRETE_VALUE: return createDiscreteValue();
			case CPSMPackage.MEASUREMENT_VALUE_SOURCE: return createMeasurementValueSource();
			case CPSMPackage.ANALOG: return createAnalog();
			case CPSMPackage.ANALOG_VALUE: return createAnalogValue();
			case CPSMPackage.MEASUREMENT_TYPE: return createMeasurementType();
			case CPSMPackage.DISCRETE: return createDiscrete();
			case CPSMPackage.LIMIT_SET: return createLimitSet();
			case CPSMPackage.NON_CONFORM_LOAD_GROUP: return createNonConformLoadGroup();
			case CPSMPackage.CONFORM_LOAD_SCHEDULE: return createConformLoadSchedule();
			case CPSMPackage.CUSTOMER_LOAD: return createCustomerLoad();
			case CPSMPackage.NON_CONFORM_LOAD: return createNonConformLoad();
			case CPSMPackage.DAY_TYPE: return createDayType();
			case CPSMPackage.SEASON: return createSeason();
			case CPSMPackage.LOAD: return createLoad();
			case CPSMPackage.STATION_SUPPLY: return createStationSupply();
			case CPSMPackage.CONFORM_LOAD_GROUP: return createConformLoadGroup();
			case CPSMPackage.LOAD_AREA: return createLoadArea();
			case CPSMPackage.SUB_LOAD_AREA: return createSubLoadArea();
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC: return createLoadResponseCharacteristic();
			case CPSMPackage.NON_CONFORM_LOAD_SCHEDULE: return createNonConformLoadSchedule();
			case CPSMPackage.INDUCTION_MOTOR_LOAD: return createInductionMotorLoad();
			case CPSMPackage.CONFORM_LOAD: return createConformLoad();
			case CPSMPackage.EQUIVALENT_NETWORK: return createEquivalentNetwork();
			case CPSMPackage.EQUIVALENT_SHUNT: return createEquivalentShunt();
			case CPSMPackage.EQUIVALENT_BRANCH: return createEquivalentBranch();
			case CPSMPackage.TERMINAL: return createTerminal();
			case CPSMPackage.BASE_VOLTAGE: return createBaseVoltage();
			case CPSMPackage.UNIT: return createUnit();
			case CPSMPackage.VOLTAGE_LEVEL: return createVoltageLevel();
			case CPSMPackage.BAY: return createBay();
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION: return createSubGeographicalRegion();
			case CPSMPackage.REGULAR_TIME_POINT: return createRegularTimePoint();
			case CPSMPackage.SUBSTATION: return createSubstation();
			case CPSMPackage.CURVE_DATA: return createCurveData();
			case CPSMPackage.GEOGRAPHICAL_REGION: return createGeographicalRegion();
			case CPSMPackage.CONTROL_AREA: return createControlArea();
			case CPSMPackage.TIE_FLOW: return createTieFlow();
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT: return createControlAreaGeneratingUnit();
			case CPSMPackage.CONNECTIVITY_NODE: return createConnectivityNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CPSMPackage.GENERATOR_CONTROL_SOURCE:
				return createGeneratorControlSourceFromString(eDataType, initialValue);
			case CPSMPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return createSynchronousMachineOperatingModeFromString(eDataType, initialValue);
			case CPSMPackage.TAP_CHANGER_KIND:
				return createTapChangerKindFromString(eDataType, initialValue);
			case CPSMPackage.SVC_CONTROL_MODE:
				return createSVCControlModeFromString(eDataType, initialValue);
			case CPSMPackage.WINDING_TYPE:
				return createWindingTypeFromString(eDataType, initialValue);
			case CPSMPackage.SYNCHRONOUS_MACHINE_TYPE:
				return createSynchronousMachineTypeFromString(eDataType, initialValue);
			case CPSMPackage.TRANSFORMER_CONTROL_MODE:
				return createTransformerControlModeFromString(eDataType, initialValue);
			case CPSMPackage.SEASON_NAME:
				return createSeasonNameFromString(eDataType, initialValue);
			case CPSMPackage.CURVE_STYLE:
				return createCurveStyleFromString(eDataType, initialValue);
			case CPSMPackage.CONTROL_AREA_TYPE_KIND:
				return createControlAreaTypeKindFromString(eDataType, initialValue);
			case CPSMPackage.UNIT_SYMBOL:
				return createUnitSymbolFromString(eDataType, initialValue);
			case CPSMPackage.CURRENT_FLOW:
				return createCurrentFlowFromString(eDataType, initialValue);
			case CPSMPackage.ACTIVE_POWER:
				return createActivePowerFromString(eDataType, initialValue);
			case CPSMPackage.SECONDS:
				return createSecondsFromString(eDataType, initialValue);
			case CPSMPackage.SUSCEPTANCE:
				return createSusceptanceFromString(eDataType, initialValue);
			case CPSMPackage.CONDUCTANCE:
				return createConductanceFromString(eDataType, initialValue);
			case CPSMPackage.RESISTANCE:
				return createResistanceFromString(eDataType, initialValue);
			case CPSMPackage.PER_CENT:
				return createPerCentFromString(eDataType, initialValue);
			case CPSMPackage.REACTIVE_POWER:
				return createReactivePowerFromString(eDataType, initialValue);
			case CPSMPackage.ANGLE_DEGREES:
				return createAngleDegreesFromString(eDataType, initialValue);
			case CPSMPackage.VOLTAGE:
				return createVoltageFromString(eDataType, initialValue);
			case CPSMPackage.APPARENT_POWER:
				return createApparentPowerFromString(eDataType, initialValue);
			case CPSMPackage.REACTANCE:
				return createReactanceFromString(eDataType, initialValue);
			case CPSMPackage.VOLTAGE_PER_REACTIVE_POWER:
				return createVoltagePerReactivePowerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CPSMPackage.GENERATOR_CONTROL_SOURCE:
				return convertGeneratorControlSourceToString(eDataType, instanceValue);
			case CPSMPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return convertSynchronousMachineOperatingModeToString(eDataType, instanceValue);
			case CPSMPackage.TAP_CHANGER_KIND:
				return convertTapChangerKindToString(eDataType, instanceValue);
			case CPSMPackage.SVC_CONTROL_MODE:
				return convertSVCControlModeToString(eDataType, instanceValue);
			case CPSMPackage.WINDING_TYPE:
				return convertWindingTypeToString(eDataType, instanceValue);
			case CPSMPackage.SYNCHRONOUS_MACHINE_TYPE:
				return convertSynchronousMachineTypeToString(eDataType, instanceValue);
			case CPSMPackage.TRANSFORMER_CONTROL_MODE:
				return convertTransformerControlModeToString(eDataType, instanceValue);
			case CPSMPackage.SEASON_NAME:
				return convertSeasonNameToString(eDataType, instanceValue);
			case CPSMPackage.CURVE_STYLE:
				return convertCurveStyleToString(eDataType, instanceValue);
			case CPSMPackage.CONTROL_AREA_TYPE_KIND:
				return convertControlAreaTypeKindToString(eDataType, instanceValue);
			case CPSMPackage.UNIT_SYMBOL:
				return convertUnitSymbolToString(eDataType, instanceValue);
			case CPSMPackage.CURRENT_FLOW:
				return convertCurrentFlowToString(eDataType, instanceValue);
			case CPSMPackage.ACTIVE_POWER:
				return convertActivePowerToString(eDataType, instanceValue);
			case CPSMPackage.SECONDS:
				return convertSecondsToString(eDataType, instanceValue);
			case CPSMPackage.SUSCEPTANCE:
				return convertSusceptanceToString(eDataType, instanceValue);
			case CPSMPackage.CONDUCTANCE:
				return convertConductanceToString(eDataType, instanceValue);
			case CPSMPackage.RESISTANCE:
				return convertResistanceToString(eDataType, instanceValue);
			case CPSMPackage.PER_CENT:
				return convertPerCentToString(eDataType, instanceValue);
			case CPSMPackage.REACTIVE_POWER:
				return convertReactivePowerToString(eDataType, instanceValue);
			case CPSMPackage.ANGLE_DEGREES:
				return convertAngleDegreesToString(eDataType, instanceValue);
			case CPSMPackage.VOLTAGE:
				return convertVoltageToString(eDataType, instanceValue);
			case CPSMPackage.APPARENT_POWER:
				return convertApparentPowerToString(eDataType, instanceValue);
			case CPSMPackage.REACTANCE:
				return convertReactanceToString(eDataType, instanceValue);
			case CPSMPackage.VOLTAGE_PER_REACTIVE_POWER:
				return convertVoltagePerReactivePowerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61970CIMVersion createIEC61970CIMVersion() {
		IEC61970CIMVersionImpl iec61970CIMVersion = new IEC61970CIMVersionImpl();
		return iec61970CIMVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPowerSystemModel createCommonPowerSystemModel() {
		CommonPowerSystemModelImpl commonPowerSystemModel = new CommonPowerSystemModelImpl();
		return commonPowerSystemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrossToNetActivePowerCurve createGrossToNetActivePowerCurve() {
		GrossToNetActivePowerCurveImpl grossToNetActivePowerCurve = new GrossToNetActivePowerCurveImpl();
		return grossToNetActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingUnit createHydroGeneratingUnit() {
		HydroGeneratingUnitImpl hydroGeneratingUnit = new HydroGeneratingUnitImpl();
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit createThermalGeneratingUnit() {
		ThermalGeneratingUnitImpl thermalGeneratingUnit = new ThermalGeneratingUnitImpl();
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit createGeneratingUnit() {
		GeneratingUnitImpl generatingUnit = new GeneratingUnitImpl();
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet createOperationalLimitSet() {
		OperationalLimitSetImpl operationalLimitSet = new OperationalLimitSetImpl();
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimit createActivePowerLimit() {
		ActivePowerLimitImpl activePowerLimit = new ActivePowerLimitImpl();
		return activePowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimit createApparentPowerLimit() {
		ApparentPowerLimitImpl apparentPowerLimit = new ApparentPowerLimitImpl();
		return apparentPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimit createVoltageLimit() {
		VoltageLimitImpl voltageLimit = new VoltageLimitImpl();
		return voltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimit createCurrentLimit() {
		CurrentLimitImpl currentLimit = new CurrentLimitImpl();
		return currentLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer createPowerTransformer() {
		PowerTransformerImpl powerTransformer = new PowerTransformerImpl();
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconnector createDisconnector() {
		DisconnectorImpl disconnector = new DisconnectorImpl();
		return disconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine createSynchronousMachine() {
		SynchronousMachineImpl synchronousMachine = new SynchronousMachineImpl();
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarSection createBusbarSection() {
		BusbarSectionImpl busbarSection = new BusbarSectionImpl();
		return busbarSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator createShuntCompensator() {
		ShuntCompensatorImpl shuntCompensator = new ShuntCompensatorImpl();
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBreakSwitch createLoadBreakSwitch() {
		LoadBreakSwitchImpl loadBreakSwitch = new LoadBreakSwitchImpl();
		return loadBreakSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding createTransformerWinding() {
		TransformerWindingImpl transformerWinding = new TransformerWindingImpl();
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl createRegulatingControl() {
		RegulatingControlImpl regulatingControl = new RegulatingControlImpl();
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule createRegulationSchedule() {
		RegulationScheduleImpl regulationSchedule = new RegulationScheduleImpl();
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACLineSegment createACLineSegment() {
		ACLineSegmentImpl acLineSegment = new ACLineSegmentImpl();
		return acLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve createReactiveCapabilityCurve() {
		ReactiveCapabilityCurveImpl reactiveCapabilityCurve = new ReactiveCapabilityCurveImpl();
		return reactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger createTapChanger() {
		TapChangerImpl tapChanger = new TapChangerImpl();
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticVarCompensator createStaticVarCompensator() {
		StaticVarCompensatorImpl staticVarCompensator = new StaticVarCompensatorImpl();
		return staticVarCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesCompensator createSeriesCompensator() {
		SeriesCompensatorImpl seriesCompensator = new SeriesCompensatorImpl();
		return seriesCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breaker createBreaker() {
		BreakerImpl breaker = new BreakerImpl();
		return breaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteValue createDiscreteValue() {
		DiscreteValueImpl discreteValue = new DiscreteValueImpl();
		return discreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource createMeasurementValueSource() {
		MeasurementValueSourceImpl measurementValueSource = new MeasurementValueSourceImpl();
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog createAnalog() {
		AnalogImpl analog = new AnalogImpl();
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue createAnalogValue() {
		AnalogValueImpl analogValue = new AnalogValueImpl();
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType createMeasurementType() {
		MeasurementTypeImpl measurementType = new MeasurementTypeImpl();
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete createDiscrete() {
		DiscreteImpl discrete = new DiscreteImpl();
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitSet createLimitSet() {
		LimitSetImpl limitSet = new LimitSetImpl();
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup createNonConformLoadGroup() {
		NonConformLoadGroupImpl nonConformLoadGroup = new NonConformLoadGroupImpl();
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadSchedule createConformLoadSchedule() {
		ConformLoadScheduleImpl conformLoadSchedule = new ConformLoadScheduleImpl();
		return conformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerLoad createCustomerLoad() {
		CustomerLoadImpl customerLoad = new CustomerLoadImpl();
		return customerLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoad createNonConformLoad() {
		NonConformLoadImpl nonConformLoad = new NonConformLoadImpl();
		return nonConformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType createDayType() {
		DayTypeImpl dayType = new DayTypeImpl();
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSupply createStationSupply() {
		StationSupplyImpl stationSupply = new StationSupplyImpl();
		return stationSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup createConformLoadGroup() {
		ConformLoadGroupImpl conformLoadGroup = new ConformLoadGroupImpl();
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea createLoadArea() {
		LoadAreaImpl loadArea = new LoadAreaImpl();
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea createSubLoadArea() {
		SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic createLoadResponseCharacteristic() {
		LoadResponseCharacteristicImpl loadResponseCharacteristic = new LoadResponseCharacteristicImpl();
		return loadResponseCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadSchedule createNonConformLoadSchedule() {
		NonConformLoadScheduleImpl nonConformLoadSchedule = new NonConformLoadScheduleImpl();
		return nonConformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductionMotorLoad createInductionMotorLoad() {
		InductionMotorLoadImpl inductionMotorLoad = new InductionMotorLoadImpl();
		return inductionMotorLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoad createConformLoad() {
		ConformLoadImpl conformLoad = new ConformLoadImpl();
		return conformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork createEquivalentNetwork() {
		EquivalentNetworkImpl equivalentNetwork = new EquivalentNetworkImpl();
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentShunt createEquivalentShunt() {
		EquivalentShuntImpl equivalentShunt = new EquivalentShuntImpl();
		return equivalentShunt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentBranch createEquivalentBranch() {
		EquivalentBranchImpl equivalentBranch = new EquivalentBranchImpl();
		return equivalentBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage createBaseVoltage() {
		BaseVoltageImpl baseVoltage = new BaseVoltageImpl();
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel createVoltageLevel() {
		VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bay createBay() {
		BayImpl bay = new BayImpl();
		return bay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion createSubGeographicalRegion() {
		SubGeographicalRegionImpl subGeographicalRegion = new SubGeographicalRegionImpl();
		return subGeographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTimePoint createRegularTimePoint() {
		RegularTimePointImpl regularTimePoint = new RegularTimePointImpl();
		return regularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveData createCurveData() {
		CurveDataImpl curveData = new CurveDataImpl();
		return curveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion createGeographicalRegion() {
		GeographicalRegionImpl geographicalRegion = new GeographicalRegionImpl();
		return geographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea createControlArea() {
		ControlAreaImpl controlArea = new ControlAreaImpl();
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow createTieFlow() {
		TieFlowImpl tieFlow = new TieFlowImpl();
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaGeneratingUnit createControlAreaGeneratingUnit() {
		ControlAreaGeneratingUnitImpl controlAreaGeneratingUnit = new ControlAreaGeneratingUnitImpl();
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode createConnectivityNode() {
		ConnectivityNodeImpl connectivityNode = new ConnectivityNodeImpl();
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlSource createGeneratorControlSourceFromString(EDataType eDataType, String initialValue) {
		GeneratorControlSource result = GeneratorControlSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorControlSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineOperatingMode createSynchronousMachineOperatingModeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineOperatingMode result = SynchronousMachineOperatingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerKind createTapChangerKindFromString(EDataType eDataType, String initialValue) {
		TapChangerKind result = TapChangerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTapChangerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCControlMode createSVCControlModeFromString(EDataType eDataType, String initialValue) {
		SVCControlMode result = SVCControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSVCControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingType createWindingTypeFromString(EDataType eDataType, String initialValue) {
		WindingType result = WindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineType createSynchronousMachineTypeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineType result = SynchronousMachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerControlMode createTransformerControlModeFromString(EDataType eDataType, String initialValue) {
		TransformerControlMode result = TransformerControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonName createSeasonNameFromString(EDataType eDataType, String initialValue) {
		SeasonName result = SeasonName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle createCurveStyleFromString(EDataType eDataType, String initialValue) {
		CurveStyle result = CurveStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaTypeKind createControlAreaTypeKindFromString(EDataType eDataType, String initialValue) {
		ControlAreaTypeKind result = ControlAreaTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlAreaTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol createUnitSymbolFromString(EDataType eDataType, String initialValue) {
		UnitSymbol result = UnitSymbol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitSymbolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createCurrentFlowFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrentFlowToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createActivePowerFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivePowerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createSecondsFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecondsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createSusceptanceFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSusceptanceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createConductanceFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductanceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createResistanceFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResistanceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPerCentFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerCentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createReactivePowerFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReactivePowerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleDegreesFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleDegreesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVoltageFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createApparentPowerFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApparentPowerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createReactanceFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReactanceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createVoltagePerReactivePowerFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltagePerReactivePowerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSMPackage getCPSMPackage() {
		return (CPSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CPSMPackage getPackage() {
		return CPSMPackage.eINSTANCE;
	}

} //CPSMFactoryImpl
