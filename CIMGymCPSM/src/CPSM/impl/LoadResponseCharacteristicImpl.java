/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.EnergyConsumer;
import CPSM.LoadResponseCharacteristic;

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
 * An implementation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.LoadResponseCharacteristicImpl#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link CPSM.impl.LoadResponseCharacteristicImpl#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link CPSM.impl.LoadResponseCharacteristicImpl#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link CPSM.impl.LoadResponseCharacteristicImpl#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link CPSM.impl.LoadResponseCharacteristicImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadResponseCharacteristicImpl extends IdentifiedObjectImpl implements LoadResponseCharacteristic {
	/**
	 * The default value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumer> energyConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadResponseCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.LOAD_RESPONSE_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPFrequencyExponent() {
		return pFrequencyExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPFrequencyExponent(float newPFrequencyExponent) {
		float oldPFrequencyExponent = pFrequencyExponent;
		pFrequencyExponent = newPFrequencyExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT, oldPFrequencyExponent, pFrequencyExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQVoltageExponent() {
		return qVoltageExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQVoltageExponent(float newQVoltageExponent) {
		float oldQVoltageExponent = qVoltageExponent;
		qVoltageExponent = newQVoltageExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT, oldQVoltageExponent, qVoltageExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQFrequencyExponent() {
		return qFrequencyExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQFrequencyExponent(float newQFrequencyExponent) {
		float oldQFrequencyExponent = qFrequencyExponent;
		qFrequencyExponent = newQFrequencyExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT, oldQFrequencyExponent, qFrequencyExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPVoltageExponent() {
		return pVoltageExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPVoltageExponent(float newPVoltageExponent) {
		float oldPVoltageExponent = pVoltageExponent;
		pVoltageExponent = newPVoltageExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT, oldPVoltageExponent, pVoltageExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyConsumer> getEnergyConsumer() {
		if (energyConsumer == null) {
			energyConsumer = new EObjectWithInverseResolvingEList<EnergyConsumer>(EnergyConsumer.class, this, CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, CPSMPackage.ENERGY_CONSUMER__LOAD_RESPONSE);
		}
		return energyConsumer;
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumer()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<?>)getEnergyConsumer()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return getPFrequencyExponent();
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return getQVoltageExponent();
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return getQFrequencyExponent();
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return getPVoltageExponent();
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return getEnergyConsumer();
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				setPFrequencyExponent((Float)newValue);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				setQVoltageExponent((Float)newValue);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				setQFrequencyExponent((Float)newValue);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				setPVoltageExponent((Float)newValue);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
				getEnergyConsumer().addAll((Collection<? extends EnergyConsumer>)newValue);
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				setPFrequencyExponent(PFREQUENCY_EXPONENT_EDEFAULT);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				setQVoltageExponent(QVOLTAGE_EXPONENT_EDEFAULT);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				setQFrequencyExponent(QFREQUENCY_EXPONENT_EDEFAULT);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				setPVoltageExponent(PVOLTAGE_EXPONENT_EDEFAULT);
				return;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
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
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return pFrequencyExponent != PFREQUENCY_EXPONENT_EDEFAULT;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return qVoltageExponent != QVOLTAGE_EXPONENT_EDEFAULT;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return qFrequencyExponent != QFREQUENCY_EXPONENT_EDEFAULT;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return pVoltageExponent != PVOLTAGE_EXPONENT_EDEFAULT;
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return energyConsumer != null && !energyConsumer.isEmpty();
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
		result.append(" (pFrequencyExponent: ");
		result.append(pFrequencyExponent);
		result.append(", qVoltageExponent: ");
		result.append(qVoltageExponent);
		result.append(", qFrequencyExponent: ");
		result.append(qFrequencyExponent);
		result.append(", pVoltageExponent: ");
		result.append(pVoltageExponent);
		result.append(')');
		return result.toString();
	}

} //LoadResponseCharacteristicImpl
