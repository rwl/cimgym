/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import CPSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CPSM.Wires.WiresFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An extension to the Core and Topology package that models information on the electrical characteristics of Transmission and Distribution networks. This package is used by network applications such as State Estimation, Load Flow and Optimal Power Flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core and Topology package that models information on the electrical characteristics of Transmission and Distribution networks. This package is used by network applications such as State Estimation, Load Flow and Optimal Power Flow.'"
 * @generated
 */
public interface WiresPackage extends EPackage {
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
	String eNAME = "Wires";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Wires";

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
	WiresPackage eINSTANCE = CPSM.Wires.impl.WiresPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.PowerTransformerImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getPowerTransformer()
	 * @generated
	 */
	int POWER_TRANSFORMER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__URI = CorePackage.EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MODEL = CorePackage.EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CONTAINS_MEASUREMENTS = CorePackage.EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contains Transformer Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.SwitchImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NORMAL_OPEN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.DisconnectorImpl <em>Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.DisconnectorImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getDisconnector()
	 * @generated
	 */
	int DISCONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__URI = SWITCH__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__MODEL = SWITCH__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__CONTAINS_MEASUREMENTS = SWITCH__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__MEMBER_OF_EQUIPMENT_CONTAINER = SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The number of structural features of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.RegulatingCondEqImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulatingCondEq()
	 * @generated
	 */
	int REGULATING_COND_EQ = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__REGULATING_CONTROL = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.SynchronousMachineImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachine()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__URI = REGULATING_COND_EQ__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MODEL = REGULATING_COND_EQ__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__CONTAINS_MEASUREMENTS = REGULATING_COND_EQ__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MEMBER_OF_EQUIPMENT_CONTAINER = REGULATING_COND_EQ__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__OPERATING_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Of Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MIN_Q = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__TYPE = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE__MAX_Q = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Synchronous Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_MACHINE_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.BusbarSectionImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getBusbarSection()
	 * @generated
	 */
	int BUSBAR_SECTION = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The number of structural features of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.ShuntCompensatorImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getShuntCompensator()
	 * @generated
	 */
	int SHUNT_COMPENSATOR = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__URI = REGULATING_COND_EQ__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MODEL = REGULATING_COND_EQ__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__CONTAINS_MEASUREMENTS = REGULATING_COND_EQ__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MEMBER_OF_EQUIPMENT_CONTAINER = REGULATING_COND_EQ__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NORMAL_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__NOM_U = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shunt Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUNT_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.LoadBreakSwitchImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getLoadBreakSwitch()
	 * @generated
	 */
	int LOAD_BREAK_SWITCH = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__URI = SWITCH__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__MODEL = SWITCH__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__CONTAINS_MEASUREMENTS = SWITCH__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER = SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH__RATED_CURRENT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Break Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BREAK_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.EnergyConsumerImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOAD_RESPONSE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.TransformerWindingImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getTransformerWinding()
	 * @generated
	 */
	int TRANSFORMER_WINDING = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Winding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__WINDING_TYPE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tap Changers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TAP_CHANGERS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Of Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_S = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__B = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.RegulatingControlImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulatingControl()
	 * @generated
	 */
	int REGULATING_CONTROL = 9;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__URI = CorePackage.POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MODEL = CorePackage.POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__CONTAINS_MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TERMINAL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATION_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TAP_CHANGER = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATING_COND_EQ = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.RegulationScheduleImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulationSchedule()
	 * @generated
	 */
	int REGULATION_SCHEDULE = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__URI = CorePackage.REGULAR_INTERVAL_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__MODEL = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__REGULATING_CONTROL = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.ConductorImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 13;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BCH = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.ACLineSegmentImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getACLineSegment()
	 * @generated
	 */
	int AC_LINE_SEGMENT = 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__URI = CONDUCTOR__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__MODEL = CONDUCTOR__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__PATH_NAME = CONDUCTOR__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__DESCRIPTION = CONDUCTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__ALIAS_NAME = CONDUCTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__NAME = CONDUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__CONTAINS_MEASUREMENTS = CONDUCTOR__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTOR__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__OPERATIONAL_LIMIT_SET = CONDUCTOR__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__BASE_VOLTAGE = CONDUCTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__TERMINALS = CONDUCTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__R = CONDUCTOR__R;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__X = CONDUCTOR__X;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT__BCH = CONDUCTOR__BCH;

