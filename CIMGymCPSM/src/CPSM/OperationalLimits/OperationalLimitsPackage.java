/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits;

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
 * @see CPSM.OperationalLimits.OperationalLimitsFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The specificatoin of limits associated with equipment and other operational entities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The specificatoin of limits associated with equipment and other operational entities.'"
 * @generated
 */
public interface OperationalLimitsPackage extends EPackage {
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
	String eNAME = "OperationalLimits";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_OperationalLimits";

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
	OperationalLimitsPackage eINSTANCE = CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.OperationalLimitImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimit()
	 * @generated
	 */
	int OPERATIONAL_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.OperationalLimitSetImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitSet()
	 * @generated
	 */
	int OPERATIONAL_LIMIT_SET = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__EQUIPMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.ActivePowerLimitImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getActivePowerLimit()
	 * @generated
	 */
	int ACTIVE_POWER_LIMIT = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__URI = OPERATIONAL_LIMIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__MODEL = OPERATIONAL_LIMIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.ApparentPowerLimitImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getApparentPowerLimit()
	 * @generated
	 */
	int APPARENT_POWER_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__URI = OPERATIONAL_LIMIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__MODEL = OPERATIONAL_LIMIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apparent Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARENT_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.VoltageLimitImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getVoltageLimit()
	 * @generated
	 */
	int VOLTAGE_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__URI = OPERATIONAL_LIMIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__MODEL = OPERATIONAL_LIMIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voltage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.OperationalLimits.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.OperationalLimits.impl.CurrentLimitImpl
	 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getCurrentLimit()
	 * @generated
	 */
	int CURRENT_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__URI = OPERATIONAL_LIMIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__MODEL = OPERATIONAL_LIMIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__PATH_NAME = OPERATIONAL_LIMIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__DESCRIPTION = OPERATIONAL_LIMIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__TYPE = OPERATIONAL_LIMIT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimit
	 * @generated
	 */
	EClass getOperationalLimit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Set</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimit#getOperationalLimitSet()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EReference getOperationalLimit_OperationalLimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimits.OperationalLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimit#getType()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EAttribute getOperationalLimit_Type();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Set</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimitSet
	 * @generated
	 */
	EClass getOperationalLimitSet();

	/**
	 * Returns the meta object for the reference '{@link CPSM.OperationalLimits.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimitSet#getEquipment()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_Equipment();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Value</em>'.
	 * @see CPSM.OperationalLimits.OperationalLimitSet#getOperationalLimitValue()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_OperationalLimitValue();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Power Limit</em>'.
	 * @see CPSM.OperationalLimits.ActivePowerLimit
	 * @generated
	 */
	EClass getActivePowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.OperationalLimits.ActivePowerLimit#getValue()
	 * @see #getActivePowerLimit()
	 * @generated
	 */
	EAttribute getActivePowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparent Power Limit</em>'.
	 * @see CPSM.OperationalLimits.ApparentPowerLimit
	 * @generated
	 */
	EClass getApparentPowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.OperationalLimits.ApparentPowerLimit#getValue()
	 * @see #getApparentPowerLimit()
	 * @generated
	 */
	EAttribute getApparentPowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Limit</em>'.
	 * @see CPSM.OperationalLimits.VoltageLimit
	 * @generated
	 */
	EClass getVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimits.VoltageLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.OperationalLimits.VoltageLimit#getValue()
	 * @see #getVoltageLimit()
	 * @generated
	 */
	EAttribute getVoltageLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimits.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Limit</em>'.
	 * @see CPSM.OperationalLimits.CurrentLimit
	 * @generated
	 */
	EClass getCurrentLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimits.CurrentLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.OperationalLimits.CurrentLimit#getValue()
	 * @see #getCurrentLimit()
	 * @generated
	 */
	EAttribute getCurrentLimit_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationalLimitsFactory getOperationalLimitsFactory();

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
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.OperationalLimitImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimit()
		 * @generated
		 */
		EClass OPERATIONAL_LIMIT = eINSTANCE.getOperationalLimit();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimit_OperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_LIMIT__TYPE = eINSTANCE.getOperationalLimit_Type();

		/**
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.OperationalLimitSetImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getOperationalLimitSet()
		 * @generated
		 */
		EClass OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_SET__EQUIPMENT = eINSTANCE.getOperationalLimitSet_Equipment();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = eINSTANCE.getOperationalLimitSet_OperationalLimitValue();

		/**
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.ActivePowerLimitImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getActivePowerLimit()
		 * @generated
		 */
		EClass ACTIVE_POWER_LIMIT = eINSTANCE.getActivePowerLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_POWER_LIMIT__VALUE = eINSTANCE.getActivePowerLimit_Value();

		/**
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.ApparentPowerLimitImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getApparentPowerLimit()
		 * @generated
		 */
		EClass APPARENT_POWER_LIMIT = eINSTANCE.getApparentPowerLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPARENT_POWER_LIMIT__VALUE = eINSTANCE.getApparentPowerLimit_Value();

		/**
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.VoltageLimitImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getVoltageLimit()
		 * @generated
		 */
		EClass VOLTAGE_LIMIT = eINSTANCE.getVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_LIMIT__VALUE = eINSTANCE.getVoltageLimit_Value();

		/**
		 * The meta object literal for the '{@link CPSM.OperationalLimits.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.OperationalLimits.impl.CurrentLimitImpl
		 * @see CPSM.OperationalLimits.impl.OperationalLimitsPackageImpl#getCurrentLimit()
		 * @generated
		 */
		EClass CURRENT_LIMIT = eINSTANCE.getCurrentLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_LIMIT__VALUE = eINSTANCE.getCurrentLimit_Value();

	}

} //OperationalLimitsPackage
