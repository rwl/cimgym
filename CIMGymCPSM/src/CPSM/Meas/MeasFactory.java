/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.Meas.MeasPackage
 * @generated
 */
public interface MeasFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasFactory eINSTANCE = CPSM.Meas.impl.MeasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Value</em>'.
	 * @generated
	 */
	DiscreteValue createDiscreteValue();

	/**
	 * Returns a new object of class '<em>Measurement Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value Source</em>'.
	 * @generated
	 */
	MeasurementValueSource createMeasurementValueSource();

	/**
	 * Returns a new object of class '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog</em>'.
	 * @generated
	 */
	Analog createAnalog();

	/**
	 * Returns a new object of class '<em>Analog Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Value</em>'.
	 * @generated
	 */
	AnalogValue createAnalogValue();

	/**
	 * Returns a new object of class '<em>Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Type</em>'.
	 * @generated
	 */
	MeasurementType createMeasurementType();

	/**
	 * Returns a new object of class '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete</em>'.
	 * @generated
	 */
	Discrete createDiscrete();

	/**
	 * Returns a new object of class '<em>Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit Set</em>'.
	 * @generated
	 */
	LimitSet createLimitSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeasPackage getMeasPackage();

} //MeasFactory
