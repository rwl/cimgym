/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.ControlArea.impl;

import CPSM.ControlArea.ControlArea;
import CPSM.ControlArea.ControlAreaGeneratingUnit;
import CPSM.ControlArea.ControlAreaPackage;
import CPSM.ControlArea.ControlAreaTypeKind;
import CPSM.ControlArea.TieFlow;

import CPSM.Core.impl.PowerSystemResourceImpl;

import CPSM.LoadModel.EnergyArea;
import CPSM.LoadModel.LoadModelPackage;

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
 * An implementation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.ControlArea.impl.ControlAreaImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CPSM.ControlArea.impl.ControlAreaImpl#getNetInterchange <em>Net Interchange</em>}</li>
 *   <li>{@link CPSM.ControlArea.impl.ControlAreaImpl#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link CPSM.ControlArea.impl.ControlAreaImpl#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CPSM.ControlArea.impl.ControlAreaImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlAreaImpl extends PowerSystemResourceImpl implements ControlArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaGeneratingUnit> controlAreaGeneratingUnit;

	/**
	 * The default value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterchange()
	 * @generated
	 * @ordered
	 */
	protected static final double NET_INTERCHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterchange()
	 * @generated
	 * @ordered
	 */
	protected double netInterchange = NET_INTERCHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyArea() <em>Energy Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyArea()
	 * @generated
	 * @ordered
	 */
	protected EnergyArea energyArea;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<TieFlow> tieFlow;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ControlAreaTypeKind TYPE_EDEFAULT = ControlAreaTypeKind.FORECAST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaTypeKind type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.CONTROL_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit == null) {
			controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList<ControlAreaGeneratingUnit>(ControlAreaGeneratingUnit.class, this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA);
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNetInterchange() {
		return netInterchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetInterchange(double newNetInterchange) {
		double oldNetInterchange = netInterchange;
		netInterchange = newNetInterchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE, oldNetInterchange, netInterchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyArea getEnergyArea() {
		if (energyArea != null && energyArea.eIsProxy()) {
			InternalEObject oldEnergyArea = (InternalEObject)energyArea;
			energyArea = (EnergyArea)eResolveProxy(oldEnergyArea);
			if (energyArea != oldEnergyArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.CONTROL_AREA__ENERGY_AREA, oldEnergyArea, energyArea));
			}
		}
		return energyArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyArea basicGetEnergyArea() {
		return energyArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyArea(EnergyArea newEnergyArea, NotificationChain msgs) {
		EnergyArea oldEnergyArea = energyArea;
		energyArea = newEnergyArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA__ENERGY_AREA, oldEnergyArea, newEnergyArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyArea(EnergyArea newEnergyArea) {
		if (newEnergyArea != energyArea) {
			NotificationChain msgs = null;
			if (energyArea != null)
				msgs = ((InternalEObject)energyArea).eInverseRemove(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
			if (newEnergyArea != null)
				msgs = ((InternalEObject)newEnergyArea).eInverseAdd(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
			msgs = basicSetEnergyArea(newEnergyArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA__ENERGY_AREA, newEnergyArea, newEnergyArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieFlow> getTieFlow() {
		if (tieFlow == null) {
			tieFlow = new EObjectWithInverseResolvingEList<TieFlow>(TieFlow.class, this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlAreaPackage.TIE_FLOW__CONTROL_AREA);
		}
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaTypeKind getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ControlAreaTypeKind newType) {
		ControlAreaTypeKind oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.CONTROL_AREA__TYPE, oldType, type));
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaGeneratingUnit()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				if (energyArea != null)
					msgs = ((InternalEObject)energyArea).eInverseRemove(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
				return basicSetEnergyArea((EnergyArea)otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieFlow()).basicAdd(otherEnd, msgs);
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<?>)getControlAreaGeneratingUnit()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				return basicSetEnergyArea(null, msgs);
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return ((InternalEList<?>)getTieFlow()).basicRemove(otherEnd, msgs);
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return getControlAreaGeneratingUnit();
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				return getNetInterchange();
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				if (resolve) return getEnergyArea();
				return basicGetEnergyArea();
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return getTieFlow();
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				return getType();
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				getControlAreaGeneratingUnit().addAll((Collection<? extends ControlAreaGeneratingUnit>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				setNetInterchange((Double)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				setEnergyArea((EnergyArea)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				getTieFlow().clear();
				getTieFlow().addAll((Collection<? extends TieFlow>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				setType((ControlAreaTypeKind)newValue);
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				setNetInterchange(NET_INTERCHANGE_EDEFAULT);
				return;
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				setEnergyArea((EnergyArea)null);
				return;
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				getTieFlow().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null && !controlAreaGeneratingUnit.isEmpty();
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				return netInterchange != NET_INTERCHANGE_EDEFAULT;
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				return energyArea != null;
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return tieFlow != null && !tieFlow.isEmpty();
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (netInterchange: ");
		result.append(netInterchange);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ControlAreaImpl
