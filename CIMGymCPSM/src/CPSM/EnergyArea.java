/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.EnergyArea#getControlArea <em>Control Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getEnergyArea()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The class describes an area having energy production or consumption. The class is the basis for further specialization.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class describes an area having energy production or consumption. The class is the basis for further specialization.'"
 * @generated
 */
public interface EnergyArea extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ControlArea#getEnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CPSM.CPSMPackage#getEnergyArea_ControlArea()
	 * @see CPSM.ControlArea#getEnergyArea
	 * @model opposite="EnergyArea"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The control area specification that is used for the load forecast.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area specification that is used for the load forecast.' Profile\040documentation=''"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link CPSM.EnergyArea#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

} // EnergyArea
