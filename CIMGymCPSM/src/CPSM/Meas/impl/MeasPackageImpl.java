/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

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

import CPSM.Meas.Analog;
import CPSM.Meas.AnalogValue;
import CPSM.Meas.Discrete;
import CPSM.Meas.DiscreteValue;
import CPSM.Meas.LimitSet;
import CPSM.Meas.MeasFactory;
import CPSM.Meas.MeasPackage;
import CPSM.Meas.Measurement;
import CPSM.Meas.MeasurementType;
import CPSM.Meas.MeasurementValue;
import CPSM.Meas.MeasurementValueSource;

import CPSM.OperationalLimits.OperationalLimitsPackage;

import CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl;

import CPSM.Topology.TopologyPackage;

import CPSM.Topology.impl.TopologyPackageImpl;

import CPSM.Wires.WiresPackage;

import CPSM.Wires.impl.WiresPackageImpl;

import CPSM.impl.CPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasPackageImpl extends EPackageImpl implements MeasPackage {
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
	 * @see CPSM.Meas.MeasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasPackageImpl() {
		super(eNS_URI, MeasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasPackage init() {
		if (isInited) return (MeasPackage)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI);

		// Obtain or create and register package
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theMeasPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theMeasPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasPackage.eNS_URI, theMeasPackage);
		return theMeasPackage;
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
	public MeasFactory getMeasFactory() {
		return (MeasFactory)getEFactoryInstance();
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		discreteValueEClass.getESuperTypes().add(this.getMeasurementValue());
		measurementEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		measurementValueEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		measurementValueSourceEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		analogEClass.getESuperTypes().add(this.getMeasurement());
		analogValueEClass.getESuperTypes().add(this.getMeasurementValue());
		measurementTypeEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		discreteEClass.getESuperTypes().add(this.getMeasurement());
		limitSetEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(discreteValueEClass, DiscreteValue.class, "DiscreteValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteValue_MemberOf_Measurement(), this.getDiscrete(), this.getDiscrete_Contain_MeasurementValues(), "MemberOf_Measurement", null, 1, 1, DiscreteValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_MemberOf_PSR(), theCorePackage.getPowerSystemResource(), theCorePackage.getPowerSystemResource_Contains_Measurements(), "MemberOf_PSR", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_MeasurementType(), this.getMeasurementType(), this.getMeasurementType_Measurements(), "MeasurementType", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Terminal(), theCorePackage.getTerminal(), theCorePackage.getTerminal_Measurements(), "Terminal", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Unit(), theCorePackage.getUnit(), theCorePackage.getUnit_Measurements(), "Unit", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "Documentation", "Contains entities that describe dynamic measurement data exchanged between applications."
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
	}

} //MeasPackageImpl
