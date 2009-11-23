/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtbase;

import emof.Tag;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtbase.Transformation#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link qvtbase.Transformation#getModelParameter <em>Model Parameter</em>}</li>
 *   <li>{@link qvtbase.Transformation#getRule <em>Rule</em>}</li>
 *   <li>{@link qvtbase.Transformation#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtbase.QvtbasePackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends emof.Class, emof.Package {
	/**
	 * Returns the value of the '<em><b>Owned Tag</b></em>' containment reference list.
	 * The list contents are of type {@link emof.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tag</em>' containment reference list.
	 * @see qvtbase.QvtbasePackage#getTransformation_OwnedTag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getOwnedTag();

	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link qvtbase.TypedModel}.
	 * It is bidirectional and its opposite is '{@link qvtbase.TypedModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see qvtbase.QvtbasePackage#getTransformation_ModelParameter()
	 * @see qvtbase.TypedModel#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<TypedModel> getModelParameter();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link qvtbase.Rule}.
	 * It is bidirectional and its opposite is '{@link qvtbase.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see qvtbase.QvtbasePackage#getTransformation_Rule()
	 * @see qvtbase.Rule#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Transformation)
	 * @see qvtbase.QvtbasePackage#getTransformation_Extends()
	 * @model
	 * @generated
	 */
	Transformation getExtends();

	/**
	 * Sets the value of the '{@link qvtbase.Transformation#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Transformation value);

} // Transformation
