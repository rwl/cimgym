/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.GeographicalRegion#getRegions <em>Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getGeographicalRegion()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A geographical region of a power system network model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A geographical region of a power system network model.'"
 * @generated
 */
public interface GeographicalRegion extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.SubGeographicalRegion}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' reference list.
	 * @see CPSM.Core.CorePackage#getGeographicalRegion_Regions()
	 * @see CPSM.Core.SubGeographicalRegion#getRegion
	 * @model opposite="Region"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.' Profile\040documentation=''"
	 * @generated
	 */
	EList<SubGeographicalRegion> getRegions();

} // GeographicalRegion
