/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.ACLineSegment;
import CPSM.ActivePowerLimit;
import CPSM.Analog;
import CPSM.AnalogValue;
import CPSM.ApparentPowerLimit;
import CPSM.BaseVoltage;
import CPSM.BasicIntervalSchedule;
import CPSM.Bay;
import CPSM.Breaker;
import CPSM.BusbarSection;
import CPSM.CPSMFactory;
import CPSM.CPSMPackage;
import CPSM.CommonPowerSystemModel;
import CPSM.ConductingEquipment;
import CPSM.Conductor;
import CPSM.ConformLoad;
import CPSM.ConformLoadGroup;
import CPSM.ConformLoadSchedule;
import CPSM.ConnectivityNode;
import CPSM.ConnectivityNodeContainer;
import CPSM.ControlArea;
import CPSM.ControlAreaGeneratingUnit;
import CPSM.ControlAreaTypeKind;
import CPSM.CurrentLimit;
import CPSM.Curve;
import CPSM.CurveData;
import CPSM.CurveStyle;
import CPSM.CustomerLoad;
import CPSM.DayType;
import CPSM.Disconnector;
import CPSM.Discrete;
import CPSM.DiscreteValue;
import CPSM.Element;
import CPSM.EnergyArea;
import CPSM.EnergyConsumer;
import CPSM.Equipment;
import CPSM.EquipmentContainer;
import CPSM.EquivalentBranch;
import CPSM.EquivalentEquipment;
import CPSM.EquivalentNetwork;
import CPSM.EquivalentShunt;
import CPSM.GeneratingUnit;
import CPSM.GeneratorControlSource;
import CPSM.GeographicalRegion;
import CPSM.GrossToNetActivePowerCurve;
import CPSM.HydroGeneratingUnit;
import CPSM.IEC61970CIMVersion;
import CPSM.IdentifiedObject;
import CPSM.InductionMotorLoad;
import CPSM.LimitSet;
import CPSM.Line;
import CPSM.Load;
import CPSM.LoadArea;
import CPSM.LoadBreakSwitch;
import CPSM.LoadGroup;
import CPSM.LoadResponseCharacteristic;
import CPSM.Measurement;
import CPSM.MeasurementType;
import CPSM.MeasurementValue;
import CPSM.MeasurementValueSource;
import CPSM.NonConformLoad;
import CPSM.NonConformLoadGroup;
import CPSM.NonConformLoadSchedule;
import CPSM.OperationalLimit;
import CPSM.OperationalLimitSet;
import CPSM.PowerSystemResource;
import CPSM.PowerTransformer;
import CPSM.ReactiveCapabilityCurve;
import CPSM.RegularIntervalSchedule;
import CPSM.RegularTimePoint;
import CPSM.RegulatingCondEq;
import CPSM.RegulatingControl;
import CPSM.RegulationSchedule;
import CPSM.SVCControlMode;
import CPSM.Season;
import CPSM.SeasonDayTypeSchedule;
import CPSM.SeasonName;
import CPSM.SeriesCompensator;
import CPSM.ShuntCompensator;
import CPSM.StaticVarCompensator;
import CPSM.StationSupply;
import CPSM.SubGeographicalRegion;
import CPSM.SubLoadArea;
import CPSM.Substation;
import CPSM.Switch;
import CPSM.SynchronousMachine;
import CPSM.SynchronousMachineOperatingMode;
import CPSM.SynchronousMachineType;
import CPSM.TapChanger;
import CPSM.TapChangerKind;
import CPSM.Terminal;
import CPSM.ThermalGeneratingUnit;
import CPSM.TieFlow;
import CPSM.TransformerControlMode;
import CPSM.TransformerWinding;
import CPSM.Unit;
import CPSM.UnitSymbol;
import CPSM.VoltageLevel;
import CPSM.VoltageLimit;
import CPSM.WindingType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CPSMPackageImpl extends EPackageImpl implements CPSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec61970CIMVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonPowerSystemModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grossToNetActivePowerCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thermalGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activePowerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apparentPowerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busbarSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shuntCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBreakSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingCondEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerWindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acLineSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveCapabilityCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticVarCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonDayTypeScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadResponseCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductionMotorLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentShuntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularIntervalScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityNodeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subGeographicalRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularTimePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicIntervalScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicalRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductingEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorControlSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineOperatingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tapChangerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum svcControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seasonNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum curveStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlAreaTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitSymbolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currentFlowEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType secondsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType susceptanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conductanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resistanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perCentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reactivePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleDegreesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voltageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType apparentPowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reactanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voltagePerReactivePowerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CPSM.CPSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CPSMPackageImpl() {
		super(eNS_URI, CPSMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CPSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CPSMPackage init() {
		if (isInited) return (CPSMPackage)EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI);

		// Obtain or create and register package
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CPSMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCPSMPackage.createPackageContents();

		// Initialize created meta-data
		theCPSMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCPSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CPSMPackage.eNS_URI, theCPSMPackage);
		return theCPSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_URI() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Model() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC61970CIMVersion() {
		return iec61970CIMVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEC61970CIMVersion_Version() {
		return (EAttribute)iec61970CIMVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEC61970CIMVersion_Date() {
		return (EAttribute)iec61970CIMVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonPowerSystemModel() {
		return commonPowerSystemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonPowerSystemModel_Elements() {
		return (EReference)commonPowerSystemModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrossToNetActivePowerCurve() {
		return grossToNetActivePowerCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrossToNetActivePowerCurve_GeneratingUnit() {
		return (EReference)grossToNetActivePowerCurveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHydroGeneratingUnit() {
		return hydroGeneratingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThermalGeneratingUnit() {
		return thermalGeneratingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratingUnit() {
		return generatingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MaxOperatingP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_NormalPF() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedGrossMaxP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedGrossMinP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GenControlSource() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedNetMaxP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_LongPF() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratingUnit_Contains_SynchronousMachines() {
		return (EReference)generatingUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratingUnit_GrossToNetActivePowerCurves() {
		return (EReference)generatingUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_InitialP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratingUnit_ControlAreaGeneratingUnit() {
		return (EReference)generatingUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ShortPF() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MinOperatingP() {
		return (EAttribute)generatingUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalLimit() {
		return operationalLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalLimit_OperationalLimitSet() {
		return (EReference)operationalLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalLimit_Type() {
		return (EAttribute)operationalLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalLimitSet() {
		return operationalLimitSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalLimitSet_Equipment() {
		return (EReference)operationalLimitSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalLimitSet_OperationalLimitValue() {
		return (EReference)operationalLimitSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivePowerLimit() {
		return activePowerLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivePowerLimit_Value() {
		return (EAttribute)activePowerLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApparentPowerLimit() {
		return apparentPowerLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApparentPowerLimit_Value() {
		return (EAttribute)apparentPowerLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageLimit() {
		return voltageLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoltageLimit_Value() {
		return (EAttribute)voltageLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentLimit() {
		return currentLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentLimit_Value() {
		return (EAttribute)currentLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerTransformer() {
		return powerTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerTransformer_Contains_TransformerWindings() {
		return (EReference)powerTransformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnector() {
		return disconnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousMachine() {
		return synchronousMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_InitialReactiveCapabilityCurve() {
		return (EReference)synchronousMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_OperatingMode() {
		return (EAttribute)synchronousMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronousMachine_MemberOf_GeneratingUnit() {
		return (EReference)synchronousMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MinQ() {
		return (EAttribute)synchronousMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Type() {
		return (EAttribute)synchronousMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MaxQ() {
		return (EAttribute)synchronousMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusbarSection() {
		return busbarSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShuntCompensator() {
		return shuntCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_MaximumSections() {
		return (EAttribute)shuntCompensatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_NormalSections() {
		return (EAttribute)shuntCompensatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_NomU() {
		return (EAttribute)shuntCompensatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShuntCompensator_ReactivePerSection() {
		return (EAttribute)shuntCompensatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBreakSwitch() {
		return loadBreakSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBreakSwitch_RatedCurrent() {
		return (EAttribute)loadBreakSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulatingCondEq() {
		return regulatingCondEqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingCondEq_RegulatingControl() {
		return (EReference)regulatingCondEqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		return energyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_QfixedPct() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Pfixed() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumer_LoadResponse() {
		return (EReference)energyConsumerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Qfixed() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_PfixedPct() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerWinding() {
		return transformerWindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_WindingType() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_TapChangers() {
		return (EReference)transformerWindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformerWinding_MemberOf_PowerTransformer() {
		return (EReference)transformerWindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_RatedS() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_X() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_RatedU() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_R() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerWinding_B() {
		return (EAttribute)transformerWindingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulatingControl() {
		return regulatingControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_Terminal() {
		return (EReference)regulatingControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_RegulationSchedule() {
		return (EReference)regulatingControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_TapChanger() {
		return (EReference)regulatingControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulatingControl_RegulatingCondEq() {
		return (EReference)regulatingControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulationSchedule() {
		return regulationScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegulationSchedule_RegulatingControl() {
		return (EReference)regulationScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACLineSegment() {
		return acLineSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_NormalOpen() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductor() {
		return conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_R() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_X() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Bch() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactiveCapabilityCurve() {
		return reactiveCapabilityCurveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine() {
		return (EReference)reactiveCapabilityCurveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapChanger() {
		return tapChangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_RegulatingControl() {
		return (EReference)tapChangerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTapChanger_TransformerWinding() {
		return (EReference)tapChangerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NormalStep() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_HighStep() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_StepPhaseShiftIncrement() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralStep() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_LowStep() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_TculControlMode() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_StepVoltageIncrement() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_Type() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralU() {
		return (EAttribute)tapChangerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Region() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticVarCompensator() {
		return staticVarCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_VoltageSetPoint() {
		return (EAttribute)staticVarCompensatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_SVCControlMode() {
		return (EAttribute)staticVarCompensatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_CapacitiveRating() {
		return (EAttribute)staticVarCompensatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_Slope() {
		return (EAttribute)staticVarCompensatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_InductiveRating() {
		return (EAttribute)staticVarCompensatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeriesCompensator() {
		return seriesCompensatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesCompensator_R() {
		return (EAttribute)seriesCompensatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesCompensator_X() {
		return (EAttribute)seriesCompensatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreaker() {
		return breakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreaker_RatedCurrent() {
		return (EAttribute)breakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteValue() {
		return discreteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteValue_MemberOf_Measurement() {
		return (EReference)discreteValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MemberOf_PSR() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_MeasurementType() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Terminal() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Unit() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementValue() {
		return measurementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementValue_MeasurementValueSource() {
		return (EReference)measurementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementValueSource() {
		return measurementValueSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementValueSource_MeasurementValues() {
		return (EReference)measurementValueSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalog() {
		return analogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalog_PositiveFlowIn() {
		return (EAttribute)analogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalog_Contain_MeasurementValues() {
		return (EReference)analogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogValue() {
		return analogValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogValue_MemberOf_Measurement() {
		return (EReference)analogValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementType() {
		return measurementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementType_Measurements() {
		return (EReference)measurementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscrete() {
		return discreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscrete_Contain_MeasurementValues() {
		return (EReference)discreteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimitSet() {
		return limitSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimitSet_IsPercentageLimits() {
		return (EAttribute)limitSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoadGroup() {
		return nonConformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoadGroup_NonConformLoadSchedules() {
		return (EReference)nonConformLoadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoadGroup_EnergyConsumers() {
		return (EReference)nonConformLoadGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoadSchedule() {
		return conformLoadScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoadSchedule_ConformLoadGroup() {
		return (EReference)conformLoadScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerLoad() {
		return customerLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoad() {
		return nonConformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoad_LoadGroup() {
		return (EReference)nonConformLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayType() {
		return dayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDayType_SeasonDayTypeSchedules() {
		return (EReference)dayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeason() {
		return seasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_EndDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_StartDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeason_SeasonDayTypeSchedules() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_Name() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationSupply() {
		return stationSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeasonDayTypeSchedule() {
		return seasonDayTypeScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeasonDayTypeSchedule_DayType() {
		return (EReference)seasonDayTypeScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeasonDayTypeSchedule_Season() {
		return (EReference)seasonDayTypeScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadGroup() {
		return loadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadGroup_SubLoadArea() {
		return (EReference)loadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyArea() {
		return energyAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyArea_ControlArea() {
		return (EReference)energyAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoadGroup() {
		return conformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoadGroup_EnergyConsumers() {
		return (EReference)conformLoadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoadGroup_ConformLoadSchedules() {
		return (EReference)conformLoadGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadArea() {
		return loadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadArea_SubLoadAreas() {
		return (EReference)loadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLoadArea() {
		return subLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLoadArea_LoadGroups() {
		return (EReference)subLoadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLoadArea_LoadArea() {
		return (EReference)subLoadAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadResponseCharacteristic() {
		return loadResponseCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PFrequencyExponent() {
		return (EAttribute)loadResponseCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QVoltageExponent() {
		return (EAttribute)loadResponseCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QFrequencyExponent() {
		return (EAttribute)loadResponseCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PVoltageExponent() {
		return (EAttribute)loadResponseCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadResponseCharacteristic_EnergyConsumer() {
		return (EReference)loadResponseCharacteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoadSchedule() {
		return nonConformLoadScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoadSchedule_NonConformLoadGroup() {
		return (EReference)nonConformLoadScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductionMotorLoad() {
		return inductionMotorLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoad() {
		return conformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoad_LoadGroup() {
		return (EReference)conformLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentNetwork() {
		return equivalentNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentNetwork_EquivalentEquipments() {
		return (EReference)equivalentNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentShunt() {
		return equivalentShuntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquivalentShunt_B() {
		return (EAttribute)equivalentShuntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquivalentShunt_G() {
		return (EAttribute)equivalentShuntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentEquipment() {
		return equivalentEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentEquipment_EquivalentNetwork() {
		return (EReference)equivalentEquipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentBranch() {
		return equivalentBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquivalentBranch_X() {
		return (EAttribute)equivalentBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquivalentBranch_R() {
		return (EAttribute)equivalentBranchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedObject() {
		return identifiedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedObject_PathName() {
		return (EAttribute)identifiedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedObject_Description() {
		return (EAttribute)identifiedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedObject_AliasName() {
		return (EAttribute)identifiedObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedObject_Name() {
		return (EAttribute)identifiedObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_Measurements() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_RegulatingControl() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_ConnectivityNode() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_ConductingEquipment() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseVoltage() {
		return baseVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseVoltage_NominalVoltage() {
		return (EAttribute)baseVoltageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseVoltage_ConductingEquipment() {
		return (EReference)baseVoltageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseVoltage_VoltageLevel() {
		return (EReference)baseVoltageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularIntervalSchedule() {
		return regularIntervalScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularIntervalSchedule_EndTime() {
		return (EAttribute)regularIntervalScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularIntervalSchedule_TimePoints() {
		return (EReference)regularIntervalScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularIntervalSchedule_TimeStep() {
		return (EAttribute)regularIntervalScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivityNodeContainer() {
		return connectivityNodeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectivityNodeContainer_ConnectivityNodes() {
		return (EReference)connectivityNodeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Measurements() {
		return (EReference)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipmentContainer() {
		return equipmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipmentContainer_Contains_Equipments() {
		return (EReference)equipmentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageLevel() {
		return voltageLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageLevel_MemberOf_Substation() {
		return (EReference)voltageLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoltageLevel_LowVoltageLimit() {
		return (EAttribute)voltageLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoltageLevel_HighVoltageLimit() {
		return (EAttribute)voltageLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageLevel_BaseVoltage() {
		return (EReference)voltageLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoltageLevel_Contains_Bays() {
		return (EReference)voltageLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBay() {
		return bayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBay_MemberOf_VoltageLevel() {
		return (EReference)bayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubGeographicalRegion() {
		return subGeographicalRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Region() {
		return (EReference)subGeographicalRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Lines() {
		return (EReference)subGeographicalRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Substations() {
		return (EReference)subGeographicalRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularTimePoint() {
		return regularTimePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularTimePoint_Value1() {
		return (EAttribute)regularTimePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularTimePoint_SequenceNumber() {
		return (EAttribute)regularTimePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularTimePoint_Value2() {
		return (EAttribute)regularTimePointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularTimePoint_IntervalSchedule() {
		return (EReference)regularTimePointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipment_MemberOf_EquipmentContainer() {
		return (EReference)equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipment_OperationalLimitSet() {
		return (EReference)equipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstation() {
		return substationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Region() {
		return (EReference)substationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Contains_VoltageLevels() {
		return (EReference)substationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurve() {
		return curveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurve_Y2Unit() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurve_XUnit() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurve_CurveScheduleDatas() {
		return (EReference)curveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurve_CurveStyle() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurve_Y1Unit() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSystemResource() {
		return powerSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSystemResource_Contains_Measurements() {
		return (EReference)powerSystemResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicIntervalSchedule() {
		return basicIntervalScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_StartTime() {
		return (EAttribute)basicIntervalScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value1Unit() {
		return (EAttribute)basicIntervalScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value2Unit() {
		return (EAttribute)basicIntervalScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurveData() {
		return curveDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveData_Y2value() {
		return (EAttribute)curveDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveData_Xvalue() {
		return (EAttribute)curveDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveData_Y1value() {
		return (EAttribute)curveDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurveData_CurveSchedule() {
		return (EReference)curveDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographicalRegion() {
		return geographicalRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographicalRegion_Regions() {
		return (EReference)geographicalRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductingEquipment() {
		return conductingEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductingEquipment_BaseVoltage() {
		return (EReference)conductingEquipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductingEquipment_Terminals() {
		return (EReference)conductingEquipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlArea() {
		return controlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlArea_ControlAreaGeneratingUnit() {
		return (EReference)controlAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlArea_NetInterchange() {
		return (EAttribute)controlAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlArea_EnergyArea() {
		return (EReference)controlAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlArea_TieFlow() {
		return (EReference)controlAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlArea_Type() {
		return (EAttribute)controlAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTieFlow() {
		return tieFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTieFlow_ControlArea() {
		return (EReference)tieFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTieFlow_PositiveFlowIn() {
		return (EAttribute)tieFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlAreaGeneratingUnit() {
		return controlAreaGeneratingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaGeneratingUnit_ControlArea() {
		return (EReference)controlAreaGeneratingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaGeneratingUnit_GeneratingUnit() {
		return (EReference)controlAreaGeneratingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivityNode() {
		return connectivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectivityNode_Terminals() {
		return (EReference)connectivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectivityNode_MemberOf_EquipmentContainer() {
		return (EReference)connectivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneratorControlSource() {
		return generatorControlSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronousMachineOperatingMode() {
		return synchronousMachineOperatingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTapChangerKind() {
		return tapChangerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSVCControlMode() {
		return svcControlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindingType() {
		return windingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronousMachineType() {
		return synchronousMachineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformerControlMode() {
		return transformerControlModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeasonName() {
		return seasonNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurveStyle() {
		return curveStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlAreaTypeKind() {
		return controlAreaTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitSymbol() {
		return unitSymbolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrentFlow() {
		return currentFlowEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivePower() {
		return activePowerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSeconds() {
		return secondsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSusceptance() {
		return susceptanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConductance() {
		return conductanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResistance() {
		return resistanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerCent() {
		return perCentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReactivePower() {
		return reactivePowerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngleDegrees() {
		return angleDegreesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoltage() {
		return voltageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApparentPower() {
		return apparentPowerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReactance() {
		return reactanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoltagePerReactivePower() {
		return voltagePerReactivePowerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSMFactory getCPSMFactory() {
		return (CPSMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__URI);
		createEReference(elementEClass, ELEMENT__MODEL);

		iec61970CIMVersionEClass = createEClass(IEC61970CIM_VERSION);
		createEAttribute(iec61970CIMVersionEClass, IEC61970CIM_VERSION__VERSION);
		createEAttribute(iec61970CIMVersionEClass, IEC61970CIM_VERSION__DATE);

		commonPowerSystemModelEClass = createEClass(COMMON_POWER_SYSTEM_MODEL);
		createEReference(commonPowerSystemModelEClass, COMMON_POWER_SYSTEM_MODEL__ELEMENTS);

		grossToNetActivePowerCurveEClass = createEClass(GROSS_TO_NET_ACTIVE_POWER_CURVE);
		createEReference(grossToNetActivePowerCurveEClass, GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT);

		hydroGeneratingUnitEClass = createEClass(HYDRO_GENERATING_UNIT);

		thermalGeneratingUnitEClass = createEClass(THERMAL_GENERATING_UNIT);

		generatingUnitEClass = createEClass(GENERATING_UNIT);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__MAX_OPERATING_P);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__NORMAL_PF);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__RATED_GROSS_MAX_P);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__RATED_GROSS_MIN_P);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__GEN_CONTROL_SOURCE);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__RATED_NET_MAX_P);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__LONG_PF);
		createEReference(generatingUnitEClass, GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES);
		createEReference(generatingUnitEClass, GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__INITIAL_P);
		createEReference(generatingUnitEClass, GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__SHORT_PF);
		createEAttribute(generatingUnitEClass, GENERATING_UNIT__MIN_OPERATING_P);

		operationalLimitEClass = createEClass(OPERATIONAL_LIMIT);
		createEReference(operationalLimitEClass, OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET);
		createEAttribute(operationalLimitEClass, OPERATIONAL_LIMIT__TYPE);

		operationalLimitSetEClass = createEClass(OPERATIONAL_LIMIT_SET);
		createEReference(operationalLimitSetEClass, OPERATIONAL_LIMIT_SET__EQUIPMENT);
		createEReference(operationalLimitSetEClass, OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE);

		activePowerLimitEClass = createEClass(ACTIVE_POWER_LIMIT);
		createEAttribute(activePowerLimitEClass, ACTIVE_POWER_LIMIT__VALUE);

		apparentPowerLimitEClass = createEClass(APPARENT_POWER_LIMIT);
		createEAttribute(apparentPowerLimitEClass, APPARENT_POWER_LIMIT__VALUE);

		voltageLimitEClass = createEClass(VOLTAGE_LIMIT);
		createEAttribute(voltageLimitEClass, VOLTAGE_LIMIT__VALUE);

		currentLimitEClass = createEClass(CURRENT_LIMIT);
		createEAttribute(currentLimitEClass, CURRENT_LIMIT__VALUE);

		powerTransformerEClass = createEClass(POWER_TRANSFORMER);
		createEReference(powerTransformerEClass, POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS);

		disconnectorEClass = createEClass(DISCONNECTOR);

		synchronousMachineEClass = createEClass(SYNCHRONOUS_MACHINE);
		createEReference(synchronousMachineEClass, SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE);
		createEAttribute(synchronousMachineEClass, SYNCHRONOUS_MACHINE__OPERATING_MODE);
		createEReference(synchronousMachineEClass, SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT);
		createEAttribute(synchronousMachineEClass, SYNCHRONOUS_MACHINE__MIN_Q);
		createEAttribute(synchronousMachineEClass, SYNCHRONOUS_MACHINE__TYPE);
		createEAttribute(synchronousMachineEClass, SYNCHRONOUS_MACHINE__MAX_Q);

		busbarSectionEClass = createEClass(BUSBAR_SECTION);

		shuntCompensatorEClass = createEClass(SHUNT_COMPENSATOR);
		createEAttribute(shuntCompensatorEClass, SHUNT_COMPENSATOR__MAXIMUM_SECTIONS);
		createEAttribute(shuntCompensatorEClass, SHUNT_COMPENSATOR__NORMAL_SECTIONS);
		createEAttribute(shuntCompensatorEClass, SHUNT_COMPENSATOR__NOM_U);
		createEAttribute(shuntCompensatorEClass, SHUNT_COMPENSATOR__REACTIVE_PER_SECTION);

		loadBreakSwitchEClass = createEClass(LOAD_BREAK_SWITCH);
		createEAttribute(loadBreakSwitchEClass, LOAD_BREAK_SWITCH__RATED_CURRENT);

		regulatingCondEqEClass = createEClass(REGULATING_COND_EQ);
		createEReference(regulatingCondEqEClass, REGULATING_COND_EQ__REGULATING_CONTROL);

		energyConsumerEClass = createEClass(ENERGY_CONSUMER);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__QFIXED_PCT);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__PFIXED);
		createEReference(energyConsumerEClass, ENERGY_CONSUMER__LOAD_RESPONSE);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__QFIXED);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__PFIXED_PCT);

		transformerWindingEClass = createEClass(TRANSFORMER_WINDING);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__WINDING_TYPE);
		createEReference(transformerWindingEClass, TRANSFORMER_WINDING__TAP_CHANGERS);
		createEReference(transformerWindingEClass, TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__RATED_S);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__X);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__RATED_U);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__R);
		createEAttribute(transformerWindingEClass, TRANSFORMER_WINDING__B);

		regulatingControlEClass = createEClass(REGULATING_CONTROL);
		createEReference(regulatingControlEClass, REGULATING_CONTROL__TERMINAL);
		createEReference(regulatingControlEClass, REGULATING_CONTROL__REGULATION_SCHEDULE);
		createEReference(regulatingControlEClass, REGULATING_CONTROL__TAP_CHANGER);
		createEReference(regulatingControlEClass, REGULATING_CONTROL__REGULATING_COND_EQ);

		regulationScheduleEClass = createEClass(REGULATION_SCHEDULE);
		createEReference(regulationScheduleEClass, REGULATION_SCHEDULE__REGULATING_CONTROL);

		acLineSegmentEClass = createEClass(AC_LINE_SEGMENT);

		switchEClass = createEClass(SWITCH);
		createEAttribute(switchEClass, SWITCH__NORMAL_OPEN);

		conductorEClass = createEClass(CONDUCTOR);
		createEAttribute(conductorEClass, CONDUCTOR__R);
		createEAttribute(conductorEClass, CONDUCTOR__X);
		createEAttribute(conductorEClass, CONDUCTOR__BCH);

		reactiveCapabilityCurveEClass = createEClass(REACTIVE_CAPABILITY_CURVE);
		createEReference(reactiveCapabilityCurveEClass, REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE);

		tapChangerEClass = createEClass(TAP_CHANGER);
		createEReference(tapChangerEClass, TAP_CHANGER__REGULATING_CONTROL);
		createEReference(tapChangerEClass, TAP_CHANGER__TRANSFORMER_WINDING);
		createEAttribute(tapChangerEClass, TAP_CHANGER__NORMAL_STEP);
		createEAttribute(tapChangerEClass, TAP_CHANGER__HIGH_STEP);
		createEAttribute(tapChangerEClass, TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT);
		createEAttribute(tapChangerEClass, TAP_CHANGER__NEUTRAL_STEP);
		createEAttribute(tapChangerEClass, TAP_CHANGER__LOW_STEP);
		createEAttribute(tapChangerEClass, TAP_CHANGER__TCUL_CONTROL_MODE);
		createEAttribute(tapChangerEClass, TAP_CHANGER__STEP_VOLTAGE_INCREMENT);
		createEAttribute(tapChangerEClass, TAP_CHANGER__TYPE);
		createEAttribute(tapChangerEClass, TAP_CHANGER__NEUTRAL_U);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__REGION);

		staticVarCompensatorEClass = createEClass(STATIC_VAR_COMPENSATOR);
		createEAttribute(staticVarCompensatorEClass, STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT);
		createEAttribute(staticVarCompensatorEClass, STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE);
		createEAttribute(staticVarCompensatorEClass, STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING);
		createEAttribute(staticVarCompensatorEClass, STATIC_VAR_COMPENSATOR__SLOPE);
		createEAttribute(staticVarCompensatorEClass, STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING);

		seriesCompensatorEClass = createEClass(SERIES_COMPENSATOR);
		createEAttribute(seriesCompensatorEClass, SERIES_COMPENSATOR__R);
		createEAttribute(seriesCompensatorEClass, SERIES_COMPENSATOR__X);

		breakerEClass = createEClass(BREAKER);
		createEAttribute(breakerEClass, BREAKER__RATED_CURRENT);

		discreteValueEClass = createEClass(DISCRETE_VALUE);
		createEReference(discreteValueEClass, DISCRETE_VALUE__MEMBER_OF_MEASUREMENT);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__MEMBER_OF_PSR);
		createEReference(measurementEClass, MEASUREMENT__MEASUREMENT_TYPE);
		createEReference(measurementEClass, MEASUREMENT__TERMINAL);
		createEReference(measurementEClass, MEASUREMENT__UNIT);

		measurementValueEClass = createEClass(MEASUREMENT_VALUE);
		createEReference(measurementValueEClass, MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE);

		measurementValueSourceEClass = createEClass(MEASUREMENT_VALUE_SOURCE);
		createEReference(measurementValueSourceEClass, MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES);

		analogEClass = createEClass(ANALOG);
		createEAttribute(analogEClass, ANALOG__POSITIVE_FLOW_IN);
		createEReference(analogEClass, ANALOG__CONTAIN_MEASUREMENT_VALUES);

		analogValueEClass = createEClass(ANALOG_VALUE);
		createEReference(analogValueEClass, ANALOG_VALUE__MEMBER_OF_MEASUREMENT);

		measurementTypeEClass = createEClass(MEASUREMENT_TYPE);
		createEReference(measurementTypeEClass, MEASUREMENT_TYPE__MEASUREMENTS);

		discreteEClass = createEClass(DISCRETE);
		createEReference(discreteEClass, DISCRETE__CONTAIN_MEASUREMENT_VALUES);

		limitSetEClass = createEClass(LIMIT_SET);
		createEAttribute(limitSetEClass, LIMIT_SET__IS_PERCENTAGE_LIMITS);

		nonConformLoadGroupEClass = createEClass(NON_CONFORM_LOAD_GROUP);
		createEReference(nonConformLoadGroupEClass, NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES);
		createEReference(nonConformLoadGroupEClass, NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS);

		conformLoadScheduleEClass = createEClass(CONFORM_LOAD_SCHEDULE);
		createEReference(conformLoadScheduleEClass, CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP);

		customerLoadEClass = createEClass(CUSTOMER_LOAD);

		nonConformLoadEClass = createEClass(NON_CONFORM_LOAD);
		createEReference(nonConformLoadEClass, NON_CONFORM_LOAD__LOAD_GROUP);

		dayTypeEClass = createEClass(DAY_TYPE);
		createEReference(dayTypeEClass, DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES);

		seasonEClass = createEClass(SEASON);
		createEAttribute(seasonEClass, SEASON__END_DATE);
		createEAttribute(seasonEClass, SEASON__START_DATE);
		createEReference(seasonEClass, SEASON__SEASON_DAY_TYPE_SCHEDULES);
		createEAttribute(seasonEClass, SEASON__NAME);

		loadEClass = createEClass(LOAD);

		stationSupplyEClass = createEClass(STATION_SUPPLY);

		seasonDayTypeScheduleEClass = createEClass(SEASON_DAY_TYPE_SCHEDULE);
		createEReference(seasonDayTypeScheduleEClass, SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE);
		createEReference(seasonDayTypeScheduleEClass, SEASON_DAY_TYPE_SCHEDULE__SEASON);

		loadGroupEClass = createEClass(LOAD_GROUP);
		createEReference(loadGroupEClass, LOAD_GROUP__SUB_LOAD_AREA);

		energyAreaEClass = createEClass(ENERGY_AREA);
		createEReference(energyAreaEClass, ENERGY_AREA__CONTROL_AREA);

		conformLoadGroupEClass = createEClass(CONFORM_LOAD_GROUP);
		createEReference(conformLoadGroupEClass, CONFORM_LOAD_GROUP__ENERGY_CONSUMERS);
		createEReference(conformLoadGroupEClass, CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES);

		loadAreaEClass = createEClass(LOAD_AREA);
		createEReference(loadAreaEClass, LOAD_AREA__SUB_LOAD_AREAS);

		subLoadAreaEClass = createEClass(SUB_LOAD_AREA);
		createEReference(subLoadAreaEClass, SUB_LOAD_AREA__LOAD_GROUPS);
		createEReference(subLoadAreaEClass, SUB_LOAD_AREA__LOAD_AREA);

		loadResponseCharacteristicEClass = createEClass(LOAD_RESPONSE_CHARACTERISTIC);
		createEAttribute(loadResponseCharacteristicEClass, LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT);
		createEAttribute(loadResponseCharacteristicEClass, LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT);
		createEAttribute(loadResponseCharacteristicEClass, LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT);
		createEAttribute(loadResponseCharacteristicEClass, LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT);
		createEReference(loadResponseCharacteristicEClass, LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER);

		nonConformLoadScheduleEClass = createEClass(NON_CONFORM_LOAD_SCHEDULE);
		createEReference(nonConformLoadScheduleEClass, NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP);

		inductionMotorLoadEClass = createEClass(INDUCTION_MOTOR_LOAD);

		conformLoadEClass = createEClass(CONFORM_LOAD);
		createEReference(conformLoadEClass, CONFORM_LOAD__LOAD_GROUP);

		equivalentNetworkEClass = createEClass(EQUIVALENT_NETWORK);
		createEReference(equivalentNetworkEClass, EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS);

		equivalentShuntEClass = createEClass(EQUIVALENT_SHUNT);
		createEAttribute(equivalentShuntEClass, EQUIVALENT_SHUNT__B);
		createEAttribute(equivalentShuntEClass, EQUIVALENT_SHUNT__G);

		equivalentEquipmentEClass = createEClass(EQUIVALENT_EQUIPMENT);
		createEReference(equivalentEquipmentEClass, EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK);

		equivalentBranchEClass = createEClass(EQUIVALENT_BRANCH);
		createEAttribute(equivalentBranchEClass, EQUIVALENT_BRANCH__X);
		createEAttribute(equivalentBranchEClass, EQUIVALENT_BRANCH__R);

		identifiedObjectEClass = createEClass(IDENTIFIED_OBJECT);
		createEAttribute(identifiedObjectEClass, IDENTIFIED_OBJECT__PATH_NAME);
		createEAttribute(identifiedObjectEClass, IDENTIFIED_OBJECT__DESCRIPTION);
		createEAttribute(identifiedObjectEClass, IDENTIFIED_OBJECT__ALIAS_NAME);
		createEAttribute(identifiedObjectEClass, IDENTIFIED_OBJECT__NAME);

		terminalEClass = createEClass(TERMINAL);
		createEReference(terminalEClass, TERMINAL__MEASUREMENTS);
		createEReference(terminalEClass, TERMINAL__REGULATING_CONTROL);
		createEReference(terminalEClass, TERMINAL__CONNECTIVITY_NODE);
		createEReference(terminalEClass, TERMINAL__CONDUCTING_EQUIPMENT);

		baseVoltageEClass = createEClass(BASE_VOLTAGE);
		createEAttribute(baseVoltageEClass, BASE_VOLTAGE__NOMINAL_VOLTAGE);
		createEReference(baseVoltageEClass, BASE_VOLTAGE__CONDUCTING_EQUIPMENT);
		createEReference(baseVoltageEClass, BASE_VOLTAGE__VOLTAGE_LEVEL);

		regularIntervalScheduleEClass = createEClass(REGULAR_INTERVAL_SCHEDULE);
		createEAttribute(regularIntervalScheduleEClass, REGULAR_INTERVAL_SCHEDULE__END_TIME);
		createEReference(regularIntervalScheduleEClass, REGULAR_INTERVAL_SCHEDULE__TIME_POINTS);
		createEAttribute(regularIntervalScheduleEClass, REGULAR_INTERVAL_SCHEDULE__TIME_STEP);

		connectivityNodeContainerEClass = createEClass(CONNECTIVITY_NODE_CONTAINER);
		createEReference(connectivityNodeContainerEClass, CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES);

		unitEClass = createEClass(UNIT);
		createEReference(unitEClass, UNIT__MEASUREMENTS);

		equipmentContainerEClass = createEClass(EQUIPMENT_CONTAINER);
		createEReference(equipmentContainerEClass, EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS);

		voltageLevelEClass = createEClass(VOLTAGE_LEVEL);
		createEReference(voltageLevelEClass, VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION);
		createEAttribute(voltageLevelEClass, VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT);
		createEAttribute(voltageLevelEClass, VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT);
		createEReference(voltageLevelEClass, VOLTAGE_LEVEL__BASE_VOLTAGE);
		createEReference(voltageLevelEClass, VOLTAGE_LEVEL__CONTAINS_BAYS);

		bayEClass = createEClass(BAY);
		createEReference(bayEClass, BAY__MEMBER_OF_VOLTAGE_LEVEL);

		subGeographicalRegionEClass = createEClass(SUB_GEOGRAPHICAL_REGION);
		createEReference(subGeographicalRegionEClass, SUB_GEOGRAPHICAL_REGION__REGION);
		createEReference(subGeographicalRegionEClass, SUB_GEOGRAPHICAL_REGION__LINES);
		createEReference(subGeographicalRegionEClass, SUB_GEOGRAPHICAL_REGION__SUBSTATIONS);

		regularTimePointEClass = createEClass(REGULAR_TIME_POINT);
		createEAttribute(regularTimePointEClass, REGULAR_TIME_POINT__VALUE1);
		createEAttribute(regularTimePointEClass, REGULAR_TIME_POINT__SEQUENCE_NUMBER);
		createEAttribute(regularTimePointEClass, REGULAR_TIME_POINT__VALUE2);
		createEReference(regularTimePointEClass, REGULAR_TIME_POINT__INTERVAL_SCHEDULE);

		equipmentEClass = createEClass(EQUIPMENT);
		createEReference(equipmentEClass, EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER);
		createEReference(equipmentEClass, EQUIPMENT__OPERATIONAL_LIMIT_SET);

		substationEClass = createEClass(SUBSTATION);
		createEReference(substationEClass, SUBSTATION__REGION);
		createEReference(substationEClass, SUBSTATION__CONTAINS_VOLTAGE_LEVELS);

		curveEClass = createEClass(CURVE);
		createEAttribute(curveEClass, CURVE__Y2_UNIT);
		createEAttribute(curveEClass, CURVE__XUNIT);
		createEReference(curveEClass, CURVE__CURVE_SCHEDULE_DATAS);
		createEAttribute(curveEClass, CURVE__CURVE_STYLE);
		createEAttribute(curveEClass, CURVE__Y1_UNIT);

		powerSystemResourceEClass = createEClass(POWER_SYSTEM_RESOURCE);
		createEReference(powerSystemResourceEClass, POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS);

		basicIntervalScheduleEClass = createEClass(BASIC_INTERVAL_SCHEDULE);
		createEAttribute(basicIntervalScheduleEClass, BASIC_INTERVAL_SCHEDULE__START_TIME);
		createEAttribute(basicIntervalScheduleEClass, BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT);
		createEAttribute(basicIntervalScheduleEClass, BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT);

		curveDataEClass = createEClass(CURVE_DATA);
		createEAttribute(curveDataEClass, CURVE_DATA__Y2VALUE);
		createEAttribute(curveDataEClass, CURVE_DATA__XVALUE);
		createEAttribute(curveDataEClass, CURVE_DATA__Y1VALUE);
		createEReference(curveDataEClass, CURVE_DATA__CURVE_SCHEDULE);

		geographicalRegionEClass = createEClass(GEOGRAPHICAL_REGION);
		createEReference(geographicalRegionEClass, GEOGRAPHICAL_REGION__REGIONS);

		conductingEquipmentEClass = createEClass(CONDUCTING_EQUIPMENT);
		createEReference(conductingEquipmentEClass, CONDUCTING_EQUIPMENT__BASE_VOLTAGE);
		createEReference(conductingEquipmentEClass, CONDUCTING_EQUIPMENT__TERMINALS);

		controlAreaEClass = createEClass(CONTROL_AREA);
		createEReference(controlAreaEClass, CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT);
		createEAttribute(controlAreaEClass, CONTROL_AREA__NET_INTERCHANGE);
		createEReference(controlAreaEClass, CONTROL_AREA__ENERGY_AREA);
		createEReference(controlAreaEClass, CONTROL_AREA__TIE_FLOW);
		createEAttribute(controlAreaEClass, CONTROL_AREA__TYPE);

		tieFlowEClass = createEClass(TIE_FLOW);
		createEReference(tieFlowEClass, TIE_FLOW__CONTROL_AREA);
		createEAttribute(tieFlowEClass, TIE_FLOW__POSITIVE_FLOW_IN);

		controlAreaGeneratingUnitEClass = createEClass(CONTROL_AREA_GENERATING_UNIT);
		createEReference(controlAreaGeneratingUnitEClass, CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA);
		createEReference(controlAreaGeneratingUnitEClass, CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT);

		connectivityNodeEClass = createEClass(CONNECTIVITY_NODE);
		createEReference(connectivityNodeEClass, CONNECTIVITY_NODE__TERMINALS);
		createEReference(connectivityNodeEClass, CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER);

		// Create enums
		generatorControlSourceEEnum = createEEnum(GENERATOR_CONTROL_SOURCE);
		synchronousMachineOperatingModeEEnum = createEEnum(SYNCHRONOUS_MACHINE_OPERATING_MODE);
		tapChangerKindEEnum = createEEnum(TAP_CHANGER_KIND);
		svcControlModeEEnum = createEEnum(SVC_CONTROL_MODE);
		windingTypeEEnum = createEEnum(WINDING_TYPE);
		synchronousMachineTypeEEnum = createEEnum(SYNCHRONOUS_MACHINE_TYPE);
		transformerControlModeEEnum = createEEnum(TRANSFORMER_CONTROL_MODE);
		seasonNameEEnum = createEEnum(SEASON_NAME);
		curveStyleEEnum = createEEnum(CURVE_STYLE);
		controlAreaTypeKindEEnum = createEEnum(CONTROL_AREA_TYPE_KIND);
		unitSymbolEEnum = createEEnum(UNIT_SYMBOL);

		// Create data types
		currentFlowEDataType = createEDataType(CURRENT_FLOW);
		activePowerEDataType = createEDataType(ACTIVE_POWER);
		secondsEDataType = createEDataType(SECONDS);
		susceptanceEDataType = createEDataType(SUSCEPTANCE);
		conductanceEDataType = createEDataType(CONDUCTANCE);
		resistanceEDataType = createEDataType(RESISTANCE);
		perCentEDataType = createEDataType(PER_CENT);
		reactivePowerEDataType = createEDataType(REACTIVE_POWER);
		angleDegreesEDataType = createEDataType(ANGLE_DEGREES);
		voltageEDataType = createEDataType(VOLTAGE);
		apparentPowerEDataType = createEDataType(APPARENT_POWER);
		reactanceEDataType = createEDataType(REACTANCE);
		voltagePerReactivePowerEDataType = createEDataType(VOLTAGE_PER_REACTIVE_POWER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iec61970CIMVersionEClass.getESuperTypes().add(this.getElement());
		grossToNetActivePowerCurveEClass.getESuperTypes().add(this.getCurve());
		hydroGeneratingUnitEClass.getESuperTypes().add(this.getGeneratingUnit());
		thermalGeneratingUnitEClass.getESuperTypes().add(this.getGeneratingUnit());
		generatingUnitEClass.getESuperTypes().add(this.getEquipment());
		operationalLimitEClass.getESuperTypes().add(this.getIdentifiedObject());
		operationalLimitSetEClass.getESuperTypes().add(this.getIdentifiedObject());
		activePowerLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		apparentPowerLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		voltageLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		currentLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		powerTransformerEClass.getESuperTypes().add(this.getEquipment());
		disconnectorEClass.getESuperTypes().add(this.getSwitch());
		synchronousMachineEClass.getESuperTypes().add(this.getRegulatingCondEq());
		busbarSectionEClass.getESuperTypes().add(this.getConductingEquipment());
		shuntCompensatorEClass.getESuperTypes().add(this.getRegulatingCondEq());
		loadBreakSwitchEClass.getESuperTypes().add(this.getSwitch());
		regulatingCondEqEClass.getESuperTypes().add(this.getConductingEquipment());
		energyConsumerEClass.getESuperTypes().add(this.getConductingEquipment());
		transformerWindingEClass.getESuperTypes().add(this.getConductingEquipment());
		regulatingControlEClass.getESuperTypes().add(this.getPowerSystemResource());
		regulationScheduleEClass.getESuperTypes().add(this.getRegularIntervalSchedule());
		acLineSegmentEClass.getESuperTypes().add(this.getConductor());
		switchEClass.getESuperTypes().add(this.getConductingEquipment());
		conductorEClass.getESuperTypes().add(this.getConductingEquipment());
		reactiveCapabilityCurveEClass.getESuperTypes().add(this.getCurve());
		tapChangerEClass.getESuperTypes().add(this.getPowerSystemResource());
		lineEClass.getESuperTypes().add(this.getEquipmentContainer());
		staticVarCompensatorEClass.getESuperTypes().add(this.getRegulatingCondEq());
		seriesCompensatorEClass.getESuperTypes().add(this.getConductingEquipment());
		breakerEClass.getESuperTypes().add(this.getSwitch());
		discreteValueEClass.getESuperTypes().add(this.getMeasurementValue());
		measurementEClass.getESuperTypes().add(this.getIdentifiedObject());
		measurementValueEClass.getESuperTypes().add(this.getIdentifiedObject());
		measurementValueSourceEClass.getESuperTypes().add(this.getIdentifiedObject());
		analogEClass.getESuperTypes().add(this.getMeasurement());
		analogValueEClass.getESuperTypes().add(this.getMeasurementValue());
		measurementTypeEClass.getESuperTypes().add(this.getIdentifiedObject());
		discreteEClass.getESuperTypes().add(this.getMeasurement());
		limitSetEClass.getESuperTypes().add(this.getIdentifiedObject());
		nonConformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());
		conformLoadScheduleEClass.getESuperTypes().add(this.getSeasonDayTypeSchedule());
		customerLoadEClass.getESuperTypes().add(this.getConformLoad());
		nonConformLoadEClass.getESuperTypes().add(this.getEnergyConsumer());
		dayTypeEClass.getESuperTypes().add(this.getIdentifiedObject());
		seasonEClass.getESuperTypes().add(this.getElement());
		loadEClass.getESuperTypes().add(this.getConformLoad());
		stationSupplyEClass.getESuperTypes().add(this.getEnergyConsumer());
		seasonDayTypeScheduleEClass.getESuperTypes().add(this.getRegularIntervalSchedule());
		loadGroupEClass.getESuperTypes().add(this.getIdentifiedObject());
		energyAreaEClass.getESuperTypes().add(this.getIdentifiedObject());
		conformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());
		loadAreaEClass.getESuperTypes().add(this.getEnergyArea());
		subLoadAreaEClass.getESuperTypes().add(this.getEnergyArea());
		loadResponseCharacteristicEClass.getESuperTypes().add(this.getIdentifiedObject());
		nonConformLoadScheduleEClass.getESuperTypes().add(this.getSeasonDayTypeSchedule());
		inductionMotorLoadEClass.getESuperTypes().add(this.getNonConformLoad());
		conformLoadEClass.getESuperTypes().add(this.getEnergyConsumer());
		equivalentNetworkEClass.getESuperTypes().add(this.getConnectivityNodeContainer());
		equivalentShuntEClass.getESuperTypes().add(this.getEquivalentEquipment());
		equivalentEquipmentEClass.getESuperTypes().add(this.getConductingEquipment());
		equivalentBranchEClass.getESuperTypes().add(this.getEquivalentEquipment());
		identifiedObjectEClass.getESuperTypes().add(this.getElement());
		terminalEClass.getESuperTypes().add(this.getIdentifiedObject());
		baseVoltageEClass.getESuperTypes().add(this.getIdentifiedObject());
		regularIntervalScheduleEClass.getESuperTypes().add(this.getBasicIntervalSchedule());
		connectivityNodeContainerEClass.getESuperTypes().add(this.getPowerSystemResource());
		unitEClass.getESuperTypes().add(this.getIdentifiedObject());
		equipmentContainerEClass.getESuperTypes().add(this.getConnectivityNodeContainer());
		voltageLevelEClass.getESuperTypes().add(this.getEquipmentContainer());
		bayEClass.getESuperTypes().add(this.getEquipmentContainer());
		subGeographicalRegionEClass.getESuperTypes().add(this.getIdentifiedObject());
		regularTimePointEClass.getESuperTypes().add(this.getElement());
		equipmentEClass.getESuperTypes().add(this.getPowerSystemResource());
		substationEClass.getESuperTypes().add(this.getEquipmentContainer());
		curveEClass.getESuperTypes().add(this.getIdentifiedObject());
		powerSystemResourceEClass.getESuperTypes().add(this.getIdentifiedObject());
		basicIntervalScheduleEClass.getESuperTypes().add(this.getIdentifiedObject());
		curveDataEClass.getESuperTypes().add(this.getElement());
		geographicalRegionEClass.getESuperTypes().add(this.getIdentifiedObject());
		conductingEquipmentEClass.getESuperTypes().add(this.getEquipment());
		controlAreaEClass.getESuperTypes().add(this.getPowerSystemResource());
		tieFlowEClass.getESuperTypes().add(this.getElement());
		controlAreaGeneratingUnitEClass.getESuperTypes().add(this.getElement());
		connectivityNodeEClass.getESuperTypes().add(this.getIdentifiedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Model(), this.getCommonPowerSystemModel(), this.getCommonPowerSystemModel_Elements(), "Model", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iec61970CIMVersionEClass, IEC61970CIMVersion.class, "IEC61970CIMVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEC61970CIMVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1, IEC61970CIMVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEC61970CIMVersion_Date(), ecorePackage.getEDate(), "date", null, 1, 1, IEC61970CIMVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonPowerSystemModelEClass, CommonPowerSystemModel.class, "CommonPowerSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonPowerSystemModel_Elements(), this.getElement(), this.getElement_Model(), "Elements", null, 0, -1, CommonPowerSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grossToNetActivePowerCurveEClass, GrossToNetActivePowerCurve.class, "GrossToNetActivePowerCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrossToNetActivePowerCurve_GeneratingUnit(), this.getGeneratingUnit(), this.getGeneratingUnit_GrossToNetActivePowerCurves(), "GeneratingUnit", null, 1, 1, GrossToNetActivePowerCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hydroGeneratingUnitEClass, HydroGeneratingUnit.class, "HydroGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thermalGeneratingUnitEClass, ThermalGeneratingUnit.class, "ThermalGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatingUnitEClass, GeneratingUnit.class, "GeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratingUnit_MaxOperatingP(), this.getActivePower(), "maxOperatingP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_NormalPF(), ecorePackage.getEFloat(), "normalPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedGrossMaxP(), this.getActivePower(), "ratedGrossMaxP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedGrossMinP(), this.getActivePower(), "ratedGrossMinP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_GenControlSource(), this.getGeneratorControlSource(), "genControlSource", null, 0, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedNetMaxP(), this.getActivePower(), "ratedNetMaxP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_LongPF(), ecorePackage.getEFloat(), "longPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_Contains_SynchronousMachines(), this.getSynchronousMachine(), this.getSynchronousMachine_MemberOf_GeneratingUnit(), "Contains_SynchronousMachines", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_GrossToNetActivePowerCurves(), this.getGrossToNetActivePowerCurve(), this.getGrossToNetActivePowerCurve_GeneratingUnit(), "GrossToNetActivePowerCurves", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_InitialP(), this.getActivePower(), "initialP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_ControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit_GeneratingUnit(), "ControlAreaGeneratingUnit", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_ShortPF(), ecorePackage.getEFloat(), "shortPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_MinOperatingP(), this.getActivePower(), "minOperatingP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalLimitEClass, OperationalLimit.class, "OperationalLimit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalLimit_OperationalLimitSet(), this.getOperationalLimitSet(), this.getOperationalLimitSet_OperationalLimitValue(), "OperationalLimitSet", null, 1, 1, OperationalLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationalLimit_Type(), ecorePackage.getEString(), "type", null, 1, 1, OperationalLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalLimitSetEClass, OperationalLimitSet.class, "OperationalLimitSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalLimitSet_Equipment(), this.getEquipment(), this.getEquipment_OperationalLimitSet(), "Equipment", null, 1, 1, OperationalLimitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalLimitSet_OperationalLimitValue(), this.getOperationalLimit(), this.getOperationalLimit_OperationalLimitSet(), "OperationalLimitValue", null, 0, -1, OperationalLimitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activePowerLimitEClass, ActivePowerLimit.class, "ActivePowerLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivePowerLimit_Value(), this.getActivePower(), "value", null, 1, 1, ActivePowerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apparentPowerLimitEClass, ApparentPowerLimit.class, "ApparentPowerLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApparentPowerLimit_Value(), this.getApparentPower(), "value", null, 1, 1, ApparentPowerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageLimitEClass, VoltageLimit.class, "VoltageLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoltageLimit_Value(), this.getVoltage(), "value", null, 1, 1, VoltageLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentLimitEClass, CurrentLimit.class, "CurrentLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentLimit_Value(), this.getCurrentFlow(), "value", null, 1, 1, CurrentLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerTransformerEClass, PowerTransformer.class, "PowerTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerTransformer_Contains_TransformerWindings(), this.getTransformerWinding(), this.getTransformerWinding_MemberOf_PowerTransformer(), "Contains_TransformerWindings", null, 0, -1, PowerTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disconnectorEClass, Disconnector.class, "Disconnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronousMachineEClass, SynchronousMachine.class, "SynchronousMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronousMachine_InitialReactiveCapabilityCurve(), this.getReactiveCapabilityCurve(), this.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), "InitialReactiveCapabilityCurve", null, 0, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_OperatingMode(), this.getSynchronousMachineOperatingMode(), "operatingMode", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronousMachine_MemberOf_GeneratingUnit(), this.getGeneratingUnit(), this.getGeneratingUnit_Contains_SynchronousMachines(), "MemberOf_GeneratingUnit", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_MinQ(), this.getReactivePower(), "minQ", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_Type(), this.getSynchronousMachineType(), "type", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_MaxQ(), this.getReactivePower(), "maxQ", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busbarSectionEClass, BusbarSection.class, "BusbarSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shuntCompensatorEClass, ShuntCompensator.class, "ShuntCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShuntCompensator_MaximumSections(), ecorePackage.getEInt(), "maximumSections", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_NormalSections(), ecorePackage.getEInt(), "normalSections", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_NomU(), this.getVoltage(), "nomU", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_ReactivePerSection(), this.getReactivePower(), "reactivePerSection", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBreakSwitchEClass, LoadBreakSwitch.class, "LoadBreakSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBreakSwitch_RatedCurrent(), this.getCurrentFlow(), "ratedCurrent", null, 1, 1, LoadBreakSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatingCondEqEClass, RegulatingCondEq.class, "RegulatingCondEq", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatingCondEq_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_RegulatingCondEq(), "RegulatingControl", null, 0, 1, RegulatingCondEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energyConsumerEClass, EnergyConsumer.class, "EnergyConsumer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergyConsumer_QfixedPct(), this.getPerCent(), "qfixedPct", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_Pfixed(), this.getActivePower(), "pfixed", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnergyConsumer_LoadResponse(), this.getLoadResponseCharacteristic(), this.getLoadResponseCharacteristic_EnergyConsumer(), "LoadResponse", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_Qfixed(), this.getReactivePower(), "qfixed", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_PfixedPct(), this.getPerCent(), "pfixedPct", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformerWindingEClass, TransformerWinding.class, "TransformerWinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformerWinding_WindingType(), this.getWindingType(), "windingType", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformerWinding_TapChangers(), this.getTapChanger(), this.getTapChanger_TransformerWinding(), "TapChangers", null, 0, -1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformerWinding_MemberOf_PowerTransformer(), this.getPowerTransformer(), this.getPowerTransformer_Contains_TransformerWindings(), "MemberOf_PowerTransformer", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_RatedS(), this.getApparentPower(), "ratedS", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_X(), this.getReactance(), "x", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_RatedU(), this.getVoltage(), "ratedU", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_R(), this.getResistance(), "r", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_B(), this.getSusceptance(), "b", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatingControlEClass, RegulatingControl.class, "RegulatingControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatingControl_Terminal(), this.getTerminal(), this.getTerminal_RegulatingControl(), "Terminal", null, 1, 1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_RegulationSchedule(), this.getRegulationSchedule(), this.getRegulationSchedule_RegulatingControl(), "RegulationSchedule", null, 1, 1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_TapChanger(), this.getTapChanger(), this.getTapChanger_RegulatingControl(), "TapChanger", null, 0, -1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_RegulatingCondEq(), this.getRegulatingCondEq(), this.getRegulatingCondEq_RegulatingControl(), "RegulatingCondEq", null, 0, -1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulationScheduleEClass, RegulationSchedule.class, "RegulationSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulationSchedule_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_RegulationSchedule(), "RegulatingControl", null, 0, -1, RegulationSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acLineSegmentEClass, ACLineSegment.class, "ACLineSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitch_NormalOpen(), ecorePackage.getEBoolean(), "normalOpen", null, 1, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductorEClass, Conductor.class, "Conductor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConductor_R(), this.getResistance(), "r", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_X(), this.getReactance(), "x", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Bch(), this.getSusceptance(), "bch", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactiveCapabilityCurveEClass, ReactiveCapabilityCurve.class, "ReactiveCapabilityCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), this.getSynchronousMachine(), this.getSynchronousMachine_InitialReactiveCapabilityCurve(), "InitiallyUsedBySynchronousMachine", null, 0, -1, ReactiveCapabilityCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tapChangerEClass, TapChanger.class, "TapChanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTapChanger_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_TapChanger(), "RegulatingControl", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTapChanger_TransformerWinding(), this.getTransformerWinding(), this.getTransformerWinding_TapChangers(), "TransformerWinding", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NormalStep(), ecorePackage.getEInt(), "normalStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_HighStep(), ecorePackage.getEInt(), "highStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_StepPhaseShiftIncrement(), this.getAngleDegrees(), "stepPhaseShiftIncrement", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NeutralStep(), ecorePackage.getEInt(), "neutralStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_LowStep(), ecorePackage.getEInt(), "lowStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_TculControlMode(), this.getTransformerControlMode(), "tculControlMode", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_StepVoltageIncrement(), this.getPerCent(), "stepVoltageIncrement", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_Type(), this.getTapChangerKind(), "type", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NeutralU(), this.getVoltage(), "neutralU", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Region(), this.getSubGeographicalRegion(), this.getSubGeographicalRegion_Lines(), "Region", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticVarCompensatorEClass, StaticVarCompensator.class, "StaticVarCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticVarCompensator_VoltageSetPoint(), this.getVoltage(), "voltageSetPoint", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_SVCControlMode(), this.getSVCControlMode(), "sVCControlMode", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_CapacitiveRating(), this.getReactance(), "capacitiveRating", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_Slope(), this.getVoltagePerReactivePower(), "slope", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_InductiveRating(), this.getReactance(), "inductiveRating", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seriesCompensatorEClass, SeriesCompensator.class, "SeriesCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeriesCompensator_R(), this.getResistance(), "r", null, 1, 1, SeriesCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesCompensator_X(), this.getReactance(), "x", null, 1, 1, SeriesCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakerEClass, Breaker.class, "Breaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreaker_RatedCurrent(), this.getCurrentFlow(), "ratedCurrent", null, 1, 1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteValueEClass, DiscreteValue.class, "DiscreteValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteValue_MemberOf_Measurement(), this.getDiscrete(), this.getDiscrete_Contain_MeasurementValues(), "MemberOf_Measurement", null, 1, 1, DiscreteValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_MemberOf_PSR(), this.getPowerSystemResource(), this.getPowerSystemResource_Contains_Measurements(), "MemberOf_PSR", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MeasurementType(), this.getMeasurementType(), this.getMeasurementType_Measurements(), "MeasurementType", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Terminal(), this.getTerminal(), this.getTerminal_Measurements(), "Terminal", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Unit(), this.getUnit(), this.getUnit_Measurements(), "Unit", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementValueEClass, MeasurementValue.class, "MeasurementValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementValue_MeasurementValueSource(), this.getMeasurementValueSource(), this.getMeasurementValueSource_MeasurementValues(), "MeasurementValueSource", null, 1, 1, MeasurementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementValueSourceEClass, MeasurementValueSource.class, "MeasurementValueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementValueSource_MeasurementValues(), this.getMeasurementValue(), this.getMeasurementValue_MeasurementValueSource(), "MeasurementValues", null, 0, -1, MeasurementValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogEClass, Analog.class, "Analog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalog_PositiveFlowIn(), ecorePackage.getEBoolean(), "positiveFlowIn", null, 1, 1, Analog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalog_Contain_MeasurementValues(), this.getAnalogValue(), this.getAnalogValue_MemberOf_Measurement(), "Contain_MeasurementValues", null, 0, -1, Analog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogValueEClass, AnalogValue.class, "AnalogValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogValue_MemberOf_Measurement(), this.getAnalog(), this.getAnalog_Contain_MeasurementValues(), "MemberOf_Measurement", null, 1, 1, AnalogValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementTypeEClass, MeasurementType.class, "MeasurementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementType_Measurements(), this.getMeasurement(), this.getMeasurement_MeasurementType(), "Measurements", null, 0, -1, MeasurementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteEClass, Discrete.class, "Discrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscrete_Contain_MeasurementValues(), this.getDiscreteValue(), this.getDiscreteValue_MemberOf_Measurement(), "Contain_MeasurementValues", null, 0, -1, Discrete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitSetEClass, LimitSet.class, "LimitSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimitSet_IsPercentageLimits(), ecorePackage.getEBoolean(), "isPercentageLimits", null, 1, 1, LimitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConformLoadGroupEClass, NonConformLoadGroup.class, "NonConformLoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonConformLoadGroup_NonConformLoadSchedules(), this.getNonConformLoadSchedule(), this.getNonConformLoadSchedule_NonConformLoadGroup(), "NonConformLoadSchedules", null, 0, -1, NonConformLoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonConformLoadGroup_EnergyConsumers(), this.getNonConformLoad(), this.getNonConformLoad_LoadGroup(), "EnergyConsumers", null, 0, -1, NonConformLoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformLoadScheduleEClass, ConformLoadSchedule.class, "ConformLoadSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformLoadSchedule_ConformLoadGroup(), this.getConformLoadGroup(), this.getConformLoadGroup_ConformLoadSchedules(), "ConformLoadGroup", null, 1, 1, ConformLoadSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerLoadEClass, CustomerLoad.class, "CustomerLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonConformLoadEClass, NonConformLoad.class, "NonConformLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonConformLoad_LoadGroup(), this.getNonConformLoadGroup(), this.getNonConformLoadGroup_EnergyConsumers(), "LoadGroup", null, 1, 1, NonConformLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayTypeEClass, DayType.class, "DayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDayType_SeasonDayTypeSchedules(), this.getSeasonDayTypeSchedule(), this.getSeasonDayTypeSchedule_DayType(), "SeasonDayTypeSchedules", null, 0, -1, DayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonEClass, Season.class, "Season", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeason_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_SeasonDayTypeSchedules(), this.getSeasonDayTypeSchedule(), this.getSeasonDayTypeSchedule_Season(), "SeasonDayTypeSchedules", null, 0, -1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_Name(), this.getSeasonName(), "name", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationSupplyEClass, StationSupply.class, "StationSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seasonDayTypeScheduleEClass, SeasonDayTypeSchedule.class, "SeasonDayTypeSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeasonDayTypeSchedule_DayType(), this.getDayType(), this.getDayType_SeasonDayTypeSchedules(), "DayType", null, 1, 1, SeasonDayTypeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeasonDayTypeSchedule_Season(), this.getSeason(), this.getSeason_SeasonDayTypeSchedules(), "Season", null, 1, 1, SeasonDayTypeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadGroupEClass, LoadGroup.class, "LoadGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadGroup_SubLoadArea(), this.getSubLoadArea(), this.getSubLoadArea_LoadGroups(), "SubLoadArea", null, 1, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energyAreaEClass, EnergyArea.class, "EnergyArea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnergyArea_ControlArea(), this.getControlArea(), this.getControlArea_EnergyArea(), "ControlArea", null, 0, 1, EnergyArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformLoadGroupEClass, ConformLoadGroup.class, "ConformLoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformLoadGroup_EnergyConsumers(), this.getConformLoad(), this.getConformLoad_LoadGroup(), "EnergyConsumers", null, 0, -1, ConformLoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConformLoadGroup_ConformLoadSchedules(), this.getConformLoadSchedule(), this.getConformLoadSchedule_ConformLoadGroup(), "ConformLoadSchedules", null, 0, -1, ConformLoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadAreaEClass, LoadArea.class, "LoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadArea_SubLoadAreas(), this.getSubLoadArea(), this.getSubLoadArea_LoadArea(), "SubLoadAreas", null, 0, -1, LoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subLoadAreaEClass, SubLoadArea.class, "SubLoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubLoadArea_LoadGroups(), this.getLoadGroup(), this.getLoadGroup_SubLoadArea(), "LoadGroups", null, 0, -1, SubLoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubLoadArea_LoadArea(), this.getLoadArea(), this.getLoadArea_SubLoadAreas(), "LoadArea", null, 1, 1, SubLoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadResponseCharacteristicEClass, LoadResponseCharacteristic.class, "LoadResponseCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadResponseCharacteristic_PFrequencyExponent(), ecorePackage.getEFloat(), "pFrequencyExponent", null, 1, 1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadResponseCharacteristic_QVoltageExponent(), ecorePackage.getEFloat(), "qVoltageExponent", null, 1, 1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadResponseCharacteristic_QFrequencyExponent(), ecorePackage.getEFloat(), "qFrequencyExponent", null, 1, 1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadResponseCharacteristic_PVoltageExponent(), ecorePackage.getEFloat(), "pVoltageExponent", null, 1, 1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadResponseCharacteristic_EnergyConsumer(), this.getEnergyConsumer(), this.getEnergyConsumer_LoadResponse(), "EnergyConsumer", null, 0, -1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConformLoadScheduleEClass, NonConformLoadSchedule.class, "NonConformLoadSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonConformLoadSchedule_NonConformLoadGroup(), this.getNonConformLoadGroup(), this.getNonConformLoadGroup_NonConformLoadSchedules(), "NonConformLoadGroup", null, 1, 1, NonConformLoadSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductionMotorLoadEClass, InductionMotorLoad.class, "InductionMotorLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conformLoadEClass, ConformLoad.class, "ConformLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformLoad_LoadGroup(), this.getConformLoadGroup(), this.getConformLoadGroup_EnergyConsumers(), "LoadGroup", null, 1, 1, ConformLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentNetworkEClass, EquivalentNetwork.class, "EquivalentNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentNetwork_EquivalentEquipments(), this.getEquivalentEquipment(), this.getEquivalentEquipment_EquivalentNetwork(), "EquivalentEquipments", null, 0, -1, EquivalentNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentShuntEClass, EquivalentShunt.class, "EquivalentShunt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquivalentShunt_B(), this.getSusceptance(), "b", null, 1, 1, EquivalentShunt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquivalentShunt_G(), this.getConductance(), "g", null, 1, 1, EquivalentShunt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentEquipmentEClass, EquivalentEquipment.class, "EquivalentEquipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentEquipment_EquivalentNetwork(), this.getEquivalentNetwork(), this.getEquivalentNetwork_EquivalentEquipments(), "EquivalentNetwork", null, 1, 1, EquivalentEquipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentBranchEClass, EquivalentBranch.class, "EquivalentBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquivalentBranch_X(), this.getReactance(), "x", null, 1, 1, EquivalentBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquivalentBranch_R(), this.getResistance(), "r", null, 1, 1, EquivalentBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedObjectEClass, IdentifiedObject.class, "IdentifiedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedObject_PathName(), ecorePackage.getEString(), "pathName", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_Description(), ecorePackage.getEString(), "description", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_AliasName(), ecorePackage.getEString(), "aliasName", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminal_Measurements(), this.getMeasurement(), this.getMeasurement_Terminal(), "Measurements", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_Terminal(), "RegulatingControl", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_ConnectivityNode(), this.getConnectivityNode(), this.getConnectivityNode_Terminals(), "ConnectivityNode", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_ConductingEquipment(), this.getConductingEquipment(), this.getConductingEquipment_Terminals(), "ConductingEquipment", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseVoltageEClass, BaseVoltage.class, "BaseVoltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseVoltage_NominalVoltage(), this.getVoltage(), "nominalVoltage", null, 1, 1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseVoltage_ConductingEquipment(), this.getConductingEquipment(), this.getConductingEquipment_BaseVoltage(), "ConductingEquipment", null, 0, -1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseVoltage_VoltageLevel(), this.getVoltageLevel(), this.getVoltageLevel_BaseVoltage(), "VoltageLevel", null, 0, -1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularIntervalScheduleEClass, RegularIntervalSchedule.class, "RegularIntervalSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularIntervalSchedule_EndTime(), ecorePackage.getEDate(), "endTime", null, 1, 1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularIntervalSchedule_TimePoints(), this.getRegularTimePoint(), this.getRegularTimePoint_IntervalSchedule(), "TimePoints", null, 0, -1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularIntervalSchedule_TimeStep(), this.getSeconds(), "timeStep", null, 1, 1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectivityNodeContainerEClass, ConnectivityNodeContainer.class, "ConnectivityNodeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectivityNodeContainer_ConnectivityNodes(), this.getConnectivityNode(), this.getConnectivityNode_MemberOf_EquipmentContainer(), "ConnectivityNodes", null, 0, -1, ConnectivityNodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Measurements(), this.getMeasurement(), this.getMeasurement_Unit(), "Measurements", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentContainerEClass, EquipmentContainer.class, "EquipmentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipmentContainer_Contains_Equipments(), this.getEquipment(), this.getEquipment_MemberOf_EquipmentContainer(), "Contains_Equipments", null, 0, -1, EquipmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageLevelEClass, VoltageLevel.class, "VoltageLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoltageLevel_MemberOf_Substation(), this.getSubstation(), this.getSubstation_Contains_VoltageLevels(), "MemberOf_Substation", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltageLevel_LowVoltageLimit(), this.getVoltage(), "lowVoltageLimit", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltageLevel_HighVoltageLimit(), this.getVoltage(), "highVoltageLimit", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoltageLevel_BaseVoltage(), this.getBaseVoltage(), this.getBaseVoltage_VoltageLevel(), "BaseVoltage", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoltageLevel_Contains_Bays(), this.getBay(), this.getBay_MemberOf_VoltageLevel(), "Contains_Bays", null, 0, -1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bayEClass, Bay.class, "Bay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBay_MemberOf_VoltageLevel(), this.getVoltageLevel(), this.getVoltageLevel_Contains_Bays(), "MemberOf_VoltageLevel", null, 1, 1, Bay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subGeographicalRegionEClass, SubGeographicalRegion.class, "SubGeographicalRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubGeographicalRegion_Region(), this.getGeographicalRegion(), this.getGeographicalRegion_Regions(), "Region", null, 1, 1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubGeographicalRegion_Lines(), this.getLine(), this.getLine_Region(), "Lines", null, 0, -1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubGeographicalRegion_Substations(), this.getSubstation(), this.getSubstation_Region(), "Substations", null, 0, -1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularTimePointEClass, RegularTimePoint.class, "RegularTimePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularTimePoint_Value1(), ecorePackage.getEFloat(), "value1", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularTimePoint_SequenceNumber(), ecorePackage.getEInt(), "sequenceNumber", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularTimePoint_Value2(), ecorePackage.getEFloat(), "value2", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTimePoint_IntervalSchedule(), this.getRegularIntervalSchedule(), this.getRegularIntervalSchedule_TimePoints(), "IntervalSchedule", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipment_MemberOf_EquipmentContainer(), this.getEquipmentContainer(), this.getEquipmentContainer_Contains_Equipments(), "MemberOf_EquipmentContainer", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipment_OperationalLimitSet(), this.getOperationalLimitSet(), this.getOperationalLimitSet_Equipment(), "OperationalLimitSet", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substationEClass, Substation.class, "Substation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstation_Region(), this.getSubGeographicalRegion(), this.getSubGeographicalRegion_Substations(), "Region", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstation_Contains_VoltageLevels(), this.getVoltageLevel(), this.getVoltageLevel_MemberOf_Substation(), "Contains_VoltageLevels", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveEClass, Curve.class, "Curve", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurve_Y2Unit(), this.getUnitSymbol(), "y2Unit", null, 0, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_XUnit(), this.getUnitSymbol(), "xUnit", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurve_CurveScheduleDatas(), this.getCurveData(), this.getCurveData_CurveSchedule(), "CurveScheduleDatas", null, 0, -1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_CurveStyle(), this.getCurveStyle(), "curveStyle", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_Y1Unit(), this.getUnitSymbol(), "y1Unit", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSystemResourceEClass, PowerSystemResource.class, "PowerSystemResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSystemResource_Contains_Measurements(), this.getMeasurement(), this.getMeasurement_MemberOf_PSR(), "Contains_Measurements", null, 0, -1, PowerSystemResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicIntervalScheduleEClass, BasicIntervalSchedule.class, "BasicIntervalSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicIntervalSchedule_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicIntervalSchedule_Value1Unit(), this.getUnitSymbol(), "value1Unit", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicIntervalSchedule_Value2Unit(), this.getUnitSymbol(), "value2Unit", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveDataEClass, CurveData.class, "CurveData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurveData_Y2value(), ecorePackage.getEFloat(), "y2value", null, 1, 1, CurveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurveData_Xvalue(), ecorePackage.getEFloat(), "xvalue", null, 1, 1, CurveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurveData_Y1value(), ecorePackage.getEFloat(), "y1value", null, 1, 1, CurveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurveData_CurveSchedule(), this.getCurve(), this.getCurve_CurveScheduleDatas(), "CurveSchedule", null, 1, 1, CurveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographicalRegionEClass, GeographicalRegion.class, "GeographicalRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeographicalRegion_Regions(), this.getSubGeographicalRegion(), this.getSubGeographicalRegion_Region(), "Regions", null, 0, -1, GeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductingEquipmentEClass, ConductingEquipment.class, "ConductingEquipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConductingEquipment_BaseVoltage(), this.getBaseVoltage(), this.getBaseVoltage_ConductingEquipment(), "BaseVoltage", null, 1, 1, ConductingEquipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductingEquipment_Terminals(), this.getTerminal(), this.getTerminal_ConductingEquipment(), "Terminals", null, 0, -1, ConductingEquipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlAreaEClass, ControlArea.class, "ControlArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlArea_ControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit_ControlArea(), "ControlAreaGeneratingUnit", null, 0, -1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlArea_NetInterchange(), this.getActivePower(), "netInterchange", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlArea_EnergyArea(), this.getEnergyArea(), this.getEnergyArea_ControlArea(), "EnergyArea", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlArea_TieFlow(), this.getTieFlow(), this.getTieFlow_ControlArea(), "TieFlow", null, 0, -1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlArea_Type(), this.getControlAreaTypeKind(), "type", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tieFlowEClass, TieFlow.class, "TieFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTieFlow_ControlArea(), this.getControlArea(), this.getControlArea_TieFlow(), "ControlArea", null, 1, 1, TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTieFlow_PositiveFlowIn(), ecorePackage.getEBoolean(), "positiveFlowIn", null, 1, 1, TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlAreaGeneratingUnitEClass, ControlAreaGeneratingUnit.class, "ControlAreaGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlAreaGeneratingUnit_ControlArea(), this.getControlArea(), this.getControlArea_ControlAreaGeneratingUnit(), "ControlArea", null, 1, 1, ControlAreaGeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAreaGeneratingUnit_GeneratingUnit(), this.getGeneratingUnit(), this.getGeneratingUnit_ControlAreaGeneratingUnit(), "GeneratingUnit", null, 1, 1, ControlAreaGeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectivityNodeEClass, ConnectivityNode.class, "ConnectivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectivityNode_Terminals(), this.getTerminal(), this.getTerminal_ConnectivityNode(), "Terminals", null, 0, -1, ConnectivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectivityNode_MemberOf_EquipmentContainer(), this.getConnectivityNodeContainer(), this.getConnectivityNodeContainer_ConnectivityNodes(), "MemberOf_EquipmentContainer", null, 1, 1, ConnectivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(generatorControlSourceEEnum, GeneratorControlSource.class, "GeneratorControlSource");
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.OFF_AGC);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.UNAVAILABLE);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.ON_AGC);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.PLANT_CONTROL);

		initEEnum(synchronousMachineOperatingModeEEnum, SynchronousMachineOperatingMode.class, "SynchronousMachineOperatingMode");
		addEEnumLiteral(synchronousMachineOperatingModeEEnum, SynchronousMachineOperatingMode.GENERATOR);
		addEEnumLiteral(synchronousMachineOperatingModeEEnum, SynchronousMachineOperatingMode.CONDENSER);

		initEEnum(tapChangerKindEEnum, TapChangerKind.class, "TapChangerKind");
		addEEnumLiteral(tapChangerKindEEnum, TapChangerKind.VOLTAGE_AND_PHASE_CONTROL);
		addEEnumLiteral(tapChangerKindEEnum, TapChangerKind.PHASE_CONTROL);
		addEEnumLiteral(tapChangerKindEEnum, TapChangerKind.FIXED);
		addEEnumLiteral(tapChangerKindEEnum, TapChangerKind.VOLTAGE_CONTROL);

		initEEnum(svcControlModeEEnum, SVCControlMode.class, "SVCControlMode");
		addEEnumLiteral(svcControlModeEEnum, SVCControlMode.VOLTAGE);
		addEEnumLiteral(svcControlModeEEnum, SVCControlMode.OFF);
		addEEnumLiteral(svcControlModeEEnum, SVCControlMode.REACTIVE_POWER);

		initEEnum(windingTypeEEnum, WindingType.class, "WindingType");
		addEEnumLiteral(windingTypeEEnum, WindingType.PRIMARY);
		addEEnumLiteral(windingTypeEEnum, WindingType.TERTIARY);
		addEEnumLiteral(windingTypeEEnum, WindingType.SECONDARY);
		addEEnumLiteral(windingTypeEEnum, WindingType.QUATERNARY);

		initEEnum(synchronousMachineTypeEEnum, SynchronousMachineType.class, "SynchronousMachineType");
		addEEnumLiteral(synchronousMachineTypeEEnum, SynchronousMachineType.GENERATOR);
		addEEnumLiteral(synchronousMachineTypeEEnum, SynchronousMachineType.GENERATOR_OR_CONDENSER);
		addEEnumLiteral(synchronousMachineTypeEEnum, SynchronousMachineType.CONDENSER);

		initEEnum(transformerControlModeEEnum, TransformerControlMode.class, "TransformerControlMode");
		addEEnumLiteral(transformerControlModeEEnum, TransformerControlMode.LOCAL);
		addEEnumLiteral(transformerControlModeEEnum, TransformerControlMode.ACTIVE);
		addEEnumLiteral(transformerControlModeEEnum, TransformerControlMode.VOLT);
		addEEnumLiteral(transformerControlModeEEnum, TransformerControlMode.OFF);
		addEEnumLiteral(transformerControlModeEEnum, TransformerControlMode.REACTIVE);

		initEEnum(seasonNameEEnum, SeasonName.class, "SeasonName");
		addEEnumLiteral(seasonNameEEnum, SeasonName.FALL);
		addEEnumLiteral(seasonNameEEnum, SeasonName.WINTER);
		addEEnumLiteral(seasonNameEEnum, SeasonName.SPRING);
		addEEnumLiteral(seasonNameEEnum, SeasonName.SUMMER);

		initEEnum(curveStyleEEnum, CurveStyle.class, "CurveStyle");
		addEEnumLiteral(curveStyleEEnum, CurveStyle.RAMP_YVALUE);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.FORMULA);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.CONSTANT_YVALUE);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.STRAIGHT_LINE_YVALUES);

		initEEnum(controlAreaTypeKindEEnum, ControlAreaTypeKind.class, "ControlAreaTypeKind");
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.FORECAST);
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.INTERCHANGE);
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.AGC);

		initEEnum(unitSymbolEEnum, UnitSymbol.class, "UnitSymbol");
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.WS);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.NONE);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.SEC);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.HOUR);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.JS);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.VA);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.WH);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.OHM);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.M3);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.PER_HZ);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.W);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.MIN);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.RAD);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.G);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.J);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.H);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.F);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.KG_J);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.VAH);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.PER_S);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.DEG_C);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.DEG);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.PA);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.VAR);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.S);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.WHZ);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.M);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.M2);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.HZ);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.A);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.N);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.VVAR);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.VARH);
		addEEnumLiteral(unitSymbolEEnum, UnitSymbol.V);

		// Initialize data types
		initEDataType(currentFlowEDataType, double.class, "CurrentFlow", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(activePowerEDataType, double.class, "ActivePower", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(secondsEDataType, double.class, "Seconds", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(susceptanceEDataType, double.class, "Susceptance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(conductanceEDataType, double.class, "Conductance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resistanceEDataType, double.class, "Resistance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perCentEDataType, double.class, "PerCent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reactivePowerEDataType, double.class, "ReactivePower", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angleDegreesEDataType, double.class, "AngleDegrees", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voltageEDataType, double.class, "Voltage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(apparentPowerEDataType, double.class, "ApparentPower", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reactanceEDataType, double.class, "Reactance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voltagePerReactivePowerEDataType, double.class, "VoltagePerReactivePower", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://iec.ch/TC57/2008/CIM-schema-cim13#
		createCIMschemacim13Annotations();
		// http://langdale.com.au/2005/UML
		createUMLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://iec.ch/TC57/2008/CIM-schema-cim13#</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCIMschemacim13Annotations() {
		String source = "http://iec.ch/TC57/2008/CIM-schema-cim13#";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Documentation", "An extension to the Core and Wires packages that models information on the current and planned network configuration. These entities are optional within typical network applications."
		   });			
		addAnnotation
		  (iec61970CIMVersionEClass, 
		   source, 
		   new String[] {
			 "Documentation", "This is the IEC 61970 CIM version number assigned to this UML model file."
		   });			
		addAnnotation
		  (grossToNetActivePowerCurveEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Relationship between the generating unit\'s gross active power output on the X-axis (measured at the terminals of the machine(s)) and the generating unit\'s net active power output on the Y-axis (based on utility-defined measurements at the power station). Station service loads, when modeled, should be treated as non-conforming bus loads. There may be more than one curve, depending on the auxiliary equipment that is in service."
		   });			
		addAnnotation
		  (getGrossToNetActivePowerCurve_GeneratingUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit"
		   });			
		addAnnotation
		  (hydroGeneratingUnitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan)"
		   });			
		addAnnotation
		  (thermalGeneratingUnitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine."
		   });			
		addAnnotation
		  (generatingUnitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set."
		   });			
		addAnnotation
		  (getGeneratingUnit_MaxOperatingP(), 
		   source, 
		   new String[] {
			 "Documentation", "This is the maximum operating active power limit the dispatcher can enter for this unit"
		   });			
		addAnnotation
		  (getGeneratingUnit_NormalPF(), 
		   source, 
		   new String[] {
			 "Documentation", "Generating unit economic participation factor"
		   });			
		addAnnotation
		  (getGeneratingUnit_RatedGrossMaxP(), 
		   source, 
		   new String[] {
			 "Documentation", "The unit\'s gross rated maximum capacity (Book Value)."
		   });			
		addAnnotation
		  (getGeneratingUnit_RatedGrossMinP(), 
		   source, 
		   new String[] {
			 "Documentation", "The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid"
		   });			
		addAnnotation
		  (getGeneratingUnit_GenControlSource(), 
		   source, 
		   new String[] {
			 "Documentation", "The source of controls for a generating unit."
		   });			
		addAnnotation
		  (getGeneratingUnit_RatedNetMaxP(), 
		   source, 
		   new String[] {
			 "Documentation", "The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity"
		   });			
		addAnnotation
		  (getGeneratingUnit_LongPF(), 
		   source, 
		   new String[] {
			 "Documentation", "Generating unit economic participation factor"
		   });			
		addAnnotation
		  (getGeneratingUnit_Contains_SynchronousMachines(), 
		   source, 
		   new String[] {
			 "Documentation", "A synchronous machine may operate as a generator and as such becomes a member of a generating unit"
		   });				
		addAnnotation
		  (getGeneratingUnit_GrossToNetActivePowerCurves(), 
		   source, 
		   new String[] {
			 "Documentation", "A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit"
		   });				
		addAnnotation
		  (getGeneratingUnit_InitialP(), 
		   source, 
		   new String[] {
			 "Documentation", "Default Initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration"
		   });			
		addAnnotation
		  (getGeneratingUnit_ControlAreaGeneratingUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "ControlArea specifications for this generating unit."
		   });				
		addAnnotation
		  (getGeneratingUnit_ShortPF(), 
		   source, 
		   new String[] {
			 "Documentation", "Generating unit economic participation factor"
		   });			
		addAnnotation
		  (getGeneratingUnit_MinOperatingP(), 
		   source, 
		   new String[] {
			 "Documentation", "This is the minimum operating active power limit the dispatcher can enter for this unit."
		   });			
		addAnnotation
		  (operationalLimitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A value associated with a specific kind of limit."
		   });			
		addAnnotation
		  (getOperationalLimit_OperationalLimitSet(), 
		   source, 
		   new String[] {
			 "Documentation", "The limit set to which the limit values belong."
		   });			
		addAnnotation
		  (getOperationalLimit_Type(), 
		   source, 
		   new String[] {
			 "Documentation", "Used to specify high/low and limit levels."
		   });			
		addAnnotation
		  (operationalLimitSetEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A set of limits associated with equipmnet."
		   });			
		addAnnotation
		  (getOperationalLimitSet_Equipment(), 
		   source, 
		   new String[] {
			 "Documentation", "The equpment to which the limit set applies."
		   });			
		addAnnotation
		  (getOperationalLimitSet_OperationalLimitValue(), 
		   source, 
		   new String[] {
			 "Documentation", "Values of equipment limits."
		   });				
		addAnnotation
		  (activePowerLimitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Limit on active power flow."
		   });			
		addAnnotation
		  (getActivePowerLimit_Value(), 
		   source, 
		   new String[] {
			 "Documentation", "Value of active power limit."
		   });			
		addAnnotation
		  (apparentPowerLimitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Apparent power limit."
		   });			
		addAnnotation
		  (getApparentPowerLimit_Value(), 
		   source, 
		   new String[] {
			 "Documentation", "The apparent power limit."
		   });			
		addAnnotation
		  (voltageLimitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Operational limit applied to voltage."
		   });			
		addAnnotation
		  (getVoltageLimit_Value(), 
		   source, 
		   new String[] {
			 "Documentation", "Limit on voltage. High or low limit depends on the OperatoinalLimit.limitKind"
		   });			
		addAnnotation
		  (currentLimitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "OIoeratuibak kimit on current."
		   });			
		addAnnotation
		  (getCurrentLimit_Value(), 
		   source, 
		   new String[] {
			 "Documentation", "Limit on current flow."
		   });			
		addAnnotation
		  (powerTransformerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow)."
		   });			
		addAnnotation
		  (getPowerTransformer_Contains_TransformerWindings(), 
		   source, 
		   new String[] {
			 "Documentation", "A transformer has windings"
		   });				
		addAnnotation
		  (disconnectorEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A manually operated or motor operated mechanical switching device used for changing the connections in a circuit, or for isolating a circuit or equipment from a source of power. It is required to open or close circuits when negligible current is broken or made."
		   });			
		addAnnotation
		  (synchronousMachineEClass, 
		   source, 
		   new String[] {
			 "Documentation", "An electromechanical device that operates synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump."
		   });			
		addAnnotation
		  (getSynchronousMachine_InitialReactiveCapabilityCurve(), 
		   source, 
		   new String[] {
			 "Documentation", "The default ReactiveCapabilityCurve for use by a SynchronousMachine"
		   });			
		addAnnotation
		  (getSynchronousMachine_OperatingMode(), 
		   source, 
		   new String[] {
			 "Documentation", "Current mode of operation."
		   });			
		addAnnotation
		  (getSynchronousMachine_MemberOf_GeneratingUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "A synchronous machine may operate as a generator and as such becomes a member of a generating unit"
		   });			
		addAnnotation
		  (getSynchronousMachine_MinQ(), 
		   source, 
		   new String[] {
			 "Documentation", "Minimum reactive power limit for the unit."
		   });			
		addAnnotation
		  (getSynchronousMachine_Type(), 
		   source, 
		   new String[] {
			 "Documentation", "Modes that this synchronous machine can operate in."
		   });			
		addAnnotation
		  (getSynchronousMachine_MaxQ(), 
		   source, 
		   new String[] {
			 "Documentation", "Maximum reactive power limit. This is the maximum (nameplate) limit for the unit."
		   });			
		addAnnotation
		  (busbarSectionEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. \nVoltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal."
		   });			
		addAnnotation
		  (shuntCompensatorEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  Negative values for mVArPerSection and nominalMVAr indicate that the compensator is a reactor."
		   });			
		addAnnotation
		  (getShuntCompensator_MaximumSections(), 
		   source, 
		   new String[] {
			 "Documentation", "For a capacitor bank, the maximum number of sections that may be switched in."
		   });			
		addAnnotation
		  (getShuntCompensator_NormalSections(), 
		   source, 
		   new String[] {
			 "Documentation", "For a capacitor bank, the normal number of sections switched in. This number should correspond to the nominal reactive power (nomQ)."
		   });			
		addAnnotation
		  (getShuntCompensator_NomU(), 
		   source, 
		   new String[] {
			 "Documentation", "The nominal voltage at which the nominal reactive power was measured. This should normally be within 10% of the voltage at which the capacitor is connected to the network."
		   });			
		addAnnotation
		  (getShuntCompensator_ReactivePerSection(), 
		   source, 
		   new String[] {
			 "Documentation", "For a capacitor bank, the size in reactive power of each switchable section at the nominal voltage."
		   });			
		addAnnotation
		  (loadBreakSwitchEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions."
		   });			
		addAnnotation
		  (getLoadBreakSwitch_RatedCurrent(), 
		   source, 
		   new String[] {
			 "Documentation", "Current carrying capacity of a wire or cable under stated thermal conditions."
		   });			
		addAnnotation
		  (regulatingCondEqEClass, 
		   source, 
		   new String[] {
			 "Documentation", "RegulatingCondEq is a type of ConductingEquipment that can regulate Measurements and have a RegulationSchedule."
		   });			
		addAnnotation
		  (getRegulatingCondEq_RegulatingControl(), 
		   source, 
		   new String[] {
			 "Documentation", "copy from ..."
		   });			
		addAnnotation
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Generic user of energy - a  point of consumption on the power system model"
		   });			
		addAnnotation
		  (getEnergyConsumer_QfixedPct(), 
		   source, 
		   new String[] {
			 "Documentation", "Fixed reactive power as per cent of load group fixed reactive power."
		   });			
		addAnnotation
		  (getEnergyConsumer_Pfixed(), 
		   source, 
		   new String[] {
			 "Documentation", "Active power of the load that is a fixed quantity."
		   });			
		addAnnotation
		  (getEnergyConsumer_LoadResponse(), 
		   source, 
		   new String[] {
			 "Documentation", "The load response characteristic of this load."
		   });			
		addAnnotation
		  (getEnergyConsumer_Qfixed(), 
		   source, 
		   new String[] {
			 "Documentation", "Reactive power of the load that is a fixed quantity."
		   });			
		addAnnotation
		  (getEnergyConsumer_PfixedPct(), 
		   source, 
		   new String[] {
			 "Documentation", "Fixed active power as per cent of load group fixed active power"
		   });			
		addAnnotation
		  (transformerWindingEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A winding is associated with each defined terminal of a transformer (or phase shifter)."
		   });			
		addAnnotation
		  (getTransformerWinding_WindingType(), 
		   source, 
		   new String[] {
			 "Documentation", "The type of winding."
		   });			
		addAnnotation
		  (getTransformerWinding_TapChangers(), 
		   source, 
		   new String[] {
			 "Documentation", "A transformer winding may have tap changers, separately for voltage and phase angle.  If a TransformerWinding does not have an associated TapChanger, the winding is assumed to be fixed tap."
		   });				
		addAnnotation
		  (getTransformerWinding_MemberOf_PowerTransformer(), 
		   source, 
		   new String[] {
			 "Documentation", "A transformer has windings"
		   });			
		addAnnotation
		  (getTransformerWinding_RatedS(), 
		   source, 
		   new String[] {
			 "Documentation", "The normal apparent power rating for the winding"
		   });			
		addAnnotation
		  (getTransformerWinding_X(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series reactance of the winding."
		   });			
		addAnnotation
		  (getTransformerWinding_RatedU(), 
		   source, 
		   new String[] {
			 "Documentation", "The rated voltage (phase-to-phase) of the winding, usually the same as the neutral voltage."
		   });			
		addAnnotation
		  (getTransformerWinding_R(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series resistance of the winding."
		   });			
		addAnnotation
		  (getTransformerWinding_B(), 
		   source, 
		   new String[] {
			 "Documentation", "Magnetizing branch susceptance (B mag)."
		   });			
		addAnnotation
		  (regulatingControlEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Specifies a set of equipment that works together to control a power system quantity such as voltage or flow."
		   });			
		addAnnotation
		  (getRegulatingControl_Terminal(), 
		   source, 
		   new String[] {
			 "Documentation", "The terminal associated with this regulating control."
		   });			
		addAnnotation
		  (getRegulatingControl_RegulationSchedule(), 
		   source, 
		   new String[] {
			 "Documentation", "Schedule for this Regulating regulating control."
		   });			
		addAnnotation
		  (getRegulatingControl_TapChanger(), 
		   source, 
		   new String[] {
			 "Documentation", "copy from reg conduting eq"
		   });				
		addAnnotation
		  (getRegulatingControl_RegulatingCondEq(), 
		   source, 
		   new String[] {
			 "Documentation", "copy from reg cond eq"
		   });				
		addAnnotation
		  (regulationScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A pre-established pattern over time for a controlled variable, e.g., busbar voltage."
		   });			
		addAnnotation
		  (getRegulationSchedule_RegulatingControl(), 
		   source, 
		   new String[] {
			 "Documentation", "Regulating controls that have this Schedule."
		   });				
		addAnnotation
		  (acLineSegmentEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system."
		   });			
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A generic device designed to close, or open, or both, one or more electric circuits."
		   });			
		addAnnotation
		  (getSwitch_NormalOpen(), 
		   source, 
		   new String[] {
			 "Documentation", "The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurment the Discrete.normalValue is expected to match with the Switch.normalOpen."
		   });			
		addAnnotation
		  (conductorEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system."
		   });			
		addAnnotation
		  (getConductor_R(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series resistance of the entire line section."
		   });			
		addAnnotation
		  (getConductor_X(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series reactance of the entire line section."
		   });			
		addAnnotation
		  (getConductor_Bch(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section."
		   });			
		addAnnotation
		  (reactiveCapabilityCurveEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum."
		   });			
		addAnnotation
		  (getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), 
		   source, 
		   new String[] {
			 "Documentation", "Synchronous machines using this curve as default."
		   });				
		addAnnotation
		  (tapChangerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Mechanism for changing transformer winding tap positions."
		   });			
		addAnnotation
		  (getTapChanger_TransformerWinding(), 
		   source, 
		   new String[] {
			 "Documentation", "A transformer winding may have tap changers, separately for voltage and phase angle"
		   });			
		addAnnotation
		  (getTapChanger_NormalStep(), 
		   source, 
		   new String[] {
			 "Documentation", "The tap step position used in \"normal\" network operation for this winding. For a \"Fixed\" tap changer indicates the current physical tap setting."
		   });			
		addAnnotation
		  (getTapChanger_HighStep(), 
		   source, 
		   new String[] {
			 "Documentation", "Highest possible tap step position, advance from neutral"
		   });			
		addAnnotation
		  (getTapChanger_StepPhaseShiftIncrement(), 
		   source, 
		   new String[] {
			 "Documentation", "Phase shift per step position. A positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer)."
		   });			
		addAnnotation
		  (getTapChanger_NeutralStep(), 
		   source, 
		   new String[] {
			 "Documentation", "The neutral tap step position for this winding."
		   });			
		addAnnotation
		  (getTapChanger_LowStep(), 
		   source, 
		   new String[] {
			 "Documentation", "Lowest possible tap step position, retard from neutral"
		   });			
		addAnnotation
		  (getTapChanger_TculControlMode(), 
		   source, 
		   new String[] {
			 "Documentation", "For an LTC, the tap changer control mode."
		   });			
		addAnnotation
		  (getTapChanger_StepVoltageIncrement(), 
		   source, 
		   new String[] {
			 "Documentation", "Tap step increment, in per cent of nominal voltage, per step position."
		   });			
		addAnnotation
		  (getTapChanger_Type(), 
		   source, 
		   new String[] {
			 "Documentation", "The type of tap changer. Indicates the ability of the transformer to perform various regulation tasks. The tap changer must be also be associated wtih a RegulationControl object before any regulation is possible."
		   });			
		addAnnotation
		  (getTapChanger_NeutralU(), 
		   source, 
		   new String[] {
			 "Documentation", "Voltage at which the winding operates at the neutral tap setting."
		   });			
		addAnnotation
		  (lineEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A component part of a system extending between adjacent substations or from a substation to an adjacent interconnection point."
		   });			
		addAnnotation
		  (getLine_Region(), 
		   source, 
		   new String[] {
			 "Documentation", "A Line can be contained by a SubGeographical Region."
		   });			
		addAnnotation
		  (staticVarCompensatorEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero."
		   });			
		addAnnotation
		  (getStaticVarCompensator_VoltageSetPoint(), 
		   source, 
		   new String[] {
			 "Documentation", "The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero."
		   });			
		addAnnotation
		  (getStaticVarCompensator_SVCControlMode(), 
		   source, 
		   new String[] {
			 "Documentation", "SVC control mode."
		   });			
		addAnnotation
		  (getStaticVarCompensator_CapacitiveRating(), 
		   source, 
		   new String[] {
			 "Documentation", "Maximum available capacitive reactive power"
		   });			
		addAnnotation
		  (getStaticVarCompensator_Slope(), 
		   source, 
		   new String[] {
			 "Documentation", "The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint."
		   });			
		addAnnotation
		  (getStaticVarCompensator_InductiveRating(), 
		   source, 
		   new String[] {
			 "Documentation", "Maximum available inductive reactive power"
		   });			
		addAnnotation
		  (seriesCompensatorEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance."
		   });			
		addAnnotation
		  (getSeriesCompensator_R(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence resistance."
		   });			
		addAnnotation
		  (getSeriesCompensator_X(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence reactance."
		   });			
		addAnnotation
		  (breakerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A mechanical switching device capable of making, carrying, and breaking currents under normal circuit conditions and also making, carrying for a specified time, and breaking currents under specified abnormal circuit conditions e.g.  those of short circuit."
		   });			
		addAnnotation
		  (getBreaker_RatedCurrent(), 
		   source, 
		   new String[] {
			 "Documentation", "Fault interrupting current rating."
		   });			
		addAnnotation
		  (discreteValueEClass, 
		   source, 
		   new String[] {
			 "Documentation", "DiscreteValue represents a discrete MeasurementValue."
		   });			
		addAnnotation
		  (getDiscreteValue_MemberOf_Measurement(), 
		   source, 
		   new String[] {
			 "Documentation", "Measurement to which this value is connected."
		   });			
		addAnnotation
		  (measurementEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of  power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone."
		   });			
		addAnnotation
		  (getMeasurement_MemberOf_PSR(), 
		   source, 
		   new String[] {
			 "Documentation", "The PowerSystemResource that contains the Measurement in the naming hierarchy"
		   });			
		addAnnotation
		  (getMeasurement_MeasurementType(), 
		   source, 
		   new String[] {
			 "Documentation", "The type for the Measurement"
		   });			
		addAnnotation
		  (getMeasurement_Terminal(), 
		   source, 
		   new String[] {
			 "Documentation", "One or more measurements may be associated with a terminal in the network"
		   });			
		addAnnotation
		  (getMeasurement_Unit(), 
		   source, 
		   new String[] {
			 "Documentation", "The Unit for the Measurement"
		   });			
		addAnnotation
		  (measurementValueEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement."
		   });			
		addAnnotation
		  (getMeasurementValue_MeasurementValueSource(), 
		   source, 
		   new String[] {
			 "Documentation", "A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301."
		   });			
		addAnnotation
		  (measurementValueSourceEClass, 
		   source, 
		   new String[] {
			 "Documentation", "MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301."
		   });			
		addAnnotation
		  (getMeasurementValueSource_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Documentation", "The MeasurementValues updated by the source"
		   });				
		addAnnotation
		  (analogEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Analog represents an analog Measurement."
		   });			
		addAnnotation
		  (getAnalog_PositiveFlowIn(), 
		   source, 
		   new String[] {
			 "Documentation", "If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource."
		   });			
		addAnnotation
		  (getAnalog_Contain_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Documentation", "The values connected to this measurement."
		   });				
		addAnnotation
		  (analogValueEClass, 
		   source, 
		   new String[] {
			 "Documentation", "AnalogValue represents an analog MeasurementValue."
		   });			
		addAnnotation
		  (getAnalogValue_MemberOf_Measurement(), 
		   source, 
		   new String[] {
			 "Documentation", "Measurement to which this value is connected."
		   });			
		addAnnotation
		  (measurementTypeEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc. The MeasurementType.name shall be unique among all specified types and describe the type. The MeasurementType.aliasName is meant to be used for localization."
		   });			
		addAnnotation
		  (getMeasurementType_Measurements(), 
		   source, 
		   new String[] {
			 "Documentation", "The measurements associated with the Type"
		   });				
		addAnnotation
		  (discreteEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position."
		   });			
		addAnnotation
		  (getDiscrete_Contain_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Documentation", "The values connected to this measurement."
		   });				
		addAnnotation
		  (limitSetEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way."
		   });			
		addAnnotation
		  (getLimitSet_IsPercentageLimits(), 
		   source, 
		   new String[] {
			 "Documentation", "Tells if the limit values are in percentage of normalValue or the specified Unit for Measurements and Controls."
		   });			
		addAnnotation
		  (nonConformLoadGroupEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Loads that do not follow a daily and seasonal load variation pattern."
		   });			
		addAnnotation
		  (getNonConformLoadGroup_NonConformLoadSchedules(), 
		   source, 
		   new String[] {
			 "Documentation", "The NonConformLoadSchedules in the NonConformLoadGroup."
		   });				
		addAnnotation
		  (getNonConformLoadGroup_EnergyConsumers(), 
		   source, 
		   new String[] {
			 "Documentation", "Conform loads assigned to this ConformLoadGroup."
		   });				
		addAnnotation
		  (conformLoadScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season."
		   });			
		addAnnotation
		  (getConformLoadSchedule_ConformLoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "The ConformLoadGroup where the ConformLoadSchedule belongs."
		   });			
		addAnnotation
		  (customerLoadEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A meter for measuring customer energy consumption. The typeName attribute indicates the type of customer meter."
		   });			
		addAnnotation
		  (nonConformLoadEClass, 
		   source, 
		   new String[] {
			 "Documentation", "NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern."
		   });			
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "Group of this ConformLoad."
		   });			
		addAnnotation
		  (dayTypeEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Group of similar days, e.g., Mon/Tue/Wed, Thu/Fri, Sat/Sun, Holiday1, Holiday2"
		   });			
		addAnnotation
		  (getDayType_SeasonDayTypeSchedules(), 
		   source, 
		   new String[] {
			 "Documentation", "Schedules that use this DayType."
		   });				
		addAnnotation
		  (seasonEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A specified time period of the year, e.g., Spring, Summer, Fall, Winter"
		   });			
		addAnnotation
		  (getSeason_EndDate(), 
		   source, 
		   new String[] {
			 "Documentation", "Date season ends"
		   });			
		addAnnotation
		  (getSeason_StartDate(), 
		   source, 
		   new String[] {
			 "Documentation", "Date season starts"
		   });			
		addAnnotation
		  (getSeason_SeasonDayTypeSchedules(), 
		   source, 
		   new String[] {
			 "Documentation", "Schedules that use this Season."
		   });				
		addAnnotation
		  (getSeason_Name(), 
		   source, 
		   new String[] {
			 "Documentation", "Name of the Season"
		   });			
		addAnnotation
		  (loadEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A generic equivalent for an energy consumer on a transmission or distribution voltage level. It may be under load management and also has cold load pick up characteristics."
		   });			
		addAnnotation
		  (stationSupplyEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Station supply with load derived from the station output."
		   });			
		addAnnotation
		  (seasonDayTypeScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The schedule specialize RegularIntervalSchedule with type curve data for a specific type of day and season. This means that curves of this type cover a 24 hour period."
		   });			
		addAnnotation
		  (getSeasonDayTypeSchedule_DayType(), 
		   source, 
		   new String[] {
			 "Documentation", "DayType for the Schedule."
		   });			
		addAnnotation
		  (getSeasonDayTypeSchedule_Season(), 
		   source, 
		   new String[] {
			 "Documentation", "Season for the Schedule."
		   });			
		addAnnotation
		  (loadGroupEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling."
		   });			
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The SubLoadArea where the Loadgroup belongs."
		   });			
		addAnnotation
		  (energyAreaEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class describes an area having energy production or consumption. The class is the basis for further specialization."
		   });			
		addAnnotation
		  (getEnergyArea_ControlArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The control area specification that is used for the load forecast."
		   });				
		addAnnotation
		  (conformLoadGroupEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Load that follows a daily and seasonal load variation pattern."
		   });			
		addAnnotation
		  (getConformLoadGroup_EnergyConsumers(), 
		   source, 
		   new String[] {
			 "Documentation", "Conform loads assigned to this ConformLoadGroup."
		   });				
		addAnnotation
		  (getConformLoadGroup_ConformLoadSchedules(), 
		   source, 
		   new String[] {
			 "Documentation", "The ConformLoadSchedules in the ConformLoadGroup."
		   });				
		addAnnotation
		  (loadAreaEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling."
		   });			
		addAnnotation
		  (getLoadArea_SubLoadAreas(), 
		   source, 
		   new String[] {
			 "Documentation", "The SubLoadAreas in the LoadArea."
		   });				
		addAnnotation
		  (subLoadAreaEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling."
		   });			
		addAnnotation
		  (getSubLoadArea_LoadGroups(), 
		   source, 
		   new String[] {
			 "Documentation", "The Loadgroups in the SubLoadArea."
		   });				
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The LoadArea where the SubLoadArea belongs."
		   });			
		addAnnotation
		  (loadResponseCharacteristicEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response."
		   });			
		addAnnotation
		  (getLoadResponseCharacteristic_PFrequencyExponent(), 
		   source, 
		   new String[] {
			 "Documentation", "Exponent of per unit frequency effecting active power"
		   });			
		addAnnotation
		  (getLoadResponseCharacteristic_QVoltageExponent(), 
		   source, 
		   new String[] {
			 "Documentation", "Exponent of per unit voltage effecting reactive power.   This model used only when \"useExponentModel\" is true."
		   });			
		addAnnotation
		  (getLoadResponseCharacteristic_QFrequencyExponent(), 
		   source, 
		   new String[] {
			 "Documentation", "Exponent of per unit frequency effecting reactive power"
		   });			
		addAnnotation
		  (getLoadResponseCharacteristic_PVoltageExponent(), 
		   source, 
		   new String[] {
			 "Documentation", "Exponent of per unit voltage effecting real power.   This model used only when \"useExponentModel\" is true."
		   });			
		addAnnotation
		  (getLoadResponseCharacteristic_EnergyConsumer(), 
		   source, 
		   new String[] {
			 "Documentation", "The set of loads that have the response characteristics."
		   });				
		addAnnotation
		  (nonConformLoadScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)"
		   });			
		addAnnotation
		  (getNonConformLoadSchedule_NonConformLoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "The NonConformLoadGroup where the NonConformLoadSchedule belongs."
		   });			
		addAnnotation
		  (inductionMotorLoadEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Large three phase induction motor load. The typeName attribute indicates the type of induction motor (1 = wound rotor) (2 = squirrel cage)."
		   });			
		addAnnotation
		  (conformLoadEClass, 
		   source, 
		   new String[] {
			 "Documentation", "ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load."
		   });			
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "Group of this ConformLoad."
		   });			
		addAnnotation
		  (equivalentNetworkEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent."
		   });			
		addAnnotation
		  (getEquivalentNetwork_EquivalentEquipments(), 
		   source, 
		   new String[] {
			 "Documentation", "The associated reduced equivalents."
		   });				
		addAnnotation
		  (equivalentShuntEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class represents equivalent shunts."
		   });			
		addAnnotation
		  (getEquivalentShunt_B(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence shunt susceptance."
		   });			
		addAnnotation
		  (getEquivalentShunt_G(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence shunt conductance."
		   });			
		addAnnotation
		  (equivalentEquipmentEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of diferent types."
		   });			
		addAnnotation
		  (getEquivalentEquipment_EquivalentNetwork(), 
		   source, 
		   new String[] {
			 "Documentation", "The equivalent where the reduced model belongs."
		   });			
		addAnnotation
		  (equivalentBranchEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The class represents equivalent branches."
		   });			
		addAnnotation
		  (getEquivalentBranch_X(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series reactance of the reduced branch."
		   });			
		addAnnotation
		  (getEquivalentBranch_R(), 
		   source, 
		   new String[] {
			 "Documentation", "Positive sequence series resistance of the reduced branch."
		   });			
		addAnnotation
		  (identifiedObjectEClass, 
		   source, 
		   new String[] {
			 "Documentation", "This is a root class to provide common naming attributes for all classes needing naming attributes"
		   });			
		addAnnotation
		  (getIdentifiedObject_PathName(), 
		   source, 
		   new String[] {
			 "Documentation", "The pathname is a system unique name composed from all IdentifiedObject.localNames in a naming hierarchy path from the object to the root."
		   });			
		addAnnotation
		  (getIdentifiedObject_Description(), 
		   source, 
		   new String[] {
			 "Documentation", "The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy."
		   });			
		addAnnotation
		  (getIdentifiedObject_AliasName(), 
		   source, 
		   new String[] {
			 "Documentation", "The aliasName is free text human readable name of the object alternative to IdentifiedObject.name. It may be non unique and may not correlate to a naming hierarchy."
		   });			
		addAnnotation
		  (getIdentifiedObject_Name(), 
		   source, 
		   new String[] {
			 "Documentation", "The name is a free text human readable name of the object. It may be non unique and may not correlate to a naming hierarchy."
		   });			
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
			 "Documentation", "An electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called \"connectivity nodes\"."
		   });			
		addAnnotation
		  (getTerminal_Measurements(), 
		   source, 
		   new String[] {
			 "Documentation", "One or more measurements may be associated with a terminal in the network. Measurement-Terminal defines where the measurement is placed in the network topology.\nSome Measurements represent quantities related to a particular sensor position, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is captured by the Measurement - Terminal association that makes it possible to place the sensing position at a  well defined place. The place is defined by the connection of the Terminal to ConductingEquipment."
		   });				
		addAnnotation
		  (getTerminal_RegulatingControl(), 
		   source, 
		   new String[] {
			 "Documentation", "The terminal is regulated by a control."
		   });				
		addAnnotation
		  (getTerminal_ConnectivityNode(), 
		   source, 
		   new String[] {
			 "Documentation", "Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals."
		   });			
		addAnnotation
		  (getTerminal_ConductingEquipment(), 
		   source, 
		   new String[] {
			 "Documentation", "ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes"
		   });			
		addAnnotation
		  (baseVoltageEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Collection of BaseVoltages which is used to verify that the BusbarSection.BaseVoltage and other voltage attributes in the CIM are given a value existing in the collection."
		   });			
		addAnnotation
		  (getBaseVoltage_NominalVoltage(), 
		   source, 
		   new String[] {
			 "Documentation", "The PowerSystemResource\'s base voltage."
		   });			
		addAnnotation
		  (getBaseVoltage_ConductingEquipment(), 
		   source, 
		   new String[] {
			 "Documentation", "Use association to ConductingEquipment only when there is no VoltageLevel container used."
		   });				
		addAnnotation
		  (getBaseVoltage_VoltageLevel(), 
		   source, 
		   new String[] {
			 "Documentation", "The VoltageLevels having this BaseVoltage."
		   });				
		addAnnotation
		  (regularIntervalScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The schedule has TimePoints where the time between them is constant."
		   });			
		addAnnotation
		  (getRegularIntervalSchedule_EndTime(), 
		   source, 
		   new String[] {
			 "Documentation", "The time for the last time point."
		   });			
		addAnnotation
		  (getRegularIntervalSchedule_TimePoints(), 
		   source, 
		   new String[] {
			 "Documentation", "The point data values that define a curve"
		   });				
		addAnnotation
		  (getRegularIntervalSchedule_TimeStep(), 
		   source, 
		   new String[] {
			 "Documentation", "The time between each pair of subsequent RegularTimePoints."
		   });			
		addAnnotation
		  (connectivityNodeContainerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A base class for all objects that may contain ConnectivityNodes."
		   });			
		addAnnotation
		  (getConnectivityNodeContainer_ConnectivityNodes(), 
		   source, 
		   new String[] {
			 "Documentation", "Connectivity nodes contained by this container."
		   });				
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Quantity being measured. The Unit.name shall be unique among all specified quantities and describe the quantity. The Unit.aliasName is meant to be used for localization."
		   });			
		addAnnotation
		  (getUnit_Measurements(), 
		   source, 
		   new String[] {
			 "Documentation", "The Measurements having the Unit"
		   });				
		addAnnotation
		  (equipmentContainerEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A modeling construct to provide a root class for all Equipment classes"
		   });			
		addAnnotation
		  (getEquipmentContainer_Contains_Equipments(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });				
		addAnnotation
		  (voltageLevelEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these."
		   });			
		addAnnotation
		  (getVoltageLevel_MemberOf_Substation(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });			
		addAnnotation
		  (getVoltageLevel_LowVoltageLimit(), 
		   source, 
		   new String[] {
			 "Documentation", "The bus bar\'s low voltage limit"
		   });			
		addAnnotation
		  (getVoltageLevel_HighVoltageLimit(), 
		   source, 
		   new String[] {
			 "Documentation", "The bus bar\'s high voltage limit"
		   });			
		addAnnotation
		  (getVoltageLevel_BaseVoltage(), 
		   source, 
		   new String[] {
			 "Documentation", "The base voltage used for all equipment within the VoltageLevel."
		   });			
		addAnnotation
		  (getVoltageLevel_Contains_Bays(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });				
		addAnnotation
		  (bayEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry."
		   });			
		addAnnotation
		  (getBay_MemberOf_VoltageLevel(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });			
		addAnnotation
		  (subGeographicalRegionEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A subset of a geographical region of a power system network model."
		   });			
		addAnnotation
		  (getSubGeographicalRegion_Region(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });			
		addAnnotation
		  (getSubGeographicalRegion_Lines(), 
		   source, 
		   new String[] {
			 "Documentation", "A Line can be contained by a SubGeographical Region."
		   });				
		addAnnotation
		  (getSubGeographicalRegion_Substations(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });				
		addAnnotation
		  (regularTimePointEClass, 
		   source, 
		   new String[] {
			 "Documentation", "TimePoints for a schedule where the time between the points is constant."
		   });			
		addAnnotation
		  (getRegularTimePoint_Value1(), 
		   source, 
		   new String[] {
			 "Documentation", "The first value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule."
		   });			
		addAnnotation
		  (getRegularTimePoint_SequenceNumber(), 
		   source, 
		   new String[] {
			 "Documentation", "The position of the RegularTimePoint in the sequence. Note that time points don\'t have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the RegularIntervalSchedule.timeStep with the RegularTimePoint.sequenceNumber and add the BasicIntervalSchedule.startTime."
		   });			
		addAnnotation
		  (getRegularTimePoint_Value2(), 
		   source, 
		   new String[] {
			 "Documentation", "The second value at the time. The meaning of the value is defined by the class inhering the RegularIntervalSchedule."
		   });			
		addAnnotation
		  (getRegularTimePoint_IntervalSchedule(), 
		   source, 
		   new String[] {
			 "Documentation", "A RegularTimePoint belongs to a RegularIntervalSchedule."
		   });			
		addAnnotation
		  (equipmentEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The parts of a power system that are physical devices, electronic or mechanical"
		   });			
		addAnnotation
		  (getEquipment_MemberOf_EquipmentContainer(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });			
		addAnnotation
		  (getEquipment_OperationalLimitSet(), 
		   source, 
		   new String[] {
			 "Documentation", "The equipment limit sets associated with the equipment."
		   });				
		addAnnotation
		  (substationEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics."
		   });			
		addAnnotation
		  (getSubstation_Region(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });			
		addAnnotation
		  (getSubstation_Contains_VoltageLevels(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });				
		addAnnotation
		  (curveEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Relationship between an independent variable (X-axis) and one or two dependent \nvariables (Y1-axis and Y2-axis). Curves can also serve as schedules."
		   });			
		addAnnotation
		  (getCurve_Y2Unit(), 
		   source, 
		   new String[] {
			 "Documentation", "The Y2-axis units of measure."
		   });			
		addAnnotation
		  (getCurve_XUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "The X-axis units of measure."
		   });			
		addAnnotation
		  (getCurve_CurveScheduleDatas(), 
		   source, 
		   new String[] {
			 "Documentation", "The point data values that define a curve"
		   });				
		addAnnotation
		  (getCurve_CurveStyle(), 
		   source, 
		   new String[] {
			 "Documentation", "The style or shape of the curve."
		   });			
		addAnnotation
		  (getCurve_Y1Unit(), 
		   source, 
		   new String[] {
			 "Documentation", "The Y1-axis units of measure."
		   });			
		addAnnotation
		  (powerSystemResourceEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company."
		   });			
		addAnnotation
		  (getPowerSystemResource_Contains_Measurements(), 
		   source, 
		   new String[] {
			 "Documentation", "The Measurements that are included in the naming hierarchy where the PSR is the containing object"
		   });				
		addAnnotation
		  (basicIntervalScheduleEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Schedule of values at points in time."
		   });			
		addAnnotation
		  (getBasicIntervalSchedule_StartTime(), 
		   source, 
		   new String[] {
			 "Documentation", "The time for the first time point."
		   });			
		addAnnotation
		  (getBasicIntervalSchedule_Value1Unit(), 
		   source, 
		   new String[] {
			 "Documentation", "Value1 units of measure."
		   });			
		addAnnotation
		  (getBasicIntervalSchedule_Value2Unit(), 
		   source, 
		   new String[] {
			 "Documentation", "Value2 units of measure."
		   });			
		addAnnotation
		  (curveDataEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Data point values for defining a curve or schedule"
		   });			
		addAnnotation
		  (getCurveData_Y2value(), 
		   source, 
		   new String[] {
			 "Documentation", "The data value of the second Y-axis variable (if present), depending on the Y-axis units"
		   });			
		addAnnotation
		  (getCurveData_Xvalue(), 
		   source, 
		   new String[] {
			 "Documentation", "The data value of the X-axis variable,  depending on the X-axis units"
		   });			
		addAnnotation
		  (getCurveData_Y1value(), 
		   source, 
		   new String[] {
			 "Documentation", "The data value of the  first Y-axis variable, depending on the Y-axis units"
		   });			
		addAnnotation
		  (getCurveData_CurveSchedule(), 
		   source, 
		   new String[] {
			 "Documentation", "The Curve defined by this CurveData."
		   });			
		addAnnotation
		  (geographicalRegionEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A geographical region of a power system network model."
		   });			
		addAnnotation
		  (getGeographicalRegion_Regions(), 
		   source, 
		   new String[] {
			 "Documentation", "The association is used in the naming hierarchy."
		   });				
		addAnnotation
		  (conductingEquipmentEClass, 
		   source, 
		   new String[] {
			 "Documentation", "The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation."
		   });			
		addAnnotation
		  (getConductingEquipment_BaseVoltage(), 
		   source, 
		   new String[] {
			 "Documentation", "Use association to ConductingEquipment only when there is no VoltageLevel container used."
		   });			
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
			 "Documentation", "ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes"
		   });				
		addAnnotation
		  (controlAreaEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model."
		   });			
		addAnnotation
		  (getControlArea_ControlAreaGeneratingUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "The generating unit specificaitons for the control area."
		   });				
		addAnnotation
		  (getControlArea_NetInterchange(), 
		   source, 
		   new String[] {
			 "Documentation", "The specified positive net interchange into the control area."
		   });			
		addAnnotation
		  (getControlArea_EnergyArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The energy area that is forecast from this control area specification."
		   });			
		addAnnotation
		  (getControlArea_TieFlow(), 
		   source, 
		   new String[] {
			 "Documentation", "The tie flows associated with the control area."
		   });				
		addAnnotation
		  (getControlArea_Type(), 
		   source, 
		   new String[] {
			 "Documentation", "The type of control area defintion used to determine if this is used for automatic generation control, for planning interchange control, or other purposes."
		   });			
		addAnnotation
		  (tieFlowEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A flow specification in terms of location and direction for a control area."
		   });			
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The control area of the tie flows."
		   });			
		addAnnotation
		  (getTieFlow_PositiveFlowIn(), 
		   source, 
		   new String[] {
			 "Documentation", "The flow is positive into the terminal.  A flow is positive if it is an import into the control area."
		   });			
		addAnnotation
		  (controlAreaGeneratingUnitEClass, 
		   source, 
		   new String[] {
			 "Documentation", "A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit."
		   });			
		addAnnotation
		  (getControlAreaGeneratingUnit_ControlArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The parent control area for the generating unit specifications."
		   });			
		addAnnotation
		  (getControlAreaGeneratingUnit_GeneratingUnit(), 
		   source, 
		   new String[] {
			 "Documentation", "The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once."
		   });				
		addAnnotation
		  (currentFlowEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Electrical current (positive flow is out of the ConductingEquipment into the ConnectivityNode)"
		   });				
		addAnnotation
		  (activePowerEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Product of RMS value of the voltage and the RMS value of the in-phase component of the current"
		   });				
		addAnnotation
		  (secondsEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Time, in seconds"
		   });				
		addAnnotation
		  (susceptanceEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Imaginary part of admittance."
		   });				
		addAnnotation
		  (conductanceEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Factor by which voltage must be multiplied to give corresponding power lost from a circuit. Real part of admittance."
		   });				
		addAnnotation
		  (resistanceEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Resistance (real part of impedance)."
		   });				
		addAnnotation
		  (perCentEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Normally 0 - 100 on a defined base"
		   });				
		addAnnotation
		  (reactivePowerEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Product of RMS value of the voltage and the RMS value of the quadrature component of the current."
		   });				
		addAnnotation
		  (angleDegreesEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Measurement of angle in degrees"
		   });				
		addAnnotation
		  (voltageEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Electrical voltage."
		   });				
		addAnnotation
		  (apparentPowerEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Product of the RMS value of the voltage and the RMS value of the current"
		   });				
		addAnnotation
		  (reactanceEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Reactance (imaginary part of impedance), at rated frequency."
		   });				
		addAnnotation
		  (voltagePerReactivePowerEDataType, 
		   source, 
		   new String[] {
			 "Documentation", "Voltage variation with reactive power"
		   });			
		addAnnotation
		  (connectivityNodeEClass, 
		   source, 
		   new String[] {
			 "Documentation", "Connectivity nodes are points where terminals of conducting equipment are connected together with zero impedance."
		   });			
		addAnnotation
		  (getConnectivityNode_Terminals(), 
		   source, 
		   new String[] {
			 "Documentation", "Terminals interconnect with zero impedance at a node.  Measurements on a node apply to all of its terminals."
		   });				
		addAnnotation
		  (getConnectivityNode_MemberOf_EquipmentContainer(), 
		   source, 
		   new String[] {
			 "Documentation", "Container of this connectivity node."
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://langdale.com.au/2005/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://langdale.com.au/2005/UML";																															
		addAnnotation
		  (getGeneratingUnit_Contains_SynchronousMachines(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getGeneratingUnit_GrossToNetActivePowerCurves(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getGeneratingUnit_ControlAreaGeneratingUnit(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																		
		addAnnotation
		  (getOperationalLimitSet_OperationalLimitValue(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																						
		addAnnotation
		  (getPowerTransformer_Contains_TransformerWindings(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																																																								
		addAnnotation
		  (getTransformerWinding_TapChangers(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																						
		addAnnotation
		  (getRegulatingControl_TapChanger(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getRegulatingControl_RegulatingCondEq(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getRegulationSchedule_RegulatingControl(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																				
		addAnnotation
		  (getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																																																																								
		addAnnotation
		  (getMeasurementValueSource_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getAnalog_Contain_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });										
		addAnnotation
		  (getMeasurementType_Measurements(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getDiscrete_Contain_MeasurementValues(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });										
		addAnnotation
		  (getNonConformLoadGroup_NonConformLoadSchedules(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getNonConformLoadGroup_EnergyConsumers(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																
		addAnnotation
		  (getDayType_SeasonDayTypeSchedules(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });										
		addAnnotation
		  (getSeason_SeasonDayTypeSchedules(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																						
		addAnnotation
		  (getEnergyArea_ControlArea(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getConformLoadGroup_EnergyConsumers(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getConformLoadGroup_ConformLoadSchedules(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getLoadArea_SubLoadAreas(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getSubLoadArea_LoadGroups(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																
		addAnnotation
		  (getLoadResponseCharacteristic_EnergyConsumer(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																
		addAnnotation
		  (getEquivalentNetwork_EquivalentEquipments(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																																
		addAnnotation
		  (getTerminal_Measurements(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getTerminal_RegulatingControl(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });												
		addAnnotation
		  (getBaseVoltage_ConductingEquipment(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getBaseVoltage_VoltageLevel(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getRegularIntervalSchedule_TimePoints(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getConnectivityNodeContainer_ConnectivityNodes(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getUnit_Measurements(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getEquipmentContainer_Contains_Equipments(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });														
		addAnnotation
		  (getVoltageLevel_Contains_Bays(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });												
		addAnnotation
		  (getSubGeographicalRegion_Lines(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });				
		addAnnotation
		  (getSubGeographicalRegion_Substations(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																		
		addAnnotation
		  (getEquipment_OperationalLimitSet(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getSubstation_Contains_VoltageLevels(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });										
		addAnnotation
		  (getCurve_CurveScheduleDatas(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });										
		addAnnotation
		  (getPowerSystemResource_Contains_Measurements(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																								
		addAnnotation
		  (getGeographicalRegion_Regions(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });						
		addAnnotation
		  (getControlArea_ControlAreaGeneratingUnit(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });								
		addAnnotation
		  (getControlArea_TieFlow(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																																																											
		addAnnotation
		  (getConnectivityNode_Terminals(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });			
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
		addAnnotation
		  (currentFlowEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (activePowerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (secondsEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (susceptanceEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (conductanceEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (resistanceEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (perCentEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (reactivePowerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (angleDegreesEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (voltageEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (apparentPowerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (reactanceEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });				
		addAnnotation
		  (voltagePerReactivePowerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });									
	}

} //CPSMPackageImpl
