/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package qvttemplate;

import emof.EmofPackage;

import essentialocl.EssentialoclPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see qvttemplate.QvttemplateFactory
 * @model kind="package"
 * @generated
 */
public interface QvttemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvttemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.schema.omg.org/spec/QVT/1.0/qvttemplate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvttemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvttemplatePackage eINSTANCE = qvttemplate.impl.QvttemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link qvttemplate.impl.TemplateExpImpl <em>Template Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvttemplate.impl.TemplateExpImpl
	 * @see qvttemplate.impl.QvttemplatePackageImpl#getTemplateExp()
	 * @generated
	 */
	int TEMPLATE_EXP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__TAG = EssentialoclPackage.LITERAL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__OWNED_COMMENT = EssentialoclPackage.LITERAL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__NAME = EssentialoclPackage.LITERAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__TYPE = EssentialoclPackage.LITERAL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__BINDS_TO = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP__WHERE = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EXP_FEATURE_COUNT = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link qvttemplate.impl.ObjectTemplateExpImpl <em>Object Template Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvttemplate.impl.ObjectTemplateExpImpl
	 * @see qvttemplate.impl.QvttemplatePackageImpl#getObjectTemplateExp()
	 * @generated
	 */
	int OBJECT_TEMPLATE_EXP = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__TAG = TEMPLATE_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__OWNED_COMMENT = TEMPLATE_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__NAME = TEMPLATE_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__TYPE = TEMPLATE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__BINDS_TO = TEMPLATE_EXP__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__WHERE = TEMPLATE_EXP__WHERE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__PART = TEMPLATE_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP__REFERRED_CLASS = TEMPLATE_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Template Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_EXP_FEATURE_COUNT = TEMPLATE_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link qvttemplate.impl.CollectionTemplateExpImpl <em>Collection Template Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvttemplate.impl.CollectionTemplateExpImpl
	 * @see qvttemplate.impl.QvttemplatePackageImpl#getCollectionTemplateExp()
	 * @generated
	 */
	int COLLECTION_TEMPLATE_EXP = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__TAG = TEMPLATE_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__OWNED_COMMENT = TEMPLATE_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__NAME = TEMPLATE_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__TYPE = TEMPLATE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__BINDS_TO = TEMPLATE_EXP__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__WHERE = TEMPLATE_EXP__WHERE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__MEMBER = TEMPLATE_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__KIND = TEMPLATE_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referred Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE = TEMPLATE_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP__REST = TEMPLATE_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Collection Template Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TEMPLATE_EXP_FEATURE_COUNT = TEMPLATE_EXP_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link qvttemplate.impl.PropertyTemplateItemImpl <em>Property Template Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qvttemplate.impl.PropertyTemplateItemImpl
	 * @see qvttemplate.impl.QvttemplatePackageImpl#getPropertyTemplateItem()
	 * @generated
	 */
	int PROPERTY_TEMPLATE_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Obj Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Template Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TEMPLATE_ITEM_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link qvttemplate.TemplateExp <em>Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Exp</em>'.
	 * @see qvttemplate.TemplateExp
	 * @generated
	 */
	EClass getTemplateExp();

	/**
	 * Returns the meta object for the reference '{@link qvttemplate.TemplateExp#getBindsTo <em>Binds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binds To</em>'.
	 * @see qvttemplate.TemplateExp#getBindsTo()
	 * @see #getTemplateExp()
	 * @generated
	 */
	EReference getTemplateExp_BindsTo();

	/**
	 * Returns the meta object for the containment reference '{@link qvttemplate.TemplateExp#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see qvttemplate.TemplateExp#getWhere()
	 * @see #getTemplateExp()
	 * @generated
	 */
	EReference getTemplateExp_Where();

	/**
	 * Returns the meta object for class '{@link qvttemplate.ObjectTemplateExp <em>Object Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Template Exp</em>'.
	 * @see qvttemplate.ObjectTemplateExp
	 * @generated
	 */
	EClass getObjectTemplateExp();

	/**
	 * Returns the meta object for the containment reference list '{@link qvttemplate.ObjectTemplateExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see qvttemplate.ObjectTemplateExp#getPart()
	 * @see #getObjectTemplateExp()
	 * @generated
	 */
	EReference getObjectTemplateExp_Part();

	/**
	 * Returns the meta object for the reference '{@link qvttemplate.ObjectTemplateExp#getReferredClass <em>Referred Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Class</em>'.
	 * @see qvttemplate.ObjectTemplateExp#getReferredClass()
	 * @see #getObjectTemplateExp()
	 * @generated
	 */
	EReference getObjectTemplateExp_ReferredClass();

	/**
	 * Returns the meta object for class '{@link qvttemplate.CollectionTemplateExp <em>Collection Template Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Template Exp</em>'.
	 * @see qvttemplate.CollectionTemplateExp
	 * @generated
	 */
	EClass getCollectionTemplateExp();

	/**
	 * Returns the meta object for the containment reference list '{@link qvttemplate.CollectionTemplateExp#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see qvttemplate.CollectionTemplateExp#getMember()
	 * @see #getCollectionTemplateExp()
	 * @generated
	 */
	EReference getCollectionTemplateExp_Member();

	/**
	 * Returns the meta object for the attribute '{@link qvttemplate.CollectionTemplateExp#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see qvttemplate.CollectionTemplateExp#getKind()
	 * @see #getCollectionTemplateExp()
	 * @generated
	 */
	EAttribute getCollectionTemplateExp_Kind();

	/**
	 * Returns the meta object for the reference '{@link qvttemplate.CollectionTemplateExp#getReferredCollectionType <em>Referred Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Collection Type</em>'.
	 * @see qvttemplate.CollectionTemplateExp#getReferredCollectionType()
	 * @see #getCollectionTemplateExp()
	 * @generated
	 */
	EReference getCollectionTemplateExp_ReferredCollectionType();

	/**
	 * Returns the meta object for the reference '{@link qvttemplate.CollectionTemplateExp#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rest</em>'.
	 * @see qvttemplate.CollectionTemplateExp#getRest()
	 * @see #getCollectionTemplateExp()
	 * @generated
	 */
	EReference getCollectionTemplateExp_Rest();

	/**
	 * Returns the meta object for class '{@link qvttemplate.PropertyTemplateItem <em>Property Template Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Template Item</em>'.
	 * @see qvttemplate.PropertyTemplateItem
	 * @generated
	 */
	EClass getPropertyTemplateItem();

	/**
	 * Returns the meta object for the container reference '{@link qvttemplate.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Obj Container</em>'.
	 * @see qvttemplate.PropertyTemplateItem#getObjContainer()
	 * @see #getPropertyTemplateItem()
	 * @generated
	 */
	EReference getPropertyTemplateItem_ObjContainer();

	/**
	 * Returns the meta object for the containment reference '{@link qvttemplate.PropertyTemplateItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see qvttemplate.PropertyTemplateItem#getValue()
	 * @see #getPropertyTemplateItem()
	 * @generated
	 */
	EReference getPropertyTemplateItem_Value();

	/**
	 * Returns the meta object for the reference '{@link qvttemplate.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Property</em>'.
	 * @see qvttemplate.PropertyTemplateItem#getReferredProperty()
	 * @see #getPropertyTemplateItem()
	 * @generated
	 */
	EReference getPropertyTemplateItem_ReferredProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvttemplateFactory getQvttemplateFactory();

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
		 * The meta object literal for the '{@link qvttemplate.impl.TemplateExpImpl <em>Template Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvttemplate.impl.TemplateExpImpl
		 * @see qvttemplate.impl.QvttemplatePackageImpl#getTemplateExp()
		 * @generated
		 */
		EClass TEMPLATE_EXP = eINSTANCE.getTemplateExp();

		/**
		 * The meta object literal for the '<em><b>Binds To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXP__BINDS_TO = eINSTANCE.getTemplateExp_BindsTo();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EXP__WHERE = eINSTANCE.getTemplateExp_Where();

		/**
		 * The meta object literal for the '{@link qvttemplate.impl.ObjectTemplateExpImpl <em>Object Template Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvttemplate.impl.ObjectTemplateExpImpl
		 * @see qvttemplate.impl.QvttemplatePackageImpl#getObjectTemplateExp()
		 * @generated
		 */
		EClass OBJECT_TEMPLATE_EXP = eINSTANCE.getObjectTemplateExp();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE_EXP__PART = eINSTANCE.getObjectTemplateExp_Part();

		/**
		 * The meta object literal for the '<em><b>Referred Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE_EXP__REFERRED_CLASS = eINSTANCE.getObjectTemplateExp_ReferredClass();

		/**
		 * The meta object literal for the '{@link qvttemplate.impl.CollectionTemplateExpImpl <em>Collection Template Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvttemplate.impl.CollectionTemplateExpImpl
		 * @see qvttemplate.impl.QvttemplatePackageImpl#getCollectionTemplateExp()
		 * @generated
		 */
		EClass COLLECTION_TEMPLATE_EXP = eINSTANCE.getCollectionTemplateExp();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TEMPLATE_EXP__MEMBER = eINSTANCE.getCollectionTemplateExp_Member();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TEMPLATE_EXP__KIND = eINSTANCE.getCollectionTemplateExp_Kind();

		/**
		 * The meta object literal for the '<em><b>Referred Collection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE = eINSTANCE.getCollectionTemplateExp_ReferredCollectionType();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TEMPLATE_EXP__REST = eINSTANCE.getCollectionTemplateExp_Rest();

		/**
		 * The meta object literal for the '{@link qvttemplate.impl.PropertyTemplateItemImpl <em>Property Template Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qvttemplate.impl.PropertyTemplateItemImpl
		 * @see qvttemplate.impl.QvttemplatePackageImpl#getPropertyTemplateItem()
		 * @generated
		 */
		EClass PROPERTY_TEMPLATE_ITEM = eINSTANCE.getPropertyTemplateItem();

		/**
		 * The meta object literal for the '<em><b>Obj Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER = eINSTANCE.getPropertyTemplateItem_ObjContainer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TEMPLATE_ITEM__VALUE = eINSTANCE.getPropertyTemplateItem_Value();

		/**
		 * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY = eINSTANCE.getPropertyTemplateItem_ReferredProperty();

	}

} //QvttemplatePackage
