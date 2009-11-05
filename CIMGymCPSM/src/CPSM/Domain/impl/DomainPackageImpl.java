/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Domain.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.CorePackage;

import CPSM.Core.impl.CorePackageImpl;

import CPSM.Domain.DomainFactory;
import CPSM.Domain.DomainPackage;
import CPSM.Domain.UnitSymbol;

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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
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
	 * @see CPSM.Domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
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
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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

		// Create enums
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

		// Initialize enums and add enum literals
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

		// Create annotations
		// http://iec.ch/TC57/2008/CIM-schema-cim13#
		createCIMschemacim13Annotations();
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
			 "Documentation", "The domain package is a data dictionary of quantities and units that define datatypes for attributes (properties) that may be used by any class in any other package.\n\nThis package contains the definition of primitive datatypes, including units of measure and permissible values. Each datatype contains a value attribute and an optional unit of measure, which is specified as a static variable initialized to the textual description of the unit of measure. The value of the \"units\" string may be country or customer specific. Typical values are given. Permissible values for enumerations are listed in the documentation for the attribute using UML constraint syntax inside curly braces. Lengths of variable strings are listed in the descriptive text where required."
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

} //DomainPackageImpl
