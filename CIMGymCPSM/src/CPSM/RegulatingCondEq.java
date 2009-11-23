/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getRegulatingCondEq()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='RegulatingCondEq is a type of ConductingEquipment that can regulate Measurements and have a RegulationSchedule.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='RegulatingCondEq is a type of ConductingEquipment that can regulate Measurements and have a RegulationSchedule.'"
 * @generated
 */
public interface RegulatingCondEq extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see CPSM.CPSMPackage#getRegulatingCondEq_RegulatingControl()
	 * @see CPSM.RegulatingControl#getRegulatingCondEq
	 * @model opposite="RegulatingCondEq"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='copy from ...'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='copy from ...'"
	 * @generated
	 */
	RegulatingControl getRegulatingControl();

	/**
	 * Sets the value of the '{@link CPSM.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	void setRegulatingControl(RegulatingControl value);

} // RegulatingCondEq
