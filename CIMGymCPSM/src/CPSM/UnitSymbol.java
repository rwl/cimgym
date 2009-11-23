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
 * A representation of the literals of the enumeration '<em><b>Unit Symbol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CPSM.CPSMPackage#getUnitSymbol()
 * @model
 * @generated
 */
public enum UnitSymbol implements Enumerator {
	/**
	 * The '<em><b>Ws</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WS_VALUE
	 * @generated
	 * @ordered
	 */
	WS(0, "W_s", "W_s"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "none", "none"),

	/**
	 * The '<em><b>Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEC_VALUE
	 * @generated
	 * @ordered
	 */
	SEC(2, "sec", "sec"),

	/**
	 * The '<em><b>Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(3, "hour", "hour"),

	/**
	 * The '<em><b>Js</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JS_VALUE
	 * @generated
	 * @ordered
	 */
	JS(4, "J_s", "J_s"),

	/**
	 * The '<em><b>VA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(5, "VA", "VA"),

	/**
	 * The '<em><b>Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH_VALUE
	 * @generated
	 * @ordered
	 */
	WH(6, "Wh", "Wh"),

	/**
	 * The '<em><b>Ohm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OHM_VALUE
	 * @generated
	 * @ordered
	 */
	OHM(7, "ohm", "ohm"),

	/**
	 * The '<em><b>M3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M3_VALUE
	 * @generated
	 * @ordered
	 */
	M3(8, "m3", "m3"),

	/**
	 * The '<em><b>Per Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	PER_HZ(9, "perHz", "perHz"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(10, "W", "W"),

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(11, "min", "min"),

	/**
	 * The '<em><b>Rad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAD_VALUE
	 * @generated
	 * @ordered
	 */
	RAD(12, "rad", "rad"),

	/**
	 * The '<em><b>G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G_VALUE
	 * @generated
	 * @ordered
	 */
	G(13, "g", "g"),

