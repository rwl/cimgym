/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.CurrentLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getCurrentLimit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='OIoeratuibak kimit on current.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='OIoeratuibak kimit on current.'"
 * @generated
 */
public interface CurrentLimit extends OperationalLimit {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see CPSM.CPSMPackage#getCurrentLimit_Value()
	 * @model dataType="CPSM.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Limit on current flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on current flow.'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link CPSM.CurrentLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // CurrentLimit
