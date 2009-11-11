/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.NonConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getNonConformLoad()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.'"
 * @generated
 */
public interface NonConformLoad extends EnergyConsumer {
	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(NonConformLoadGroup)
	 * @see CPSM.CPSMPackage#getNonConformLoad_LoadGroup()
	 * @see CPSM.NonConformLoadGroup#getEnergyConsumers
	 * @model opposite="EnergyConsumers" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Group of this ConformLoad.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of this ConformLoad.'"
	 * @generated
	 */
	NonConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link CPSM.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(NonConformLoadGroup value);

} // NonConformLoad
