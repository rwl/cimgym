/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Breaker#getRatedCurrent <em>Rated Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getBreaker()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal circuit conditions and also making, carrying for a specified time, and breaking currents under specified abnormal circuit conditions e.g.  those of short circuit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A mechanical switching device capable of making, carrying, and breaking currents under normal circuit conditions and also making, carrying for a specified time, and breaking currents under specified abnormal circuit conditions e.g.  those of short circuit.'"
 * @generated
 */
public interface Breaker extends Switch {
	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(double)
	 * @see CPSM.CPSMPackage#getBreaker_RatedCurrent()
	 * @model dataType="CPSM.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Fault interrupting current rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fault interrupting current rating.'"
	 * @generated
	 */
	double getRatedCurrent();

	/**
	 * Sets the value of the '{@link CPSM.Breaker#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(double value);

} // Breaker
