/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season Day Type Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}</li>
 *   <li>{@link CPSM.SeasonDayTypeSchedule#getSeason <em>Season</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getSeasonDayTypeSchedule()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The schedule specialize RegularIntervalSchedule with type curve data for a specific type of day and season. This means that curves of this type cover a 24 hour period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The schedule specialize RegularIntervalSchedule with type curve data for a specific type of day and season. This means that curves of this type cover a 24 hour period.'"
 * @generated
 */
public interface SeasonDayTypeSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Day Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Type</em>' reference.
	 * @see #setDayType(DayType)
	 * @see CPSM.CPSMPackage#getSeasonDayTypeSchedule_DayType()
	 * @see CPSM.DayType#getSeasonDayTypeSchedules
	 * @model opposite="SeasonDayTypeSchedules" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='DayType for the Schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='DayType for the Schedule.'"
	 * @generated
	 */
	DayType getDayType();

	/**
	 * Sets the value of the '{@link CPSM.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Type</em>' reference.
	 * @see #getDayType()
	 * @generated
	 */
	void setDayType(DayType value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' reference.
	 * @see #setSeason(Season)
	 * @see CPSM.CPSMPackage#getSeasonDayTypeSchedule_Season()
	 * @see CPSM.Season#getSeasonDayTypeSchedules
	 * @model opposite="SeasonDayTypeSchedules" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Season for the Schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Season for the Schedule.'"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link CPSM.SeasonDayTypeSchedule#getSeason <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

} // SeasonDayTypeSchedule
