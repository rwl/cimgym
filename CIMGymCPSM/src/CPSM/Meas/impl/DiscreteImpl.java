/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Meas.impl;

import CPSM.Meas.Discrete;
import CPSM.Meas.DiscreteValue;
import CPSM.Meas.MeasPackage;

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
 *   <li>{@link CPSM.Meas.impl.DiscreteImpl#getContain_MeasurementValues <em>Contain Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteImpl extends MeasurementImpl implements Discrete {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

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
		return MeasPackage.Literals.DISCRETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteValue> getContain_MeasurementValues() {
		if (contain_MeasurementValues == null) {
			contain_MeasurementValues = new EObjectWithInverseResolvingEList<DiscreteValue>(DiscreteValue.class, this, MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES, MeasPackage.DISCRETE_VALUE__MEMBER_OF_MEASUREMENT);
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
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
			case MeasPackage.DISCRETE__CONTAIN_MEASUREMENT_VALUES:
				return contain_MeasurementValues != null && !contain_MeasurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscreteImpl
