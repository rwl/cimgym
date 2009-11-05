/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Core.CorePackage;
import CPSM.Core.Terminal;

import CPSM.Core.impl.PowerSystemResourceImpl;

import CPSM.Wires.RegulatingCondEq;
import CPSM.Wires.RegulatingControl;
import CPSM.Wires.RegulationSchedule;
import CPSM.Wires.TapChanger;
import CPSM.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.RegulatingControlImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CPSM.Wires.impl.RegulatingControlImpl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CPSM.Wires.impl.RegulatingControlImpl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CPSM.Wires.impl.RegulatingControlImpl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatingControlImpl extends PowerSystemResourceImpl implements RegulatingControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

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
	 * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationSchedule()
	 * @generated
	 * @ordered
	 */
	protected RegulationSchedule regulationSchedule;

	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChanger> tapChanger;

	/**
	 * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingCondEq()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingCondEq> regulatingCondEq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatingControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATING_CONTROL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, terminal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, newTerminal);
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule getRegulationSchedule() {
		if (regulationSchedule != null && regulationSchedule.eIsProxy()) {
			InternalEObject oldRegulationSchedule = (InternalEObject)regulationSchedule;
			regulationSchedule = (RegulationSchedule)eResolveProxy(oldRegulationSchedule);
			if (regulationSchedule != oldRegulationSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, oldRegulationSchedule, regulationSchedule));
			}
		}
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule basicGetRegulationSchedule() {
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulationSchedule(RegulationSchedule newRegulationSchedule, NotificationChain msgs) {
		RegulationSchedule oldRegulationSchedule = regulationSchedule;
		regulationSchedule = newRegulationSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, oldRegulationSchedule, newRegulationSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulationSchedule(RegulationSchedule newRegulationSchedule) {
		if (newRegulationSchedule != regulationSchedule) {
			NotificationChain msgs = null;
			if (regulationSchedule != null)
				msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
			if (newRegulationSchedule != null)
				msgs = ((InternalEObject)newRegulationSchedule).eInverseAdd(this, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
			msgs = basicSetRegulationSchedule(newRegulationSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, newRegulationSchedule, newRegulationSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapChanger> getTapChanger() {
		if (tapChanger == null) {
			tapChanger = new EObjectWithInverseResolvingEList<TapChanger>(TapChanger.class, this, WiresPackage.REGULATING_CONTROL__TAP_CHANGER, WiresPackage.TAP_CHANGER__REGULATING_CONTROL);
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatingCondEq> getRegulatingCondEq() {
		if (regulatingCondEq == null) {
			regulatingCondEq = new EObjectWithInverseResolvingEList<RegulatingCondEq>(RegulatingCondEq.class, this, WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ, WiresPackage.REGULATING_COND_EQ__REGULATING_CONTROL);
		}
		return regulatingCondEq;
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				if (regulationSchedule != null)
					msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
				return basicSetRegulationSchedule((RegulationSchedule)otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChanger()).basicAdd(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingCondEq()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return basicSetTerminal(null, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return basicSetRegulationSchedule(null, msgs);
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<?>)getTapChanger()).basicRemove(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<?>)getRegulatingCondEq()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				if (resolve) return getRegulationSchedule();
				return basicGetRegulationSchedule();
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return getTapChanger();
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return getRegulatingCondEq();
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				getTapChanger().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
				getRegulatingCondEq().addAll((Collection<? extends RegulatingCondEq>)newValue);
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)null);
				return;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
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
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return terminal != null;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return regulationSchedule != null;
			case WiresPackage.REGULATING_CONTROL__TAP_CHANGER:
				return tapChanger != null && !tapChanger.isEmpty();
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null && !regulatingCondEq.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulatingControlImpl
