/**
 */
package gov.nist.scap.schema.reporting.core._1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.reporting.core._1._1Factory
 * @model kind="package"
 * @generated
 */
public interface _1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://scap.nist.gov/schema/reporting-core/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_1Package eINSTANCE = gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl <em>Relationships Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl
	 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipsContainerType()
	 * @generated
	 */
	int RELATIONSHIPS_CONTAINER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS = 0;

	/**
	 * The number of structural features of the '<em>Relationships Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationships Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_CONTAINER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipsTypeImpl
	 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipsType()
	 * @generated
	 */
	int RELATIONSHIPS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE__RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>Relationships Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationships Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipTypeImpl
	 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__REF = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.reporting.core._1.ScopeType <em>Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Scope Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getScopeTypeObject()
	 * @generated
	 */
	int SCOPE_TYPE_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType <em>Relationships Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Container Type</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType
	 * @generated
	 */
	EClass getRelationshipsContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType#getRelationships()
	 * @see #getRelationshipsContainerType()
	 * @generated
	 */
	EReference getRelationshipsContainerType_Relationships();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsType <em>Relationships Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Type</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsType
	 * @generated
	 */
	EClass getRelationshipsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsType#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsType#getRelationship()
	 * @see #getRelationshipsType()
	 * @generated
	 */
	EReference getRelationshipsType_Relationship();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ref</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType#getRef()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType#getSubject()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType#getType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipType#getAnyAttribute()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.nist.scap.schema.reporting.core._1.ScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.scap.schema.reporting.core._1.ScopeType <em>Scope Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Type Object</em>'.
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @model instanceClass="gov.nist.scap.schema.reporting.core._1.ScopeType"
	 *        extendedMetaData="name='scope_._type:Object' baseType='scope_._type'"
	 * @generated
	 */
	EDataType getScopeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_1Factory get_1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl <em>Relationships Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl
		 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipsContainerType()
		 * @generated
		 */
		EClass RELATIONSHIPS_CONTAINER_TYPE = eINSTANCE.getRelationshipsContainerType();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS = eINSTANCE.getRelationshipsContainerType_Relationships();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipsTypeImpl <em>Relationships Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipsTypeImpl
		 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipsType()
		 * @generated
		 */
		EClass RELATIONSHIPS_TYPE = eINSTANCE.getRelationshipsType();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_TYPE__RELATIONSHIP = eINSTANCE.getRelationshipsType_Relationship();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.reporting.core._1.impl.RelationshipTypeImpl
		 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__REF = eINSTANCE.getRelationshipType_Ref();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__SCOPE = eINSTANCE.getRelationshipType_Scope();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__SUBJECT = eINSTANCE.getRelationshipType_Subject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__TYPE = eINSTANCE.getRelationshipType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRelationshipType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.reporting.core._1.ScopeType <em>Scope Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
		 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getScopeType()
		 * @generated
		 */
		EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

		/**
		 * The meta object literal for the '<em>Scope Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
		 * @see gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl#getScopeTypeObject()
		 * @generated
		 */
		EDataType SCOPE_TYPE_OBJECT = eINSTANCE.getScopeTypeObject();

	}

} //_1Package
