/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Generation.Production;

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
 * @see CPSM.Generation.Production.ProductionFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The production package is responsible for classes which describe various kinds of generators. These classes also provide production costing information which is used to economically allocate demand among committed units and calculate reserve quantities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The production package is responsible for classes which describe various kinds of generators. These classes also provide production costing information which is used to economically allocate demand among committed units and calculate reserve quantities.'"
 * @generated
 */
public interface ProductionPackage extends EPackage {
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
	String eNAME = "Production";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Production";

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
	ProductionPackage eINSTANCE = CPSM.Generation.Production.impl.ProductionPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Generation.Production.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Generation.Production.impl.GrossToNetActivePowerCurveImpl
	 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGrossToNetActivePowerCurve()
	 * @generated
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__URI = CorePackage.CURVE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__MODEL = CorePackage.CURVE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_SCHEDULE_DATAS = CorePackage.CURVE__CURVE_SCHEDULE_DATAS;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Generation.Production.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Generation.Production.impl.GeneratingUnitImpl
	 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGeneratingUnit()
	 * @generated
	 */
	int GENERATING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__URI = CorePackage.EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MODEL = CorePackage.EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PATH_NAME = CorePackage.EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__DESCRIPTION = CorePackage.EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTAINS_MEASUREMENTS = CorePackage.EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OPERATIONAL_LIMIT_SET = CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MAX_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NORMAL_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_CONTROL_SOURCE = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_NET_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LONG_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contains Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES = CorePackage.EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = CorePackage.EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__INITIAL_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SHORT_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MIN_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link CPSM.Generation.Production.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Generation.Production.impl.HydroGeneratingUnitImpl
	 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingUnit()
	 * @generated
	 */
	int HYDRO_GENERATING_UNIT = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__URI = GENERATING_UNIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MODEL = GENERATING_UNIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTAINS_MEASUREMENTS = GENERATING_UNIT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER = GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Contains Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES = GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The number of structural features of the '<em>Hydro Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRO_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.Generation.Production.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Generation.Production.impl.ThermalGeneratingUnitImpl
	 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getThermalGeneratingUnit()
	 * @generated
	 */
	int THERMAL_GENERATING_UNIT = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__URI = GENERATING_UNIT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MODEL = GENERATING_UNIT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__PATH_NAME = GENERATING_UNIT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__DESCRIPTION = GENERATING_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTAINS_MEASUREMENTS = GENERATING_UNIT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER = GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__OPERATIONAL_LIMIT_SET = GENERATING_UNIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Contains Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES = GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The number of structural features of the '<em>Thermal Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Generation.Production.GeneratorControlSource
	 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlSource()
	 * @generated
	 */
	int GENERATOR_CONTROL_SOURCE = 4;


	/**
	 * Returns the meta object for class '{@link CPSM.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gross To Net Active Power Curve</em>'.
	 * @see CPSM.Generation.Production.GrossToNetActivePowerCurve
	 * @generated
	 */
	EClass getGrossToNetActivePowerCurve();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CPSM.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit()
	 * @see #getGrossToNetActivePowerCurve()
	 * @generated
	 */
	EReference getGrossToNetActivePowerCurve_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Unit</em>'.
	 * @see CPSM.Generation.Production.HydroGeneratingUnit
	 * @generated
	 */
	EClass getHydroGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermal Generating Unit</em>'.
	 * @see CPSM.Generation.Production.ThermalGeneratingUnit
	 * @generated
	 */
	EClass getThermalGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.Generation.Production.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit
	 * @generated
	 */
	EClass getGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Operating P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getMaxOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MaxOperatingP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal PF</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getNormalPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_NormalPF();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Max P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getRatedGrossMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Min P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getRatedGrossMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMinP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Source</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getGenControlSource()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GenControlSource();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Net Max P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getRatedNetMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedNetMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long PF</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getLongPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_LongPF();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Generation.Production.GeneratingUnit#getContains_SynchronousMachines <em>Contains Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Synchronous Machines</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getContains_SynchronousMachines()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_Contains_SynchronousMachines();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gross To Net Active Power Curves</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_GrossToNetActivePowerCurves();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getInitialP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_InitialP();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short PF</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getShortPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ShortPF();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Operating P</em>'.
	 * @see CPSM.Generation.Production.GeneratingUnit#getMinOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MinOperatingP();

	/**
	 * Returns the meta object for enum '{@link CPSM.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Source</em>'.
	 * @see CPSM.Generation.Production.GeneratorControlSource
	 * @generated
	 */
	EEnum getGeneratorControlSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductionFactory getProductionFactory();

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
		 * The meta object literal for the '{@link CPSM.Generation.Production.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Generation.Production.impl.GrossToNetActivePowerCurveImpl
		 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGrossToNetActivePowerCurve()
		 * @generated
		 */
		EClass GROSS_TO_NET_ACTIVE_POWER_CURVE = eINSTANCE.getGrossToNetActivePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = eINSTANCE.getGrossToNetActivePowerCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.Generation.Production.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Generation.Production.impl.HydroGeneratingUnitImpl
		 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getHydroGeneratingUnit()
		 * @generated
		 */
		EClass HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.Generation.Production.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Generation.Production.impl.ThermalGeneratingUnitImpl
		 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getThermalGeneratingUnit()
		 * @generated
		 */
		EClass THERMAL_GENERATING_UNIT = eINSTANCE.getThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.Generation.Production.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Generation.Production.impl.GeneratingUnitImpl
		 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGeneratingUnit()
		 * @generated
		 */
		EClass GENERATING_UNIT = eINSTANCE.getGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Max Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MAX_OPERATING_P = eINSTANCE.getGeneratingUnit_MaxOperatingP();

		/**
		 * The meta object literal for the '<em><b>Normal PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__NORMAL_PF = eINSTANCE.getGeneratingUnit_NormalPF();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_GROSS_MAX_P = eINSTANCE.getGeneratingUnit_RatedGrossMaxP();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_GROSS_MIN_P = eINSTANCE.getGeneratingUnit_RatedGrossMinP();

		/**
		 * The meta object literal for the '<em><b>Gen Control Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__GEN_CONTROL_SOURCE = eINSTANCE.getGeneratingUnit_GenControlSource();

		/**
		 * The meta object literal for the '<em><b>Rated Net Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__RATED_NET_MAX_P = eINSTANCE.getGeneratingUnit_RatedNetMaxP();

		/**
		 * The meta object literal for the '<em><b>Long PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__LONG_PF = eINSTANCE.getGeneratingUnit_LongPF();

		/**
		 * The meta object literal for the '<em><b>Contains Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES = eINSTANCE.getGeneratingUnit_Contains_SynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = eINSTANCE.getGeneratingUnit_GrossToNetActivePowerCurves();

		/**
		 * The meta object literal for the '<em><b>Initial P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__INITIAL_P = eINSTANCE.getGeneratingUnit_InitialP();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getGeneratingUnit_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Short PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__SHORT_PF = eINSTANCE.getGeneratingUnit_ShortPF();

		/**
		 * The meta object literal for the '<em><b>Min Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATING_UNIT__MIN_OPERATING_P = eINSTANCE.getGeneratingUnit_MinOperatingP();

		/**
		 * The meta object literal for the '{@link CPSM.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Generation.Production.GeneratorControlSource
		 * @see CPSM.Generation.Production.impl.ProductionPackageImpl#getGeneratorControlSource()
		 * @generated
		 */
		EEnum GENERATOR_CONTROL_SOURCE = eINSTANCE.getGeneratorControlSource();

	}

} //ProductionPackage
