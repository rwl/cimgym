/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.CorePackage;

import CPSM.Core.impl.CorePackageImpl;

import CPSM.Domain.DomainPackage;

import CPSM.Domain.impl.DomainPackageImpl;

import CPSM.Equivalents.EquivalentsPackage;

import CPSM.Equivalents.impl.EquivalentsPackageImpl;

import CPSM.Generation.Production.ProductionPackage;

import CPSM.Generation.Production.impl.ProductionPackageImpl;

import CPSM.LoadModel.LoadModelPackage;

import CPSM.LoadModel.impl.LoadModelPackageImpl;

import CPSM.Meas.MeasPackage;

import CPSM.Meas.impl.MeasPackageImpl;

import CPSM.OperationalLimits.OperationalLimitsPackage;

import CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl;

import CPSM.Topology.TopologyPackage;

import CPSM.Topology.impl.TopologyPackageImpl;

import CPSM.Wires.ACLineSegment;
import CPSM.Wires.Breaker;
import CPSM.Wires.BusbarSection;
import CPSM.Wires.Conductor;
import CPSM.Wires.Disconnector;
import CPSM.Wires.EnergyConsumer;
import CPSM.Wires.Line;
import CPSM.Wires.LoadBreakSwitch;
import CPSM.Wires.PowerTransformer;
import CPSM.Wires.ReactiveCapabilityCurve;
import CPSM.Wires.RegulatingCondEq;
import CPSM.Wires.RegulatingControl;
import CPSM.Wires.RegulationSchedule;
import CPSM.Wires.SVCControlMode;
import CPSM.Wires.SeriesCompensator;
import CPSM.Wires.ShuntCompensator;
import CPSM.Wires.StaticVarCompensator;
import CPSM.Wires.Switch;
import CPSM.Wires.SynchronousMachine;
import CPSM.Wires.SynchronousMachineOperatingMode;
import CPSM.Wires.SynchronousMachineType;
import CPSM.Wires.TapChanger;
import CPSM.Wires.TapChangerKind;
import CPSM.Wires.TransformerControlMode;
import CPSM.Wires.TransformerWinding;
import CPSM.Wires.WindingType;
import CPSM.Wires.WiresFactory;
import CPSM.Wires.WiresPackage;

