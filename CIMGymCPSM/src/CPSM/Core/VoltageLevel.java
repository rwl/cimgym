/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.VoltageLevel#getMemberOf_Substation <em>Member Of Substation</em>}</li>
 *   <li>{@link CPSM.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link CPSM.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link CPSM.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CPSM.Core.VoltageLevel#getContains_Bays <em>Contains Bays</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getVoltageLevel()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.'"
 * @generated
 */
public interface VoltageLevel extends EquipmentContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Member Of Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Substation#getContains_VoltageLevels <em>Contains Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Substation</em>' reference.
	 * @see #setMemberOf_Substation(Substation)
	 * @see CPSM.Core.CorePackage#getVoltageLevel_MemberOf_Substation()
	 * @see CPSM.Core.Substation#getContains_VoltageLevels
	 * @model opposite="Contains_VoltageLevels" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	Substation getMemberOf_Substation();

	/**
	 * Sets the value of the '{@link CPSM.Core.VoltageLevel#getMemberOf_Substation <em>Member Of Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Substation</em>' reference.
	 * @see #getMemberOf_Substation()
	 * @generated
	 */
	void setMemberOf_Substation(Substation value);

	/**
	 * Returns the value of the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #setLowVoltageLimit(double)
	 * @see CPSM.Core.CorePackage#getVoltageLevel_LowVoltageLimit()
	 * @model dataType="CPSM.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The bus bar\'s low voltage limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The bus bar\'s low voltage limit'"
	 * @generated
	 */
	double getLowVoltageLimit();

	/**
	 * Sets the value of the '{@link CPSM.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #getLowVoltageLimit()
	 * @generated
	 */
	void setLowVoltageLimit(double value);

	/**
	 * Returns the value of the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #setHighVoltageLimit(double)
	 * @see CPSM.Core.CorePackage#getVoltageLevel_HighVoltageLimit()
	 * @model dataType="CPSM.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The bus bar\'s high voltage limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The bus bar\'s high voltage limit'"
	 * @generated
	 */
	double getHighVoltageLimit();

	/**
	 * Sets the value of the '{@link CPSM.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #getHighVoltageLimit()
	 * @generated
	 */
	void setHighVoltageLimit(double value);

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see CPSM.Core.CorePackage#getVoltageLevel_BaseVoltage()
	 * @see CPSM.Core.BaseVoltage#getVoltageLevel
	 * @model opposite="VoltageLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The base voltage used for all equipment within the VoltageLevel.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The base voltage used for all equipment within the VoltageLevel.'"
	 * @generated
	 */
	BaseVoltage getBaseVoltage();

	/**
	 * Sets the value of the '{@link CPSM.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	void setBaseVoltage(BaseVoltage value);

	/**
	 * Returns the value of the '<em><b>Contains Bays</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.Bay}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Bay#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Bays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Bays</em>' reference list.
	 * @see CPSM.Core.CorePackage#getVoltageLevel_Contains_Bays()
	 * @see CPSM.Core.Bay#getMemberOf_VoltageLevel
	 * @model opposite="MemberOf_VoltageLevel"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Bay> getContains_Bays();

} // VoltageLevel
