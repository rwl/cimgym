/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Equipment;
import CPSM.OperationalLimit;
import CPSM.OperationalLimitSet;

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
 * An implementation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.OperationalLimitSetImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link CPSM.impl.OperationalLimitSetImpl#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalLimitSetImpl extends IdentifiedObjectImpl implements OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

	/**
	 * The cached value of the '{@link #getOperationalLimitValue() <em>Operational Limit Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitValue()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimit> operationalLimitValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.OPERATIONAL_LIMIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject)equipment;
			equipment = (Equipment)eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, equipment));
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipment(Equipment newEquipment, NotificationChain msgs) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, newEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		if (newEquipment != equipment) {
			NotificationChain msgs = null;
			if (equipment != null)
				msgs = ((InternalEObject)equipment).eInverseRemove(this, CPSMPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
			if (newEquipment != null)
				msgs = ((InternalEObject)newEquipment).eInverseAdd(this, CPSMPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
			msgs = basicSetEquipment(newEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, newEquipment, newEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimit> getOperationalLimitValue() {
		if (operationalLimitValue == null) {
			operationalLimitValue = new EObjectWithInverseResolvingEList<OperationalLimit>(OperationalLimit.class, this, CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, CPSMPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET);
		}
		return operationalLimitValue;
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				if (equipment != null)
					msgs = ((InternalEObject)equipment).eInverseRemove(this, CPSMPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs);
				return basicSetEquipment((Equipment)otherEnd, msgs);
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitValue()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				return basicSetEquipment(null, msgs);
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return ((InternalEList<?>)getOperationalLimitValue()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				if (resolve) return getEquipment();
				return basicGetEquipment();
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return getOperationalLimitValue();
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				setEquipment((Equipment)newValue);
				return;
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				getOperationalLimitValue().clear();
				getOperationalLimitValue().addAll((Collection<? extends OperationalLimit>)newValue);
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				setEquipment((Equipment)null);
				return;
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				getOperationalLimitValue().clear();
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
			case CPSMPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
				return equipment != null;
			case CPSMPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
				return operationalLimitValue != null && !operationalLimitValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalLimitSetImpl
