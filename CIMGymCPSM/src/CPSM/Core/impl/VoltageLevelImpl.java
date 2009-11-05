/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.Core.BaseVoltage;
import CPSM.Core.Bay;
import CPSM.Core.CorePackage;
import CPSM.Core.Substation;
import CPSM.Core.VoltageLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Core.impl.VoltageLevelImpl#getMemberOf_Substation <em>Member Of Substation</em>}</li>
 *   <li>{@link CPSM.Core.impl.VoltageLevelImpl#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link CPSM.Core.impl.VoltageLevelImpl#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link CPSM.Core.impl.VoltageLevelImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CPSM.Core.impl.VoltageLevelImpl#getContains_Bays <em>Contains Bays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageLevelImpl extends EquipmentContainerImpl implements VoltageLevel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getMemberOf_Substation() <em>Member Of Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_Substation()
	 * @generated
	 * @ordered
	 */
	protected Substation memberOf_Substation;

	/**
	 * The default value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double LOW_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected double lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double HIGH_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected double highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

	/**
	 * The cached value of the '{@link #getContains_Bays() <em>Contains Bays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_Bays()
	 * @generated
	 * @ordered
	 */
	protected EList<Bay> contains_Bays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VOLTAGE_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation getMemberOf_Substation() {
		if (memberOf_Substation != null && memberOf_Substation.eIsProxy()) {
			InternalEObject oldMemberOf_Substation = (InternalEObject)memberOf_Substation;
			memberOf_Substation = (Substation)eResolveProxy(oldMemberOf_Substation);
			if (memberOf_Substation != oldMemberOf_Substation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION, oldMemberOf_Substation, memberOf_Substation));
			}
		}
		return memberOf_Substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetMemberOf_Substation() {
		return memberOf_Substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_Substation(Substation newMemberOf_Substation, NotificationChain msgs) {
		Substation oldMemberOf_Substation = memberOf_Substation;
		memberOf_Substation = newMemberOf_Substation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION, oldMemberOf_Substation, newMemberOf_Substation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_Substation(Substation newMemberOf_Substation) {
		if (newMemberOf_Substation != memberOf_Substation) {
			NotificationChain msgs = null;
			if (memberOf_Substation != null)
				msgs = ((InternalEObject)memberOf_Substation).eInverseRemove(this, CorePackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS, Substation.class, msgs);
			if (newMemberOf_Substation != null)
				msgs = ((InternalEObject)newMemberOf_Substation).eInverseAdd(this, CorePackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS, Substation.class, msgs);
			msgs = basicSetMemberOf_Substation(newMemberOf_Substation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION, newMemberOf_Substation, newMemberOf_Substation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowVoltageLimit() {
		return lowVoltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowVoltageLimit(double newLowVoltageLimit) {
		double oldLowVoltageLimit = lowVoltageLimit;
		lowVoltageLimit = newLowVoltageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT, oldLowVoltageLimit, lowVoltageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHighVoltageLimit() {
		return highVoltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighVoltageLimit(double newHighVoltageLimit) {
		double oldHighVoltageLimit = highVoltageLimit;
		highVoltageLimit = newHighVoltageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT, oldHighVoltageLimit, highVoltageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, baseVoltage));
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bay> getContains_Bays() {
		if (contains_Bays == null) {
			contains_Bays = new EObjectWithInverseResolvingEList<Bay>(Bay.class, this, CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS, CorePackage.BAY__MEMBER_OF_VOLTAGE_LEVEL);
		}
		return contains_Bays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				if (memberOf_Substation != null)
					msgs = ((InternalEObject)memberOf_Substation).eInverseRemove(this, CorePackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS, Substation.class, msgs);
				return basicSetMemberOf_Substation((Substation)otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_Bays()).basicAdd(otherEnd, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				return basicSetMemberOf_Substation(null, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				return ((InternalEList<?>)getContains_Bays()).basicRemove(otherEnd, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				if (resolve) return getMemberOf_Substation();
				return basicGetMemberOf_Substation();
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return getLowVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return getHighVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				return getContains_Bays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				setMemberOf_Substation((Substation)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				setLowVoltageLimit((Double)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				setHighVoltageLimit((Double)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				getContains_Bays().clear();
				getContains_Bays().addAll((Collection<? extends Bay>)newValue);
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
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				setMemberOf_Substation((Substation)null);
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				setLowVoltageLimit(LOW_VOLTAGE_LIMIT_EDEFAULT);
				return;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				setHighVoltageLimit(HIGH_VOLTAGE_LIMIT_EDEFAULT);
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				getContains_Bays().clear();
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
			case CorePackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION:
				return memberOf_Substation != null;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return lowVoltageLimit != LOW_VOLTAGE_LIMIT_EDEFAULT;
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return highVoltageLimit != HIGH_VOLTAGE_LIMIT_EDEFAULT;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return baseVoltage != null;
			case CorePackage.VOLTAGE_LEVEL__CONTAINS_BAYS:
				return contains_Bays != null && !contains_Bays.isEmpty();
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
		result.append(" (lowVoltageLimit: ");
		result.append(lowVoltageLimit);
		result.append(", highVoltageLimit: ");
		result.append(highVoltageLimit);
		result.append(')');
		return result.toString();
	}

} //VoltageLevelImpl
