/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getEquivalentEquipment()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of diferent types.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of diferent types.'"
 * @generated
 */
public interface EquivalentEquipment extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Network</em>' reference.
	 * @see #setEquivalentNetwork(EquivalentNetwork)
	 * @see CPSM.CPSMPackage#getEquivalentEquipment_EquivalentNetwork()
	 * @see CPSM.EquivalentNetwork#getEquivalentEquipments
	 * @model opposite="EquivalentEquipments" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The equivalent where the reduced model belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equivalent where the reduced model belongs.'"
	 * @generated
	 */
	EquivalentNetwork getEquivalentNetwork();

	/**
	 * Sets the value of the '{@link CPSM.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Network</em>' reference.
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	void setEquivalentNetwork(EquivalentNetwork value);

} // EquivalentEquipment
