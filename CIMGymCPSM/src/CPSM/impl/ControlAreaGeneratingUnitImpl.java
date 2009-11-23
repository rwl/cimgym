/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ControlArea;
import CPSM.ControlAreaGeneratingUnit;
import CPSM.GeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Area Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.ControlAreaGeneratingUnitImpl#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CPSM.impl.ControlAreaGeneratingUnitImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlAreaGeneratingUnitImpl extends ElementImpl implements ControlAreaGeneratingUnit {
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
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaGeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.CONTROL_AREA_GENERATING_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, controlArea));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, newControlArea);
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
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, CPSMPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, CPSMPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, newControlArea, newControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, CPSMPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
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
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
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
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
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
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
				return;
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
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
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)null);
				return;
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
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
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return controlArea != null;
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return generatingUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlAreaGeneratingUnitImpl
