/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.RegulatingCondEq;
import CPSM.RegulatingControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.RegulatingCondEqImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RegulatingCondEqImpl extends ConductingEquipmentImpl implements RegulatingCondEq {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatingCondEqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.REGULATING_COND_EQ;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, regulatingControl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL, oldRegulatingControl, newRegulatingControl);
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
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL, newRegulatingControl, newRegulatingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
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
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
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
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
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
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
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
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
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
			case CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL:
				return regulatingControl != null;
		}
		return super.eIsSet(featureID);
	}

} //RegulatingCondEqImpl
