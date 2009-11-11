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
import CPSM.RegulationSchedule;
import CPSM.TapChanger;
import CPSM.Terminal;

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
 *   <li>{@link CPSM.impl.RegulatingControlImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CPSM.impl.RegulatingControlImpl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CPSM.impl.RegulatingControlImpl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CPSM.impl.RegulatingControlImpl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatingControlImpl extends PowerSystemResourceImpl implements RegulatingControl {
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
		return CPSMPackage.Literals.REGULATING_CONTROL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, terminal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_CONTROL__TERMINAL, oldTerminal, newTerminal);
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CPSMPackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CPSMPackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_CONTROL__TERMINAL, newTerminal, newTerminal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, oldRegulationSchedule, regulationSchedule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, oldRegulationSchedule, newRegulationSchedule);
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
				msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
			if (newRegulationSchedule != null)
				msgs = ((InternalEObject)newRegulationSchedule).eInverseAdd(this, CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
			msgs = basicSetRegulationSchedule(newRegulationSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, newRegulationSchedule, newRegulationSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapChanger> getTapChanger() {
		if (tapChanger == null) {
			tapChanger = new EObjectWithInverseResolvingEList<TapChanger>(TapChanger.class, this, CPSMPackage.REGULATING_CONTROL__TAP_CHANGER, CPSMPackage.TAP_CHANGER__REGULATING_CONTROL);
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
			regulatingCondEq = new EObjectWithInverseResolvingEList<RegulatingCondEq>(RegulatingCondEq.class, this, CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ, CPSMPackage.REGULATING_COND_EQ__REGULATING_CONTROL);
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CPSMPackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				if (regulationSchedule != null)
					msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, RegulationSchedule.class, msgs);
				return basicSetRegulationSchedule((RegulationSchedule)otherEnd, msgs);
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChanger()).basicAdd(otherEnd, msgs);
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				return basicSetTerminal(null, msgs);
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return basicSetRegulationSchedule(null, msgs);
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				return ((InternalEList<?>)getTapChanger()).basicRemove(otherEnd, msgs);
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				if (resolve) return getRegulationSchedule();
				return basicGetRegulationSchedule();
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				return getTapChanger();
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)newValue);
				return;
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				getTapChanger().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)null);
				return;
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				return;
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
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
			case CPSMPackage.REGULATING_CONTROL__TERMINAL:
				return terminal != null;
			case CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return regulationSchedule != null;
			case CPSMPackage.REGULATING_CONTROL__TAP_CHANGER:
				return tapChanger != null && !tapChanger.isEmpty();
			case CPSMPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null && !regulatingCondEq.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulatingControlImpl
