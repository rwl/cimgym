/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Domain;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see CPSM.Domain.DomainFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The domain package is a data dictionary of quantities and units that define datatypes for attributes (properties) that may be used by any class in any other package.\n\nThis package contains the definition of primitive datatypes, including units of measure and permissible values. Each datatype contains a value attribute and an optional unit of measure, which is specified as a static variable initialized to the textual description of the unit of measure. The value of the \"units\" string may be country or customer specific. Typical values are given. Permissible values for enumerations are listed in the documentation for the attribute using UML constraint syntax inside curly braces. Lengths of variable strings are listed in the descriptive text where required.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The domain package is a data dictionary of quantities and units that define datatypes for attributes (properties) that may be used by any class in any other package.\n\nThis package contains the definition of primitive datatypes, including units of measure and permissible values. Each datatype contains a value attribute and an optional unit of measure, which is specified as a static variable initialized to the textual description of the unit of measure. The value of the \"units\" string may be country or customer specific. Typical values are given. Permissible values for enumerations are listed in the documentation for the attribute using UML constraint syntax inside curly braces. Lengths of variable strings are listed in the descriptive text where required.'"
 * @generated
 */
public interface DomainPackage extends EPackage {
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
	String eNAME = "Domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Domain";

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
	DomainPackage eINSTANCE = CPSM.Domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.UnitSymbol
	 * @see CPSM.Domain.impl.DomainPackageImpl#getUnitSymbol()
	 * @generated
	 */
	int UNIT_SYMBOL = 0;

	/**
	 * The meta object id for the '<em>Current Flow</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getCurrentFlow()
	 * @generated
	 */
	int CURRENT_FLOW = 1;

	/**
	 * The meta object id for the '<em>Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getActivePower()
	 * @generated
	 */
	int ACTIVE_POWER = 2;

	/**
	 * The meta object id for the '<em>Seconds</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getSeconds()
	 * @generated
	 */
	int SECONDS = 3;

	/**
	 * The meta object id for the '<em>Susceptance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getSusceptance()
	 * @generated
	 */
	int SUSCEPTANCE = 4;

	/**
	 * The meta object id for the '<em>Conductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getConductance()
	 * @generated
	 */
	int CONDUCTANCE = 5;

	/**
	 * The meta object id for the '<em>Resistance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getResistance()
	 * @generated
	 */
	int RESISTANCE = 6;

	/**
	 * The meta object id for the '<em>Per Cent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getPerCent()
	 * @generated
	 */
	int PER_CENT = 7;

	/**
	 * The meta object id for the '<em>Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getReactivePower()
	 * @generated
	 */
	int REACTIVE_POWER = 8;

	/**
	 * The meta object id for the '<em>Angle Degrees</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getAngleDegrees()
	 * @generated
	 */
	int ANGLE_DEGREES = 9;

	/**
	 * The meta object id for the '<em>Voltage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getVoltage()
	 * @generated
	 */
	int VOLTAGE = 10;

	/**
	 * The meta object id for the '<em>Apparent Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getApparentPower()
	 * @generated
	 */
	int APPARENT_POWER = 11;

	/**
	 * The meta object id for the '<em>Reactance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getReactance()
	 * @generated
	 */
	int REACTANCE = 12;

	/**
	 * The meta object id for the '<em>Voltage Per Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.Domain.impl.DomainPackageImpl#getVoltagePerReactivePower()
	 * @generated
	 */
	int VOLTAGE_PER_REACTIVE_POWER = 13;


	/**
	 * Returns the meta object for enum '{@link CPSM.Domain.UnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Symbol</em>'.
	 * @see CPSM.Domain.UnitSymbol
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
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link CPSM.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.UnitSymbol
		 * @see CPSM.Domain.impl.DomainPackageImpl#getUnitSymbol()
		 * @generated
		 */
		EEnum UNIT_SYMBOL = eINSTANCE.getUnitSymbol();

		/**
		 * The meta object literal for the '<em>Current Flow</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getCurrentFlow()
		 * @generated
		 */
		EDataType CURRENT_FLOW = eINSTANCE.getCurrentFlow();

		/**
		 * The meta object literal for the '<em>Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getActivePower()
		 * @generated
		 */
		EDataType ACTIVE_POWER = eINSTANCE.getActivePower();

		/**
		 * The meta object literal for the '<em>Seconds</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getSeconds()
		 * @generated
		 */
		EDataType SECONDS = eINSTANCE.getSeconds();

		/**
		 * The meta object literal for the '<em>Susceptance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getSusceptance()
		 * @generated
		 */
		EDataType SUSCEPTANCE = eINSTANCE.getSusceptance();

		/**
		 * The meta object literal for the '<em>Conductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getConductance()
		 * @generated
		 */
		EDataType CONDUCTANCE = eINSTANCE.getConductance();

		/**
		 * The meta object literal for the '<em>Resistance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getResistance()
		 * @generated
		 */
		EDataType RESISTANCE = eINSTANCE.getResistance();

		/**
		 * The meta object literal for the '<em>Per Cent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getPerCent()
		 * @generated
		 */
		EDataType PER_CENT = eINSTANCE.getPerCent();

		/**
		 * The meta object literal for the '<em>Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getReactivePower()
		 * @generated
		 */
		EDataType REACTIVE_POWER = eINSTANCE.getReactivePower();

		/**
		 * The meta object literal for the '<em>Angle Degrees</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getAngleDegrees()
		 * @generated
		 */
		EDataType ANGLE_DEGREES = eINSTANCE.getAngleDegrees();

		/**
		 * The meta object literal for the '<em>Voltage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getVoltage()
		 * @generated
		 */
		EDataType VOLTAGE = eINSTANCE.getVoltage();

		/**
		 * The meta object literal for the '<em>Apparent Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getApparentPower()
		 * @generated
		 */
		EDataType APPARENT_POWER = eINSTANCE.getApparentPower();

		/**
		 * The meta object literal for the '<em>Reactance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getReactance()
		 * @generated
		 */
		EDataType REACTANCE = eINSTANCE.getReactance();

		/**
		 * The meta object literal for the '<em>Voltage Per Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.Domain.impl.DomainPackageImpl#getVoltagePerReactivePower()
		 * @generated
		 */
		EDataType VOLTAGE_PER_REACTIVE_POWER = eINSTANCE.getVoltagePerReactivePower();

	}

} //DomainPackage
