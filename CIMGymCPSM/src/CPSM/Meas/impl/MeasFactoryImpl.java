/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

import CPSM.Meas.*;

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
public class MeasFactoryImpl extends EFactoryImpl implements MeasFactory {
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
	public static MeasFactory init() {
		try {
			MeasFactory theMeasFactory = (MeasFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Meas"); 
			if (theMeasFactory != null) {
				return theMeasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasFactoryImpl() {
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
			case MeasPackage.DISCRETE_VALUE: return createDiscreteValue();
			case MeasPackage.MEASUREMENT_VALUE_SOURCE: return createMeasurementValueSource();
			case MeasPackage.ANALOG: return createAnalog();
			case MeasPackage.ANALOG_VALUE: return createAnalogValue();
			case MeasPackage.MEASUREMENT_TYPE: return createMeasurementType();
			case MeasPackage.DISCRETE: return createDiscrete();
			case MeasPackage.LIMIT_SET: return createLimitSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteValue createDiscreteValue() {
		DiscreteValueImpl discreteValue = new DiscreteValueImpl();
		return discreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource createMeasurementValueSource() {
		MeasurementValueSourceImpl measurementValueSource = new MeasurementValueSourceImpl();
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog createAnalog() {
		AnalogImpl analog = new AnalogImpl();
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue createAnalogValue() {
		AnalogValueImpl analogValue = new AnalogValueImpl();
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType createMeasurementType() {
		MeasurementTypeImpl measurementType = new MeasurementTypeImpl();
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete createDiscrete() {
		DiscreteImpl discrete = new DiscreteImpl();
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitSet createLimitSet() {
		LimitSetImpl limitSet = new LimitSetImpl();
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasPackage getMeasPackage() {
		return (MeasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasPackage getPackage() {
		return MeasPackage.eINSTANCE;
	}

} //MeasFactoryImpl
