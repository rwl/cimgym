/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Conductor#getR <em>R</em>}</li>
 *   <li>{@link CPSM.Conductor#getX <em>X</em>}</li>
 *   <li>{@link CPSM.Conductor#getBch <em>Bch</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getConductor()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.'"
 * @generated
 */
public interface Conductor extends ConductingEquipment {
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
	 * @see CPSM.CPSMPackage#getConductor_R()
	 * @model dataType="CPSM.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series resistance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the entire line section.'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link CPSM.Conductor#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

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
	 * @see CPSM.CPSMPackage#getConductor_X()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series reactance of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the entire line section.'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link CPSM.Conductor#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bch</em>' attribute.
	 * @see #setBch(double)
	 * @see CPSM.CPSMPackage#getConductor_Bch()
	 * @model dataType="CPSM.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.'"
	 * @generated
	 */
	double getBch();

	/**
	 * Sets the value of the '{@link CPSM.Conductor#getBch <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bch</em>' attribute.
	 * @see #getBch()
	 * @generated
	 */
	void setBch(double value);

} // Conductor
