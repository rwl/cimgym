/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl;

import emof.Type;

import essentialocl.CollectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see imperativeocl.ImperativeoclPackage#getDictionaryType()
 * @model
 * @generated
 */
public interface DictionaryType extends CollectionType {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(Type)
	 * @see imperativeocl.ImperativeoclPackage#getDictionaryType_KeyType()
	 * @model
	 * @generated
	 */
	Type getKeyType();

	/**
	 * Sets the value of the '{@link imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(Type value);

} // DictionaryType