	/**
	 * The number of structural features of the '<em>AC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_LINE_SEGMENT_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.ReactiveCapabilityCurveImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getReactiveCapabilityCurve()
	 * @generated
	 */
	int REACTIVE_CAPABILITY_CURVE = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__URI = CorePackage.CURVE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__MODEL = CorePackage.CURVE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_SCHEDULE_DATAS = CorePackage.CURVE__CURVE_SCHEDULE_DATAS;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Initially Used By Synchronous Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.TapChangerImpl <em>Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.TapChangerImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getTapChanger()
	 * @generated
	 */
	int TAP_CHANGER = 15;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__URI = CorePackage.POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__MODEL = CorePackage.POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__CONTAINS_MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__REGULATING_CONTROL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TRANSFORMER_WINDING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NORMAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__HIGH_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LOW_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TCUL_CONTROL_MODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__STEP_VOLTAGE_INCREMENT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_U = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.LineImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 16;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__URI = CorePackage.EQUIPMENT_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MODEL = CorePackage.EQUIPMENT_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PATH_NAME = CorePackage.EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DESCRIPTION = CorePackage.EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINS_MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINS_EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REGION = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.StaticVarCompensatorImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getStaticVarCompensator()
	 * @generated
	 */
	int STATIC_VAR_COMPENSATOR = 17;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__URI = REGULATING_COND_EQ__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__MODEL = REGULATING_COND_EQ__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__PATH_NAME = REGULATING_COND_EQ__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__DESCRIPTION = REGULATING_COND_EQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CONTAINS_MEASUREMENTS = REGULATING_COND_EQ__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__MEMBER_OF_EQUIPMENT_CONTAINER = REGULATING_COND_EQ__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__OPERATIONAL_LIMIT_SET = REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SVC Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__SLOPE = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Static Var Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_VAR_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.SeriesCompensatorImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSeriesCompensator()
	 * @generated
	 */
	int SERIES_COMPENSATOR = 18;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__URI = CorePackage.CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MODEL = CorePackage.CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PATH_NAME = CorePackage.CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__DESCRIPTION = CorePackage.CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CONTAINS_MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OPERATIONAL_LIMIT_SET = CorePackage.CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.Wires.impl.BreakerImpl <em>Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.impl.BreakerImpl
	 * @see CPSM.Wires.impl.WiresPackageImpl#getBreaker()
	 * @generated
	 */
	int BREAKER = 19;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__URI = SWITCH__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__MODEL = SWITCH__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__PATH_NAME = SWITCH__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__DESCRIPTION = SWITCH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__CONTAINS_MEASUREMENTS = SWITCH__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__MEMBER_OF_EQUIPMENT_CONTAINER = SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__OPERATIONAL_LIMIT_SET = SWITCH__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__RATED_CURRENT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.SynchronousMachineOperatingMode
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachineOperatingMode()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_OPERATING_MODE = 20;

	/**
	 * The meta object id for the '{@link CPSM.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.TapChangerKind
	 * @see CPSM.Wires.impl.WiresPackageImpl#getTapChangerKind()
	 * @generated
	 */
	int TAP_CHANGER_KIND = 21;

	/**
	 * The meta object id for the '{@link CPSM.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.SVCControlMode
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSVCControlMode()
	 * @generated
	 */
	int SVC_CONTROL_MODE = 22;

	/**
	 * The meta object id for the '{@link CPSM.Wires.WindingType <em>Winding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.WindingType
	 * @see CPSM.Wires.impl.WiresPackageImpl#getWindingType()
	 * @generated
	 */
	int WINDING_TYPE = 23;

	/**
	 * The meta object id for the '{@link CPSM.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.SynchronousMachineType
	 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachineType()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_TYPE = 24;

	/**
	 * The meta object id for the '{@link CPSM.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Wires.TransformerControlMode
	 * @see CPSM.Wires.impl.WiresPackageImpl#getTransformerControlMode()
	 * @generated
	 */
	int TRANSFORMER_CONTROL_MODE = 25;


