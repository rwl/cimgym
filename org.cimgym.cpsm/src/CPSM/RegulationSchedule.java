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
 * A representation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getRegulationSchedule()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pre-established pattern over time for a controlled variable, e.g., busbar voltage.'"
 * @generated
 */
public interface RegulationSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference list.
	 * The list contents are of type {@link CPSM.RegulatingControl}.
	 * It is bidirectional and its opposite is '{@link CPSM.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference list.
	 * @see CPSM.CPSMPackage#getRegulationSchedule_RegulatingControl()
	 * @see CPSM.RegulatingControl#getRegulationSchedule
	 * @model opposite="RegulationSchedule"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Regulating controls that have this Schedule.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regulating controls that have this Schedule.' Profile\040documentation=''"
	 * @generated
	 */
	EList<RegulatingControl> getRegulatingControl();

} // RegulationSchedule
