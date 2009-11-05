/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Meas.Discrete#getContain_MeasurementValues <em>Contain Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Meas.MeasPackage#getDiscrete()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.'"
 * @generated
 */
public interface Discrete extends Measurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Contain Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Meas.DiscreteValue}.
	 * It is bidirectional and its opposite is '{@link CPSM.Meas.DiscreteValue#getMemberOf_Measurement <em>Member Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain Measurement Values</em>' reference list.
	 * @see CPSM.Meas.MeasPackage#getDiscrete_Contain_MeasurementValues()
	 * @see CPSM.Meas.DiscreteValue#getMemberOf_Measurement
	 * @model opposite="MemberOf_Measurement"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The values connected to this measurement.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.' Profile\040documentation=''"
	 * @generated
	 */
	EList<DiscreteValue> getContain_MeasurementValues();

} // Discrete