	/**
	 * Returns the meta object for class '{@link CPSM.Wires.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer</em>'.
	 * @see CPSM.Wires.PowerTransformer
	 * @generated
	 */
	EClass getPowerTransformer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.PowerTransformer#getContains_TransformerWindings <em>Contains Transformer Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Transformer Windings</em>'.
	 * @see CPSM.Wires.PowerTransformer#getContains_TransformerWindings()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EReference getPowerTransformer_Contains_TransformerWindings();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnector</em>'.
	 * @see CPSM.Wires.Disconnector
	 * @generated
	 */
	EClass getDisconnector();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Machine</em>'.
	 * @see CPSM.Wires.SynchronousMachine
	 * @generated
	 */
	EClass getSynchronousMachine();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Reactive Capability Curve</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_InitialReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getOperatingMode()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_OperatingMode();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.SynchronousMachine#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Generating Unit</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getMemberOf_GeneratingUnit()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_MemberOf_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getMinQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MinQ();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SynchronousMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_Type();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see CPSM.Wires.SynchronousMachine#getMaxQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MaxQ();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busbar Section</em>'.
	 * @see CPSM.Wires.BusbarSection
	 * @generated
	 */
	EClass getBusbarSection();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator</em>'.
	 * @see CPSM.Wires.ShuntCompensator
	 * @generated
	 */
	EClass getShuntCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Sections</em>'.
	 * @see CPSM.Wires.ShuntCompensator#getMaximumSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_MaximumSections();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Sections</em>'.
	 * @see CPSM.Wires.ShuntCompensator#getNormalSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NormalSections();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.ShuntCompensator#getNomU <em>Nom U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom U</em>'.
	 * @see CPSM.Wires.ShuntCompensator#getNomU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NomU();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Per Section</em>'.
	 * @see CPSM.Wires.ShuntCompensator#getReactivePerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_ReactivePerSection();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Break Switch</em>'.
	 * @see CPSM.Wires.LoadBreakSwitch
	 * @generated
	 */
	EClass getLoadBreakSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CPSM.Wires.LoadBreakSwitch#getRatedCurrent()
	 * @see #getLoadBreakSwitch()
	 * @generated
	 */
	EAttribute getLoadBreakSwitch_RatedCurrent();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Cond Eq</em>'.
	 * @see CPSM.Wires.RegulatingCondEq
	 * @generated
	 */
	EClass getRegulatingCondEq();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CPSM.Wires.RegulatingCondEq#getRegulatingControl()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	EReference getRegulatingCondEq_RegulatingControl();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see CPSM.Wires.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed Pct</em>'.
	 * @see CPSM.Wires.EnergyConsumer#getQfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_QfixedPct();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed</em>'.
	 * @see CPSM.Wires.EnergyConsumer#getPfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Pfixed();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Response</em>'.
	 * @see CPSM.Wires.EnergyConsumer#getLoadResponse()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_LoadResponse();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed</em>'.
	 * @see CPSM.Wires.EnergyConsumer#getQfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Qfixed();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed Pct</em>'.
	 * @see CPSM.Wires.EnergyConsumer#getPfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_PfixedPct();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.TransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Winding</em>'.
	 * @see CPSM.Wires.TransformerWinding
	 * @generated
	 */
	EClass getTransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getWindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Type</em>'.
	 * @see CPSM.Wires.TransformerWinding#getWindingType()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_WindingType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.TransformerWinding#getTapChangers <em>Tap Changers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changers</em>'.
	 * @see CPSM.Wires.TransformerWinding#getTapChangers()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_TapChangers();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.TransformerWinding#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Power Transformer</em>'.
	 * @see CPSM.Wires.TransformerWinding#getMemberOf_PowerTransformer()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_MemberOf_PowerTransformer();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CPSM.Wires.TransformerWinding#getRatedS()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedS();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.Wires.TransformerWinding#getX()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CPSM.Wires.TransformerWinding#getRatedU()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedU();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.Wires.TransformerWinding#getR()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TransformerWinding#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CPSM.Wires.TransformerWinding#getB()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_B();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Control</em>'.
	 * @see CPSM.Wires.RegulatingControl
	 * @generated
	 */
	EClass getRegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CPSM.Wires.RegulatingControl#getTerminal()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_Terminal();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulation Schedule</em>'.
	 * @see CPSM.Wires.RegulatingControl#getRegulationSchedule()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulationSchedule();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.RegulatingControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changer</em>'.
	 * @see CPSM.Wires.RegulatingControl#getTapChanger()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_TapChanger();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Cond Eq</em>'.
	 * @see CPSM.Wires.RegulatingControl#getRegulatingCondEq()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulatingCondEq();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation Schedule</em>'.
	 * @see CPSM.Wires.RegulationSchedule
	 * @generated
	 */
	EClass getRegulationSchedule();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see CPSM.Wires.RegulationSchedule#getRegulatingControl()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EReference getRegulationSchedule_RegulatingControl();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC Line Segment</em>'.
	 * @see CPSM.Wires.ACLineSegment
	 * @generated
	 */
	EClass getACLineSegment();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see CPSM.Wires.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.Switch#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see CPSM.Wires.Switch#isNormalOpen()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_NormalOpen();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see CPSM.Wires.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.Conductor#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.Wires.Conductor#getR()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.Conductor#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.Wires.Conductor#getX()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.Conductor#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see CPSM.Wires.Conductor#getBch()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Bch();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Capability Curve</em>'.
	 * @see CPSM.Wires.ReactiveCapabilityCurve
	 * @generated
	 */
	EClass getReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine <em>Initially Used By Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initially Used By Synchronous Machine</em>'.
	 * @see CPSM.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer</em>'.
	 * @see CPSM.Wires.TapChanger
	 * @generated
	 */
	EClass getTapChanger();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CPSM.Wires.TapChanger#getRegulatingControl()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_RegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.TapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Winding</em>'.
	 * @see CPSM.Wires.TapChanger#getTransformerWinding()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getNormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Step</em>'.
	 * @see CPSM.Wires.TapChanger#getNormalStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NormalStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see CPSM.Wires.TapChanger#getHighStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_HighStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Shift Increment</em>'.
	 * @see CPSM.Wires.TapChanger#getStepPhaseShiftIncrement()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_StepPhaseShiftIncrement();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see CPSM.Wires.TapChanger#getNeutralStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see CPSM.Wires.TapChanger#getLowStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_LowStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getTculControlMode <em>Tcul Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcul Control Mode</em>'.
	 * @see CPSM.Wires.TapChanger#getTculControlMode()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_TculControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see CPSM.Wires.TapChanger#getStepVoltageIncrement()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_StepVoltageIncrement();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.Wires.TapChanger#getType()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_Type();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.TapChanger#getNeutralU <em>Neutral U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral U</em>'.
	 * @see CPSM.Wires.TapChanger#getNeutralU()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralU();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see CPSM.Wires.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.Wires.Line#getRegion()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Region();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Var Compensator</em>'.
	 * @see CPSM.Wires.StaticVarCompensator
	 * @generated
	 */
	EClass getStaticVarCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Set Point</em>'.
	 * @see CPSM.Wires.StaticVarCompensator#getVoltageSetPoint()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_VoltageSetPoint();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SVC Control Mode</em>'.
	 * @see CPSM.Wires.StaticVarCompensator#getSVCControlMode()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_SVCControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see CPSM.Wires.StaticVarCompensator#getCapacitiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_CapacitiveRating();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.StaticVarCompensator#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see CPSM.Wires.StaticVarCompensator#getSlope()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_Slope();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see CPSM.Wires.StaticVarCompensator#getInductiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_InductiveRating();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Compensator</em>'.
	 * @see CPSM.Wires.SeriesCompensator
	 * @generated
	 */
	EClass getSeriesCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SeriesCompensator#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.Wires.SeriesCompensator#getR()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.SeriesCompensator#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.Wires.SeriesCompensator#getX()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_X();

	/**
	 * Returns the meta object for class '{@link CPSM.Wires.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker</em>'.
	 * @see CPSM.Wires.Breaker
	 * @generated
	 */
	EClass getBreaker();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Wires.Breaker#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CPSM.Wires.Breaker#getRatedCurrent()
	 * @see #getBreaker()
	 * @generated
	 */
	EAttribute getBreaker_RatedCurrent();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Operating Mode</em>'.
	 * @see CPSM.Wires.SynchronousMachineOperatingMode
	 * @generated
	 */
	EEnum getSynchronousMachineOperatingMode();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.TapChangerKind <em>Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tap Changer Kind</em>'.
	 * @see CPSM.Wires.TapChangerKind
	 * @generated
	 */
	EEnum getTapChangerKind();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.SVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVC Control Mode</em>'.
	 * @see CPSM.Wires.SVCControlMode
	 * @generated
	 */
	EEnum getSVCControlMode();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.WindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Type</em>'.
	 * @see CPSM.Wires.WindingType
	 * @generated
	 */
	EEnum getWindingType();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Type</em>'.
	 * @see CPSM.Wires.SynchronousMachineType
	 * @generated
	 */
	EEnum getSynchronousMachineType();

	/**
	 * Returns the meta object for enum '{@link CPSM.Wires.TransformerControlMode <em>Transformer Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Control Mode</em>'.
	 * @see CPSM.Wires.TransformerControlMode
	 * @generated
	 */
	EEnum getTransformerControlMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiresFactory getWiresFactory();

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
		 * The meta object literal for the '{@link CPSM.Wires.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.PowerTransformerImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getPowerTransformer()
		 * @generated
		 */
		EClass POWER_TRANSFORMER = eINSTANCE.getPowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Contains Transformer Windings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS = eINSTANCE.getPowerTransformer_Contains_TransformerWindings();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.DisconnectorImpl <em>Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.DisconnectorImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getDisconnector()
		 * @generated
		 */
		EClass DISCONNECTOR = eINSTANCE.getDisconnector();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.SynchronousMachineImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachine()
		 * @generated
		 */
		EClass SYNCHRONOUS_MACHINE = eINSTANCE.getSynchronousMachine();

