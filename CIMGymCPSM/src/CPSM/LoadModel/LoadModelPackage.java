/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import CPSM.CPSMPackage;

import CPSM.Core.CorePackage;

import CPSM.Wires.WiresPackage;

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
 * @see CPSM.LoadModel.LoadModelFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='This package is responsible for modeling the energy consumers and the system load as curves and associated curve data. Special circumstances that may affect the load, such as seasons and daytypes, are also included here.\n\nThis information is used by Load Forecasting and Load Management.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is responsible for modeling the energy consumers and the system load as curves and associated curve data. Special circumstances that may affect the load, such as seasons and daytypes, are also included here.\n\nThis information is used by Load Forecasting and Load Management.'"
 * @generated
 */
public interface LoadModelPackage extends EPackage {
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
	String eNAME = "LoadModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_LoadModel";

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
	LoadModelPackage eINSTANCE = CPSM.LoadModel.impl.LoadModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.LoadGroupImpl <em>Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.LoadGroupImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadGroup()
	 * @generated
	 */
	int LOAD_GROUP = 9;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__SUB_LOAD_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.NonConformLoadGroupImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__URI = LOAD_GROUP__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__MODEL = LOAD_GROUP__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__PATH_NAME = LOAD_GROUP__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__DESCRIPTION = LOAD_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Non Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.SeasonDayTypeScheduleImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeasonDayTypeSchedule()
	 * @generated
	 */
	int SEASON_DAY_TYPE_SCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__URI = CorePackage.REGULAR_INTERVAL_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__MODEL = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__PATH_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION = CorePackage.REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__SEASON = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.ConformLoadScheduleImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoadSchedule()
	 * @generated
	 */
	int CONFORM_LOAD_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__URI = SEASON_DAY_TYPE_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__MODEL = SEASON_DAY_TYPE_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__PATH_NAME = SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__DESCRIPTION = SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.ConformLoadImpl <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.ConformLoadImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoad()
	 * @generated
	 */
	int CONFORM_LOAD = 17;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__URI = WiresPackage.ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MODEL = WiresPackage.ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CONTAINS_MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.CustomerLoadImpl <em>Customer Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.CustomerLoadImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getCustomerLoad()
	 * @generated
	 */
	int CUSTOMER_LOAD = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__URI = CONFORM_LOAD__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__MODEL = CONFORM_LOAD__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__PATH_NAME = CONFORM_LOAD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__DESCRIPTION = CONFORM_LOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__ALIAS_NAME = CONFORM_LOAD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__NAME = CONFORM_LOAD__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__CONTAINS_MEASUREMENTS = CONFORM_LOAD__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__OPERATIONAL_LIMIT_SET = CONFORM_LOAD__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__BASE_VOLTAGE = CONFORM_LOAD__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__TERMINALS = CONFORM_LOAD__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__QFIXED_PCT = CONFORM_LOAD__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__PFIXED = CONFORM_LOAD__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__LOAD_RESPONSE = CONFORM_LOAD__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__QFIXED = CONFORM_LOAD__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__PFIXED_PCT = CONFORM_LOAD__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD__LOAD_GROUP = CONFORM_LOAD__LOAD_GROUP;

	/**
	 * The number of structural features of the '<em>Customer Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_LOAD_FEATURE_COUNT = CONFORM_LOAD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.NonConformLoadImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoad()
	 * @generated
	 */
	int NON_CONFORM_LOAD = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__URI = WiresPackage.ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MODEL = WiresPackage.ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CONTAINS_MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.DayTypeImpl <em>Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.DayTypeImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.SeasonImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_DATE = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_DATE = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__SEASON_DAY_TYPE_SCHEDULES = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = CPSMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.LoadImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__URI = CONFORM_LOAD__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__MODEL = CONFORM_LOAD__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__PATH_NAME = CONFORM_LOAD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DESCRIPTION = CONFORM_LOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ALIAS_NAME = CONFORM_LOAD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__NAME = CONFORM_LOAD__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__CONTAINS_MEASUREMENTS = CONFORM_LOAD__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__OPERATIONAL_LIMIT_SET = CONFORM_LOAD__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__BASE_VOLTAGE = CONFORM_LOAD__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__TERMINALS = CONFORM_LOAD__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__QFIXED_PCT = CONFORM_LOAD__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__PFIXED = CONFORM_LOAD__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__LOAD_RESPONSE = CONFORM_LOAD__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__QFIXED = CONFORM_LOAD__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__PFIXED_PCT = CONFORM_LOAD__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__LOAD_GROUP = CONFORM_LOAD__LOAD_GROUP;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = CONFORM_LOAD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.StationSupplyImpl <em>Station Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.StationSupplyImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getStationSupply()
	 * @generated
	 */
	int STATION_SUPPLY = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__URI = WiresPackage.ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MODEL = WiresPackage.ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PATH_NAME = WiresPackage.ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__DESCRIPTION = WiresPackage.ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CONTAINS_MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MEMBER_OF_EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OPERATIONAL_LIMIT_SET = WiresPackage.ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The number of structural features of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.EnergyAreaImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getEnergyArea()
	 * @generated
	 */
	int ENERGY_AREA = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__CONTROL_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.ConformLoadGroupImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP = 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__URI = LOAD_GROUP__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__MODEL = LOAD_GROUP__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__PATH_NAME = LOAD_GROUP__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__DESCRIPTION = LOAD_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.LoadAreaImpl <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.LoadAreaImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadArea()
	 * @generated
	 */
	int LOAD_AREA = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__URI = ENERGY_AREA__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__MODEL = ENERGY_AREA__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__PATH_NAME = ENERGY_AREA__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__DESCRIPTION = ENERGY_AREA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Sub Load Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__SUB_LOAD_AREAS = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.SubLoadAreaImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA = 13;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__URI = ENERGY_AREA__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__MODEL = ENERGY_AREA__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__PATH_NAME = ENERGY_AREA__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__DESCRIPTION = ENERGY_AREA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Load Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOAD_GROUPS = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOAD_AREA = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.LoadResponseCharacteristicImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadResponseCharacteristic()
	 * @generated
	 */
	int LOAD_RESPONSE_CHARACTERISTIC = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.NonConformLoadScheduleImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadSchedule()
	 * @generated
	 */
	int NON_CONFORM_LOAD_SCHEDULE = 15;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__URI = SEASON_DAY_TYPE_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__MODEL = SEASON_DAY_TYPE_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__PATH_NAME = SEASON_DAY_TYPE_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__DESCRIPTION = SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Non Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.impl.InductionMotorLoadImpl <em>Induction Motor Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.impl.InductionMotorLoadImpl
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getInductionMotorLoad()
	 * @generated
	 */
	int INDUCTION_MOTOR_LOAD = 16;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__URI = NON_CONFORM_LOAD__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__MODEL = NON_CONFORM_LOAD__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__PATH_NAME = NON_CONFORM_LOAD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__DESCRIPTION = NON_CONFORM_LOAD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__ALIAS_NAME = NON_CONFORM_LOAD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__NAME = NON_CONFORM_LOAD__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__CONTAINS_MEASUREMENTS = NON_CONFORM_LOAD__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = NON_CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__OPERATIONAL_LIMIT_SET = NON_CONFORM_LOAD__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__BASE_VOLTAGE = NON_CONFORM_LOAD__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__TERMINALS = NON_CONFORM_LOAD__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__QFIXED_PCT = NON_CONFORM_LOAD__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__PFIXED = NON_CONFORM_LOAD__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__LOAD_RESPONSE = NON_CONFORM_LOAD__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__QFIXED = NON_CONFORM_LOAD__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__PFIXED_PCT = NON_CONFORM_LOAD__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD__LOAD_GROUP = NON_CONFORM_LOAD__LOAD_GROUP;

