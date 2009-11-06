/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core;

import CPSM.Domain.UnitSymbol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Core.Curve#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link CPSM.Core.Curve#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link CPSM.Core.Curve#getCurveScheduleDatas <em>Curve Schedule Datas</em>}</li>
 *   <li>{@link CPSM.Core.Curve#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link CPSM.Core.Curve#getY1Unit <em>Y1 Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.Core.CorePackage#getCurve()
 * @model abstract="true"
 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Relationship between an independent variable (X-axis) and one or two dependent \nvariables (Y1-axis and Y2-axis). Curves can also serve as schedules.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between an independent variable (X-axis) and one or two dependent \nvariables (Y1-axis and Y2-axis). Curves can also serve as schedules.'"
 * @generated
 */
public interface Curve extends IdentifiedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Y2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #setY2Unit(UnitSymbol)
	 * @see CPSM.Core.CorePackage#getCurve_Y2Unit()
	 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Y2-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Y2-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getY2Unit();

	/**
	 * Sets the value of the '{@link CPSM.Core.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #getY2Unit()
	 * @generated
	 */
	void setY2Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XUnit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XUnit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #setXUnit(UnitSymbol)
	 * @see CPSM.Core.CorePackage#getCurve_XUnit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The X-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The X-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getXUnit();

	/**
	 * Sets the value of the '{@link CPSM.Core.Curve#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #getXUnit()
	 * @generated
	 */
	void setXUnit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Curve Schedule Datas</b></em>' reference list.
	 * The list contents are of type {@link CPSM.Core.CurveData}.
	 * It is bidirectional and its opposite is '{@link CPSM.Core.CurveData#getCurveSchedule <em>Curve Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Schedule Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Schedule Datas</em>' reference list.
	 * @see CPSM.Core.CorePackage#getCurve_CurveScheduleDatas()
	 * @see CPSM.Core.CurveData#getCurveSchedule
	 * @model opposite="CurveSchedule"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The point data values that define a curve'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The point data values that define a curve' Profile\040documentation=''"
	 * @generated
	 */
	EList<CurveData> getCurveScheduleDatas();

	/**
	 * Returns the value of the '<em><b>Curve Style</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Core.CurveStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Style</em>' attribute.
	 * @see CPSM.Core.CurveStyle
	 * @see #setCurveStyle(CurveStyle)
	 * @see CPSM.Core.CorePackage#getCurve_CurveStyle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The style or shape of the curve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style or shape of the curve.'"
	 * @generated
	 */
	CurveStyle getCurveStyle();

	/**
	 * Sets the value of the '{@link CPSM.Core.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Style</em>' attribute.
	 * @see CPSM.Core.CurveStyle
	 * @see #getCurveStyle()
	 * @generated
	 */
	void setCurveStyle(CurveStyle value);

	/**
	 * Returns the value of the '<em><b>Y1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #setY1Unit(UnitSymbol)
	 * @see CPSM.Core.CorePackage#getCurve_Y1Unit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The Y1-axis units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Y1-axis units of measure.'"
	 * @generated
	 */
	UnitSymbol getY1Unit();

	/**
	 * Sets the value of the '{@link CPSM.Core.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Unit</em>' attribute.
	 * @see CPSM.Domain.UnitSymbol
	 * @see #getY1Unit()
	 * @generated
	 */
	void setY1Unit(UnitSymbol value);

} // Curve
