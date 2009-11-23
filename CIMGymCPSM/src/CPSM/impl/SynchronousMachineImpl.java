/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.GeneratingUnit;
import CPSM.ReactiveCapabilityCurve;
import CPSM.SynchronousMachine;
import CPSM.SynchronousMachineOperatingMode;
import CPSM.SynchronousMachineType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}</li>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link CPSM.impl.SynchronousMachineImpl#getMaxQ <em>Max Q</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronousMachineImpl extends RegulatingCondEqImpl implements SynchronousMachine {
	/**
	 * The cached value of the '{@link #getInitialReactiveCapabilityCurve() <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 * @ordered
	 */
	protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;

	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineOperatingMode OPERATING_MODE_EDEFAULT = SynchronousMachineOperatingMode.GENERATOR;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberOf_GeneratingUnit() <em>Member Of Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_GeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit memberOf_GeneratingUnit;

	/**
	 * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected double minQ = MIN_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineType TYPE_EDEFAULT = SynchronousMachineType.GENERATOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected double maxQ = MAX_Q_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.SYNCHRONOUS_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
		if (initialReactiveCapabilityCurve != null && initialReactiveCapabilityCurve.eIsProxy()) {
			InternalEObject oldInitialReactiveCapabilityCurve = (InternalEObject)initialReactiveCapabilityCurve;
			initialReactiveCapabilityCurve = (ReactiveCapabilityCurve)eResolveProxy(oldInitialReactiveCapabilityCurve);
			if (initialReactiveCapabilityCurve != oldInitialReactiveCapabilityCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, oldInitialReactiveCapabilityCurve, initialReactiveCapabilityCurve));
			}
		}
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve basicGetInitialReactiveCapabilityCurve() {
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve, NotificationChain msgs) {
		ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
		initialReactiveCapabilityCurve = newInitialReactiveCapabilityCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, oldInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve) {
		if (newInitialReactiveCapabilityCurve != initialReactiveCapabilityCurve) {
			NotificationChain msgs = null;
			if (initialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, CPSMPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE, ReactiveCapabilityCurve.class, msgs);
			if (newInitialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)newInitialReactiveCapabilityCurve).eInverseAdd(this, CPSMPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE, ReactiveCapabilityCurve.class, msgs);
			msgs = basicSetInitialReactiveCapabilityCurve(newInitialReactiveCapabilityCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, newInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineOperatingMode getOperatingMode() {
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingMode(SynchronousMachineOperatingMode newOperatingMode) {
		SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
		operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE, oldOperatingMode, operatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getMemberOf_GeneratingUnit() {
		if (memberOf_GeneratingUnit != null && memberOf_GeneratingUnit.eIsProxy()) {
			InternalEObject oldMemberOf_GeneratingUnit = (InternalEObject)memberOf_GeneratingUnit;
			memberOf_GeneratingUnit = (GeneratingUnit)eResolveProxy(oldMemberOf_GeneratingUnit);
			if (memberOf_GeneratingUnit != oldMemberOf_GeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT, oldMemberOf_GeneratingUnit, memberOf_GeneratingUnit));
			}
		}
		return memberOf_GeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetMemberOf_GeneratingUnit() {
		return memberOf_GeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_GeneratingUnit(GeneratingUnit newMemberOf_GeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldMemberOf_GeneratingUnit = memberOf_GeneratingUnit;
		memberOf_GeneratingUnit = newMemberOf_GeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT, oldMemberOf_GeneratingUnit, newMemberOf_GeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_GeneratingUnit(GeneratingUnit newMemberOf_GeneratingUnit) {
		if (newMemberOf_GeneratingUnit != memberOf_GeneratingUnit) {
			NotificationChain msgs = null;
			if (memberOf_GeneratingUnit != null)
				msgs = ((InternalEObject)memberOf_GeneratingUnit).eInverseRemove(this, CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			if (newMemberOf_GeneratingUnit != null)
				msgs = ((InternalEObject)newMemberOf_GeneratingUnit).eInverseAdd(this, CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			msgs = basicSetMemberOf_GeneratingUnit(newMemberOf_GeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT, newMemberOf_GeneratingUnit, newMemberOf_GeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinQ() {
		return minQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinQ(double newMinQ) {
		double oldMinQ = minQ;
		minQ = newMinQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ, minQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SynchronousMachineType newType) {
		SynchronousMachineType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxQ() {
		return maxQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxQ(double newMaxQ) {
		double oldMaxQ = maxQ;
		maxQ = newMaxQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ, maxQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (initialReactiveCapabilityCurve != null)
					msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, CPSMPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINE, ReactiveCapabilityCurve.class, msgs);
				return basicSetInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)otherEnd, msgs);
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				if (memberOf_GeneratingUnit != null)
					msgs = ((InternalEObject)memberOf_GeneratingUnit).eInverseRemove(this, CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
				return basicSetMemberOf_GeneratingUnit((GeneratingUnit)otherEnd, msgs);
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
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return basicSetInitialReactiveCapabilityCurve(null, msgs);
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				return basicSetMemberOf_GeneratingUnit(null, msgs);
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
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (resolve) return getInitialReactiveCapabilityCurve();
				return basicGetInitialReactiveCapabilityCurve();
			case CPSMPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return getOperatingMode();
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				if (resolve) return getMemberOf_GeneratingUnit();
				return basicGetMemberOf_GeneratingUnit();
			case CPSMPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return getMinQ();
			case CPSMPackage.SYNCHRONOUS_MACHINE__TYPE:
				return getType();
			case CPSMPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return getMaxQ();
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
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)newValue);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				setOperatingMode((SynchronousMachineOperatingMode)newValue);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				setMemberOf_GeneratingUnit((GeneratingUnit)newValue);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				setMinQ((Double)newValue);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__TYPE:
				setType((SynchronousMachineType)newValue);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				setMaxQ((Double)newValue);
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
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)null);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				setMemberOf_GeneratingUnit((GeneratingUnit)null);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				setMinQ(MIN_Q_EDEFAULT);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				setMaxQ(MAX_Q_EDEFAULT);
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
			case CPSMPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return initialReactiveCapabilityCurve != null;
			case CPSMPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return operatingMode != OPERATING_MODE_EDEFAULT;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT:
				return memberOf_GeneratingUnit != null;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return minQ != MIN_Q_EDEFAULT;
			case CPSMPackage.SYNCHRONOUS_MACHINE__TYPE:
				return type != TYPE_EDEFAULT;
			case CPSMPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return maxQ != MAX_Q_EDEFAULT;
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
		result.append(" (operatingMode: ");
		result.append(operatingMode);
		result.append(", minQ: ");
		result.append(minQ);
		result.append(", type: ");
		result.append(type);
		result.append(", maxQ: ");
		result.append(maxQ);
		result.append(')');
		return result.toString();
	}

} //SynchronousMachineImpl
