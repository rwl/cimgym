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
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.SubLoadArea#getLoadGroups <em>Load Groups</em>}</li>
 *   <li>{@link CPSM.SubLoadArea#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getSubLoadArea()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 * @generated
 */
public interface SubLoadArea extends EnergyArea {
	/**
	 * Returns the value of the '<em><b>Load Groups</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadGroup}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Groups</em>' reference list.
	 * @see CPSM.CPSMPackage#getSubLoadArea_LoadGroups()
	 * @see CPSM.LoadGroup#getSubLoadArea
	 * @model opposite="SubLoadArea"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Loadgroups in the SubLoadArea.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Loadgroups in the SubLoadArea.' Profile\040documentation=''"
	 * @generated
	 */
	EList<LoadGroup> getLoadGroups();

	/**
	 * Returns the value of the '<em><b>Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Area</em>' reference.
	 * @see #setLoadArea(LoadArea)
	 * @see CPSM.CPSMPackage#getSubLoadArea_LoadArea()
	 * @see CPSM.LoadArea#getSubLoadAreas
	 * @model opposite="SubLoadAreas" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The LoadArea where the SubLoadArea belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The LoadArea where the SubLoadArea belongs.'"
	 * @generated
	 */
	LoadArea getLoadArea();

	/**
	 * Sets the value of the '{@link CPSM.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Area</em>' reference.
	 * @see #getLoadArea()
	 * @generated
	 */
	void setLoadArea(LoadArea value);

} // SubLoadArea
