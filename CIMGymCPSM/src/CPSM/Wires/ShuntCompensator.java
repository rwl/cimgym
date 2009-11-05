/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link CPSM.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link CPSM.Wires.ShuntCompensator#getNomU <em>Nom U</em>}</li>
 *   <li>{@link CPSM.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Wires.WiresPackage#getShuntCompensator()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  Negative values for mVArPerSection and nominalMVAr indicate that the compensator is a reactor.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  Negative values for mVArPerSection and nominalMVAr indicate that the compensator is a reactor.'"
 * @generated
 */
public interface ShuntCompensator extends RegulatingCondEq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Sections</em>' attribute.
	 * @see #setMaximumSections(int)
	 * @see CPSM.Wires.WiresPackage#getShuntCompensator_MaximumSections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='For a capacitor bank, the maximum number of sections that may be switched in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the maximum number of sections that may be switched in.'"
	 * @generated
	 */
	int getMaximumSections();

	/**
	 * Sets the value of the '{@link CPSM.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Sections</em>' attribute.
	 * @see #getMaximumSections()
	 * @generated
	 */
	void setMaximumSections(int value);

	/**
	 * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Sections</em>' attribute.
	 * @see #setNormalSections(int)
	 * @see CPSM.Wires.WiresPackage#getShuntCompensator_NormalSections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='For a capacitor bank, the normal number of sections switched in. This number should correspond to the nominal reactive power (nomQ).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the normal number of sections switched in. This number should correspond to the nominal reactive power (nomQ).'"
	 * @generated
	 */
	int getNormalSections();

	/**
	 * Sets the value of the '{@link CPSM.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Sections</em>' attribute.
	 * @see #getNormalSections()
	 * @generated
	 */
	void setNormalSections(int value);

	/**
	 * Returns the value of the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom U</em>' attribute.
	 * @see #setNomU(double)
	 * @see CPSM.Wires.WiresPackage#getShuntCompensator_NomU()
	 * @model dataType="CPSM.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The nominal voltage at which the nominal reactive power was measured. This should normally be within 10% of the voltage at which the capacitor is connected to the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The nominal voltage at which the nominal reactive power was measured. This should normally be within 10% of the voltage at which the capacitor is connected to the network.'"
	 * @generated
	 */
	double getNomU();

	/**
	 * Sets the value of the '{@link CPSM.Wires.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom U</em>' attribute.
	 * @see #getNomU()
	 * @generated
	 */
	void setNomU(double value);

	/**
	 * Returns the value of the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #setReactivePerSection(double)
	 * @see CPSM.Wires.WiresPackage#getShuntCompensator_ReactivePerSection()
	 * @model dataType="CPSM.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='For a capacitor bank, the size in reactive power of each switchable section at the nominal voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the size in reactive power of each switchable section at the nominal voltage.'"
	 * @generated
	 */
	double getReactivePerSection();

	/**
	 * Sets the value of the '{@link CPSM.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #getReactivePerSection()
	 * @generated
	 */
	void setReactivePerSection(double value);

} // ShuntCompensator
