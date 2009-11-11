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
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CPSM.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getConductingEquipment()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parts of the power system that are designed to carry current or that are conductively connected therewith. ConductingEquipment is contained within an EquipmentContainer that may be a Substation, or a VoltageLevel or a Bay within a Substation.'"
 * @generated
 */
public interface ConductingEquipment extends Equipment {
	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see CPSM.CPSMPackage#getConductingEquipment_BaseVoltage()
	 * @see CPSM.BaseVoltage#getConductingEquipment
	 * @model opposite="ConductingEquipment" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 * @generated
	 */
	BaseVoltage getBaseVoltage();

	/**
	 * Sets the value of the '{@link CPSM.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	void setBaseVoltage(BaseVoltage value);

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Terminal}.
	 * It is bidirectional and its opposite is '{@link CPSM.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see CPSM.CPSMPackage#getConductingEquipment_Terminals()
	 * @see CPSM.Terminal#getConductingEquipment
	 * @model opposite="ConductingEquipment"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes' Profile\040documentation=''"
	 * @generated
	 */
	EList<Terminal> getTerminals();

} // ConductingEquipment
