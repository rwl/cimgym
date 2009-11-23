/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.BasicIntervalSchedule;
import CPSM.CPSMPackage;
import CPSM.UnitSymbol;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.BasicIntervalScheduleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link CPSM.impl.BasicIntervalScheduleImpl#getValue1Unit <em>Value1 Unit</em>}</li>
 *   <li>{@link CPSM.impl.BasicIntervalScheduleImpl#getValue2Unit <em>Value2 Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BasicIntervalScheduleImpl extends IdentifiedObjectImpl implements BasicIntervalSchedule {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE1_UNIT_EDEFAULT = UnitSymbol.WS;

	/**
	 * The cached value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value1Unit = VALUE1_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE2_UNIT_EDEFAULT = UnitSymbol.WS;

	/**
	 * The cached value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value2Unit = VALUE2_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicIntervalScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.BASIC_INTERVAL_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.BASIC_INTERVAL_SCHEDULE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getValue1Unit() {
		return value1Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1Unit(UnitSymbol newValue1Unit) {
		UnitSymbol oldValue1Unit = value1Unit;
		value1Unit = newValue1Unit == null ? VALUE1_UNIT_EDEFAULT : newValue1Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT, oldValue1Unit, value1Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getValue2Unit() {
		return value2Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2Unit(UnitSymbol newValue2Unit) {
		UnitSymbol oldValue2Unit = value2Unit;
		value2Unit = newValue2Unit == null ? VALUE2_UNIT_EDEFAULT : newValue2Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT, oldValue2Unit, value2Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return getStartTime();
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return getValue1Unit();
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return getValue2Unit();
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
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				setValue1Unit((UnitSymbol)newValue);
				return;
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				setValue2Unit((UnitSymbol)newValue);
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
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				setValue1Unit(VALUE1_UNIT_EDEFAULT);
				return;
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				setValue2Unit(VALUE2_UNIT_EDEFAULT);
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
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return value1Unit != VALUE1_UNIT_EDEFAULT;
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return value2Unit != VALUE2_UNIT_EDEFAULT;
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", value1Unit: ");
		result.append(value1Unit);
		result.append(", value2Unit: ");
		result.append(value2Unit);
		result.append(')');
		return result.toString();
	}

} //BasicIntervalScheduleImpl
