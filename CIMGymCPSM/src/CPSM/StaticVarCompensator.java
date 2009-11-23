/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link CPSM.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link CPSM.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link CPSM.StaticVarCompensator#getSlope <em>Slope</em>}</li>
 *   <li>{@link CPSM.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getStaticVarCompensator()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.'"
 * @generated
 */
public interface StaticVarCompensator extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Set Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #setVoltageSetPoint(double)
	 * @see CPSM.CPSMPackage#getStaticVarCompensator_VoltageSetPoint()
	 * @model dataType="CPSM.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.'"
	 * @generated
	 */
	double getVoltageSetPoint();

	/**
	 * Sets the value of the '{@link CPSM.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #getVoltageSetPoint()
	 * @generated
	 */
	void setVoltageSetPoint(double value);

	/**
	 * Returns the value of the '<em><b>SVC Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.SVCControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC Control Mode</em>' attribute.
	 * @see CPSM.SVCControlMode
	 * @see #setSVCControlMode(SVCControlMode)
	 * @see CPSM.CPSMPackage#getStaticVarCompensator_SVCControlMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='SVC control mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='SVC control mode.'"
	 * @generated
	 */
	SVCControlMode getSVCControlMode();

	/**
	 * Sets the value of the '{@link CPSM.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC Control Mode</em>' attribute.
	 * @see CPSM.SVCControlMode
	 * @see #getSVCControlMode()
	 * @generated
	 */
	void setSVCControlMode(SVCControlMode value);

	/**
	 * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #setCapacitiveRating(double)
	 * @see CPSM.CPSMPackage#getStaticVarCompensator_CapacitiveRating()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Maximum available capacitive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum available capacitive reactive power'"
	 * @generated
	 */
	double getCapacitiveRating();

	/**
	 * Sets the value of the '{@link CPSM.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #getCapacitiveRating()
	 * @generated
	 */
	void setCapacitiveRating(double value);

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #setSlope(double)
	 * @see CPSM.CPSMPackage#getStaticVarCompensator_Slope()
	 * @model dataType="CPSM.VoltagePerReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.'"
	 * @generated
	 */
	double getSlope();

	/**
	 * Sets the value of the '{@link CPSM.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(double value);

	/**
	 * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Rating</em>' attribute.
	 * @see #setInductiveRating(double)
	 * @see CPSM.CPSMPackage#getStaticVarCompensator_InductiveRating()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Maximum available inductive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum available inductive reactive power'"
	 * @generated
	 */
	double getInductiveRating();

	/**
	 * Sets the value of the '{@link CPSM.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inductive Rating</em>' attribute.
	 * @see #getInductiveRating()
	 * @generated
	 */
	void setInductiveRating(double value);

} // StaticVarCompensator
