/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.util;

import CPSM.*;

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
 * @see CPSM.CPSMPackage
 * @generated
 */
public class CPSMSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CPSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSMSwitch() {
		if (modelPackage == null) {
			modelPackage = CPSMPackage.eINSTANCE;
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
			case CPSMPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.IEC61970CIM_VERSION: {
				IEC61970CIMVersion iec61970CIMVersion = (IEC61970CIMVersion)theEObject;
				T result = caseIEC61970CIMVersion(iec61970CIMVersion);
				if (result == null) result = caseElement(iec61970CIMVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.COMMON_POWER_SYSTEM_MODEL: {
				CommonPowerSystemModel commonPowerSystemModel = (CommonPowerSystemModel)theEObject;
				T result = caseCommonPowerSystemModel(commonPowerSystemModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: {
				GrossToNetActivePowerCurve grossToNetActivePowerCurve = (GrossToNetActivePowerCurve)theEObject;
				T result = caseGrossToNetActivePowerCurve(grossToNetActivePowerCurve);
				if (result == null) result = caseCurve(grossToNetActivePowerCurve);
				if (result == null) result = caseIdentifiedObject(grossToNetActivePowerCurve);
				if (result == null) result = caseElement(grossToNetActivePowerCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.HYDRO_GENERATING_UNIT: {
				HydroGeneratingUnit hydroGeneratingUnit = (HydroGeneratingUnit)theEObject;
				T result = caseHydroGeneratingUnit(hydroGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(hydroGeneratingUnit);
				if (result == null) result = caseEquipment(hydroGeneratingUnit);
				if (result == null) result = casePowerSystemResource(hydroGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(hydroGeneratingUnit);
				if (result == null) result = caseElement(hydroGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.THERMAL_GENERATING_UNIT: {
				ThermalGeneratingUnit thermalGeneratingUnit = (ThermalGeneratingUnit)theEObject;
				T result = caseThermalGeneratingUnit(thermalGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(thermalGeneratingUnit);
				if (result == null) result = caseEquipment(thermalGeneratingUnit);
				if (result == null) result = casePowerSystemResource(thermalGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(thermalGeneratingUnit);
				if (result == null) result = caseElement(thermalGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.GENERATING_UNIT: {
				GeneratingUnit generatingUnit = (GeneratingUnit)theEObject;
				T result = caseGeneratingUnit(generatingUnit);
				if (result == null) result = caseEquipment(generatingUnit);
				if (result == null) result = casePowerSystemResource(generatingUnit);
				if (result == null) result = caseIdentifiedObject(generatingUnit);
				if (result == null) result = caseElement(generatingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.OPERATIONAL_LIMIT: {
				OperationalLimit operationalLimit = (OperationalLimit)theEObject;
				T result = caseOperationalLimit(operationalLimit);
				if (result == null) result = caseIdentifiedObject(operationalLimit);
				if (result == null) result = caseElement(operationalLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.OPERATIONAL_LIMIT_SET: {
				OperationalLimitSet operationalLimitSet = (OperationalLimitSet)theEObject;
				T result = caseOperationalLimitSet(operationalLimitSet);
				if (result == null) result = caseIdentifiedObject(operationalLimitSet);
				if (result == null) result = caseElement(operationalLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.ACTIVE_POWER_LIMIT: {
				ActivePowerLimit activePowerLimit = (ActivePowerLimit)theEObject;
				T result = caseActivePowerLimit(activePowerLimit);
				if (result == null) result = caseOperationalLimit(activePowerLimit);
				if (result == null) result = caseIdentifiedObject(activePowerLimit);
				if (result == null) result = caseElement(activePowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.APPARENT_POWER_LIMIT: {
				ApparentPowerLimit apparentPowerLimit = (ApparentPowerLimit)theEObject;
				T result = caseApparentPowerLimit(apparentPowerLimit);
				if (result == null) result = caseOperationalLimit(apparentPowerLimit);
				if (result == null) result = caseIdentifiedObject(apparentPowerLimit);
				if (result == null) result = caseElement(apparentPowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.VOLTAGE_LIMIT: {
				VoltageLimit voltageLimit = (VoltageLimit)theEObject;
				T result = caseVoltageLimit(voltageLimit);
				if (result == null) result = caseOperationalLimit(voltageLimit);
				if (result == null) result = caseIdentifiedObject(voltageLimit);
				if (result == null) result = caseElement(voltageLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CURRENT_LIMIT: {
				CurrentLimit currentLimit = (CurrentLimit)theEObject;
				T result = caseCurrentLimit(currentLimit);
				if (result == null) result = caseOperationalLimit(currentLimit);
				if (result == null) result = caseIdentifiedObject(currentLimit);
				if (result == null) result = caseElement(currentLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.POWER_TRANSFORMER: {
				PowerTransformer powerTransformer = (PowerTransformer)theEObject;
				T result = casePowerTransformer(powerTransformer);
				if (result == null) result = caseEquipment(powerTransformer);
				if (result == null) result = casePowerSystemResource(powerTransformer);
				if (result == null) result = caseIdentifiedObject(powerTransformer);
				if (result == null) result = caseElement(powerTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.DISCONNECTOR: {
				Disconnector disconnector = (Disconnector)theEObject;
				T result = caseDisconnector(disconnector);
				if (result == null) result = caseSwitch(disconnector);
				if (result == null) result = caseConductingEquipment(disconnector);
				if (result == null) result = caseEquipment(disconnector);
				if (result == null) result = casePowerSystemResource(disconnector);
				if (result == null) result = caseIdentifiedObject(disconnector);
				if (result == null) result = caseElement(disconnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SYNCHRONOUS_MACHINE: {
				SynchronousMachine synchronousMachine = (SynchronousMachine)theEObject;
				T result = caseSynchronousMachine(synchronousMachine);
				if (result == null) result = caseRegulatingCondEq(synchronousMachine);
				if (result == null) result = caseConductingEquipment(synchronousMachine);
				if (result == null) result = caseEquipment(synchronousMachine);
				if (result == null) result = casePowerSystemResource(synchronousMachine);
				if (result == null) result = caseIdentifiedObject(synchronousMachine);
				if (result == null) result = caseElement(synchronousMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.BUSBAR_SECTION: {
				BusbarSection busbarSection = (BusbarSection)theEObject;
				T result = caseBusbarSection(busbarSection);
				if (result == null) result = caseConductingEquipment(busbarSection);
				if (result == null) result = caseEquipment(busbarSection);
				if (result == null) result = casePowerSystemResource(busbarSection);
				if (result == null) result = caseIdentifiedObject(busbarSection);
				if (result == null) result = caseElement(busbarSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SHUNT_COMPENSATOR: {
				ShuntCompensator shuntCompensator = (ShuntCompensator)theEObject;
				T result = caseShuntCompensator(shuntCompensator);
				if (result == null) result = caseRegulatingCondEq(shuntCompensator);
				if (result == null) result = caseConductingEquipment(shuntCompensator);
				if (result == null) result = caseEquipment(shuntCompensator);
				if (result == null) result = casePowerSystemResource(shuntCompensator);
				if (result == null) result = caseIdentifiedObject(shuntCompensator);
				if (result == null) result = caseElement(shuntCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LOAD_BREAK_SWITCH: {
				LoadBreakSwitch loadBreakSwitch = (LoadBreakSwitch)theEObject;
				T result = caseLoadBreakSwitch(loadBreakSwitch);
				if (result == null) result = caseSwitch(loadBreakSwitch);
				if (result == null) result = caseConductingEquipment(loadBreakSwitch);
				if (result == null) result = caseEquipment(loadBreakSwitch);
				if (result == null) result = casePowerSystemResource(loadBreakSwitch);
				if (result == null) result = caseIdentifiedObject(loadBreakSwitch);
				if (result == null) result = caseElement(loadBreakSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REGULATING_COND_EQ: {
				RegulatingCondEq regulatingCondEq = (RegulatingCondEq)theEObject;
				T result = caseRegulatingCondEq(regulatingCondEq);
				if (result == null) result = caseConductingEquipment(regulatingCondEq);
				if (result == null) result = caseEquipment(regulatingCondEq);
				if (result == null) result = casePowerSystemResource(regulatingCondEq);
				if (result == null) result = caseIdentifiedObject(regulatingCondEq);
				if (result == null) result = caseElement(regulatingCondEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.ENERGY_CONSUMER: {
				EnergyConsumer energyConsumer = (EnergyConsumer)theEObject;
				T result = caseEnergyConsumer(energyConsumer);
				if (result == null) result = caseConductingEquipment(energyConsumer);
				if (result == null) result = caseEquipment(energyConsumer);
				if (result == null) result = casePowerSystemResource(energyConsumer);
				if (result == null) result = caseIdentifiedObject(energyConsumer);
				if (result == null) result = caseElement(energyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.TRANSFORMER_WINDING: {
				TransformerWinding transformerWinding = (TransformerWinding)theEObject;
				T result = caseTransformerWinding(transformerWinding);
				if (result == null) result = caseConductingEquipment(transformerWinding);
				if (result == null) result = caseEquipment(transformerWinding);
				if (result == null) result = casePowerSystemResource(transformerWinding);
				if (result == null) result = caseIdentifiedObject(transformerWinding);
				if (result == null) result = caseElement(transformerWinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REGULATING_CONTROL: {
				RegulatingControl regulatingControl = (RegulatingControl)theEObject;
				T result = caseRegulatingControl(regulatingControl);
				if (result == null) result = casePowerSystemResource(regulatingControl);
				if (result == null) result = caseIdentifiedObject(regulatingControl);
				if (result == null) result = caseElement(regulatingControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REGULATION_SCHEDULE: {
				RegulationSchedule regulationSchedule = (RegulationSchedule)theEObject;
				T result = caseRegulationSchedule(regulationSchedule);
				if (result == null) result = caseRegularIntervalSchedule(regulationSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regulationSchedule);
				if (result == null) result = caseIdentifiedObject(regulationSchedule);
				if (result == null) result = caseElement(regulationSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.AC_LINE_SEGMENT: {
				ACLineSegment acLineSegment = (ACLineSegment)theEObject;
				T result = caseACLineSegment(acLineSegment);
				if (result == null) result = caseConductor(acLineSegment);
				if (result == null) result = caseConductingEquipment(acLineSegment);
				if (result == null) result = caseEquipment(acLineSegment);
				if (result == null) result = casePowerSystemResource(acLineSegment);
				if (result == null) result = caseIdentifiedObject(acLineSegment);
				if (result == null) result = caseElement(acLineSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SWITCH: {
				Switch switch_ = (Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseConductingEquipment(switch_);
				if (result == null) result = caseEquipment(switch_);
				if (result == null) result = casePowerSystemResource(switch_);
				if (result == null) result = caseIdentifiedObject(switch_);
				if (result == null) result = caseElement(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONDUCTOR: {
				Conductor conductor = (Conductor)theEObject;
				T result = caseConductor(conductor);
				if (result == null) result = caseConductingEquipment(conductor);
				if (result == null) result = caseEquipment(conductor);
				if (result == null) result = casePowerSystemResource(conductor);
				if (result == null) result = caseIdentifiedObject(conductor);
				if (result == null) result = caseElement(conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REACTIVE_CAPABILITY_CURVE: {
				ReactiveCapabilityCurve reactiveCapabilityCurve = (ReactiveCapabilityCurve)theEObject;
				T result = caseReactiveCapabilityCurve(reactiveCapabilityCurve);
				if (result == null) result = caseCurve(reactiveCapabilityCurve);
				if (result == null) result = caseIdentifiedObject(reactiveCapabilityCurve);
				if (result == null) result = caseElement(reactiveCapabilityCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.TAP_CHANGER: {
				TapChanger tapChanger = (TapChanger)theEObject;
				T result = caseTapChanger(tapChanger);
				if (result == null) result = casePowerSystemResource(tapChanger);
				if (result == null) result = caseIdentifiedObject(tapChanger);
				if (result == null) result = caseElement(tapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseEquipmentContainer(line);
				if (result == null) result = caseConnectivityNodeContainer(line);
				if (result == null) result = casePowerSystemResource(line);
				if (result == null) result = caseIdentifiedObject(line);
				if (result == null) result = caseElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.STATIC_VAR_COMPENSATOR: {
				StaticVarCompensator staticVarCompensator = (StaticVarCompensator)theEObject;
				T result = caseStaticVarCompensator(staticVarCompensator);
				if (result == null) result = caseRegulatingCondEq(staticVarCompensator);
				if (result == null) result = caseConductingEquipment(staticVarCompensator);
				if (result == null) result = caseEquipment(staticVarCompensator);
				if (result == null) result = casePowerSystemResource(staticVarCompensator);
				if (result == null) result = caseIdentifiedObject(staticVarCompensator);
				if (result == null) result = caseElement(staticVarCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SERIES_COMPENSATOR: {
				SeriesCompensator seriesCompensator = (SeriesCompensator)theEObject;
				T result = caseSeriesCompensator(seriesCompensator);
				if (result == null) result = caseConductingEquipment(seriesCompensator);
				if (result == null) result = caseEquipment(seriesCompensator);
				if (result == null) result = casePowerSystemResource(seriesCompensator);
				if (result == null) result = caseIdentifiedObject(seriesCompensator);
				if (result == null) result = caseElement(seriesCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.BREAKER: {
				Breaker breaker = (Breaker)theEObject;
				T result = caseBreaker(breaker);
				if (result == null) result = caseSwitch(breaker);
				if (result == null) result = caseConductingEquipment(breaker);
				if (result == null) result = caseEquipment(breaker);
				if (result == null) result = casePowerSystemResource(breaker);
				if (result == null) result = caseIdentifiedObject(breaker);
				if (result == null) result = caseElement(breaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.DISCRETE_VALUE: {
				DiscreteValue discreteValue = (DiscreteValue)theEObject;
				T result = caseDiscreteValue(discreteValue);
				if (result == null) result = caseMeasurementValue(discreteValue);
				if (result == null) result = caseIdentifiedObject(discreteValue);
				if (result == null) result = caseElement(discreteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = caseIdentifiedObject(measurement);
				if (result == null) result = caseElement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.MEASUREMENT_VALUE: {
				MeasurementValue measurementValue = (MeasurementValue)theEObject;
				T result = caseMeasurementValue(measurementValue);
				if (result == null) result = caseIdentifiedObject(measurementValue);
				if (result == null) result = caseElement(measurementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.MEASUREMENT_VALUE_SOURCE: {
				MeasurementValueSource measurementValueSource = (MeasurementValueSource)theEObject;
				T result = caseMeasurementValueSource(measurementValueSource);
				if (result == null) result = caseIdentifiedObject(measurementValueSource);
				if (result == null) result = caseElement(measurementValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.ANALOG: {
				Analog analog = (Analog)theEObject;
				T result = caseAnalog(analog);
				if (result == null) result = caseMeasurement(analog);
				if (result == null) result = caseIdentifiedObject(analog);
				if (result == null) result = caseElement(analog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.ANALOG_VALUE: {
				AnalogValue analogValue = (AnalogValue)theEObject;
				T result = caseAnalogValue(analogValue);
				if (result == null) result = caseMeasurementValue(analogValue);
				if (result == null) result = caseIdentifiedObject(analogValue);
				if (result == null) result = caseElement(analogValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.MEASUREMENT_TYPE: {
				MeasurementType measurementType = (MeasurementType)theEObject;
				T result = caseMeasurementType(measurementType);
				if (result == null) result = caseIdentifiedObject(measurementType);
				if (result == null) result = caseElement(measurementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.DISCRETE: {
				Discrete discrete = (Discrete)theEObject;
				T result = caseDiscrete(discrete);
				if (result == null) result = caseMeasurement(discrete);
				if (result == null) result = caseIdentifiedObject(discrete);
				if (result == null) result = caseElement(discrete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LIMIT_SET: {
				LimitSet limitSet = (LimitSet)theEObject;
				T result = caseLimitSet(limitSet);
				if (result == null) result = caseIdentifiedObject(limitSet);
				if (result == null) result = caseElement(limitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.NON_CONFORM_LOAD_GROUP: {
				NonConformLoadGroup nonConformLoadGroup = (NonConformLoadGroup)theEObject;
				T result = caseNonConformLoadGroup(nonConformLoadGroup);
				if (result == null) result = caseLoadGroup(nonConformLoadGroup);
				if (result == null) result = caseIdentifiedObject(nonConformLoadGroup);
				if (result == null) result = caseElement(nonConformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONFORM_LOAD_SCHEDULE: {
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
			case CPSMPackage.CUSTOMER_LOAD: {
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
			case CPSMPackage.NON_CONFORM_LOAD: {
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
			case CPSMPackage.DAY_TYPE: {
				DayType dayType = (DayType)theEObject;
				T result = caseDayType(dayType);
				if (result == null) result = caseIdentifiedObject(dayType);
				if (result == null) result = caseElement(dayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SEASON: {
				Season season = (Season)theEObject;
				T result = caseSeason(season);
				if (result == null) result = caseElement(season);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LOAD: {
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
			case CPSMPackage.STATION_SUPPLY: {
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
			case CPSMPackage.SEASON_DAY_TYPE_SCHEDULE: {
				SeasonDayTypeSchedule seasonDayTypeSchedule = (SeasonDayTypeSchedule)theEObject;
				T result = caseSeasonDayTypeSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseRegularIntervalSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseBasicIntervalSchedule(seasonDayTypeSchedule);
				if (result == null) result = caseIdentifiedObject(seasonDayTypeSchedule);
				if (result == null) result = caseElement(seasonDayTypeSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LOAD_GROUP: {
				LoadGroup loadGroup = (LoadGroup)theEObject;
				T result = caseLoadGroup(loadGroup);
				if (result == null) result = caseIdentifiedObject(loadGroup);
				if (result == null) result = caseElement(loadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.ENERGY_AREA: {
				EnergyArea energyArea = (EnergyArea)theEObject;
				T result = caseEnergyArea(energyArea);
				if (result == null) result = caseIdentifiedObject(energyArea);
				if (result == null) result = caseElement(energyArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONFORM_LOAD_GROUP: {
				ConformLoadGroup conformLoadGroup = (ConformLoadGroup)theEObject;
				T result = caseConformLoadGroup(conformLoadGroup);
				if (result == null) result = caseLoadGroup(conformLoadGroup);
				if (result == null) result = caseIdentifiedObject(conformLoadGroup);
				if (result == null) result = caseElement(conformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LOAD_AREA: {
				LoadArea loadArea = (LoadArea)theEObject;
				T result = caseLoadArea(loadArea);
				if (result == null) result = caseEnergyArea(loadArea);
				if (result == null) result = caseIdentifiedObject(loadArea);
				if (result == null) result = caseElement(loadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SUB_LOAD_AREA: {
				SubLoadArea subLoadArea = (SubLoadArea)theEObject;
				T result = caseSubLoadArea(subLoadArea);
				if (result == null) result = caseEnergyArea(subLoadArea);
				if (result == null) result = caseIdentifiedObject(subLoadArea);
				if (result == null) result = caseElement(subLoadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.LOAD_RESPONSE_CHARACTERISTIC: {
				LoadResponseCharacteristic loadResponseCharacteristic = (LoadResponseCharacteristic)theEObject;
				T result = caseLoadResponseCharacteristic(loadResponseCharacteristic);
				if (result == null) result = caseIdentifiedObject(loadResponseCharacteristic);
				if (result == null) result = caseElement(loadResponseCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.NON_CONFORM_LOAD_SCHEDULE: {
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
			case CPSMPackage.INDUCTION_MOTOR_LOAD: {
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
			case CPSMPackage.CONFORM_LOAD: {
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
			case CPSMPackage.EQUIVALENT_NETWORK: {
				EquivalentNetwork equivalentNetwork = (EquivalentNetwork)theEObject;
				T result = caseEquivalentNetwork(equivalentNetwork);
				if (result == null) result = caseConnectivityNodeContainer(equivalentNetwork);
				if (result == null) result = casePowerSystemResource(equivalentNetwork);
				if (result == null) result = caseIdentifiedObject(equivalentNetwork);
				if (result == null) result = caseElement(equivalentNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.EQUIVALENT_SHUNT: {
				EquivalentShunt equivalentShunt = (EquivalentShunt)theEObject;
				T result = caseEquivalentShunt(equivalentShunt);
				if (result == null) result = caseEquivalentEquipment(equivalentShunt);
				if (result == null) result = caseConductingEquipment(equivalentShunt);
				if (result == null) result = caseEquipment(equivalentShunt);
				if (result == null) result = casePowerSystemResource(equivalentShunt);
				if (result == null) result = caseIdentifiedObject(equivalentShunt);
				if (result == null) result = caseElement(equivalentShunt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.EQUIVALENT_EQUIPMENT: {
				EquivalentEquipment equivalentEquipment = (EquivalentEquipment)theEObject;
				T result = caseEquivalentEquipment(equivalentEquipment);
				if (result == null) result = caseConductingEquipment(equivalentEquipment);
				if (result == null) result = caseEquipment(equivalentEquipment);
				if (result == null) result = casePowerSystemResource(equivalentEquipment);
				if (result == null) result = caseIdentifiedObject(equivalentEquipment);
				if (result == null) result = caseElement(equivalentEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.EQUIVALENT_BRANCH: {
				EquivalentBranch equivalentBranch = (EquivalentBranch)theEObject;
				T result = caseEquivalentBranch(equivalentBranch);
				if (result == null) result = caseEquivalentEquipment(equivalentBranch);
				if (result == null) result = caseConductingEquipment(equivalentBranch);
				if (result == null) result = caseEquipment(equivalentBranch);
				if (result == null) result = casePowerSystemResource(equivalentBranch);
				if (result == null) result = caseIdentifiedObject(equivalentBranch);
				if (result == null) result = caseElement(equivalentBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.IDENTIFIED_OBJECT: {
				IdentifiedObject identifiedObject = (IdentifiedObject)theEObject;
				T result = caseIdentifiedObject(identifiedObject);
				if (result == null) result = caseElement(identifiedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseIdentifiedObject(terminal);
				if (result == null) result = caseElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.BASE_VOLTAGE: {
				BaseVoltage baseVoltage = (BaseVoltage)theEObject;
				T result = caseBaseVoltage(baseVoltage);
				if (result == null) result = caseIdentifiedObject(baseVoltage);
				if (result == null) result = caseElement(baseVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REGULAR_INTERVAL_SCHEDULE: {
				RegularIntervalSchedule regularIntervalSchedule = (RegularIntervalSchedule)theEObject;
				T result = caseRegularIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(regularIntervalSchedule);
				if (result == null) result = caseElement(regularIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONNECTIVITY_NODE_CONTAINER: {
				ConnectivityNodeContainer connectivityNodeContainer = (ConnectivityNodeContainer)theEObject;
				T result = caseConnectivityNodeContainer(connectivityNodeContainer);
				if (result == null) result = casePowerSystemResource(connectivityNodeContainer);
				if (result == null) result = caseIdentifiedObject(connectivityNodeContainer);
				if (result == null) result = caseElement(connectivityNodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseIdentifiedObject(unit);
				if (result == null) result = caseElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.EQUIPMENT_CONTAINER: {
				EquipmentContainer equipmentContainer = (EquipmentContainer)theEObject;
				T result = caseEquipmentContainer(equipmentContainer);
				if (result == null) result = caseConnectivityNodeContainer(equipmentContainer);
				if (result == null) result = casePowerSystemResource(equipmentContainer);
				if (result == null) result = caseIdentifiedObject(equipmentContainer);
				if (result == null) result = caseElement(equipmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.VOLTAGE_LEVEL: {
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
			case CPSMPackage.BAY: {
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
			case CPSMPackage.SUB_GEOGRAPHICAL_REGION: {
				SubGeographicalRegion subGeographicalRegion = (SubGeographicalRegion)theEObject;
				T result = caseSubGeographicalRegion(subGeographicalRegion);
				if (result == null) result = caseIdentifiedObject(subGeographicalRegion);
				if (result == null) result = caseElement(subGeographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.REGULAR_TIME_POINT: {
				RegularTimePoint regularTimePoint = (RegularTimePoint)theEObject;
				T result = caseRegularTimePoint(regularTimePoint);
				if (result == null) result = caseElement(regularTimePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.EQUIPMENT: {
				Equipment equipment = (Equipment)theEObject;
				T result = caseEquipment(equipment);
				if (result == null) result = casePowerSystemResource(equipment);
				if (result == null) result = caseIdentifiedObject(equipment);
				if (result == null) result = caseElement(equipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.SUBSTATION: {
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
			case CPSMPackage.CURVE: {
				Curve curve = (Curve)theEObject;
				T result = caseCurve(curve);
				if (result == null) result = caseIdentifiedObject(curve);
				if (result == null) result = caseElement(curve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.POWER_SYSTEM_RESOURCE: {
				PowerSystemResource powerSystemResource = (PowerSystemResource)theEObject;
				T result = casePowerSystemResource(powerSystemResource);
				if (result == null) result = caseIdentifiedObject(powerSystemResource);
				if (result == null) result = caseElement(powerSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.BASIC_INTERVAL_SCHEDULE: {
				BasicIntervalSchedule basicIntervalSchedule = (BasicIntervalSchedule)theEObject;
				T result = caseBasicIntervalSchedule(basicIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(basicIntervalSchedule);
				if (result == null) result = caseElement(basicIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CURVE_DATA: {
				CurveData curveData = (CurveData)theEObject;
				T result = caseCurveData(curveData);
				if (result == null) result = caseElement(curveData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.GEOGRAPHICAL_REGION: {
				GeographicalRegion geographicalRegion = (GeographicalRegion)theEObject;
				T result = caseGeographicalRegion(geographicalRegion);
				if (result == null) result = caseIdentifiedObject(geographicalRegion);
				if (result == null) result = caseElement(geographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONDUCTING_EQUIPMENT: {
				ConductingEquipment conductingEquipment = (ConductingEquipment)theEObject;
				T result = caseConductingEquipment(conductingEquipment);
				if (result == null) result = caseEquipment(conductingEquipment);
				if (result == null) result = casePowerSystemResource(conductingEquipment);
				if (result == null) result = caseIdentifiedObject(conductingEquipment);
				if (result == null) result = caseElement(conductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONTROL_AREA: {
				ControlArea controlArea = (ControlArea)theEObject;
				T result = caseControlArea(controlArea);
				if (result == null) result = casePowerSystemResource(controlArea);
				if (result == null) result = caseIdentifiedObject(controlArea);
				if (result == null) result = caseElement(controlArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.TIE_FLOW: {
				TieFlow tieFlow = (TieFlow)theEObject;
				T result = caseTieFlow(tieFlow);
				if (result == null) result = caseElement(tieFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONTROL_AREA_GENERATING_UNIT: {
				ControlAreaGeneratingUnit controlAreaGeneratingUnit = (ControlAreaGeneratingUnit)theEObject;
				T result = caseControlAreaGeneratingUnit(controlAreaGeneratingUnit);
				if (result == null) result = caseElement(controlAreaGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CPSMPackage.CONNECTIVITY_NODE: {
				ConnectivityNode connectivityNode = (ConnectivityNode)theEObject;
				T result = caseConnectivityNode(connectivityNode);
				if (result == null) result = caseIdentifiedObject(connectivityNode);
				if (result == null) result = caseElement(connectivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>IEC61970CIM Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC61970CIM Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC61970CIMVersion(IEC61970CIMVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Power System Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Power System Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonPowerSystemModel(CommonPowerSystemModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrossToNetActivePowerCurve(GrossToNetActivePowerCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroGeneratingUnit(HydroGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThermalGeneratingUnit(ThermalGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratingUnit(GeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimit(OperationalLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimitSet(OperationalLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivePowerLimit(ActivePowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparentPowerLimit(ApparentPowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLimit(VoltageLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentLimit(CurrentLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerTransformer(PowerTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnector(Disconnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousMachine(SynchronousMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusbarSection(BusbarSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntCompensator(ShuntCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBreakSwitch(LoadBreakSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatingCondEq(RegulatingCondEq object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerWinding(TransformerWinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatingControl(RegulatingControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulationSchedule(RegulationSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACLineSegment(ACLineSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductor(Conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveCapabilityCurve(ReactiveCapabilityCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapChanger(TapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticVarCompensator(StaticVarCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesCompensator(SeriesCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreaker(Breaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValue(DiscreteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValue(MeasurementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValueSource(MeasurementValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalog(Analog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogValue(AnalogValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementType(MeasurementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscrete(Discrete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitSet(LimitSet object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentNetwork(EquivalentNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentShunt(EquivalentShunt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentEquipment(EquivalentEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentBranch(EquivalentBranch object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlArea(ControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTieFlow(TieFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAreaGeneratingUnit(ControlAreaGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNode(ConnectivityNode object) {
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

} //CPSMSwitch
