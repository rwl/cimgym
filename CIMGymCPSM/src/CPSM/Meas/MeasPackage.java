/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas;

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
 * @see CPSM.Meas.MeasFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 * @generated
 */
public interface MeasPackage extends EPackage {
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
	String eNAME = "Meas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Meas";

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
	MeasPackage eINSTANCE = CPSM.Meas.impl.MeasPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Meas.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.MeasurementValueImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementValue()
	 * @generated
	 */
	int MEASUREMENT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Meas.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.DiscreteValueImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getDiscreteValue()
	 * @generated
	 */
	int DISCRETE_VALUE = 0;

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
	 * The meta object id for the '{@link CPSM.Meas.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.MeasurementImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Member Of PSR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEMBER_OF_PSR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CPSM.Meas.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.MeasurementValueSourceImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementValueSource()
	 * @generated
	 */
	int MEASUREMENT_VALUE_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_SOURCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Meas.impl.AnalogImpl <em>Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.AnalogImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getAnalog()
	 * @generated
	 */
	int ANALOG = 4;

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
	 * The meta object id for the '{@link CPSM.Meas.impl.AnalogValueImpl <em>Analog Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.AnalogValueImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getAnalogValue()
	 * @generated
	 */
	int ANALOG_VALUE = 5;

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
	 * The meta object id for the '{@link CPSM.Meas.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.MeasurementTypeImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementType()
	 * @generated
	 */
	int MEASUREMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CPSM.Meas.impl.DiscreteImpl <em>Discrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.DiscreteImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getDiscrete()
	 * @generated
	 */
	int DISCRETE = 7;

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
	 * The meta object id for the '{@link CPSM.Meas.impl.LimitSetImpl <em>Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Meas.impl.LimitSetImpl
	 * @see CPSM.Meas.impl.MeasPackageImpl#getLimitSet()
	 * @generated
	 */
	int LIMIT_SET = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__URI = CorePackage.IDENTIFIED_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__MODEL = CorePackage.IDENTIFIED_OBJECT__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET__IS_PERCENTAGE_LIMITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link CPSM.Meas.DiscreteValue <em>Discrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Value</em>'.
	 * @see CPSM.Meas.DiscreteValue
	 * @generated
	 */
	EClass getDiscreteValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.DiscreteValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Measurement</em>'.
	 * @see CPSM.Meas.DiscreteValue#getMemberOf_Measurement()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	EReference getDiscreteValue_MemberOf_Measurement();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see CPSM.Meas.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.Measurement#getMemberOf_PSR <em>Member Of PSR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of PSR</em>'.
	 * @see CPSM.Meas.Measurement#getMemberOf_PSR()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MemberOf_PSR();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Type</em>'.
	 * @see CPSM.Meas.Measurement#getMeasurementType()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementType();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CPSM.Meas.Measurement#getTerminal()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Terminal();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CPSM.Meas.Measurement#getUnit()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Unit();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value</em>'.
	 * @see CPSM.Meas.MeasurementValue
	 * @generated
	 */
	EClass getMeasurementValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Source</em>'.
	 * @see CPSM.Meas.MeasurementValue#getMeasurementValueSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EReference getMeasurementValue_MeasurementValueSource();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.MeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Source</em>'.
	 * @see CPSM.Meas.MeasurementValueSource
	 * @generated
	 */
	EClass getMeasurementValueSource();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CPSM.Meas.MeasurementValueSource#getMeasurementValues()
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	EReference getMeasurementValueSource_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.Analog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog</em>'.
	 * @see CPSM.Meas.Analog
	 * @generated
	 */
	EClass getAnalog();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CPSM.Meas.Analog#isPositiveFlowIn()
	 * @see #getAnalog()
	 * @generated
	 */
	EAttribute getAnalog_PositiveFlowIn();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Meas.Analog#getContain_MeasurementValues <em>Contain Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contain Measurement Values</em>'.
	 * @see CPSM.Meas.Analog#getContain_MeasurementValues()
	 * @see #getAnalog()
	 * @generated
	 */
	EReference getAnalog_Contain_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.AnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Value</em>'.
	 * @see CPSM.Meas.AnalogValue
	 * @generated
	 */
	EClass getAnalogValue();

	/**
	 * Returns the meta object for the reference '{@link CPSM.Meas.AnalogValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Of Measurement</em>'.
	 * @see CPSM.Meas.AnalogValue#getMemberOf_Measurement()
	 * @see #getAnalogValue()
	 * @generated
	 */
	EReference getAnalogValue_MemberOf_Measurement();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.MeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Type</em>'.
	 * @see CPSM.Meas.MeasurementType
	 * @generated
	 */
	EClass getMeasurementType();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Meas.MeasurementType#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CPSM.Meas.MeasurementType#getMeasurements()
	 * @see #getMeasurementType()
	 * @generated
	 */
	EReference getMeasurementType_Measurements();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete</em>'.
	 * @see CPSM.Meas.Discrete
	 * @generated
	 */
	EClass getDiscrete();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.Meas.Discrete#getContain_MeasurementValues <em>Contain Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contain Measurement Values</em>'.
	 * @see CPSM.Meas.Discrete#getContain_MeasurementValues()
	 * @see #getDiscrete()
	 * @generated
	 */
	EReference getDiscrete_Contain_MeasurementValues();

	/**
	 * Returns the meta object for class '{@link CPSM.Meas.LimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Set</em>'.
	 * @see CPSM.Meas.LimitSet
	 * @generated
	 */
	EClass getLimitSet();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage Limits</em>'.
	 * @see CPSM.Meas.LimitSet#isIsPercentageLimits()
	 * @see #getLimitSet()
	 * @generated
	 */
	EAttribute getLimitSet_IsPercentageLimits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasFactory getMeasFactory();

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
		 * The meta object literal for the '{@link CPSM.Meas.impl.DiscreteValueImpl <em>Discrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.DiscreteValueImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getDiscreteValue()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.MeasurementImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurement()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.MeasurementValueImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementValue()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.MeasurementValueSourceImpl <em>Measurement Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.MeasurementValueSourceImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementValueSource()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.AnalogImpl <em>Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.AnalogImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getAnalog()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.AnalogValueImpl <em>Analog Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.AnalogValueImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getAnalogValue()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.MeasurementTypeImpl <em>Measurement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.MeasurementTypeImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getMeasurementType()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.DiscreteImpl <em>Discrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.DiscreteImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getDiscrete()
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
		 * The meta object literal for the '{@link CPSM.Meas.impl.LimitSetImpl <em>Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Meas.impl.LimitSetImpl
		 * @see CPSM.Meas.impl.MeasPackageImpl#getLimitSet()
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

	}

} //MeasPackage
