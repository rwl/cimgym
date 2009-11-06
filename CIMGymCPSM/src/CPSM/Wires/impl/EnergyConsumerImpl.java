/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Core.impl.ConductingEquipmentImpl;

import CPSM.LoadModel.LoadModelPackage;
import CPSM.LoadModel.LoadResponseCharacteristic;

import CPSM.Wires.EnergyConsumer;
import CPSM.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.EnergyConsumerImpl#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link CPSM.Wires.impl.EnergyConsumerImpl#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link CPSM.Wires.impl.EnergyConsumerImpl#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link CPSM.Wires.impl.EnergyConsumerImpl#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link CPSM.Wires.impl.EnergyConsumerImpl#getPfixedPct <em>Pfixed Pct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EnergyConsumerImpl extends ConductingEquipmentImpl implements EnergyConsumer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The default value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final double QFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected double qfixedPct = QFIXED_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected static final double PFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected double pfixed = PFIXED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadResponse() <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadResponse()
	 * @generated
	 * @ordered
	 */
	protected LoadResponseCharacteristic loadResponse;

	/**
	 * The default value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected static final double QFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected double qfixed = QFIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final double PFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected double pfixedPct = PFIXED_PCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.ENERGY_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQfixedPct() {
		return qfixedPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQfixedPct(double newQfixedPct) {
		double oldQfixedPct = qfixedPct;
		qfixedPct = newQfixedPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__QFIXED_PCT, oldQfixedPct, qfixedPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPfixed() {
		return pfixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPfixed(double newPfixed) {
		double oldPfixed = pfixed;
		pfixed = newPfixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__PFIXED, oldPfixed, pfixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic getLoadResponse() {
		if (loadResponse != null && loadResponse.eIsProxy()) {
			InternalEObject oldLoadResponse = (InternalEObject)loadResponse;
			loadResponse = (LoadResponseCharacteristic)eResolveProxy(oldLoadResponse);
			if (loadResponse != oldLoadResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, loadResponse));
			}
		}
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic basicGetLoadResponse() {
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadResponse(LoadResponseCharacteristic newLoadResponse, NotificationChain msgs) {
		LoadResponseCharacteristic oldLoadResponse = loadResponse;
		loadResponse = newLoadResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, newLoadResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadResponse(LoadResponseCharacteristic newLoadResponse) {
		if (newLoadResponse != loadResponse) {
			NotificationChain msgs = null;
			if (loadResponse != null)
				msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			if (newLoadResponse != null)
				msgs = ((InternalEObject)newLoadResponse).eInverseAdd(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			msgs = basicSetLoadResponse(newLoadResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, newLoadResponse, newLoadResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQfixed() {
		return qfixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQfixed(double newQfixed) {
		double oldQfixed = qfixed;
		qfixed = newQfixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__QFIXED, oldQfixed, qfixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPfixedPct() {
		return pfixedPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPfixedPct(double newPfixedPct) {
		double oldPfixedPct = pfixedPct;
		pfixedPct = newPfixedPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__PFIXED_PCT, oldPfixedPct, pfixedPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (loadResponse != null)
					msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
				return basicSetLoadResponse((LoadResponseCharacteristic)otherEnd, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return basicSetLoadResponse(null, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return getQfixedPct();
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return getPfixed();
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (resolve) return getLoadResponse();
				return basicGetLoadResponse();
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return getQfixed();
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return getPfixedPct();
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				setQfixedPct((Double)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				setPfixed((Double)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				setQfixed((Double)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				setPfixedPct((Double)newValue);
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				setQfixedPct(QFIXED_PCT_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				setPfixed(PFIXED_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)null);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				setQfixed(QFIXED_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				setPfixedPct(PFIXED_PCT_EDEFAULT);
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return qfixedPct != QFIXED_PCT_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return pfixed != PFIXED_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return loadResponse != null;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return qfixed != QFIXED_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return pfixedPct != PFIXED_PCT_EDEFAULT;
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
		result.append(" (qfixedPct: ");
		result.append(qfixedPct);
		result.append(", pfixed: ");
		result.append(pfixed);
		result.append(", qfixed: ");
		result.append(qfixed);
		result.append(", pfixedPct: ");
		result.append(pfixedPct);
		result.append(')');
		return result.toString();
	}

} //EnergyConsumerImpl
