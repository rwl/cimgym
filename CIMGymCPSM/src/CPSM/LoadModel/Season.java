/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import CPSM.Element;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CPSM.LoadModel.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CPSM.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 *   <li>{@link CPSM.LoadModel.Season#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getSeason()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A specified time period of the year, e.g., Spring, Summer, Fall, Winter'"
 * @generated
 */
public interface Season extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see CPSM.LoadModel.LoadModelPackage#getSeason_EndDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Date season ends'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date season ends'"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see CPSM.LoadModel.LoadModelPackage#getSeason_StartDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Date season starts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date season starts'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadModel.SeasonDayTypeSchedule}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
	 * @see CPSM.LoadModel.LoadModelPackage#getSeason_SeasonDayTypeSchedules()
	 * @see CPSM.LoadModel.SeasonDayTypeSchedule#getSeason
	 * @model opposite="Season"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Schedules that use this Season.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedules that use this Season.' Profile\040documentation=''"
	 * @generated
	 */
	EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.LoadModel.SeasonName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see CPSM.LoadModel.SeasonName
	 * @see #setName(SeasonName)
	 * @see CPSM.LoadModel.LoadModelPackage#getSeason_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Name of the Season'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of the Season'"
	 * @generated
	 */
	SeasonName getName();

	/**
	 * Sets the value of the '{@link CPSM.LoadModel.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see CPSM.LoadModel.SeasonName
	 * @see #getName()
	 * @generated
	 */
	void setName(SeasonName value);

} // Season
