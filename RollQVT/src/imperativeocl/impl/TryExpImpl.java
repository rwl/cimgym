/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl.impl;

import essentialocl.OclExpression;

import imperativeocl.CatchExp;
import imperativeocl.ImperativeoclPackage;
import imperativeocl.TryExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imperativeocl.impl.TryExpImpl#getTryBody <em>Try Body</em>}</li>
 *   <li>{@link imperativeocl.impl.TryExpImpl#getCatchClause <em>Catch Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryExpImpl extends ImperativeExpressionImpl implements TryExp {
	/**
	 * The cached value of the '{@link #getTryBody() <em>Try Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTryBody()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> tryBody;

	/**
	 * The cached value of the '{@link #getCatchClause() <em>Catch Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClause()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchExp> catchClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeoclPackage.Literals.TRY_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getTryBody() {
		if (tryBody == null) {
			tryBody = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, ImperativeoclPackage.TRY_EXP__TRY_BODY);
		}
		return tryBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchExp> getCatchClause() {
		if (catchClause == null) {
			catchClause = new EObjectContainmentEList<CatchExp>(CatchExp.class, this, ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE);
		}
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return ((InternalEList<?>)getTryBody()).basicRemove(otherEnd, msgs);
			case ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE:
				return ((InternalEList<?>)getCatchClause()).basicRemove(otherEnd, msgs);
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
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return getTryBody();
			case ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE:
				return getCatchClause();
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
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				getTryBody().clear();
				getTryBody().addAll((Collection<? extends OclExpression>)newValue);
				return;
			case ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE:
				getCatchClause().clear();
				getCatchClause().addAll((Collection<? extends CatchExp>)newValue);
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
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				getTryBody().clear();
				return;
			case ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE:
				getCatchClause().clear();
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
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return tryBody != null && !tryBody.isEmpty();
			case ImperativeoclPackage.TRY_EXP__CATCH_CLAUSE:
				return catchClause != null && !catchClause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryExpImpl
