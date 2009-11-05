/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Wires.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiresFactoryImpl extends EFactoryImpl implements WiresFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresFactory init() {
		try {
			WiresFactory theWiresFactory = (WiresFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Wires"); 
			if (theWiresFactory != null) {
				return theWiresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresFactoryImpl() {
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
			case WiresPackage.POWER_TRANSFORMER: return createPowerTransformer();
			case WiresPackage.DISCONNECTOR: return createDisconnector();
			case WiresPackage.SYNCHRONOUS_MACHINE: return createSynchronousMachine();
			case WiresPackage.BUSBAR_SECTION: return createBusbarSection();
			case WiresPackage.SHUNT_COMPENSATOR: return createShuntCompensator();
			case WiresPackage.LOAD_BREAK_SWITCH: return createLoadBreakSwitch();
			case WiresPackage.REGULATING_COND_EQ: return createRegulatingCondEq();
			case WiresPackage.ENERGY_CONSUMER: return createEnergyConsumer();
			case WiresPackage.TRANSFORMER_WINDING: return createTransformerWinding();
			case WiresPackage.REGULATING_CONTROL: return createRegulatingControl();
			case WiresPackage.REGULATION_SCHEDULE: return createRegulationSchedule();
			case WiresPackage.AC_LINE_SEGMENT: return createACLineSegment();
			case WiresPackage.SWITCH: return createSwitch();
			case WiresPackage.CONDUCTOR: return createConductor();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE: return createReactiveCapabilityCurve();
			case WiresPackage.TAP_CHANGER: return createTapChanger();
			case WiresPackage.LINE: return createLine();
			case WiresPackage.STATIC_VAR_COMPENSATOR: return createStaticVarCompensator();
			case WiresPackage.SERIES_COMPENSATOR: return createSeriesCompensator();
			case WiresPackage.BREAKER: return createBreaker();
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
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return createSynchronousMachineOperatingModeFromString(eDataType, initialValue);
			case WiresPackage.TAP_CHANGER_KIND:
				return createTapChangerKindFromString(eDataType, initialValue);
			case WiresPackage.SVC_CONTROL_MODE:
				return createSVCControlModeFromString(eDataType, initialValue);
			case WiresPackage.WINDING_TYPE:
				return createWindingTypeFromString(eDataType, initialValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return createSynchronousMachineTypeFromString(eDataType, initialValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return createTransformerControlModeFromString(eDataType, initialValue);
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
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return convertSynchronousMachineOperatingModeToString(eDataType, instanceValue);
			case WiresPackage.TAP_CHANGER_KIND:
				return convertTapChangerKindToString(eDataType, instanceValue);
			case WiresPackage.SVC_CONTROL_MODE:
				return convertSVCControlModeToString(eDataType, instanceValue);
			case WiresPackage.WINDING_TYPE:
				return convertWindingTypeToString(eDataType, instanceValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return convertSynchronousMachineTypeToString(eDataType, instanceValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return convertTransformerControlModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public RegulatingCondEq createRegulatingCondEq() {
		RegulatingCondEqImpl regulatingCondEq = new RegulatingCondEqImpl();
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer createEnergyConsumer() {
		EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
		return energyConsumer;
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
	public Conductor createConductor() {
		ConductorImpl conductor = new ConductorImpl();
		return conductor;
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
	public WiresPackage getWiresPackage() {
		return (WiresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresPackage getPackage() {
		return WiresPackage.eINSTANCE;
	}

} //WiresFactoryImpl