	/**
	 * The number of structural features of the '<em>Induction Motor Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTION_MOTOR_LOAD_FEATURE_COUNT = NON_CONFORM_LOAD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.LoadModel.SeasonName <em>Season Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.LoadModel.SeasonName
	 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeasonName()
	 * @generated
	 */
	int SEASON_NAME = 18;


	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see CPSM.LoadModel.NonConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Conform Load Schedules</em>'.
	 * @see CPSM.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_NonConformLoadSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CPSM.LoadModel.NonConformLoadGroup#getEnergyConsumers()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Schedule</em>'.
	 * @see CPSM.LoadModel.ConformLoadSchedule
	 * @generated
	 */
	EClass getConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conform Load Group</em>'.
	 * @see CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup()
	 * @see #getConformLoadSchedule()
	 * @generated
	 */
	EReference getConformLoadSchedule_ConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.CustomerLoad <em>Customer Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Load</em>'.
	 * @see CPSM.LoadModel.CustomerLoad
	 * @generated
	 */
	EClass getCustomerLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see CPSM.LoadModel.NonConformLoad
	 * @generated
	 */
	EClass getNonConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CPSM.LoadModel.NonConformLoad#getLoadGroup()
	 * @see #getNonConformLoad()
	 * @generated
	 */
	EReference getNonConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Type</em>'.
	 * @see CPSM.LoadModel.DayType
	 * @generated
	 */
	EClass getDayType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CPSM.LoadModel.DayType#getSeasonDayTypeSchedules()
	 * @see #getDayType()
	 * @generated
	 */
	EReference getDayType_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see CPSM.LoadModel.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see CPSM.LoadModel.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see CPSM.LoadModel.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_StartDate();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CPSM.LoadModel.Season#getSeasonDayTypeSchedules()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPSM.LoadModel.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see CPSM.LoadModel.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Supply</em>'.
	 * @see CPSM.LoadModel.StationSupply
	 * @generated
	 */
	EClass getStationSupply();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season Day Type Schedule</em>'.
	 * @see CPSM.LoadModel.SeasonDayTypeSchedule
	 * @generated
	 */
	EClass getSeasonDayTypeSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Day Type</em>'.
	 * @see CPSM.LoadModel.SeasonDayTypeSchedule#getDayType()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_DayType();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see CPSM.LoadModel.SeasonDayTypeSchedule#getSeason()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_Season();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Group</em>'.
	 * @see CPSM.LoadModel.LoadGroup
	 * @generated
	 */
	EClass getLoadGroup();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Load Area</em>'.
	 * @see CPSM.LoadModel.LoadGroup#getSubLoadArea()
	 * @see #getLoadGroup()
	 * @generated
	 */
	EReference getLoadGroup_SubLoadArea();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.EnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Area</em>'.
	 * @see CPSM.LoadModel.EnergyArea
	 * @generated
	 */
	EClass getEnergyArea();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.LoadModel.EnergyArea#getControlArea()
	 * @see #getEnergyArea()
	 * @generated
	 */
	EReference getEnergyArea_ControlArea();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see CPSM.LoadModel.ConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CPSM.LoadModel.ConformLoadGroup#getEnergyConsumers()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conform Load Schedules</em>'.
	 * @see CPSM.LoadModel.ConformLoadGroup#getConformLoadSchedules()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_ConformLoadSchedules();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see CPSM.LoadModel.LoadArea
	 * @generated
	 */
	EClass getLoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Load Areas</em>'.
	 * @see CPSM.LoadModel.LoadArea#getSubLoadAreas()
	 * @see #getLoadArea()
	 * @generated
	 */
	EReference getLoadArea_SubLoadAreas();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see CPSM.LoadModel.SubLoadArea
	 * @generated
	 */
	EClass getSubLoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Groups</em>'.
	 * @see CPSM.LoadModel.SubLoadArea#getLoadGroups()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadGroups();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see CPSM.LoadModel.SubLoadArea#getLoadArea()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadArea();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Response Characteristic</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic
	 * @generated
	 */
	EClass getLoadResponseCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PFrequency Exponent</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QVoltage Exponent</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic#getQVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QVoltageExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QFrequency Exponent</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PVoltage Exponent</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic#getPVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PVoltageExponent();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumer</em>'.
	 * @see CPSM.LoadModel.LoadResponseCharacteristic#getEnergyConsumer()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EReference getLoadResponseCharacteristic_EnergyConsumer();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Schedule</em>'.
	 * @see CPSM.LoadModel.NonConformLoadSchedule
	 * @generated
	 */
	EClass getNonConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Non Conform Load Group</em>'.
	 * @see CPSM.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup()
	 * @see #getNonConformLoadSchedule()
	 * @generated
	 */
	EReference getNonConformLoadSchedule_NonConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.InductionMotorLoad <em>Induction Motor Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Induction Motor Load</em>'.
	 * @see CPSM.LoadModel.InductionMotorLoad
	 * @generated
	 */
	EClass getInductionMotorLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadModel.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see CPSM.LoadModel.ConformLoad
	 * @generated
	 */
	EClass getConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CPSM.LoadModel.ConformLoad#getLoadGroup()
	 * @see #getConformLoad()
	 * @generated
	 */
	EReference getConformLoad_LoadGroup();

	/**
	 * Returns the meta object for enum '{@link CPSM.LoadModel.SeasonName <em>Season Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season Name</em>'.
	 * @see CPSM.LoadModel.SeasonName
	 * @generated
	 */
	EEnum getSeasonName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoadModelFactory getLoadModelFactory();

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
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.NonConformLoadGroupImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadGroup()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = eINSTANCE.getNonConformLoadGroup_NonConformLoadSchedules();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getNonConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.ConformLoadScheduleImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoadSchedule()
		 * @generated
		 */
		EClass CONFORM_LOAD_SCHEDULE = eINSTANCE.getConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadSchedule_ConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.CustomerLoadImpl <em>Customer Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.CustomerLoadImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getCustomerLoad()
		 * @generated
		 */
		EClass CUSTOMER_LOAD = eINSTANCE.getCustomerLoad();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.NonConformLoadImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoad()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD = eINSTANCE.getNonConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getNonConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.DayTypeImpl <em>Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.DayTypeImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getDayType()
		 * @generated
		 */
		EClass DAY_TYPE = eINSTANCE.getDayType();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getDayType_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.SeasonImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__END_DATE = eINSTANCE.getSeason_EndDate();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__START_DATE = eINSTANCE.getSeason_StartDate();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getSeason_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.LoadImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.StationSupplyImpl <em>Station Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.StationSupplyImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getStationSupply()
		 * @generated
		 */
		EClass STATION_SUPPLY = eINSTANCE.getStationSupply();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.SeasonDayTypeScheduleImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeasonDayTypeSchedule()
		 * @generated
		 */
		EClass SEASON_DAY_TYPE_SCHEDULE = eINSTANCE.getSeasonDayTypeSchedule();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = eINSTANCE.getSeasonDayTypeSchedule_DayType();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON_DAY_TYPE_SCHEDULE__SEASON = eINSTANCE.getSeasonDayTypeSchedule_Season();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.LoadGroupImpl <em>Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.LoadGroupImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadGroup()
		 * @generated
		 */
		EClass LOAD_GROUP = eINSTANCE.getLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GROUP__SUB_LOAD_AREA = eINSTANCE.getLoadGroup_SubLoadArea();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.EnergyAreaImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getEnergyArea()
		 * @generated
		 */
		EClass ENERGY_AREA = eINSTANCE.getEnergyArea();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_AREA__CONTROL_AREA = eINSTANCE.getEnergyArea_ControlArea();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.ConformLoadGroupImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoadGroup()
		 * @generated
		 */
		EClass CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '<em><b>Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = eINSTANCE.getConformLoadGroup_ConformLoadSchedules();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.LoadAreaImpl <em>Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.LoadAreaImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadArea()
		 * @generated
		 */
		EClass LOAD_AREA = eINSTANCE.getLoadArea();

		/**
		 * The meta object literal for the '<em><b>Sub Load Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_AREA__SUB_LOAD_AREAS = eINSTANCE.getLoadArea_SubLoadAreas();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.SubLoadAreaImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSubLoadArea()
		 * @generated
		 */
		EClass SUB_LOAD_AREA = eINSTANCE.getSubLoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA__LOAD_GROUPS = eINSTANCE.getSubLoadArea_LoadGroups();

		/**
		 * The meta object literal for the '<em><b>Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA__LOAD_AREA = eINSTANCE.getSubLoadArea_LoadArea();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.LoadResponseCharacteristicImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getLoadResponseCharacteristic()
		 * @generated
		 */
		EClass LOAD_RESPONSE_CHARACTERISTIC = eINSTANCE.getLoadResponseCharacteristic();

		/**
		 * The meta object literal for the '<em><b>PFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>QVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>QFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>PVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = eINSTANCE.getLoadResponseCharacteristic_EnergyConsumer();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.NonConformLoadScheduleImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getNonConformLoadSchedule()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_SCHEDULE = eINSTANCE.getNonConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadSchedule_NonConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.InductionMotorLoadImpl <em>Induction Motor Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.InductionMotorLoadImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getInductionMotorLoad()
		 * @generated
		 */
		EClass INDUCTION_MOTOR_LOAD = eINSTANCE.getInductionMotorLoad();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.impl.ConformLoadImpl <em>Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.impl.ConformLoadImpl
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getConformLoad()
		 * @generated
		 */
		EClass CONFORM_LOAD = eINSTANCE.getConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CPSM.LoadModel.SeasonName <em>Season Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.LoadModel.SeasonName
		 * @see CPSM.LoadModel.impl.LoadModelPackageImpl#getSeasonName()
		 * @generated
		 */
		EEnum SEASON_NAME = eINSTANCE.getSeasonName();

	}

} //LoadModelPackage
