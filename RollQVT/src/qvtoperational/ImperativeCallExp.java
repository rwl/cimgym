/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational;

import essentialocl.OperationCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtoperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtoperational.QvtoperationalPackage#getImperativeCallExp()
 * @model
 * @generated
 */
public interface ImperativeCallExp extends OperationCallExp {
	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(Boolean)
	 * @see qvtoperational.QvtoperationalPackage#getImperativeCallExp_IsVirtual()
	 * @model dataType="emof.Boolean"
	 * @generated
	 */
	Boolean getIsVirtual();

	/**
	 * Sets the value of the '{@link qvtoperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #getIsVirtual()
	 * @generated
	 */
	void setIsVirtual(Boolean value);

} // ImperativeCallExp
