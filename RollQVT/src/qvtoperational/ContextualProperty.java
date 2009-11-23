/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational;

import emof.Property;

import essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtoperational.ContextualProperty#getContext <em>Context</em>}</li>
 *   <li>{@link qvtoperational.ContextualProperty#getOverridden <em>Overridden</em>}</li>
 *   <li>{@link qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtoperational.QvtoperationalPackage#getContextualProperty()
 * @model
 * @generated
 */
public interface ContextualProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(emof.Class)
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_Context()
	 * @model required="true"
	 * @generated
	 */
	emof.Class getContext();

	/**
	 * Sets the value of the '{@link qvtoperational.ContextualProperty#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(emof.Class value);

	/**
	 * Returns the value of the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden</em>' reference.
	 * @see #setOverridden(Property)
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_Overridden()
	 * @model
	 * @generated
	 */
	Property getOverridden();

	/**
	 * Sets the value of the '{@link qvtoperational.ContextualProperty#getOverridden <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden</em>' reference.
	 * @see #getOverridden()
	 * @generated
	 */
	void setOverridden(Property value);

	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(OclExpression)
	 * @see qvtoperational.QvtoperationalPackage#getContextualProperty_InitExpression()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getInitExpression();

	/**
	 * Sets the value of the '{@link qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OclExpression value);

} // ContextualProperty
