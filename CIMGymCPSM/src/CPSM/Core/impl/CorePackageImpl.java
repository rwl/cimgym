/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.BaseVoltage;
import CPSM.Core.BasicIntervalSchedule;
import CPSM.Core.Bay;
import CPSM.Core.ConductingEquipment;
import CPSM.Core.ConnectivityNodeContainer;
import CPSM.Core.CoreFactory;
import CPSM.Core.CorePackage;
import CPSM.Core.Curve;
import CPSM.Core.CurveData;
import CPSM.Core.CurveStyle;
import CPSM.Core.Equipment;
import CPSM.Core.EquipmentContainer;
import CPSM.Core.GeographicalRegion;
import CPSM.Core.IdentifiedObject;
import CPSM.Core.PowerSystemResource;
import CPSM.Core.RegularIntervalSchedule;
import CPSM.Core.RegularTimePoint;
import CPSM.Core.SubGeographicalRegion;
import CPSM.Core.Substation;
import CPSM.Core.Terminal;
import CPSM.Core.Unit;
import CPSM.Core.VoltageLevel;

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

import CPSM.Wires.WiresPackage;

import CPSM.Wires.impl.WiresPackageImpl;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
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
	private EEnum curveStyleEEnum = null;

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
	 * @see CPSM.Core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
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
	public EEnum getCurveStyle() {
		return curveStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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

		// Create enums
		curveStyleEEnum = createEEnum(CURVE_STYLE);
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
		CPSMPackage theCPSMPackage = (CPSMPackage)EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI);
		MeasPackage theMeasPackage = (MeasPackage)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI);
		WiresPackage theWiresPackage = (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		identifiedObjectEClass.getESuperTypes().add(theCPSMPackage.getElement());
		terminalEClass.getESuperTypes().add(this.getIdentifiedObject());
		baseVoltageEClass.getESuperTypes().add(this.getIdentifiedObject());
		regularIntervalScheduleEClass.getESuperTypes().add(this.getBasicIntervalSchedule());
		connectivityNodeContainerEClass.getESuperTypes().add(this.getPowerSystemResource());
		unitEClass.getESuperTypes().add(this.getIdentifiedObject());
		equipmentContainerEClass.getESuperTypes().add(this.getConnectivityNodeContainer());
		voltageLevelEClass.getESuperTypes().add(this.getEquipmentContainer());
		bayEClass.getESuperTypes().add(this.getEquipmentContainer());
		subGeographicalRegionEClass.getESuperTypes().add(this.getIdentifiedObject());
		regularTimePointEClass.getESuperTypes().add(theCPSMPackage.getElement());
		equipmentEClass.getESuperTypes().add(this.getPowerSystemResource());
		substationEClass.getESuperTypes().add(this.getEquipmentContainer());
		curveEClass.getESuperTypes().add(this.getIdentifiedObject());
		powerSystemResourceEClass.getESuperTypes().add(this.getIdentifiedObject());
		basicIntervalScheduleEClass.getESuperTypes().add(this.getIdentifiedObject());
		curveDataEClass.getESuperTypes().add(theCPSMPackage.getElement());
		geographicalRegionEClass.getESuperTypes().add(this.getIdentifiedObject());
		conductingEquipmentEClass.getESuperTypes().add(this.getEquipment());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedObjectEClass, IdentifiedObject.class, "IdentifiedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedObject_PathName(), ecorePackage.getEString(), "pathName", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_Description(), ecorePackage.getEString(), "description", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_AliasName(), ecorePackage.getEString(), "aliasName", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminal_Measurements(), theMeasPackage.getMeasurement(), theMeasPackage.getMeasurement_Terminal(), "Measurements", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_RegulatingControl(), theWiresPackage.getRegulatingControl(), theWiresPackage.getRegulatingControl_Terminal(), "RegulatingControl", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_ConnectivityNode(), theTopologyPackage.getConnectivityNode(), theTopologyPackage.getConnectivityNode_Terminals(), "ConnectivityNode", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_ConductingEquipment(), this.getConductingEquipment(), this.getConductingEquipment_Terminals(), "ConductingEquipment", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseVoltageEClass, BaseVoltage.class, "BaseVoltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseVoltage_NominalVoltage(), theDomainPackage.getVoltage(), "nominalVoltage", null, 1, 1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseVoltage_ConductingEquipment(), this.getConductingEquipment(), this.getConductingEquipment_BaseVoltage(), "ConductingEquipment", null, 0, -1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseVoltage_VoltageLevel(), this.getVoltageLevel(), this.getVoltageLevel_BaseVoltage(), "VoltageLevel", null, 0, -1, BaseVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularIntervalScheduleEClass, RegularIntervalSchedule.class, "RegularIntervalSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularIntervalSchedule_EndTime(), ecorePackage.getEDate(), "endTime", null, 1, 1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularIntervalSchedule_TimePoints(), this.getRegularTimePoint(), this.getRegularTimePoint_IntervalSchedule(), "TimePoints", null, 0, -1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularIntervalSchedule_TimeStep(), theDomainPackage.getSeconds(), "timeStep", null, 1, 1, RegularIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectivityNodeContainerEClass, ConnectivityNodeContainer.class, "ConnectivityNodeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectivityNodeContainer_ConnectivityNodes(), theTopologyPackage.getConnectivityNode(), theTopologyPackage.getConnectivityNode_MemberOf_EquipmentContainer(), "ConnectivityNodes", null, 0, -1, ConnectivityNodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnit_Measurements(), theMeasPackage.getMeasurement(), theMeasPackage.getMeasurement_Unit(), "Measurements", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentContainerEClass, EquipmentContainer.class, "EquipmentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipmentContainer_Contains_Equipments(), this.getEquipment(), this.getEquipment_MemberOf_EquipmentContainer(), "Contains_Equipments", null, 0, -1, EquipmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageLevelEClass, VoltageLevel.class, "VoltageLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoltageLevel_MemberOf_Substation(), this.getSubstation(), this.getSubstation_Contains_VoltageLevels(), "MemberOf_Substation", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltageLevel_LowVoltageLimit(), theDomainPackage.getVoltage(), "lowVoltageLimit", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltageLevel_HighVoltageLimit(), theDomainPackage.getVoltage(), "highVoltageLimit", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoltageLevel_BaseVoltage(), this.getBaseVoltage(), this.getBaseVoltage_VoltageLevel(), "BaseVoltage", null, 1, 1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoltageLevel_Contains_Bays(), this.getBay(), this.getBay_MemberOf_VoltageLevel(), "Contains_Bays", null, 0, -1, VoltageLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bayEClass, Bay.class, "Bay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBay_MemberOf_VoltageLevel(), this.getVoltageLevel(), this.getVoltageLevel_Contains_Bays(), "MemberOf_VoltageLevel", null, 1, 1, Bay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subGeographicalRegionEClass, SubGeographicalRegion.class, "SubGeographicalRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubGeographicalRegion_Region(), this.getGeographicalRegion(), this.getGeographicalRegion_Regions(), "Region", null, 1, 1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubGeographicalRegion_Lines(), theWiresPackage.getLine(), theWiresPackage.getLine_Region(), "Lines", null, 0, -1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubGeographicalRegion_Substations(), this.getSubstation(), this.getSubstation_Region(), "Substations", null, 0, -1, SubGeographicalRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularTimePointEClass, RegularTimePoint.class, "RegularTimePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularTimePoint_Value1(), ecorePackage.getEFloat(), "value1", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularTimePoint_SequenceNumber(), ecorePackage.getEInt(), "sequenceNumber", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegularTimePoint_Value2(), ecorePackage.getEFloat(), "value2", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularTimePoint_IntervalSchedule(), this.getRegularIntervalSchedule(), this.getRegularIntervalSchedule_TimePoints(), "IntervalSchedule", null, 1, 1, RegularTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipment_MemberOf_EquipmentContainer(), this.getEquipmentContainer(), this.getEquipmentContainer_Contains_Equipments(), "MemberOf_EquipmentContainer", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquipment_OperationalLimitSet(), theOperationalLimitsPackage.getOperationalLimitSet(), theOperationalLimitsPackage.getOperationalLimitSet_Equipment(), "OperationalLimitSet", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substationEClass, Substation.class, "Substation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstation_Region(), this.getSubGeographicalRegion(), this.getSubGeographicalRegion_Substations(), "Region", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstation_Contains_VoltageLevels(), this.getVoltageLevel(), this.getVoltageLevel_MemberOf_Substation(), "Contains_VoltageLevels", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveEClass, Curve.class, "Curve", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurve_Y2Unit(), theDomainPackage.getUnitSymbol(), "y2Unit", null, 0, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_XUnit(), theDomainPackage.getUnitSymbol(), "xUnit", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurve_CurveScheduleDatas(), this.getCurveData(), this.getCurveData_CurveSchedule(), "CurveScheduleDatas", null, 0, -1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_CurveStyle(), this.getCurveStyle(), "curveStyle", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurve_Y1Unit(), theDomainPackage.getUnitSymbol(), "y1Unit", null, 1, 1, Curve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSystemResourceEClass, PowerSystemResource.class, "PowerSystemResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSystemResource_Contains_Measurements(), theMeasPackage.getMeasurement(), theMeasPackage.getMeasurement_MemberOf_PSR(), "Contains_Measurements", null, 0, -1, PowerSystemResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicIntervalScheduleEClass, BasicIntervalSchedule.class, "BasicIntervalSchedule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicIntervalSchedule_StartTime(), ecorePackage.getEDate(), "startTime", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicIntervalSchedule_Value1Unit(), theDomainPackage.getUnitSymbol(), "value1Unit", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicIntervalSchedule_Value2Unit(), theDomainPackage.getUnitSymbol(), "value2Unit", null, 1, 1, BasicIntervalSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Initialize enums and add enum literals
		initEEnum(curveStyleEEnum, CurveStyle.class, "CurveStyle");
		addEEnumLiteral(curveStyleEEnum, CurveStyle.RAMP_YVALUE);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.FORMULA);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.CONSTANT_YVALUE);
		addEEnumLiteral(curveStyleEEnum, CurveStyle.STRAIGHT_LINE_YVALUES);

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
			 "Documentation", "Contains the core PowerSystemResource and ConductingEquipment entities shared by all applications plus common collections of those entities. Not all applications require all the Core entities."
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
	}

} //CorePackageImpl
