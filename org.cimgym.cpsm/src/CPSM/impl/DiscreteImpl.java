/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Discrete;
import CPSM.DiscreteValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.DiscreteImpl#getContain_MeasurementValues <em>Contain Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteImpl extends MeasurementImpl implements Discrete {
	/**
	 * The cached value of the '{@link #getContain_MeasurementValues() <em>Contain Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain_MeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteValue> contain_MeasurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.DISCRETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteValue> getContain_MeasurementValues() {
		if (contain_MeasurementValues == null) {
			contain_MeasurementValues = new EObjectWithInverseResolvingEList<DiscreteValue>(DiscreteValue.class, this, CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES, CPSMPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT);
		}
		return contain_MeasurementValues;
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContain_MeasurementValues()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				return ((InternalEList<?>)getContain_MeasurementValues()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				return getContain_MeasurementValues();
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				getContain_MeasurementValues().clear();
				getContain_MeasurementValues().addAll((Collection<? extends DiscreteValue>)newValue);
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				getContain_MeasurementValues().clear();
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
			case CPSMPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				return contain_MeasurementValues != null && !contain_MeasurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscreteImpl
