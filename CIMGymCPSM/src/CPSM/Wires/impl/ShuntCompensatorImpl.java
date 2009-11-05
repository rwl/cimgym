/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Wires.ShuntCompensator;
import CPSM.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.ShuntCompensatorImpl#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link CPSM.Wires.impl.ShuntCompensatorImpl#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link CPSM.Wires.impl.ShuntCompensatorImpl#getNomU <em>Nom U</em>}</li>
 *   <li>{@link CPSM.Wires.impl.ShuntCompensatorImpl#getReactivePerSection <em>Reactive Per Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuntCompensatorImpl extends RegulatingCondEqImpl implements ShuntCompensator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The default value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected int maximumSections = MAXIMUM_SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected int normalSections = NORMAL_SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected static final double NOM_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected double nomU = NOM_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected double reactivePerSection = REACTIVE_PER_SECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SHUNT_COMPENSATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumSections() {
		return maximumSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSections(int newMaximumSections) {
		int oldMaximumSections = maximumSections;
		maximumSections = newMaximumSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS, oldMaximumSections, maximumSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalSections() {
		return normalSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalSections(int newNormalSections) {
		int oldNormalSections = normalSections;
		normalSections = newNormalSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS, oldNormalSections, normalSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNomU() {
		return nomU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomU(double newNomU) {
		double oldNomU = nomU;
		nomU = newNomU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU, nomU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePerSection() {
		return reactivePerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePerSection(double newReactivePerSection) {
		double oldReactivePerSection = reactivePerSection;
		reactivePerSection = newReactivePerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION, oldReactivePerSection, reactivePerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return getMaximumSections();
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return getNormalSections();
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return getNomU();
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return getReactivePerSection();
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
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				setMaximumSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				setNormalSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				setNomU((Double)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				setReactivePerSection((Double)newValue);
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
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				setMaximumSections(MAXIMUM_SECTIONS_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				setNormalSections(NORMAL_SECTIONS_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				setNomU(NOM_U_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				setReactivePerSection(REACTIVE_PER_SECTION_EDEFAULT);
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
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return maximumSections != MAXIMUM_SECTIONS_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return normalSections != NORMAL_SECTIONS_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return nomU != NOM_U_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return reactivePerSection != REACTIVE_PER_SECTION_EDEFAULT;
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
		result.append(" (maximumSections: ");
		result.append(maximumSections);
		result.append(", normalSections: ");
		result.append(normalSections);
		result.append(", nomU: ");
		result.append(nomU);
		result.append(", reactivePerSection: ");
		result.append(reactivePerSection);
		result.append(')');
		return result.toString();
	}

} //ShuntCompensatorImpl