		/**
		 * The meta object literal for the '<em><b>Initial Reactive Capability Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = eINSTANCE.getSynchronousMachine_InitialReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__OPERATING_MODE = eINSTANCE.getSynchronousMachine_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Member Of Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT = eINSTANCE.getSynchronousMachine_MemberOf_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Min Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MIN_Q = eINSTANCE.getSynchronousMachine_MinQ();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__TYPE = eINSTANCE.getSynchronousMachine_Type();

		/**
		 * The meta object literal for the '<em><b>Max Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONOUS_MACHINE__MAX_Q = eINSTANCE.getSynchronousMachine_MaxQ();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.BusbarSectionImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getBusbarSection()
		 * @generated
		 */
		EClass BUSBAR_SECTION = eINSTANCE.getBusbarSection();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.ShuntCompensatorImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getShuntCompensator()
		 * @generated
		 */
		EClass SHUNT_COMPENSATOR = eINSTANCE.getShuntCompensator();

		/**
		 * The meta object literal for the '<em><b>Maximum Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = eINSTANCE.getShuntCompensator_MaximumSections();

		/**
		 * The meta object literal for the '<em><b>Normal Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__NORMAL_SECTIONS = eINSTANCE.getShuntCompensator_NormalSections();

		/**
		 * The meta object literal for the '<em><b>Nom U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__NOM_U = eINSTANCE.getShuntCompensator_NomU();

		/**
		 * The meta object literal for the '<em><b>Reactive Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = eINSTANCE.getShuntCompensator_ReactivePerSection();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.LoadBreakSwitchImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getLoadBreakSwitch()
		 * @generated
		 */
		EClass LOAD_BREAK_SWITCH = eINSTANCE.getLoadBreakSwitch();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BREAK_SWITCH__RATED_CURRENT = eINSTANCE.getLoadBreakSwitch_RatedCurrent();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.RegulatingCondEqImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulatingCondEq()
		 * @generated
		 */
		EClass REGULATING_COND_EQ = eINSTANCE.getRegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_COND_EQ__REGULATING_CONTROL = eINSTANCE.getRegulatingCondEq_RegulatingControl();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.EnergyConsumerImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getEnergyConsumer()
		 * @generated
		 */
		EClass ENERGY_CONSUMER = eINSTANCE.getEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Qfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__QFIXED_PCT = eINSTANCE.getEnergyConsumer_QfixedPct();

