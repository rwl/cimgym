/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtrelation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qvtrelation.QvtrelationPackage
 * @generated
 */
public interface QvtrelationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtrelationFactory eINSTANCE = qvtrelation.impl.QvtrelationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Relation Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Domain</em>'.
	 * @generated
	 */
	RelationDomain createRelationDomain();

	/**
	 * Returns a new object of class '<em>Domain Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Pattern</em>'.
	 * @generated
	 */
	DomainPattern createDomainPattern();

	/**
	 * Returns a new object of class '<em>Relation Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Implementation</em>'.
	 * @generated
	 */
	RelationImplementation createRelationImplementation();

	/**
	 * Returns a new object of class '<em>Relation Call Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Call Exp</em>'.
	 * @generated
	 */
	RelationCallExp createRelationCallExp();

	/**
	 * Returns a new object of class '<em>Relational Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Transformation</em>'.
	 * @generated
	 */
	RelationalTransformation createRelationalTransformation();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	Key createKey();

	/**
	 * Returns a new object of class '<em>Relation Domain Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Domain Assignment</em>'.
	 * @generated
	 */
	RelationDomainAssignment createRelationDomainAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QvtrelationPackage getQvtrelationPackage();

} //QvtrelationFactory
