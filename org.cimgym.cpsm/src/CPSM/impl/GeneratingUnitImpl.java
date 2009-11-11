/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.ControlAreaGeneratingUnit;
import CPSM.GeneratingUnit;
import CPSM.GeneratorControlSource;
import CPSM.GrossToNetActivePowerCurve;
import CPSM.SynchronousMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getNormalPF <em>Normal PF</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getContains_SynchronousMachines <em>Contains Synchronous Machines</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link CPSM.impl.GeneratingUnitImpl#getMinOperatingP <em>Min Operating P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratingUnitImpl extends EquipmentImpl implements GeneratingUnit {
	/**
	 * The default value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected double maxOperatingP = MAX_OPERATING_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected float normalPF = NORMAL_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_GROSS_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected double ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_GROSS_MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected double ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorControlSource GEN_CONTROL_SOURCE_EDEFAULT = GeneratorControlSource.OFF_AGC;

	/**
	 * The cached value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected GeneratorControlSource genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_NET_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected double ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected static final float LONG_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected float longPF = LONG_PF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContains_SynchronousMachines() <em>Contains Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_SynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> contains_SynchronousMachines;

	/**
	 * The cached value of the '{@link #getGrossToNetActivePowerCurves() <em>Gross To Net Active Power Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossToNetActivePowerCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<GrossToNetActivePowerCurve> grossToNetActivePowerCurves;

	/**
	 * The default value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected double initialP = INITIAL_P_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaGeneratingUnit> controlAreaGeneratingUnit;

	/**
	 * The default value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected float shortPF = SHORT_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected double minOperatingP = MIN_OPERATING_P_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.GENERATING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxOperatingP() {
		return maxOperatingP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOperatingP(double newMaxOperatingP) {
		double oldMaxOperatingP = maxOperatingP;
		maxOperatingP = newMaxOperatingP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__MAX_OPERATING_P, oldMaxOperatingP, maxOperatingP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalPF() {
		return normalPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalPF(float newNormalPF) {
		float oldNormalPF = normalPF;
		normalPF = newNormalPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__NORMAL_PF, oldNormalPF, normalPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedGrossMaxP() {
		return ratedGrossMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedGrossMaxP(double newRatedGrossMaxP) {
		double oldRatedGrossMaxP = ratedGrossMaxP;
		ratedGrossMaxP = newRatedGrossMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__RATED_GROSS_MAX_P, oldRatedGrossMaxP, ratedGrossMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedGrossMinP() {
		return ratedGrossMinP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedGrossMinP(double newRatedGrossMinP) {
		double oldRatedGrossMinP = ratedGrossMinP;
		ratedGrossMinP = newRatedGrossMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__RATED_GROSS_MIN_P, oldRatedGrossMinP, ratedGrossMinP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlSource getGenControlSource() {
		return genControlSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenControlSource(GeneratorControlSource newGenControlSource) {
		GeneratorControlSource oldGenControlSource = genControlSource;
		genControlSource = newGenControlSource == null ? GEN_CONTROL_SOURCE_EDEFAULT : newGenControlSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE, oldGenControlSource, genControlSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedNetMaxP() {
		return ratedNetMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedNetMaxP(double newRatedNetMaxP) {
		double oldRatedNetMaxP = ratedNetMaxP;
		ratedNetMaxP = newRatedNetMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__RATED_NET_MAX_P, oldRatedNetMaxP, ratedNetMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongPF() {
		return longPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongPF(float newLongPF) {
		float oldLongPF = longPF;
		longPF = newLongPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__LONG_PF, oldLongPF, longPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronousMachine> getContains_SynchronousMachines() {
		if (contains_SynchronousMachines == null) {
			contains_SynchronousMachines = new EObjectWithInverseResolvingEList<SynchronousMachine>(SynchronousMachine.class, this, CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES, CPSMPackage.SYNCHRONOUS_MACHINE__MEMBER_OF_GENERATING_UNIT);
		}
		return contains_SynchronousMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
		if (grossToNetActivePowerCurves == null) {
			grossToNetActivePowerCurves = new EObjectWithInverseResolvingEList<GrossToNetActivePowerCurve>(GrossToNetActivePowerCurve.class, this, CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES, CPSMPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT);
		}
		return grossToNetActivePowerCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialP() {
		return initialP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialP(double newInitialP) {
		double oldInitialP = initialP;
		initialP = newInitialP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__INITIAL_P, oldInitialP, initialP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit == null) {
			controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList<ControlAreaGeneratingUnit>(ControlAreaGeneratingUnit.class, this, CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, CPSMPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT);
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShortPF() {
		return shortPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortPF(float newShortPF) {
		float oldShortPF = shortPF;
		shortPF = newShortPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__SHORT_PF, oldShortPF, shortPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinOperatingP() {
		return minOperatingP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOperatingP(double newMinOperatingP) {
		double oldMinOperatingP = minOperatingP;
		minOperatingP = newMinOperatingP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CPSMPackage.GENERATING_UNIT__MIN_OPERATING_P, oldMinOperatingP, minOperatingP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains_SynchronousMachines()).basicAdd(otherEnd, msgs);
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGrossToNetActivePowerCurves()).basicAdd(otherEnd, msgs);
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaGeneratingUnit()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getContains_SynchronousMachines()).basicRemove(otherEnd, msgs);
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<?>)getGrossToNetActivePowerCurves()).basicRemove(otherEnd, msgs);
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<?>)getControlAreaGeneratingUnit()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return getMaxOperatingP();
			case CPSMPackage.GENERATING_UNIT__NORMAL_PF:
				return getNormalPF();
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return getRatedGrossMaxP();
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return getRatedGrossMinP();
			case CPSMPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return getGenControlSource();
			case CPSMPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return getRatedNetMaxP();
			case CPSMPackage.GENERATING_UNIT__LONG_PF:
				return getLongPF();
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				return getContains_SynchronousMachines();
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return getGrossToNetActivePowerCurves();
			case CPSMPackage.GENERATING_UNIT__INITIAL_P:
				return getInitialP();
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return getControlAreaGeneratingUnit();
			case CPSMPackage.GENERATING_UNIT__SHORT_PF:
				return getShortPF();
			case CPSMPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return getMinOperatingP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__MAX_OPERATING_P:
				setMaxOperatingP((Double)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__NORMAL_PF:
				setNormalPF((Float)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				setRatedGrossMaxP((Double)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				setRatedGrossMinP((Double)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				setGenControlSource((GeneratorControlSource)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				setRatedNetMaxP((Double)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__LONG_PF:
				setLongPF((Float)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				getContains_SynchronousMachines().clear();
				getContains_SynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				getGrossToNetActivePowerCurves().addAll((Collection<? extends GrossToNetActivePowerCurve>)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__INITIAL_P:
				setInitialP((Double)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				getControlAreaGeneratingUnit().addAll((Collection<? extends ControlAreaGeneratingUnit>)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__SHORT_PF:
				setShortPF((Float)newValue);
				return;
			case CPSMPackage.GENERATING_UNIT__MIN_OPERATING_P:
				setMinOperatingP((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__MAX_OPERATING_P:
				setMaxOperatingP(MAX_OPERATING_P_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__NORMAL_PF:
				setNormalPF(NORMAL_PF_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				setRatedGrossMaxP(RATED_GROSS_MAX_P_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				setRatedGrossMinP(RATED_GROSS_MIN_P_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				setGenControlSource(GEN_CONTROL_SOURCE_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				setRatedNetMaxP(RATED_NET_MAX_P_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__LONG_PF:
				setLongPF(LONG_PF_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				getContains_SynchronousMachines().clear();
				return;
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				return;
			case CPSMPackage.GENERATING_UNIT__INITIAL_P:
				setInitialP(INITIAL_P_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				return;
			case CPSMPackage.GENERATING_UNIT__SHORT_PF:
				setShortPF(SHORT_PF_EDEFAULT);
				return;
			case CPSMPackage.GENERATING_UNIT__MIN_OPERATING_P:
				setMinOperatingP(MIN_OPERATING_P_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CPSMPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return maxOperatingP != MAX_OPERATING_P_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__NORMAL_PF:
				return normalPF != NORMAL_PF_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return ratedGrossMaxP != RATED_GROSS_MAX_P_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return ratedGrossMinP != RATED_GROSS_MIN_P_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return genControlSource != GEN_CONTROL_SOURCE_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return ratedNetMaxP != RATED_NET_MAX_P_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__LONG_PF:
				return longPF != LONG_PF_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__CONTAINS_SYNCHRONOUS_MACHINES:
				return contains_SynchronousMachines != null && !contains_SynchronousMachines.isEmpty();
			case CPSMPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return grossToNetActivePowerCurves != null && !grossToNetActivePowerCurves.isEmpty();
			case CPSMPackage.GENERATING_UNIT__INITIAL_P:
				return initialP != INITIAL_P_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null && !controlAreaGeneratingUnit.isEmpty();
			case CPSMPackage.GENERATING_UNIT__SHORT_PF:
				return shortPF != SHORT_PF_EDEFAULT;
			case CPSMPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return minOperatingP != MIN_OPERATING_P_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxOperatingP: ");
		result.append(maxOperatingP);
		result.append(", normalPF: ");
		result.append(normalPF);
		result.append(", ratedGrossMaxP: ");
		result.append(ratedGrossMaxP);
		result.append(", ratedGrossMinP: ");
		result.append(ratedGrossMinP);
		result.append(", genControlSource: ");
		result.append(genControlSource);
		result.append(", ratedNetMaxP: ");
		result.append(ratedNetMaxP);
		result.append(", longPF: ");
		result.append(longPF);
		result.append(", initialP: ");
		result.append(initialP);
		result.append(", shortPF: ");
		result.append(shortPF);
		result.append(", minOperatingP: ");
		result.append(minOperatingP);
		result.append(')');
		return result.toString();
	}

} //GeneratingUnitImpl
