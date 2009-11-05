/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import CPSM.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Wires.Switch#isNormalOpen <em>Normal Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Wires.WiresPackage#getSwitch()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A generic device designed to close, or open, or both, one or more electric circuits.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generic device designed to close, or open, or both, one or more electric circuits.'"
 * @generated
 */
public interface Switch extends ConductingEquipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #setNormalOpen(boolean)
	 * @see CPSM.Wires.WiresPackage#getSwitch_NormalOpen()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurment the Discrete.normalValue is expected to match with the Switch.normalOpen.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurment the Discrete.normalValue is expected to match with the Switch.normalOpen.'"
	 * @generated
	 */
	boolean isNormalOpen();

	/**
	 * Sets the value of the '{@link CPSM.Wires.Switch#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isNormalOpen()
	 * @generated
	 */
	void setNormalOpen(boolean value);

} // Switch
