/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtbase;

import emof.Operation;

import essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtbase.Function#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtbase.QvtbasePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Operation {
	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(OclExpression)
	 * @see qvtbase.QvtbasePackage#getFunction_QueryExpression()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getQueryExpression();

	/**
	 * Sets the value of the '{@link qvtbase.Function#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(OclExpression value);

} // Function
