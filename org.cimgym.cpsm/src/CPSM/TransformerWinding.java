/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.TransformerWinding#getWindingType <em>Winding Type</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getTapChangers <em>Tap Changers</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getX <em>X</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getR <em>R</em>}</li>
 *   <li>{@link CPSM.TransformerWinding#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getTransformerWinding()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A winding is associated with each defined terminal of a transformer (or phase shifter).'"
 * @generated
 */
public interface TransformerWinding extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Winding Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.WindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Type</em>' attribute.
	 * @see CPSM.WindingType
	 * @see #setWindingType(WindingType)
	 * @see CPSM.CPSMPackage#getTransformerWinding_WindingType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The type of winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of winding.'"
	 * @generated
	 */
	WindingType getWindingType();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getWindingType <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Type</em>' attribute.
	 * @see CPSM.WindingType
	 * @see #getWindingType()
	 * @generated
	 */
	void setWindingType(WindingType value);

	/**
	 * Returns the value of the '<em><b>Tap Changers</b></em>' reference list.
	 * The list contents are of type {@link CPSM.TapChanger}.
	 * It is bidirectional and its opposite is '{@link CPSM.TapChanger#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changers</em>' reference list.
	 * @see CPSM.CPSMPackage#getTransformerWinding_TapChangers()
	 * @see CPSM.TapChanger#getTransformerWinding
	 * @model opposite="TransformerWinding"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A transformer winding may have tap changers, separately for voltage and phase angle.  If a TransformerWinding does not have an associated TapChanger, the winding is assumed to be fixed tap.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer winding may have tap changers, separately for voltage and phase angle.  If a TransformerWinding does not have an associated TapChanger, the winding is assumed to be fixed tap.' Profile\040documentation=''"
	 * @generated
	 */
	EList<TapChanger> getTapChangers();

	/**
	 * Returns the value of the '<em><b>Member Of Power Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.PowerTransformer#getContains_TransformerWindings <em>Contains Transformer Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Power Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Power Transformer</em>' reference.
	 * @see #setMemberOf_PowerTransformer(PowerTransformer)
	 * @see CPSM.CPSMPackage#getTransformerWinding_MemberOf_PowerTransformer()
	 * @see CPSM.PowerTransformer#getContains_TransformerWindings
	 * @model opposite="Contains_TransformerWindings" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A transformer has windings'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer has windings'"
	 * @generated
	 */
	PowerTransformer getMemberOf_PowerTransformer();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Of Power Transformer</em>' reference.
	 * @see #getMemberOf_PowerTransformer()
	 * @generated
	 */
	void setMemberOf_PowerTransformer(PowerTransformer value);

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #setRatedS(double)
	 * @see CPSM.CPSMPackage#getTransformerWinding_RatedS()
	 * @model dataType="CPSM.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The normal apparent power rating for the winding'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The normal apparent power rating for the winding'"
	 * @generated
	 */
	double getRatedS();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #getRatedS()
	 * @generated
	 */
	void setRatedS(double value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see CPSM.CPSMPackage#getTransformerWinding_X()
	 * @model dataType="CPSM.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series reactance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series reactance of the winding.'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #setRatedU(double)
	 * @see CPSM.CPSMPackage#getTransformerWinding_RatedU()
	 * @model dataType="CPSM.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The rated voltage (phase-to-phase) of the winding, usually the same as the neutral voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The rated voltage (phase-to-phase) of the winding, usually the same as the neutral voltage.'"
	 * @generated
	 */
	double getRatedU();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #getRatedU()
	 * @generated
	 */
	void setRatedU(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see CPSM.CPSMPackage#getTransformerWinding_R()
	 * @model dataType="CPSM.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Positive sequence series resistance of the winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence series resistance of the winding.'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(double)
	 * @see CPSM.CPSMPackage#getTransformerWinding_B()
	 * @model dataType="CPSM.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Magnetizing branch susceptance (B mag).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Magnetizing branch susceptance (B mag).'"
	 * @generated
	 */
	double getB();

	/**
	 * Sets the value of the '{@link CPSM.TransformerWinding#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

} // TransformerWinding
