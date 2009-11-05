/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Core.impl.EquipmentImpl;

import CPSM.Wires.PowerTransformer;
import CPSM.Wires.TransformerWinding;
import CPSM.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.PowerTransformerImpl#getContains_TransformerWindings <em>Contains Transformer Windings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerTransformerImpl extends EquipmentImpl implements PowerTransformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getContains_TransformerWindings() <em>Contains Transformer Windings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_TransformerWindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerWinding> contains_TransformerWindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.POWER_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerWinding> getContains_TransformerWindings() {
		if (contains_TransformerWindings == null) {
			contains_TransformerWindings = new EObjectWithInverseResolvingEList<TransformerWinding>(TransformerWinding.class, this, WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS, WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER);
		}
		return contains_TransformerWindings;
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_TransformerWindings()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				return ((InternalEList<?>)getContains_TransformerWindings()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				return getContains_TransformerWindings();
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				getContains_TransformerWindings().clear();
				getContains_TransformerWindings().addAll((Collection<? extends TransformerWinding>)newValue);
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				getContains_TransformerWindings().clear();
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
			case WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS:
				return contains_TransformerWindings != null && !contains_TransformerWindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerTransformerImpl
