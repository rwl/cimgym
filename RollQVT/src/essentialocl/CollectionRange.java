/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link essentialocl.CollectionRange#getFirst <em>First</em>}</li>
 *   <li>{@link essentialocl.CollectionRange#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see essentialocl.EssentialoclPackage#getCollectionRange()
 * @model
 * @generated
 */
public interface CollectionRange extends CollectionLiteralPart {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(OclExpression)
	 * @see essentialocl.EssentialoclPackage#getCollectionRange_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getFirst();

	/**
	 * Sets the value of the '{@link essentialocl.CollectionRange#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' containment reference.
	 * @see #setLast(OclExpression)
	 * @see essentialocl.EssentialoclPackage#getCollectionRange_Last()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getLast();

	/**
	 * Sets the value of the '{@link essentialocl.CollectionRange#getLast <em>Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' containment reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(OclExpression value);

} // CollectionRange
