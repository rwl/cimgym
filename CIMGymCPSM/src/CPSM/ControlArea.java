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
 * A representation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CPSM.ControlArea#getNetInterchange <em>Net Interchange</em>}</li>
 *   <li>{@link CPSM.ControlArea#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link CPSM.ControlArea#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CPSM.ControlArea#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getControlArea()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.'"
 * @generated
 */
public interface ControlArea extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CPSM.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CPSM.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see CPSM.CPSMPackage#getControlArea_ControlAreaGeneratingUnit()
	 * @see CPSM.ControlAreaGeneratingUnit#getControlArea
	 * @model opposite="ControlArea"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The generating unit specificaitons for the control area.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The generating unit specificaitons for the control area.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit();

	/**
	 * Returns the value of the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Interchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Interchange</em>' attribute.
	 * @see #setNetInterchange(double)
	 * @see CPSM.CPSMPackage#getControlArea_NetInterchange()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The specified positive net interchange into the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The specified positive net interchange into the control area.'"
	 * @generated
	 */
	double getNetInterchange();

	/**
	 * Sets the value of the '{@link CPSM.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Interchange</em>' attribute.
	 * @see #getNetInterchange()
	 * @generated
	 */
	void setNetInterchange(double value);

	/**
	 * Returns the value of the '<em><b>Energy Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Area</em>' reference.
	 * @see #setEnergyArea(EnergyArea)
	 * @see CPSM.CPSMPackage#getControlArea_EnergyArea()
	 * @see CPSM.EnergyArea#getControlArea
	 * @model opposite="ControlArea" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The energy area that is forecast from this control area specification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The energy area that is forecast from this control area specification.'"
	 * @generated
	 */
	EnergyArea getEnergyArea();

	/**
	 * Sets the value of the '{@link CPSM.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Area</em>' reference.
	 * @see #getEnergyArea()
	 * @generated
	 */
	void setEnergyArea(EnergyArea value);

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link CPSM.TieFlow}.
	 * It is bidirectional and its opposite is '{@link CPSM.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see CPSM.CPSMPackage#getControlArea_TieFlow()
	 * @see CPSM.TieFlow#getControlArea
	 * @model opposite="ControlArea"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The tie flows associated with the control area.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tie flows associated with the control area.' Profile\040documentation=''"
	 * @generated
	 */
	EList<TieFlow> getTieFlow();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.ControlAreaTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CPSM.ControlAreaTypeKind
	 * @see #setType(ControlAreaTypeKind)
	 * @see CPSM.CPSMPackage#getControlArea_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The type of control area defintion used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of control area defintion used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.'"
	 * @generated
	 */
	ControlAreaTypeKind getType();

	/**
	 * Sets the value of the '{@link CPSM.ControlArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CPSM.ControlAreaTypeKind
	 * @see #getType()
	 * @generated
	 */
	void setType(ControlAreaTypeKind value);

} // ControlArea
