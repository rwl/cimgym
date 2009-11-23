/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.Analog;
import CPSM.AnalogValue;
import CPSM.CPSMPackage;

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
 * An implementation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.AnalogImpl#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link CPSM.impl.AnalogImpl#getContain_MeasurementValues <em>Contain Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogImpl extends MeasurementImpl implements Analog {
	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContain_MeasurementValues() <em>Contain Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain_MeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogValue> contain_MeasurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.ANALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		boolean oldPositiveFlowIn = positiveFlowIn;
		positiveFlowIn = newPositiveFlowIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.ANALOG__POSITIVE_FLOW_IN, oldPositiveFlowIn, positiveFlowIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogValue> getContain_MeasurementValues() {
		if (contain_MeasurementValues == null) {
			contain_MeasurementValues = new EObjectWithInverseResolvingEList<AnalogValue>(AnalogValue.class, this, CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES, CPSMPackage.ANALOG_VALUE__MEMBER_OF_MEASUREMENT);
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
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
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
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
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
			case CPSMPackage.ANALOG__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
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
			case CPSMPackage.ANALOG__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
				return;
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
				getContain_MeasurementValues().clear();
				getContain_MeasurementValues().addAll((Collection<? extends AnalogValue>)newValue);
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
			case CPSMPackage.ANALOG__POSITIVE_FLOW_IN:
				setPositiveFlowIn(POSITIVE_FLOW_IN_EDEFAULT);
				return;
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
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
			case CPSMPackage.ANALOG__POSITIVE_FLOW_IN:
				return positiveFlowIn != POSITIVE_FLOW_IN_EDEFAULT;
			case CPSMPackage.ANALOG__CONTAIN_MEASUREMENT_VALUES:
				return contain_MeasurementValues != null && !contain_MeasurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (positiveFlowIn: ");
		result.append(positiveFlowIn);
		result.append(')');
		return result.toString();
	}

} //AnalogImpl
