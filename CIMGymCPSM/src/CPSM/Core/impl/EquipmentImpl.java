/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.Core.CorePackage;
import CPSM.Core.Equipment;
import CPSM.Core.EquipmentContainer;

import CPSM.OperationalLimits.OperationalLimitSet;
import CPSM.OperationalLimits.OperationalLimitsPackage;

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
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Core.impl.EquipmentImpl#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}</li>
 *   <li>{@link CPSM.Core.impl.EquipmentImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EquipmentImpl extends PowerSystemResourceImpl implements Equipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getMemberOf_EquipmentContainer() <em>Member Of Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_EquipmentContainer()
	 * @generated
	 * @ordered
	 */
	protected EquipmentContainer memberOf_EquipmentContainer;

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimitSet> operationalLimitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer getMemberOf_EquipmentContainer() {
		if (memberOf_EquipmentContainer != null && memberOf_EquipmentContainer.eIsProxy()) {
			InternalEObject oldMemberOf_EquipmentContainer = (InternalEObject)memberOf_EquipmentContainer;
			memberOf_EquipmentContainer = (EquipmentContainer)eResolveProxy(oldMemberOf_EquipmentContainer);
			if (memberOf_EquipmentContainer != oldMemberOf_EquipmentContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER, oldMemberOf_EquipmentContainer, memberOf_EquipmentContainer));
			}
		}
		return memberOf_EquipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer basicGetMemberOf_EquipmentContainer() {
		return memberOf_EquipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_EquipmentContainer(EquipmentContainer newMemberOf_EquipmentContainer, NotificationChain msgs) {
		EquipmentContainer oldMemberOf_EquipmentContainer = memberOf_EquipmentContainer;
		memberOf_EquipmentContainer = newMemberOf_EquipmentContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER, oldMemberOf_EquipmentContainer, newMemberOf_EquipmentContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_EquipmentContainer(EquipmentContainer newMemberOf_EquipmentContainer) {
		if (newMemberOf_EquipmentContainer != memberOf_EquipmentContainer) {
			NotificationChain msgs = null;
			if (memberOf_EquipmentContainer != null)
				msgs = ((InternalEObject)memberOf_EquipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS, EquipmentContainer.class, msgs);
			if (newMemberOf_EquipmentContainer != null)
				msgs = ((InternalEObject)newMemberOf_EquipmentContainer).eInverseAdd(this, CorePackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS, EquipmentContainer.class, msgs);
			msgs = basicSetMemberOf_EquipmentContainer(newMemberOf_EquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER, newMemberOf_EquipmentContainer, newMemberOf_EquipmentContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimitSet> getOperationalLimitSet() {
		if (operationalLimitSet == null) {
			operationalLimitSet = new EObjectWithInverseResolvingEList<OperationalLimitSet>(OperationalLimitSet.class, this, CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT);
		}
		return operationalLimitSet;
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				if (memberOf_EquipmentContainer != null)
					msgs = ((InternalEObject)memberOf_EquipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS, EquipmentContainer.class, msgs);
				return basicSetMemberOf_EquipmentContainer((EquipmentContainer)otherEnd, msgs);
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitSet()).basicAdd(otherEnd, msgs);
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				return basicSetMemberOf_EquipmentContainer(null, msgs);
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<?>)getOperationalLimitSet()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				if (resolve) return getMemberOf_EquipmentContainer();
				return basicGetMemberOf_EquipmentContainer();
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return getOperationalLimitSet();
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				setMemberOf_EquipmentContainer((EquipmentContainer)newValue);
				return;
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				getOperationalLimitSet().addAll((Collection<? extends OperationalLimitSet>)newValue);
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				setMemberOf_EquipmentContainer((EquipmentContainer)null);
				return;
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
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
			case CorePackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER:
				return memberOf_EquipmentContainer != null;
			case CorePackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null && !operationalLimitSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquipmentImpl
