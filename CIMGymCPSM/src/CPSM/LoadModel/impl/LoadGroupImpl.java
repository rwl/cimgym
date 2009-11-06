/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel.impl;

import CPSM.Core.impl.IdentifiedObjectImpl;

import CPSM.LoadModel.LoadGroup;
import CPSM.LoadModel.LoadModelPackage;
import CPSM.LoadModel.SubLoadArea;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.LoadModel.impl.LoadGroupImpl#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LoadGroupImpl extends IdentifiedObjectImpl implements LoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached value of the '{@link #getSubLoadArea() <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadArea()
	 * @generated
	 * @ordered
	 */
	protected SubLoadArea subLoadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea getSubLoadArea() {
		if (subLoadArea != null && subLoadArea.eIsProxy()) {
			InternalEObject oldSubLoadArea = (InternalEObject)subLoadArea;
			subLoadArea = (SubLoadArea)eResolveProxy(oldSubLoadArea);
			if (subLoadArea != oldSubLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, subLoadArea));
			}
		}
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea basicGetSubLoadArea() {
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubLoadArea(SubLoadArea newSubLoadArea, NotificationChain msgs) {
		SubLoadArea oldSubLoadArea = subLoadArea;
		subLoadArea = newSubLoadArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, newSubLoadArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubLoadArea(SubLoadArea newSubLoadArea) {
		if (newSubLoadArea != subLoadArea) {
			NotificationChain msgs = null;
			if (subLoadArea != null)
				msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			if (newSubLoadArea != null)
				msgs = ((InternalEObject)newSubLoadArea).eInverseAdd(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			msgs = basicSetSubLoadArea(newSubLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA, newSubLoadArea, newSubLoadArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (subLoadArea != null)
					msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
				return basicSetSubLoadArea((SubLoadArea)otherEnd, msgs);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return basicSetSubLoadArea(null, msgs);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (resolve) return getSubLoadArea();
				return basicGetSubLoadArea();
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)newValue);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)null);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return subLoadArea != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadGroupImpl
