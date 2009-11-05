/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel.util;

import CPSM.Core.BasicIntervalSchedule;
import CPSM.Core.ConductingEquipment;
import CPSM.Core.Equipment;
import CPSM.Core.IdentifiedObject;
import CPSM.Core.PowerSystemResource;
import CPSM.Core.RegularIntervalSchedule;

import CPSM.Element;

import CPSM.LoadModel.*;

import CPSM.Wires.EnergyConsumer;

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
 * @see CPSM.LoadModel.LoadModelPackage
 * @generated
 */
public class LoadModelSwitch<T> {
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
	protected static LoadModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelSwitch() {
		if (modelPackage == null) {
			modelPackage = LoadModelPackage.eINSTANCE;
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP: {
				NonConformLoadGroup nonConformLoadGroup = (NonConformLoadGroup)theEObject;
				T result = caseNonConformLoadGroup(nonConformLoadGroup);
				if (result == null) result = caseLoadGroup(nonConformLoadGroup);
				if (result == null) result = caseIdentifiedObject(nonConformLoadGroup);
				if (result == null) result = caseElement(nonConformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE: {
				ConformLoadSchedule conformLoadSchedule = (ConformLoadSchedule)theEObject;
				T result = caseConformLoadSchedule(conformLoadSchedule);
				if (result == null) result = caseSeasonDayTypeSchedule(conformLoadSchedule);
				if (result == null) result = caseRegularIntervalSchedule(conformLoadSchedule);
				if (result == null) result = caseBasicIntervalSchedule(conformLoadSchedule);
				if (result == null) result = caseIdentifiedObject(conformLoadSchedule);
				if (result == null) result = caseElement(conformLoadSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.CUSTOMER_LOAD: {
				CustomerLoad customerLoad = (CustomerLoad)theEObject;
				T result = caseCustomerLoad(customerLoad);
				if (result == null) result = caseConformLoad(customerLoad);
				if (result == null) result = caseEnergyConsumer(customerLoad);
				if (result == null) result = caseConductingEquipment(customerLoad);
				if (result == null) result = caseEquipment(customerLoad);
				if (result == null) result = casePowerSystemResource(customerLoad);
				if (result == null) result = caseIdentifiedObject(customerLoad);
				if (result == null) result = caseElement(customerLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.NON_CONFORM_LOAD: {
				NonConformLoad nonConformLoad = (NonConformLoad)theEObject;
				T result = caseNonConformLoad(nonConformLoad);
				if (result == null) result = caseEnergyConsumer(nonConformLoad);
				if (result == null) result = caseConductingEquipment(nonConformLoad);
				if (result == null) result = caseEquipment(nonConformLoad);
				if (result == null) result = casePowerSystemResource(nonConformLoad);
				if (result == null) result = caseIdentifiedObject(nonConformLoad);
				if (result == null) result = caseElement(nonConformLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.DAY_TYPE: {
				DayType dayType = (DayType)theEObject;
				T result = caseDayType(dayType);
				if (result == null) result = caseIdentifiedObject(dayType);
				if (result == null) result = caseElement(dayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.SEASON: {
				Season season = (Season)theEObject;
				T result = caseSeason(season);
				if (result == null) result = caseElement(season);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseConformLoad(load);
				if (result == null) result = caseEnergyConsumer(load);
				if (result == null) result = caseConductingEquipment(load);
				if (result == null) result = caseEquipment(load);
				if (result == null) result = casePowerSystemResource(load);
				if (result == null) result = caseIdentifiedObject(load);
				if (result == null) result = caseElement(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.STATION_SUPPLY: {
				StationSupply stationSupply = (StationSupply)theEObject;
				T result = caseStationSupply(stationSupply);
				if (result == null) result = caseEnergyConsumer(stationSupply);
				if (result == null) result = caseConductingEquipment(stationSupply);
				if (result == null) result = caseEquipment(stationSupply);
				if (result == null) result = casePowerSystemResource(stationSupply);
				if (result == null) result = caseIdentifiedObject(stationSupply);
				if (result == null) result = caseElement(stationSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE: {
				SeasonDayTypeSchedule seasonDayTypeSchedule = (SeasonDayTypeSchedule)theEObject;
				T result = caseSeasonDayTypeSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseRegularIntervalSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseBasicIntervalSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseIdentifiedObject(seasonDayTypeSchedule);
				if (result == null) result = caseElement(seasonDayTypeSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.LOAD_GROUP: {
				LoadGroup loadGroup = (LoadGroup)theEObject;
				T result = caseLoadGroup(loadGroup);
				if (result == null) result = caseIdentifiedObject(loadGroup);
				if (result == null) result = caseElement(loadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.ENERGY_AREA: {
				EnergyArea energyArea = (EnergyArea)theEObject;
				T result = caseEnergyArea(energyArea);
				if (result == null) result = caseIdentifiedObject(energyArea);
				if (result == null) result = caseElement(energyArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.CONFORM_LOAD_GROUP: {
				ConformLoadGroup conformLoadGroup = (ConformLoadGroup)theEObject;
				T result = caseConformLoadGroup(conformLoadGroup);
				if (result == null) result = caseLoadGroup(conformLoadGroup);
				if (result == null) result = caseIdentifiedObject(conformLoadGroup);
				if (result == null) result = caseElement(conformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.LOAD_AREA: {
				LoadArea loadArea = (LoadArea)theEObject;
				T result = caseLoadArea(loadArea);
				if (result == null) result = caseEnergyArea(loadArea);
				if (result == null) result = caseIdentifiedObject(loadArea);
				if (result == null) result = caseElement(loadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.SUB_LOAD_AREA: {
				SubLoadArea subLoadArea = (SubLoadArea)theEObject;
				T result = caseSubLoadArea(subLoadArea);
				if (result == null) result = caseEnergyArea(subLoadArea);
				if (result == null) result = caseIdentifiedObject(subLoadArea);
				if (result == null) result = caseElement(subLoadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC: {
				LoadResponseCharacteristic loadResponseCharacteristic = (LoadResponseCharacteristic)theEObject;
				T result = caseLoadResponseCharacteristic(loadResponseCharacteristic);
				if (result == null) result = caseIdentifiedObject(loadResponseCharacteristic);
				if (result == null) result = caseElement(loadResponseCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE: {
				NonConformLoadSchedule nonConformLoadSchedule = (NonConformLoadSchedule)theEObject;
				T result = caseNonConformLoadSchedule(nonConformLoadSchedule);
				if (result == null) result = caseSeasonDayTypeSchedule(nonConformLoadSchedule);
				if (result == null) result = caseRegularIntervalSchedule(nonConformLoadSchedule);
				if (result == null) result = caseBasicIntervalSchedule(nonConformLoadSchedule);
				if (result == null) result = caseIdentifiedObject(nonConformLoadSchedule);
				if (result == null) result = caseElement(nonConformLoadSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.INDUCTION_MOTOR_LOAD: {
				InductionMotorLoad inductionMotorLoad = (InductionMotorLoad)theEObject;
				T result = caseInductionMotorLoad(inductionMotorLoad);
				if (result == null) result = caseNonConformLoad(inductionMotorLoad);
				if (result == null) result = caseEnergyConsumer(inductionMotorLoad);
				if (result == null) result = caseConductingEquipment(inductionMotorLoad);
				if (result == null) result = caseEquipment(inductionMotorLoad);
				if (result == null) result = casePowerSystemResource(inductionMotorLoad);
				if (result == null) result = caseIdentifiedObject(inductionMotorLoad);
				if (result == null) result = caseElement(inductionMotorLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LoadModelPackage.CONFORM_LOAD: {
				ConformLoad conformLoad = (ConformLoad)theEObject;
				T result = caseConformLoad(conformLoad);
				if (result == null) result = caseEnergyConsumer(conformLoad);
				if (result == null) result = caseConductingEquipment(conformLoad);
				if (result == null) result = caseEquipment(conformLoad);
				if (result == null) result = casePowerSystemResource(conformLoad);
				if (result == null) result = caseIdentifiedObject(conformLoad);
				if (result == null) result = caseElement(conformLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoadGroup(NonConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoadSchedule(ConformLoadSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerLoad(CustomerLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoad(NonConformLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayType(DayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Season</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeason(Season object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationSupply(StationSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeasonDayTypeSchedule(SeasonDayTypeSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadGroup(LoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyArea(EnergyArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoadGroup(ConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadArea(LoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLoadArea(SubLoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadResponseCharacteristic(LoadResponseCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoadSchedule(NonConformLoadSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Induction Motor Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Induction Motor Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInductionMotorLoad(InductionMotorLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoad(ConformLoad object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumer(EnergyConsumer object) {
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

} //LoadModelSwitch
