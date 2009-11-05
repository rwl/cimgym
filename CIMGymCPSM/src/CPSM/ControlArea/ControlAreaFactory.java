/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.ControlArea;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.ControlArea.ControlAreaPackage
 * @generated
 */
public interface ControlAreaFactory extends EFactory {
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
	ControlAreaFactory eINSTANCE = CPSM.ControlArea.impl.ControlAreaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Area</em>'.
	 * @generated
	 */
	ControlArea createControlArea();

	/**
	 * Returns a new object of class '<em>Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tie Flow</em>'.
	 * @generated
	 */
	TieFlow createTieFlow();

	/**
	 * Returns a new object of class '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generating Unit</em>'.
	 * @generated
	 */
	ControlAreaGeneratingUnit createControlAreaGeneratingUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControlAreaPackage getControlAreaPackage();

} //ControlAreaFactory
