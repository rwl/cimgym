/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

import CPSM.Core.CorePackage;
import CPSM.Core.PowerSystemResource;
import CPSM.Core.Terminal;
import CPSM.Core.Unit;

import CPSM.Core.impl.IdentifiedObjectImpl;

import CPSM.Meas.MeasPackage;
import CPSM.Meas.Measurement;
import CPSM.Meas.MeasurementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Meas.impl.MeasurementImpl#getMemberOf_PSR <em>Member Of PSR</em>}</li>
 *   <li>{@link CPSM.Meas.impl.MeasurementImpl#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link CPSM.Meas.impl.MeasurementImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CPSM.Meas.impl.MeasurementImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends IdentifiedObjectImpl implements Measurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getMemberOf_PSR() <em>Member Of PSR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_PSR()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource memberOf_PSR;

	/**
	 * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementType()
	 * @generated
	 * @ordered
	 */
	protected MeasurementType measurementType;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getMemberOf_PSR() {
		if (memberOf_PSR != null && memberOf_PSR.eIsProxy()) {
			InternalEObject oldMemberOf_PSR = (InternalEObject)memberOf_PSR;
			memberOf_PSR = (PowerSystemResource)eResolveProxy(oldMemberOf_PSR);
			if (memberOf_PSR != oldMemberOf_PSR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__MEMBER_OF_PSR, oldMemberOf_PSR, memberOf_PSR));
			}
		}
		return memberOf_PSR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetMemberOf_PSR() {
		return memberOf_PSR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_PSR(PowerSystemResource newMemberOf_PSR, NotificationChain msgs) {
		PowerSystemResource oldMemberOf_PSR = memberOf_PSR;
		memberOf_PSR = newMemberOf_PSR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__MEMBER_OF_PSR, oldMemberOf_PSR, newMemberOf_PSR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_PSR(PowerSystemResource newMemberOf_PSR) {
		if (newMemberOf_PSR != memberOf_PSR) {
			NotificationChain msgs = null;
			if (memberOf_PSR != null)
				msgs = ((InternalEObject)memberOf_PSR).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS, PowerSystemResource.class, msgs);
			if (newMemberOf_PSR != null)
				msgs = ((InternalEObject)newMemberOf_PSR).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS, PowerSystemResource.class, msgs);
			msgs = basicSetMemberOf_PSR(newMemberOf_PSR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__MEMBER_OF_PSR, newMemberOf_PSR, newMemberOf_PSR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType getMeasurementType() {
		if (measurementType != null && measurementType.eIsProxy()) {
			InternalEObject oldMeasurementType = (InternalEObject)measurementType;
			measurementType = (MeasurementType)eResolveProxy(oldMeasurementType);
			if (measurementType != oldMeasurementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__MEASUREMENT_TYPE, oldMeasurementType, measurementType));
			}
		}
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementType basicGetMeasurementType() {
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementType(MeasurementType newMeasurementType, NotificationChain msgs) {
		MeasurementType oldMeasurementType = measurementType;
		measurementType = newMeasurementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__MEASUREMENT_TYPE, oldMeasurementType, newMeasurementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementType(MeasurementType newMeasurementType) {
		if (newMeasurementType != measurementType) {
			NotificationChain msgs = null;
			if (measurementType != null)
				msgs = ((InternalEObject)measurementType).eInverseRemove(this, MeasPackage.MEASUREMENT_TYPE__MEASUREMENTS, MeasurementType.class, msgs);
			if (newMeasurementType != null)
				msgs = ((InternalEObject)newMeasurementType).eInverseAdd(this, MeasPackage.MEASUREMENT_TYPE__MEASUREMENTS, MeasurementType.class, msgs);
			msgs = basicSetMeasurementType(newMeasurementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__MEASUREMENT_TYPE, newMeasurementType, newMeasurementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				if (memberOf_PSR != null)
					msgs = ((InternalEObject)memberOf_PSR).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS, PowerSystemResource.class, msgs);
				return basicSetMemberOf_PSR((PowerSystemResource)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				if (measurementType != null)
					msgs = ((InternalEObject)measurementType).eInverseRemove(this, MeasPackage.MEASUREMENT_TYPE__MEASUREMENTS, MeasurementType.class, msgs);
				return basicSetMeasurementType((MeasurementType)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__UNIT:
				if (unit != null)
					msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
				return basicSetUnit((Unit)otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				return basicSetMemberOf_PSR(null, msgs);
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				return basicSetMeasurementType(null, msgs);
			case MeasPackage.MEASUREMENT__TERMINAL:
				return basicSetTerminal(null, msgs);
			case MeasPackage.MEASUREMENT__UNIT:
				return basicSetUnit(null, msgs);
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
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				if (resolve) return getMemberOf_PSR();
				return basicGetMemberOf_PSR();
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				if (resolve) return getMeasurementType();
				return basicGetMeasurementType();
			case MeasPackage.MEASUREMENT__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case MeasPackage.MEASUREMENT__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
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
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				setMemberOf_PSR((PowerSystemResource)newValue);
				return;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType((MeasurementType)newValue);
				return;
			case MeasPackage.MEASUREMENT__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case MeasPackage.MEASUREMENT__UNIT:
				setUnit((Unit)newValue);
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
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				setMemberOf_PSR((PowerSystemResource)null);
				return;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType((MeasurementType)null);
				return;
			case MeasPackage.MEASUREMENT__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case MeasPackage.MEASUREMENT__UNIT:
				setUnit((Unit)null);
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
			case MeasPackage.MEASUREMENT__MEMBER_OF_PSR:
				return memberOf_PSR != null;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				return measurementType != null;
			case MeasPackage.MEASUREMENT__TERMINAL:
				return terminal != null;
			case MeasPackage.MEASUREMENT__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
