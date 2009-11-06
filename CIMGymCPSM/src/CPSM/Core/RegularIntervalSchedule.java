/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}</li>
 *   <li>{@link CPSM.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link CPSM.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getRegularIntervalSchedule()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The schedule has TimePoints where the time between them is constant.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The schedule has TimePoints where the time between them is constant.'"
 * @generated
 */
public interface RegularIntervalSchedule extends BasicIntervalSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see CPSM.Core.CorePackage#getRegularIntervalSchedule_EndTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The time for the last time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time for the last time point.'"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link CPSM.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.RegularTimePoint}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see CPSM.Core.CorePackage#getRegularIntervalSchedule_TimePoints()
	 * @see CPSM.Core.RegularTimePoint#getIntervalSchedule
	 * @model opposite="IntervalSchedule"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The point data values that define a curve'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point data values that define a curve' Profile\040documentation=''"
	 * @generated
	 */
	EList<RegularTimePoint> getTimePoints();

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute.
	 * @see #setTimeStep(double)
	 * @see CPSM.Core.CorePackage#getRegularIntervalSchedule_TimeStep()
	 * @model dataType="CPSM.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The time between each pair of subsequent RegularTimePoints.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time between each pair of subsequent RegularTimePoints.'"
	 * @generated
	 */
	double getTimeStep();

	/**
	 * Sets the value of the '{@link CPSM.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' attribute.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(double value);

} // RegularIntervalSchedule
