/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CPSM.CPSMFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An extension to the Core and Wires packages that models information on the current and planned network configuration. These entities are optional within typical network applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An extension to the Core and Wires packages that models information on the current and planned network configuration. These entities are optional within typical network applications.'"
 * @generated
 */
public interface CPSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CPSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#";

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
	CPSMPackage eINSTANCE = CPSM.impl.CPSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ElementImpl
	 * @see CPSM.impl.CPSMPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__URI = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.IEC61970CIMVersionImpl <em>IEC61970CIM Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.IEC61970CIMVersionImpl
	 * @see CPSM.impl.CPSMPackageImpl#getIEC61970CIMVersion()
	 * @generated
	 */
	int IEC61970CIM_VERSION = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970CIM_VERSION__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970CIM_VERSION__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970CIM_VERSION__VERSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970CIM_VERSION__DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC61970CIM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970CIM_VERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.CommonPowerSystemModelImpl <em>Common Power System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CommonPowerSystemModelImpl
	 * @see CPSM.impl.CPSMPackageImpl#getCommonPowerSystemModel()
	 * @generated
	 */
	int COMMON_POWER_SYSTEM_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_POWER_SYSTEM_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Common Power System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_POWER_SYSTEM_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.IdentifiedObjectImpl
	 * @see CPSM.impl.CPSMPackageImpl#getIdentifiedObject()
	 * @generated
	 */
	int IDENTIFIED_OBJECT = 64;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__PATH_NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__ALIAS_NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT__NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_OBJECT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.CurveImpl <em>Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CurveImpl
	 * @see CPSM.impl.CPSMPackageImpl#getCurve()
	 * @generated
	 */
	int CURVE = 77;

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
	 * The meta object id for the '{@link CPSM.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.GrossToNetActivePowerCurveImpl
	 * @see CPSM.impl.CPSMPackageImpl#getGrossToNetActivePowerCurve()
	 * @generated
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__URI = CURVE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__MODEL = CURVE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__PATH_NAME = CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__DESCRIPTION = CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__ALIAS_NAME = CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__NAME = CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_UNIT = CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__XUNIT = CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_SCHEDULE_DATAS = CURVE__CURVE_SCHEDULE_DATAS;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_STYLE = CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_UNIT = CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROSS_TO_NET_ACTIVE_POWER_CURVE_FEATURE_COUNT = CURVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.PowerSystemResourceImpl
	 * @see CPSM.impl.CPSMPackageImpl#getPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE = 78;

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
	 * The meta object id for the '{@link CPSM.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquipmentImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 75;

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
	 * The meta object id for the '{@link CPSM.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.GeneratingUnitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getGeneratingUnit()
	 * @generated
	 */
	int GENERATING_UNIT = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__URI = EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MODEL = EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__PATH_NAME = EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__DESCRIPTION = EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__ALIAS_NAME = EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTAINS_MEASUREMENTS = EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MEMBER_OF_EQUIPMENT_CONTAINER = EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__OPERATIONAL_LIMIT_SET = EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MAX_OPERATING_P = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__NORMAL_PF = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MAX_P = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_GROSS_MIN_P = EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GEN_CONTROL_SOURCE = EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__RATED_NET_MAX_P = EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__LONG_PF = EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contains Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES = EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__INITIAL_P = EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__SHORT_PF = EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT__MIN_OPERATING_P = EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATING_UNIT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link CPSM.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.HydroGeneratingUnitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getHydroGeneratingUnit()
	 * @generated
	 */
	int HYDRO_GENERATING_UNIT = 4;

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
	 * The meta object id for the '{@link CPSM.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ThermalGeneratingUnitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getThermalGeneratingUnit()
	 * @generated
	 */
	int THERMAL_GENERATING_UNIT = 5;

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
	 * The meta object id for the '{@link CPSM.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.OperationalLimitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getOperationalLimit()
	 * @generated
	 */
	int OPERATIONAL_LIMIT = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT__TYPE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.OperationalLimitSetImpl
	 * @see CPSM.impl.CPSMPackageImpl#getOperationalLimitSet()
	 * @generated
	 */
	int OPERATIONAL_LIMIT_SET = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_LIMIT_SET_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ActivePowerLimitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getActivePowerLimit()
	 * @generated
	 */
	int ACTIVE_POWER_LIMIT = 9;

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
	 * The meta object id for the '{@link CPSM.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ApparentPowerLimitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getApparentPowerLimit()
	 * @generated
	 */
	int APPARENT_POWER_LIMIT = 10;

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
	 * The meta object id for the '{@link CPSM.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.VoltageLimitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getVoltageLimit()
	 * @generated
	 */
	int VOLTAGE_LIMIT = 11;

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
	 * The meta object id for the '{@link CPSM.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CurrentLimitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getCurrentLimit()
	 * @generated
	 */
	int CURRENT_LIMIT = 12;

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
	 * The meta object id for the '{@link CPSM.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.PowerTransformerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getPowerTransformer()
	 * @generated
	 */
	int POWER_TRANSFORMER = 13;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__URI = EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MODEL = EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__PATH_NAME = EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__DESCRIPTION = EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__ALIAS_NAME = EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CONTAINS_MEASUREMENTS = EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__MEMBER_OF_EQUIPMENT_CONTAINER = EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__OPERATIONAL_LIMIT_SET = EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Contains Transformer Windings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TRANSFORMER_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConductingEquipmentImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConductingEquipment()
	 * @generated
	 */
	int CONDUCTING_EQUIPMENT = 82;

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
	 * The meta object id for the '{@link CPSM.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SwitchImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 25;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NORMAL_OPEN = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.DisconnectorImpl <em>Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.DisconnectorImpl
	 * @see CPSM.impl.CPSMPackageImpl#getDisconnector()
	 * @generated
	 */
	int DISCONNECTOR = 14;

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
	 * The meta object id for the '{@link CPSM.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.RegulatingCondEqImpl
	 * @see CPSM.impl.CPSMPackageImpl#getRegulatingCondEq()
	 * @generated
	 */
	int REGULATING_COND_EQ = 19;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ__REGULATING_CONTROL = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_COND_EQ_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SynchronousMachineImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachine()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE = 15;

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
	 * The meta object id for the '{@link CPSM.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.BusbarSectionImpl
	 * @see CPSM.impl.CPSMPackageImpl#getBusbarSection()
	 * @generated
	 */
	int BUSBAR_SECTION = 16;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The number of structural features of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSBAR_SECTION_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ShuntCompensatorImpl
	 * @see CPSM.impl.CPSMPackageImpl#getShuntCompensator()
	 * @generated
	 */
	int SHUNT_COMPENSATOR = 17;

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
	 * The meta object id for the '{@link CPSM.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LoadBreakSwitchImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLoadBreakSwitch()
	 * @generated
	 */
	int LOAD_BREAK_SWITCH = 18;

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
	 * The meta object id for the '{@link CPSM.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EnergyConsumerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 20;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED_PCT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOAD_RESPONSE = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__QFIXED = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__PFIXED_PCT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.TransformerWindingImpl
	 * @see CPSM.impl.CPSMPackageImpl#getTransformerWinding()
	 * @generated
	 */
	int TRANSFORMER_WINDING = 21;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Winding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__WINDING_TYPE = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tap Changers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__TAP_CHANGERS = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Of Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_S = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__X = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__RATED_U = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__R = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING__B = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_WINDING_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CPSM.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.RegulatingControlImpl
	 * @see CPSM.impl.CPSMPackageImpl#getRegulatingControl()
	 * @generated
	 */
	int REGULATING_CONTROL = 22;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__URI = POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__MODEL = POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__CONTAINS_MEASUREMENTS = POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TERMINAL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATION_SCHEDULE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__TAP_CHANGER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL__REGULATING_COND_EQ = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATING_CONTROL_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.BasicIntervalScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getBasicIntervalSchedule()
	 * @generated
	 */
	int BASIC_INTERVAL_SCHEDULE = 79;

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
	 * The meta object id for the '{@link CPSM.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.RegularIntervalScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getRegularIntervalSchedule()
	 * @generated
	 */
	int REGULAR_INTERVAL_SCHEDULE = 67;

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
	 * The meta object id for the '{@link CPSM.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.RegulationScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getRegulationSchedule()
	 * @generated
	 */
	int REGULATION_SCHEDULE = 23;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__URI = REGULAR_INTERVAL_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__MODEL = REGULAR_INTERVAL_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__PATH_NAME = REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__DESCRIPTION = REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__ALIAS_NAME = REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__NAME = REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__START_TIME = REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE1_UNIT = REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__VALUE2_UNIT = REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__END_TIME = REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_POINTS = REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__TIME_STEP = REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE__REGULATING_CONTROL = REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_SCHEDULE_FEATURE_COUNT = REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConductorImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 26;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__R = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__X = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BCH = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CPSM.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ACLineSegmentImpl
	 * @see CPSM.impl.CPSMPackageImpl#getACLineSegment()
	 * @generated
	 */
	int AC_LINE_SEGMENT = 24;

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
	 * The meta object id for the '{@link CPSM.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ReactiveCapabilityCurveImpl
	 * @see CPSM.impl.CPSMPackageImpl#getReactiveCapabilityCurve()
	 * @generated
	 */
	int REACTIVE_CAPABILITY_CURVE = 27;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__URI = CURVE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__MODEL = CURVE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__PATH_NAME = CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__DESCRIPTION = CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__ALIAS_NAME = CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__NAME = CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y2_UNIT = CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__XUNIT = CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_SCHEDULE_DATAS = CURVE__CURVE_SCHEDULE_DATAS;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__CURVE_STYLE = CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__Y1_UNIT = CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Initially Used By Synchronous Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE = CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_CAPABILITY_CURVE_FEATURE_COUNT = CURVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.TapChangerImpl <em>Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.TapChangerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getTapChanger()
	 * @generated
	 */
	int TAP_CHANGER = 28;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__URI = POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__MODEL = POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__CONTAINS_MEASUREMENTS = POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__REGULATING_CONTROL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TRANSFORMER_WINDING = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NORMAL_STEP = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__HIGH_STEP = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_STEP = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__LOW_STEP = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TCUL_CONTROL_MODE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__STEP_VOLTAGE_INCREMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER__NEUTRAL_U = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_CHANGER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConnectivityNodeContainerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConnectivityNodeContainer()
	 * @generated
	 */
	int CONNECTIVITY_NODE_CONTAINER = 68;

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
	 * The meta object id for the '{@link CPSM.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquipmentContainerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquipmentContainer()
	 * @generated
	 */
	int EQUIPMENT_CONTAINER = 70;

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
	 * The meta object id for the '{@link CPSM.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LineImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 29;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__URI = EQUIPMENT_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MODEL = EQUIPMENT_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PATH_NAME = EQUIPMENT_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DESCRIPTION = EQUIPMENT_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINS_MEASUREMENTS = EQUIPMENT_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Contains Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINS_EQUIPMENTS = EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REGION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.StaticVarCompensatorImpl
	 * @see CPSM.impl.CPSMPackageImpl#getStaticVarCompensator()
	 * @generated
	 */
	int STATIC_VAR_COMPENSATOR = 30;

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
	 * The meta object id for the '{@link CPSM.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SeriesCompensatorImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSeriesCompensator()
	 * @generated
	 */
	int SERIES_COMPENSATOR = 31;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__R = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR__X = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_COMPENSATOR_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.BreakerImpl <em>Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.BreakerImpl
	 * @see CPSM.impl.CPSMPackageImpl#getBreaker()
	 * @generated
	 */
	int BREAKER = 32;

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
	 * The meta object id for the '{@link CPSM.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.MeasurementValueImpl
	 * @see CPSM.impl.CPSMPackageImpl#getMeasurementValue()
	 * @generated
	 */
	int MEASUREMENT_VALUE = 35;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.DiscreteValueImpl
	 * @see CPSM.impl.CPSMPackageImpl#getDiscreteValue()
	 * @generated
	 */
	int DISCRETE_VALUE = 33;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__URI = MEASUREMENT_VALUE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MODEL = MEASUREMENT_VALUE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Member Of Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE__MEMBER_OF_MEASUREMENT = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.MeasurementImpl
	 * @see CPSM.impl.CPSMPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 34;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Member Of PSR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEMBER_OF_PSR = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_TYPE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TERMINAL = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.MeasurementValueSourceImpl
	 * @see CPSM.impl.CPSMPackageImpl#getMeasurementValueSource()
	 * @generated
	 */
	int MEASUREMENT_VALUE_SOURCE = 36;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.AnalogImpl <em>Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.AnalogImpl
	 * @see CPSM.impl.CPSMPackageImpl#getAnalog()
	 * @generated
	 */
	int ANALOG = 37;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__URI = MEASUREMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MODEL = MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Member Of PSR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MEMBER_OF_PSR = MEASUREMENT__MEMBER_OF_PSR;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__POSITIVE_FLOW_IN = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contain Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG__CONTAIN_MEASUREMENT_VALUES = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.AnalogValueImpl <em>Analog Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.AnalogValueImpl
	 * @see CPSM.impl.CPSMPackageImpl#getAnalogValue()
	 * @generated
	 */
	int ANALOG_VALUE = 38;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__URI = MEASUREMENT_VALUE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MODEL = MEASUREMENT_VALUE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__PATH_NAME = MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__DESCRIPTION = MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Member Of Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE__MEMBER_OF_MEASUREMENT = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.MeasurementTypeImpl
	 * @see CPSM.impl.CPSMPackageImpl#getMeasurementType()
	 * @generated
	 */
	int MEASUREMENT_TYPE = 39;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.DiscreteImpl <em>Discrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.DiscreteImpl
	 * @see CPSM.impl.CPSMPackageImpl#getDiscrete()
	 * @generated
	 */
	int DISCRETE = 40;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__URI = MEASUREMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MODEL = MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__PATH_NAME = MEASUREMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Member Of PSR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MEMBER_OF_PSR = MEASUREMENT__MEMBER_OF_PSR;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__UNIT = MEASUREMENT__UNIT;

	/**
	 * The feature id for the '<em><b>Contain Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__CONTAIN_MEASUREMENT_VALUES = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.LimitSetImpl <em>Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LimitSetImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLimitSet()
	 * @generated
	 */
	int LIMIT_SET = 41;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__IS_PERCENTAGE_LIMITS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.LoadGroupImpl <em>Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LoadGroupImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLoadGroup()
	 * @generated
	 */
	int LOAD_GROUP = 51;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__SUB_LOAD_AREA = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.NonConformLoadGroupImpl
	 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP = 42;

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
	 * The meta object id for the '{@link CPSM.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SeasonDayTypeScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSeasonDayTypeSchedule()
	 * @generated
	 */
	int SEASON_DAY_TYPE_SCHEDULE = 50;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__URI = REGULAR_INTERVAL_SCHEDULE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__MODEL = REGULAR_INTERVAL_SCHEDULE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__PATH_NAME = REGULAR_INTERVAL_SCHEDULE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DESCRIPTION = REGULAR_INTERVAL_SCHEDULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME = REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__NAME = REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__START_TIME = REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT = REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT = REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__END_TIME = REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS = REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__TIME_STEP = REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE__SEASON = REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT = REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConformLoadScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConformLoadSchedule()
	 * @generated
	 */
	int CONFORM_LOAD_SCHEDULE = 43;

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
	 * The meta object id for the '{@link CPSM.impl.ConformLoadImpl <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConformLoadImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConformLoad()
	 * @generated
	 */
	int CONFORM_LOAD = 59;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__URI = ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MODEL = ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PATH_NAME = ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__DESCRIPTION = ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__ALIAS_NAME = ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__NAME = ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__CONTAINS_MEASUREMENTS = ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__OPERATIONAL_LIMIT_SET = ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__BASE_VOLTAGE = ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__TERMINALS = ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED_PCT = ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED = ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_RESPONSE = ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__QFIXED = ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__PFIXED_PCT = ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_GROUP = ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_FEATURE_COUNT = ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.CustomerLoadImpl <em>Customer Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CustomerLoadImpl
	 * @see CPSM.impl.CPSMPackageImpl#getCustomerLoad()
	 * @generated
	 */
	int CUSTOMER_LOAD = 44;

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
	 * The meta object id for the '{@link CPSM.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.NonConformLoadImpl
	 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoad()
	 * @generated
	 */
	int NON_CONFORM_LOAD = 45;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__URI = ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MODEL = ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PATH_NAME = ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__DESCRIPTION = ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__ALIAS_NAME = ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__NAME = ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__CONTAINS_MEASUREMENTS = ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MEMBER_OF_EQUIPMENT_CONTAINER = ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__OPERATIONAL_LIMIT_SET = ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__BASE_VOLTAGE = ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__TERMINALS = ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED_PCT = ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED = ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_RESPONSE = ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__QFIXED = ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__PFIXED_PCT = ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_GROUP = ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_FEATURE_COUNT = ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.DayTypeImpl <em>Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.DayTypeImpl
	 * @see CPSM.impl.CPSMPackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 46;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TYPE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SeasonImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 47;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_DATE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__SEASON_DAY_TYPE_SCHEDULES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LoadImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 48;

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
	 * The meta object id for the '{@link CPSM.impl.StationSupplyImpl <em>Station Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.StationSupplyImpl
	 * @see CPSM.impl.CPSMPackageImpl#getStationSupply()
	 * @generated
	 */
	int STATION_SUPPLY = 49;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__URI = ENERGY_CONSUMER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MODEL = ENERGY_CONSUMER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PATH_NAME = ENERGY_CONSUMER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__DESCRIPTION = ENERGY_CONSUMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__ALIAS_NAME = ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__NAME = ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__CONTAINS_MEASUREMENTS = ENERGY_CONSUMER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__MEMBER_OF_EQUIPMENT_CONTAINER = ENERGY_CONSUMER__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__OPERATIONAL_LIMIT_SET = ENERGY_CONSUMER__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__BASE_VOLTAGE = ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__TERMINALS = ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED_PCT = ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED = ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__LOAD_RESPONSE = ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__QFIXED = ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY__PFIXED_PCT = ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The number of structural features of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_FEATURE_COUNT = ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CPSM.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EnergyAreaImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEnergyArea()
	 * @generated
	 */
	int ENERGY_AREA = 52;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA__CONTROL_AREA = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_AREA_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConformLoadGroupImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP = 53;

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
	 * The meta object id for the '{@link CPSM.impl.LoadAreaImpl <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LoadAreaImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLoadArea()
	 * @generated
	 */
	int LOAD_AREA = 54;

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
	 * The meta object id for the '{@link CPSM.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SubLoadAreaImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA = 55;

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
	 * The meta object id for the '{@link CPSM.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.LoadResponseCharacteristicImpl
	 * @see CPSM.impl.CPSMPackageImpl#getLoadResponseCharacteristic()
	 * @generated
	 */
	int LOAD_RESPONSE_CHARACTERISTIC = 56;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_RESPONSE_CHARACTERISTIC_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.NonConformLoadScheduleImpl
	 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoadSchedule()
	 * @generated
	 */
	int NON_CONFORM_LOAD_SCHEDULE = 57;

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
	 * The meta object id for the '{@link CPSM.impl.InductionMotorLoadImpl <em>Induction Motor Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.InductionMotorLoadImpl
	 * @see CPSM.impl.CPSMPackageImpl#getInductionMotorLoad()
	 * @generated
	 */
	int INDUCTION_MOTOR_LOAD = 58;

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
	 * The meta object id for the '{@link CPSM.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquivalentNetworkImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquivalentNetwork()
	 * @generated
	 */
	int EQUIVALENT_NETWORK = 60;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__URI = CONNECTIVITY_NODE_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__MODEL = CONNECTIVITY_NODE_CONTAINER__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__PATH_NAME = CONNECTIVITY_NODE_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__DESCRIPTION = CONNECTIVITY_NODE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__ALIAS_NAME = CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__NAME = CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CONTAINS_MEASUREMENTS = CONNECTIVITY_NODE_CONTAINER__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__CONNECTIVITY_NODES = CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_NETWORK_FEATURE_COUNT = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquivalentEquipmentImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquivalentEquipment()
	 * @generated
	 */
	int EQUIVALENT_EQUIPMENT = 62;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__URI = CONDUCTING_EQUIPMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MODEL = CONDUCTING_EQUIPMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__PATH_NAME = CONDUCTING_EQUIPMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__DESCRIPTION = CONDUCTING_EQUIPMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__ALIAS_NAME = CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__NAME = CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__CONTAINS_MEASUREMENTS = CONDUCTING_EQUIPMENT__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER = CONDUCTING_EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__OPERATIONAL_LIMIT_SET = CONDUCTING_EQUIPMENT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__BASE_VOLTAGE = CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__TERMINALS = CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Equivalent Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equivalent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_EQUIPMENT_FEATURE_COUNT = CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquivalentShuntImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquivalentShunt()
	 * @generated
	 */
	int EQUIVALENT_SHUNT = 61;

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
	 * The meta object id for the '{@link CPSM.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.EquivalentBranchImpl
	 * @see CPSM.impl.CPSMPackageImpl#getEquivalentBranch()
	 * @generated
	 */
	int EQUIVALENT_BRANCH = 63;

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
	 * The meta object id for the '{@link CPSM.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.TerminalImpl
	 * @see CPSM.impl.CPSMPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 65;

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
	 * The meta object id for the '{@link CPSM.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.BaseVoltageImpl
	 * @see CPSM.impl.CPSMPackageImpl#getBaseVoltage()
	 * @generated
	 */
	int BASE_VOLTAGE = 66;

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
	 * The meta object id for the '{@link CPSM.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.UnitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 69;

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
	 * The meta object id for the '{@link CPSM.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.VoltageLevelImpl
	 * @see CPSM.impl.CPSMPackageImpl#getVoltageLevel()
	 * @generated
	 */
	int VOLTAGE_LEVEL = 71;

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
	 * The meta object id for the '{@link CPSM.impl.BayImpl <em>Bay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.BayImpl
	 * @see CPSM.impl.CPSMPackageImpl#getBay()
	 * @generated
	 */
	int BAY = 72;

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
	 * The meta object id for the '{@link CPSM.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SubGeographicalRegionImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSubGeographicalRegion()
	 * @generated
	 */
	int SUB_GEOGRAPHICAL_REGION = 73;

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
	 * The meta object id for the '{@link CPSM.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.RegularTimePointImpl
	 * @see CPSM.impl.CPSMPackageImpl#getRegularTimePoint()
	 * @generated
	 */
	int REGULAR_TIME_POINT = 74;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE1 = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__SEQUENCE_NUMBER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__VALUE2 = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT__INTERVAL_SCHEDULE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TIME_POINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.SubstationImpl
	 * @see CPSM.impl.CPSMPackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 76;

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
	 * The meta object id for the '{@link CPSM.impl.CurveDataImpl <em>Curve Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CurveDataImpl
	 * @see CPSM.impl.CPSMPackageImpl#getCurveData()
	 * @generated
	 */
	int CURVE_DATA = 80;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y2VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__XVALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__Y1VALUE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Curve Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA__CURVE_SCHEDULE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_DATA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.GeographicalRegionImpl
	 * @see CPSM.impl.CPSMPackageImpl#getGeographicalRegion()
	 * @generated
	 */
	int GEOGRAPHICAL_REGION = 81;

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
	 * The meta object id for the '{@link CPSM.impl.ControlAreaImpl <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ControlAreaImpl
	 * @see CPSM.impl.CPSMPackageImpl#getControlArea()
	 * @generated
	 */
	int CONTROL_AREA = 83;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__URI = POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MODEL = POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PATH_NAME = POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__DESCRIPTION = POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CONTAINS_MEASUREMENTS = POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NET_INTERCHANGE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ENERGY_AREA = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TIE_FLOW = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.impl.TieFlowImpl <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.TieFlowImpl
	 * @see CPSM.impl.CPSMPackageImpl#getTieFlow()
	 * @generated
	 */
	int TIE_FLOW = 84;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__CONTROL_AREA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__POSITIVE_FLOW_IN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.ControlAreaGeneratingUnitImpl <em>Control Area Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ControlAreaGeneratingUnitImpl
	 * @see CPSM.impl.CPSMPackageImpl#getControlAreaGeneratingUnit()
	 * @generated
	 */
	int CONTROL_AREA_GENERATING_UNIT = 85;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__URI = ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__MODEL = ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Area Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.impl.ConnectivityNodeImpl <em>Connectivity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.ConnectivityNodeImpl
	 * @see CPSM.impl.CPSMPackageImpl#getConnectivityNode()
	 * @generated
	 */
	int CONNECTIVITY_NODE = 86;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__URI = IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__MODEL = IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__PATH_NAME = IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__DESCRIPTION = IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__TERMINALS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Of Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_NODE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.GeneratorControlSource <em>Generator Control Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.GeneratorControlSource
	 * @see CPSM.impl.CPSMPackageImpl#getGeneratorControlSource()
	 * @generated
	 */
	int GENERATOR_CONTROL_SOURCE = 87;

	/**
	 * The meta object id for the '{@link CPSM.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.SynchronousMachineOperatingMode
	 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachineOperatingMode()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_OPERATING_MODE = 88;

	/**
	 * The meta object id for the '{@link CPSM.TapChangerKind <em>Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.TapChangerKind
	 * @see CPSM.impl.CPSMPackageImpl#getTapChangerKind()
	 * @generated
	 */
	int TAP_CHANGER_KIND = 89;

	/**
	 * The meta object id for the '{@link CPSM.SVCControlMode <em>SVC Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.SVCControlMode
	 * @see CPSM.impl.CPSMPackageImpl#getSVCControlMode()
	 * @generated
	 */
	int SVC_CONTROL_MODE = 90;

	/**
	 * The meta object id for the '{@link CPSM.WindingType <em>Winding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.WindingType
	 * @see CPSM.impl.CPSMPackageImpl#getWindingType()
	 * @generated
	 */
	int WINDING_TYPE = 91;

	/**
	 * The meta object id for the '{@link CPSM.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.SynchronousMachineType
	 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachineType()
	 * @generated
	 */
	int SYNCHRONOUS_MACHINE_TYPE = 92;

	/**
	 * The meta object id for the '{@link CPSM.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.TransformerControlMode
	 * @see CPSM.impl.CPSMPackageImpl#getTransformerControlMode()
	 * @generated
	 */
	int TRANSFORMER_CONTROL_MODE = 93;

	/**
	 * The meta object id for the '{@link CPSM.SeasonName <em>Season Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.SeasonName
	 * @see CPSM.impl.CPSMPackageImpl#getSeasonName()
	 * @generated
	 */
	int SEASON_NAME = 94;

	/**
	 * The meta object id for the '{@link CPSM.CurveStyle <em>Curve Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.CurveStyle
	 * @see CPSM.impl.CPSMPackageImpl#getCurveStyle()
	 * @generated
	 */
	int CURVE_STYLE = 95;

	/**
	 * The meta object id for the '{@link CPSM.ControlAreaTypeKind <em>Control Area Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.ControlAreaTypeKind
	 * @see CPSM.impl.CPSMPackageImpl#getControlAreaTypeKind()
	 * @generated
	 */
	int CONTROL_AREA_TYPE_KIND = 96;

	/**
	 * The meta object id for the '{@link CPSM.UnitSymbol <em>Unit Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.UnitSymbol
	 * @see CPSM.impl.CPSMPackageImpl#getUnitSymbol()
	 * @generated
	 */
	int UNIT_SYMBOL = 97;

	/**
	 * The meta object id for the '<em>Current Flow</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getCurrentFlow()
	 * @generated
	 */
	int CURRENT_FLOW = 98;

	/**
	 * The meta object id for the '<em>Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getActivePower()
	 * @generated
	 */
	int ACTIVE_POWER = 99;

	/**
	 * The meta object id for the '<em>Seconds</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getSeconds()
	 * @generated
	 */
	int SECONDS = 100;

	/**
	 * The meta object id for the '<em>Susceptance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getSusceptance()
	 * @generated
	 */
	int SUSCEPTANCE = 101;

	/**
	 * The meta object id for the '<em>Conductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getConductance()
	 * @generated
	 */
	int CONDUCTANCE = 102;

	/**
	 * The meta object id for the '<em>Resistance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getResistance()
	 * @generated
	 */
	int RESISTANCE = 103;

	/**
	 * The meta object id for the '<em>Per Cent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getPerCent()
	 * @generated
	 */
	int PER_CENT = 104;

	/**
	 * The meta object id for the '<em>Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getReactivePower()
	 * @generated
	 */
	int REACTIVE_POWER = 105;

	/**
	 * The meta object id for the '<em>Angle Degrees</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getAngleDegrees()
	 * @generated
	 */
	int ANGLE_DEGREES = 106;

	/**
	 * The meta object id for the '<em>Voltage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getVoltage()
	 * @generated
	 */
	int VOLTAGE = 107;

	/**
	 * The meta object id for the '<em>Apparent Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getApparentPower()
	 * @generated
	 */
	int APPARENT_POWER = 108;

	/**
	 * The meta object id for the '<em>Reactance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getReactance()
	 * @generated
	 */
	int REACTANCE = 109;

	/**
	 * The meta object id for the '<em>Voltage Per Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.impl.CPSMPackageImpl#getVoltagePerReactivePower()
	 * @generated
	 */
	int VOLTAGE_PER_REACTIVE_POWER = 110;


	/**
	 * Returns the meta object for class '{@link CPSM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CPSM.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Element#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see CPSM.Element#getURI()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_URI();

	/**
	 * Returns the meta object for the container reference '{@link CPSM.Element#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see CPSM.Element#getModel()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Model();

	/**
	 * Returns the meta object for class '{@link CPSM.IEC61970CIMVersion <em>IEC61970CIM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC61970CIM Version</em>'.
	 * @see CPSM.IEC61970CIMVersion
	 * @generated
	 */
	EClass getIEC61970CIMVersion();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IEC61970CIMVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CPSM.IEC61970CIMVersion#getVersion()
	 * @see #getIEC61970CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61970CIMVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IEC61970CIMVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CPSM.IEC61970CIMVersion#getDate()
	 * @see #getIEC61970CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61970CIMVersion_Date();

	/**
	 * Returns the meta object for class '{@link CPSM.CommonPowerSystemModel <em>Common Power System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Power System Model</em>'.
	 * @see CPSM.CommonPowerSystemModel
	 * @generated
	 */
	EClass getCommonPowerSystemModel();

	/**
	 * Returns the meta object for the containment reference list '{@link CPSM.CommonPowerSystemModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see CPSM.CommonPowerSystemModel#getElements()
	 * @see #getCommonPowerSystemModel()
	 * @generated
	 */
	EReference getCommonPowerSystemModel_Elements();

	/**
	 * Returns the meta object for class '{@link CPSM.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gross To Net Active Power Curve</em>'.
	 * @see CPSM.GrossToNetActivePowerCurve
	 * @generated
	 */
	EClass getGrossToNetActivePowerCurve();

	/**
	 * Returns the meta object for the reference '{@link CPSM.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CPSM.GrossToNetActivePowerCurve#getGeneratingUnit()
	 * @see #getGrossToNetActivePowerCurve()
	 * @generated
	 */
	EReference getGrossToNetActivePowerCurve_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Unit</em>'.
	 * @see CPSM.HydroGeneratingUnit
	 * @generated
	 */
	EClass getHydroGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermal Generating Unit</em>'.
	 * @see CPSM.ThermalGeneratingUnit
	 * @generated
	 */
	EClass getThermalGeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CPSM.GeneratingUnit
	 * @generated
	 */
	EClass getGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Operating P</em>'.
	 * @see CPSM.GeneratingUnit#getMaxOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MaxOperatingP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getNormalPF <em>Normal PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal PF</em>'.
	 * @see CPSM.GeneratingUnit#getNormalPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_NormalPF();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Max P</em>'.
	 * @see CPSM.GeneratingUnit#getRatedGrossMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Min P</em>'.
	 * @see CPSM.GeneratingUnit#getRatedGrossMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedGrossMinP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Source</em>'.
	 * @see CPSM.GeneratingUnit#getGenControlSource()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_GenControlSource();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Net Max P</em>'.
	 * @see CPSM.GeneratingUnit#getRatedNetMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_RatedNetMaxP();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getLongPF <em>Long PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long PF</em>'.
	 * @see CPSM.GeneratingUnit#getLongPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_LongPF();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.GeneratingUnit#getContains_SynchronousMachines <em>Contains Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Synchronous Machines</em>'.
	 * @see CPSM.GeneratingUnit#getContains_SynchronousMachines()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_Contains_SynchronousMachines();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gross To Net Active Power Curves</em>'.
	 * @see CPSM.GeneratingUnit#getGrossToNetActivePowerCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_GrossToNetActivePowerCurves();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getInitialP <em>Initial P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial P</em>'.
	 * @see CPSM.GeneratingUnit#getInitialP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_InitialP();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CPSM.GeneratingUnit#getControlAreaGeneratingUnit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EReference getGeneratingUnit_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getShortPF <em>Short PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short PF</em>'.
	 * @see CPSM.GeneratingUnit#getShortPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_ShortPF();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Operating P</em>'.
	 * @see CPSM.GeneratingUnit#getMinOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	EAttribute getGeneratingUnit_MinOperatingP();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit</em>'.
	 * @see CPSM.OperationalLimit
	 * @generated
	 */
	EClass getOperationalLimit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Set</em>'.
	 * @see CPSM.OperationalLimit#getOperationalLimitSet()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EReference getOperationalLimit_OperationalLimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.OperationalLimit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.OperationalLimit#getType()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	EAttribute getOperationalLimit_Type();

	/**
	 * Returns the meta object for class '{@link CPSM.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Set</em>'.
	 * @see CPSM.OperationalLimitSet
	 * @generated
	 */
	EClass getOperationalLimitSet();

	/**
	 * Returns the meta object for the reference '{@link CPSM.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see CPSM.OperationalLimitSet#getEquipment()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_Equipment();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Value</em>'.
	 * @see CPSM.OperationalLimitSet#getOperationalLimitValue()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	EReference getOperationalLimitSet_OperationalLimitValue();

	/**
	 * Returns the meta object for class '{@link CPSM.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Power Limit</em>'.
	 * @see CPSM.ActivePowerLimit
	 * @generated
	 */
	EClass getActivePowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ActivePowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.ActivePowerLimit#getValue()
	 * @see #getActivePowerLimit()
	 * @generated
	 */
	EAttribute getActivePowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparent Power Limit</em>'.
	 * @see CPSM.ApparentPowerLimit
	 * @generated
	 */
	EClass getApparentPowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ApparentPowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.ApparentPowerLimit#getValue()
	 * @see #getApparentPowerLimit()
	 * @generated
	 */
	EAttribute getApparentPowerLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Limit</em>'.
	 * @see CPSM.VoltageLimit
	 * @generated
	 */
	EClass getVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.VoltageLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.VoltageLimit#getValue()
	 * @see #getVoltageLimit()
	 * @generated
	 */
	EAttribute getVoltageLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Limit</em>'.
	 * @see CPSM.CurrentLimit
	 * @generated
	 */
	EClass getCurrentLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.CurrentLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CPSM.CurrentLimit#getValue()
	 * @see #getCurrentLimit()
	 * @generated
	 */
	EAttribute getCurrentLimit_Value();

	/**
	 * Returns the meta object for class '{@link CPSM.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer</em>'.
	 * @see CPSM.PowerTransformer
	 * @generated
	 */
	EClass getPowerTransformer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.PowerTransformer#getContains_TransformerWindings <em>Contains Transformer Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Transformer Windings</em>'.
	 * @see CPSM.PowerTransformer#getContains_TransformerWindings()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	EReference getPowerTransformer_Contains_TransformerWindings();

	/**
	 * Returns the meta object for class '{@link CPSM.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnector</em>'.
	 * @see CPSM.Disconnector
	 * @generated
	 */
	EClass getDisconnector();

	/**
	 * Returns the meta object for class '{@link CPSM.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Machine</em>'.
	 * @see CPSM.SynchronousMachine
	 * @generated
	 */
	EClass getSynchronousMachine();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Reactive Capability Curve</em>'.
	 * @see CPSM.SynchronousMachine#getInitialReactiveCapabilityCurve()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_InitialReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CPSM.SynchronousMachine#getOperatingMode()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_OperatingMode();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SynchronousMachine#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Generating Unit</em>'.
	 * @see CPSM.SynchronousMachine#getMemberOf_GeneratingUnit()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EReference getSynchronousMachine_MemberOf_GeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SynchronousMachine#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see CPSM.SynchronousMachine#getMinQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MinQ();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SynchronousMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.SynchronousMachine#getType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_Type();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SynchronousMachine#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see CPSM.SynchronousMachine#getMaxQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	EAttribute getSynchronousMachine_MaxQ();

	/**
	 * Returns the meta object for class '{@link CPSM.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busbar Section</em>'.
	 * @see CPSM.BusbarSection
	 * @generated
	 */
	EClass getBusbarSection();

	/**
	 * Returns the meta object for class '{@link CPSM.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator</em>'.
	 * @see CPSM.ShuntCompensator
	 * @generated
	 */
	EClass getShuntCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Sections</em>'.
	 * @see CPSM.ShuntCompensator#getMaximumSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_MaximumSections();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ShuntCompensator#getNormalSections <em>Normal Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Sections</em>'.
	 * @see CPSM.ShuntCompensator#getNormalSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NormalSections();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ShuntCompensator#getNomU <em>Nom U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom U</em>'.
	 * @see CPSM.ShuntCompensator#getNomU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_NomU();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Per Section</em>'.
	 * @see CPSM.ShuntCompensator#getReactivePerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	EAttribute getShuntCompensator_ReactivePerSection();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Break Switch</em>'.
	 * @see CPSM.LoadBreakSwitch
	 * @generated
	 */
	EClass getLoadBreakSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CPSM.LoadBreakSwitch#getRatedCurrent()
	 * @see #getLoadBreakSwitch()
	 * @generated
	 */
	EAttribute getLoadBreakSwitch_RatedCurrent();

	/**
	 * Returns the meta object for class '{@link CPSM.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Cond Eq</em>'.
	 * @see CPSM.RegulatingCondEq
	 * @generated
	 */
	EClass getRegulatingCondEq();

	/**
	 * Returns the meta object for the reference '{@link CPSM.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CPSM.RegulatingCondEq#getRegulatingControl()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	EReference getRegulatingCondEq_RegulatingControl();

	/**
	 * Returns the meta object for class '{@link CPSM.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see CPSM.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed Pct</em>'.
	 * @see CPSM.EnergyConsumer#getQfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_QfixedPct();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EnergyConsumer#getPfixed <em>Pfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed</em>'.
	 * @see CPSM.EnergyConsumer#getPfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Pfixed();

	/**
	 * Returns the meta object for the reference '{@link CPSM.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Response</em>'.
	 * @see CPSM.EnergyConsumer#getLoadResponse()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_LoadResponse();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EnergyConsumer#getQfixed <em>Qfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed</em>'.
	 * @see CPSM.EnergyConsumer#getQfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Qfixed();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed Pct</em>'.
	 * @see CPSM.EnergyConsumer#getPfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_PfixedPct();

	/**
	 * Returns the meta object for class '{@link CPSM.TransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Winding</em>'.
	 * @see CPSM.TransformerWinding
	 * @generated
	 */
	EClass getTransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getWindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Type</em>'.
	 * @see CPSM.TransformerWinding#getWindingType()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_WindingType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.TransformerWinding#getTapChangers <em>Tap Changers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changers</em>'.
	 * @see CPSM.TransformerWinding#getTapChangers()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_TapChangers();

	/**
	 * Returns the meta object for the reference '{@link CPSM.TransformerWinding#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Power Transformer</em>'.
	 * @see CPSM.TransformerWinding#getMemberOf_PowerTransformer()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EReference getTransformerWinding_MemberOf_PowerTransformer();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CPSM.TransformerWinding#getRatedS()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedS();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.TransformerWinding#getX()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CPSM.TransformerWinding#getRatedU()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_RatedU();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.TransformerWinding#getR()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TransformerWinding#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CPSM.TransformerWinding#getB()
	 * @see #getTransformerWinding()
	 * @generated
	 */
	EAttribute getTransformerWinding_B();

	/**
	 * Returns the meta object for class '{@link CPSM.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Control</em>'.
	 * @see CPSM.RegulatingControl
	 * @generated
	 */
	EClass getRegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CPSM.RegulatingControl#getTerminal()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_Terminal();

	/**
	 * Returns the meta object for the reference '{@link CPSM.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulation Schedule</em>'.
	 * @see CPSM.RegulatingControl#getRegulationSchedule()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulationSchedule();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.RegulatingControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changer</em>'.
	 * @see CPSM.RegulatingControl#getTapChanger()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_TapChanger();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Cond Eq</em>'.
	 * @see CPSM.RegulatingControl#getRegulatingCondEq()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	EReference getRegulatingControl_RegulatingCondEq();

	/**
	 * Returns the meta object for class '{@link CPSM.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation Schedule</em>'.
	 * @see CPSM.RegulationSchedule
	 * @generated
	 */
	EClass getRegulationSchedule();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see CPSM.RegulationSchedule#getRegulatingControl()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	EReference getRegulationSchedule_RegulatingControl();

	/**
	 * Returns the meta object for class '{@link CPSM.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC Line Segment</em>'.
	 * @see CPSM.ACLineSegment
	 * @generated
	 */
	EClass getACLineSegment();

	/**
	 * Returns the meta object for class '{@link CPSM.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see CPSM.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Switch#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see CPSM.Switch#isNormalOpen()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_NormalOpen();

	/**
	 * Returns the meta object for class '{@link CPSM.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see CPSM.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Conductor#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.Conductor#getR()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Conductor#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.Conductor#getX()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Conductor#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see CPSM.Conductor#getBch()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Bch();

	/**
	 * Returns the meta object for class '{@link CPSM.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Capability Curve</em>'.
	 * @see CPSM.ReactiveCapabilityCurve
	 * @generated
	 */
	EClass getReactiveCapabilityCurve();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine <em>Initially Used By Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initially Used By Synchronous Machine</em>'.
	 * @see CPSM.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine();

	/**
	 * Returns the meta object for class '{@link CPSM.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer</em>'.
	 * @see CPSM.TapChanger
	 * @generated
	 */
	EClass getTapChanger();

	/**
	 * Returns the meta object for the reference '{@link CPSM.TapChanger#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CPSM.TapChanger#getRegulatingControl()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_RegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.TapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Winding</em>'.
	 * @see CPSM.TapChanger#getTransformerWinding()
	 * @see #getTapChanger()
	 * @generated
	 */
	EReference getTapChanger_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getNormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Step</em>'.
	 * @see CPSM.TapChanger#getNormalStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NormalStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see CPSM.TapChanger#getHighStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_HighStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Shift Increment</em>'.
	 * @see CPSM.TapChanger#getStepPhaseShiftIncrement()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_StepPhaseShiftIncrement();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see CPSM.TapChanger#getNeutralStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see CPSM.TapChanger#getLowStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_LowStep();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getTculControlMode <em>Tcul Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcul Control Mode</em>'.
	 * @see CPSM.TapChanger#getTculControlMode()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_TculControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see CPSM.TapChanger#getStepVoltageIncrement()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_StepVoltageIncrement();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.TapChanger#getType()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_Type();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TapChanger#getNeutralU <em>Neutral U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral U</em>'.
	 * @see CPSM.TapChanger#getNeutralU()
	 * @see #getTapChanger()
	 * @generated
	 */
	EAttribute getTapChanger_NeutralU();

	/**
	 * Returns the meta object for class '{@link CPSM.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see CPSM.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.Line#getRegion()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Region();

	/**
	 * Returns the meta object for class '{@link CPSM.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Var Compensator</em>'.
	 * @see CPSM.StaticVarCompensator
	 * @generated
	 */
	EClass getStaticVarCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Set Point</em>'.
	 * @see CPSM.StaticVarCompensator#getVoltageSetPoint()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_VoltageSetPoint();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SVC Control Mode</em>'.
	 * @see CPSM.StaticVarCompensator#getSVCControlMode()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_SVCControlMode();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see CPSM.StaticVarCompensator#getCapacitiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_CapacitiveRating();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.StaticVarCompensator#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see CPSM.StaticVarCompensator#getSlope()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_Slope();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see CPSM.StaticVarCompensator#getInductiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	EAttribute getStaticVarCompensator_InductiveRating();

	/**
	 * Returns the meta object for class '{@link CPSM.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Compensator</em>'.
	 * @see CPSM.SeriesCompensator
	 * @generated
	 */
	EClass getSeriesCompensator();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SeriesCompensator#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.SeriesCompensator#getR()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_R();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.SeriesCompensator#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.SeriesCompensator#getX()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	EAttribute getSeriesCompensator_X();

	/**
	 * Returns the meta object for class '{@link CPSM.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker</em>'.
	 * @see CPSM.Breaker
	 * @generated
	 */
	EClass getBreaker();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Breaker#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CPSM.Breaker#getRatedCurrent()
	 * @see #getBreaker()
	 * @generated
	 */
	EAttribute getBreaker_RatedCurrent();

	/**
	 * Returns the meta object for class '{@link CPSM.DiscreteValue <em>Discrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Value</em>'.
	 * @see CPSM.DiscreteValue
	 * @generated
	 */
	EClass getDiscreteValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.DiscreteValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Measurement</em>'.
	 * @see CPSM.DiscreteValue#getMemberOf_Measurement()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	EReference getDiscreteValue_MemberOf_Measurement();

	/**
	 * Returns the meta object for class '{@link CPSM.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see CPSM.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Measurement#getMemberOf_PSR <em>Member Of PSR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of PSR</em>'.
	 * @see CPSM.Measurement#getMemberOf_PSR()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MemberOf_PSR();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Type</em>'.
	 * @see CPSM.Measurement#getMeasurementType()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementType();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CPSM.Measurement#getTerminal()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Terminal();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CPSM.Measurement#getUnit()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value</em>'.
	 * @see CPSM.MeasurementValue
	 * @generated
	 */
	EClass getMeasurementValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Source</em>'.
	 * @see CPSM.MeasurementValue#getMeasurementValueSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_MeasurementValueSource();

	/**
	 * Returns the meta object for class '{@link CPSM.MeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Source</em>'.
	 * @see CPSM.MeasurementValueSource
	 * @generated
	 */
	EClass getMeasurementValueSource();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CPSM.MeasurementValueSource#getMeasurementValues()
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	EReference getMeasurementValueSource_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.Analog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog</em>'.
	 * @see CPSM.Analog
	 * @generated
	 */
	EClass getAnalog();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Analog#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CPSM.Analog#isPositiveFlowIn()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_PositiveFlowIn();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Analog#getContain_MeasurementValues <em>Contain Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contain Measurement Values</em>'.
	 * @see CPSM.Analog#getContain_MeasurementValues()
	 * @see #getAnalog()
	 * @generated
	 */
	EReference getAnalog_Contain_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.AnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Value</em>'.
	 * @see CPSM.AnalogValue
	 * @generated
	 */
	EClass getAnalogValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.AnalogValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Measurement</em>'.
	 * @see CPSM.AnalogValue#getMemberOf_Measurement()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EReference getAnalogValue_MemberOf_Measurement();

	/**
	 * Returns the meta object for class '{@link CPSM.MeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Type</em>'.
	 * @see CPSM.MeasurementType
	 * @generated
	 */
	EClass getMeasurementType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.MeasurementType#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.MeasurementType#getMeasurements()
	 * @see #getMeasurementType()
	 * @generated
	 */
	EReference getMeasurementType_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete</em>'.
	 * @see CPSM.Discrete
	 * @generated
	 */
	EClass getDiscrete();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Discrete#getContain_MeasurementValues <em>Contain Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contain Measurement Values</em>'.
	 * @see CPSM.Discrete#getContain_MeasurementValues()
	 * @see #getDiscrete()
	 * @generated
	 */
	EReference getDiscrete_Contain_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.LimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Set</em>'.
	 * @see CPSM.LimitSet
	 * @generated
	 */
	EClass getLimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage Limits</em>'.
	 * @see CPSM.LimitSet#isIsPercentageLimits()
	 * @see #getLimitSet()
	 * @generated
	 */
	EAttribute getLimitSet_IsPercentageLimits();

	/**
	 * Returns the meta object for class '{@link CPSM.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see CPSM.NonConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Conform Load Schedules</em>'.
	 * @see CPSM.NonConformLoadGroup#getNonConformLoadSchedules()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_NonConformLoadSchedules();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CPSM.NonConformLoadGroup#getEnergyConsumers()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for class '{@link CPSM.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Schedule</em>'.
	 * @see CPSM.ConformLoadSchedule
	 * @generated
	 */
	EClass getConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conform Load Group</em>'.
	 * @see CPSM.ConformLoadSchedule#getConformLoadGroup()
	 * @see #getConformLoadSchedule()
	 * @generated
	 */
	EReference getConformLoadSchedule_ConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.CustomerLoad <em>Customer Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Load</em>'.
	 * @see CPSM.CustomerLoad
	 * @generated
	 */
	EClass getCustomerLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see CPSM.NonConformLoad
	 * @generated
	 */
	EClass getNonConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CPSM.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CPSM.NonConformLoad#getLoadGroup()
	 * @see #getNonConformLoad()
	 * @generated
	 */
	EReference getNonConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Type</em>'.
	 * @see CPSM.DayType
	 * @generated
	 */
	EClass getDayType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CPSM.DayType#getSeasonDayTypeSchedules()
	 * @see #getDayType()
	 * @generated
	 */
	EReference getDayType_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for class '{@link CPSM.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see CPSM.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see CPSM.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see CPSM.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_StartDate();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CPSM.Season#getSeasonDayTypeSchedules()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_SeasonDayTypeSchedules();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPSM.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for class '{@link CPSM.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see CPSM.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Supply</em>'.
	 * @see CPSM.StationSupply
	 * @generated
	 */
	EClass getStationSupply();

	/**
	 * Returns the meta object for class '{@link CPSM.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season Day Type Schedule</em>'.
	 * @see CPSM.SeasonDayTypeSchedule
	 * @generated
	 */
	EClass getSeasonDayTypeSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Day Type</em>'.
	 * @see CPSM.SeasonDayTypeSchedule#getDayType()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_DayType();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see CPSM.SeasonDayTypeSchedule#getSeason()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	EReference getSeasonDayTypeSchedule_Season();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Group</em>'.
	 * @see CPSM.LoadGroup
	 * @generated
	 */
	EClass getLoadGroup();

	/**
	 * Returns the meta object for the reference '{@link CPSM.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Load Area</em>'.
	 * @see CPSM.LoadGroup#getSubLoadArea()
	 * @see #getLoadGroup()
	 * @generated
	 */
	EReference getLoadGroup_SubLoadArea();

	/**
	 * Returns the meta object for class '{@link CPSM.EnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Area</em>'.
	 * @see CPSM.EnergyArea
	 * @generated
	 */
	EClass getEnergyArea();

	/**
	 * Returns the meta object for the reference '{@link CPSM.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.EnergyArea#getControlArea()
	 * @see #getEnergyArea()
	 * @generated
	 */
	EReference getEnergyArea_ControlArea();

	/**
	 * Returns the meta object for class '{@link CPSM.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see CPSM.ConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroup();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CPSM.ConformLoadGroup#getEnergyConsumers()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_EnergyConsumers();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conform Load Schedules</em>'.
	 * @see CPSM.ConformLoadGroup#getConformLoadSchedules()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroup_ConformLoadSchedules();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see CPSM.LoadArea
	 * @generated
	 */
	EClass getLoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Load Areas</em>'.
	 * @see CPSM.LoadArea#getSubLoadAreas()
	 * @see #getLoadArea()
	 * @generated
	 */
	EReference getLoadArea_SubLoadAreas();

	/**
	 * Returns the meta object for class '{@link CPSM.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see CPSM.SubLoadArea
	 * @generated
	 */
	EClass getSubLoadArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Groups</em>'.
	 * @see CPSM.SubLoadArea#getLoadGroups()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadGroups();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see CPSM.SubLoadArea#getLoadArea()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadArea();

	/**
	 * Returns the meta object for class '{@link CPSM.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Response Characteristic</em>'.
	 * @see CPSM.LoadResponseCharacteristic
	 * @generated
	 */
	EClass getLoadResponseCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PFrequency Exponent</em>'.
	 * @see CPSM.LoadResponseCharacteristic#getPFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QVoltage Exponent</em>'.
	 * @see CPSM.LoadResponseCharacteristic#getQVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QVoltageExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QFrequency Exponent</em>'.
	 * @see CPSM.LoadResponseCharacteristic#getQFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_QFrequencyExponent();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PVoltage Exponent</em>'.
	 * @see CPSM.LoadResponseCharacteristic#getPVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EAttribute getLoadResponseCharacteristic_PVoltageExponent();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumer</em>'.
	 * @see CPSM.LoadResponseCharacteristic#getEnergyConsumer()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	EReference getLoadResponseCharacteristic_EnergyConsumer();

	/**
	 * Returns the meta object for class '{@link CPSM.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Schedule</em>'.
	 * @see CPSM.NonConformLoadSchedule
	 * @generated
	 */
	EClass getNonConformLoadSchedule();

	/**
	 * Returns the meta object for the reference '{@link CPSM.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Non Conform Load Group</em>'.
	 * @see CPSM.NonConformLoadSchedule#getNonConformLoadGroup()
	 * @see #getNonConformLoadSchedule()
	 * @generated
	 */
	EReference getNonConformLoadSchedule_NonConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.InductionMotorLoad <em>Induction Motor Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Induction Motor Load</em>'.
	 * @see CPSM.InductionMotorLoad
	 * @generated
	 */
	EClass getInductionMotorLoad();

	/**
	 * Returns the meta object for class '{@link CPSM.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see CPSM.ConformLoad
	 * @generated
	 */
	EClass getConformLoad();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CPSM.ConformLoad#getLoadGroup()
	 * @see #getConformLoad()
	 * @generated
	 */
	EReference getConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link CPSM.EquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Network</em>'.
	 * @see CPSM.EquivalentNetwork
	 * @generated
	 */
	EClass getEquivalentNetwork();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Equipments</em>'.
	 * @see CPSM.EquivalentNetwork#getEquivalentEquipments()
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	EReference getEquivalentNetwork_EquivalentEquipments();

	/**
	 * Returns the meta object for class '{@link CPSM.EquivalentShunt <em>Equivalent Shunt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Shunt</em>'.
	 * @see CPSM.EquivalentShunt
	 * @generated
	 */
	EClass getEquivalentShunt();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EquivalentShunt#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CPSM.EquivalentShunt#getB()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_B();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EquivalentShunt#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CPSM.EquivalentShunt#getG()
	 * @see #getEquivalentShunt()
	 * @generated
	 */
	EAttribute getEquivalentShunt_G();

	/**
	 * Returns the meta object for class '{@link CPSM.EquivalentEquipment <em>Equivalent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Equipment</em>'.
	 * @see CPSM.EquivalentEquipment
	 * @generated
	 */
	EClass getEquivalentEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equivalent Network</em>'.
	 * @see CPSM.EquivalentEquipment#getEquivalentNetwork()
	 * @see #getEquivalentEquipment()
	 * @generated
	 */
	EReference getEquivalentEquipment_EquivalentNetwork();

	/**
	 * Returns the meta object for class '{@link CPSM.EquivalentBranch <em>Equivalent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Branch</em>'.
	 * @see CPSM.EquivalentBranch
	 * @generated
	 */
	EClass getEquivalentBranch();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EquivalentBranch#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CPSM.EquivalentBranch#getX()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_X();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.EquivalentBranch#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CPSM.EquivalentBranch#getR()
	 * @see #getEquivalentBranch()
	 * @generated
	 */
	EAttribute getEquivalentBranch_R();

	/**
	 * Returns the meta object for class '{@link CPSM.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Object</em>'.
	 * @see CPSM.IdentifiedObject
	 * @generated
	 */
	EClass getIdentifiedObject();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IdentifiedObject#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see CPSM.IdentifiedObject#getPathName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_PathName();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IdentifiedObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CPSM.IdentifiedObject#getDescription()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IdentifiedObject#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see CPSM.IdentifiedObject#getAliasName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_AliasName();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.IdentifiedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CPSM.IdentifiedObject#getName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	EAttribute getIdentifiedObject_Name();

	/**
	 * Returns the meta object for class '{@link CPSM.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see CPSM.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.Terminal#getMeasurements()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Measurements();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see CPSM.Terminal#getRegulatingControl()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_RegulatingControl();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see CPSM.Terminal#getConnectivityNode()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConnectivityNode();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CPSM.Terminal#getConductingEquipment()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_ConductingEquipment();

	/**
	 * Returns the meta object for class '{@link CPSM.BaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Voltage</em>'.
	 * @see CPSM.BaseVoltage
	 * @generated
	 */
	EClass getBaseVoltage();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see CPSM.BaseVoltage#getNominalVoltage()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EAttribute getBaseVoltage_NominalVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment</em>'.
	 * @see CPSM.BaseVoltage#getConductingEquipment()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_ConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Level</em>'.
	 * @see CPSM.BaseVoltage#getVoltageLevel()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	EReference getBaseVoltage_VoltageLevel();

	/**
	 * Returns the meta object for class '{@link CPSM.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Interval Schedule</em>'.
	 * @see CPSM.RegularIntervalSchedule
	 * @generated
	 */
	EClass getRegularIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.RegularIntervalSchedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see CPSM.RegularIntervalSchedule#getEndTime()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_EndTime();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CPSM.RegularIntervalSchedule#getTimePoints()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EReference getRegularIntervalSchedule_TimePoints();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Step</em>'.
	 * @see CPSM.RegularIntervalSchedule#getTimeStep()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	EAttribute getRegularIntervalSchedule_TimeStep();

	/**
	 * Returns the meta object for class '{@link CPSM.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node Container</em>'.
	 * @see CPSM.ConnectivityNodeContainer
	 * @generated
	 */
	EClass getConnectivityNodeContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see CPSM.ConnectivityNodeContainer#getConnectivityNodes()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	EReference getConnectivityNodeContainer_ConnectivityNodes();

	/**
	 * Returns the meta object for class '{@link CPSM.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see CPSM.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Unit#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.Unit#getMeasurements()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Container</em>'.
	 * @see CPSM.EquipmentContainer
	 * @generated
	 */
	EClass getEquipmentContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.EquipmentContainer#getContains_Equipments <em>Contains Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Equipments</em>'.
	 * @see CPSM.EquipmentContainer#getContains_Equipments()
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	EReference getEquipmentContainer_Contains_Equipments();

	/**
	 * Returns the meta object for class '{@link CPSM.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Level</em>'.
	 * @see CPSM.VoltageLevel
	 * @generated
	 */
	EClass getVoltageLevel();

	/**
	 * Returns the meta object for the reference '{@link CPSM.VoltageLevel#getMemberOf_Substation <em>Member Of Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Substation</em>'.
	 * @see CPSM.VoltageLevel#getMemberOf_Substation()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_MemberOf_Substation();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Limit</em>'.
	 * @see CPSM.VoltageLevel#getLowVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_LowVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Limit</em>'.
	 * @see CPSM.VoltageLevel#getHighVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EAttribute getVoltageLevel_HighVoltageLimit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CPSM.VoltageLevel#getBaseVoltage()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_BaseVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.VoltageLevel#getContains_Bays <em>Contains Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Bays</em>'.
	 * @see CPSM.VoltageLevel#getContains_Bays()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	EReference getVoltageLevel_Contains_Bays();

	/**
	 * Returns the meta object for class '{@link CPSM.Bay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay</em>'.
	 * @see CPSM.Bay
	 * @generated
	 */
	EClass getBay();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Bay#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Voltage Level</em>'.
	 * @see CPSM.Bay#getMemberOf_VoltageLevel()
	 * @see #getBay()
	 * @generated
	 */
	EReference getBay_MemberOf_VoltageLevel();

	/**
	 * Returns the meta object for class '{@link CPSM.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Geographical Region</em>'.
	 * @see CPSM.SubGeographicalRegion
	 * @generated
	 */
	EClass getSubGeographicalRegion();

	/**
	 * Returns the meta object for the reference '{@link CPSM.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.SubGeographicalRegion#getRegion()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Region();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see CPSM.SubGeographicalRegion#getLines()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Lines();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substations</em>'.
	 * @see CPSM.SubGeographicalRegion#getSubstations()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	EReference getSubGeographicalRegion_Substations();

	/**
	 * Returns the meta object for class '{@link CPSM.RegularTimePoint <em>Regular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Time Point</em>'.
	 * @see CPSM.RegularTimePoint
	 * @generated
	 */
	EClass getRegularTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.RegularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see CPSM.RegularTimePoint#getValue1()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value1();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CPSM.RegularTimePoint#getSequenceNumber()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.RegularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see CPSM.RegularTimePoint#getValue2()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EAttribute getRegularTimePoint_Value2();

	/**
	 * Returns the meta object for the reference '{@link CPSM.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see CPSM.RegularTimePoint#getIntervalSchedule()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	EReference getRegularTimePoint_IntervalSchedule();

	/**
	 * Returns the meta object for class '{@link CPSM.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CPSM.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Equipment#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Equipment Container</em>'.
	 * @see CPSM.Equipment#getMemberOf_EquipmentContainer()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_MemberOf_EquipmentContainer();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Set</em>'.
	 * @see CPSM.Equipment#getOperationalLimitSet()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_OperationalLimitSet();

	/**
	 * Returns the meta object for class '{@link CPSM.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see CPSM.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CPSM.Substation#getRegion()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Region();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Substation#getContains_VoltageLevels <em>Contains Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Voltage Levels</em>'.
	 * @see CPSM.Substation#getContains_VoltageLevels()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Contains_VoltageLevels();

	/**
	 * Returns the meta object for class '{@link CPSM.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve</em>'.
	 * @see CPSM.Curve
	 * @generated
	 */
	EClass getCurve();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Curve#getY2Unit <em>Y2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Unit</em>'.
	 * @see CPSM.Curve#getY2Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y2Unit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Curve#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see CPSM.Curve#getXUnit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_XUnit();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Curve#getCurveScheduleDatas <em>Curve Schedule Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curve Schedule Datas</em>'.
	 * @see CPSM.Curve#getCurveScheduleDatas()
	 * @see #getCurve()
	 * @generated
	 */
	EReference getCurve_CurveScheduleDatas();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Curve#getCurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Style</em>'.
	 * @see CPSM.Curve#getCurveStyle()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_CurveStyle();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Curve#getY1Unit <em>Y1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Unit</em>'.
	 * @see CPSM.Curve#getY1Unit()
	 * @see #getCurve()
	 * @generated
	 */
	EAttribute getCurve_Y1Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see CPSM.PowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResource();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.PowerSystemResource#getContains_Measurements <em>Contains Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Measurements</em>'.
	 * @see CPSM.PowerSystemResource#getContains_Measurements()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResource_Contains_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Interval Schedule</em>'.
	 * @see CPSM.BasicIntervalSchedule
	 * @generated
	 */
	EClass getBasicIntervalSchedule();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.BasicIntervalSchedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see CPSM.BasicIntervalSchedule#getStartTime()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Unit</em>'.
	 * @see CPSM.BasicIntervalSchedule#getValue1Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value1Unit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Unit</em>'.
	 * @see CPSM.BasicIntervalSchedule#getValue2Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	EAttribute getBasicIntervalSchedule_Value2Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.CurveData <em>Curve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Data</em>'.
	 * @see CPSM.CurveData
	 * @generated
	 */
	EClass getCurveData();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.CurveData#getY2value <em>Y2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2value</em>'.
	 * @see CPSM.CurveData#getY2value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y2value();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.CurveData#getXvalue <em>Xvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvalue</em>'.
	 * @see CPSM.CurveData#getXvalue()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Xvalue();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.CurveData#getY1value <em>Y1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1value</em>'.
	 * @see CPSM.CurveData#getY1value()
	 * @see #getCurveData()
	 * @generated
	 */
	EAttribute getCurveData_Y1value();

	/**
	 * Returns the meta object for the reference '{@link CPSM.CurveData#getCurveSchedule <em>Curve Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curve Schedule</em>'.
	 * @see CPSM.CurveData#getCurveSchedule()
	 * @see #getCurveData()
	 * @generated
	 */
	EReference getCurveData_CurveSchedule();

	/**
	 * Returns the meta object for class '{@link CPSM.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Region</em>'.
	 * @see CPSM.GeographicalRegion
	 * @generated
	 */
	EClass getGeographicalRegion();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see CPSM.GeographicalRegion#getRegions()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	EReference getGeographicalRegion_Regions();

	/**
	 * Returns the meta object for class '{@link CPSM.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conducting Equipment</em>'.
	 * @see CPSM.ConductingEquipment
	 * @generated
	 */
	EClass getConductingEquipment();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CPSM.ConductingEquipment#getBaseVoltage()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_BaseVoltage();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see CPSM.ConductingEquipment#getTerminals()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_Terminals();

	/**
	 * Returns the meta object for class '{@link CPSM.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see CPSM.ControlArea
	 * @generated
	 */
	EClass getControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CPSM.ControlArea#getControlAreaGeneratingUnit()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ControlArea#getNetInterchange <em>Net Interchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Interchange</em>'.
	 * @see CPSM.ControlArea#getNetInterchange()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_NetInterchange();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlArea#getEnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Area</em>'.
	 * @see CPSM.ControlArea#getEnergyArea()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_EnergyArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see CPSM.ControlArea#getTieFlow()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_TieFlow();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ControlArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.ControlArea#getType()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_Type();

	/**
	 * Returns the meta object for class '{@link CPSM.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see CPSM.TieFlow
	 * @generated
	 */
	EClass getTieFlow();

	/**
	 * Returns the meta object for the reference '{@link CPSM.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.TieFlow#getControlArea()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_ControlArea();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CPSM.TieFlow#isPositiveFlowIn()
	 * @see #getTieFlow()
	 * @generated
	 */
	EAttribute getTieFlow_PositiveFlowIn();

	/**
	 * Returns the meta object for class '{@link CPSM.ControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area Generating Unit</em>'.
	 * @see CPSM.ControlAreaGeneratingUnit
	 * @generated
	 */
	EClass getControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.ControlAreaGeneratingUnit#getControlArea()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_ControlArea();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CPSM.ControlAreaGeneratingUnit#getGeneratingUnit()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_GeneratingUnit();

	/**
	 * Returns the meta object for class '{@link CPSM.ConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node</em>'.
	 * @see CPSM.ConnectivityNode
	 * @generated
	 */
	EClass getConnectivityNode();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see CPSM.ConnectivityNode#getTerminals()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_Terminals();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ConnectivityNode#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Equipment Container</em>'.
	 * @see CPSM.ConnectivityNode#getMemberOf_EquipmentContainer()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	EReference getConnectivityNode_MemberOf_EquipmentContainer();

	/**
	 * Returns the meta object for enum '{@link CPSM.GeneratorControlSource <em>Generator Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Source</em>'.
	 * @see CPSM.GeneratorControlSource
	 * @generated
	 */
	EEnum getGeneratorControlSource();

	/**
	 * Returns the meta object for enum '{@link CPSM.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Operating Mode</em>'.
	 * @see CPSM.SynchronousMachineOperatingMode
	 * @generated
	 */
	EEnum getSynchronousMachineOperatingMode();

	/**
	 * Returns the meta object for enum '{@link CPSM.TapChangerKind <em>Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tap Changer Kind</em>'.
	 * @see CPSM.TapChangerKind
	 * @generated
	 */
	EEnum getTapChangerKind();

	/**
	 * Returns the meta object for enum '{@link CPSM.SVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVC Control Mode</em>'.
	 * @see CPSM.SVCControlMode
	 * @generated
	 */
	EEnum getSVCControlMode();

	/**
	 * Returns the meta object for enum '{@link CPSM.WindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Type</em>'.
	 * @see CPSM.WindingType
	 * @generated
	 */
	EEnum getWindingType();

	/**
	 * Returns the meta object for enum '{@link CPSM.SynchronousMachineType <em>Synchronous Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Type</em>'.
	 * @see CPSM.SynchronousMachineType
	 * @generated
	 */
	EEnum getSynchronousMachineType();

	/**
	 * Returns the meta object for enum '{@link CPSM.TransformerControlMode <em>Transformer Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Control Mode</em>'.
	 * @see CPSM.TransformerControlMode
	 * @generated
	 */
	EEnum getTransformerControlMode();

	/**
	 * Returns the meta object for enum '{@link CPSM.SeasonName <em>Season Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season Name</em>'.
	 * @see CPSM.SeasonName
	 * @generated
	 */
	EEnum getSeasonName();

	/**
	 * Returns the meta object for enum '{@link CPSM.CurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Curve Style</em>'.
	 * @see CPSM.CurveStyle
	 * @generated
	 */
	EEnum getCurveStyle();

	/**
	 * Returns the meta object for enum '{@link CPSM.ControlAreaTypeKind <em>Control Area Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Area Type Kind</em>'.
	 * @see CPSM.ControlAreaTypeKind
	 * @generated
	 */
	EEnum getControlAreaTypeKind();

	/**
	 * Returns the meta object for enum '{@link CPSM.UnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Symbol</em>'.
	 * @see CPSM.UnitSymbol
	 * @generated
	 */
	EEnum getUnitSymbol();

	/**
	 * Returns the meta object for data type '<em>Current Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Current Flow</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Electrical current (positive flow is out of the ConductingEquipment into the ConnectivityNode)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electrical current (positive flow is out of the ConductingEquipment into the ConnectivityNode)'"
	 * @generated
	 */
	EDataType getCurrentFlow();

	/**
	 * Returns the meta object for data type '<em>Active Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Power</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Product of RMS value of the voltage and the RMS value of the in-phase component of the current'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of RMS value of the voltage and the RMS value of the in-phase component of the current'"
	 * @generated
	 */
	EDataType getActivePower();

	/**
	 * Returns the meta object for data type '<em>Seconds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seconds</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Time, in seconds'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time, in seconds'"
	 * @generated
	 */
	EDataType getSeconds();

	/**
	 * Returns the meta object for data type '<em>Susceptance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Susceptance</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Imaginary part of admittance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Imaginary part of admittance.'"
	 * @generated
	 */
	EDataType getSusceptance();

	/**
	 * Returns the meta object for data type '<em>Conductance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conductance</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Factor by which voltage must be multiplied to give corresponding power lost from a circuit. Real part of admittance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factor by which voltage must be multiplied to give corresponding power lost from a circuit. Real part of admittance.'"
	 * @generated
	 */
	EDataType getConductance();

	/**
	 * Returns the meta object for data type '<em>Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resistance</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Resistance (real part of impedance).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resistance (real part of impedance).'"
	 * @generated
	 */
	EDataType getResistance();

	/**
	 * Returns the meta object for data type '<em>Per Cent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Per Cent</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Normally 0 - 100 on a defined base'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normally 0 - 100 on a defined base'"
	 * @generated
	 */
	EDataType getPerCent();

	/**
	 * Returns the meta object for data type '<em>Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactive Power</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Product of RMS value of the voltage and the RMS value of the quadrature component of the current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of RMS value of the voltage and the RMS value of the quadrature component of the current.'"
	 * @generated
	 */
	EDataType getReactivePower();

	/**
	 * Returns the meta object for data type '<em>Angle Degrees</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Degrees</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Measurement of angle in degrees'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement of angle in degrees'"
	 * @generated
	 */
	EDataType getAngleDegrees();

	/**
	 * Returns the meta object for data type '<em>Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Electrical voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electrical voltage.'"
	 * @generated
	 */
	EDataType getVoltage();

	/**
	 * Returns the meta object for data type '<em>Apparent Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Apparent Power</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Product of the RMS value of the voltage and the RMS value of the current'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product of the RMS value of the voltage and the RMS value of the current'"
	 * @generated
	 */
	EDataType getApparentPower();

	/**
	 * Returns the meta object for data type '<em>Reactance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactance</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Reactance (imaginary part of impedance), at rated frequency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactance (imaginary part of impedance), at rated frequency.'"
	 * @generated
	 */
	EDataType getReactance();

	/**
	 * Returns the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Voltage variation with reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage variation with reactive power'"
	 * @generated
	 */
	EDataType getVoltagePerReactivePower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CPSMFactory getCPSMFactory();

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
		 * The meta object literal for the '{@link CPSM.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ElementImpl
		 * @see CPSM.impl.CPSMPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__URI = eINSTANCE.getElement_URI();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MODEL = eINSTANCE.getElement_Model();

		/**
		 * The meta object literal for the '{@link CPSM.impl.IEC61970CIMVersionImpl <em>IEC61970CIM Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.IEC61970CIMVersionImpl
		 * @see CPSM.impl.CPSMPackageImpl#getIEC61970CIMVersion()
		 * @generated
		 */
		EClass IEC61970CIM_VERSION = eINSTANCE.getIEC61970CIMVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61970CIM_VERSION__VERSION = eINSTANCE.getIEC61970CIMVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61970CIM_VERSION__DATE = eINSTANCE.getIEC61970CIMVersion_Date();

		/**
		 * The meta object literal for the '{@link CPSM.impl.CommonPowerSystemModelImpl <em>Common Power System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CommonPowerSystemModelImpl
		 * @see CPSM.impl.CPSMPackageImpl#getCommonPowerSystemModel()
		 * @generated
		 */
		EClass COMMON_POWER_SYSTEM_MODEL = eINSTANCE.getCommonPowerSystemModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_POWER_SYSTEM_MODEL__ELEMENTS = eINSTANCE.getCommonPowerSystemModel_Elements();

		/**
		 * The meta object literal for the '{@link CPSM.impl.GrossToNetActivePowerCurveImpl <em>Gross To Net Active Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.GrossToNetActivePowerCurveImpl
		 * @see CPSM.impl.CPSMPackageImpl#getGrossToNetActivePowerCurve()
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
		 * The meta object literal for the '{@link CPSM.impl.HydroGeneratingUnitImpl <em>Hydro Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.HydroGeneratingUnitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getHydroGeneratingUnit()
		 * @generated
		 */
		EClass HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.impl.ThermalGeneratingUnitImpl <em>Thermal Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ThermalGeneratingUnitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getThermalGeneratingUnit()
		 * @generated
		 */
		EClass THERMAL_GENERATING_UNIT = eINSTANCE.getThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.impl.GeneratingUnitImpl <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.GeneratingUnitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getGeneratingUnit()
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
		 * The meta object literal for the '{@link CPSM.impl.OperationalLimitImpl <em>Operational Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.OperationalLimitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getOperationalLimit()
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
		 * The meta object literal for the '{@link CPSM.impl.OperationalLimitSetImpl <em>Operational Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.OperationalLimitSetImpl
		 * @see CPSM.impl.CPSMPackageImpl#getOperationalLimitSet()
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
		 * The meta object literal for the '{@link CPSM.impl.ActivePowerLimitImpl <em>Active Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ActivePowerLimitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getActivePowerLimit()
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
		 * The meta object literal for the '{@link CPSM.impl.ApparentPowerLimitImpl <em>Apparent Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ApparentPowerLimitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getApparentPowerLimit()
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
		 * The meta object literal for the '{@link CPSM.impl.VoltageLimitImpl <em>Voltage Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.VoltageLimitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getVoltageLimit()
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
		 * The meta object literal for the '{@link CPSM.impl.CurrentLimitImpl <em>Current Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CurrentLimitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getCurrentLimit()
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

		/**
		 * The meta object literal for the '{@link CPSM.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.PowerTransformerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getPowerTransformer()
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
		 * The meta object literal for the '{@link CPSM.impl.DisconnectorImpl <em>Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.DisconnectorImpl
		 * @see CPSM.impl.CPSMPackageImpl#getDisconnector()
		 * @generated
		 */
		EClass DISCONNECTOR = eINSTANCE.getDisconnector();

		/**
		 * The meta object literal for the '{@link CPSM.impl.SynchronousMachineImpl <em>Synchronous Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SynchronousMachineImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachine()
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
		 * The meta object literal for the '{@link CPSM.impl.BusbarSectionImpl <em>Busbar Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.BusbarSectionImpl
		 * @see CPSM.impl.CPSMPackageImpl#getBusbarSection()
		 * @generated
		 */
		EClass BUSBAR_SECTION = eINSTANCE.getBusbarSection();

		/**
		 * The meta object literal for the '{@link CPSM.impl.ShuntCompensatorImpl <em>Shunt Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ShuntCompensatorImpl
		 * @see CPSM.impl.CPSMPackageImpl#getShuntCompensator()
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
		 * The meta object literal for the '{@link CPSM.impl.LoadBreakSwitchImpl <em>Load Break Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LoadBreakSwitchImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLoadBreakSwitch()
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
		 * The meta object literal for the '{@link CPSM.impl.RegulatingCondEqImpl <em>Regulating Cond Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.RegulatingCondEqImpl
		 * @see CPSM.impl.CPSMPackageImpl#getRegulatingCondEq()
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
		 * The meta object literal for the '{@link CPSM.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EnergyConsumerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEnergyConsumer()
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
		 * The meta object literal for the '{@link CPSM.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.TransformerWindingImpl
		 * @see CPSM.impl.CPSMPackageImpl#getTransformerWinding()
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
		 * The meta object literal for the '{@link CPSM.impl.RegulatingControlImpl <em>Regulating Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.RegulatingControlImpl
		 * @see CPSM.impl.CPSMPackageImpl#getRegulatingControl()
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
		 * The meta object literal for the '{@link CPSM.impl.RegulationScheduleImpl <em>Regulation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.RegulationScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getRegulationSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.ACLineSegmentImpl <em>AC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ACLineSegmentImpl
		 * @see CPSM.impl.CPSMPackageImpl#getACLineSegment()
		 * @generated
		 */
		EClass AC_LINE_SEGMENT = eINSTANCE.getACLineSegment();

		/**
		 * The meta object literal for the '{@link CPSM.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SwitchImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSwitch()
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
		 * The meta object literal for the '{@link CPSM.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConductorImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConductor()
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
		 * The meta object literal for the '{@link CPSM.impl.ReactiveCapabilityCurveImpl <em>Reactive Capability Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ReactiveCapabilityCurveImpl
		 * @see CPSM.impl.CPSMPackageImpl#getReactiveCapabilityCurve()
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
		 * The meta object literal for the '{@link CPSM.impl.TapChangerImpl <em>Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.TapChangerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getTapChanger()
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
		 * The meta object literal for the '{@link CPSM.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LineImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLine()
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
		 * The meta object literal for the '{@link CPSM.impl.StaticVarCompensatorImpl <em>Static Var Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.StaticVarCompensatorImpl
		 * @see CPSM.impl.CPSMPackageImpl#getStaticVarCompensator()
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
		 * The meta object literal for the '{@link CPSM.impl.SeriesCompensatorImpl <em>Series Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SeriesCompensatorImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSeriesCompensator()
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
		 * The meta object literal for the '{@link CPSM.impl.BreakerImpl <em>Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.BreakerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getBreaker()
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
		 * The meta object literal for the '{@link CPSM.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.DiscreteValueImpl
		 * @see CPSM.impl.CPSMPackageImpl#getDiscreteValue()
		 * @generated
		 */
		EClass DISCRETE_VALUE = eINSTANCE.getDiscreteValue();

		/**
		 * The meta object literal for the '<em><b>Member Of Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_VALUE__MEMBER_OF_MEASUREMENT = eINSTANCE.getDiscreteValue_MemberOf_Measurement();

		/**
		 * The meta object literal for the '{@link CPSM.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.MeasurementImpl
		 * @see CPSM.impl.CPSMPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Member Of PSR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEMBER_OF_PSR = eINSTANCE.getMeasurement_MemberOf_PSR();

		/**
		 * The meta object literal for the '<em><b>Measurement Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_TYPE = eINSTANCE.getMeasurement_MeasurementType();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__TERMINAL = eINSTANCE.getMeasurement_Terminal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__UNIT = eINSTANCE.getMeasurement_Unit();

		/**
		 * The meta object literal for the '{@link CPSM.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.MeasurementValueImpl
		 * @see CPSM.impl.CPSMPackageImpl#getMeasurementValue()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE = eINSTANCE.getMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValue_MeasurementValueSource();

		/**
		 * The meta object literal for the '{@link CPSM.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.MeasurementValueSourceImpl
		 * @see CPSM.impl.CPSMPackageImpl#getMeasurementValueSource()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValueSource();

		/**
		 * The meta object literal for the '<em><b>Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = eINSTANCE.getMeasurementValueSource_MeasurementValues();

		/**
		 * The meta object literal for the '{@link CPSM.impl.AnalogImpl <em>Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.AnalogImpl
		 * @see CPSM.impl.CPSMPackageImpl#getAnalog()
		 * @generated
		 */
		EClass ANALOG = eINSTANCE.getAnalog();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG__POSITIVE_FLOW_IN = eINSTANCE.getAnalog_PositiveFlowIn();

		/**
		 * The meta object literal for the '<em><b>Contain Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG__CONTAIN_MEASUREMENT_VALUES = eINSTANCE.getAnalog_Contain_MeasurementValues();

		/**
		 * The meta object literal for the '{@link CPSM.impl.AnalogValueImpl <em>Analog Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.AnalogValueImpl
		 * @see CPSM.impl.CPSMPackageImpl#getAnalogValue()
		 * @generated
		 */
		EClass ANALOG_VALUE = eINSTANCE.getAnalogValue();

		/**
		 * The meta object literal for the '<em><b>Member Of Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_VALUE__MEMBER_OF_MEASUREMENT = eINSTANCE.getAnalogValue_MemberOf_Measurement();

		/**
		 * The meta object literal for the '{@link CPSM.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.MeasurementTypeImpl
		 * @see CPSM.impl.CPSMPackageImpl#getMeasurementType()
		 * @generated
		 */
		EClass MEASUREMENT_TYPE = eINSTANCE.getMeasurementType();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_TYPE__MEASUREMENTS = eINSTANCE.getMeasurementType_Measurements();

		/**
		 * The meta object literal for the '{@link CPSM.impl.DiscreteImpl <em>Discrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.DiscreteImpl
		 * @see CPSM.impl.CPSMPackageImpl#getDiscrete()
		 * @generated
		 */
		EClass DISCRETE = eINSTANCE.getDiscrete();

		/**
		 * The meta object literal for the '<em><b>Contain Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE__CONTAIN_MEASUREMENT_VALUES = eINSTANCE.getDiscrete_Contain_MeasurementValues();

		/**
		 * The meta object literal for the '{@link CPSM.impl.LimitSetImpl <em>Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LimitSetImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLimitSet()
		 * @generated
		 */
		EClass LIMIT_SET = eINSTANCE.getLimitSet();

		/**
		 * The meta object literal for the '<em><b>Is Percentage Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT_SET__IS_PERCENTAGE_LIMITS = eINSTANCE.getLimitSet_IsPercentageLimits();

		/**
		 * The meta object literal for the '{@link CPSM.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.NonConformLoadGroupImpl
		 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoadGroup()
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
		 * The meta object literal for the '{@link CPSM.impl.ConformLoadScheduleImpl <em>Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConformLoadScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConformLoadSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.CustomerLoadImpl <em>Customer Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CustomerLoadImpl
		 * @see CPSM.impl.CPSMPackageImpl#getCustomerLoad()
		 * @generated
		 */
		EClass CUSTOMER_LOAD = eINSTANCE.getCustomerLoad();

		/**
		 * The meta object literal for the '{@link CPSM.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.NonConformLoadImpl
		 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoad()
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
		 * The meta object literal for the '{@link CPSM.impl.DayTypeImpl <em>Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.DayTypeImpl
		 * @see CPSM.impl.CPSMPackageImpl#getDayType()
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
		 * The meta object literal for the '{@link CPSM.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SeasonImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSeason()
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
		 * The meta object literal for the '{@link CPSM.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LoadImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link CPSM.impl.StationSupplyImpl <em>Station Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.StationSupplyImpl
		 * @see CPSM.impl.CPSMPackageImpl#getStationSupply()
		 * @generated
		 */
		EClass STATION_SUPPLY = eINSTANCE.getStationSupply();

		/**
		 * The meta object literal for the '{@link CPSM.impl.SeasonDayTypeScheduleImpl <em>Season Day Type Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SeasonDayTypeScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSeasonDayTypeSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.LoadGroupImpl <em>Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LoadGroupImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLoadGroup()
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
		 * The meta object literal for the '{@link CPSM.impl.EnergyAreaImpl <em>Energy Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EnergyAreaImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEnergyArea()
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
		 * The meta object literal for the '{@link CPSM.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConformLoadGroupImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConformLoadGroup()
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
		 * The meta object literal for the '{@link CPSM.impl.LoadAreaImpl <em>Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LoadAreaImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLoadArea()
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
		 * The meta object literal for the '{@link CPSM.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SubLoadAreaImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSubLoadArea()
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
		 * The meta object literal for the '{@link CPSM.impl.LoadResponseCharacteristicImpl <em>Load Response Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.LoadResponseCharacteristicImpl
		 * @see CPSM.impl.CPSMPackageImpl#getLoadResponseCharacteristic()
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
		 * The meta object literal for the '{@link CPSM.impl.NonConformLoadScheduleImpl <em>Non Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.NonConformLoadScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getNonConformLoadSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.InductionMotorLoadImpl <em>Induction Motor Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.InductionMotorLoadImpl
		 * @see CPSM.impl.CPSMPackageImpl#getInductionMotorLoad()
		 * @generated
		 */
		EClass INDUCTION_MOTOR_LOAD = eINSTANCE.getInductionMotorLoad();

		/**
		 * The meta object literal for the '{@link CPSM.impl.ConformLoadImpl <em>Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConformLoadImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConformLoad()
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
		 * The meta object literal for the '{@link CPSM.impl.EquivalentNetworkImpl <em>Equivalent Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquivalentNetworkImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquivalentNetwork()
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
		 * The meta object literal for the '{@link CPSM.impl.EquivalentShuntImpl <em>Equivalent Shunt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquivalentShuntImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquivalentShunt()
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
		 * The meta object literal for the '{@link CPSM.impl.EquivalentEquipmentImpl <em>Equivalent Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquivalentEquipmentImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquivalentEquipment()
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
		 * The meta object literal for the '{@link CPSM.impl.EquivalentBranchImpl <em>Equivalent Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquivalentBranchImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquivalentBranch()
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

		/**
		 * The meta object literal for the '{@link CPSM.impl.IdentifiedObjectImpl <em>Identified Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.IdentifiedObjectImpl
		 * @see CPSM.impl.CPSMPackageImpl#getIdentifiedObject()
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
		 * The meta object literal for the '{@link CPSM.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.TerminalImpl
		 * @see CPSM.impl.CPSMPackageImpl#getTerminal()
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
		 * The meta object literal for the '{@link CPSM.impl.BaseVoltageImpl <em>Base Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.BaseVoltageImpl
		 * @see CPSM.impl.CPSMPackageImpl#getBaseVoltage()
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
		 * The meta object literal for the '{@link CPSM.impl.RegularIntervalScheduleImpl <em>Regular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.RegularIntervalScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getRegularIntervalSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.ConnectivityNodeContainerImpl <em>Connectivity Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConnectivityNodeContainerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConnectivityNodeContainer()
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
		 * The meta object literal for the '{@link CPSM.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.UnitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getUnit()
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
		 * The meta object literal for the '{@link CPSM.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquipmentContainerImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquipmentContainer()
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
		 * The meta object literal for the '{@link CPSM.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.VoltageLevelImpl
		 * @see CPSM.impl.CPSMPackageImpl#getVoltageLevel()
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
		 * The meta object literal for the '{@link CPSM.impl.BayImpl <em>Bay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.BayImpl
		 * @see CPSM.impl.CPSMPackageImpl#getBay()
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
		 * The meta object literal for the '{@link CPSM.impl.SubGeographicalRegionImpl <em>Sub Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SubGeographicalRegionImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSubGeographicalRegion()
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
		 * The meta object literal for the '{@link CPSM.impl.RegularTimePointImpl <em>Regular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.RegularTimePointImpl
		 * @see CPSM.impl.CPSMPackageImpl#getRegularTimePoint()
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
		 * The meta object literal for the '{@link CPSM.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.EquipmentImpl
		 * @see CPSM.impl.CPSMPackageImpl#getEquipment()
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
		 * The meta object literal for the '{@link CPSM.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.SubstationImpl
		 * @see CPSM.impl.CPSMPackageImpl#getSubstation()
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
		 * The meta object literal for the '{@link CPSM.impl.CurveImpl <em>Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CurveImpl
		 * @see CPSM.impl.CPSMPackageImpl#getCurve()
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
		 * The meta object literal for the '{@link CPSM.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.PowerSystemResourceImpl
		 * @see CPSM.impl.CPSMPackageImpl#getPowerSystemResource()
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
		 * The meta object literal for the '{@link CPSM.impl.BasicIntervalScheduleImpl <em>Basic Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.BasicIntervalScheduleImpl
		 * @see CPSM.impl.CPSMPackageImpl#getBasicIntervalSchedule()
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
		 * The meta object literal for the '{@link CPSM.impl.CurveDataImpl <em>Curve Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CurveDataImpl
		 * @see CPSM.impl.CPSMPackageImpl#getCurveData()
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
		 * The meta object literal for the '{@link CPSM.impl.GeographicalRegionImpl <em>Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.GeographicalRegionImpl
		 * @see CPSM.impl.CPSMPackageImpl#getGeographicalRegion()
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
		 * The meta object literal for the '{@link CPSM.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConductingEquipmentImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConductingEquipment()
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
		 * The meta object literal for the '{@link CPSM.impl.ControlAreaImpl <em>Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ControlAreaImpl
		 * @see CPSM.impl.CPSMPackageImpl#getControlArea()
		 * @generated
		 */
		EClass CONTROL_AREA = eINSTANCE.getControlArea();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlArea_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Net Interchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__NET_INTERCHANGE = eINSTANCE.getControlArea_NetInterchange();

		/**
		 * The meta object literal for the '<em><b>Energy Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__ENERGY_AREA = eINSTANCE.getControlArea_EnergyArea();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__TIE_FLOW = eINSTANCE.getControlArea_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__TYPE = eINSTANCE.getControlArea_Type();

		/**
		 * The meta object literal for the '{@link CPSM.impl.TieFlowImpl <em>Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.TieFlowImpl
		 * @see CPSM.impl.CPSMPackageImpl#getTieFlow()
		 * @generated
		 */
		EClass TIE_FLOW = eINSTANCE.getTieFlow();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__CONTROL_AREA = eINSTANCE.getTieFlow_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIE_FLOW__POSITIVE_FLOW_IN = eINSTANCE.getTieFlow_PositiveFlowIn();

		/**
		 * The meta object literal for the '{@link CPSM.impl.ControlAreaGeneratingUnitImpl <em>Control Area Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ControlAreaGeneratingUnitImpl
		 * @see CPSM.impl.CPSMPackageImpl#getControlAreaGeneratingUnit()
		 * @generated
		 */
		EClass CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = eINSTANCE.getControlAreaGeneratingUnit_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.impl.ConnectivityNodeImpl <em>Connectivity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.ConnectivityNodeImpl
		 * @see CPSM.impl.CPSMPackageImpl#getConnectivityNode()
		 * @generated
		 */
		EClass CONNECTIVITY_NODE = eINSTANCE.getConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__TERMINALS = eINSTANCE.getConnectivityNode_Terminals();

		/**
		 * The meta object literal for the '<em><b>Member Of Equipment Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER = eINSTANCE.getConnectivityNode_MemberOf_EquipmentContainer();

		/**
		 * The meta object literal for the '{@link CPSM.GeneratorControlSource <em>Generator Control Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.GeneratorControlSource
		 * @see CPSM.impl.CPSMPackageImpl#getGeneratorControlSource()
		 * @generated
		 */
		EEnum GENERATOR_CONTROL_SOURCE = eINSTANCE.getGeneratorControlSource();

		/**
		 * The meta object literal for the '{@link CPSM.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.SynchronousMachineOperatingMode
		 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachineOperatingMode()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_OPERATING_MODE = eINSTANCE.getSynchronousMachineOperatingMode();

		/**
		 * The meta object literal for the '{@link CPSM.TapChangerKind <em>Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.TapChangerKind
		 * @see CPSM.impl.CPSMPackageImpl#getTapChangerKind()
		 * @generated
		 */
		EEnum TAP_CHANGER_KIND = eINSTANCE.getTapChangerKind();

		/**
		 * The meta object literal for the '{@link CPSM.SVCControlMode <em>SVC Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.SVCControlMode
		 * @see CPSM.impl.CPSMPackageImpl#getSVCControlMode()
		 * @generated
		 */
		EEnum SVC_CONTROL_MODE = eINSTANCE.getSVCControlMode();

		/**
		 * The meta object literal for the '{@link CPSM.WindingType <em>Winding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.WindingType
		 * @see CPSM.impl.CPSMPackageImpl#getWindingType()
		 * @generated
		 */
		EEnum WINDING_TYPE = eINSTANCE.getWindingType();

		/**
		 * The meta object literal for the '{@link CPSM.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.SynchronousMachineType
		 * @see CPSM.impl.CPSMPackageImpl#getSynchronousMachineType()
		 * @generated
		 */
		EEnum SYNCHRONOUS_MACHINE_TYPE = eINSTANCE.getSynchronousMachineType();

		/**
		 * The meta object literal for the '{@link CPSM.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.TransformerControlMode
		 * @see CPSM.impl.CPSMPackageImpl#getTransformerControlMode()
		 * @generated
		 */
		EEnum TRANSFORMER_CONTROL_MODE = eINSTANCE.getTransformerControlMode();

		/**
		 * The meta object literal for the '{@link CPSM.SeasonName <em>Season Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.SeasonName
		 * @see CPSM.impl.CPSMPackageImpl#getSeasonName()
		 * @generated
		 */
		EEnum SEASON_NAME = eINSTANCE.getSeasonName();

		/**
		 * The meta object literal for the '{@link CPSM.CurveStyle <em>Curve Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.CurveStyle
		 * @see CPSM.impl.CPSMPackageImpl#getCurveStyle()
		 * @generated
		 */
		EEnum CURVE_STYLE = eINSTANCE.getCurveStyle();

		/**
		 * The meta object literal for the '{@link CPSM.ControlAreaTypeKind <em>Control Area Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.ControlAreaTypeKind
		 * @see CPSM.impl.CPSMPackageImpl#getControlAreaTypeKind()
		 * @generated
		 */
		EEnum CONTROL_AREA_TYPE_KIND = eINSTANCE.getControlAreaTypeKind();

		/**
		 * The meta object literal for the '{@link CPSM.UnitSymbol <em>Unit Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.UnitSymbol
		 * @see CPSM.impl.CPSMPackageImpl#getUnitSymbol()
		 * @generated
		 */
		EEnum UNIT_SYMBOL = eINSTANCE.getUnitSymbol();

		/**
		 * The meta object literal for the '<em>Current Flow</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getCurrentFlow()
		 * @generated
		 */
		EDataType CURRENT_FLOW = eINSTANCE.getCurrentFlow();

		/**
		 * The meta object literal for the '<em>Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getActivePower()
		 * @generated
		 */
		EDataType ACTIVE_POWER = eINSTANCE.getActivePower();

		/**
		 * The meta object literal for the '<em>Seconds</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getSeconds()
		 * @generated
		 */
		EDataType SECONDS = eINSTANCE.getSeconds();

		/**
		 * The meta object literal for the '<em>Susceptance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getSusceptance()
		 * @generated
		 */
		EDataType SUSCEPTANCE = eINSTANCE.getSusceptance();

		/**
		 * The meta object literal for the '<em>Conductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getConductance()
		 * @generated
		 */
		EDataType CONDUCTANCE = eINSTANCE.getConductance();

		/**
		 * The meta object literal for the '<em>Resistance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getResistance()
		 * @generated
		 */
		EDataType RESISTANCE = eINSTANCE.getResistance();

		/**
		 * The meta object literal for the '<em>Per Cent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getPerCent()
		 * @generated
		 */
		EDataType PER_CENT = eINSTANCE.getPerCent();

		/**
		 * The meta object literal for the '<em>Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getReactivePower()
		 * @generated
		 */
		EDataType REACTIVE_POWER = eINSTANCE.getReactivePower();

		/**
		 * The meta object literal for the '<em>Angle Degrees</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getAngleDegrees()
		 * @generated
		 */
		EDataType ANGLE_DEGREES = eINSTANCE.getAngleDegrees();

		/**
		 * The meta object literal for the '<em>Voltage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getVoltage()
		 * @generated
		 */
		EDataType VOLTAGE = eINSTANCE.getVoltage();

		/**
		 * The meta object literal for the '<em>Apparent Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getApparentPower()
		 * @generated
		 */
		EDataType APPARENT_POWER = eINSTANCE.getApparentPower();

		/**
		 * The meta object literal for the '<em>Reactance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getReactance()
		 * @generated
		 */
		EDataType REACTANCE = eINSTANCE.getReactance();

		/**
		 * The meta object literal for the '<em>Voltage Per Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.impl.CPSMPackageImpl#getVoltagePerReactivePower()
		 * @generated
		 */
		EDataType VOLTAGE_PER_REACTIVE_POWER = eINSTANCE.getVoltagePerReactivePower();

	}

} //CPSMPackage
