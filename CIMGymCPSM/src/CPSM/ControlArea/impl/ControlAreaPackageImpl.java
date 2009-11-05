/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.ControlArea.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlArea;
import CPSM.ControlArea.ControlAreaFactory;
import CPSM.ControlArea.ControlAreaGeneratingUnit;
import CPSM.ControlArea.ControlAreaPackage;
import CPSM.ControlArea.ControlAreaTypeKind;
import CPSM.ControlArea.TieFlow;

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
public class ControlAreaPackageImpl extends EPackageImpl implements ControlAreaPackage {
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
	private EEnum controlAreaTypeKindEEnum = null;

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
	 * @see CPSM.ControlArea.ControlAreaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlAreaPackageImpl() {
		super(eNS_URI, ControlAreaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlAreaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlAreaPackage init() {
		if (isInited) return (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);

		// Obtain or create and register package
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlAreaPackageImpl());

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
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theControlAreaPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theEquivalentsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theControlAreaPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theEquivalentsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlAreaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlAreaPackage.eNS_URI, theControlAreaPackage);
		return theControlAreaPackage;
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
	public EEnum getControlAreaTypeKind() {
		return controlAreaTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaFactory getControlAreaFactory() {
		return (ControlAreaFactory)getEFactoryInstance();
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

		// Create enums
		controlAreaTypeKindEEnum = createEEnum(CONTROL_AREA_TYPE_KIND);
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
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);
		CPSMPackage theCPSMPackage = (CPSMPackage)EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI);
		ProductionPackage theProductionPackage = (ProductionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlAreaEClass.getESuperTypes().add(theCorePackage.getPowerSystemResource());
		tieFlowEClass.getESuperTypes().add(theCPSMPackage.getElement());
		controlAreaGeneratingUnitEClass.getESuperTypes().add(theCPSMPackage.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(controlAreaEClass, ControlArea.class, "ControlArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlArea_ControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit(), this.getControlAreaGeneratingUnit_ControlArea(), "ControlAreaGeneratingUnit", null, 0, -1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlArea_NetInterchange(), theDomainPackage.getActivePower(), "netInterchange", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlArea_EnergyArea(), theLoadModelPackage.getEnergyArea(), theLoadModelPackage.getEnergyArea_ControlArea(), "EnergyArea", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlArea_TieFlow(), this.getTieFlow(), this.getTieFlow_ControlArea(), "TieFlow", null, 0, -1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlArea_Type(), this.getControlAreaTypeKind(), "type", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tieFlowEClass, TieFlow.class, "TieFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTieFlow_ControlArea(), this.getControlArea(), this.getControlArea_TieFlow(), "ControlArea", null, 1, 1, TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTieFlow_PositiveFlowIn(), ecorePackage.getEBoolean(), "positiveFlowIn", null, 1, 1, TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlAreaGeneratingUnitEClass, ControlAreaGeneratingUnit.class, "ControlAreaGeneratingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlAreaGeneratingUnit_ControlArea(), this.getControlArea(), this.getControlArea_ControlAreaGeneratingUnit(), "ControlArea", null, 1, 1, ControlAreaGeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAreaGeneratingUnit_GeneratingUnit(), theProductionPackage.getGeneratingUnit(), theProductionPackage.getGeneratingUnit_ControlAreaGeneratingUnit(), "GeneratingUnit", null, 1, 1, ControlAreaGeneratingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(controlAreaTypeKindEEnum, ControlAreaTypeKind.class, "ControlAreaTypeKind");
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.FORECAST);
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.INTERCHANGE);
		addEEnumLiteral(controlAreaTypeKindEEnum, ControlAreaTypeKind.AGC);

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
	}

} //ControlAreaPackageImpl
