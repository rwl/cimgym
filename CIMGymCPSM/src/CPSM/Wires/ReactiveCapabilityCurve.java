/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import CPSM.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachine <em>Initially Used By Synchronous Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Wires.WiresPackage#getReactiveCapabilityCurve()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactive power rating envelope versus the synchronous machine\'s active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.'"
 * @generated
 */
public interface ReactiveCapabilityCurve extends Curve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Initially Used By Synchronous Machine</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CPSM.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initially Used By Synchronous Machine</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initially Used By Synchronous Machine</em>' reference list.
	 * @see CPSM.Wires.WiresPackage#getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachine()
	 * @see CPSM.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve
	 * @model opposite="InitialReactiveCapabilityCurve"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Synchronous machines using this curve as default.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Synchronous machines using this curve as default.' Profile\040documentation=''"
	 * @generated
	 */
	EList<SynchronousMachine> getInitiallyUsedBySynchronousMachine();

} // ReactiveCapabilityCurve
