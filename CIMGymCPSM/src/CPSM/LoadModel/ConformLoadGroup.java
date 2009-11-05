/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link CPSM.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.LoadModel.LoadModelPackage#getConformLoadGroup()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Load that follows a daily and seasonal load variation pattern.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Load that follows a daily and seasonal load variation pattern.'"
 * @generated
 */
public interface ConformLoadGroup extends LoadGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadModel.ConformLoad}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CPSM.LoadModel.LoadModelPackage#getConformLoadGroup_EnergyConsumers()
	 * @see CPSM.LoadModel.ConformLoad#getLoadGroup
	 * @model opposite="LoadGroup"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Conform loads assigned to this ConformLoadGroup.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conform loads assigned to this ConformLoadGroup.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ConformLoad> getEnergyConsumers();

	/**
	 * Returns the value of the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * The list contents are of type {@link CPSM.LoadModel.ConformLoadSchedule}.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Schedules</em>' reference list.
	 * @see CPSM.LoadModel.LoadModelPackage#getConformLoadGroup_ConformLoadSchedules()
	 * @see CPSM.LoadModel.ConformLoadSchedule#getConformLoadGroup
	 * @model opposite="ConformLoadGroup"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The ConformLoadSchedules in the ConformLoadGroup.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ConformLoadSchedules in the ConformLoadGroup.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ConformLoadSchedule> getConformLoadSchedules();

} // ConformLoadGroup
