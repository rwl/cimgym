/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.LoadArea;
import CPSM.LoadGroup;
import CPSM.SubLoadArea;

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
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.SubLoadAreaImpl#getLoadGroups <em>Load Groups</em>}</li>
 *   <li>{@link CPSM.impl.SubLoadAreaImpl#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubLoadAreaImpl extends EnergyAreaImpl implements SubLoadArea {
	/**
	 * The cached value of the '{@link #getLoadGroups() <em>Load Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadGroup> loadGroups;

	/**
	 * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadArea()
	 * @generated
	 * @ordered
	 */
	protected LoadArea loadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.SUB_LOAD_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadGroup> getLoadGroups() {
		if (loadGroups == null) {
			loadGroups = new EObjectWithInverseResolvingEList<LoadGroup>(LoadGroup.class, this, CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS, CPSMPackage.LOAD_GROUP__SUB_LOAD_AREA);
		}
		return loadGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea getLoadArea() {
		if (loadArea != null && loadArea.eIsProxy()) {
			InternalEObject oldLoadArea = (InternalEObject)loadArea;
			loadArea = (LoadArea)eResolveProxy(oldLoadArea);
			if (loadArea != oldLoadArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CPSMPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, loadArea));
			}
		}
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea basicGetLoadArea() {
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadArea(LoadArea newLoadArea, NotificationChain msgs) {
		LoadArea oldLoadArea = loadArea;
		loadArea = newLoadArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPSMPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, newLoadArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadArea(LoadArea newLoadArea) {
		if (newLoadArea != loadArea) {
			NotificationChain msgs = null;
			if (loadArea != null)
				msgs = ((InternalEObject)loadArea).eInverseRemove(this, CPSMPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			if (newLoadArea != null)
				msgs = ((InternalEObject)newLoadArea).eInverseAdd(this, CPSMPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			msgs = basicSetLoadArea(newLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.SUB_LOAD_AREA__LOAD_AREA, newLoadArea, newLoadArea));
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadGroups()).basicAdd(otherEnd, msgs);
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (loadArea != null)
					msgs = ((InternalEObject)loadArea).eInverseRemove(this, CPSMPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
				return basicSetLoadArea((LoadArea)otherEnd, msgs);
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<?>)getLoadGroups()).basicRemove(otherEnd, msgs);
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				return basicSetLoadArea(null, msgs);
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return getLoadGroups();
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (resolve) return getLoadArea();
				return basicGetLoadArea();
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
				getLoadGroups().addAll((Collection<? extends LoadGroup>)newValue);
				return;
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)newValue);
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
				return;
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)null);
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
			case CPSMPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return loadGroups != null && !loadGroups.isEmpty();
			case CPSMPackage.SUB_LOAD_AREA__LOAD_AREA:
				return loadArea != null;
		}
		return super.eIsSet(featureID);
	}

} //SubLoadAreaImpl
