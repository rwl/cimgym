/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Break Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Wires.WiresPackage#getLoadBreakSwitch()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.'"
 * @generated
 */
public interface LoadBreakSwitch extends Switch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(double)
	 * @see CPSM.Wires.WiresPackage#getLoadBreakSwitch_RatedCurrent()
	 * @model dataType="CPSM.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Current carrying capacity of a wire or cable under stated thermal conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current carrying capacity of a wire or cable under stated thermal conditions.'"
	 * @generated
	 */
	double getRatedCurrent();

	/**
	 * Sets the value of the '{@link CPSM.Wires.LoadBreakSwitch#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(double value);

} // LoadBreakSwitch
