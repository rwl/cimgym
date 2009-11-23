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
 * A representation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imperativeocl.TryExp#getTryBody <em>Try Body</em>}</li>
 *   <li>{@link imperativeocl.TryExp#getCatchClause <em>Catch Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see imperativeocl.ImperativeoclPackage#getTryExp()
 * @model
 * @generated
 */
public interface TryExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Try Body</b></em>' containment reference list.
	 * The list contents are of type {@link essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Body</em>' containment reference list.
	 * @see imperativeocl.ImperativeoclPackage#getTryExp_TryBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getTryBody();

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' containment reference list.
	 * The list contents are of type {@link imperativeocl.CatchExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' containment reference list.
	 * @see imperativeocl.ImperativeoclPackage#getTryExp_CatchClause()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchExp> getCatchClause();

} // TryExp
