/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.ControlArea;

import CPSM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ControlArea.TieFlow#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CPSM.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.ControlArea.ControlAreaPackage#getTieFlow()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A flow specification in terms of location and direction for a control area.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flow specification in terms of location and direction for a control area.'"
 * @generated
 */
public interface TieFlow extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CPSM.ControlArea.ControlAreaPackage#getTieFlow_ControlArea()
	 * @see CPSM.ControlArea.ControlArea#getTieFlow
	 * @model opposite="TieFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The control area of the tie flows.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area of the tie flows.'"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link CPSM.ControlArea.TieFlow#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #setPositiveFlowIn(boolean)
	 * @see CPSM.ControlArea.ControlAreaPackage#getTieFlow_PositiveFlowIn()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The flow is positive into the terminal.  A flow is positive if it is an import into the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The flow is positive into the terminal.  A flow is positive if it is an import into the control area.'"
	 * @generated
	 */
	boolean isPositiveFlowIn();

	/**
	 * Sets the value of the '{@link CPSM.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	void setPositiveFlowIn(boolean value);

} // TieFlow