import CPSM.impl.CPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class WiresPackageImpl extends EPackageImpl implements WiresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

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
	 * @see CPSM.Wires.WiresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WiresPackageImpl() {
		super(eNS_URI, WiresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WiresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WiresPackage init() {
		if (isInited) return (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);

		// Obtain or create and register package
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WiresPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theWiresPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theWiresPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWiresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WiresPackage.eNS_URI, theWiresPackage);
		return theWiresPackage;
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
	public WiresFactory getWiresFactory() {
		return (WiresFactory)getEFactoryInstance();
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

		// Create enums
		synchronousMachineOperatingModeEEnum = createEEnum(SYNCHRONOUS_MACHINE_OPERATING_MODE);
		tapChangerKindEEnum = createEEnum(TAP_CHANGER_KIND);
		svcControlModeEEnum = createEEnum(SVC_CONTROL_MODE);
		windingTypeEEnum = createEEnum(WINDING_TYPE);
		synchronousMachineTypeEEnum = createEEnum(SYNCHRONOUS_MACHINE_TYPE);
		transformerControlModeEEnum = createEEnum(TRANSFORMER_CONTROL_MODE);
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

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ProductionPackage theProductionPackage = (ProductionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		powerTransformerEClass.getESuperTypes().add(theCorePackage.getEquipment());
		disconnectorEClass.getESuperTypes().add(this.getSwitch());
		synchronousMachineEClass.getESuperTypes().add(this.getRegulatingCondEq());
		busbarSectionEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		shuntCompensatorEClass.getESuperTypes().add(this.getRegulatingCondEq());
		loadBreakSwitchEClass.getESuperTypes().add(this.getSwitch());
		regulatingCondEqEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		energyConsumerEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		transformerWindingEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		regulatingControlEClass.getESuperTypes().add(theCorePackage.getPowerSystemResource());
		regulationScheduleEClass.getESuperTypes().add(theCorePackage.getRegularIntervalSchedule());
		acLineSegmentEClass.getESuperTypes().add(this.getConductor());
		switchEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		conductorEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		reactiveCapabilityCurveEClass.getESuperTypes().add(theCorePackage.getCurve());
		tapChangerEClass.getESuperTypes().add(theCorePackage.getPowerSystemResource());
		lineEClass.getESuperTypes().add(theCorePackage.getEquipmentContainer());
		staticVarCompensatorEClass.getESuperTypes().add(this.getRegulatingCondEq());
		seriesCompensatorEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		breakerEClass.getESuperTypes().add(this.getSwitch());

		// Initialize classes and features; add operations and parameters
		initEClass(powerTransformerEClass, PowerTransformer.class, "PowerTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerTransformer_Contains_TransformerWindings(), this.getTransformerWinding(), this.getTransformerWinding_MemberOf_PowerTransformer(), "Contains_TransformerWindings", null, 0, -1, PowerTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disconnectorEClass, Disconnector.class, "Disconnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronousMachineEClass, SynchronousMachine.class, "SynchronousMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronousMachine_InitialReactiveCapabilityCurve(), this.getReactiveCapabilityCurve(), this.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), "InitialReactiveCapabilityCurve", null, 0, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_OperatingMode(), this.getSynchronousMachineOperatingMode(), "operatingMode", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronousMachine_MemberOf_GeneratingUnit(), theProductionPackage.getGeneratingUnit(), theProductionPackage.getGeneratingUnit_Contains_SynchronousMachines(), "MemberOf_GeneratingUnit", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_MinQ(), theDomainPackage.getReactivePower(), "minQ", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_Type(), this.getSynchronousMachineType(), "type", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronousMachine_MaxQ(), theDomainPackage.getReactivePower(), "maxQ", null, 1, 1, SynchronousMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busbarSectionEClass, BusbarSection.class, "BusbarSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shuntCompensatorEClass, ShuntCompensator.class, "ShuntCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShuntCompensator_MaximumSections(), ecorePackage.getEInt(), "maximumSections", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_NormalSections(), ecorePackage.getEInt(), "normalSections", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_NomU(), theDomainPackage.getVoltage(), "nomU", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShuntCompensator_ReactivePerSection(), theDomainPackage.getReactivePower(), "reactivePerSection", null, 1, 1, ShuntCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBreakSwitchEClass, LoadBreakSwitch.class, "LoadBreakSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBreakSwitch_RatedCurrent(), theDomainPackage.getCurrentFlow(), "ratedCurrent", null, 1, 1, LoadBreakSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatingCondEqEClass, RegulatingCondEq.class, "RegulatingCondEq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatingCondEq_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_RegulatingCondEq(), "RegulatingControl", null, 0, 1, RegulatingCondEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energyConsumerEClass, EnergyConsumer.class, "EnergyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergyConsumer_QfixedPct(), theDomainPackage.getPerCent(), "qfixedPct", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_Pfixed(), theDomainPackage.getActivePower(), "pfixed", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnergyConsumer_LoadResponse(), theLoadModelPackage.getLoadResponseCharacteristic(), theLoadModelPackage.getLoadResponseCharacteristic_EnergyConsumer(), "LoadResponse", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_Qfixed(), theDomainPackage.getReactivePower(), "qfixed", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_PfixedPct(), theDomainPackage.getPerCent(), "pfixedPct", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformerWindingEClass, TransformerWinding.class, "TransformerWinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformerWinding_WindingType(), this.getWindingType(), "windingType", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformerWinding_TapChangers(), this.getTapChanger(), this.getTapChanger_TransformerWinding(), "TapChangers", null, 0, -1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformerWinding_MemberOf_PowerTransformer(), this.getPowerTransformer(), this.getPowerTransformer_Contains_TransformerWindings(), "MemberOf_PowerTransformer", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_RatedS(), theDomainPackage.getApparentPower(), "ratedS", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_X(), theDomainPackage.getReactance(), "x", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_RatedU(), theDomainPackage.getVoltage(), "ratedU", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_R(), theDomainPackage.getResistance(), "r", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformerWinding_B(), theDomainPackage.getSusceptance(), "b", null, 1, 1, TransformerWinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatingControlEClass, RegulatingControl.class, "RegulatingControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulatingControl_Terminal(), theCorePackage.getTerminal(), theCorePackage.getTerminal_RegulatingControl(), "Terminal", null, 1, 1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_RegulationSchedule(), this.getRegulationSchedule(), this.getRegulationSchedule_RegulatingControl(), "RegulationSchedule", null, 1, 1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_TapChanger(), this.getTapChanger(), this.getTapChanger_RegulatingControl(), "TapChanger", null, 0, -1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatingControl_RegulatingCondEq(), this.getRegulatingCondEq(), this.getRegulatingCondEq_RegulatingControl(), "RegulatingCondEq", null, 0, -1, RegulatingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulationScheduleEClass, RegulationSchedule.class, "RegulationSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegulationSchedule_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_RegulationSchedule(), "RegulatingControl", null, 0, -1, RegulationSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acLineSegmentEClass, ACLineSegment.class, "ACLineSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitch_NormalOpen(), ecorePackage.getEBoolean(), "normalOpen", null, 1, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductorEClass, Conductor.class, "Conductor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConductor_R(), theDomainPackage.getResistance(), "r", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_X(), theDomainPackage.getReactance(), "x", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Bch(), theDomainPackage.getSusceptance(), "bch", null, 1, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactiveCapabilityCurveEClass, ReactiveCapabilityCurve.class, "ReactiveCapabilityCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine(), this.getSynchronousMachine(), this.getSynchronousMachine_InitialReactiveCapabilityCurve(), "InitiallyUsedBySynchronousMachine", null, 0, -1, ReactiveCapabilityCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tapChangerEClass, TapChanger.class, "TapChanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTapChanger_RegulatingControl(), this.getRegulatingControl(), this.getRegulatingControl_TapChanger(), "RegulatingControl", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTapChanger_TransformerWinding(), this.getTransformerWinding(), this.getTransformerWinding_TapChangers(), "TransformerWinding", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NormalStep(), ecorePackage.getEInt(), "normalStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_HighStep(), ecorePackage.getEInt(), "highStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_StepPhaseShiftIncrement(), theDomainPackage.getAngleDegrees(), "stepPhaseShiftIncrement", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NeutralStep(), ecorePackage.getEInt(), "neutralStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_LowStep(), ecorePackage.getEInt(), "lowStep", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_TculControlMode(), this.getTransformerControlMode(), "tculControlMode", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_StepVoltageIncrement(), theDomainPackage.getPerCent(), "stepVoltageIncrement", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_Type(), this.getTapChangerKind(), "type", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTapChanger_NeutralU(), theDomainPackage.getVoltage(), "neutralU", null, 1, 1, TapChanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Region(), theCorePackage.getSubGeographicalRegion(), theCorePackage.getSubGeographicalRegion_Lines(), "Region", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticVarCompensatorEClass, StaticVarCompensator.class, "StaticVarCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticVarCompensator_VoltageSetPoint(), theDomainPackage.getVoltage(), "voltageSetPoint", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_SVCControlMode(), this.getSVCControlMode(), "sVCControlMode", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_CapacitiveRating(), theDomainPackage.getReactance(), "capacitiveRating", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_Slope(), theDomainPackage.getVoltagePerReactivePower(), "slope", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticVarCompensator_InductiveRating(), theDomainPackage.getReactance(), "inductiveRating", null, 1, 1, StaticVarCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seriesCompensatorEClass, SeriesCompensator.class, "SeriesCompensator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeriesCompensator_R(), theDomainPackage.getResistance(), "r", null, 1, 1, SeriesCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesCompensator_X(), theDomainPackage.getReactance(), "x", null, 1, 1, SeriesCompensator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakerEClass, Breaker.class, "Breaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreaker_RatedCurrent(), theDomainPackage.getCurrentFlow(), "ratedCurrent", null, 1, 1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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

		// Create annotations
		// http://iec.ch/TC57/2008/CIM-schema-cim13#
		createCIMschemacim13Annotations();
		// http://langdale.com.au/2005/UML
		createUMLAnnotations();
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
			 "Documentation", "An extension to the Core and Topology package that models information on the electrical characteristics of Transmission and Distribution networks. This package is used by network applications such as State Estimation, Load Flow and Optimal Power Flow."
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
	}

} //WiresPackageImpl
