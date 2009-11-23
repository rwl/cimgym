/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational;

import emof.URIExtent;

import essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link qvtoperational.ModelType#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}</li>
 *   <li>{@link qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see qvtoperational.QvtoperationalPackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends emof.Class, URIExtent {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference list.
	 * The list contents are of type {@link emof.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModelType_Metamodel()
	 * @model
	 * @generated
	 */
	EList<emof.Package> getMetamodel();

	/**
	 * Returns the value of the '<em><b>Additional Condition</b></em>' containment reference list.
	 * The list contents are of type {@link essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Condition</em>' containment reference list.
	 * @see qvtoperational.QvtoperationalPackage#getModelType_AdditionalCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getAdditionalCondition();

	/**
	 * Returns the value of the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance Kind</em>' attribute.
	 * @see #setConformanceKind(String)
	 * @see qvtoperational.QvtoperationalPackage#getModelType_ConformanceKind()
	 * @model dataType="emof.String"
	 * @generated
	 */
	String getConformanceKind();

	/**
	 * Sets the value of the '{@link qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Kind</em>' attribute.
	 * @see #getConformanceKind()
	 * @generated
	 */
	void setConformanceKind(String value);

} // ModelType
