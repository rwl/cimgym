/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.SVCControlMode;
import CPSM.StaticVarCompensator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.StaticVarCompensatorImpl#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link CPSM.impl.StaticVarCompensatorImpl#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link CPSM.impl.StaticVarCompensatorImpl#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link CPSM.impl.StaticVarCompensatorImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link CPSM.impl.StaticVarCompensatorImpl#getInductiveRating <em>Inductive Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticVarCompensatorImpl extends RegulatingCondEqImpl implements StaticVarCompensator {
	/**
	 * The default value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_SET_POINT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected double voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final SVCControlMode SVC_CONTROL_MODE_EDEFAULT = SVCControlMode.VOLTAGE;

	/**
	 * The cached value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected SVCControlMode sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected double capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected double slope = SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final double INDUCTIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected double inductiveRating = INDUCTIVE_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticVarCompensatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.STATIC_VAR_COMPENSATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageSetPoint() {
		return voltageSetPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageSetPoint(double newVoltageSetPoint) {
		double oldVoltageSetPoint = voltageSetPoint;
		voltageSetPoint = newVoltageSetPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT, oldVoltageSetPoint, voltageSetPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCControlMode getSVCControlMode() {
		return sVCControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSVCControlMode(SVCControlMode newSVCControlMode) {
		SVCControlMode oldSVCControlMode = sVCControlMode;
		sVCControlMode = newSVCControlMode == null ? SVC_CONTROL_MODE_EDEFAULT : newSVCControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE, oldSVCControlMode, sVCControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacitiveRating() {
		return capacitiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitiveRating(double newCapacitiveRating) {
		double oldCapacitiveRating = capacitiveRating;
		capacitiveRating = newCapacitiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING, oldCapacitiveRating, capacitiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(double newSlope) {
		double oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.STATIC_VAR_COMPENSATOR__SLOPE, oldSlope, slope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInductiveRating() {
		return inductiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInductiveRating(double newInductiveRating) {
		double oldInductiveRating = inductiveRating;
		inductiveRating = newInductiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING, oldInductiveRating, inductiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPSMPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return getVoltageSetPoint();
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return getSVCControlMode();
			case CPSMPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return getCapacitiveRating();
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return getSlope();
			case CPSMPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return getInductiveRating();
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
			case CPSMPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				setVoltageSetPoint((Double)newValue);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				setSVCControlMode((SVCControlMode)newValue);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				setCapacitiveRating((Double)newValue);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				setSlope((Double)newValue);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				setInductiveRating((Double)newValue);
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
			case CPSMPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				setVoltageSetPoint(VOLTAGE_SET_POINT_EDEFAULT);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				setSVCControlMode(SVC_CONTROL_MODE_EDEFAULT);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				setCapacitiveRating(CAPACITIVE_RATING_EDEFAULT);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				setInductiveRating(INDUCTIVE_RATING_EDEFAULT);
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
			case CPSMPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return voltageSetPoint != VOLTAGE_SET_POINT_EDEFAULT;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return sVCControlMode != SVC_CONTROL_MODE_EDEFAULT;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return capacitiveRating != CAPACITIVE_RATING_EDEFAULT;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return slope != SLOPE_EDEFAULT;
			case CPSMPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return inductiveRating != INDUCTIVE_RATING_EDEFAULT;
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
		result.append(" (voltageSetPoint: ");
		result.append(voltageSetPoint);
		result.append(", sVCControlMode: ");
		result.append(sVCControlMode);
		result.append(", capacitiveRating: ");
		result.append(capacitiveRating);
		result.append(", slope: ");
		result.append(slope);
		result.append(", inductiveRating: ");
		result.append(inductiveRating);
		result.append(')');
		return result.toString();
	}

} //StaticVarCompensatorImpl
