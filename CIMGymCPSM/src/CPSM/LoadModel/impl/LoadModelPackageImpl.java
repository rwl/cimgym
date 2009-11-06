/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel.impl;

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

import CPSM.LoadModel.ConformLoad;
import CPSM.LoadModel.ConformLoadGroup;
import CPSM.LoadModel.ConformLoadSchedule;
import CPSM.LoadModel.CustomerLoad;
import CPSM.LoadModel.DayType;
import CPSM.LoadModel.EnergyArea;
import CPSM.LoadModel.InductionMotorLoad;
import CPSM.LoadModel.Load;
import CPSM.LoadModel.LoadArea;
import CPSM.LoadModel.LoadGroup;
import CPSM.LoadModel.LoadModelFactory;
import CPSM.LoadModel.LoadModelPackage;
import CPSM.LoadModel.LoadResponseCharacteristic;
import CPSM.LoadModel.NonConformLoad;
import CPSM.LoadModel.NonConformLoadGroup;
import CPSM.LoadModel.NonConformLoadSchedule;
import CPSM.LoadModel.Season;
import CPSM.LoadModel.SeasonDayTypeSchedule;
import CPSM.LoadModel.SeasonName;
import CPSM.LoadModel.StationSupply;
import CPSM.LoadModel.SubLoadArea;

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
public class LoadModelPackageImpl extends EPackageImpl implements LoadModelPackage {
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
	private EEnum seasonNameEEnum = null;

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
	 * @see CPSM.LoadModel.LoadModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoadModelPackageImpl() {
		super(eNS_URI, LoadModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LoadModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LoadModelPackage init() {
		if (isInited) return (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);

		// Obtain or create and register package
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LoadModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theLoadModelPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theLoadModelPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLoadModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoadModelPackage.eNS_URI, theLoadModelPackage);
		return theLoadModelPackage;
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
	public EEnum getSeasonName() {
		return seasonNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelFactory getLoadModelFactory() {
		return (LoadModelFactory)getEFactoryInstance();
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

		// Create enums
		seasonNameEEnum = createEEnum(SEASON_NAME);
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
		WiresPackage theWiresPackage = (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CPSMPackage theCPSMPackage = (CPSMPackage)EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nonConformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());
		conformLoadScheduleEClass.getESuperTypes().add(this.getSeasonDayTypeSchedule());
		customerLoadEClass.getESuperTypes().add(this.getConformLoad());
		nonConformLoadEClass.getESuperTypes().add(theWiresPackage.getEnergyConsumer());
		dayTypeEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		seasonEClass.getESuperTypes().add(theCPSMPackage.getElement());
		loadEClass.getESuperTypes().add(this.getConformLoad());
		stationSupplyEClass.getESuperTypes().add(theWiresPackage.getEnergyConsumer());
		seasonDayTypeScheduleEClass.getESuperTypes().add(theCorePackage.getRegularIntervalSchedule());
		loadGroupEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		energyAreaEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		conformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());
		loadAreaEClass.getESuperTypes().add(this.getEnergyArea());
		subLoadAreaEClass.getESuperTypes().add(this.getEnergyArea());
		loadResponseCharacteristicEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		nonConformLoadScheduleEClass.getESuperTypes().add(this.getSeasonDayTypeSchedule());
		inductionMotorLoadEClass.getESuperTypes().add(this.getNonConformLoad());
		conformLoadEClass.getESuperTypes().add(theWiresPackage.getEnergyConsumer());

		// Initialize classes and features; add operations and parameters
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
		initEReference(getEnergyArea_ControlArea(), theControlAreaPackage.getControlArea(), theControlAreaPackage.getControlArea_EnergyArea(), "ControlArea", null, 0, 1, EnergyArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getLoadResponseCharacteristic_EnergyConsumer(), theWiresPackage.getEnergyConsumer(), theWiresPackage.getEnergyConsumer_LoadResponse(), "EnergyConsumer", null, 0, -1, LoadResponseCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConformLoadScheduleEClass, NonConformLoadSchedule.class, "NonConformLoadSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonConformLoadSchedule_NonConformLoadGroup(), this.getNonConformLoadGroup(), this.getNonConformLoadGroup_NonConformLoadSchedules(), "NonConformLoadGroup", null, 1, 1, NonConformLoadSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductionMotorLoadEClass, InductionMotorLoad.class, "InductionMotorLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conformLoadEClass, ConformLoad.class, "ConformLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformLoad_LoadGroup(), this.getConformLoadGroup(), this.getConformLoadGroup_EnergyConsumers(), "LoadGroup", null, 1, 1, ConformLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(seasonNameEEnum, SeasonName.class, "SeasonName");
		addEEnumLiteral(seasonNameEEnum, SeasonName.FALL);
		addEEnumLiteral(seasonNameEEnum, SeasonName.WINTER);
		addEEnumLiteral(seasonNameEEnum, SeasonName.SPRING);
		addEEnumLiteral(seasonNameEEnum, SeasonName.SUMMER);

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
			 "Documentation", "This package is responsible for modeling the energy consumers and the system load as curves and associated curve data. Special circumstances that may affect the load, such as seasons and daytypes, are also included here.\n\nThis information is used by Load Forecasting and Load Management."
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
	}

} //LoadModelPackageImpl
