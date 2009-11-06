/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Equivalents;

import CPSM.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Equivalents.EquivalentsPackage#getEquivalentEquipment()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of diferent types.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of diferent types.'"
 * @generated
 */
public interface EquivalentEquipment extends ConductingEquipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Network</em>' reference.
	 * @see #setEquivalentNetwork(EquivalentNetwork)
	 * @see CPSM.Equivalents.EquivalentsPackage#getEquivalentEquipment_EquivalentNetwork()
	 * @see CPSM.Equivalents.EquivalentNetwork#getEquivalentEquipments
	 * @model opposite="EquivalentEquipments" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The equivalent where the reduced model belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equivalent where the reduced model belongs.'"
	 * @generated
	 */
	EquivalentNetwork getEquivalentNetwork();

	/**
	 * Sets the value of the '{@link CPSM.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Network</em>' reference.
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	void setEquivalentNetwork(EquivalentNetwork value);

} // EquivalentEquipment
