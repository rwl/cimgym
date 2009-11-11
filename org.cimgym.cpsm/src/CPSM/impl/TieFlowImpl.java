/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ControlArea;
import CPSM.TieFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.TieFlowImpl#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CPSM.impl.TieFlowImpl#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TieFlowImpl extends ElementImpl implements TieFlow {
	/**
	 * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlArea()
	 * @generated
	 * @ordered
	 */
	protected ControlArea controlArea;

	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.TIE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea getControlArea() {
		if (controlArea != null && controlArea.eIsProxy()) {
			InternalEObject oldControlArea = (InternalEObject)controlArea;
			controlArea = (ControlArea)eResolveProxy(oldControlArea);
			if (controlArea != oldControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, controlArea));
			}
		}
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetControlArea() {
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlArea(ControlArea newControlArea, NotificationChain msgs) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, newControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlArea(ControlArea newControlArea) {
		if (newControlArea != controlArea) {
			NotificationChain msgs = null;
			if (controlArea != null)
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, CPSMPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, CPSMPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.TIE_FLOW__CONTROL_AREA, newControlArea, newControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		boolean oldPositiveFlowIn = positiveFlowIn;
		positiveFlowIn = newPositiveFlowIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.TIE_FLOW__POSITIVE_FLOW_IN, oldPositiveFlowIn, positiveFlowIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, CPSMPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
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
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
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
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
			case CPSMPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
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
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
				return;
			case CPSMPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
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
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)null);
				return;
			case CPSMPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				setPositiveFlowIn(POSITIVE_FLOW_IN_EDEFAULT);
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
			case CPSMPackage.TIE_FLOW__CONTROL_AREA:
				return controlArea != null;
			case CPSMPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return positiveFlowIn != POSITIVE_FLOW_IN_EDEFAULT;
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
		result.append(" (positiveFlowIn: ");
		result.append(positiveFlowIn);
		result.append(')');
		return result.toString();
	}

} //TieFlowImpl
