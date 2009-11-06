/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Equivalents.impl;

import CPSM.CPSMPackage;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.CorePackage;

import CPSM.Core.impl.CorePackageImpl;

import CPSM.Domain.DomainPackage;

import CPSM.Domain.impl.DomainPackageImpl;

import CPSM.Equivalents.EquivalentBranch;
import CPSM.Equivalents.EquivalentEquipment;
import CPSM.Equivalents.EquivalentNetwork;
import CPSM.Equivalents.EquivalentShunt;
import CPSM.Equivalents.EquivalentsFactory;
import CPSM.Equivalents.EquivalentsPackage;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EquivalentsPackageImpl extends EPackageImpl implements EquivalentsPackage {
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
	 * @see CPSM.Equivalents.EquivalentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EquivalentsPackageImpl() {
		super(eNS_URI, EquivalentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EquivalentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EquivalentsPackage init() {
		if (isInited) return (EquivalentsPackage)EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI);

		// Obtain or create and register package
		EquivalentsPackageImpl theEquivalentsPackage = (EquivalentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EquivalentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EquivalentsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CPSMPackageImpl theCPSMPackage = (CPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) instanceof CPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CPSMPackage.eNS_URI) : CPSMPackage.eINSTANCE);
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		OperationalLimitsPackageImpl theOperationalLimitsPackage = (OperationalLimitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		WiresPackageImpl theWiresPackage = (WiresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackageImpl theMeasPackage = (MeasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackageImpl theLoadModelPackage = (LoadModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ControlAreaPackageImpl theControlAreaPackage = (ControlAreaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		TopologyPackageImpl theTopologyPackage = (TopologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);

		// Create package meta-data objects
		theEquivalentsPackage.createPackageContents();
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
		theOperationalLimitsPackage.createPackageContents();
		theWiresPackage.createPackageContents();
		theMeasPackage.createPackageContents();
		theLoadModelPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theControlAreaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theTopologyPackage.createPackageContents();

		// Initialize created meta-data
		theEquivalentsPackage.initializePackageContents();
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
		theOperationalLimitsPackage.initializePackageContents();
		theWiresPackage.initializePackageContents();
		theMeasPackage.initializePackageContents();
		theLoadModelPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theControlAreaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theTopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEquivalentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EquivalentsPackage.eNS_URI, theEquivalentsPackage);
		return theEquivalentsPackage;
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
	public EquivalentsFactory getEquivalentsFactory() {
		return (EquivalentsFactory)getEFactoryInstance();
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
		equivalentNetworkEClass.getESuperTypes().add(theCorePackage.getConnectivityNodeContainer());
		equivalentShuntEClass.getESuperTypes().add(this.getEquivalentEquipment());
		equivalentEquipmentEClass.getESuperTypes().add(theCorePackage.getConductingEquipment());
		equivalentBranchEClass.getESuperTypes().add(this.getEquivalentEquipment());

		// Initialize classes and features; add operations and parameters
		initEClass(equivalentNetworkEClass, EquivalentNetwork.class, "EquivalentNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentNetwork_EquivalentEquipments(), this.getEquivalentEquipment(), this.getEquivalentEquipment_EquivalentNetwork(), "EquivalentEquipments", null, 0, -1, EquivalentNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentShuntEClass, EquivalentShunt.class, "EquivalentShunt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquivalentShunt_B(), theDomainPackage.getSusceptance(), "b", null, 1, 1, EquivalentShunt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquivalentShunt_G(), theDomainPackage.getConductance(), "g", null, 1, 1, EquivalentShunt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentEquipmentEClass, EquivalentEquipment.class, "EquivalentEquipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentEquipment_EquivalentNetwork(), this.getEquivalentNetwork(), this.getEquivalentNetwork_EquivalentEquipments(), "EquivalentNetwork", null, 1, 1, EquivalentEquipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentBranchEClass, EquivalentBranch.class, "EquivalentBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquivalentBranch_X(), theDomainPackage.getReactance(), "x", null, 1, 1, EquivalentBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquivalentBranch_R(), theDomainPackage.getResistance(), "r", null, 1, 1, EquivalentBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getEquivalentNetwork_EquivalentEquipments(), 
		   source, 
		   new String[] {
			 "Profile documentation", ""
		   });																	
	}

} //EquivalentsPackageImpl
