/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Discrete;
import CPSM.DiscreteValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.DiscreteValueImpl#getMemberOf_Measurement <em>Member Of Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteValueImpl extends MeasurementValueImpl implements DiscreteValue {
	/**
	 * The cached value of the '{@link #getMemberOf_Measurement() <em>Member Of Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_Measurement()
	 * @generated
	 * @ordered
	 */
	protected Discrete memberOf_Measurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.DISCRETE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete getMemberOf_Measurement() {
		if (memberOf_Measurement != null && memberOf_Measurement.eIsProxy()) {
			InternalEObject oldMemberOf_Measurement = (InternalEObject)memberOf_Measurement;
			memberOf_Measurement = (Discrete)eResolveProxy(oldMemberOf_Measurement);
			if (memberOf_Measurement != oldMemberOf_Measurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT, oldMemberOf_Measurement, memberOf_Measurement));
			}
		}
		return memberOf_Measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete basicGetMemberOf_Measurement() {
		return memberOf_Measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_Measurement(Discrete newMemberOf_Measurement, NotificationChain msgs) {
		Discrete oldMemberOf_Measurement = memberOf_Measurement;
		memberOf_Measurement = newMemberOf_Measurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT, oldMemberOf_Measurement, newMemberOf_Measurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_Measurement(Discrete newMemberOf_Measurement) {
		if (newMemberOf_Measurement != memberOf_Measurement) {
			NotificationChain msgs = null;
			if (memberOf_Measurement != null)
				msgs = ((InternalEObject)memberOf_Measurement).eInverseRemove(this, CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES, Discrete.class, msgs);
			if (newMemberOf_Measurement != null)
				msgs = ((InternalEObject)newMemberOf_Measurement).eInverseAdd(this, CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES, Discrete.class, msgs);
			msgs = basicSetMemberOf_Measurement(newMemberOf_Measurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT, newMemberOf_Measurement, newMemberOf_Measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
				if (memberOf_Measurement != null)
					msgs = ((InternalEObject)memberOf_Measurement).eInverseRemove(this, CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES, Discrete.class, msgs);
				return basicSetMemberOf_Measurement((Discrete)otherEnd, msgs);
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
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
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
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
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
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
				setMemberOf_Measurement((Discrete)newValue);
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
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
				setMemberOf_Measurement((Discrete)null);
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
			case CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT:
				return memberOf_Measurement != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteValueImpl
