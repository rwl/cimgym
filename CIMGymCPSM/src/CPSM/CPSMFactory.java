/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.CPSMPackage
 * @generated
 */
public interface CPSMFactory extends EFactory {
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
	CPSMFactory eINSTANCE = CPSM.impl.CPSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IEC61970CIM Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IEC61970CIM Version</em>'.
	 * @generated
	 */
	IEC61970CIMVersion createIEC61970CIMVersion();

	/**
	 * Returns a new object of class '<em>Common Power System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Power System Model</em>'.
	 * @generated
	 */
	CommonPowerSystemModel createCommonPowerSystemModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CPSMPackage getCPSMPackage();

} //CPSMFactory
