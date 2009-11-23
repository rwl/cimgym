/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Analog#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link CPSM.Analog#getContain_MeasurementValues <em>Contain Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getAnalog()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Analog represents an analog Measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Analog represents an analog Measurement.'"
 * @generated
 */
public interface Analog extends Measurement {
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
	 * @see CPSM.CPSMPackage#getAnalog_PositiveFlowIn()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource.'"
	 * @generated
	 */
	boolean isPositiveFlowIn();

	/**
	 * Sets the value of the '{@link CPSM.Analog#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	void setPositiveFlowIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Contain Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CPSM.AnalogValue}.
	 * It is bidirectional and its opposite is '{@link CPSM.AnalogValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain Measurement Values</em>' reference list.
	 * @see CPSM.CPSMPackage#getAnalog_Contain_MeasurementValues()
	 * @see CPSM.AnalogValue#getMemberOf_Measurement
	 * @model opposite="MemberOf_Measurement"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The values connected to this measurement.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.' Profile\040documentation=''"
	 * @generated
	 */
	EList<AnalogValue> getContain_MeasurementValues();

} // Analog
