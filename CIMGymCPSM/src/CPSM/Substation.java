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
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Substation#getRegion <em>Region</em>}</li>
 *   <li>{@link CPSM.Substation#getContains_VoltageLevels <em>Contains Voltage Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getSubstation()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.'"
 * @generated
 */
public interface Substation extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(SubGeographicalRegion)
	 * @see CPSM.CPSMPackage#getSubstation_Region()
	 * @see CPSM.SubGeographicalRegion#getSubstations
	 * @model opposite="Substations" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	SubGeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link CPSM.Substation#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(SubGeographicalRegion value);

	/**
	 * Returns the value of the '<em><b>Contains Voltage Levels</b></em>' reference list.
	 * The list contents are of type {@link CPSM.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CPSM.VoltageLevel#getMemberOf_Substation <em>Member Of Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Voltage Levels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Voltage Levels</em>' reference list.
	 * @see CPSM.CPSMPackage#getSubstation_Contains_VoltageLevels()
	 * @see CPSM.VoltageLevel#getMemberOf_Substation
	 * @model opposite="MemberOf_Substation"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.' Profile\040documentation=''"
	 * @generated
	 */
	EList<VoltageLevel> getContains_VoltageLevels();

} // Substation
