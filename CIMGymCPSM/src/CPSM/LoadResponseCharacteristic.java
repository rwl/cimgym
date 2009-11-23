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
 * A representation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link CPSM.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link CPSM.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link CPSM.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link CPSM.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.'"
 * @generated
 */
public interface LoadResponseCharacteristic extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #setPFrequencyExponent(float)
	 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic_PFrequencyExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Exponent of per unit frequency effecting active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit frequency effecting active power'"
	 * @generated
	 */
	float getPFrequencyExponent();

	/**
	 * Sets the value of the '{@link CPSM.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #getPFrequencyExponent()
	 * @generated
	 */
	void setPFrequencyExponent(float value);

	/**
	 * Returns the value of the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #setQVoltageExponent(float)
	 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic_QVoltageExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Exponent of per unit voltage effecting reactive power.   This model used only when \"useExponentModel\" is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit voltage effecting reactive power.   This model used only when \"useExponentModel\" is true.'"
	 * @generated
	 */
	float getQVoltageExponent();

	/**
	 * Sets the value of the '{@link CPSM.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #getQVoltageExponent()
	 * @generated
	 */
	void setQVoltageExponent(float value);

	/**
	 * Returns the value of the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #setQFrequencyExponent(float)
	 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic_QFrequencyExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Exponent of per unit frequency effecting reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit frequency effecting reactive power'"
	 * @generated
	 */
	float getQFrequencyExponent();

	/**
	 * Sets the value of the '{@link CPSM.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #getQFrequencyExponent()
	 * @generated
	 */
	void setQFrequencyExponent(float value);

	/**
	 * Returns the value of the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #setPVoltageExponent(float)
	 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic_PVoltageExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Exponent of per unit voltage effecting real power.   This model used only when \"useExponentModel\" is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit voltage effecting real power.   This model used only when \"useExponentModel\" is true.'"
	 * @generated
	 */
	float getPVoltageExponent();

	/**
	 * Sets the value of the '{@link CPSM.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #getPVoltageExponent()
	 * @generated
	 */
	void setPVoltageExponent(float value);

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
	 * The list contents are of type {@link CPSM.EnergyConsumer}.
	 * It is bidirectional and its opposite is '{@link CPSM.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference list.
	 * @see CPSM.CPSMPackage#getLoadResponseCharacteristic_EnergyConsumer()
	 * @see CPSM.EnergyConsumer#getLoadResponse
	 * @model opposite="LoadResponse"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The set of loads that have the response characteristics.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The set of loads that have the response characteristics.' Profile\040documentation=''"
	 * @generated
	 */
	EList<EnergyConsumer> getEnergyConsumer();

} // LoadResponseCharacteristic
