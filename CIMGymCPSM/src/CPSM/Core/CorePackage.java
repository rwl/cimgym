/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.CPSMPackage;

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
 * @see CPSM.Core.CoreFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Contains the core PowerSystemResource and ConductingEquipment entities shared by all applications plus common collections of those entities. Not all applications require all the Core entities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains the core PowerSystemResource and ConductingEquipment entities shared by all applications plus common collections of those entities. Not all applications require all the Core entities.'"
 * @generated
 */
public interface CorePackage extends EPackage {
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
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Core";

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
	CorePackage eINSTANCE = CPSM.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.IdentifiedObjectImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getIdentifiedObject()
	 * @generated
	 */
	int IDENTIFIED_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__PATH_NAME = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__DESCRIPTION = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__ALIAS_NAME = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__NAME = CPSMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.TerminalImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REGULATING_CONTROL = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONNECTIVITY_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.BaseVoltageImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getBaseVoltage()
	 * @generated
	 */
	int BASE_VOLTAGE = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__NOMINAL_VOLTAGE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE__VOLTAGE_LEVEL = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_VOLTAGE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.BasicIntervalScheduleImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getBasicIntervalSchedule()
	 * @generated
	 */
	int BASIC_INTERVAL_SCHEDULE = 15;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__START_TIME = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.RegularIntervalScheduleImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getRegularIntervalSchedule()
	 * @generated
	 */
	int REGULAR_INTERVAL_SCHEDULE = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__URI = BASIC_INTERVAL_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__MODEL = BASIC_INTERVAL_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__PATH_NAME = BASIC_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__DESCRIPTION = BASIC_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME = BASIC_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__NAME = BASIC_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__START_TIME = BASIC_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__END_TIME = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE__TIME_STEP = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Regular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.PowerSystemResourceImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.ConnectivityNodeContainerImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getConnectivityNodeContainer()
	 * @generated
	 */
	int CONNECTIVITY_NODE_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__URI = POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__MODEL = POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__CONTAINS_MEASUREMENTS = POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connectivity Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.UnitImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.EquipmentContainerImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getEquipmentContainer()
	 * @generated
	 */
	int EQUIPMENT_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__URI = CONNECTIVITY_NODE_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__MODEL = CONNECTIVITY_NODE_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__PATH_NAME = CONNECTIVITY_NODE_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__DESCRIPTION = CONNECTIVITY_NODE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__ALIAS_NAME = CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__NAME = CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS = CONNECTIVITY_NODE_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CONNECTIVITY_NODES = CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_CONTAINER_FEATURE_COUNT = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.VoltageLevelImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getVoltageLevel()
	 * @generated
	 */
	int VOLTAGE_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__URI = EQUIPMENT_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__MODEL = EQUIPMENT_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CONTAINS_MEASUREMENTS = EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CONTAINS_EQUIPMENTS = EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__BASE_VOLTAGE = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains Bays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL__CONTAINS_BAYS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LEVEL_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.BayImpl <em>Bay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.BayImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getBay()
	 * @generated
	 */
	int BAY = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__URI = EQUIPMENT_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__MODEL = EQUIPMENT_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CONTAINS_MEASUREMENTS = EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__CONTAINS_EQUIPMENTS = EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Voltage Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY__MEMBER_OF_VOLTAGE_LEVEL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAY_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.SubGeographicalRegionImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getSubGeographicalRegion()
	 * @generated
	 */
	int SUB_GEOGRAPHICAL_REGION = 9;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__REGION = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__LINES = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.RegularTimePointImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getRegularTimePoint()
	 * @generated
	 */
	int REGULAR_TIME_POINT = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE1 = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__SEQUENCE_NUMBER = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE2 = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__INTERVAL_SCHEDULE = CPSMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.EquipmentImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__URI = POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MODEL = POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CONTAINS_MEASUREMENTS = POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__OPERATIONAL_LIMIT_SET = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.SubstationImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__URI = EQUIPMENT_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MODEL = EQUIPMENT_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CONTAINS_MEASUREMENTS = EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CONTAINS_EQUIPMENTS = EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__REGION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Voltage Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__CONTAINS_VOLTAGE_LEVELS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.CurveImpl <em>Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.CurveImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getCurve()
	 * @generated
	 */
	int CURVE = 13;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__XUNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__CURVE_SCHEDULE_DATAS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__CURVE_STYLE = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__Y1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.CurveDataImpl <em>Curve Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.CurveDataImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getCurveData()
	 * @generated
	 */
	int CURVE_DATA = 16;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y2VALUE = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__XVALUE = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y1VALUE = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Curve Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__CURVE_SCHEDULE = CPSMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.GeographicalRegionImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getGeographicalRegion()
	 * @generated
	 */
	int GEOGRAPHICAL_REGION = 17;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION__REGIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Core.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.impl.ConductingEquipmentImpl
	 * @see CPSM.Core.impl.CorePackageImpl#getConductingEquipment()
	 * @generated
	 */
	int CONDUCTING_EQUIPMENT = 18;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__URI = EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__MODEL = EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__PATH_NAME = EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__DESCRIPTION = EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__ALIAS_NAME = EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS = EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER = EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET = EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__BASE_VOLTAGE = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__TERMINALS = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.Core.CurveStyle <em>Curve Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Core.CurveStyle
	 * @see CPSM.Core.impl.CorePackageImpl#getCurveStyle()
	 * @generated
	 */
	int CURVE_STYLE = 19;


