/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Measurement;
import CPSM.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.PowerSystemResourceImpl#getContains_Measurements <em>Contains Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PowerSystemResourceImpl extends IdentifiedObjectImpl implements PowerSystemResource {
	/**
	 * The cached value of the '{@link #getContains_Measurements() <em>Contains Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_Measurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> contains_Measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.POWER_SYSTEM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getContains_Measurements() {
		if (contains_Measurements == null) {
			contains_Measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS, CPSMPackage.MEASUREMENT__MEMBER_OF_PSR);
		}
		return contains_Measurements;
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_Measurements()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				return ((InternalEList<?>)getContains_Measurements()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				return getContains_Measurements();
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				getContains_Measurements().clear();
				getContains_Measurements().addAll((Collection<? extends Measurement>)newValue);
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				getContains_Measurements().clear();
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
			case CPSMPackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS:
				return contains_Measurements != null && !contains_Measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerSystemResourceImpl
