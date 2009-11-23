/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational;

import qvtrelation.RelationDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtoperational.MappingParameter#getRefinedDomain <em>Refined Domain</em>}</li>
 *   <li>{@link qvtoperational.MappingParameter#getExtent <em>Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtoperational.QvtoperationalPackage#getMappingParameter()
 * @model
 * @generated
 */
public interface MappingParameter extends VarParameter {
	/**
	 * Returns the value of the '<em><b>Refined Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Domain</em>' reference.
	 * @see #setRefinedDomain(RelationDomain)
	 * @see qvtoperational.QvtoperationalPackage#getMappingParameter_RefinedDomain()
	 * @model
	 * @generated
	 */
	RelationDomain getRefinedDomain();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingParameter#getRefinedDomain <em>Refined Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Domain</em>' reference.
	 * @see #getRefinedDomain()
	 * @generated
	 */
	void setRefinedDomain(RelationDomain value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(ModelParameter)
	 * @see qvtoperational.QvtoperationalPackage#getMappingParameter_Extent()
	 * @model
	 * @generated
	 */
	ModelParameter getExtent();

	/**
	 * Sets the value of the '{@link qvtoperational.MappingParameter#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(ModelParameter value);

} // MappingParameter
