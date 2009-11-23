/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.AnalogValue#getMemberOf_Measurement <em>Member Of Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getAnalogValue()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='AnalogValue represents an analog MeasurementValue.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AnalogValue represents an analog MeasurementValue.'"
 * @generated
 */
public interface AnalogValue extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Member Of Measurement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Analog#getContain_MeasurementValues <em>Contain Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Measurement</em>' reference.
	 * @see #setMemberOf_Measurement(Analog)
	 * @see CPSM.CPSMPackage#getAnalogValue_MemberOf_Measurement()
	 * @see CPSM.Analog#getContain_MeasurementValues
	 * @model opposite="Contain_MeasurementValues" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Measurement to which this value is connected.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement to which this value is connected.'"
	 * @generated
	 */
	Analog getMemberOf_Measurement();

	/**
	 * Sets the value of the '{@link CPSM.AnalogValue#getMemberOf_Measurement <em>Member Of Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Measurement</em>' reference.
	 * @see #getMemberOf_Measurement()
	 * @generated
	 */
	void setMemberOf_Measurement(Analog value);

} // AnalogValue
