/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getConformLoadSchedule()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.'"
 * @generated
 */
public interface ConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Group</em>' reference.
	 * @see #setConformLoadGroup(ConformLoadGroup)
	 * @see CPSM.LoadModel.LoadModelPackage#getConformLoadSchedule_ConformLoadGroup()
	 * @see CPSM.LoadModel.ConformLoadGroup#getConformLoadSchedules
	 * @model opposite="ConformLoadSchedules" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The ConformLoadGroup where the ConformLoadSchedule belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ConformLoadGroup where the ConformLoadSchedule belongs.'"
	 * @generated
	 */
	ConformLoadGroup getConformLoadGroup();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conform Load Group</em>' reference.
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	void setConformLoadGroup(ConformLoadGroup value);

} // ConformLoadSchedule
