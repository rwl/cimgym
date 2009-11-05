/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import CPSM.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getLoadGroup()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 * @generated
 */
public interface LoadGroup extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Area</em>' reference.
	 * @see #setSubLoadArea(SubLoadArea)
	 * @see CPSM.LoadModel.LoadModelPackage#getLoadGroup_SubLoadArea()
	 * @see CPSM.LoadModel.SubLoadArea#getLoadGroups
	 * @model opposite="LoadGroups" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 * @generated
	 */
	SubLoadArea getSubLoadArea();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Load Area</em>' reference.
	 * @see #getSubLoadArea()
	 * @generated
	 */
	void setSubLoadArea(SubLoadArea value);

} // LoadGroup
