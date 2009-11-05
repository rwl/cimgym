/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC61970CIM Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.IEC61970CIMVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link CPSM.IEC61970CIMVersion#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getIEC61970CIMVersion()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='This is the IEC 61970 CIM version number assigned to this UML model file.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the IEC 61970 CIM version number assigned to this UML model file.'"
 * @generated
 */
public interface IEC61970CIMVersion extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CPSM.CPSMPackage#getIEC61970CIMVersion_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CPSM.IEC61970CIMVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see CPSM.CPSMPackage#getIEC61970CIMVersion_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link CPSM.IEC61970CIMVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // IEC61970CIMVersion
