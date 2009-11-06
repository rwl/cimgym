/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Element#getURI <em>URI</em>}</li>
 *   <li>{@link CPSM.Element#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see CPSM.CPSMPackage#getElement_URI()
	 * @model id="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link CPSM.Element#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CPSM.CommonPowerSystemModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(CommonPowerSystemModel)
	 * @see CPSM.CPSMPackage#getElement_Model()
	 * @see CPSM.CommonPowerSystemModel#getElements
	 * @model opposite="Elements" required="true" transient="false"
	 * @generated
	 */
	CommonPowerSystemModel getModel();

	/**
	 * Sets the value of the '{@link CPSM.Element#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(CommonPowerSystemModel value);

} // Element