	/**
	 * Returns the meta object for class '{@link CPSM.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Object</em>'.
	 * @see CPSM.Core.IdentifiedObject
	 * @generated
	 */
	EClass getIdentifiedObject();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.IdentifiedObject#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see CPSM.Core.IdentifiedObject#getPathName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_PathName();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.IdentifiedObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CPSM.Core.IdentifiedObject#getDescription()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see CPSM.Core.IdentifiedObject#getAliasName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_AliasName();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.IdentifiedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPSM.Core.IdentifiedObject#getName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Name();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see CPSM.Core.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.Core.Terminal#getMeasurements()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see CPSM.Core.Terminal#getRegulatingControl()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_RegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see CPSM.Core.Terminal#getConnectivityNode()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConnectivityNode();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CPSM.Core.Terminal#getConductingEquipment()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConductingEquipment();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.BaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Voltage</em>'.
	 * @see CPSM.Core.BaseVoltage
	 * @generated
	 */
	EClass getBaseVoltage();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see CPSM.Core.BaseVoltage#getNominalVoltage()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EAttribute getBaseVoltage_NominalVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment</em>'.
	 * @see CPSM.Core.BaseVoltage#getConductingEquipment()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_ConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Level</em>'.
	 * @see CPSM.Core.BaseVoltage#getVoltageLevel()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_VoltageLevel();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Interval Schedule</em>'.
	 * @see CPSM.Core.RegularIntervalSchedule
	 * @generated
	 */
	EClass getRegularIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see CPSM.Core.RegularIntervalSchedule#getEndTime()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_EndTime();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CPSM.Core.RegularIntervalSchedule#getTimePoints()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EReference getRegularIntervalSchedule_TimePoints();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Step</em>'.
	 * @see CPSM.Core.RegularIntervalSchedule#getTimeStep()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_TimeStep();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node Container</em>'.
	 * @see CPSM.Core.ConnectivityNodeContainer
	 * @generated
	 */
	EClass getConnectivityNodeContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see CPSM.Core.ConnectivityNodeContainer#getConnectivityNodes()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	EReference getConnectivityNodeContainer_ConnectivityNodes();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see CPSM.Core.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Unit#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.Core.Unit#getMeasurements()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Container</em>'.
	 * @see CPSM.Core.EquipmentContainer
	 * @generated
	 */
	EClass getEquipmentContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.EquipmentContainer#getContains_Equipments <em>Contains Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Equipments</em>'.
	 * @see CPSM.Core.EquipmentContainer#getContains_Equipments()
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	EReference getEquipmentContainer_Contains_Equipments();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Level</em>'.
	 * @see CPSM.Core.VoltageLevel
	 * @generated
	 */
	EClass getVoltageLevel();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.VoltageLevel#getMemberOf_Substation <em>Member Of Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Substation</em>'.
	 * @see CPSM.Core.VoltageLevel#getMemberOf_Substation()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_MemberOf_Substation();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Limit</em>'.
	 * @see CPSM.Core.VoltageLevel#getLowVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_LowVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Limit</em>'.
	 * @see CPSM.Core.VoltageLevel#getHighVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_HighVoltageLimit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CPSM.Core.VoltageLevel#getBaseVoltage()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_BaseVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.VoltageLevel#getContains_Bays <em>Contains Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Bays</em>'.
	 * @see CPSM.Core.VoltageLevel#getContains_Bays()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_Contains_Bays();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Bay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay</em>'.
	 * @see CPSM.Core.Bay
	 * @generated
	 */
	EClass getBay();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.Bay#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Voltage Level</em>'.
	 * @see CPSM.Core.Bay#getMemberOf_VoltageLevel()
	 * @see #getBay()
	 * @generated
	 */
	EReference getBay_MemberOf_VoltageLevel();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Geographical Region</em>'.
	 * @see CPSM.Core.SubGeographicalRegion
	 * @generated
	 */
	EClass getSubGeographicalRegion();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.Core.SubGeographicalRegion#getRegion()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Region();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see CPSM.Core.SubGeographicalRegion#getLines()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Lines();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substations</em>'.
	 * @see CPSM.Core.SubGeographicalRegion#getSubstations()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Substations();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.RegularTimePoint <em>Regular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Time Point</em>'.
	 * @see CPSM.Core.RegularTimePoint
	 * @generated
	 */
	EClass getRegularTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.RegularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see CPSM.Core.RegularTimePoint#getValue1()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value1();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CPSM.Core.RegularTimePoint#getSequenceNumber()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.RegularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see CPSM.Core.RegularTimePoint#getValue2()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value2();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see CPSM.Core.RegularTimePoint#getIntervalSchedule()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EReference getRegularTimePoint_IntervalSchedule();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CPSM.Core.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.Equipment#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Equipment Container</em>'.
	 * @see CPSM.Core.Equipment#getMemberOf_EquipmentContainer()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_MemberOf_EquipmentContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Set</em>'.
	 * @see CPSM.Core.Equipment#getOperationalLimitSet()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_OperationalLimitSet();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see CPSM.Core.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.Core.Substation#getRegion()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Region();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Substation#getContains_VoltageLevels <em>Contains Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Voltage Levels</em>'.
	 * @see CPSM.Core.Substation#getContains_VoltageLevels()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Contains_VoltageLevels();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve</em>'.
	 * @see CPSM.Core.Curve
	 * @generated
	 */
	EClass getCurve();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.Curve#getY2Unit <em>Y2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Unit</em>'.
	 * @see CPSM.Core.Curve#getY2Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y2Unit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.Curve#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see CPSM.Core.Curve#getXUnit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_XUnit();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.Curve#getCurveScheduleDatas <em>Curve Schedule Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curve Schedule Datas</em>'.
	 * @see CPSM.Core.Curve#getCurveScheduleDatas()
	 * @see #getCurve()
	 * @generated
	 */
	EReference getCurve_CurveScheduleDatas();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.Curve#getCurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Style</em>'.
	 * @see CPSM.Core.Curve#getCurveStyle()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_CurveStyle();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.Curve#getY1Unit <em>Y1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Unit</em>'.
	 * @see CPSM.Core.Curve#getY1Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y1Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see CPSM.Core.PowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.PowerSystemResource#getContains_Measurements <em>Contains Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Measurements</em>'.
	 * @see CPSM.Core.PowerSystemResource#getContains_Measurements()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_Contains_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Interval Schedule</em>'.
	 * @see CPSM.Core.BasicIntervalSchedule
	 * @generated
	 */
	EClass getBasicIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see CPSM.Core.BasicIntervalSchedule#getStartTime()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Unit</em>'.
	 * @see CPSM.Core.BasicIntervalSchedule#getValue1Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value1Unit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Unit</em>'.
	 * @see CPSM.Core.BasicIntervalSchedule#getValue2Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value2Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.CurveData <em>Curve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Data</em>'.
	 * @see CPSM.Core.CurveData
	 * @generated
	 */
	EClass getCurveData();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.CurveData#getY2value <em>Y2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2value</em>'.
	 * @see CPSM.Core.CurveData#getY2value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y2value();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.CurveData#getXvalue <em>Xvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvalue</em>'.
	 * @see CPSM.Core.CurveData#getXvalue()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Xvalue();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Core.CurveData#getY1value <em>Y1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1value</em>'.
	 * @see CPSM.Core.CurveData#getY1value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y1value();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.CurveData#getCurveSchedule <em>Curve Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curve Schedule</em>'.
	 * @see CPSM.Core.CurveData#getCurveSchedule()
	 * @see #getCurveData()
	 * @generated
	 */
	EReference getCurveData_CurveSchedule();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Region</em>'.
	 * @see CPSM.Core.GeographicalRegion
	 * @generated
	 */
	EClass getGeographicalRegion();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see CPSM.Core.GeographicalRegion#getRegions()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EReference getGeographicalRegion_Regions();

