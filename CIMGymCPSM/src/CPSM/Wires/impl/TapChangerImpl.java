/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Core.impl.PowerSystemResourceImpl;

import CPSM.Wires.RegulatingControl;
import CPSM.Wires.TapChanger;
import CPSM.Wires.TapChangerKind;
import CPSM.Wires.TransformerControlMode;
import CPSM.Wires.TransformerWinding;
import CPSM.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getTculControlMode <em>Tcul Control Mode</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getType <em>Type</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TapChangerImpl#getNeutralU <em>Neutral U</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapChangerImpl extends PowerSystemResourceImpl implements TapChanger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControl regulatingControl;

	/**
	 * The cached value of the '{@link #getTransformerWinding() <em>Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerWinding transformerWinding;

	/**
	 * The default value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected int normalStep = NORMAL_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGH_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected int highStep = HIGH_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_PHASE_SHIFT_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected double stepPhaseShiftIncrement = STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected int neutralStep = NEUTRAL_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected static final int LOW_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected int lowStep = LOW_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerControlMode TCUL_CONTROL_MODE_EDEFAULT = TransformerControlMode.LOCAL;

	/**
	 * The cached value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected TransformerControlMode tculControlMode = TCUL_CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_VOLTAGE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected double stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TapChangerKind TYPE_EDEFAULT = TapChangerKind.VOLTAGE_AND_PHASE_CONTROL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TapChangerKind type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected static final double NEUTRAL_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected double neutralU = NEUTRAL_U_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TAP_CHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl getRegulatingControl() {
		if (regulatingControl != null && regulatingControl.eIsProxy()) {
			InternalEObject oldRegulatingControl = (InternalEObject)regulatingControl;
			regulatingControl = (RegulatingControl)eResolveProxy(oldRegulatingControl);
			if (regulatingControl != oldRegulatingControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, oldRegulatingControl, regulatingControl));
			}
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl basicGetRegulatingControl() {
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingControl(RegulatingControl newRegulatingControl, NotificationChain msgs) {
		RegulatingControl oldRegulatingControl = regulatingControl;
		regulatingControl = newRegulatingControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatingControl(RegulatingControl newRegulatingControl) {
		if (newRegulatingControl != regulatingControl) {
			NotificationChain msgs = null;
			if (regulatingControl != null)
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding getTransformerWinding() {
		if (transformerWinding != null && transformerWinding.eIsProxy()) {
			InternalEObject oldTransformerWinding = (InternalEObject)transformerWinding;
			transformerWinding = (TransformerWinding)eResolveProxy(oldTransformerWinding);
			if (transformerWinding != oldTransformerWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, transformerWinding));
			}
		}
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding basicGetTransformerWinding() {
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerWinding(TransformerWinding newTransformerWinding, NotificationChain msgs) {
		TransformerWinding oldTransformerWinding = transformerWinding;
		transformerWinding = newTransformerWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING, oldTransformerWinding, newTransformerWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerWinding(TransformerWinding newTransformerWinding) {
		if (newTransformerWinding != transformerWinding) {
			NotificationChain msgs = null;
			if (transformerWinding != null)
				msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS, TransformerWinding.class, msgs);
			if (newTransformerWinding != null)
				msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS, TransformerWinding.class, msgs);
			msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalStep() {
		return normalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalStep(int newNormalStep) {
		int oldNormalStep = normalStep;
		normalStep = newNormalStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NORMAL_STEP, oldNormalStep, normalStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHighStep() {
		return highStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighStep(int newHighStep) {
		int oldHighStep = highStep;
		highStep = newHighStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__HIGH_STEP, oldHighStep, highStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStepPhaseShiftIncrement() {
		return stepPhaseShiftIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepPhaseShiftIncrement(double newStepPhaseShiftIncrement) {
		double oldStepPhaseShiftIncrement = stepPhaseShiftIncrement;
		stepPhaseShiftIncrement = newStepPhaseShiftIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT, oldStepPhaseShiftIncrement, stepPhaseShiftIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeutralStep() {
		return neutralStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralStep(int newNeutralStep) {
		int oldNeutralStep = neutralStep;
		neutralStep = newNeutralStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NEUTRAL_STEP, oldNeutralStep, neutralStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowStep() {
		return lowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowStep(int newLowStep) {
		int oldLowStep = lowStep;
		lowStep = newLowStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__LOW_STEP, oldLowStep, lowStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerControlMode getTculControlMode() {
		return tculControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTculControlMode(TransformerControlMode newTculControlMode) {
		TransformerControlMode oldTculControlMode = tculControlMode;
		tculControlMode = newTculControlMode == null ? TCUL_CONTROL_MODE_EDEFAULT : newTculControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__TCUL_CONTROL_MODE, oldTculControlMode, tculControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStepVoltageIncrement() {
		return stepVoltageIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepVoltageIncrement(double newStepVoltageIncrement) {
		double oldStepVoltageIncrement = stepVoltageIncrement;
		stepVoltageIncrement = newStepVoltageIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT, oldStepVoltageIncrement, stepVoltageIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerKind getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TapChangerKind newType) {
		TapChangerKind oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeutralU() {
		return neutralU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralU(double newNeutralU) {
		double oldNeutralU = neutralU;
		neutralU = newNeutralU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU, neutralU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				if (transformerWinding != null)
					msgs = ((InternalEObject)transformerWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS, TransformerWinding.class, msgs);
				return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				return basicSetTransformerWinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				if (resolve) return getTransformerWinding();
				return basicGetTransformerWinding();
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return getNormalStep();
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return getHighStep();
			case WiresPackage.TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				return getStepPhaseShiftIncrement();
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return getNeutralStep();
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return getLowStep();
			case WiresPackage.TAP_CHANGER__TCUL_CONTROL_MODE:
				return getTculControlMode();
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return getStepVoltageIncrement();
			case WiresPackage.TAP_CHANGER__TYPE:
				return getType();
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return getNeutralU();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				setNormalStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				setHighStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				setStepPhaseShiftIncrement((Double)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				setNeutralStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				setLowStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TCUL_CONTROL_MODE:
				setTculControlMode((TransformerControlMode)newValue);
				return;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement((Double)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TYPE:
				setType((TapChangerKind)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				setNeutralU((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
				return;
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				setTransformerWinding((TransformerWinding)null);
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				setNormalStep(NORMAL_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				setHighStep(HIGH_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				setStepPhaseShiftIncrement(STEP_PHASE_SHIFT_INCREMENT_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				setNeutralStep(NEUTRAL_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				setLowStep(LOW_STEP_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__TCUL_CONTROL_MODE:
				setTculControlMode(TCUL_CONTROL_MODE_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement(STEP_VOLTAGE_INCREMENT_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				setNeutralU(NEUTRAL_U_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WiresPackage.TAP_CHANGER__REGULATING_CONTROL:
				return regulatingControl != null;
			case WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING:
				return transformerWinding != null;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return normalStep != NORMAL_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return highStep != HIGH_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__STEP_PHASE_SHIFT_INCREMENT:
				return stepPhaseShiftIncrement != STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return neutralStep != NEUTRAL_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return lowStep != LOW_STEP_EDEFAULT;
			case WiresPackage.TAP_CHANGER__TCUL_CONTROL_MODE:
				return tculControlMode != TCUL_CONTROL_MODE_EDEFAULT;
			case WiresPackage.TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return stepVoltageIncrement != STEP_VOLTAGE_INCREMENT_EDEFAULT;
			case WiresPackage.TAP_CHANGER__TYPE:
				return type != TYPE_EDEFAULT;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return neutralU != NEUTRAL_U_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (normalStep: ");
		result.append(normalStep);
		result.append(", highStep: ");
		result.append(highStep);
		result.append(", stepPhaseShiftIncrement: ");
		result.append(stepPhaseShiftIncrement);
		result.append(", neutralStep: ");
		result.append(neutralStep);
		result.append(", lowStep: ");
		result.append(lowStep);
		result.append(", tculControlMode: ");
		result.append(tculControlMode);
		result.append(", stepVoltageIncrement: ");
		result.append(stepVoltageIncrement);
		result.append(", type: ");
		result.append(type);
		result.append(", neutralU: ");
		result.append(neutralU);
		result.append(')');
		return result.toString();
	}

} //TapChangerImpl
