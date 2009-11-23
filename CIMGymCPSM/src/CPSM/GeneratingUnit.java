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
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getNormalPF <em>Normal PF</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getContains_SynchronousMachines <em>Contains Synchronous Machines</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link CPSM.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.'"
 * @generated
 */
public interface GeneratingUnit extends Equipment {
	/**
	 * Returns the value of the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Operating P</em>' attribute.
	 * @see #setMaxOperatingP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_MaxOperatingP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='This is the maximum operating active power limit the dispatcher can enter for this unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the maximum operating active power limit the dispatcher can enter for this unit'"
	 * @generated
	 */
	double getMaxOperatingP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Operating P</em>' attribute.
	 * @see #getMaxOperatingP()
	 * @generated
	 */
	void setMaxOperatingP(double value);

	/**
	 * Returns the value of the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal PF</em>' attribute.
	 * @see #setNormalPF(float)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_NormalPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getNormalPF();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal PF</em>' attribute.
	 * @see #getNormalPF()
	 * @generated
	 */
	void setNormalPF(float value);

	/**
	 * Returns the value of the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #setRatedGrossMaxP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_RatedGrossMaxP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The unit\'s gross rated maximum capacity (Book Value).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s gross rated maximum capacity (Book Value).'"
	 * @generated
	 */
	double getRatedGrossMaxP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #getRatedGrossMaxP()
	 * @generated
	 */
	void setRatedGrossMaxP(double value);

	/**
	 * Returns the value of the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #setRatedGrossMinP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_RatedGrossMinP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid'"
	 * @generated
	 */
	double getRatedGrossMinP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #getRatedGrossMinP()
	 * @generated
	 */
	void setRatedGrossMinP(double value);

	/**
	 * Returns the value of the '<em><b>Gen Control Source</b></em>' attribute.
	 * The literals are from the enumeration {@link CPSM.GeneratorControlSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Control Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Control Source</em>' attribute.
	 * @see CPSM.GeneratorControlSource
	 * @see #setGenControlSource(GeneratorControlSource)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_GenControlSource()
	 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The source of controls for a generating unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The source of controls for a generating unit.'"
	 * @generated
	 */
	GeneratorControlSource getGenControlSource();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Control Source</em>' attribute.
	 * @see CPSM.GeneratorControlSource
	 * @see #getGenControlSource()
	 * @generated
	 */
	void setGenControlSource(GeneratorControlSource value);

	/**
	 * Returns the value of the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Net Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #setRatedNetMaxP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_RatedNetMaxP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity'"
	 * @generated
	 */
	double getRatedNetMaxP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #getRatedNetMaxP()
	 * @generated
	 */
	void setRatedNetMaxP(double value);

	/**
	 * Returns the value of the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long PF</em>' attribute.
	 * @see #setLongPF(float)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_LongPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getLongPF();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long PF</em>' attribute.
	 * @see #getLongPF()
	 * @generated
	 */
	void setLongPF(float value);

	/**
	 * Returns the value of the '<em><b>Contains Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CPSM.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CPSM.SynchronousMachine#getMemberOf_GeneratingUnit <em>Member Of Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Synchronous Machines</em>' reference list.
	 * @see CPSM.CPSMPackage#getGeneratingUnit_Contains_SynchronousMachines()
	 * @see CPSM.SynchronousMachine#getMemberOf_GeneratingUnit
	 * @model opposite="MemberOf_GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit' Profile\040documentation=''"
	 * @generated
	 */
	EList<SynchronousMachine> getContains_SynchronousMachines();

	/**
	 * Returns the value of the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * The list contents are of type {@link CPSM.GrossToNetActivePowerCurve}.
	 * It is bidirectional and its opposite is '{@link CPSM.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross To Net Active Power Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross To Net Active Power Curves</em>' reference list.
	 * @see CPSM.CPSMPackage#getGeneratingUnit_GrossToNetActivePowerCurves()
	 * @see CPSM.GrossToNetActivePowerCurve#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit' Profile\040documentation=''"
	 * @generated
	 */
	EList<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves();

	/**
	 * Returns the value of the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial P</em>' attribute.
	 * @see #setInitialP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_InitialP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Default Initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Default Initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration'"
	 * @generated
	 */
	double getInitialP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial P</em>' attribute.
	 * @see #getInitialP()
	 * @generated
	 */
	void setInitialP(double value);

	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CPSM.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CPSM.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see CPSM.CPSMPackage#getGeneratingUnit_ControlAreaGeneratingUnit()
	 * @see CPSM.ControlAreaGeneratingUnit#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='ControlArea specifications for this generating unit.'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ControlArea specifications for this generating unit.' Profile\040documentation=''"
	 * @generated
	 */
	EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit();

	/**
	 * Returns the value of the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short PF</em>' attribute.
	 * @see #setShortPF(float)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_ShortPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getShortPF();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short PF</em>' attribute.
	 * @see #getShortPF()
	 * @generated
	 */
	void setShortPF(float value);

	/**
	 * Returns the value of the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Operating P</em>' attribute.
	 * @see #setMinOperatingP(double)
	 * @see CPSM.CPSMPackage#getGeneratingUnit_MinOperatingP()
	 * @model dataType="CPSM.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='This is the minimum operating active power limit the dispatcher can enter for this unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the minimum operating active power limit the dispatcher can enter for this unit.'"
	 * @generated
	 */
	double getMinOperatingP();

	/**
	 * Sets the value of the '{@link CPSM.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Operating P</em>' attribute.
	 * @see #getMinOperatingP()
	 * @generated
	 */
	void setMinOperatingP(double value);

} // GeneratingUnit
