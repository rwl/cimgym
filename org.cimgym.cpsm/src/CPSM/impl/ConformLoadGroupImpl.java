/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ConformLoad;
import CPSM.ConformLoadGroup;
import CPSM.ConformLoadSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.ConformLoadGroupImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link CPSM.impl.ConformLoadGroupImpl#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformLoadGroupImpl extends LoadGroupImpl implements ConformLoadGroup {
	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformLoad> energyConsumers;

	/**
	 * The cached value of the '{@link #getConformLoadSchedules() <em>Conform Load Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformLoadSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformLoadSchedule> conformLoadSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.CONFORM_LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformLoad> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new EObjectWithInverseResolvingEList<ConformLoad>(ConformLoad.class, this, CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, CPSMPackage.CONFORM_LOAD__LOAD_GROUP);
		}
		return energyConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformLoadSchedule> getConformLoadSchedules() {
		if (conformLoadSchedules == null) {
			conformLoadSchedules = new EObjectWithInverseResolvingEList<ConformLoadSchedule>(ConformLoadSchedule.class, this, CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, CPSMPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP);
		}
		return conformLoadSchedules;
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumers()).basicAdd(otherEnd, msgs);
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConformLoadSchedules()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return ((InternalEList<?>)getEnergyConsumers()).basicRemove(otherEnd, msgs);
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<?>)getConformLoadSchedules()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return getEnergyConsumers();
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return getConformLoadSchedules();
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends ConformLoad>)newValue);
				return;
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				getConformLoadSchedules().clear();
				getConformLoadSchedules().addAll((Collection<? extends ConformLoadSchedule>)newValue);
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				return;
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				getConformLoadSchedules().clear();
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
			case CPSMPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
			case CPSMPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return conformLoadSchedules != null && !conformLoadSchedules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformLoadGroupImpl
