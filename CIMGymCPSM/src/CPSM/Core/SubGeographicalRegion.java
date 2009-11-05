/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.Wires.Line;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.SubGeographicalRegion#getRegion <em>Region</em>}</li>
 *   <li>{@link CPSM.Core.SubGeographicalRegion#getLines <em>Lines</em>}</li>
 *   <li>{@link CPSM.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getSubGeographicalRegion()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A subset of a geographical region of a power system network model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A subset of a geographical region of a power system network model.'"
 * @generated
 */
public interface SubGeographicalRegion extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(GeographicalRegion)
	 * @see CPSM.Core.CorePackage#getSubGeographicalRegion_Region()
	 * @see CPSM.Core.GeographicalRegion#getRegions
	 * @model opposite="Regions" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	GeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link CPSM.Core.SubGeographicalRegion#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(GeographicalRegion value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Wires.Line}.
	 * It is bidirectional and its opposite is '{@link CPSM.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see CPSM.Core.CorePackage#getSubGeographicalRegion_Lines()
	 * @see CPSM.Wires.Line#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A Line can be contained by a SubGeographical Region.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Line can be contained by a SubGeographical Region.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Substations</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.Substation}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substations</em>' reference list.
	 * @see CPSM.Core.CorePackage#getSubGeographicalRegion_Substations()
	 * @see CPSM.Core.Substation#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.' Profile\040documentation=''"
	 * @generated
	 */
	EList<Substation> getSubstations();

} // SubGeographicalRegion
