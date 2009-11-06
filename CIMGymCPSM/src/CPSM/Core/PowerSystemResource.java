/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.Meas.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.PowerSystemResource#getContains_Measurements <em>Contains Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getPowerSystemResource()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A power system resource can be an item of equipment such as a Switch, an EquipmentContainer containing many individual items of equipment such as a \nSubstation, or an organisational entity such as Company or SubControlArea.  This provides for the nesting of collections of PowerSystemResources within other PowerSystemResources. For example, a Switch could be a member of a Substation and a Substation could be a member of a division of a Company.'"
 * @generated
 */
public interface PowerSystemResource extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Contains Measurements</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CPSM.Meas.Measurement#getMemberOf_PSR <em>Member Of PSR</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Measurements</em>' reference list.
	 * @see CPSM.Core.CorePackage#getPowerSystemResource_Contains_Measurements()
	 * @see CPSM.Meas.Measurement#getMemberOf_PSR
	 * @model opposite="MemberOf_PSR"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Measurements that are included in the naming hierarchy where the PSR is the containing object'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurements that are included in the naming hierarchy where the PSR is the containing object' Profile\040documentation=''"
	 * @generated
	 */
	EList<Measurement> getContains_Measurements();

} // PowerSystemResource
