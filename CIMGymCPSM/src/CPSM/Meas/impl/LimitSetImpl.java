/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

import CPSM.Core.impl.IdentifiedObjectImpl;

import CPSM.Meas.LimitSet;
import CPSM.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Meas.impl.LimitSetImpl#isIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitSetImpl extends IdentifiedObjectImpl implements LimitSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The default value of the '{@link #isIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentageLimits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERCENTAGE_LIMITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentageLimits()
	 * @generated
	 * @ordered
	 */
	protected boolean isPercentageLimits = IS_PERCENTAGE_LIMITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.LIMIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPercentageLimits() {
		return isPercentageLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPercentageLimits(boolean newIsPercentageLimits) {
		boolean oldIsPercentageLimits = isPercentageLimits;
		isPercentageLimits = newIsPercentageLimits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS, oldIsPercentageLimits, isPercentageLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				return isIsPercentageLimits();
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				setIsPercentageLimits((Boolean)newValue);
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				setIsPercentageLimits(IS_PERCENTAGE_LIMITS_EDEFAULT);
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				return isPercentageLimits != IS_PERCENTAGE_LIMITS_EDEFAULT;
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
		result.append(" (isPercentageLimits: ");
		result.append(isPercentageLimits);
		result.append(')');
		return result.toString();
	}

} //LimitSetImpl
