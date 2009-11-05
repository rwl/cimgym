/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.Core.Bay;
import CPSM.Core.CorePackage;
import CPSM.Core.VoltageLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Core.impl.BayImpl#getMemberOf_VoltageLevel <em>Member Of Voltage Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getMemberOf_VoltageLevel() <em>Member Of Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_VoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected VoltageLevel memberOf_VoltageLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel getMemberOf_VoltageLevel() {
		if (memberOf_VoltageLevel != null && memberOf_VoltageLevel.eIsProxy()) {
			InternalEObject oldMemberOf_VoltageLevel = (InternalEObject)memberOf_VoltageLevel;
			memberOf_VoltageLevel = (VoltageLevel)eResolveProxy(oldMemberOf_VoltageLevel);
			if (memberOf_VoltageLevel != oldMemberOf_VoltageLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL, oldMemberOf_VoltageLevel, memberOf_VoltageLevel));
			}
		}
		return memberOf_VoltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel basicGetMemberOf_VoltageLevel() {
		return memberOf_VoltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_VoltageLevel(VoltageLevel newMemberOf_VoltageLevel, NotificationChain msgs) {
		VoltageLevel oldMemberOf_VoltageLevel = memberOf_VoltageLevel;
		memberOf_VoltageLevel = newMemberOf_VoltageLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL, oldMemberOf_VoltageLevel, newMemberOf_VoltageLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_VoltageLevel(VoltageLevel newMemberOf_VoltageLevel) {
		if (newMemberOf_VoltageLevel != memberOf_VoltageLevel) {
			NotificationChain msgs = null;
			if (memberOf_VoltageLevel != null)
				msgs = ((InternalEObject)memberOf_VoltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS, VoltageLevel.class, msgs);
			if (newMemberOf_VoltageLevel != null)
				msgs = ((InternalEObject)newMemberOf_VoltageLevel).eInverseAdd(this, CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS, VoltageLevel.class, msgs);
			msgs = basicSetMemberOf_VoltageLevel(newMemberOf_VoltageLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL, newMemberOf_VoltageLevel, newMemberOf_VoltageLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				if (memberOf_VoltageLevel != null)
					msgs = ((InternalEObject)memberOf_VoltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS, VoltageLevel.class, msgs);
				return basicSetMemberOf_VoltageLevel((VoltageLevel)otherEnd, msgs);
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
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				return basicSetMemberOf_VoltageLevel(null, msgs);
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
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				if (resolve) return getMemberOf_VoltageLevel();
				return basicGetMemberOf_VoltageLevel();
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
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				setMemberOf_VoltageLevel((VoltageLevel)newValue);
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
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				setMemberOf_VoltageLevel((VoltageLevel)null);
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
			case CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL:
				return memberOf_VoltageLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //BayImpl
