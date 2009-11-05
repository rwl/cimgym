/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import CPSM.Core.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getTculControlMode <em>Tcul Control Mode</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getType <em>Type</em>}</li>
 *   <li>{@link CPSM.Wires.TapChanger#getNeutralU <em>Neutral U</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Wires.WiresPackage#getTapChanger()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Mechanism for changing transformer winding tap positions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mechanism for changing transformer winding tap positions.'"
 * @generated
 */
public interface TapChanger extends PowerSystemResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Wires.RegulatingControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_RegulatingControl()
	 * @see CPSM.Wires.RegulatingControl#getTapChanger
	 * @model opposite="TapChanger" required="true"
	 * @generated
	 */
	RegulatingControl getRegulatingControl();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	void setRegulatingControl(RegulatingControl value);

	/**
	 * Returns the value of the '<em><b>Transformer Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Wires.TransformerWinding#getTapChangers <em>Tap Changers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Winding</em>' reference.
	 * @see #setTransformerWinding(TransformerWinding)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_TransformerWinding()
	 * @see CPSM.Wires.TransformerWinding#getTapChangers
	 * @model opposite="TapChangers" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A transformer winding may have tap changers, separately for voltage and phase angle'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer winding may have tap changers, separately for voltage and phase angle'"
	 * @generated
	 */
	TransformerWinding getTransformerWinding();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getTransformerWinding <em>Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Winding</em>' reference.
	 * @see #getTransformerWinding()
	 * @generated
	 */
	void setTransformerWinding(TransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Step</em>' attribute.
	 * @see #setNormalStep(int)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_NormalStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The tap step position used in \"normal\" network operation for this winding. For a \"Fixed\" tap changer indicates the current physical tap setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tap step position used in \"normal\" network operation for this winding. For a \"Fixed\" tap changer indicates the current physical tap setting.'"
	 * @generated
	 */
	int getNormalStep();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Step</em>' attribute.
	 * @see #getNormalStep()
	 * @generated
	 */
	void setNormalStep(int value);

	/**
	 * Returns the value of the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Step</em>' attribute.
	 * @see #setHighStep(int)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_HighStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Highest possible tap step position, advance from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Highest possible tap step position, advance from neutral'"
	 * @generated
	 */
	int getHighStep();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getHighStep <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Step</em>' attribute.
	 * @see #getHighStep()
	 * @generated
	 */
	void setHighStep(int value);

	/**
	 * Returns the value of the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Phase Shift Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #setStepPhaseShiftIncrement(double)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_StepPhaseShiftIncrement()
	 * @model dataType="CPSM.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Phase shift per step position. A positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase shift per step position. A positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).'"
	 * @generated
	 */
	double getStepPhaseShiftIncrement();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 */
	void setStepPhaseShiftIncrement(double value);

	/**
	 * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Step</em>' attribute.
	 * @see #setNeutralStep(int)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_NeutralStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The neutral tap step position for this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The neutral tap step position for this winding.'"
	 * @generated
	 */
	int getNeutralStep();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Step</em>' attribute.
	 * @see #getNeutralStep()
	 * @generated
	 */
	void setNeutralStep(int value);

	/**
	 * Returns the value of the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Step</em>' attribute.
	 * @see #setLowStep(int)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_LowStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Lowest possible tap step position, retard from neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lowest possible tap step position, retard from neutral'"
	 * @generated
	 */
	int getLowStep();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getLowStep <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Step</em>' attribute.
	 * @see #getLowStep()
	 * @generated
	 */
	void setLowStep(int value);

	/**
	 * Returns the value of the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Wires.TransformerControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcul Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see CPSM.Wires.TransformerControlMode
	 * @see #setTculControlMode(TransformerControlMode)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_TculControlMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='For an LTC, the tap changer control mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For an LTC, the tap changer control mode.'"
	 * @generated
	 */
	TransformerControlMode getTculControlMode();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see CPSM.Wires.TransformerControlMode
	 * @see #getTculControlMode()
	 * @generated
	 */
	void setTculControlMode(TransformerControlMode value);

	/**
	 * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #setStepVoltageIncrement(double)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_StepVoltageIncrement()
	 * @model dataType="CPSM.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Tap step increment, in per cent of nominal voltage, per step position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap step increment, in per cent of nominal voltage, per step position.'"
	 * @generated
	 */
	double getStepVoltageIncrement();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #getStepVoltageIncrement()
	 * @generated
	 */
	void setStepVoltageIncrement(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Wires.TapChangerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CPSM.Wires.TapChangerKind
	 * @see #setType(TapChangerKind)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The type of tap changer. Indicates the ability of the transformer to perform various regulation tasks. The tap changer must be also be associated wtih a RegulationControl object before any regulation is possible.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of tap changer. Indicates the ability of the transformer to perform various regulation tasks. The tap changer must be also be associated wtih a RegulationControl object before any regulation is possible.'"
	 * @generated
	 */
	TapChangerKind getType();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CPSM.Wires.TapChangerKind
	 * @see #getType()
	 * @generated
	 */
	void setType(TapChangerKind value);

	/**
	 * Returns the value of the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral U</em>' attribute.
	 * @see #setNeutralU(double)
	 * @see CPSM.Wires.WiresPackage#getTapChanger_NeutralU()
	 * @model dataType="CPSM.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Voltage at which the winding operates at the neutral tap setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage at which the winding operates at the neutral tap setting.'"
	 * @generated
	 */
	double getNeutralU();

	/**
	 * Sets the value of the '{@link CPSM.Wires.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral U</em>' attribute.
	 * @see #getNeutralU()
	 * @generated
	 */
	void setNeutralU(double value);

} // TapChanger
