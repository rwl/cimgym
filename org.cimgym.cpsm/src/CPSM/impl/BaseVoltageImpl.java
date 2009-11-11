/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.BaseVoltage;
import CPSM.CPSMPackage;
import CPSM.ConductingEquipment;
import CPSM.VoltageLevel;

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
 * An implementation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.BaseVoltageImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CPSM.impl.BaseVoltageImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CPSM.impl.BaseVoltageImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseVoltageImpl extends IdentifiedObjectImpl implements BaseVoltage {
	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected double nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductingEquipment> conductingEquipment;

	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> voltageLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseVoltageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.BASE_VOLTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVoltage(double newNominalVoltage) {
		double oldNominalVoltage = nominalVoltage;
		nominalVoltage = newNominalVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE, oldNominalVoltage, nominalVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new EObjectWithInverseResolvingEList<ConductingEquipment>(ConductingEquipment.class, this, CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, CPSMPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE);
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageLevel> getVoltageLevel() {
		if (voltageLevel == null) {
			voltageLevel = new EObjectWithInverseResolvingEList<VoltageLevel>(VoltageLevel.class, this, CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL, CPSMPackage.VOLTAGE_LEVEL__BASE_VOLTAGE);
		}
		return voltageLevel;
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
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevel()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<?>)getVoltageLevel()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return getVoltageLevel();
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
			case CPSMPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				setNominalVoltage((Double)newValue);
				return;
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
				return;
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				getVoltageLevel().addAll((Collection<? extends VoltageLevel>)newValue);
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
			case CPSMPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				setNominalVoltage(NOMINAL_VOLTAGE_EDEFAULT);
				return;
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				return;
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
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
			case CPSMPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return nominalVoltage != NOMINAL_VOLTAGE_EDEFAULT;
			case CPSMPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null && !conductingEquipment.isEmpty();
			case CPSMPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return voltageLevel != null && !voltageLevel.isEmpty();
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
		result.append(" (nominalVoltage: ");
		result.append(nominalVoltage);
		result.append(')');
		return result.toString();
	}

} //BaseVoltageImpl
