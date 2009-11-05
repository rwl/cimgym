/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}</li>
 *   <li>{@link CPSM.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getNonConformLoadGroup()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Loads that do not follow a daily and seasonal load variation pattern.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Loads that do not follow a daily and seasonal load variation pattern.'"
 * @generated
 */
public interface NonConformLoadGroup extends LoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Non Conform Load Schedules</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadModel.NonConformLoadSchedule}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Conform Load Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Conform Load Schedules</em>' reference list.
	 * @see CPSM.LoadModel.LoadModelPackage#getNonConformLoadGroup_NonConformLoadSchedules()
	 * @see CPSM.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup
	 * @model opposite="NonConformLoadGroup"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The NonConformLoadSchedules in the NonConformLoadGroup.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The NonConformLoadSchedules in the NonConformLoadGroup.' Profile\040documentation=''"
	 * @generated
	 */
	EList<NonConformLoadSchedule> getNonConformLoadSchedules();

	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadModel.NonConformLoad}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CPSM.LoadModel.LoadModelPackage#getNonConformLoadGroup_EnergyConsumers()
	 * @see CPSM.LoadModel.NonConformLoad#getLoadGroup
	 * @model opposite="LoadGroup"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Conform loads assigned to this ConformLoadGroup.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conform loads assigned to this ConformLoadGroup.' Profile\040documentation=''"
	 * @generated
	 */
	EList<NonConformLoad> getEnergyConsumers();

} // NonConformLoadGroup
