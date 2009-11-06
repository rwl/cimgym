/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.LoadModel.impl;

import CPSM.LoadModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadModelFactoryImpl extends EFactoryImpl implements LoadModelFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadModelFactory init() {
		try {
			LoadModelFactory theLoadModelFactory = (LoadModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#Package_LoadModel"); 
			if (theLoadModelFactory != null) {
				return theLoadModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoadModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP: return createNonConformLoadGroup();
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE: return createConformLoadSchedule();
			case LoadModelPackage.CUSTOMER_LOAD: return createCustomerLoad();
			case LoadModelPackage.NON_CONFORM_LOAD: return createNonConformLoad();
			case LoadModelPackage.DAY_TYPE: return createDayType();
			case LoadModelPackage.SEASON: return createSeason();
			case LoadModelPackage.LOAD: return createLoad();
			case LoadModelPackage.STATION_SUPPLY: return createStationSupply();
			case LoadModelPackage.CONFORM_LOAD_GROUP: return createConformLoadGroup();
			case LoadModelPackage.LOAD_AREA: return createLoadArea();
			case LoadModelPackage.SUB_LOAD_AREA: return createSubLoadArea();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC: return createLoadResponseCharacteristic();
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE: return createNonConformLoadSchedule();
			case LoadModelPackage.INDUCTION_MOTOR_LOAD: return createInductionMotorLoad();
			case LoadModelPackage.CONFORM_LOAD: return createConformLoad();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LoadModelPackage.SEASON_NAME:
				return createSeasonNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LoadModelPackage.SEASON_NAME:
				return convertSeasonNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup createNonConformLoadGroup() {
		NonConformLoadGroupImpl nonConformLoadGroup = new NonConformLoadGroupImpl();
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadSchedule createConformLoadSchedule() {
		ConformLoadScheduleImpl conformLoadSchedule = new ConformLoadScheduleImpl();
		return conformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerLoad createCustomerLoad() {
		CustomerLoadImpl customerLoad = new CustomerLoadImpl();
		return customerLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoad createNonConformLoad() {
		NonConformLoadImpl nonConformLoad = new NonConformLoadImpl();
		return nonConformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType createDayType() {
		DayTypeImpl dayType = new DayTypeImpl();
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSupply createStationSupply() {
		StationSupplyImpl stationSupply = new StationSupplyImpl();
		return stationSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup createConformLoadGroup() {
		ConformLoadGroupImpl conformLoadGroup = new ConformLoadGroupImpl();
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea createLoadArea() {
		LoadAreaImpl loadArea = new LoadAreaImpl();
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea createSubLoadArea() {
		SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic createLoadResponseCharacteristic() {
		LoadResponseCharacteristicImpl loadResponseCharacteristic = new LoadResponseCharacteristicImpl();
		return loadResponseCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadSchedule createNonConformLoadSchedule() {
		NonConformLoadScheduleImpl nonConformLoadSchedule = new NonConformLoadScheduleImpl();
		return nonConformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductionMotorLoad createInductionMotorLoad() {
		InductionMotorLoadImpl inductionMotorLoad = new InductionMotorLoadImpl();
		return inductionMotorLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoad createConformLoad() {
		ConformLoadImpl conformLoad = new ConformLoadImpl();
		return conformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonName createSeasonNameFromString(EDataType eDataType, String initialValue) {
		SeasonName result = SeasonName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelPackage getLoadModelPackage() {
		return (LoadModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoadModelPackage getPackage() {
		return LoadModelPackage.eINSTANCE;
	}

} //LoadModelFactoryImpl
