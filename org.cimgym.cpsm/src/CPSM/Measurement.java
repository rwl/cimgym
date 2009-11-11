/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Measurement#getMemberOf_PSR <em>Member Of PSR</em>}</li>
 *   <li>{@link CPSM.Measurement#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link CPSM.Measurement#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CPSM.Measurement#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getMeasurement()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of  power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of  power flow measurements and a Breaker may contain a switch status measurement. \nThe PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement.\nSome Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment. \nTwo possible paths exist:\n1) Measurement-Terminal- ConnectivityNode-Terminal-ConductingEquipment\n2) Measurement-Terminal-ConductingEquipment\nAlternative 2 is the only allowed use. \nWhen the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.'"
 * @generated
 */
public interface Measurement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Member Of PSR</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.PowerSystemResource#getContains_Measurements <em>Contains Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of PSR</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of PSR</em>' reference.
	 * @see #setMemberOf_PSR(PowerSystemResource)
	 * @see CPSM.CPSMPackage#getMeasurement_MemberOf_PSR()
	 * @see CPSM.PowerSystemResource#getContains_Measurements
	 * @model opposite="Contains_Measurements" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The PowerSystemResource that contains the Measurement in the naming hierarchy'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The PowerSystemResource that contains the Measurement in the naming hierarchy'"
	 * @generated
	 */
	PowerSystemResource getMemberOf_PSR();

	/**
	 * Sets the value of the '{@link CPSM.Measurement#getMemberOf_PSR <em>Member Of PSR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of PSR</em>' reference.
	 * @see #getMemberOf_PSR()
	 * @generated
	 */
	void setMemberOf_PSR(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Measurement Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.MeasurementType#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Type</em>' reference.
	 * @see #setMeasurementType(MeasurementType)
	 * @see CPSM.CPSMPackage#getMeasurement_MeasurementType()
	 * @see CPSM.MeasurementType#getMeasurements
	 * @model opposite="Measurements" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The type for the Measurement'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type for the Measurement'"
	 * @generated
	 */
	MeasurementType getMeasurementType();

	/**
	 * Sets the value of the '{@link CPSM.Measurement#getMeasurementType <em>Measurement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Type</em>' reference.
	 * @see #getMeasurementType()
	 * @generated
	 */
	void setMeasurementType(MeasurementType value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CPSM.CPSMPackage#getMeasurement_Terminal()
	 * @see CPSM.Terminal#getMeasurements
	 * @model opposite="Measurements" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='One or more measurements may be associated with a terminal in the network'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One or more measurements may be associated with a terminal in the network'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CPSM.Measurement#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Unit#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see CPSM.CPSMPackage#getMeasurement_Unit()
	 * @see CPSM.Unit#getMeasurements
	 * @model opposite="Measurements" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Unit for the Measurement'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Unit for the Measurement'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link CPSM.Measurement#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Measurement
