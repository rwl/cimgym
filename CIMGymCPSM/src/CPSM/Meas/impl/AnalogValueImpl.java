/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

import CPSM.Meas.Analog;
import CPSM.Meas.AnalogValue;
import CPSM.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Meas.impl.AnalogValueImpl#getMemberOf_Measurement <em>Member Of Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogValueImpl extends MeasurementValueImpl implements AnalogValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getMemberOf_Measurement() <em>Member Of Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_Measurement()
	 * @generated
	 * @ordered
	 */
	protected Analog memberOf_Measurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog getMemberOf_Measurement() {
		if (memberOf_Measurement != null && memberOf_Measurement.eIsProxy()) {
			InternalEObject oldMemberOf_Measurement = (InternalEObject)memberOf_Measurement;
			memberOf_Measurement = (Analog)eResolveProxy(oldMemberOf_Measurement);
			if (memberOf_Measurement != oldMemberOf_Measurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT, oldMemberOf_Measurement, memberOf_Measurement));
			}
		}
		return memberOf_Measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog basicGetMemberOf_Measurement() {
		return memberOf_Measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_Measurement(Analog newMemberOf_Measurement, NotificationChain msgs) {
		Analog oldMemberOf_Measurement = memberOf_Measurement;
		memberOf_Measurement = newMemberOf_Measurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT, oldMemberOf_Measurement, newMemberOf_Measurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_Measurement(Analog newMemberOf_Measurement) {
		if (newMemberOf_Measurement != memberOf_Measurement) {
			NotificationChain msgs = null;
			if (memberOf_Measurement != null)
				msgs = ((InternalEObject)memberOf_Measurement).eInverseRemove(this, MeasPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES, Analog.class, msgs);
			if (newMemberOf_Measurement != null)
				msgs = ((InternalEObject)newMemberOf_Measurement).eInverseAdd(this, MeasPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES, Analog.class, msgs);
			msgs = basicSetMemberOf_Measurement(newMemberOf_Measurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT, newMemberOf_Measurement, newMemberOf_Measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				if (memberOf_Measurement != null)
					msgs = ((InternalEObject)memberOf_Measurement).eInverseRemove(this, MeasPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES, Analog.class, msgs);
				return basicSetMemberOf_Measurement((Analog)otherEnd, msgs);
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
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				return basicSetMemberOf_Measurement(null, msgs);
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
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				if (resolve) return getMemberOf_Measurement();
				return basicGetMemberOf_Measurement();
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
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				setMemberOf_Measurement((Analog)newValue);
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
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				setMemberOf_Measurement((Analog)null);
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
			case MeasPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT:
				return memberOf_Measurement != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalogValueImpl
