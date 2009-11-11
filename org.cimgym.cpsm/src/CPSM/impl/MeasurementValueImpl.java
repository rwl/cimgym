/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.MeasurementValue;
import CPSM.MeasurementValueSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.MeasurementValueImpl#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementValueImpl extends IdentifiedObjectImpl implements MeasurementValue {
	/**
	 * The cached value of the '{@link #getMeasurementValueSource() <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueSource()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValueSource measurementValueSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.MEASUREMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource getMeasurementValueSource() {
		if (measurementValueSource != null && measurementValueSource.eIsProxy()) {
			InternalEObject oldMeasurementValueSource = (InternalEObject)measurementValueSource;
			measurementValueSource = (MeasurementValueSource)eResolveProxy(oldMeasurementValueSource);
			if (measurementValueSource != oldMeasurementValueSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, measurementValueSource));
			}
		}
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource basicGetMeasurementValueSource() {
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueSource(MeasurementValueSource newMeasurementValueSource, NotificationChain msgs) {
		MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
		measurementValueSource = newMeasurementValueSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, newMeasurementValueSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValueSource(MeasurementValueSource newMeasurementValueSource) {
		if (newMeasurementValueSource != measurementValueSource) {
			NotificationChain msgs = null;
			if (measurementValueSource != null)
				msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, CPSMPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			if (newMeasurementValueSource != null)
				msgs = ((InternalEObject)newMeasurementValueSource).eInverseAdd(this, CPSMPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			msgs = basicSetMeasurementValueSource(newMeasurementValueSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, newMeasurementValueSource, newMeasurementValueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (measurementValueSource != null)
					msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, CPSMPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
				return basicSetMeasurementValueSource((MeasurementValueSource)otherEnd, msgs);
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
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return basicSetMeasurementValueSource(null, msgs);
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
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (resolve) return getMeasurementValueSource();
				return basicGetMeasurementValueSource();
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
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)newValue);
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
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)null);
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
			case CPSMPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return measurementValueSource != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementValueImpl
