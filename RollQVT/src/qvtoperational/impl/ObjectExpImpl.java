/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational.impl;

import essentialocl.Variable;

import imperativeocl.impl.InstantiationExpImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qvtoperational.ConstructorBody;
import qvtoperational.ObjectExp;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link qvtoperational.impl.ObjectExpImpl#getReferredObject <em>Referred Object</em>}</li>
 *   <li>{@link qvtoperational.impl.ObjectExpImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExpImpl extends InstantiationExpImpl implements ObjectExp {
	/**
	 * The cached value of the '{@link #getReferredObject() <em>Referred Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredObject()
	 * @generated
	 * @ordered
	 */
	protected Variable referredObject;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ConstructorBody body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.OBJECT_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReferredObject() {
		if (referredObject != null && referredObject.eIsProxy()) {
			InternalEObject oldReferredObject = (InternalEObject)referredObject;
			referredObject = (Variable)eResolveProxy(oldReferredObject);
			if (referredObject != oldReferredObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT, oldReferredObject, referredObject));
			}
		}
		return referredObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReferredObject() {
		return referredObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredObject(Variable newReferredObject) {
		Variable oldReferredObject = referredObject;
		referredObject = newReferredObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT, oldReferredObject, referredObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ConstructorBody newBody, NotificationChain msgs) {
		ConstructorBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OBJECT_EXP__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ConstructorBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.OBJECT_EXP__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.OBJECT_EXP__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.OBJECT_EXP__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.OBJECT_EXP__BODY:
				return basicSetBody(null, msgs);
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
			case QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT:
				if (resolve) return getReferredObject();
				return basicGetReferredObject();
			case QvtoperationalPackage.OBJECT_EXP__BODY:
				return getBody();
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
			case QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT:
				setReferredObject((Variable)newValue);
				return;
			case QvtoperationalPackage.OBJECT_EXP__BODY:
				setBody((ConstructorBody)newValue);
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
			case QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT:
				setReferredObject((Variable)null);
				return;
			case QvtoperationalPackage.OBJECT_EXP__BODY:
				setBody((ConstructorBody)null);
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
			case QvtoperationalPackage.OBJECT_EXP__REFERRED_OBJECT:
				return referredObject != null;
			case QvtoperationalPackage.OBJECT_EXP__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectExpImpl
