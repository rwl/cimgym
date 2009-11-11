/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.EquivalentBranch#getX <em>X</em>}</li>
 *   <li>{@link CPSM.EquivalentBranch#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getEquivalentBranch()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class represents equivalent branches.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent branches.'"
 * @generated
 */
public interface EquivalentBranch extends EquivalentEquipment {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see CPSM.CPSMPackage#getEquivalentBranch_X()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series reactance of the reduced branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the reduced branch.'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link CPSM.EquivalentBranch#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see CPSM.CPSMPackage#getEquivalentBranch_R()
	 * @model dataType="CPSM.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series resistance of the reduced branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the reduced branch.'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link CPSM.EquivalentBranch#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

} // EquivalentBranch
