/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl;

import emof.Element;

import essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imperativeocl.DictLiteralPart#getKey <em>Key</em>}</li>
 *   <li>{@link imperativeocl.DictLiteralPart#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see imperativeocl.ImperativeoclPackage#getDictLiteralPart()
 * @model
 * @generated
 */
public interface DictLiteralPart extends Element {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(OclExpression)
	 * @see imperativeocl.ImperativeoclPackage#getDictLiteralPart_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getKey();

	/**
	 * Sets the value of the '{@link imperativeocl.DictLiteralPart#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see imperativeocl.ImperativeoclPackage#getDictLiteralPart_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link imperativeocl.DictLiteralPart#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

} // DictLiteralPart
