/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas;

import CPSM.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Meas.MeasPackage#getMeasurementValue()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.'"
 * @generated
 */
public interface MeasurementValue extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Measurement Value Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Source</em>' reference.
	 * @see #setMeasurementValueSource(MeasurementValueSource)
	 * @see CPSM.Meas.MeasPackage#getMeasurementValue_MeasurementValueSource()
	 * @see CPSM.Meas.MeasurementValueSource#getMeasurementValues
	 * @model opposite="MeasurementValues" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reference to the type of source that updates the MeasurementValue, e.g. SCADA, CCLink, manual, etc. User conventions for the names of sources are contained in the introduction to IEC 61970-301.'"
	 * @generated
	 */
	MeasurementValueSource getMeasurementValueSource();

	/**
	 * Sets the value of the '{@link CPSM.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Source</em>' reference.
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	void setMeasurementValueSource(MeasurementValueSource value);

} // MeasurementValue
