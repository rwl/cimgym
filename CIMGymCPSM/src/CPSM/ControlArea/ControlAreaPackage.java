/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.ControlArea;

import CPSM.CPSMPackage;

import CPSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CPSM.ControlArea.ControlAreaFactory
 * @model kind="package"
 * @generated
 */
public interface ControlAreaPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ControlArea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2008/CIM-schema-cim13#Package_ControlArea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlAreaPackage eINSTANCE = CPSM.ControlArea.impl.ControlAreaPackageImpl.init();

	/**
	 * The meta object id for the '{@link CPSM.ControlArea.impl.ControlAreaImpl <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.ControlArea.impl.ControlAreaImpl
	 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlArea()
	 * @generated
	 */
	int CONTROL_AREA = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__URI = CorePackage.POWER_SYSTEM_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MODEL = CorePackage.POWER_SYSTEM_RESOURCE__MODEL;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__PATH_NAME = CorePackage.POWER_SYSTEM_RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__DESCRIPTION = CorePackage.POWER_SYSTEM_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contains Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CONTAINS_MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__CONTAINS_MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__NET_INTERCHANGE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__ENERGY_AREA = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TIE_FLOW = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CPSM.ControlArea.impl.TieFlowImpl <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.ControlArea.impl.TieFlowImpl
	 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getTieFlow()
	 * @generated
	 */
	int TIE_FLOW = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__CONTROL_AREA = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__POSITIVE_FLOW_IN = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.ControlArea.impl.ControlAreaGeneratingUnitImpl <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.ControlArea.impl.ControlAreaGeneratingUnitImpl
	 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlAreaGeneratingUnit()
	 * @generated
	 */
	int CONTROL_AREA_GENERATING_UNIT = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__URI = CPSMPackage.ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__MODEL = CPSMPackage.ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = CPSMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = CPSMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_GENERATING_UNIT_FEATURE_COUNT = CPSMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CPSM.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CPSM.ControlArea.ControlAreaTypeKind
	 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlAreaTypeKind()
	 * @generated
	 */
	int CONTROL_AREA_TYPE_KIND = 3;


	/**
	 * Returns the meta object for class '{@link CPSM.ControlArea.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see CPSM.ControlArea.ControlArea
	 * @generated
	 */
	EClass getControlArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CPSM.ControlArea.ControlArea#getControlAreaGeneratingUnit()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_ControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Interchange</em>'.
	 * @see CPSM.ControlArea.ControlArea#getNetInterchange()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_NetInterchange();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Area</em>'.
	 * @see CPSM.ControlArea.ControlArea#getEnergyArea()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_EnergyArea();

	/**
	 * Returns the meta object for the reference list '{@link CPSM.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see CPSM.ControlArea.ControlArea#getTieFlow()
	 * @see #getControlArea()
	 * @generated
	 */
	EReference getControlArea_TieFlow();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ControlArea.ControlArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CPSM.ControlArea.ControlArea#getType()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_Type();

	/**
	 * Returns the meta object for class '{@link CPSM.ControlArea.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see CPSM.ControlArea.TieFlow
	 * @generated
	 */
	EClass getTieFlow();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlArea.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.ControlArea.TieFlow#getControlArea()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_ControlArea();

	/**
	 * Returns the meta object for the attribute '{@link CPSM.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CPSM.ControlArea.TieFlow#isPositiveFlowIn()
	 * @see #getTieFlow()
	 * @generated
	 */
	EAttribute getTieFlow_PositiveFlowIn();

	/**
	 * Returns the meta object for class '{@link CPSM.ControlArea.ControlAreaGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CPSM.ControlArea.ControlAreaGeneratingUnit
	 * @generated
	 */
	EClass getControlAreaGeneratingUnit();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CPSM.ControlArea.ControlAreaGeneratingUnit#getControlArea()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_ControlArea();

	/**
	 * Returns the meta object for the reference '{@link CPSM.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CPSM.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	EReference getControlAreaGeneratingUnit_GeneratingUnit();

	/**
	 * Returns the meta object for enum '{@link CPSM.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see CPSM.ControlArea.ControlAreaTypeKind
	 * @generated
	 */
	EEnum getControlAreaTypeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlAreaFactory getControlAreaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CPSM.ControlArea.impl.ControlAreaImpl <em>Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.ControlArea.impl.ControlAreaImpl
		 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlArea()
		 * @generated
		 */
		EClass CONTROL_AREA = eINSTANCE.getControlArea();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlArea_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Net Interchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__NET_INTERCHANGE = eINSTANCE.getControlArea_NetInterchange();

		/**
		 * The meta object literal for the '<em><b>Energy Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__ENERGY_AREA = eINSTANCE.getControlArea_EnergyArea();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA__TIE_FLOW = eINSTANCE.getControlArea_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__TYPE = eINSTANCE.getControlArea_Type();

		/**
		 * The meta object literal for the '{@link CPSM.ControlArea.impl.TieFlowImpl <em>Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.ControlArea.impl.TieFlowImpl
		 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getTieFlow()
		 * @generated
		 */
		EClass TIE_FLOW = eINSTANCE.getTieFlow();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__CONTROL_AREA = eINSTANCE.getTieFlow_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIE_FLOW__POSITIVE_FLOW_IN = eINSTANCE.getTieFlow_PositiveFlowIn();

		/**
		 * The meta object literal for the '{@link CPSM.ControlArea.impl.ControlAreaGeneratingUnitImpl <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.ControlArea.impl.ControlAreaGeneratingUnitImpl
		 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlAreaGeneratingUnit()
		 * @generated
		 */
		EClass CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = eINSTANCE.getControlAreaGeneratingUnit_ControlArea();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CPSM.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CPSM.ControlArea.ControlAreaTypeKind
		 * @see CPSM.ControlArea.impl.ControlAreaPackageImpl#getControlAreaTypeKind()
		 * @generated
		 */
		EEnum CONTROL_AREA_TYPE_KIND = eINSTANCE.getControlAreaTypeKind();

	}

} //ControlAreaPackage
