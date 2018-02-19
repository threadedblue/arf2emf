/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * xNL: eXtensible Name Language
 * Original Date of Creation: 26 March 2001
 * Copyright(c) 2002, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * Version: 2.0 - Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: V1.1
 * <!-- end-model-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Factory
 * @model kind="package"
 * @generated
 */
public interface _0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ciq:xsdschema:xNL:2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Package eINSTANCE = oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AddresseeIndicatorTypeImpl <em>Addressee Indicator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AddresseeIndicatorTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getAddresseeIndicatorType()
	 * @generated
	 */
	int ADDRESSEE_INDICATOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSEE_INDICATOR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSEE_INDICATOR_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSEE_INDICATOR_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Addressee Indicator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSEE_INDICATOR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Addressee Indicator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSEE_INDICATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AliasTypeImpl <em>Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AliasTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getAliasType()
	 * @generated
	 */
	int ALIAS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl <em>Name Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameDetails()
	 * @generated
	 */
	int NAME_DETAILS = 13;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__NAME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__PERSON_NAME = 1;

	/**
	 * The feature id for the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__JOINT_PERSON_NAME = 2;

	/**
	 * The feature id for the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__ORGANISATION_NAME_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__CODE = 4;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__PARTY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Name Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Name Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl <em>Dependency Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getDependencyNameType()
	 * @generated
	 */
	int DEPENDENCY_NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__NAME_LINE = NAME_DETAILS__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__PERSON_NAME = NAME_DETAILS__PERSON_NAME;

	/**
	 * The feature id for the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__JOINT_PERSON_NAME = NAME_DETAILS__JOINT_PERSON_NAME;

	/**
	 * The feature id for the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__ORGANISATION_NAME_DETAILS = NAME_DETAILS__ORGANISATION_NAME_DETAILS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__CODE = NAME_DETAILS__CODE;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__PARTY_TYPE = NAME_DETAILS__PARTY_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__ANY_ATTRIBUTE = NAME_DETAILS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__ANY = NAME_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE = NAME_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF = NAME_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dependency Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE_FEATURE_COUNT = NAME_DETAILS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dependency Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_NAME_TYPE_OPERATION_COUNT = NAME_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOINT_PERSON_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME_DETAILS = 5;

	/**
	 * The feature id for the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS = 6;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON_NAME = 7;

	/**
	 * The feature id for the '<em><b>XNL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XNL = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FirstNameTypeImpl <em>First Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FirstNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFirstNameType()
	 * @generated
	 */
	int FIRST_NAME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>First Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>First Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl <em>Person Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPersonName()
	 * @generated
	 */
	int PERSON_NAME = 24;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__NAME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Preceding Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__PRECEDING_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__TITLE = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__FIRST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__MIDDLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__NAME_PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__LAST_NAME = 6;

	/**
	 * The feature id for the '<em><b>Other Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__OTHER_NAME = 7;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__ALIAS = 8;

	/**
	 * The feature id for the '<em><b>Generation Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__GENERATION_IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__SUFFIX = 10;

	/**
	 * The feature id for the '<em><b>General Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__GENERAL_SUFFIX = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__CODE = 12;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__NAME_DETAILS_KEY_REF = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__TYPE = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Person Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Person Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FormerNameTypeImpl <em>Former Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FormerNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFormerNameType()
	 * @generated
	 */
	int FORMER_NAME_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__NAME_LINE = PERSON_NAME__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Preceding Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__PRECEDING_TITLE = PERSON_NAME__PRECEDING_TITLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__TITLE = PERSON_NAME__TITLE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__FIRST_NAME = PERSON_NAME__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__MIDDLE_NAME = PERSON_NAME__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>Name Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__NAME_PREFIX = PERSON_NAME__NAME_PREFIX;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__LAST_NAME = PERSON_NAME__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Other Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__OTHER_NAME = PERSON_NAME__OTHER_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__ALIAS = PERSON_NAME__ALIAS;

	/**
	 * The feature id for the '<em><b>Generation Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__GENERATION_IDENTIFIER = PERSON_NAME__GENERATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__SUFFIX = PERSON_NAME__SUFFIX;

	/**
	 * The feature id for the '<em><b>General Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__GENERAL_SUFFIX = PERSON_NAME__GENERAL_SUFFIX;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__CODE = PERSON_NAME__CODE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__NAME_DETAILS_KEY_REF = PERSON_NAME__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__TYPE = PERSON_NAME__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__ANY_ATTRIBUTE = PERSON_NAME__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__ANY = PERSON_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__VALID_FROM = PERSON_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE__VALID_TO = PERSON_NAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Former Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE_FEATURE_COUNT = PERSON_NAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Former Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMER_NAME_TYPE_OPERATION_COUNT = PERSON_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FunctionImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GeneralSuffixTypeImpl <em>General Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GeneralSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getGeneralSuffixType()
	 * @generated
	 */
	int GENERAL_SUFFIX_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>General Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>General Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GenerationIdentifierTypeImpl <em>Generation Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GenerationIdentifierTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getGenerationIdentifierType()
	 * @generated
	 */
	int GENERATION_IDENTIFIER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Generation Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Generation Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl <em>Joint Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getJointPersonNameType()
	 * @generated
	 */
	int JOINT_PERSON_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__NAME_LINE = 1;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__PERSON_NAME = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__CODE = 4;

	/**
	 * The feature id for the '<em><b>Joint Name Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Joint Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Joint Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_PERSON_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.KnownAsTypeImpl <em>Known As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.KnownAsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getKnownAsType()
	 * @generated
	 */
	int KNOWN_AS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__NAME_LINE = PERSON_NAME__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Preceding Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__PRECEDING_TITLE = PERSON_NAME__PRECEDING_TITLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__TITLE = PERSON_NAME__TITLE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__FIRST_NAME = PERSON_NAME__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__MIDDLE_NAME = PERSON_NAME__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>Name Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__NAME_PREFIX = PERSON_NAME__NAME_PREFIX;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__LAST_NAME = PERSON_NAME__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Other Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__OTHER_NAME = PERSON_NAME__OTHER_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__ALIAS = PERSON_NAME__ALIAS;

	/**
	 * The feature id for the '<em><b>Generation Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__GENERATION_IDENTIFIER = PERSON_NAME__GENERATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__SUFFIX = PERSON_NAME__SUFFIX;

	/**
	 * The feature id for the '<em><b>General Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__GENERAL_SUFFIX = PERSON_NAME__GENERAL_SUFFIX;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__CODE = PERSON_NAME__CODE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__NAME_DETAILS_KEY_REF = PERSON_NAME__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__TYPE = PERSON_NAME__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__ANY_ATTRIBUTE = PERSON_NAME__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__ANY = PERSON_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__VALID_FROM = PERSON_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE__VALID_TO = PERSON_NAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Known As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE_FEATURE_COUNT = PERSON_NAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Known As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWN_AS_TYPE_OPERATION_COUNT = PERSON_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.LastNameTypeImpl <em>Last Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.LastNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getLastNameType()
	 * @generated
	 */
	int LAST_NAME_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Last Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Last Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.MiddleNameTypeImpl <em>Middle Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.MiddleNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getMiddleNameType()
	 * @generated
	 */
	int MIDDLE_NAME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Middle Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Middle Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl <em>Name Details Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameDetailsType()
	 * @generated
	 */
	int NAME_DETAILS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__NAME_LINE = NAME_DETAILS__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__PERSON_NAME = NAME_DETAILS__PERSON_NAME;

	/**
	 * The feature id for the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__JOINT_PERSON_NAME = NAME_DETAILS__JOINT_PERSON_NAME;

	/**
	 * The feature id for the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__ORGANISATION_NAME_DETAILS = NAME_DETAILS__ORGANISATION_NAME_DETAILS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__CODE = NAME_DETAILS__CODE;

	/**
	 * The feature id for the '<em><b>Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__PARTY_TYPE = NAME_DETAILS__PARTY_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__ANY_ATTRIBUTE = NAME_DETAILS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Addressee Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR = NAME_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__FUNCTION = NAME_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependency Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__DEPENDENCY_NAME = NAME_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__ANY = NAME_DETAILS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name Details Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE__NAME_DETAILS_KEY = NAME_DETAILS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Name Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE_FEATURE_COUNT = NAME_DETAILS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Name Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DETAILS_TYPE_OPERATION_COUNT = NAME_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameLineTypeImpl <em>Name Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameLineTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameLineType()
	 * @generated
	 */
	int NAME_LINE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Name Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Name Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LINE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NamePrefixTypeImpl <em>Name Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NamePrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNamePrefixType()
	 * @generated
	 */
	int NAME_PREFIX_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Name Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Name Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl <em>Organisation Name Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameDetails()
	 * @generated
	 */
	int ORGANISATION_NAME_DETAILS = 19;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__NAME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__ORGANISATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Organisation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Organisation Name Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Organisation Name Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationFormerNameTypeImpl <em>Organisation Former Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationFormerNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationFormerNameType()
	 * @generated
	 */
	int ORGANISATION_FORMER_NAME_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__NAME_LINE = ORGANISATION_NAME_DETAILS__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__ORGANISATION_NAME = ORGANISATION_NAME_DETAILS__ORGANISATION_NAME;

	/**
	 * The feature id for the '<em><b>Organisation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__ORGANISATION_TYPE = ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__NAME_DETAILS_KEY_REF = ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__TYPE = ORGANISATION_NAME_DETAILS__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__ANY_ATTRIBUTE = ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__ANY = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__VALID_FROM = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE__VALID_TO = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Organisation Former Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE_FEATURE_COUNT = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Organisation Former Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FORMER_NAME_TYPE_OPERATION_COUNT = ORGANISATION_NAME_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationKnownAsTypeImpl <em>Organisation Known As Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationKnownAsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationKnownAsType()
	 * @generated
	 */
	int ORGANISATION_KNOWN_AS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__NAME_LINE = ORGANISATION_NAME_DETAILS__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__ORGANISATION_NAME = ORGANISATION_NAME_DETAILS__ORGANISATION_NAME;

	/**
	 * The feature id for the '<em><b>Organisation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__ORGANISATION_TYPE = ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__NAME_DETAILS_KEY_REF = ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__TYPE = ORGANISATION_NAME_DETAILS__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__ANY_ATTRIBUTE = ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__ANY = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__VALID_FROM = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE__VALID_TO = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Organisation Known As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE_FEATURE_COUNT = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Organisation Known As Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_KNOWN_AS_TYPE_OPERATION_COUNT = ORGANISATION_NAME_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl <em>Organisation Name Details Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameDetailsType()
	 * @generated
	 */
	int ORGANISATION_NAME_DETAILS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__NAME_LINE = ORGANISATION_NAME_DETAILS__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Organisation Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_NAME = ORGANISATION_NAME_DETAILS__ORGANISATION_NAME;

	/**
	 * The feature id for the '<em><b>Organisation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_TYPE = ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__NAME_DETAILS_KEY_REF = ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__TYPE = ORGANISATION_NAME_DETAILS__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ANY_ATTRIBUTE = ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Organisation Former Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organisation Known As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE__ANY = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Organisation Name Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE_FEATURE_COUNT = ORGANISATION_NAME_DETAILS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Organisation Name Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_DETAILS_TYPE_OPERATION_COUNT = ORGANISATION_NAME_DETAILS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameTypeImpl <em>Organisation Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameType()
	 * @generated
	 */
	int ORGANISATION_NAME_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Organisation Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Organisation Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationTypeTypeImpl <em>Organisation Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationTypeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationTypeType()
	 * @generated
	 */
	int ORGANISATION_TYPE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Organisation Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Organisation Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OtherNameTypeImpl <em>Other Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OtherNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOtherNameType()
	 * @generated
	 */
	int OTHER_NAME_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE__NAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Other Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Other Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPersonNameType()
	 * @generated
	 */
	int PERSON_NAME_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__NAME_LINE = PERSON_NAME__NAME_LINE;

	/**
	 * The feature id for the '<em><b>Preceding Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__PRECEDING_TITLE = PERSON_NAME__PRECEDING_TITLE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__TITLE = PERSON_NAME__TITLE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__FIRST_NAME = PERSON_NAME__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__MIDDLE_NAME = PERSON_NAME__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>Name Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__NAME_PREFIX = PERSON_NAME__NAME_PREFIX;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__LAST_NAME = PERSON_NAME__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Other Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__OTHER_NAME = PERSON_NAME__OTHER_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ALIAS = PERSON_NAME__ALIAS;

	/**
	 * The feature id for the '<em><b>Generation Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__GENERATION_IDENTIFIER = PERSON_NAME__GENERATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__SUFFIX = PERSON_NAME__SUFFIX;

	/**
	 * The feature id for the '<em><b>General Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__GENERAL_SUFFIX = PERSON_NAME__GENERAL_SUFFIX;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__CODE = PERSON_NAME__CODE;

	/**
	 * The feature id for the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__NAME_DETAILS_KEY_REF = PERSON_NAME__NAME_DETAILS_KEY_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__TYPE = PERSON_NAME__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ANY_ATTRIBUTE = PERSON_NAME__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Former Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__FORMER_NAME = PERSON_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Known As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__KNOWN_AS = PERSON_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE__ANY = PERSON_NAME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_FEATURE_COUNT = PERSON_NAME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_NAME_TYPE_OPERATION_COUNT = PERSON_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PrecedingTitleTypeImpl <em>Preceding Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PrecedingTitleTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPrecedingTitleType()
	 * @generated
	 */
	int PRECEDING_TITLE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Preceding Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Preceding Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDING_TITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.SuffixTypeImpl <em>Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.SuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getSuffixType()
	 * @generated
	 */
	int SUFFIX_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.TitleTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.XNLTypeImpl <em>XNL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.XNLTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getXNLType()
	 * @generated
	 */
	int XNL_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE__NAME_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>XNL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>XNL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNL_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType <em>Addressee Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressee Indicator Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType
	 * @generated
	 */
	EClass getAddresseeIndicatorType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getMixed()
	 * @see #getAddresseeIndicatorType()
	 * @generated
	 */
	EAttribute getAddresseeIndicatorType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getCode()
	 * @see #getAddresseeIndicatorType()
	 * @generated
	 */
	EAttribute getAddresseeIndicatorType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType#getAnyAttribute()
	 * @see #getAddresseeIndicatorType()
	 * @generated
	 */
	EAttribute getAddresseeIndicatorType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType
	 * @generated
	 */
	EClass getAliasType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getMixed()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getCode()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getNameType()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getType()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType#getAnyAttribute()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType <em>Dependency Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType
	 * @generated
	 */
	EClass getDependencyNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getAny()
	 * @see #getDependencyNameType()
	 * @generated
	 */
	EAttribute getDependencyNameType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getDependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getDependencyType()
	 * @see #getDependencyNameType()
	 * @generated
	 */
	EAttribute getDependencyNameType_DependencyType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getNameDetailsKeyRef <em>Name Details Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Details Key Ref</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getNameDetailsKeyRef()
	 * @see #getDependencyNameType()
	 * @generated
	 */
	EAttribute getDependencyNameType_NameDetailsKeyRef();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getFunction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Function();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getJointPersonName <em>Joint Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Joint Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getJointPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_JointPersonName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getNameDetails <em>Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getNameDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NameDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getOrganisationNameDetails <em>Organisation Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organisation Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getOrganisationNameDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrganisationNameDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getPersonName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXNL <em>XNL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XNL</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXNL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XNL();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType <em>First Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType
	 * @generated
	 */
	EClass getFirstNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getMixed()
	 * @see #getFirstNameType()
	 * @generated
	 */
	EAttribute getFirstNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getCode()
	 * @see #getFirstNameType()
	 * @generated
	 */
	EAttribute getFirstNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getNameType()
	 * @see #getFirstNameType()
	 * @generated
	 */
	EAttribute getFirstNameType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getType()
	 * @see #getFirstNameType()
	 * @generated
	 */
	EAttribute getFirstNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getAnyAttribute()
	 * @see #getFirstNameType()
	 * @generated
	 */
	EAttribute getFirstNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType <em>Former Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Former Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType
	 * @generated
	 */
	EClass getFormerNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getAny()
	 * @see #getFormerNameType()
	 * @generated
	 */
	EAttribute getFormerNameType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getValidFrom()
	 * @see #getFormerNameType()
	 * @generated
	 */
	EAttribute getFormerNameType_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType#getValidTo()
	 * @see #getFormerNameType()
	 * @generated
	 */
	EAttribute getFormerNameType_ValidTo();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getMixed()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getCode()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.Function#getAnyAttribute()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType <em>General Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType
	 * @generated
	 */
	EClass getGeneralSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getMixed()
	 * @see #getGeneralSuffixType()
	 * @generated
	 */
	EAttribute getGeneralSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getCode()
	 * @see #getGeneralSuffixType()
	 * @generated
	 */
	EAttribute getGeneralSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getType()
	 * @see #getGeneralSuffixType()
	 * @generated
	 */
	EAttribute getGeneralSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType#getAnyAttribute()
	 * @see #getGeneralSuffixType()
	 * @generated
	 */
	EAttribute getGeneralSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType <em>Generation Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType
	 * @generated
	 */
	EClass getGenerationIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getMixed()
	 * @see #getGenerationIdentifierType()
	 * @generated
	 */
	EAttribute getGenerationIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getCode()
	 * @see #getGenerationIdentifierType()
	 * @generated
	 */
	EAttribute getGenerationIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getType()
	 * @see #getGenerationIdentifierType()
	 * @generated
	 */
	EAttribute getGenerationIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType#getAnyAttribute()
	 * @see #getGenerationIdentifierType()
	 * @generated
	 */
	EAttribute getGenerationIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType <em>Joint Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint Person Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType
	 * @generated
	 */
	EClass getJointPersonNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getGroup()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EAttribute getJointPersonNameType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getNameLine <em>Name Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getNameLine()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EReference getJointPersonNameType_NameLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getPersonName()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EReference getJointPersonNameType_PersonName();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getAny()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EAttribute getJointPersonNameType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getCode()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EAttribute getJointPersonNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getJointNameConnector <em>Joint Name Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joint Name Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getJointNameConnector()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EAttribute getJointPersonNameType_JointNameConnector();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType#getAnyAttribute()
	 * @see #getJointPersonNameType()
	 * @generated
	 */
	EAttribute getJointPersonNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType <em>Known As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Known As Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType
	 * @generated
	 */
	EClass getKnownAsType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getAny()
	 * @see #getKnownAsType()
	 * @generated
	 */
	EAttribute getKnownAsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidFrom()
	 * @see #getKnownAsType()
	 * @generated
	 */
	EAttribute getKnownAsType_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidTo()
	 * @see #getKnownAsType()
	 * @generated
	 */
	EAttribute getKnownAsType_ValidTo();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType <em>Last Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType
	 * @generated
	 */
	EClass getLastNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getMixed()
	 * @see #getLastNameType()
	 * @generated
	 */
	EAttribute getLastNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getCode()
	 * @see #getLastNameType()
	 * @generated
	 */
	EAttribute getLastNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getNameType()
	 * @see #getLastNameType()
	 * @generated
	 */
	EAttribute getLastNameType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getType()
	 * @see #getLastNameType()
	 * @generated
	 */
	EAttribute getLastNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType#getAnyAttribute()
	 * @see #getLastNameType()
	 * @generated
	 */
	EAttribute getLastNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType <em>Middle Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middle Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType
	 * @generated
	 */
	EClass getMiddleNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getMixed()
	 * @see #getMiddleNameType()
	 * @generated
	 */
	EAttribute getMiddleNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getCode()
	 * @see #getMiddleNameType()
	 * @generated
	 */
	EAttribute getMiddleNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getNameType()
	 * @see #getMiddleNameType()
	 * @generated
	 */
	EAttribute getMiddleNameType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getType()
	 * @see #getMiddleNameType()
	 * @generated
	 */
	EAttribute getMiddleNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType#getAnyAttribute()
	 * @see #getMiddleNameType()
	 * @generated
	 */
	EAttribute getMiddleNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails <em>Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails
	 * @generated
	 */
	EClass getNameDetails();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getNameLine <em>Name Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getNameLine()
	 * @see #getNameDetails()
	 * @generated
	 */
	EReference getNameDetails_NameLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPersonName()
	 * @see #getNameDetails()
	 * @generated
	 */
	EReference getNameDetails_PersonName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getJointPersonName <em>Joint Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Joint Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getJointPersonName()
	 * @see #getNameDetails()
	 * @generated
	 */
	EReference getNameDetails_JointPersonName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getOrganisationNameDetails <em>Organisation Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organisation Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getOrganisationNameDetails()
	 * @see #getNameDetails()
	 * @generated
	 */
	EReference getNameDetails_OrganisationNameDetails();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getCode()
	 * @see #getNameDetails()
	 * @generated
	 */
	EAttribute getNameDetails_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPartyType <em>Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPartyType()
	 * @see #getNameDetails()
	 * @generated
	 */
	EAttribute getNameDetails_PartyType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getAnyAttribute()
	 * @see #getNameDetails()
	 * @generated
	 */
	EAttribute getNameDetails_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType <em>Name Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Details Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType
	 * @generated
	 */
	EClass getNameDetailsType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAddresseeIndicator <em>Addressee Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addressee Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAddresseeIndicator()
	 * @see #getNameDetailsType()
	 * @generated
	 */
	EReference getNameDetailsType_AddresseeIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getFunction()
	 * @see #getNameDetailsType()
	 * @generated
	 */
	EReference getNameDetailsType_Function();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getDependencyName <em>Dependency Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getDependencyName()
	 * @see #getNameDetailsType()
	 * @generated
	 */
	EReference getNameDetailsType_DependencyName();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAny()
	 * @see #getNameDetailsType()
	 * @generated
	 */
	EAttribute getNameDetailsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getNameDetailsKey <em>Name Details Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Details Key</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getNameDetailsKey()
	 * @see #getNameDetailsType()
	 * @generated
	 */
	EAttribute getNameDetailsType_NameDetailsKey();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType <em>Name Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Line Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType
	 * @generated
	 */
	EClass getNameLineType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getMixed()
	 * @see #getNameLineType()
	 * @generated
	 */
	EAttribute getNameLineType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getCode()
	 * @see #getNameLineType()
	 * @generated
	 */
	EAttribute getNameLineType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getNameType()
	 * @see #getNameLineType()
	 * @generated
	 */
	EAttribute getNameLineType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getType()
	 * @see #getNameLineType()
	 * @generated
	 */
	EAttribute getNameLineType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType#getAnyAttribute()
	 * @see #getNameLineType()
	 * @generated
	 */
	EAttribute getNameLineType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType <em>Name Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType
	 * @generated
	 */
	EClass getNamePrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getMixed()
	 * @see #getNamePrefixType()
	 * @generated
	 */
	EAttribute getNamePrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getCode()
	 * @see #getNamePrefixType()
	 * @generated
	 */
	EAttribute getNamePrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getNameType()
	 * @see #getNamePrefixType()
	 * @generated
	 */
	EAttribute getNamePrefixType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getType()
	 * @see #getNamePrefixType()
	 * @generated
	 */
	EAttribute getNamePrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType#getAnyAttribute()
	 * @see #getNamePrefixType()
	 * @generated
	 */
	EAttribute getNamePrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType <em>Organisation Former Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Former Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType
	 * @generated
	 */
	EClass getOrganisationFormerNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getAny()
	 * @see #getOrganisationFormerNameType()
	 * @generated
	 */
	EAttribute getOrganisationFormerNameType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getValidFrom()
	 * @see #getOrganisationFormerNameType()
	 * @generated
	 */
	EAttribute getOrganisationFormerNameType_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType#getValidTo()
	 * @see #getOrganisationFormerNameType()
	 * @generated
	 */
	EAttribute getOrganisationFormerNameType_ValidTo();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType <em>Organisation Known As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Known As Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType
	 * @generated
	 */
	EClass getOrganisationKnownAsType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getAny()
	 * @see #getOrganisationKnownAsType()
	 * @generated
	 */
	EAttribute getOrganisationKnownAsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getValidFrom()
	 * @see #getOrganisationKnownAsType()
	 * @generated
	 */
	EAttribute getOrganisationKnownAsType_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType#getValidTo()
	 * @see #getOrganisationKnownAsType()
	 * @generated
	 */
	EAttribute getOrganisationKnownAsType_ValidTo();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails <em>Organisation Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails
	 * @generated
	 */
	EClass getOrganisationNameDetails();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameLine <em>Name Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameLine()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EReference getOrganisationNameDetails_NameLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationName <em>Organisation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationName()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EReference getOrganisationNameDetails_OrganisationName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationType <em>Organisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationType()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EReference getOrganisationNameDetails_OrganisationType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameDetailsKeyRef <em>Name Details Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Details Key Ref</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameDetailsKeyRef()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EAttribute getOrganisationNameDetails_NameDetailsKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getType()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EAttribute getOrganisationNameDetails_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getAnyAttribute()
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	EAttribute getOrganisationNameDetails_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType <em>Organisation Name Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Name Details Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType
	 * @generated
	 */
	EClass getOrganisationNameDetailsType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationFormerName <em>Organisation Former Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Former Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationFormerName()
	 * @see #getOrganisationNameDetailsType()
	 * @generated
	 */
	EReference getOrganisationNameDetailsType_OrganisationFormerName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationKnownAs <em>Organisation Known As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Known As</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationKnownAs()
	 * @see #getOrganisationNameDetailsType()
	 * @generated
	 */
	EReference getOrganisationNameDetailsType_OrganisationKnownAs();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getAny()
	 * @see #getOrganisationNameDetailsType()
	 * @generated
	 */
	EAttribute getOrganisationNameDetailsType_Any();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType <em>Organisation Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType
	 * @generated
	 */
	EClass getOrganisationNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getMixed()
	 * @see #getOrganisationNameType()
	 * @generated
	 */
	EAttribute getOrganisationNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getCode()
	 * @see #getOrganisationNameType()
	 * @generated
	 */
	EAttribute getOrganisationNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getNameType()
	 * @see #getOrganisationNameType()
	 * @generated
	 */
	EAttribute getOrganisationNameType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getType()
	 * @see #getOrganisationNameType()
	 * @generated
	 */
	EAttribute getOrganisationNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType#getAnyAttribute()
	 * @see #getOrganisationNameType()
	 * @generated
	 */
	EAttribute getOrganisationNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType <em>Organisation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType
	 * @generated
	 */
	EClass getOrganisationTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getMixed()
	 * @see #getOrganisationTypeType()
	 * @generated
	 */
	EAttribute getOrganisationTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getCode()
	 * @see #getOrganisationTypeType()
	 * @generated
	 */
	EAttribute getOrganisationTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getNameType()
	 * @see #getOrganisationTypeType()
	 * @generated
	 */
	EAttribute getOrganisationTypeType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getType()
	 * @see #getOrganisationTypeType()
	 * @generated
	 */
	EAttribute getOrganisationTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType#getAnyAttribute()
	 * @see #getOrganisationTypeType()
	 * @generated
	 */
	EAttribute getOrganisationTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType <em>Other Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType
	 * @generated
	 */
	EClass getOtherNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getMixed()
	 * @see #getOtherNameType()
	 * @generated
	 */
	EAttribute getOtherNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getCode()
	 * @see #getOtherNameType()
	 * @generated
	 */
	EAttribute getOtherNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getNameType()
	 * @see #getOtherNameType()
	 * @generated
	 */
	EAttribute getOtherNameType_NameType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getType()
	 * @see #getOtherNameType()
	 * @generated
	 */
	EAttribute getOtherNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType#getAnyAttribute()
	 * @see #getOtherNameType()
	 * @generated
	 */
	EAttribute getOtherNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName
	 * @generated
	 */
	EClass getPersonName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameLine <em>Name Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameLine()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_NameLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getPrecedingTitle <em>Preceding Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preceding Title</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getPrecedingTitle()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_PrecedingTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getTitle()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>First Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getFirstName()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_FirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Middle Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getMiddleName()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_MiddleName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNamePrefix <em>Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNamePrefix()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_NamePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Last Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getLastName()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_LastName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getOtherName <em>Other Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getOtherName()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_OtherName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAlias()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGenerationIdentifier <em>Generation Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generation Identifier</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGenerationIdentifier()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_GenerationIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getSuffix()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_Suffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGeneralSuffix <em>General Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGeneralSuffix()
	 * @see #getPersonName()
	 * @generated
	 */
	EReference getPersonName_GeneralSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getCode()
	 * @see #getPersonName()
	 * @generated
	 */
	EAttribute getPersonName_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameDetailsKeyRef <em>Name Details Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Details Key Ref</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameDetailsKeyRef()
	 * @see #getPersonName()
	 * @generated
	 */
	EAttribute getPersonName_NameDetailsKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getType()
	 * @see #getPersonName()
	 * @generated
	 */
	EAttribute getPersonName_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAnyAttribute()
	 * @see #getPersonName()
	 * @generated
	 */
	EAttribute getPersonName_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType
	 * @generated
	 */
	EClass getPersonNameType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getFormerName <em>Former Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Former Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getFormerName()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EReference getPersonNameType_FormerName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getKnownAs <em>Known As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Known As</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getKnownAs()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EReference getPersonNameType_KnownAs();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getAny()
	 * @see #getPersonNameType()
	 * @generated
	 */
	EAttribute getPersonNameType_Any();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType <em>Preceding Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preceding Title Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType
	 * @generated
	 */
	EClass getPrecedingTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getMixed()
	 * @see #getPrecedingTitleType()
	 * @generated
	 */
	EAttribute getPrecedingTitleType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getCode()
	 * @see #getPrecedingTitleType()
	 * @generated
	 */
	EAttribute getPrecedingTitleType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getType()
	 * @see #getPrecedingTitleType()
	 * @generated
	 */
	EAttribute getPrecedingTitleType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType#getAnyAttribute()
	 * @see #getPrecedingTitleType()
	 * @generated
	 */
	EAttribute getPrecedingTitleType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType <em>Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType
	 * @generated
	 */
	EClass getSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getMixed()
	 * @see #getSuffixType()
	 * @generated
	 */
	EAttribute getSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getCode()
	 * @see #getSuffixType()
	 * @generated
	 */
	EAttribute getSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getType()
	 * @see #getSuffixType()
	 * @generated
	 */
	EAttribute getSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType#getAnyAttribute()
	 * @see #getSuffixType()
	 * @generated
	 */
	EAttribute getSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getMixed()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getCode()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getType()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType#getAnyAttribute()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType <em>XNL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XNL Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType
	 * @generated
	 */
	EClass getXNLType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getNameDetails <em>Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getNameDetails()
	 * @see #getXNLType()
	 * @generated
	 */
	EReference getXNLType_NameDetails();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getAny()
	 * @see #getXNLType()
	 * @generated
	 */
	EAttribute getXNLType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getVersion()
	 * @see #getXNLType()
	 * @generated
	 */
	EAttribute getXNLType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType#getAnyAttribute()
	 * @see #getXNLType()
	 * @generated
	 */
	EAttribute getXNLType_AnyAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

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
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AddresseeIndicatorTypeImpl <em>Addressee Indicator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AddresseeIndicatorTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getAddresseeIndicatorType()
		 * @generated
		 */
		EClass ADDRESSEE_INDICATOR_TYPE = eINSTANCE.getAddresseeIndicatorType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSEE_INDICATOR_TYPE__MIXED = eINSTANCE.getAddresseeIndicatorType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSEE_INDICATOR_TYPE__CODE = eINSTANCE.getAddresseeIndicatorType_Code();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSEE_INDICATOR_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAddresseeIndicatorType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AliasTypeImpl <em>Alias Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.AliasTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getAliasType()
		 * @generated
		 */
		EClass ALIAS_TYPE = eINSTANCE.getAliasType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__MIXED = eINSTANCE.getAliasType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__CODE = eINSTANCE.getAliasType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__NAME_TYPE = eINSTANCE.getAliasType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__TYPE = eINSTANCE.getAliasType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAliasType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl <em>Dependency Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getDependencyNameType()
		 * @generated
		 */
		EClass DEPENDENCY_NAME_TYPE = eINSTANCE.getDependencyNameType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_NAME_TYPE__ANY = eINSTANCE.getDependencyNameType_Any();

		/**
		 * The meta object literal for the '<em><b>Dependency Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE = eINSTANCE.getDependencyNameType_DependencyType();

		/**
		 * The meta object literal for the '<em><b>Name Details Key Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF = eINSTANCE.getDependencyNameType_NameDetailsKeyRef();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FUNCTION = eINSTANCE.getDocumentRoot_Function();

		/**
		 * The meta object literal for the '<em><b>Joint Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JOINT_PERSON_NAME = eINSTANCE.getDocumentRoot_JointPersonName();

		/**
		 * The meta object literal for the '<em><b>Name Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAME_DETAILS = eINSTANCE.getDocumentRoot_NameDetails();

		/**
		 * The meta object literal for the '<em><b>Organisation Name Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS = eINSTANCE.getDocumentRoot_OrganisationNameDetails();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON_NAME = eINSTANCE.getDocumentRoot_PersonName();

		/**
		 * The meta object literal for the '<em><b>XNL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XNL = eINSTANCE.getDocumentRoot_XNL();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FirstNameTypeImpl <em>First Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FirstNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFirstNameType()
		 * @generated
		 */
		EClass FIRST_NAME_TYPE = eINSTANCE.getFirstNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NAME_TYPE__MIXED = eINSTANCE.getFirstNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NAME_TYPE__CODE = eINSTANCE.getFirstNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NAME_TYPE__NAME_TYPE = eINSTANCE.getFirstNameType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NAME_TYPE__TYPE = eINSTANCE.getFirstNameType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getFirstNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FormerNameTypeImpl <em>Former Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FormerNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFormerNameType()
		 * @generated
		 */
		EClass FORMER_NAME_TYPE = eINSTANCE.getFormerNameType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMER_NAME_TYPE__ANY = eINSTANCE.getFormerNameType_Any();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMER_NAME_TYPE__VALID_FROM = eINSTANCE.getFormerNameType_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMER_NAME_TYPE__VALID_TO = eINSTANCE.getFormerNameType_ValidTo();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.FunctionImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__MIXED = eINSTANCE.getFunction_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__CODE = eINSTANCE.getFunction_Code();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ANY_ATTRIBUTE = eINSTANCE.getFunction_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GeneralSuffixTypeImpl <em>General Suffix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GeneralSuffixTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getGeneralSuffixType()
		 * @generated
		 */
		EClass GENERAL_SUFFIX_TYPE = eINSTANCE.getGeneralSuffixType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SUFFIX_TYPE__MIXED = eINSTANCE.getGeneralSuffixType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SUFFIX_TYPE__CODE = eINSTANCE.getGeneralSuffixType_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SUFFIX_TYPE__TYPE = eINSTANCE.getGeneralSuffixType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_SUFFIX_TYPE__ANY_ATTRIBUTE = eINSTANCE.getGeneralSuffixType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GenerationIdentifierTypeImpl <em>Generation Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.GenerationIdentifierTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getGenerationIdentifierType()
		 * @generated
		 */
		EClass GENERATION_IDENTIFIER_TYPE = eINSTANCE.getGenerationIdentifierType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_IDENTIFIER_TYPE__MIXED = eINSTANCE.getGenerationIdentifierType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_IDENTIFIER_TYPE__CODE = eINSTANCE.getGenerationIdentifierType_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_IDENTIFIER_TYPE__TYPE = eINSTANCE.getGenerationIdentifierType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_IDENTIFIER_TYPE__ANY_ATTRIBUTE = eINSTANCE.getGenerationIdentifierType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl <em>Joint Person Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getJointPersonNameType()
		 * @generated
		 */
		EClass JOINT_PERSON_NAME_TYPE = eINSTANCE.getJointPersonNameType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_PERSON_NAME_TYPE__GROUP = eINSTANCE.getJointPersonNameType_Group();

		/**
		 * The meta object literal for the '<em><b>Name Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_PERSON_NAME_TYPE__NAME_LINE = eINSTANCE.getJointPersonNameType_NameLine();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_PERSON_NAME_TYPE__PERSON_NAME = eINSTANCE.getJointPersonNameType_PersonName();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_PERSON_NAME_TYPE__ANY = eINSTANCE.getJointPersonNameType_Any();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_PERSON_NAME_TYPE__CODE = eINSTANCE.getJointPersonNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Joint Name Connector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR = eINSTANCE.getJointPersonNameType_JointNameConnector();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getJointPersonNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.KnownAsTypeImpl <em>Known As Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.KnownAsTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getKnownAsType()
		 * @generated
		 */
		EClass KNOWN_AS_TYPE = eINSTANCE.getKnownAsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWN_AS_TYPE__ANY = eINSTANCE.getKnownAsType_Any();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWN_AS_TYPE__VALID_FROM = eINSTANCE.getKnownAsType_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWN_AS_TYPE__VALID_TO = eINSTANCE.getKnownAsType_ValidTo();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.LastNameTypeImpl <em>Last Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.LastNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getLastNameType()
		 * @generated
		 */
		EClass LAST_NAME_TYPE = eINSTANCE.getLastNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NAME_TYPE__MIXED = eINSTANCE.getLastNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NAME_TYPE__CODE = eINSTANCE.getLastNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NAME_TYPE__NAME_TYPE = eINSTANCE.getLastNameType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NAME_TYPE__TYPE = eINSTANCE.getLastNameType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAST_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLastNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.MiddleNameTypeImpl <em>Middle Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.MiddleNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getMiddleNameType()
		 * @generated
		 */
		EClass MIDDLE_NAME_TYPE = eINSTANCE.getMiddleNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLE_NAME_TYPE__MIXED = eINSTANCE.getMiddleNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLE_NAME_TYPE__CODE = eINSTANCE.getMiddleNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLE_NAME_TYPE__NAME_TYPE = eINSTANCE.getMiddleNameType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLE_NAME_TYPE__TYPE = eINSTANCE.getMiddleNameType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLE_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getMiddleNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl <em>Name Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameDetails()
		 * @generated
		 */
		EClass NAME_DETAILS = eINSTANCE.getNameDetails();

		/**
		 * The meta object literal for the '<em><b>Name Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS__NAME_LINE = eINSTANCE.getNameDetails_NameLine();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS__PERSON_NAME = eINSTANCE.getNameDetails_PersonName();

		/**
		 * The meta object literal for the '<em><b>Joint Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS__JOINT_PERSON_NAME = eINSTANCE.getNameDetails_JointPersonName();

		/**
		 * The meta object literal for the '<em><b>Organisation Name Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS__ORGANISATION_NAME_DETAILS = eINSTANCE.getNameDetails_OrganisationNameDetails();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DETAILS__CODE = eINSTANCE.getNameDetails_Code();

		/**
		 * The meta object literal for the '<em><b>Party Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DETAILS__PARTY_TYPE = eINSTANCE.getNameDetails_PartyType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DETAILS__ANY_ATTRIBUTE = eINSTANCE.getNameDetails_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl <em>Name Details Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameDetailsType()
		 * @generated
		 */
		EClass NAME_DETAILS_TYPE = eINSTANCE.getNameDetailsType();

		/**
		 * The meta object literal for the '<em><b>Addressee Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR = eINSTANCE.getNameDetailsType_AddresseeIndicator();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS_TYPE__FUNCTION = eINSTANCE.getNameDetailsType_Function();

		/**
		 * The meta object literal for the '<em><b>Dependency Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_DETAILS_TYPE__DEPENDENCY_NAME = eINSTANCE.getNameDetailsType_DependencyName();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DETAILS_TYPE__ANY = eINSTANCE.getNameDetailsType_Any();

		/**
		 * The meta object literal for the '<em><b>Name Details Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DETAILS_TYPE__NAME_DETAILS_KEY = eINSTANCE.getNameDetailsType_NameDetailsKey();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameLineTypeImpl <em>Name Line Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameLineTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNameLineType()
		 * @generated
		 */
		EClass NAME_LINE_TYPE = eINSTANCE.getNameLineType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LINE_TYPE__MIXED = eINSTANCE.getNameLineType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LINE_TYPE__CODE = eINSTANCE.getNameLineType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LINE_TYPE__NAME_TYPE = eINSTANCE.getNameLineType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LINE_TYPE__TYPE = eINSTANCE.getNameLineType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LINE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNameLineType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NamePrefixTypeImpl <em>Name Prefix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NamePrefixTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getNamePrefixType()
		 * @generated
		 */
		EClass NAME_PREFIX_TYPE = eINSTANCE.getNamePrefixType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PREFIX_TYPE__MIXED = eINSTANCE.getNamePrefixType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PREFIX_TYPE__CODE = eINSTANCE.getNamePrefixType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PREFIX_TYPE__NAME_TYPE = eINSTANCE.getNamePrefixType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PREFIX_TYPE__TYPE = eINSTANCE.getNamePrefixType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PREFIX_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNamePrefixType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationFormerNameTypeImpl <em>Organisation Former Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationFormerNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationFormerNameType()
		 * @generated
		 */
		EClass ORGANISATION_FORMER_NAME_TYPE = eINSTANCE.getOrganisationFormerNameType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_FORMER_NAME_TYPE__ANY = eINSTANCE.getOrganisationFormerNameType_Any();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_FORMER_NAME_TYPE__VALID_FROM = eINSTANCE.getOrganisationFormerNameType_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_FORMER_NAME_TYPE__VALID_TO = eINSTANCE.getOrganisationFormerNameType_ValidTo();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationKnownAsTypeImpl <em>Organisation Known As Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationKnownAsTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationKnownAsType()
		 * @generated
		 */
		EClass ORGANISATION_KNOWN_AS_TYPE = eINSTANCE.getOrganisationKnownAsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_KNOWN_AS_TYPE__ANY = eINSTANCE.getOrganisationKnownAsType_Any();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_KNOWN_AS_TYPE__VALID_FROM = eINSTANCE.getOrganisationKnownAsType_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_KNOWN_AS_TYPE__VALID_TO = eINSTANCE.getOrganisationKnownAsType_ValidTo();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl <em>Organisation Name Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameDetails()
		 * @generated
		 */
		EClass ORGANISATION_NAME_DETAILS = eINSTANCE.getOrganisationNameDetails();

		/**
		 * The meta object literal for the '<em><b>Name Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_NAME_DETAILS__NAME_LINE = eINSTANCE.getOrganisationNameDetails_NameLine();

		/**
		 * The meta object literal for the '<em><b>Organisation Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_NAME_DETAILS__ORGANISATION_NAME = eINSTANCE.getOrganisationNameDetails_OrganisationName();

		/**
		 * The meta object literal for the '<em><b>Organisation Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE = eINSTANCE.getOrganisationNameDetails_OrganisationType();

		/**
		 * The meta object literal for the '<em><b>Name Details Key Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF = eINSTANCE.getOrganisationNameDetails_NameDetailsKeyRef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_DETAILS__TYPE = eINSTANCE.getOrganisationNameDetails_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE = eINSTANCE.getOrganisationNameDetails_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl <em>Organisation Name Details Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameDetailsType()
		 * @generated
		 */
		EClass ORGANISATION_NAME_DETAILS_TYPE = eINSTANCE.getOrganisationNameDetailsType();

		/**
		 * The meta object literal for the '<em><b>Organisation Former Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME = eINSTANCE.getOrganisationNameDetailsType_OrganisationFormerName();

		/**
		 * The meta object literal for the '<em><b>Organisation Known As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS = eINSTANCE.getOrganisationNameDetailsType_OrganisationKnownAs();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_DETAILS_TYPE__ANY = eINSTANCE.getOrganisationNameDetailsType_Any();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameTypeImpl <em>Organisation Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationNameType()
		 * @generated
		 */
		EClass ORGANISATION_NAME_TYPE = eINSTANCE.getOrganisationNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_TYPE__MIXED = eINSTANCE.getOrganisationNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_TYPE__CODE = eINSTANCE.getOrganisationNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_TYPE__NAME_TYPE = eINSTANCE.getOrganisationNameType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_TYPE__TYPE = eINSTANCE.getOrganisationNameType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getOrganisationNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationTypeTypeImpl <em>Organisation Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationTypeTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOrganisationTypeType()
		 * @generated
		 */
		EClass ORGANISATION_TYPE_TYPE = eINSTANCE.getOrganisationTypeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_TYPE_TYPE__MIXED = eINSTANCE.getOrganisationTypeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_TYPE_TYPE__CODE = eINSTANCE.getOrganisationTypeType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_TYPE_TYPE__NAME_TYPE = eINSTANCE.getOrganisationTypeType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_TYPE_TYPE__TYPE = eINSTANCE.getOrganisationTypeType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_TYPE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getOrganisationTypeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OtherNameTypeImpl <em>Other Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OtherNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getOtherNameType()
		 * @generated
		 */
		EClass OTHER_NAME_TYPE = eINSTANCE.getOtherNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_NAME_TYPE__MIXED = eINSTANCE.getOtherNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_NAME_TYPE__CODE = eINSTANCE.getOtherNameType_Code();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_NAME_TYPE__NAME_TYPE = eINSTANCE.getOtherNameType_NameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_NAME_TYPE__TYPE = eINSTANCE.getOtherNameType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getOtherNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl <em>Person Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPersonName()
		 * @generated
		 */
		EClass PERSON_NAME = eINSTANCE.getPersonName();

		/**
		 * The meta object literal for the '<em><b>Name Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__NAME_LINE = eINSTANCE.getPersonName_NameLine();

		/**
		 * The meta object literal for the '<em><b>Preceding Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__PRECEDING_TITLE = eINSTANCE.getPersonName_PrecedingTitle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__TITLE = eINSTANCE.getPersonName_Title();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__FIRST_NAME = eINSTANCE.getPersonName_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__MIDDLE_NAME = eINSTANCE.getPersonName_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Name Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__NAME_PREFIX = eINSTANCE.getPersonName_NamePrefix();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__LAST_NAME = eINSTANCE.getPersonName_LastName();

		/**
		 * The meta object literal for the '<em><b>Other Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__OTHER_NAME = eINSTANCE.getPersonName_OtherName();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__ALIAS = eINSTANCE.getPersonName_Alias();

		/**
		 * The meta object literal for the '<em><b>Generation Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__GENERATION_IDENTIFIER = eINSTANCE.getPersonName_GenerationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__SUFFIX = eINSTANCE.getPersonName_Suffix();

		/**
		 * The meta object literal for the '<em><b>General Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME__GENERAL_SUFFIX = eINSTANCE.getPersonName_GeneralSuffix();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME__CODE = eINSTANCE.getPersonName_Code();

		/**
		 * The meta object literal for the '<em><b>Name Details Key Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME__NAME_DETAILS_KEY_REF = eINSTANCE.getPersonName_NameDetailsKeyRef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME__TYPE = eINSTANCE.getPersonName_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME__ANY_ATTRIBUTE = eINSTANCE.getPersonName_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl <em>Person Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPersonNameType()
		 * @generated
		 */
		EClass PERSON_NAME_TYPE = eINSTANCE.getPersonNameType();

		/**
		 * The meta object literal for the '<em><b>Former Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME_TYPE__FORMER_NAME = eINSTANCE.getPersonNameType_FormerName();

		/**
		 * The meta object literal for the '<em><b>Known As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_NAME_TYPE__KNOWN_AS = eINSTANCE.getPersonNameType_KnownAs();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_NAME_TYPE__ANY = eINSTANCE.getPersonNameType_Any();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PrecedingTitleTypeImpl <em>Preceding Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PrecedingTitleTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getPrecedingTitleType()
		 * @generated
		 */
		EClass PRECEDING_TITLE_TYPE = eINSTANCE.getPrecedingTitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDING_TITLE_TYPE__MIXED = eINSTANCE.getPrecedingTitleType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDING_TITLE_TYPE__CODE = eINSTANCE.getPrecedingTitleType_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDING_TITLE_TYPE__TYPE = eINSTANCE.getPrecedingTitleType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDING_TITLE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPrecedingTitleType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.SuffixTypeImpl <em>Suffix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.SuffixTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getSuffixType()
		 * @generated
		 */
		EClass SUFFIX_TYPE = eINSTANCE.getSuffixType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUFFIX_TYPE__MIXED = eINSTANCE.getSuffixType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUFFIX_TYPE__CODE = eINSTANCE.getSuffixType_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUFFIX_TYPE__TYPE = eINSTANCE.getSuffixType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUFFIX_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSuffixType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.TitleTypeImpl <em>Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.TitleTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getTitleType()
		 * @generated
		 */
		EClass TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__MIXED = eINSTANCE.getTitleType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__CODE = eINSTANCE.getTitleType_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__TYPE = eINSTANCE.getTitleType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getTitleType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.XNLTypeImpl <em>XNL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.XNLTypeImpl
		 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl#getXNLType()
		 * @generated
		 */
		EClass XNL_TYPE = eINSTANCE.getXNLType();

		/**
		 * The meta object literal for the '<em><b>Name Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XNL_TYPE__NAME_DETAILS = eINSTANCE.getXNLType_NameDetails();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNL_TYPE__ANY = eINSTANCE.getXNLType_Any();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNL_TYPE__VERSION = eINSTANCE.getXNLType_Version();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNL_TYPE__ANY_ATTRIBUTE = eINSTANCE.getXNLType_AnyAttribute();

	}

} //_0Package
