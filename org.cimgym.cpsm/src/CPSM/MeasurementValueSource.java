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
 * A representation of the model object '<em><b>Measurement Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getMeasurementValueSource()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.'"
 * @generated
 */
public interface MeasurementValueSource extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CPSM.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CPSM.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see CPSM.CPSMPackage#getMeasurementValueSource_MeasurementValues()
	 * @see CPSM.MeasurementValue#getMeasurementValueSource
	 * @model opposite="MeasurementValueSource"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The MeasurementValues updated by the source'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The MeasurementValues updated by the source' Profile\040documentation=''"
	 * @generated
	 */
	EList<MeasurementValue> getMeasurementValues();

} // MeasurementValueSource
