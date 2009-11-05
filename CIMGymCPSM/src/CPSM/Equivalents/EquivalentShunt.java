/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Equivalents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Shunt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Equivalents.EquivalentShunt#getB <em>B</em>}</li>
 *   <li>{@link CPSM.Equivalents.EquivalentShunt#getG <em>G</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Equivalents.EquivalentsPackage#getEquivalentShunt()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class represents equivalent shunts.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent shunts.'"
 * @generated
 */
public interface EquivalentShunt extends EquivalentEquipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(double)
	 * @see CPSM.Equivalents.EquivalentsPackage#getEquivalentShunt_B()
	 * @model dataType="CPSM.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence shunt susceptance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt susceptance.'"
	 * @generated
	 */
	double getB();

	/**
	 * Sets the value of the '{@link CPSM.Equivalents.EquivalentShunt#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(double)
	 * @see CPSM.Equivalents.EquivalentsPackage#getEquivalentShunt_G()
	 * @model dataType="CPSM.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence shunt conductance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt conductance.'"
	 * @generated
	 */
	double getG();

	/**
	 * Sets the value of the '{@link CPSM.Equivalents.EquivalentShunt#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(double value);

} // EquivalentShunt
