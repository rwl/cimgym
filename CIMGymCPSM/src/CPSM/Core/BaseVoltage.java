/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CPSM.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CPSM.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getBaseVoltage()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Collection of BaseVoltages which is used to verify that the BusbarSection.BaseVoltage and other voltage attributes in the CIM are given a value existing in the collection.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Collection of BaseVoltages which is used to verify that the BusbarSection.BaseVoltage and other voltage attributes in the CIM are given a value existing in the collection.'"
 * @generated
 */
public interface BaseVoltage extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #setNominalVoltage(double)
	 * @see CPSM.Core.CorePackage#getBaseVoltage_NominalVoltage()
	 * @model dataType="CPSM.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The PowerSystemResource\'s base voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The PowerSystemResource\'s base voltage.'"
	 * @generated
	 */
	double getNominalVoltage();

	/**
	 * Sets the value of the '{@link CPSM.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #getNominalVoltage()
	 * @generated
	 */
	void setNominalVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.ConductingEquipment}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference list.
	 * @see CPSM.Core.CorePackage#getBaseVoltage_ConductingEquipment()
	 * @see CPSM.Core.ConductingEquipment#getBaseVoltage
	 * @model opposite="BaseVoltage"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Use association to ConductingEquipment only when there is no VoltageLevel container used.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ConductingEquipment> getConductingEquipment();

	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' reference list.
	 * @see CPSM.Core.CorePackage#getBaseVoltage_VoltageLevel()
	 * @see CPSM.Core.VoltageLevel#getBaseVoltage
	 * @model opposite="BaseVoltage"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The VoltageLevels having this BaseVoltage.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The VoltageLevels having this BaseVoltage.' Profile\040documentation=''"
	 * @generated
	 */
	EList<VoltageLevel> getVoltageLevel();

} // BaseVoltage
