/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires.util;

import CPSM.Core.BasicIntervalSchedule;
import CPSM.Core.ConductingEquipment;
import CPSM.Core.ConnectivityNodeContainer;
import CPSM.Core.Curve;
import CPSM.Core.Equipment;
import CPSM.Core.EquipmentContainer;
import CPSM.Core.IdentifiedObject;
import CPSM.Core.PowerSystemResource;
import CPSM.Core.RegularIntervalSchedule;

import CPSM.Element;

import CPSM.Wires.*;

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
 * @see CPSM.Wires.WiresPackage
 * @generated
 */
public class WiresSwitch<T> {
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
	protected static WiresPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresSwitch() {
		if (modelPackage == null) {
			modelPackage = WiresPackage.eINSTANCE;
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
			case WiresPackage.POWER_TRANSFORMER: {
				PowerTransformer powerTransformer = (PowerTransformer)theEObject;
				T result = casePowerTransformer(powerTransformer);
				if (result == null) result = caseEquipment(powerTransformer);
				if (result == null) result = casePowerSystemResource(powerTransformer);
				if (result == null) result = caseIdentifiedObject(powerTransformer);
				if (result == null) result = caseElement(powerTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DISCONNECTOR: {
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
			case WiresPackage.SYNCHRONOUS_MACHINE: {
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
			case WiresPackage.BUSBAR_SECTION: {
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
			case WiresPackage.SHUNT_COMPENSATOR: {
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
			case WiresPackage.LOAD_BREAK_SWITCH: {
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
			case WiresPackage.REGULATING_COND_EQ: {
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
			case WiresPackage.ENERGY_CONSUMER: {
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
			case WiresPackage.TRANSFORMER_WINDING: {
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
			case WiresPackage.REGULATING_CONTROL: {
				RegulatingControl regulatingControl = (RegulatingControl)theEObject;
				T result = caseRegulatingControl(regulatingControl);
				if (result == null) result = casePowerSystemResource(regulatingControl);
				if (result == null) result = caseIdentifiedObject(regulatingControl);
				if (result == null) result = caseElement(regulatingControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.REGULATION_SCHEDULE: {
				RegulationSchedule regulationSchedule = (RegulationSchedule)theEObject;
				T result = caseRegulationSchedule(regulationSchedule);
				if (result == null) result = caseRegularIntervalSchedule(regulationSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regulationSchedule);
				if (result == null) result = caseIdentifiedObject(regulationSchedule);
				if (result == null) result = caseElement(regulationSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.AC_LINE_SEGMENT: {
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
			case WiresPackage.SWITCH: {
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
			case WiresPackage.CONDUCTOR: {
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE: {
				ReactiveCapabilityCurve reactiveCapabilityCurve = (ReactiveCapabilityCurve)theEObject;
				T result = caseReactiveCapabilityCurve(reactiveCapabilityCurve);
				if (result == null) result = caseCurve(reactiveCapabilityCurve);
				if (result == null) result = caseIdentifiedObject(reactiveCapabilityCurve);
				if (result == null) result = caseElement(reactiveCapabilityCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TAP_CHANGER: {
				TapChanger tapChanger = (TapChanger)theEObject;
				T result = caseTapChanger(tapChanger);
				if (result == null) result = casePowerSystemResource(tapChanger);
				if (result == null) result = caseIdentifiedObject(tapChanger);
				if (result == null) result = caseElement(tapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.LINE: {
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
			case WiresPackage.STATIC_VAR_COMPENSATOR: {
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
			case WiresPackage.SERIES_COMPENSATOR: {
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
			case WiresPackage.BREAKER: {
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
			default: return defaultCase(theEObject);
		}
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

} //WiresSwitch
