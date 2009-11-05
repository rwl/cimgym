/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Equivalents;

import CPSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CPSM.Equivalents.EquivalentsFactory
 * @model kind="package"
 * @generated
 */
public interface EquivalentsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Equivalents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Equivalents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EquivalentsPackage eINSTANCE = CPSM.Equivalents.impl.EquivalentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Equivalents.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Equivalents.impl.EquivalentNetworkImpl
	 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentNetwork()
	 * @generated
	 */
	int EQUIVALENT_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__URI = CorePackage.CONNECTIVITY_NODE_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__MODEL = CorePackage.CONNECTIVITY_NODE_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PATH_NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__DESCRIPTION = CorePackage.CONNECTIVITY_NODE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__ALIAS_NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__NAME = CorePackage.CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CONTAINS_MEASUREMENTS = CorePackage.CONNECTIVITY_NODE_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CONNECTIVITY_NODES = CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS = CorePackage.CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK_FEATURE_COUNT = CorePackage.CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Equivalents.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Equivalents.impl.EquivalentEquipmentImpl
	 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentEquipment()
	 * @generated
	 */
	int EQUIVALENT_EQUIPMENT = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Equivalents.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Equivalents.impl.EquivalentShuntImpl
	 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentShunt()
	 * @generated
	 */
	int EQUIVALENT_SHUNT = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__URI = EQUIVALENT_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__MODEL = EQUIVALENT_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__PATH_NAME = EQUIVALENT_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__DESCRIPTION = EQUIVALENT_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__ALIAS_NAME = EQUIVALENT_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__NAME = EQUIVALENT_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__CONTAINS_MEASUREMENTS = EQUIVALENT_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__MEMBER_OF_EQUIPMENT_CONTAINER = EQUIVALENT_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__OPERATIONAL_LIMIT_SET = EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__BASE_VOLTAGE = EQUIVALENT_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__TERMINALS = EQUIVALENT_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__EQUIVALENT_NETWORK = EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__B = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT__G = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Shunt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_SHUNT_FEATURE_COUNT = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.Equivalents.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Equivalents.impl.EquivalentBranchImpl
	 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentBranch()
	 * @generated
	 */
	int EQUIVALENT_BRANCH = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__URI = EQUIVALENT_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__MODEL = EQUIVALENT_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__PATH_NAME = EQUIVALENT_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__DESCRIPTION = EQUIVALENT_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__ALIAS_NAME = EQUIVALENT_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__NAME = EQUIVALENT_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__CONTAINS_MEASUREMENTS = EQUIVALENT_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__MEMBER_OF_EQUIPMENT_CONTAINER = EQUIVALENT_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__OPERATIONAL_LIMIT_SET = EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__BASE_VOLTAGE = EQUIVALENT_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__TERMINALS = EQUIVALENT_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__EQUIVALENT_NETWORK = EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__X = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH__R = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_BRANCH_FEATURE_COUNT = EQUIVALENT_EQUIPMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link CPSM.Equivalents.EquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Network</em>'.
	 * @see CPSM.Equivalents.EquivalentNetwork
	 * @generated
	 */
	EClass getEquivalentNetwork();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Equipments</em>'.
	 * @see CPSM.Equivalents.EquivalentNetwork#getEquivalentEquipments()
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	EReference getEquivalentNetwork_EquivalentEquipments();

	/**
	 * Returns the meta object for class '{@link CPSM.Equivalents.EquivalentShunt <em>Equivalent Shunt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Shunt</em>'.
	 * @see CPSM.Equivalents.EquivalentShunt
	 * @generated
	 */
	EClass getEquivalentShunt();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Equivalents.EquivalentShunt#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CPSM.Equivalents.EquivalentShunt#getB()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_B();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Equivalents.EquivalentShunt#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CPSM.Equivalents.EquivalentShunt#getG()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_G();

	/**
	 * Returns the meta object for class '{@link CPSM.Equivalents.EquivalentEquipment <em>Equivalent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Equipment</em>'.
	 * @see CPSM.Equivalents.EquivalentEquipment
	 * @generated
	 */
	EClass getEquivalentEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent Network</em>'.
	 * @see CPSM.Equivalents.EquivalentEquipment#getEquivalentNetwork()
	 * @see #getEquivalentEquipment()
	 * @generated
	 */
	EReference getEquivalentEquipment_EquivalentNetwork();

	/**
	 * Returns the meta object for class '{@link CPSM.Equivalents.EquivalentBranch <em>Equivalent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Branch</em>'.
	 * @see CPSM.Equivalents.EquivalentBranch
	 * @generated
	 */
	EClass getEquivalentBranch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Equivalents.EquivalentBranch#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.Equivalents.EquivalentBranch#getX()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Equivalents.EquivalentBranch#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.Equivalents.EquivalentBranch#getR()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_R();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EquivalentsFactory getEquivalentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CPSM.Equivalents.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Equivalents.impl.EquivalentNetworkImpl
		 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentNetwork()
		 * @generated
		 */
		EClass EQUIVALENT_NETWORK = eINSTANCE.getEquivalentNetwork();

		/**
		 * The meta object literal for the '<em><b>Equivalent Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS = eINSTANCE.getEquivalentNetwork_EquivalentEquipments();

		/**
		 * The meta object literal for the '{@link CPSM.Equivalents.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Equivalents.impl.EquivalentShuntImpl
		 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentShunt()
		 * @generated
		 */
		EClass EQUIVALENT_SHUNT = eINSTANCE.getEquivalentShunt();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_SHUNT__B = eINSTANCE.getEquivalentShunt_B();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_SHUNT__G = eINSTANCE.getEquivalentShunt_G();

		/**
		 * The meta object literal for the '{@link CPSM.Equivalents.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Equivalents.impl.EquivalentEquipmentImpl
		 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentEquipment()
		 * @generated
		 */
		EClass EQUIVALENT_EQUIPMENT = eINSTANCE.getEquivalentEquipment();

		/**
		 * The meta object literal for the '<em><b>Equivalent Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK = eINSTANCE.getEquivalentEquipment_EquivalentNetwork();

		/**
		 * The meta object literal for the '{@link CPSM.Equivalents.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Equivalents.impl.EquivalentBranchImpl
		 * @see CPSM.Equivalents.impl.EquivalentsPackageImpl#getEquivalentBranch()
		 * @generated
		 */
		EClass EQUIVALENT_BRANCH = eINSTANCE.getEquivalentBranch();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_BRANCH__X = eINSTANCE.getEquivalentBranch_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIVALENT_BRANCH__R = eINSTANCE.getEquivalentBranch_R();

	}

} //EquivalentsPackage
