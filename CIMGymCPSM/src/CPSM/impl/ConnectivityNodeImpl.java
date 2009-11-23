/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ConnectivityNode;
import CPSM.ConnectivityNodeContainer;
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
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.ConnectivityNodeImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link CPSM.impl.ConnectivityNodeImpl#getMemberOf_EquipmentContainer <em>Member Of Equipment Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends IdentifiedObjectImpl implements ConnectivityNode {
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
	 * The cached value of the '{@link #getMemberOf_EquipmentContainer() <em>Member Of Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_EquipmentContainer()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNodeContainer memberOf_EquipmentContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.CONNECTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectWithInverseResolvingEList<Terminal>(Terminal.class, this, CPSMPackage.CONNECTIVITY_NODE__TERMINALS, CPSMPackage.TERMINAL__CONNECTIVITY_NODE);
		}
		return terminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer getMemberOf_EquipmentContainer() {
		if (memberOf_EquipmentContainer != null && memberOf_EquipmentContainer.eIsProxy()) {
			InternalEObject oldMemberOf_EquipmentContainer = (InternalEObject)memberOf_EquipmentContainer;
			memberOf_EquipmentContainer = (ConnectivityNodeContainer)eResolveProxy(oldMemberOf_EquipmentContainer);
			if (memberOf_EquipmentContainer != oldMemberOf_EquipmentContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER, oldMemberOf_EquipmentContainer, memberOf_EquipmentContainer));
			}
		}
		return memberOf_EquipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer basicGetMemberOf_EquipmentContainer() {
		return memberOf_EquipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_EquipmentContainer(ConnectivityNodeContainer newMemberOf_EquipmentContainer, NotificationChain msgs) {
		ConnectivityNodeContainer oldMemberOf_EquipmentContainer = memberOf_EquipmentContainer;
		memberOf_EquipmentContainer = newMemberOf_EquipmentContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER, oldMemberOf_EquipmentContainer, newMemberOf_EquipmentContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_EquipmentContainer(ConnectivityNodeContainer newMemberOf_EquipmentContainer) {
		if (newMemberOf_EquipmentContainer != memberOf_EquipmentContainer) {
			NotificationChain msgs = null;
			if (memberOf_EquipmentContainer != null)
				msgs = ((InternalEObject)memberOf_EquipmentContainer).eInverseRemove(this, CPSMPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			if (newMemberOf_EquipmentContainer != null)
				msgs = ((InternalEObject)newMemberOf_EquipmentContainer).eInverseAdd(this, CPSMPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			msgs = basicSetMemberOf_EquipmentContainer(newMemberOf_EquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER, newMemberOf_EquipmentContainer, newMemberOf_EquipmentContainer));
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				if (memberOf_EquipmentContainer != null)
					msgs = ((InternalEObject)memberOf_EquipmentContainer).eInverseRemove(this, CPSMPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
				return basicSetMemberOf_EquipmentContainer((ConnectivityNodeContainer)otherEnd, msgs);
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				return basicSetMemberOf_EquipmentContainer(null, msgs);
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				return getTerminals();
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				if (resolve) return getMemberOf_EquipmentContainer();
				return basicGetMemberOf_EquipmentContainer();
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
				return;
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				setMemberOf_EquipmentContainer((ConnectivityNodeContainer)newValue);
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
				return;
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				setMemberOf_EquipmentContainer((ConnectivityNodeContainer)null);
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
			case CPSMPackage.CONNECTIVITY_NODE__TERMINALS:
				return terminals != null && !terminals.isEmpty();
			case CPSMPackage.CONNECTIVITY_NODE__MEMBER_OF_EQUIPMENT_CONTAINER:
				return memberOf_EquipmentContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectivityNodeImpl
