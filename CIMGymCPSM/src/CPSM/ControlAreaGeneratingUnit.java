/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Area Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CPSM.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getControlAreaGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.'"
 * @generated
 */
public interface ControlAreaGeneratingUnit extends Element {
	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CPSM.CPSMPackage#getControlAreaGeneratingUnit_ControlArea()
	 * @see CPSM.ControlArea#getControlAreaGeneratingUnit
	 * @model opposite="ControlAreaGeneratingUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The parent control area for the generating unit specifications.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parent control area for the generating unit specifications.'"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link CPSM.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see CPSM.CPSMPackage#getControlAreaGeneratingUnit_GeneratingUnit()
	 * @see CPSM.GeneratingUnit#getControlAreaGeneratingUnit
	 * @model opposite="ControlAreaGeneratingUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once.'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link CPSM.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

} // ControlAreaGeneratingUnit
