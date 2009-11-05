/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.Domain.UnitSymbol;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link CPSM.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}</li>
 *   <li>{@link CPSM.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getBasicIntervalSchedule()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Schedule of values at points in time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule of values at points in time.'"
 * @generated
 */
public interface BasicIntervalSchedule extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see CPSM.Core.CorePackage#getBasicIntervalSchedule_StartTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The time for the first time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time for the first time point.'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link CPSM.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Value1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #setValue1Unit(UnitSymbol)
	 * @see CPSM.Core.CorePackage#getBasicIntervalSchedule_Value1Unit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Value1 units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value1 units of measure.'"
	 * @generated
	 */
	UnitSymbol getValue1Unit();

	/**
	 * Sets the value of the '{@link CPSM.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #getValue1Unit()
	 * @generated
	 */
	void setValue1Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Value2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #setValue2Unit(UnitSymbol)
	 * @see CPSM.Core.CorePackage#getBasicIntervalSchedule_Value2Unit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Value2 units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value2 units of measure.'"
	 * @generated
	 */
	UnitSymbol getValue2Unit();

	/**
	 * Sets the value of the '{@link CPSM.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #getValue2Unit()
	 * @generated
	 */
	void setValue2Unit(UnitSymbol value);

} // BasicIntervalSchedule
