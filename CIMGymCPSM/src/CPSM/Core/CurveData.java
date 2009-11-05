/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.CurveData#getY2value <em>Y2value</em>}</li>
 *   <li>{@link CPSM.Core.CurveData#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link CPSM.Core.CurveData#getY1value <em>Y1value</em>}</li>
 *   <li>{@link CPSM.Core.CurveData#getCurveSchedule <em>Curve Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getCurveData()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Data point values for defining a curve or schedule'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Data point values for defining a curve or schedule'"
 * @generated
 */
public interface CurveData extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2value</em>' attribute.
	 * @see #setY2value(float)
	 * @see CPSM.Core.CorePackage#getCurveData_Y2value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The data value of the second Y-axis variable (if present), depending on the Y-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the second Y-axis variable (if present), depending on the Y-axis units'"
	 * @generated
	 */
	float getY2value();

	/**
	 * Sets the value of the '{@link CPSM.Core.CurveData#getY2value <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2value</em>' attribute.
	 * @see #getY2value()
	 * @generated
	 */
	void setY2value(float value);

	/**
	 * Returns the value of the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xvalue</em>' attribute.
	 * @see #setXvalue(float)
	 * @see CPSM.Core.CorePackage#getCurveData_Xvalue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The data value of the X-axis variable,  depending on the X-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the X-axis variable,  depending on the X-axis units'"
	 * @generated
	 */
	float getXvalue();

	/**
	 * Sets the value of the '{@link CPSM.Core.CurveData#getXvalue <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xvalue</em>' attribute.
	 * @see #getXvalue()
	 * @generated
	 */
	void setXvalue(float value);

	/**
	 * Returns the value of the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1value</em>' attribute.
	 * @see #setY1value(float)
	 * @see CPSM.Core.CorePackage#getCurveData_Y1value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The data value of the  first Y-axis variable, depending on the Y-axis units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The data value of the  first Y-axis variable, depending on the Y-axis units'"
	 * @generated
	 */
	float getY1value();

	/**
	 * Sets the value of the '{@link CPSM.Core.CurveData#getY1value <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1value</em>' attribute.
	 * @see #getY1value()
	 * @generated
	 */
	void setY1value(float value);

	/**
	 * Returns the value of the '<em><b>Curve Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.Curve#getCurveScheduleDatas <em>Curve Schedule Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Schedule</em>' reference.
	 * @see #setCurveSchedule(Curve)
	 * @see CPSM.Core.CorePackage#getCurveData_CurveSchedule()
	 * @see CPSM.Core.Curve#getCurveScheduleDatas
	 * @model opposite="CurveScheduleDatas" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Curve defined by this CurveData.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Curve defined by this CurveData.'"
	 * @generated
	 */
	Curve getCurveSchedule();

	/**
	 * Sets the value of the '{@link CPSM.Core.CurveData#getCurveSchedule <em>Curve Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Schedule</em>' reference.
	 * @see #getCurveSchedule()
	 * @generated
	 */
	void setCurveSchedule(Curve value);

} // CurveData
