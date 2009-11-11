/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link CPSM.EnergyConsumer#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link CPSM.EnergyConsumer#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link CPSM.EnergyConsumer#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link CPSM.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getEnergyConsumer()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Generic user of energy - a  point of consumption on the power system model'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generic user of energy - a  point of consumption on the power system model'"
 * @generated
 */
public interface EnergyConsumer extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #setQfixedPct(double)
	 * @see CPSM.CPSMPackage#getEnergyConsumer_QfixedPct()
	 * @model dataType="CPSM.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Fixed reactive power as per cent of load group fixed reactive power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed reactive power as per cent of load group fixed reactive power.'"
	 * @generated
	 */
	double getQfixedPct();

	/**
	 * Sets the value of the '{@link CPSM.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #getQfixedPct()
	 * @generated
	 */
	void setQfixedPct(double value);

	/**
	 * Returns the value of the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed</em>' attribute.
	 * @see #setPfixed(double)
	 * @see CPSM.CPSMPackage#getEnergyConsumer_Pfixed()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Active power of the load that is a fixed quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power of the load that is a fixed quantity.'"
	 * @generated
	 */
	double getPfixed();

	/**
	 * Sets the value of the '{@link CPSM.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed</em>' attribute.
	 * @see #getPfixed()
	 * @generated
	 */
	void setPfixed(double value);

	/**
	 * Returns the value of the '<em><b>Load Response</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Response</em>' reference.
	 * @see #setLoadResponse(LoadResponseCharacteristic)
	 * @see CPSM.CPSMPackage#getEnergyConsumer_LoadResponse()
	 * @see CPSM.LoadResponseCharacteristic#getEnergyConsumer
	 * @model opposite="EnergyConsumer"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The load response characteristic of this load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The load response characteristic of this load.'"
	 * @generated
	 */
	LoadResponseCharacteristic getLoadResponse();

	/**
	 * Sets the value of the '{@link CPSM.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Response</em>' reference.
	 * @see #getLoadResponse()
	 * @generated
	 */
	void setLoadResponse(LoadResponseCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed</em>' attribute.
	 * @see #setQfixed(double)
	 * @see CPSM.CPSMPackage#getEnergyConsumer_Qfixed()
	 * @model dataType="CPSM.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Reactive power of the load that is a fixed quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reactive power of the load that is a fixed quantity.'"
	 * @generated
	 */
	double getQfixed();

	/**
	 * Sets the value of the '{@link CPSM.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed</em>' attribute.
	 * @see #getQfixed()
	 * @generated
	 */
	void setQfixed(double value);

	/**
	 * Returns the value of the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #setPfixedPct(double)
	 * @see CPSM.CPSMPackage#getEnergyConsumer_PfixedPct()
	 * @model dataType="CPSM.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Fixed active power as per cent of load group fixed active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed active power as per cent of load group fixed active power'"
	 * @generated
	 */
	double getPfixedPct();

	/**
	 * Sets the value of the '{@link CPSM.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #getPfixedPct()
	 * @generated
	 */
	void setPfixedPct(double value);

} // EnergyConsumer
