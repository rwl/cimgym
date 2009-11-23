/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvtoperational.impl;

import essentialocl.OclExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.MappingOperation;
import qvtoperational.QvtoperationalPackage;

import qvtrelation.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getDisjunct <em>Disjunct</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getRefinedRelation <em>Refined Relation</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getMerged <em>Merged</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getWhen <em>When</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingOperationImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingOperationImpl extends ImperativeOperationImpl implements MappingOperation {
	/**
	 * The cached value of the '{@link #getDisjunct() <em>Disjunct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunct()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> disjunct;

	/**
	 * The cached value of the '{@link #getRefinedRelation() <em>Refined Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation refinedRelation;

	/**
	 * The cached value of the '{@link #getMerged() <em>Merged</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerged()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> merged;

	/**
	 * The cached value of the '{@link #getInherited() <em>Inherited</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherited()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingOperation> inherited;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> when;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getDisjunct() {
		if (disjunct == null) {
			disjunct = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT);
		}
		return disjunct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRefinedRelation() {
		if (refinedRelation != null && refinedRelation.eIsProxy()) {
			InternalEObject oldRefinedRelation = (InternalEObject)refinedRelation;
			refinedRelation = (Relation)eResolveProxy(oldRefinedRelation);
			if (refinedRelation != oldRefinedRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
			}
		}
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRefinedRelation() {
		return refinedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRelation(Relation newRefinedRelation) {
		Relation oldRefinedRelation = refinedRelation;
		refinedRelation = newRefinedRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION, oldRefinedRelation, refinedRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getMerged() {
		if (merged == null) {
			merged = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__MERGED);
		}
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingOperation> getInherited() {
		if (inherited == null) {
			inherited = new EObjectResolvingEList<MappingOperation>(MappingOperation.class, this, QvtoperationalPackage.MAPPING_OPERATION__INHERITED);
		}
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, QvtoperationalPackage.MAPPING_OPERATION__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getWhere() {
		if (where == null) {
			where = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, QvtoperationalPackage.MAPPING_OPERATION__WHERE);
		}
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return getDisjunct();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				if (resolve) return getRefinedRelation();
				return basicGetRefinedRelation();
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return getMerged();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return getInherited();
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return getWhen();
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return getWhere();
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				getDisjunct().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((Relation)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				getMerged().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				getInherited().addAll((Collection<? extends MappingOperation>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends OclExpression>)newValue);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				getWhere().clear();
				getWhere().addAll((Collection<? extends OclExpression>)newValue);
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				getDisjunct().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				setRefinedRelation((Relation)null);
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				getMerged().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				getInherited().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				getWhen().clear();
				return;
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				getWhere().clear();
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
			case QvtoperationalPackage.MAPPING_OPERATION__DISJUNCT:
				return disjunct != null && !disjunct.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__REFINED_RELATION:
				return refinedRelation != null;
			case QvtoperationalPackage.MAPPING_OPERATION__MERGED:
				return merged != null && !merged.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__INHERITED:
				return inherited != null && !inherited.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__WHEN:
				return when != null && !when.isEmpty();
			case QvtoperationalPackage.MAPPING_OPERATION__WHERE:
				return where != null && !where.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingOperationImpl
