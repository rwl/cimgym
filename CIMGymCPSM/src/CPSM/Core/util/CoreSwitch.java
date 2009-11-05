/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.util;

import CPSM.Core.*;

import CPSM.Element;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CPSM.Core.CorePackage
 * @generated
 */
public class CoreSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.IDENTIFIED_OBJECT: {
				IdentifiedObject identifiedObject = (IdentifiedObject)theEObject;
				T result = caseIdentifiedObject(identifiedObject);
				if (result == null) result = caseElement(identifiedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseIdentifiedObject(terminal);
				if (result == null) result = caseElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_VOLTAGE: {
				BaseVoltage baseVoltage = (BaseVoltage)theEObject;
				T result = caseBaseVoltage(baseVoltage);
				if (result == null) result = caseIdentifiedObject(baseVoltage);
				if (result == null) result = caseElement(baseVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGULAR_INTERVAL_SCHEDULE: {
				RegularIntervalSchedule regularIntervalSchedule = (RegularIntervalSchedule)theEObject;
				T result = caseRegularIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(regularIntervalSchedule);
				if (result == null) result = caseElement(regularIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTIVITY_NODE_CONTAINER: {
				ConnectivityNodeContainer connectivityNodeContainer = (ConnectivityNodeContainer)theEObject;
				T result = caseConnectivityNodeContainer(connectivityNodeContainer);
				if (result == null) result = casePowerSystemResource(connectivityNodeContainer);
				if (result == null) result = caseIdentifiedObject(connectivityNodeContainer);
				if (result == null) result = caseElement(connectivityNodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseIdentifiedObject(unit);
				if (result == null) result = caseElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUIPMENT_CONTAINER: {
				EquipmentContainer equipmentContainer = (EquipmentContainer)theEObject;
				T result = caseEquipmentContainer(equipmentContainer);
				if (result == null) result = caseConnectivityNodeContainer(equipmentContainer);
				if (result == null) result = casePowerSystemResource(equipmentContainer);
				if (result == null) result = caseIdentifiedObject(equipmentContainer);
				if (result == null) result = caseElement(equipmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VOLTAGE_LEVEL: {
				VoltageLevel voltageLevel = (VoltageLevel)theEObject;
				T result = caseVoltageLevel(voltageLevel);
				if (result == null) result = caseEquipmentContainer(voltageLevel);
				if (result == null) result = caseConnectivityNodeContainer(voltageLevel);
				if (result == null) result = casePowerSystemResource(voltageLevel);
				if (result == null) result = caseIdentifiedObject(voltageLevel);
				if (result == null) result = caseElement(voltageLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAY: {
				Bay bay = (Bay)theEObject;
				T result = caseBay(bay);
				if (result == null) result = caseEquipmentContainer(bay);
				if (result == null) result = caseConnectivityNodeContainer(bay);
				if (result == null) result = casePowerSystemResource(bay);
				if (result == null) result = caseIdentifiedObject(bay);
				if (result == null) result = caseElement(bay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUB_GEOGRAPHICAL_REGION: {
				SubGeographicalRegion subGeographicalRegion = (SubGeographicalRegion)theEObject;
				T result = caseSubGeographicalRegion(subGeographicalRegion);
				if (result == null) result = caseIdentifiedObject(subGeographicalRegion);
				if (result == null) result = caseElement(subGeographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGULAR_TIME_POINT: {
				RegularTimePoint regularTimePoint = (RegularTimePoint)theEObject;
				T result = caseRegularTimePoint(regularTimePoint);
				if (result == null) result = caseElement(regularTimePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUIPMENT: {
				Equipment equipment = (Equipment)theEObject;
				T result = caseEquipment(equipment);
				if (result == null) result = casePowerSystemResource(equipment);
				if (result == null) result = caseIdentifiedObject(equipment);
				if (result == null) result = caseElement(equipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSTATION: {
				Substation substation = (Substation)theEObject;
				T result = caseSubstation(substation);
				if (result == null) result = caseEquipmentContainer(substation);
				if (result == null) result = caseConnectivityNodeContainer(substation);
				if (result == null) result = casePowerSystemResource(substation);
				if (result == null) result = caseIdentifiedObject(substation);
				if (result == null) result = caseElement(substation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CURVE: {
				Curve curve = (Curve)theEObject;
				T result = caseCurve(curve);
				if (result == null) result = caseIdentifiedObject(curve);
				if (result == null) result = caseElement(curve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POWER_SYSTEM_RESOURCE: {
				PowerSystemResource powerSystemResource = (PowerSystemResource)theEObject;
				T result = casePowerSystemResource(powerSystemResource);
				if (result == null) result = caseIdentifiedObject(powerSystemResource);
				if (result == null) result = caseElement(powerSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASIC_INTERVAL_SCHEDULE: {
				BasicIntervalSchedule basicIntervalSchedule = (BasicIntervalSchedule)theEObject;
				T result = caseBasicIntervalSchedule(basicIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(basicIntervalSchedule);
				if (result == null) result = caseElement(basicIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CURVE_DATA: {
				CurveData curveData = (CurveData)theEObject;
				T result = caseCurveData(curveData);
				if (result == null) result = caseElement(curveData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GEOGRAPHICAL_REGION: {
				GeographicalRegion geographicalRegion = (GeographicalRegion)theEObject;
				T result = caseGeographicalRegion(geographicalRegion);
				if (result == null) result = caseIdentifiedObject(geographicalRegion);
				if (result == null) result = caseElement(geographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONDUCTING_EQUIPMENT: {
				ConductingEquipment conductingEquipment = (ConductingEquipment)theEObject;
				T result = caseConductingEquipment(conductingEquipment);
				if (result == null) result = caseEquipment(conductingEquipment);
				if (result == null) result = casePowerSystemResource(conductingEquipment);
				if (result == null) result = caseIdentifiedObject(conductingEquipment);
				if (result == null) result = caseElement(conductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseVoltage(BaseVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentContainer(EquipmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLevel(VoltageLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBay(Bay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubGeographicalRegion(SubGeographicalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularTimePoint(RegularTimePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstation(Substation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveData(CurveData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicalRegion(GeographicalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductingEquipment(ConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
