/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Generation.Production;

import CPSM.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gross To Net Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Generation.Production.ProductionPackage#getGrossToNetActivePowerCurve()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Relationship between the generating unit\'s gross active power output on the X-axis (measured at the terminals of the machine(s)) and the generating unit\'s net active power output on the Y-axis (based on utility-defined measurements at the power station). Station service loads, when modeled, should be treated as non-conforming bus loads. There may be more than one curve, depending on the auxiliary equipment that is in service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between the generating unit\'s gross active power output on the X-axis (measured at the terminals of the machine(s)) and the generating unit\'s net active power output on the Y-axis (based on utility-defined measurements at the power station). Station service loads, when modeled, should be treated as non-conforming bus loads. There may be more than one curve, depending on the auxiliary equipment that is in service.'"
 * @generated
 */
public interface GrossToNetActivePowerCurve extends Curve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see CPSM.Generation.Production.ProductionPackage#getGrossToNetActivePowerCurve_GeneratingUnit()
	 * @see CPSM.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves
	 * @model opposite="GrossToNetActivePowerCurves" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link CPSM.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

} // GrossToNetActivePowerCurve
