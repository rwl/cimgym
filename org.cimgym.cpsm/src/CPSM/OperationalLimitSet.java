/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.OperationalLimitSet#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link CPSM.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getOperationalLimitSet()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A set of limits associated with equipmnet.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of limits associated with equipmnet.'"
 * @generated
 */
public interface OperationalLimitSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see CPSM.CPSMPackage#getOperationalLimitSet_Equipment()
	 * @see CPSM.Equipment#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The equpment to which the limit set applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equpment to which the limit set applies.'"
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link CPSM.OperationalLimitSet#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

	/**
	 * Returns the value of the '<em><b>Operational Limit Value</b></em>' reference list.
	 * The list contents are of type {@link CPSM.OperationalLimit}.
	 * It is bidirectional and its opposite is '{@link CPSM.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Value</em>' reference list.
	 * @see CPSM.CPSMPackage#getOperationalLimitSet_OperationalLimitValue()
	 * @see CPSM.OperationalLimit#getOperationalLimitSet
	 * @model opposite="OperationalLimitSet"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Values of equipment limits.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Values of equipment limits.' Profile\040documentation=''"
	 * @generated
	 */
	EList<OperationalLimit> getOperationalLimitValue();

} // OperationalLimitSet
