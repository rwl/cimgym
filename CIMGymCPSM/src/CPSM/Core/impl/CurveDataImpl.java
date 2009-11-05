/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.Core.CorePackage;
import CPSM.Core.Curve;
import CPSM.Core.CurveData;

import CPSM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Core.impl.CurveDataImpl#getY2value <em>Y2value</em>}</li>
 *   <li>{@link CPSM.Core.impl.CurveDataImpl#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link CPSM.Core.impl.CurveDataImpl#getY1value <em>Y1value</em>}</li>
 *   <li>{@link CPSM.Core.impl.CurveDataImpl#getCurveSchedule <em>Curve Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurveDataImpl extends ElementImpl implements CurveData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The default value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected float y2value = Y2VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected static final float XVALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected float xvalue = XVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected float y1value = Y1VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurveSchedule() <em>Curve Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveSchedule()
	 * @generated
	 * @ordered
	 */
	protected Curve curveSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CURVE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY2value() {
		return y2value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2value(float newY2value) {
		float oldY2value = y2value;
		y2value = newY2value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__Y2VALUE, oldY2value, y2value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXvalue() {
		return xvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXvalue(float newXvalue) {
		float oldXvalue = xvalue;
		xvalue = newXvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__XVALUE, oldXvalue, xvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY1value() {
		return y1value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1value(float newY1value) {
		float oldY1value = y1value;
		y1value = newY1value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__Y1VALUE, oldY1value, y1value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve getCurveSchedule() {
		if (curveSchedule != null && curveSchedule.eIsProxy()) {
			InternalEObject oldCurveSchedule = (InternalEObject)curveSchedule;
			curveSchedule = (Curve)eResolveProxy(oldCurveSchedule);
			if (curveSchedule != oldCurveSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CURVE_DATA__CURVE_SCHEDULE, oldCurveSchedule, curveSchedule));
			}
		}
		return curveSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve basicGetCurveSchedule() {
		return curveSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveSchedule(Curve newCurveSchedule, NotificationChain msgs) {
		Curve oldCurveSchedule = curveSchedule;
		curveSchedule = newCurveSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__CURVE_SCHEDULE, oldCurveSchedule, newCurveSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveSchedule(Curve newCurveSchedule) {
		if (newCurveSchedule != curveSchedule) {
			NotificationChain msgs = null;
			if (curveSchedule != null)
				msgs = ((InternalEObject)curveSchedule).eInverseRemove(this, CorePackage.CURVE__CURVE_SCHEDULE_DATAS, Curve.class, msgs);
			if (newCurveSchedule != null)
				msgs = ((InternalEObject)newCurveSchedule).eInverseAdd(this, CorePackage.CURVE__CURVE_SCHEDULE_DATAS, Curve.class, msgs);
			msgs = basicSetCurveSchedule(newCurveSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CURVE_DATA__CURVE_SCHEDULE, newCurveSchedule, newCurveSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				if (curveSchedule != null)
					msgs = ((InternalEObject)curveSchedule).eInverseRemove(this, CorePackage.CURVE__CURVE_SCHEDULE_DATAS, Curve.class, msgs);
				return basicSetCurveSchedule((Curve)otherEnd, msgs);
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
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				return basicSetCurveSchedule(null, msgs);
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
			case CorePackage.CURVE_DATA__Y2VALUE:
				return getY2value();
			case CorePackage.CURVE_DATA__XVALUE:
				return getXvalue();
			case CorePackage.CURVE_DATA__Y1VALUE:
				return getY1value();
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				if (resolve) return getCurveSchedule();
				return basicGetCurveSchedule();
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
			case CorePackage.CURVE_DATA__Y2VALUE:
				setY2value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__XVALUE:
				setXvalue((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				setY1value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				setCurveSchedule((Curve)newValue);
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
			case CorePackage.CURVE_DATA__Y2VALUE:
				setY2value(Y2VALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__XVALUE:
				setXvalue(XVALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				setY1value(Y1VALUE_EDEFAULT);
				return;
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				setCurveSchedule((Curve)null);
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
			case CorePackage.CURVE_DATA__Y2VALUE:
				return y2value != Y2VALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__XVALUE:
				return xvalue != XVALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__Y1VALUE:
				return y1value != Y1VALUE_EDEFAULT;
			case CorePackage.CURVE_DATA__CURVE_SCHEDULE:
				return curveSchedule != null;
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
		result.append(" (y2value: ");
		result.append(y2value);
		result.append(", xvalue: ");
		result.append(xvalue);
		result.append(", y1value: ");
		result.append(y1value);
		result.append(')');
		return result.toString();
	}

} //CurveDataImpl