	/**
	 * Returns the meta object for class '{@link CPSM.Core.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conducting Equipment</em>'.
	 * @see CPSM.Core.ConductingEquipment
	 * @generated
	 */
	EClass getConductingEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CPSM.Core.ConductingEquipment#getBaseVoltage()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_BaseVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Core.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see CPSM.Core.ConductingEquipment#getTerminals()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_Terminals();

	/**
	 * Returns the meta object for enum '{@link CPSM.Core.CurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Curve Style</em>'.
	 * @see CPSM.Core.CurveStyle
	 * @generated
	 */
	EEnum getCurveStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link CPSM.Core.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.IdentifiedObjectImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getIdentifiedObject()
		 * @generated
		 */
		EClass IDENTIFIED_OBJECT = eINSTANCE.getIdentifiedObject();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__PATH_NAME = eINSTANCE.getIdentifiedObject_PathName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__DESCRIPTION = eINSTANCE.getIdentifiedObject_Description();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__ALIAS_NAME = eINSTANCE.getIdentifiedObject_AliasName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_OBJECT__NAME = eINSTANCE.getIdentifiedObject_Name();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.TerminalImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__MEASUREMENTS = eINSTANCE.getTerminal_Measurements();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__REGULATING_CONTROL = eINSTANCE.getTerminal_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__CONNECTIVITY_NODE = eINSTANCE.getTerminal_ConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__CONDUCTING_EQUIPMENT = eINSTANCE.getTerminal_ConductingEquipment();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.BaseVoltageImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getBaseVoltage()
		 * @generated
		 */
		EClass BASE_VOLTAGE = eINSTANCE.getBaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_VOLTAGE__NOMINAL_VOLTAGE = eINSTANCE.getBaseVoltage_NominalVoltage();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VOLTAGE__CONDUCTING_EQUIPMENT = eINSTANCE.getBaseVoltage_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Voltage Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_VOLTAGE__VOLTAGE_LEVEL = eINSTANCE.getBaseVoltage_VoltageLevel();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.RegularIntervalScheduleImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getRegularIntervalSchedule()
		 * @generated
		 */
		EClass REGULAR_INTERVAL_SCHEDULE = eINSTANCE.getRegularIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_INTERVAL_SCHEDULE__END_TIME = eINSTANCE.getRegularIntervalSchedule_EndTime();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = eINSTANCE.getRegularIntervalSchedule_TimePoints();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_INTERVAL_SCHEDULE__TIME_STEP = eINSTANCE.getRegularIntervalSchedule_TimeStep();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.ConnectivityNodeContainerImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getConnectivityNodeContainer()
		 * @generated
		 */
		EClass CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Connectivity Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = eINSTANCE.getConnectivityNodeContainer_ConnectivityNodes();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.UnitImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__MEASUREMENTS = eINSTANCE.getUnit_Measurements();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.EquipmentContainerImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getEquipmentContainer()
		 * @generated
		 */
		EClass EQUIPMENT_CONTAINER = eINSTANCE.getEquipmentContainer();

