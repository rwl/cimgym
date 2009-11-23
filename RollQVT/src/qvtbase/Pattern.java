/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtbase;

import emof.Element;

import essentialocl.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtbase.Pattern#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link qvtbase.Pattern#getBindsTo <em>Binds To</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtbase.QvtbasePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Element {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
	 * The list contents are of type {@link qvtbase.Predicate}.
	 * It is bidirectional and its opposite is '{@link qvtbase.Predicate#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference list.
	 * @see qvtbase.QvtbasePackage#getPattern_Predicate()
	 * @see qvtbase.Predicate#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	EList<Predicate> getPredicate();

	/**
	 * Returns the value of the '<em><b>Binds To</b></em>' reference list.
	 * The list contents are of type {@link essentialocl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To</em>' reference list.
	 * @see qvtbase.QvtbasePackage#getPattern_BindsTo()
	 * @model
	 * @generated
	 */
	EList<Variable> getBindsTo();

} // Pattern
