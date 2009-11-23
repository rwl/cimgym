/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl;

import essentialocl.LiteralExp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Tuple Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imperativeocl.OrderedTupleLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see imperativeocl.ImperativeoclPackage#getOrderedTupleLiteralExp()
 * @model
 * @generated
 */
public interface OrderedTupleLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link imperativeocl.OrderedTupleLiteralPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see imperativeocl.ImperativeoclPackage#getOrderedTupleLiteralExp_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderedTupleLiteralPart> getPart();

} // OrderedTupleLiteralExp
