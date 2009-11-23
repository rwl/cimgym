/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtrelation;

import org.eclipse.emf.common.util.EList;

import qvtbase.Transformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtrelation.RelationalTransformation#getOwnedKey <em>Owned Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtrelation.QvtrelationPackage#getRelationalTransformation()
 * @model
 * @generated
 */
public interface RelationalTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Owned Key</b></em>' containment reference list.
	 * The list contents are of type {@link qvtrelation.Key}.
	 * It is bidirectional and its opposite is '{@link qvtrelation.Key#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key</em>' containment reference list.
	 * @see qvtrelation.QvtrelationPackage#getRelationalTransformation_OwnedKey()
	 * @see qvtrelation.Key#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<Key> getOwnedKey();

} // RelationalTransformation
