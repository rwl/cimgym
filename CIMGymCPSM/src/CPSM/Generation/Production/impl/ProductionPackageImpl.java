/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Generation.Production.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.CorePackage;

import CPSM.Core.impl.CorePackageImpl;

import CPSM.Domain.DomainPackage;

import CPSM.Domain.impl.DomainPackageImpl;

import CPSM.Equivalents.EquivalentsPackage;

import CPSM.Equivalents.impl.EquivalentsPackageImpl;

import CPSM.Generation.Production.GeneratingUnit;
import CPSM.Generation.Production.GeneratorControlSource;
import CPSM.Generation.Production.GrossToNetActivePowerCurve;
import CPSM.Generation.Production.HydroGeneratingUnit;
import CPSM.Generation.Production.ProductionFactory;
import CPSM.Generation.Production.ProductionPackage;
import CPSM.Generation.Production.ThermalGeneratingUnit;

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
public class ProductionPackageImpl extends EPackageImpl implements ProductionPackage {
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
	private EEnum generatorControlSourceEEnum = null;

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
	 * @see CPSM.Generation.Production.ProductionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductionPackageImpl() {
		super(eNS_URI, ProductionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductionPackage init() {
		if (isInited) return (ProductionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI);

		// Obtain or create and register package
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theProductionPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theProductionPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductionPackage.eNS_URI, theProductionPackage);
		return theProductionPackage;
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
	public EEnum getGeneratorControlSource() {
		return generatorControlSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionFactory getProductionFactory() {
		return (ProductionFactory)getEFactoryInstance();
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

		// Create enums
		generatorControlSourceEEnum = createEEnum(GENERATOR_CONTROL_SOURCE);
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
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		WiresPackage theWiresPackage = (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		grossToNetActivePowerCurveEClass.getESuperTypes().add(theCorePackage.getCurve());
		hydroGeneratingUnitEClass.getESuperTypes().add(this.getGeneratingUnit());
		thermalGeneratingUnitEClass.getESuperTypes().add(this.getGeneratingUnit());
		generatingUnitEClass.getESuperTypes().add(theCorePackage.getEquipment());

		// Initialize classes and features; add operations and parameters
		initEClass(grossToNetActivePowerCurveEClass, GrossToNetActivePowerCurve.class, "GrossToNetActivePowerCurve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrossToNetActivePowerCurve_GeneratingUnit(), this.getGeneratingUnit(), this.getGeneratingUnit_GrossToNetActivePowerCurves(), "GeneratingUnit", null, 1, 1, GrossToNetActivePowerCurve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hydroGeneratingUnitEClass, HydroGeneratingUnit.class, "HydroGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thermalGeneratingUnitEClass, ThermalGeneratingUnit.class, "ThermalGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatingUnitEClass, GeneratingUnit.class, "GeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratingUnit_MaxOperatingP(), theDomainPackage.getActivePower(), "maxOperatingP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_NormalPF(), ecorePackage.getEFloat(), "normalPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedGrossMaxP(), theDomainPackage.getActivePower(), "ratedGrossMaxP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedGrossMinP(), theDomainPackage.getActivePower(), "ratedGrossMinP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_GenControlSource(), this.getGeneratorControlSource(), "genControlSource", null, 0, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_RatedNetMaxP(), theDomainPackage.getActivePower(), "ratedNetMaxP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_LongPF(), ecorePackage.getEFloat(), "longPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_Contains_SynchronousMachines(), theWiresPackage.getSynchronousMachine(), theWiresPackage.getSynchronousMachine_MemberOf_GeneratingUnit(), "Contains_SynchronousMachines", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_GrossToNetActivePowerCurves(), this.getGrossToNetActivePowerCurve(), this.getGrossToNetActivePowerCurve_GeneratingUnit(), "GrossToNetActivePowerCurves", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_InitialP(), theDomainPackage.getActivePower(), "initialP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratingUnit_ControlAreaGeneratingUnit(), theControlAreaPackage.getControlAreaGeneratingUnit(), theControlAreaPackage.getControlAreaGeneratingUnit_GeneratingUnit(), "ControlAreaGeneratingUnit", null, 0, -1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_ShortPF(), ecorePackage.getEFloat(), "shortPF", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratingUnit_MinOperatingP(), theDomainPackage.getActivePower(), "minOperatingP", null, 1, 1, GeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(generatorControlSourceEEnum, GeneratorControlSource.class, "GeneratorControlSource");
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.OFF_AGC);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.UNAVAILABLE);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.ON_AGC);
		addEEnumLiteral(generatorControlSourceEEnum, GeneratorControlSource.PLANT_CONTROL);

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
			 "Documentation", "The production package is responsible for classes which describe various kinds of generators. These classes also provide production costing information which is used to economically allocate demand among committed units and calculate reserve quantities."
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
	}

} //ProductionPackageImpl
