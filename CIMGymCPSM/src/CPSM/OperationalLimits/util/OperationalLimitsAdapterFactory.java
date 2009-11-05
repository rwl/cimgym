/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits.util;

import CPSM.Core.IdentifiedObject;

import CPSM.Element;

import CPSM.OperationalLimits.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CPSM.OperationalLimits.OperationalLimitsPackage
 * @generated
 */
public class OperationalLimitsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalLimitsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperationalLimitsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitsSwitch<Adapter> modelSwitch =
		new OperationalLimitsSwitch<Adapter>() {
			@Override
			public Adapter caseOperationalLimit(OperationalLimit object) {
				return createOperationalLimitAdapter();
			}
			@Override
			public Adapter caseOperationalLimitSet(OperationalLimitSet object) {
				return createOperationalLimitSetAdapter();
			}
			@Override
			public Adapter caseActivePowerLimit(ActivePowerLimit object) {
				return createActivePowerLimitAdapter();
			}
			@Override
			public Adapter caseApparentPowerLimit(ApparentPowerLimit object) {
				return createApparentPowerLimitAdapter();
			}
			@Override
			public Adapter caseVoltageLimit(VoltageLimit object) {
				return createVoltageLimitAdapter();
			}
			@Override
			public Adapter caseCurrentLimit(CurrentLimit object) {
				return createCurrentLimitAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.OperationalLimit
	 * @generated
	 */
	public Adapter createOperationalLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.OperationalLimitSet
	 * @generated
	 */
	public Adapter createOperationalLimitSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.ActivePowerLimit
	 * @generated
	 */
	public Adapter createActivePowerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.ApparentPowerLimit
	 * @generated
	 */
	public Adapter createApparentPowerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.VoltageLimit
	 * @generated
	 */
	public Adapter createVoltageLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.OperationalLimits.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.OperationalLimits.CurrentLimit
	 * @generated
	 */
	public Adapter createCurrentLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CPSM.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CPSM.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperationalLimitsAdapterFactory
