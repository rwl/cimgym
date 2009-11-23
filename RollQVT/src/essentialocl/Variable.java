/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package essentialocl;

import emof.Parameter;
import emof.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link essentialocl.Variable#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link essentialocl.Variable#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link essentialocl.Variable#getBindParameter <em>Bind Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see essentialocl.EssentialoclPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TypedElement {
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
	 * @see essentialocl.EssentialoclPackage#getVariable_InitExpression()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getInitExpression();

	/**
	 * Sets the value of the '{@link essentialocl.Variable#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Let Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link essentialocl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Exp</em>' container reference.
	 * @see #setLetExp(LetExp)
	 * @see essentialocl.EssentialoclPackage#getVariable_LetExp()
	 * @see essentialocl.LetExp#getVariable
	 * @model opposite="variable"
	 * @generated
	 */
	LetExp getLetExp();

	/**
	 * Sets the value of the '{@link essentialocl.Variable#getLetExp <em>Let Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let Exp</em>' container reference.
	 * @see #getLetExp()
	 * @generated
	 */
	void setLetExp(LetExp value);

	/**
	 * Returns the value of the '<em><b>Bind Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Parameter</em>' reference.
	 * @see #setBindParameter(Parameter)
	 * @see essentialocl.EssentialoclPackage#getVariable_BindParameter()
	 * @model
	 * @generated
	 */
	Parameter getBindParameter();

	/**
	 * Sets the value of the '{@link essentialocl.Variable#getBindParameter <em>Bind Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Parameter</em>' reference.
	 * @see #getBindParameter()
	 * @generated
	 */
	void setBindParameter(Parameter value);

} // Variable
