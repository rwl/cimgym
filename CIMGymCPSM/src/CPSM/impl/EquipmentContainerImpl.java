/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Equipment;
import CPSM.EquipmentContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.EquipmentContainerImpl#getContains_Equipments <em>Contains Equipments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EquipmentContainerImpl extends ConnectivityNodeContainerImpl implements EquipmentContainer {
	/**
	 * The cached value of the '{@link #getContains_Equipments() <em>Contains Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_Equipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipment> contains_Equipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.EQUIPMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipment> getContains_Equipments() {
		if (contains_Equipments == null) {
			contains_Equipments = new EObjectWithInverseResolvingEList<Equipment>(Equipment.class, this, CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS, CPSMPackage.EQUIPMENT__MEMBER_OF_EQUIPMENT_CONTAINER);
		}
		return contains_Equipments;
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_Equipments()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				return ((InternalEList<?>)getContains_Equipments()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				return getContains_Equipments();
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				getContains_Equipments().clear();
				getContains_Equipments().addAll((Collection<? extends Equipment>)newValue);
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				getContains_Equipments().clear();
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
			case CPSMPackage.EQUIPMENT_CONTAINER__CONTAINS_EQUIPMENTS:
				return contains_Equipments != null && !contains_Equipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquipmentContainerImpl
