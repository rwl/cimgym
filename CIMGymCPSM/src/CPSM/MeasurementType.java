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
 * A representation of the model object '<em><b>Measurement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.MeasurementType#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getMeasurementType()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc. The MeasurementType.name shall be unique among all specified types and describe the type. The MeasurementType.aliasName is meant to be used for localization.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc. The MeasurementType.name shall be unique among all specified types and describe the type. The MeasurementType.aliasName is meant to be used for localization.'"
 * @generated
 */
public interface MeasurementType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Measurement}.
	 * It is bidirectional and its opposite is '{@link CPSM.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CPSM.CPSMPackage#getMeasurementType_Measurements()
	 * @see CPSM.Measurement#getMeasurementType
	 * @model opposite="MeasurementType"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The measurements associated with the Type'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The measurements associated with the Type' Profile\040documentation=''"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

} // MeasurementType