		/**
		 * The meta object literal for the '<em><b>Pfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__PFIXED = eINSTANCE.getEnergyConsumer_Pfixed();

		/**
		 * The meta object literal for the '<em><b>Load Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER__LOAD_RESPONSE = eINSTANCE.getEnergyConsumer_LoadResponse();

		/**
		 * The meta object literal for the '<em><b>Qfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__QFIXED = eINSTANCE.getEnergyConsumer_Qfixed();

		/**
		 * The meta object literal for the '<em><b>Pfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__PFIXED_PCT = eINSTANCE.getEnergyConsumer_PfixedPct();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.TransformerWindingImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getTransformerWinding()
		 * @generated
		 */
		EClass TRANSFORMER_WINDING = eINSTANCE.getTransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Winding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__WINDING_TYPE = eINSTANCE.getTransformerWinding_WindingType();

		/**
		 * The meta object literal for the '<em><b>Tap Changers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__TAP_CHANGERS = eINSTANCE.getTransformerWinding_TapChangers();

		/**
		 * The meta object literal for the '<em><b>Member Of Power Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER = eINSTANCE.getTransformerWinding_MemberOf_PowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__RATED_S = eINSTANCE.getTransformerWinding_RatedS();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__X = eINSTANCE.getTransformerWinding_X();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__RATED_U = eINSTANCE.getTransformerWinding_RatedU();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__R = eINSTANCE.getTransformerWinding_R();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_WINDING__B = eINSTANCE.getTransformerWinding_B();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.RegulatingControlImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulatingControl()
		 * @generated
		 */
		EClass REGULATING_CONTROL = eINSTANCE.getRegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__TERMINAL = eINSTANCE.getRegulatingControl_Terminal();

		/**
		 * The meta object literal for the '<em><b>Regulation Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__REGULATION_SCHEDULE = eINSTANCE.getRegulatingControl_RegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__TAP_CHANGER = eINSTANCE.getRegulatingControl_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Regulating Cond Eq</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATING_CONTROL__REGULATING_COND_EQ = eINSTANCE.getRegulatingControl_RegulatingCondEq();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.RegulationScheduleImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getRegulationSchedule()
		 * @generated
		 */
		EClass REGULATION_SCHEDULE = eINSTANCE.getRegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATION_SCHEDULE__REGULATING_CONTROL = eINSTANCE.getRegulationSchedule_RegulatingControl();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.ACLineSegmentImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getACLineSegment()
		 * @generated
		 */
		EClass AC_LINE_SEGMENT = eINSTANCE.getACLineSegment();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.SwitchImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Normal Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__NORMAL_OPEN = eINSTANCE.getSwitch_NormalOpen();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.ConductorImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getConductor()
		 * @generated
		 */
		EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__R = eINSTANCE.getConductor_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__X = eINSTANCE.getConductor_X();

		/**
		 * The meta object literal for the '<em><b>Bch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__BCH = eINSTANCE.getConductor_Bch();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.ReactiveCapabilityCurveImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getReactiveCapabilityCurve()
		 * @generated
		 */
		EClass REACTIVE_CAPABILITY_CURVE = eINSTANCE.getReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>Initially Used By Synchronous Machine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE = eINSTANCE.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.TapChangerImpl <em>Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.TapChangerImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getTapChanger()
		 * @generated
		 */
		EClass TAP_CHANGER = eINSTANCE.getTapChanger();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__REGULATING_CONTROL = eINSTANCE.getTapChanger_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Transformer Winding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAP_CHANGER__TRANSFORMER_WINDING = eINSTANCE.getTapChanger_TransformerWinding();

		/**
		 * The meta object literal for the '<em><b>Normal Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NORMAL_STEP = eINSTANCE.getTapChanger_NormalStep();

		/**
		 * The meta object literal for the '<em><b>High Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__HIGH_STEP = eINSTANCE.getTapChanger_HighStep();

		/**
		 * The meta object literal for the '<em><b>Step Phase Shift Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT = eINSTANCE.getTapChanger_StepPhaseShiftIncrement();

		/**
		 * The meta object literal for the '<em><b>Neutral Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NEUTRAL_STEP = eINSTANCE.getTapChanger_NeutralStep();

		/**
		 * The meta object literal for the '<em><b>Low Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__LOW_STEP = eINSTANCE.getTapChanger_LowStep();

		/**
		 * The meta object literal for the '<em><b>Tcul Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__TCUL_CONTROL_MODE = eINSTANCE.getTapChanger_TculControlMode();

		/**
		 * The meta object literal for the '<em><b>Step Voltage Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__STEP_VOLTAGE_INCREMENT = eINSTANCE.getTapChanger_StepVoltageIncrement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__TYPE = eINSTANCE.getTapChanger_Type();

		/**
		 * The meta object literal for the '<em><b>Neutral U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAP_CHANGER__NEUTRAL_U = eINSTANCE.getTapChanger_NeutralU();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.LineImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__REGION = eINSTANCE.getLine_Region();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.StaticVarCompensatorImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getStaticVarCompensator()
		 * @generated
		 */
		EClass STATIC_VAR_COMPENSATOR = eINSTANCE.getStaticVarCompensator();

		/**
		 * The meta object literal for the '<em><b>Voltage Set Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = eINSTANCE.getStaticVarCompensator_VoltageSetPoint();

		/**
		 * The meta object literal for the '<em><b>SVC Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = eINSTANCE.getStaticVarCompensator_SVCControlMode();

		/**
		 * The meta object literal for the '<em><b>Capacitive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = eINSTANCE.getStaticVarCompensator_CapacitiveRating();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__SLOPE = eINSTANCE.getStaticVarCompensator_Slope();

		/**
		 * The meta object literal for the '<em><b>Inductive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = eINSTANCE.getStaticVarCompensator_InductiveRating();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.SeriesCompensatorImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSeriesCompensator()
		 * @generated
		 */
		EClass SERIES_COMPENSATOR = eINSTANCE.getSeriesCompensator();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_COMPENSATOR__R = eINSTANCE.getSeriesCompensator_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_COMPENSATOR__X = eINSTANCE.getSeriesCompensator_X();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.impl.BreakerImpl <em>Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.impl.BreakerImpl
		 * @see CPSM.Wires.impl.WiresPackageImpl#getBreaker()
		 * @generated
		 */
		EClass BREAKER = eINSTANCE.getBreaker();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKER__RATED_CURRENT = eINSTANCE.getBreaker_RatedCurrent();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.SynchronousMachineOperatingMode
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachineOperatingMode()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_OPERATING_MODE = eINSTANCE.getSynchronousMachineOperatingMode();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.TapChangerKind
		 * @see CPSM.Wires.impl.WiresPackageImpl#getTapChangerKind()
		 * @generated
		 */
		EEnum TAP_CHANGER_KIND = eINSTANCE.getTapChangerKind();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.SVCControlMode
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSVCControlMode()
		 * @generated
		 */
		EEnum SVC_CONTROL_MODE = eINSTANCE.getSVCControlMode();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.WindingType <em>Winding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.WindingType
		 * @see CPSM.Wires.impl.WiresPackageImpl#getWindingType()
		 * @generated
		 */
		EEnum WINDING_TYPE = eINSTANCE.getWindingType();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.SynchronousMachineType
		 * @see CPSM.Wires.impl.WiresPackageImpl#getSynchronousMachineType()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_TYPE = eINSTANCE.getSynchronousMachineType();

		/**
		 * The meta object literal for the '{@link CPSM.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Wires.TransformerControlMode
		 * @see CPSM.Wires.impl.WiresPackageImpl#getTransformerControlMode()
		 * @generated
		 */
		EEnum TRANSFORMER_CONTROL_MODE = eINSTANCE.getTransformerControlMode();

	}

} //WiresPackage
