/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Wires;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Synchronous Machine Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CPSM.Wires.WiresPackage#getSynchronousMachineType()
 * @model
 * @generated
 */
public enum SynchronousMachineType implements Enumerator {
	/**
	 * The '<em><b>Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATOR(0, "generator", "generator"),

	/**
	 * The '<em><b>Generator or condenser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OR_CONDENSER_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATOR_OR_CONDENSER(1, "generator_or_condenser", "generator_or_condenser"),

	/**
	 * The '<em><b>Condenser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDENSER_VALUE
	 * @generated
	 * @ordered
	 */
	CONDENSER(2, "condenser", "condenser");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The '<em><b>Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATOR
	 * @model name="generator"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_VALUE = 0;

	/**
	 * The '<em><b>Generator or condenser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generator or condenser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OR_CONDENSER
	 * @model name="generator_or_condenser"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_OR_CONDENSER_VALUE = 1;

	/**
	 * The '<em><b>Condenser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Condenser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDENSER
	 * @model name="condenser"
	 * @generated
	 * @ordered
	 */
	public static final int CONDENSER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Synchronous Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SynchronousMachineType[] VALUES_ARRAY =
		new SynchronousMachineType[] {
			GENERATOR,
			GENERATOR_OR_CONDENSER,
			CONDENSER,
		};

	/**
	 * A public read-only list of all the '<em><b>Synchronous Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SynchronousMachineType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Synchronous Machine Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynchronousMachineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SynchronousMachineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Synchronous Machine Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynchronousMachineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SynchronousMachineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Synchronous Machine Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynchronousMachineType get(int value) {
		switch (value) {
			case GENERATOR_VALUE: return GENERATOR;
			case GENERATOR_OR_CONDENSER_VALUE: return GENERATOR_OR_CONDENSER;
			case CONDENSER_VALUE: return CONDENSER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SynchronousMachineType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SynchronousMachineType
