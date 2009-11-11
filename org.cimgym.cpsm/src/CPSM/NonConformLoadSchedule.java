/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getNonConformLoadSchedule()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled)'"
 * @generated
 */
public interface NonConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * Returns the value of the '<em><b>Non Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #setNonConformLoadGroup(NonConformLoadGroup)
	 * @see CPSM.CPSMPackage#getNonConformLoadSchedule_NonConformLoadGroup()
	 * @see CPSM.NonConformLoadGroup#getNonConformLoadSchedules
	 * @model opposite="NonConformLoadSchedules" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The NonConformLoadGroup where the NonConformLoadSchedule belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The NonConformLoadGroup where the NonConformLoadSchedule belongs.'"
	 * @generated
	 */
	NonConformLoadGroup getNonConformLoadGroup();

	/**
	 * Sets the value of the '{@link CPSM.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	void setNonConformLoadGroup(NonConformLoadGroup value);

} // NonConformLoadSchedule
