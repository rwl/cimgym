/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl;

import essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imperativeocl.AssignExp#getValue <em>Value</em>}</li>
 *   <li>{@link imperativeocl.AssignExp#getLeft <em>Left</em>}</li>
 *   <li>{@link imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see imperativeocl.ImperativeoclPackage#getAssignExp()
 * @model
 * @generated
 */
public interface AssignExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see imperativeocl.ImperativeoclPackage#getAssignExp_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getValue();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(OclExpression)
	 * @see imperativeocl.ImperativeoclPackage#getAssignExp_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getLeft();

	/**
	 * Sets the value of the '{@link imperativeocl.AssignExp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(OclExpression)
	 * @see imperativeocl.ImperativeoclPackage#getAssignExp_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getDefaultValue();

	/**
	 * Sets the value of the '{@link imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Is Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reset</em>' attribute.
	 * @see #setIsReset(Boolean)
	 * @see imperativeocl.ImperativeoclPackage#getAssignExp_IsReset()
	 * @model dataType="emof.Boolean"
	 * @generated
	 */
	Boolean getIsReset();

	/**
	 * Sets the value of the '{@link imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reset</em>' attribute.
	 * @see #getIsReset()
	 * @generated
	 */
	void setIsReset(Boolean value);

} // AssignExp
