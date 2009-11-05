/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Generation.Production;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.Generation.Production.ProductionPackage
 * @generated
 */
public interface ProductionFactory extends EFactory {
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
	ProductionFactory eINSTANCE = CPSM.Generation.Production.impl.ProductionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * @generated
	 */
	GrossToNetActivePowerCurve createGrossToNetActivePowerCurve();

	/**
	 * Returns a new object of class '<em>Hydro Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Generating Unit</em>'.
	 * @generated
	 */
	HydroGeneratingUnit createHydroGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Thermal Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thermal Generating Unit</em>'.
	 * @generated
	 */
	ThermalGeneratingUnit createThermalGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generating Unit</em>'.
	 * @generated
	 */
	GeneratingUnit createGeneratingUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductionPackage getProductionPackage();

} //ProductionFactory
