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
 * A representation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.RegulatingControl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CPSM.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CPSM.RegulatingControl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CPSM.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getRegulatingControl()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.'"
 * @generated
 */
public interface RegulatingControl extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CPSM.CPSMPackage#getRegulatingControl_Terminal()
	 * @see CPSM.Terminal#getRegulatingControl
	 * @model opposite="RegulatingControl" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The terminal associated with this regulating control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal associated with this regulating control.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CPSM.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Schedule</em>' reference.
	 * @see #setRegulationSchedule(RegulationSchedule)
	 * @see CPSM.CPSMPackage#getRegulatingControl_RegulationSchedule()
	 * @see CPSM.RegulationSchedule#getRegulatingControl
	 * @model opposite="RegulatingControl" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Schedule for this Regulating regulating control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule for this Regulating regulating control.'"
	 * @generated
	 */
	RegulationSchedule getRegulationSchedule();

	/**
	 * Sets the value of the '{@link CPSM.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Schedule</em>' reference.
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	void setRegulationSchedule(RegulationSchedule value);

	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference list.
	 * The list contents are of type {@link CPSM.TapChanger}.
	 * It is bidirectional and its opposite is '{@link CPSM.TapChanger#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference list.
	 * @see CPSM.CPSMPackage#getRegulatingControl_TapChanger()
	 * @see CPSM.TapChanger#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='copy from reg conduting eq'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='copy from reg conduting eq' Profile\040documentation=''"
	 * @generated
	 */
	EList<TapChanger> getTapChanger();

	/**
	 * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * The list contents are of type {@link CPSM.RegulatingCondEq}.
	 * It is bidirectional and its opposite is '{@link CPSM.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Cond Eq</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Cond Eq</em>' reference list.
	 * @see CPSM.CPSMPackage#getRegulatingControl_RegulatingCondEq()
	 * @see CPSM.RegulatingCondEq#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='copy from reg cond eq'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='copy from reg cond eq' Profile\040documentation=''"
	 * @generated
	 */
	EList<RegulatingCondEq> getRegulatingCondEq();

} // RegulatingControl
