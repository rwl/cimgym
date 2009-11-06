/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMFactory;
import CPSM.CPSMPackage;
import CPSM.CommonPowerSystemModel;

import CPSM.ControlArea.ControlAreaPackage;

import CPSM.ControlArea.impl.ControlAreaPackageImpl;

import CPSM.Core.CorePackage;

import CPSM.Core.impl.CorePackageImpl;

import CPSM.Domain.DomainPackage;

import CPSM.Domain.impl.DomainPackageImpl;

import CPSM.Element;

import CPSM.Equivalents.EquivalentsPackage;

import CPSM.Equivalents.impl.EquivalentsPackageImpl;

import CPSM.Generation.Production.ProductionPackage;

import CPSM.Generation.Production.impl.ProductionPackageImpl;

import CPSM.IEC61970CIMVersion;

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
public class CPSMPackageImpl extends EPackageImpl implements CPSMPackage {
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

		// Obtain or create and register interdependencies
		ProductionPackageImpl theProductionPackage = (ProductionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
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
		theCPSMPackage.createPackageContents();
		theProductionPackage.createPackageContents();
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
		theCPSMPackage.initializePackageContents();
		theProductionPackage.initializePackageContents();
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
		ProductionPackage theProductionPackage = (ProductionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI);
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI);
		WiresPackage theWiresPackage = (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);
		MeasPackage theMeasPackage = (MeasPackage)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI);
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);
		EquivalentsPackage theEquivalentsPackage = (EquivalentsPackage)EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theProductionPackage);
		getESubpackages().add(theOperationalLimitsPackage);
		getESubpackages().add(theWiresPackage);
		getESubpackages().add(theMeasPackage);
		getESubpackages().add(theLoadModelPackage);
		getESubpackages().add(theEquivalentsPackage);
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theControlAreaPackage);
		getESubpackages().add(theDomainPackage);
		getESubpackages().add(theTopologyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iec61970CIMVersionEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Model(), this.getCommonPowerSystemModel(), this.getCommonPowerSystemModel_Elements(), "Model", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iec61970CIMVersionEClass, IEC61970CIMVersion.class, "IEC61970CIMVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEC61970CIMVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1, IEC61970CIMVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEC61970CIMVersion_Date(), ecorePackage.getEDate(), "date", null, 1, 1, IEC61970CIMVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonPowerSystemModelEClass, CommonPowerSystemModel.class, "CommonPowerSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonPowerSystemModel_Elements(), this.getElement(), this.getElement_Model(), "Elements", null, 0, -1, CommonPowerSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://iec.ch/TC57/2008/CIM-schema-cim13#
		createCIMschemacim13Annotations();
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
	}

} //CPSMPackageImpl
