/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvttemplate.impl;

import emof.Property;

import emof.impl.ElementImpl;

import essentialocl.OclExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import qvttemplate.ObjectTemplateExp;
import qvttemplate.PropertyTemplateItem;
import qvttemplate.QvttemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Template Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link qvttemplate.impl.PropertyTemplateItemImpl#getObjContainer <em>Obj Container</em>}</li>
 *   <li>{@link qvttemplate.impl.PropertyTemplateItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qvttemplate.impl.PropertyTemplateItemImpl#getReferredProperty <em>Referred Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyTemplateItemImpl extends ElementImpl implements PropertyTemplateItem {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OclExpression value;

	/**
	 * The cached value of the '{@link #getReferredProperty() <em>Referred Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredProperty()
	 * @generated
	 * @ordered
	 */
	protected Property referredProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTemplateItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvttemplatePackage.Literals.PROPERTY_TEMPLATE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplateExp getObjContainer() {
		if (eContainerFeatureID() != QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER) return null;
		return (ObjectTemplateExp)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjContainer(ObjectTemplateExp newObjContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObjContainer, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjContainer(ObjectTemplateExp newObjContainer) {
		if (newObjContainer != eInternalContainer() || (eContainerFeatureID() != QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER && newObjContainer != null)) {
			if (EcoreUtil.isAncestor(this, newObjContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjContainer != null)
				msgs = ((InternalEObject)newObjContainer).eInverseAdd(this, QvttemplatePackage.OBJECT_TEMPLATE_EXP__PART, ObjectTemplateExp.class, msgs);
			msgs = basicSetObjContainer(newObjContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER, newObjContainer, newObjContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OclExpression newValue, NotificationChain msgs) {
		OclExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OclExpression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReferredProperty() {
		if (referredProperty != null && referredProperty.eIsProxy()) {
			InternalEObject oldReferredProperty = (InternalEObject)referredProperty;
			referredProperty = (Property)eResolveProxy(oldReferredProperty);
			if (referredProperty != oldReferredProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY, oldReferredProperty, referredProperty));
			}
		}
		return referredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReferredProperty() {
		return referredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredProperty(Property newReferredProperty) {
		Property oldReferredProperty = referredProperty;
		referredProperty = newReferredProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY, oldReferredProperty, referredProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObjContainer((ObjectTemplateExp)otherEnd, msgs);
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
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				return basicSetObjContainer(null, msgs);
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				return eInternalContainer().eInverseRemove(this, QvttemplatePackage.OBJECT_TEMPLATE_EXP__PART, ObjectTemplateExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				return getObjContainer();
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE:
				return getValue();
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY:
				if (resolve) return getReferredProperty();
				return basicGetReferredProperty();
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
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				setObjContainer((ObjectTemplateExp)newValue);
				return;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE:
				setValue((OclExpression)newValue);
				return;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY:
				setReferredProperty((Property)newValue);
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
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				setObjContainer((ObjectTemplateExp)null);
				return;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE:
				setValue((OclExpression)null);
				return;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY:
				setReferredProperty((Property)null);
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
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER:
				return getObjContainer() != null;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__VALUE:
				return value != null;
			case QvttemplatePackage.PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY:
				return referredProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyTemplateItemImpl
