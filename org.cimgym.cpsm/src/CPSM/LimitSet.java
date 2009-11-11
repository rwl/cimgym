/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getLimitSet()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way.'"
 * @generated
 */
public interface LimitSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Percentage Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Percentage Limits</em>' attribute.
	 * @see #setIsPercentageLimits(boolean)
	 * @see CPSM.CPSMPackage#getLimitSet_IsPercentageLimits()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Tells if the limit values are in percentage of normalValue or the specified Unit for Measurements and Controls.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tells if the limit values are in percentage of normalValue or the specified Unit for Measurements and Controls.'"
	 * @generated
	 */
	boolean isIsPercentageLimits();

	/**
	 * Sets the value of the '{@link CPSM.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage Limits</em>' attribute.
	 * @see #isIsPercentageLimits()
	 * @generated
	 */
	void setIsPercentageLimits(boolean value);

} // LimitSet
