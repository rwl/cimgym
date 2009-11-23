/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.Curve;
import CPSM.CurveData;
import CPSM.CurveStyle;
import CPSM.UnitSymbol;

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
 * An implementation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.CurveImpl#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link CPSM.impl.CurveImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link CPSM.impl.CurveImpl#getCurveScheduleDatas <em>Curve Schedule Datas</em>}</li>
 *   <li>{@link CPSM.impl.CurveImpl#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link CPSM.impl.CurveImpl#getY1Unit <em>Y1 Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CurveImpl extends IdentifiedObjectImpl implements Curve {
	/**
	 * The default value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y2_UNIT_EDEFAULT = UnitSymbol.WS;

	/**
	 * The cached value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y2Unit = Y2_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol XUNIT_EDEFAULT = UnitSymbol.WS;

	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol xUnit = XUNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurveScheduleDatas() <em>Curve Schedule Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveScheduleDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<CurveData> curveScheduleDatas;

	/**
	 * The default value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected static final CurveStyle CURVE_STYLE_EDEFAULT = CurveStyle.RAMP_YVALUE;

	/**
	 * The cached value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected CurveStyle curveStyle = CURVE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y1_UNIT_EDEFAULT = UnitSymbol.WS;

	/**
	 * The cached value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y1Unit = Y1_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getY2Unit() {
		return y2Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2Unit(UnitSymbol newY2Unit) {
		UnitSymbol oldY2Unit = y2Unit;
		y2Unit = newY2Unit == null ? Y2_UNIT_EDEFAULT : newY2Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CURVE__Y2_UNIT, oldY2Unit, y2Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getXUnit() {
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnit(UnitSymbol newXUnit) {
		UnitSymbol oldXUnit = xUnit;
		xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CURVE__XUNIT, oldXUnit, xUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurveData> getCurveScheduleDatas() {
		if (curveScheduleDatas == null) {
			curveScheduleDatas = new EObjectWithInverseResolvingEList<CurveData>(CurveData.class, this, CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS, CPSMPackage.CURVE_DATA__CURVE_SCHEDULE);
		}
		return curveScheduleDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle getCurveStyle() {
		return curveStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveStyle(CurveStyle newCurveStyle) {
		CurveStyle oldCurveStyle = curveStyle;
		curveStyle = newCurveStyle == null ? CURVE_STYLE_EDEFAULT : newCurveStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CURVE__CURVE_STYLE, oldCurveStyle, curveStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getY1Unit() {
		return y1Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1Unit(UnitSymbol newY1Unit) {
		UnitSymbol oldY1Unit = y1Unit;
		y1Unit = newY1Unit == null ? Y1_UNIT_EDEFAULT : newY1Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.CURVE__Y1_UNIT, oldY1Unit, y1Unit));
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
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurveScheduleDatas()).basicAdd(otherEnd, msgs);
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
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				return ((InternalEList<?>)getCurveScheduleDatas()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.CURVE__Y2_UNIT:
				return getY2Unit();
			case CPSMPackage.CURVE__XUNIT:
				return getXUnit();
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				return getCurveScheduleDatas();
			case CPSMPackage.CURVE__CURVE_STYLE:
				return getCurveStyle();
			case CPSMPackage.CURVE__Y1_UNIT:
				return getY1Unit();
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
			case CPSMPackage.CURVE__Y2_UNIT:
				setY2Unit((UnitSymbol)newValue);
				return;
			case CPSMPackage.CURVE__XUNIT:
				setXUnit((UnitSymbol)newValue);
				return;
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				getCurveScheduleDatas().clear();
				getCurveScheduleDatas().addAll((Collection<? extends CurveData>)newValue);
				return;
			case CPSMPackage.CURVE__CURVE_STYLE:
				setCurveStyle((CurveStyle)newValue);
				return;
			case CPSMPackage.CURVE__Y1_UNIT:
				setY1Unit((UnitSymbol)newValue);
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
			case CPSMPackage.CURVE__Y2_UNIT:
				setY2Unit(Y2_UNIT_EDEFAULT);
				return;
			case CPSMPackage.CURVE__XUNIT:
				setXUnit(XUNIT_EDEFAULT);
				return;
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				getCurveScheduleDatas().clear();
				return;
			case CPSMPackage.CURVE__CURVE_STYLE:
				setCurveStyle(CURVE_STYLE_EDEFAULT);
				return;
			case CPSMPackage.CURVE__Y1_UNIT:
				setY1Unit(Y1_UNIT_EDEFAULT);
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
			case CPSMPackage.CURVE__Y2_UNIT:
				return y2Unit != Y2_UNIT_EDEFAULT;
			case CPSMPackage.CURVE__XUNIT:
				return xUnit != XUNIT_EDEFAULT;
			case CPSMPackage.CURVE__CURVE_SCHEDULE_DATAS:
				return curveScheduleDatas != null && !curveScheduleDatas.isEmpty();
			case CPSMPackage.CURVE__CURVE_STYLE:
				return curveStyle != CURVE_STYLE_EDEFAULT;
			case CPSMPackage.CURVE__Y1_UNIT:
				return y1Unit != Y1_UNIT_EDEFAULT;
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
		result.append(" (y2Unit: ");
		result.append(y2Unit);
		result.append(", xUnit: ");
		result.append(xUnit);
		result.append(", curveStyle: ");
		result.append(curveStyle);
		result.append(", y1Unit: ");
		result.append(y1Unit);
		result.append(')');
		return result.toString();
	}

} //CurveImpl