		/**
		 * The meta object literal for the '<em><b>Contains Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS = eINSTANCE.getEquipmentContainer_Contains_Equipments();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.VoltageLevelImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getVoltageLevel()
		 * @generated
		 */
		EClass VOLTAGE_LEVEL = eINSTANCE.getVoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Member Of Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION = eINSTANCE.getVoltageLevel_MemberOf_Substation();

		/**
		 * The meta object literal for the '<em><b>Low Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_LowVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>High Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_HighVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__BASE_VOLTAGE = eINSTANCE.getVoltageLevel_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Contains Bays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLTAGE_LEVEL__CONTAINS_BAYS = eINSTANCE.getVoltageLevel_Contains_Bays();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.BayImpl <em>Bay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.BayImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getBay()
		 * @generated
		 */
		EClass BAY = eINSTANCE.getBay();

		/**
		 * The meta object literal for the '<em><b>Member Of Voltage Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAY__MEMBER_OF_VOLTAGE_LEVEL = eINSTANCE.getBay_MemberOf_VoltageLevel();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.SubGeographicalRegionImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getSubGeographicalRegion()
		 * @generated
		 */
		EClass SUB_GEOGRAPHICAL_REGION = eINSTANCE.getSubGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__REGION = eINSTANCE.getSubGeographicalRegion_Region();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__LINES = eINSTANCE.getSubGeographicalRegion_Lines();

		/**
		 * The meta object literal for the '<em><b>Substations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = eINSTANCE.getSubGeographicalRegion_Substations();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.RegularTimePointImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getRegularTimePoint()
		 * @generated
		 */
		EClass REGULAR_TIME_POINT = eINSTANCE.getRegularTimePoint();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__VALUE1 = eINSTANCE.getRegularTimePoint_Value1();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__SEQUENCE_NUMBER = eINSTANCE.getRegularTimePoint_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_TIME_POINT__VALUE2 = eINSTANCE.getRegularTimePoint_Value2();

		/**
		 * The meta object literal for the '<em><b>Interval Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_TIME_POINT__INTERVAL_SCHEDULE = eINSTANCE.getRegularTimePoint_IntervalSchedule();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.EquipmentImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Member Of Equipment Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER = eINSTANCE.getEquipment_MemberOf_EquipmentContainer();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__OPERATIONAL_LIMIT_SET = eINSTANCE.getEquipment_OperationalLimitSet();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.SubstationImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getSubstation()
		 * @generated
		 */
		EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__REGION = eINSTANCE.getSubstation_Region();

		/**
		 * The meta object literal for the '<em><b>Contains Voltage Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__CONTAINS_VOLTAGE_LEVELS = eINSTANCE.getSubstation_Contains_VoltageLevels();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.CurveImpl <em>Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.CurveImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getCurve()
		 * @generated
		 */
		EClass CURVE = eINSTANCE.getCurve();

		/**
		 * The meta object literal for the '<em><b>Y2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y2_UNIT = eINSTANCE.getCurve_Y2Unit();

		/**
		 * The meta object literal for the '<em><b>XUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__XUNIT = eINSTANCE.getCurve_XUnit();

		/**
		 * The meta object literal for the '<em><b>Curve Schedule Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURVE__CURVE_SCHEDULE_DATAS = eINSTANCE.getCurve_CurveScheduleDatas();

		/**
		 * The meta object literal for the '<em><b>Curve Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__CURVE_STYLE = eINSTANCE.getCurve_CurveStyle();

		/**
		 * The meta object literal for the '<em><b>Y1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__Y1_UNIT = eINSTANCE.getCurve_Y1Unit();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.PowerSystemResourceImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getPowerSystemResource()
		 * @generated
		 */
		EClass POWER_SYSTEM_RESOURCE = eINSTANCE.getPowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Contains Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS = eINSTANCE.getPowerSystemResource_Contains_Measurements();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.BasicIntervalScheduleImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getBasicIntervalSchedule()
		 * @generated
		 */
		EClass BASIC_INTERVAL_SCHEDULE = eINSTANCE.getBasicIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__START_TIME = eINSTANCE.getBasicIntervalSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>Value1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = eINSTANCE.getBasicIntervalSchedule_Value1Unit();

		/**
		 * The meta object literal for the '<em><b>Value2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = eINSTANCE.getBasicIntervalSchedule_Value2Unit();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.CurveDataImpl <em>Curve Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.CurveDataImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getCurveData()
		 * @generated
		 */
		EClass CURVE_DATA = eINSTANCE.getCurveData();

		/**
		 * The meta object literal for the '<em><b>Y2value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__Y2VALUE = eINSTANCE.getCurveData_Y2value();

		/**
		 * The meta object literal for the '<em><b>Xvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__XVALUE = eINSTANCE.getCurveData_Xvalue();

		/**
		 * The meta object literal for the '<em><b>Y1value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_DATA__Y1VALUE = eINSTANCE.getCurveData_Y1value();

		/**
		 * The meta object literal for the '<em><b>Curve Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURVE_DATA__CURVE_SCHEDULE = eINSTANCE.getCurveData_CurveSchedule();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.GeographicalRegionImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getGeographicalRegion()
		 * @generated
		 */
		EClass GEOGRAPHICAL_REGION = eINSTANCE.getGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHICAL_REGION__REGIONS = eINSTANCE.getGeographicalRegion_Regions();

		/**
		 * The meta object literal for the '{@link CPSM.Core.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.impl.ConductingEquipmentImpl
		 * @see CPSM.Core.impl.CorePackageImpl#getConductingEquipment()
		 * @generated
		 */
		EClass CONDUCTING_EQUIPMENT = eINSTANCE.getConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__BASE_VOLTAGE = eINSTANCE.getConductingEquipment_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__TERMINALS = eINSTANCE.getConductingEquipment_Terminals();

		/**
		 * The meta object literal for the '{@link CPSM.Core.CurveStyle <em>Curve Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Core.CurveStyle
		 * @see CPSM.Core.impl.CorePackageImpl#getCurveStyle()
		 * @generated
		 */
		EEnum CURVE_STYLE = eINSTANCE.getCurveStyle();

	}

} //CorePackage
