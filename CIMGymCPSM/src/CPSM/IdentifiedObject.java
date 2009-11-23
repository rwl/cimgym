/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.IdentifiedObject#getPathName <em>Path Name</em>}</li>
 *   <li>{@link CPSM.IdentifiedObject#getDescription <em>Description</em>}</li>
 *   <li>{@link CPSM.IdentifiedObject#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link CPSM.IdentifiedObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getIdentifiedObject()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='This is a root class to provide common naming attributes for all classes needing naming attributes'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is a root class to provide common naming attributes for all classes needing naming attributes'"
 * @generated
 */
public interface IdentifiedObject extends Element {
	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see CPSM.CPSMPackage#getIdentifiedObject_PathName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The pathname is a system unique name composed from all IdentifiedObject.localNames in a naming hierarchy path from the object to the root.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pathname is a system unique name composed from all IdentifiedObject.localNames in a naming hierarchy path from the object to the root.'"
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link CPSM.IdentifiedObject#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CPSM.CPSMPackage#getIdentifiedObject_Description()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CPSM.IdentifiedObject#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see #setAliasName(String)
	 * @see CPSM.CPSMPackage#getIdentifiedObject_AliasName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The aliasName is free text human readable name of the object alternative to IdentifiedObject.name. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The aliasName is free text human readable name of the object alternative to IdentifiedObject.name. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getAliasName();

	/**
	 * Sets the value of the '{@link CPSM.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' attribute.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CPSM.CPSMPackage#getIdentifiedObject_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The name is a free text human readable name of the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name is a free text human readable name of the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CPSM.IdentifiedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IdentifiedObject
