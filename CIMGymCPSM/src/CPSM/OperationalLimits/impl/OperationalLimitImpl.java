/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits.impl;

import CPSM.Core.impl.IdentifiedObjectImpl;

import CPSM.OperationalLimits.OperationalLimit;
import CPSM.OperationalLimits.OperationalLimitSet;
import CPSM.OperationalLimits.OperationalLimitsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.OperationalLimits.impl.OperationalLimitImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link CPSM.OperationalLimits.impl.OperationalLimitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalLimitImpl extends IdentifiedObjectImpl implements OperationalLimit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitSet operationalLimitSet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet getOperationalLimitSet() {
		if (operationalLimitSet != null && operationalLimitSet.eIsProxy()) {
			InternalEObject oldOperationalLimitSet = (InternalEObject)operationalLimitSet;
			operationalLimitSet = (OperationalLimitSet)eResolveProxy(oldOperationalLimitSet);
			if (operationalLimitSet != oldOperationalLimitSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, operationalLimitSet));
			}
		}
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet basicGetOperationalLimitSet() {
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalLimitSet(OperationalLimitSet newOperationalLimitSet, NotificationChain msgs) {
		OperationalLimitSet oldOperationalLimitSet = operationalLimitSet;
		operationalLimitSet = newOperationalLimitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, newOperationalLimitSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalLimitSet(OperationalLimitSet newOperationalLimitSet) {
		if (newOperationalLimitSet != operationalLimitSet) {
			NotificationChain msgs = null;
			if (operationalLimitSet != null)
				msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			if (newOperationalLimitSet != null)
				msgs = ((InternalEObject)newOperationalLimitSet).eInverseAdd(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			msgs = basicSetOperationalLimitSet(newOperationalLimitSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, newOperationalLimitSet, newOperationalLimitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (operationalLimitSet != null)
					msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
				return basicSetOperationalLimitSet((OperationalLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return basicSetOperationalLimitSet(null, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (resolve) return getOperationalLimitSet();
				return basicGetOperationalLimitSet();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				return getType();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				setType((String)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)null);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OperationalLimitImpl
