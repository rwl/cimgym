/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.SubGeographicalRegion;
import CPSM.Substation;
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
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.SubstationImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link CPSM.impl.SubstationImpl#getContains_VoltageLevels <em>Contains Voltage Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstationImpl extends EquipmentContainerImpl implements Substation {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected SubGeographicalRegion region;

	/**
	 * The cached value of the '{@link #getContains_VoltageLevels() <em>Contains Voltage Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_VoltageLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> contains_VoltageLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.SUBSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (SubGeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.SUBSTATION__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(SubGeographicalRegion newRegion, NotificationChain msgs) {
		SubGeographicalRegion oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.SUBSTATION__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(SubGeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SUBSTATION__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageLevel> getContains_VoltageLevels() {
		if (contains_VoltageLevels == null) {
			contains_VoltageLevels = new EObjectWithInverseResolvingEList<VoltageLevel>(VoltageLevel.class, this, CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS, CPSMPackage.VOLTAGE_LEVEL__MEMBER_OF_SUBSTATION);
		}
		return contains_VoltageLevels;
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
			case CPSMPackage.SUBSTATION__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CPSMPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
				return basicSetRegion((SubGeographicalRegion)otherEnd, msgs);
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_VoltageLevels()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.SUBSTATION__REGION:
				return basicSetRegion(null, msgs);
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				return ((InternalEList<?>)getContains_VoltageLevels()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.SUBSTATION__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				return getContains_VoltageLevels();
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
			case CPSMPackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)newValue);
				return;
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				getContains_VoltageLevels().clear();
				getContains_VoltageLevels().addAll((Collection<? extends VoltageLevel>)newValue);
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
			case CPSMPackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)null);
				return;
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				getContains_VoltageLevels().clear();
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
			case CPSMPackage.SUBSTATION__REGION:
				return region != null;
			case CPSMPackage.SUBSTATION__CONTAINS_VOLTAGE_LEVELS:
				return contains_VoltageLevels != null && !contains_VoltageLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstationImpl
