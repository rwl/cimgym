/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.SeriesCompensator#getR <em>R</em>}</li>
 *   <li>{@link CPSM.SeriesCompensator#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getSeriesCompensator()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.'"
 * @generated
 */
public interface SeriesCompensator extends ConductingEquipment {
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
	 * @see CPSM.CPSMPackage#getSeriesCompensator_R()
	 * @model dataType="CPSM.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence resistance.'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link CPSM.SeriesCompensator#getR <em>R</em>}' attribute.
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
	 * @see CPSM.CPSMPackage#getSeriesCompensator_X()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence reactance.'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link CPSM.SeriesCompensator#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

} // SeriesCompensator
