/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits.impl;

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

import CPSM.OperationalLimits.ActivePowerLimit;
import CPSM.OperationalLimits.ApparentPowerLimit;
import CPSM.OperationalLimits.CurrentLimit;
import CPSM.OperationalLimits.OperationalLimit;
import CPSM.OperationalLimits.OperationalLimitSet;
import CPSM.OperationalLimits.OperationalLimitsFactory;
import CPSM.OperationalLimits.OperationalLimitsPackage;
import CPSM.OperationalLimits.VoltageLimit;

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
public class OperationalLimitsPackageImpl extends EPackageImpl implements OperationalLimitsPackage {
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
	 * @see CPSM.OperationalLimits.OperationalLimitsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationalLimitsPackageImpl() {
		super(eNS_URI, OperationalLimitsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OperationalLimitsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationalLimitsPackage init() {
		if (isInited) return (OperationalLimitsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI);

		// Obtain or create and register package
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationalLimitsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theOperationalLimitsPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theOperationalLimitsPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationalLimitsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationalLimitsPackage.eNS_URI, theOperationalLimitsPackage);
		return theOperationalLimitsPackage;
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
	public OperationalLimitsFactory getOperationalLimitsFactory() {
		return (OperationalLimitsFactory)getEFactoryInstance();
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationalLimitEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		operationalLimitSetEClass.getESuperTypes().add(theCorePackage.getIdentifiedObject());
		activePowerLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		apparentPowerLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		voltageLimitEClass.getESuperTypes().add(this.getOperationalLimit());
		currentLimitEClass.getESuperTypes().add(this.getOperationalLimit());

		// Initialize classes and features; add operations and parameters
		initEClass(operationalLimitEClass, OperationalLimit.class, "OperationalLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalLimit_OperationalLimitSet(), this.getOperationalLimitSet(), this.getOperationalLimitSet_OperationalLimitValue(), "OperationalLimitSet", null, 1, 1, OperationalLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationalLimit_Type(), ecorePackage.getEString(), "type", null, 1, 1, OperationalLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalLimitSetEClass, OperationalLimitSet.class, "OperationalLimitSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalLimitSet_Equipment(), theCorePackage.getEquipment(), theCorePackage.getEquipment_OperationalLimitSet(), "Equipment", null, 1, 1, OperationalLimitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalLimitSet_OperationalLimitValue(), this.getOperationalLimit(), this.getOperationalLimit_OperationalLimitSet(), "OperationalLimitValue", null, 0, -1, OperationalLimitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activePowerLimitEClass, ActivePowerLimit.class, "ActivePowerLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivePowerLimit_Value(), theDomainPackage.getActivePower(), "value", null, 1, 1, ActivePowerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apparentPowerLimitEClass, ApparentPowerLimit.class, "ApparentPowerLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApparentPowerLimit_Value(), theDomainPackage.getApparentPower(), "value", null, 1, 1, ApparentPowerLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageLimitEClass, VoltageLimit.class, "VoltageLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoltageLimit_Value(), theDomainPackage.getVoltage(), "value", null, 1, 1, VoltageLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentLimitEClass, CurrentLimit.class, "CurrentLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentLimit_Value(), theDomainPackage.getCurrentFlow(), "value", null, 1, 1, CurrentLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "Documentation", "The specificatoin of limits associated with equipment and other operational entities."
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
		  (getOperationalLimitSet_OperationalLimitValue(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																	
	}

} //OperationalLimitsPackageImpl
