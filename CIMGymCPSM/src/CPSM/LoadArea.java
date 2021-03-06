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
 * A representation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getLoadArea()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 * @generated
 */
public interface LoadArea extends EnergyArea {
	/**
	 * Returns the value of the '<em><b>Sub Load Areas</b></em>' reference list.
	 * The list contents are of type {@link CPSM.SubLoadArea}.
	 * It is bidirectional and its opposite is '{@link CPSM.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Areas</em>' reference list.
	 * @see CPSM.CPSMPackage#getLoadArea_SubLoadAreas()
	 * @see CPSM.SubLoadArea#getLoadArea
	 * @model opposite="LoadArea"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The SubLoadAreas in the LoadArea.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubLoadAreas in the LoadArea.' Profile\040documentation=''"
	 * @generated
	 */
	EList<SubLoadArea> getSubLoadAreas();

} // LoadArea
