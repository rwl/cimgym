/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Power System Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.CommonPowerSystemModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getCommonPowerSystemModel()
 * @model
 * @generated
 */
public interface CommonPowerSystemModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link CPSM.Element}.
	 * It is bidirectional and its opposite is '{@link CPSM.Element#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see CPSM.CPSMPackage#getCommonPowerSystemModel_Elements()
	 * @see CPSM.Element#getModel
	 * @model opposite="Model" containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // CommonPowerSystemModel
