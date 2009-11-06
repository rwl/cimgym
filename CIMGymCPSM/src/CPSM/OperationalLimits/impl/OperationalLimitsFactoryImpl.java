/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits.impl;

import CPSM.OperationalLimits.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalLimitsFactoryImpl extends EFactoryImpl implements OperationalLimitsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationalLimitsFactory init() {
		try {
			OperationalLimitsFactory theOperationalLimitsFactory = (OperationalLimitsFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#Package_OperationalLimits"); 
			if (theOperationalLimitsFactory != null) {
				return theOperationalLimitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationalLimitsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET: return createOperationalLimitSet();
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT: return createActivePowerLimit();
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT: return createApparentPowerLimit();
			case OperationalLimitsPackage.VOLTAGE_LIMIT: return createVoltageLimit();
			case OperationalLimitsPackage.CURRENT_LIMIT: return createCurrentLimit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet createOperationalLimitSet() {
		OperationalLimitSetImpl operationalLimitSet = new OperationalLimitSetImpl();
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimit createActivePowerLimit() {
		ActivePowerLimitImpl activePowerLimit = new ActivePowerLimitImpl();
		return activePowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimit createApparentPowerLimit() {
		ApparentPowerLimitImpl apparentPowerLimit = new ApparentPowerLimitImpl();
		return apparentPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimit createVoltageLimit() {
		VoltageLimitImpl voltageLimit = new VoltageLimitImpl();
		return voltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimit createCurrentLimit() {
		CurrentLimitImpl currentLimit = new CurrentLimitImpl();
		return currentLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsPackage getOperationalLimitsPackage() {
		return (OperationalLimitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationalLimitsPackage getPackage() {
		return OperationalLimitsPackage.eINSTANCE;
	}

} //OperationalLimitsFactoryImpl