	/**
	 * The '<em><b>J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #J_VALUE
	 * @generated
	 * @ordered
	 */
	J(14, "J", "J"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(15, "H", "H"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(16, "F", "F"),

	/**
	 * The '<em><b>Kg J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KG_J_VALUE
	 * @generated
	 * @ordered
	 */
	KG_J(17, "kg_J", "kg_J"),

	/**
	 * The '<em><b>VAh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAH_VALUE
	 * @generated
	 * @ordered
	 */
	VAH(18, "VAh", "VAh"),

	/**
	 * The '<em><b>Per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	PER_S(19, "per_s", "per_s"),

	/**
	 * The '<em><b>Deg C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEG_C_VALUE
	 * @generated
	 * @ordered
	 */
	DEG_C(20, "degC", "degC"),

	/**
	 * The '<em><b>Deg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEG_VALUE
	 * @generated
	 * @ordered
	 */
	DEG(21, "deg", "deg"),

	/**
	 * The '<em><b>Pa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA_VALUE
	 * @generated
	 * @ordered
	 */
	PA(22, "Pa", "Pa"),

	/**
	 * The '<em><b>VAr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_VALUE
	 * @generated
	 * @ordered
	 */
	VAR(23, "VAr", "VAr"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(24, "S", "S"),

	/**
	 * The '<em><b>WHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHZ_VALUE
	 * @generated
	 * @ordered
	 */
	WHZ(25, "W_Hz", "W_Hz"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(26, "m", "m"),

	/**
	 * The '<em><b>M2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M2_VALUE
	 * @generated
	 * @ordered
	 */
	M2(27, "m2", "m2"),

	/**
	 * The '<em><b>Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HZ(28, "Hz", "Hz"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(29, "A", "A"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(30, "N", "N"),

	/**
	 * The '<em><b>VVAr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VVAR_VALUE
	 * @generated
	 * @ordered
	 */
	VVAR(31, "V_VAr", "V_VAr"),

	/**
	 * The '<em><b>VArh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARH_VALUE
	 * @generated
	 * @ordered
	 */
	VARH(32, "VArh", "VArh"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(33, "V", "V");

	/**
	 * The '<em><b>Ws</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ws</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WS
	 * @model name="W_s"
	 * @generated
	 * @ordered
	 */
	public static final int WS_VALUE = 0;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEC
	 * @model name="sec"
	 * @generated
	 * @ordered
	 */
	public static final int SEC_VALUE = 2;

	/**
	 * The '<em><b>Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model name="hour"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 3;

	/**
	 * The '<em><b>Js</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Js</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JS
	 * @model name="J_s"
	 * @generated
	 * @ordered
	 */
	public static final int JS_VALUE = 4;

	/**
	 * The '<em><b>VA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 5;

	/**
	 * The '<em><b>Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WH
	 * @model name="Wh"
	 * @generated
	 * @ordered
	 */
	public static final int WH_VALUE = 6;

	/**
	 * The '<em><b>Ohm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ohm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OHM
	 * @model name="ohm"
	 * @generated
	 * @ordered
	 */
	public static final int OHM_VALUE = 7;

	/**
	 * The '<em><b>M3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M3
	 * @model name="m3"
	 * @generated
	 * @ordered
	 */
	public static final int M3_VALUE = 8;

	/**
	 * The '<em><b>Per Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per Hz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_HZ
	 * @model name="perHz"
	 * @generated
	 * @ordered
	 */
	public static final int PER_HZ_VALUE = 9;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>W</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 10;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 11;

	/**
	 * The '<em><b>Rad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAD
	 * @model name="rad"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_VALUE = 12;

	/**
	 * The '<em><b>G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #G
	 * @model name="g"
	 * @generated
	 * @ordered
	 */
	public static final int G_VALUE = 13;

	/**
	 * The '<em><b>J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #J
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int J_VALUE = 14;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 15;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 16;

	/**
	 * The '<em><b>Kg J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kg J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KG_J
	 * @model name="kg_J"
	 * @generated
	 * @ordered
	 */
	public static final int KG_J_VALUE = 17;

	/**
	 * The '<em><b>VAh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAH
	 * @model name="VAh"
	 * @generated
	 * @ordered
	 */
	public static final int VAH_VALUE = 18;

	/**
	 * The '<em><b>Per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_S
	 * @model name="per_s"
	 * @generated
	 * @ordered
	 */
	public static final int PER_S_VALUE = 19;

	/**
	 * The '<em><b>Deg C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deg C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEG_C
	 * @model name="degC"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_C_VALUE = 20;

	/**
	 * The '<em><b>Deg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEG
	 * @model name="deg"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_VALUE = 21;

	/**
	 * The '<em><b>Pa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PA
	 * @model name="Pa"
	 * @generated
	 * @ordered
	 */
	public static final int PA_VALUE = 22;

	/**
	 * The '<em><b>VAr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAR
	 * @model name="VAr"
	 * @generated
	 * @ordered
	 */
	public static final int VAR_VALUE = 23;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 24;

	/**
	 * The '<em><b>WHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHZ
	 * @model name="W_Hz"
	 * @generated
	 * @ordered
	 */
	public static final int WHZ_VALUE = 25;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 26;

	/**
	 * The '<em><b>M2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M2
	 * @model name="m2"
	 * @generated
	 * @ordered
	 */
	public static final int M2_VALUE = 27;

	/**
	 * The '<em><b>Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HZ
	 * @model name="Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HZ_VALUE = 28;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 29;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 30;

	/**
	 * The '<em><b>VVAr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VVAr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VVAR
	 * @model name="V_VAr"
	 * @generated
	 * @ordered
	 */
	public static final int VVAR_VALUE = 31;

	/**
	 * The '<em><b>VArh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VArh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARH
	 * @model name="VArh"
	 * @generated
	 * @ordered
	 */
	public static final int VARH_VALUE = 32;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 33;

	/**
	 * An array of all the '<em><b>Unit Symbol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitSymbol[] VALUES_ARRAY =
		new UnitSymbol[] {
			WS,
			NONE,
			SEC,
			HOUR,
			JS,
			VA,
			WH,
			OHM,
			M3,
			PER_HZ,
			W,
			MIN,
			RAD,
			G,
			J,
			H,
			F,
			KG_J,
			VAH,
			PER_S,
			DEG_C,
			DEG,
			PA,
			VAR,
			S,
			WHZ,
			M,
			M2,
			HZ,
			A,
			N,
			VVAR,
			VARH,
			V,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Symbol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitSymbol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitSymbol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitSymbol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitSymbol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitSymbol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitSymbol get(int value) {
		switch (value) {
			case WS_VALUE: return WS;
			case NONE_VALUE: return NONE;
			case SEC_VALUE: return SEC;
			case HOUR_VALUE: return HOUR;
			case JS_VALUE: return JS;
			case VA_VALUE: return VA;
			case WH_VALUE: return WH;
			case OHM_VALUE: return OHM;
			case M3_VALUE: return M3;
			case PER_HZ_VALUE: return PER_HZ;
			case W_VALUE: return W;
			case MIN_VALUE: return MIN;
			case RAD_VALUE: return RAD;
			case G_VALUE: return G;
			case J_VALUE: return J;
			case H_VALUE: return H;
			case F_VALUE: return F;
			case KG_J_VALUE: return KG_J;
			case VAH_VALUE: return VAH;
			case PER_S_VALUE: return PER_S;
			case DEG_C_VALUE: return DEG_C;
			case DEG_VALUE: return DEG;
			case PA_VALUE: return PA;
			case VAR_VALUE: return VAR;
			case S_VALUE: return S;
			case WHZ_VALUE: return WHZ;
			case M_VALUE: return M;
			case M2_VALUE: return M2;
			case HZ_VALUE: return HZ;
			case A_VALUE: return A;
			case N_VALUE: return N;
			case VVAR_VALUE: return VVAR;
			case VARH_VALUE: return VARH;
			case V_VALUE: return V;
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
	private UnitSymbol(int value, String name, String literal) {
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
	
} //UnitSymbol
