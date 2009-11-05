/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.impl;

import CPSM.Core.impl.ConductingEquipmentImpl;

import CPSM.Wires.PowerTransformer;
import CPSM.Wires.TapChanger;
import CPSM.Wires.TransformerWinding;
import CPSM.Wires.WindingType;
import CPSM.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getWindingType <em>Winding Type</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getTapChangers <em>Tap Changers</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getX <em>X</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getR <em>R</em>}</li>
 *   <li>{@link CPSM.Wires.impl.TransformerWindingImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerWindingImpl extends ConductingEquipmentImpl implements TransformerWinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The default value of the '{@link #getWindingType() <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingType()
	 * @generated
	 * @ordered
	 */
	protected static final WindingType WINDING_TYPE_EDEFAULT = WindingType.PRIMARY;

	/**
	 * The cached value of the '{@link #getWindingType() <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingType()
	 * @generated
	 * @ordered
	 */
	protected WindingType windingType = WINDING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTapChangers() <em>Tap Changers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangers()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChanger> tapChangers;

	/**
	 * The cached value of the '{@link #getMemberOf_PowerTransformer() <em>Member Of Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOf_PowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformer memberOf_PowerTransformer;

	/**
	 * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected double ratedS = RATED_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected double ratedU = RATED_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerWindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_WINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingType getWindingType() {
		return windingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindingType(WindingType newWindingType) {
		WindingType oldWindingType = windingType;
		windingType = newWindingType == null ? WINDING_TYPE_EDEFAULT : newWindingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE, oldWindingType, windingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapChanger> getTapChangers() {
		if (tapChangers == null) {
			tapChangers = new EObjectWithInverseResolvingEList<TapChanger>(TapChanger.class, this, WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS, WiresPackage.TAP_CHANGER__TRANSFORMER_WINDING);
		}
		return tapChangers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer getMemberOf_PowerTransformer() {
		if (memberOf_PowerTransformer != null && memberOf_PowerTransformer.eIsProxy()) {
			InternalEObject oldMemberOf_PowerTransformer = (InternalEObject)memberOf_PowerTransformer;
			memberOf_PowerTransformer = (PowerTransformer)eResolveProxy(oldMemberOf_PowerTransformer);
			if (memberOf_PowerTransformer != oldMemberOf_PowerTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER, oldMemberOf_PowerTransformer, memberOf_PowerTransformer));
			}
		}
		return memberOf_PowerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer basicGetMemberOf_PowerTransformer() {
		return memberOf_PowerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberOf_PowerTransformer(PowerTransformer newMemberOf_PowerTransformer, NotificationChain msgs) {
		PowerTransformer oldMemberOf_PowerTransformer = memberOf_PowerTransformer;
		memberOf_PowerTransformer = newMemberOf_PowerTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER, oldMemberOf_PowerTransformer, newMemberOf_PowerTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOf_PowerTransformer(PowerTransformer newMemberOf_PowerTransformer) {
		if (newMemberOf_PowerTransformer != memberOf_PowerTransformer) {
			NotificationChain msgs = null;
			if (memberOf_PowerTransformer != null)
				msgs = ((InternalEObject)memberOf_PowerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
			if (newMemberOf_PowerTransformer != null)
				msgs = ((InternalEObject)newMemberOf_PowerTransformer).eInverseAdd(this, WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
			msgs = basicSetMemberOf_PowerTransformer(newMemberOf_PowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER, newMemberOf_PowerTransformer, newMemberOf_PowerTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedS() {
		return ratedS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedS(double newRatedS) {
		double oldRatedS = ratedS;
		ratedS = newRatedS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATED_S, oldRatedS, ratedS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedU() {
		return ratedU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedU(double newRatedU) {
		double oldRatedU = ratedU;
		ratedU = newRatedU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATED_U, oldRatedU, ratedU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		double oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__B, oldB, b));
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
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChangers()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				if (memberOf_PowerTransformer != null)
					msgs = ((InternalEObject)memberOf_PowerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__CONTAINS_TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
				return basicSetMemberOf_PowerTransformer((PowerTransformer)otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				return ((InternalEList<?>)getTapChangers()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				return basicSetMemberOf_PowerTransformer(null, msgs);
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
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				return getWindingType();
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				return getTapChangers();
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				if (resolve) return getMemberOf_PowerTransformer();
				return basicGetMemberOf_PowerTransformer();
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				return getRatedS();
			case WiresPackage.TRANSFORMER_WINDING__X:
				return getX();
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				return getRatedU();
			case WiresPackage.TRANSFORMER_WINDING__R:
				return getR();
			case WiresPackage.TRANSFORMER_WINDING__B:
				return getB();
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
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				setWindingType((WindingType)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				getTapChangers().clear();
				getTapChangers().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				setMemberOf_PowerTransformer((PowerTransformer)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				setRatedS((Double)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X:
				setX((Double)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				setRatedU((Double)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R:
				setR((Double)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B:
				setB((Double)newValue);
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
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				setWindingType(WINDING_TYPE_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				getTapChangers().clear();
				return;
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				setMemberOf_PowerTransformer((PowerTransformer)null);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				setRatedS(RATED_S_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X:
				setX(X_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				setRatedU(RATED_U_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R:
				setR(R_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B:
				setB(B_EDEFAULT);
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
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				return windingType != WINDING_TYPE_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__TAP_CHANGERS:
				return tapChangers != null && !tapChangers.isEmpty();
			case WiresPackage.TRANSFORMER_WINDING__MEMBER_OF_POWER_TRANSFORMER:
				return memberOf_PowerTransformer != null;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				return ratedS != RATED_S_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__X:
				return x != X_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				return ratedU != RATED_U_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__R:
				return r != R_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__B:
				return b != B_EDEFAULT;
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
		result.append(" (windingType: ");
		result.append(windingType);
		result.append(", ratedS: ");
		result.append(ratedS);
		result.append(", x: ");
		result.append(x);
		result.append(", ratedU: ");
		result.append(ratedU);
		result.append(", r: ");
		result.append(r);
		result.append(", b: ");
		result.append(b);
		result.append(')');
		return result.toString();
	}

} //TransformerWindingImpl
