/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.BaseVoltage;
import CPSM.CPSMPackage;
import CPSM.ConductingEquipment;
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
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.ConductingEquipmentImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CPSM.impl.ConductingEquipmentImpl#getTerminals <em>Terminals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConductingEquipmentImpl extends EquipmentImpl implements ConductingEquipment {
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
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductingEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.CONDUCTING_EQUIPMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, baseVoltage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage);
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
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectWithInverseResolvingEList<Terminal>(Terminal.class, this, CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS, CPSMPackage.TERMINAL__CONDUCTING_EQUIPMENT);
		}
		return terminals;
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return getTerminals();
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
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
			case CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return baseVoltage != null;
			case CPSMPackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return terminals != null && !terminals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConductingEquipmentImpl
