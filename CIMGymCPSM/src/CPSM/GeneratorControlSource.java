/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generator Control Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CPSM.CPSMPackage#getGeneratorControlSource()
 * @model
 * @generated
 */
public enum GeneratorControlSource implements Enumerator {
	/**
	 * The '<em><b>Off AGC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_AGC_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_AGC(0, "offAGC", "offAGC"),

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(1, "Unavailable", "Unavailable"),

	/**
	 * The '<em><b>On AGC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_AGC_VALUE
	 * @generated
	 * @ordered
	 */
	ON_AGC(2, "onAGC", "onAGC"),

	/**
	 * The '<em><b>Plant Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANT_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	PLANT_CONTROL(3, "PlantControl", "PlantControl");

	/**
	 * The '<em><b>Off AGC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off AGC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_AGC
	 * @model name="offAGC"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_AGC_VALUE = 0;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unavailable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @model name="Unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 1;

	/**
	 * The '<em><b>On AGC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On AGC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_AGC
	 * @model name="onAGC"
	 * @generated
	 * @ordered
	 */
	public static final int ON_AGC_VALUE = 2;

	/**
	 * The '<em><b>Plant Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plant Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLANT_CONTROL
	 * @model name="PlantControl"
	 * @generated
	 * @ordered
	 */
	public static final int PLANT_CONTROL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Generator Control Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GeneratorControlSource[] VALUES_ARRAY =
		new GeneratorControlSource[] {
			OFF_AGC,
			UNAVAILABLE,
			ON_AGC,
			PLANT_CONTROL,
		};

	/**
	 * A public read-only list of all the '<em><b>Generator Control Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GeneratorControlSource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generator Control Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorControlSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeneratorControlSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generator Control Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorControlSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GeneratorControlSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generator Control Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorControlSource get(int value) {
		switch (value) {
			case OFF_AGC_VALUE: return OFF_AGC;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
			case ON_AGC_VALUE: return ON_AGC;
			case PLANT_CONTROL_VALUE: return PLANT_CONTROL;
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
	private GeneratorControlSource(int value, String name, String literal) {
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
	
} //GeneratorControlSource
