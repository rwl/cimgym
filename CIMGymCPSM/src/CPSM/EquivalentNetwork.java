/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getEquivalentNetwork()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.'"
 * @generated
 */
public interface EquivalentNetwork extends ConnectivityNodeContainer {
	/**
	 * Returns the value of the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * The list contents are of type {@link CPSM.EquivalentEquipment}.
	 * It is bidirectional and its opposite is '{@link CPSM.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Equipments</em>' reference list.
	 * @see CPSM.CPSMPackage#getEquivalentNetwork_EquivalentEquipments()
	 * @see CPSM.EquivalentEquipment#getEquivalentNetwork
	 * @model opposite="EquivalentNetwork"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The associated reduced equivalents.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The associated reduced equivalents.' Profile\040documentation=''"
	 * @generated
	 */
	EList<EquivalentEquipment> getEquivalentEquipments();

} // EquivalentNetwork
