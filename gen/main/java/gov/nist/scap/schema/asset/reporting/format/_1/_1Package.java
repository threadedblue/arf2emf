/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

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
 * xAL: eXtensible Address Language 
 * This is an XML document type definition (DTD) for
 * defining addresses.
 * Original Date of Creation: 1 March 2001
 * Copyright(c) 2000, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * VERSION: 2.0 [MAJOR RELEASE] Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: 1.3
 * Common Attributes:Type - If not documented then it means, possible values of Type not limited to: Official, Unique, Abbreviation, OldName, Synonym
 * Code:Address element codes are used by groups like postal groups like ECCMA, ADIS, UN/PROLIST for postal services
 *  
 * This schema document provides attribute declarations and
 * attribute group, complex type and simple type definitions which can be used in
 * the construction of user schemas to define the structure of particular linking
 * constructs, e.g.
 * 
 * <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *            xmlns:xl="http://www.w3.org/1999/xlink">
 * 
 *  <xs:import namespace="http://www.w3.org/1999/xlink"
 *             location="http://www.w3.org/1999/xlink.xsd">
 * 
 *  <xs:element name="mySimple">
 *   <xs:complexType>
 *    ...
 *    <xs:attributeGroup ref="xl:simpleAttrs"/>
 *    ...
 *   </xs:complexType>
 *  </xs:element>
 *  ...
 * </xs:schema>
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Factory
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
	String eNS_URI = "http://scap.nist.gov/schema/asset-reporting-format/1.1";

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
	_1Package eINSTANCE = gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl <em>Asset Report Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetReportCollectionType()
	 * @generated
	 */
	int ASSET_REPORT_COLLECTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__RELATIONSHIPS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Report Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__ASSETS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__REPORTS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extended Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__ID = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Asset Report Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE_FEATURE_COUNT = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Asset Report Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_REPORT_COLLECTION_TYPE_OPERATION_COUNT = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetsTypeImpl <em>Assets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetsTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetsType()
	 * @generated
	 */
	int ASSETS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE__ASSET = 0;

	/**
	 * The number of structural features of the '<em>Assets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl <em>Asset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Asset Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ASSET_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ASSET = 1;

	/**
	 * The feature id for the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__REMOTE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Data Valid End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DATA_VALID_END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Data Valid Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DATA_VALID_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentType1Impl <em>Content Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ContentType1Impl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getContentType1()
	 * @generated
	 */
	int CONTENT_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE1__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Content Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Asset Report Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSET_REPORT_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_REF = 4;

	/**
	 * The feature id for the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_RESOURCE = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfosTypeImpl <em>Extended Infos Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfosTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getExtendedInfosType()
	 * @generated
	 */
	int EXTENDED_INFOS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Extended Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFOS_TYPE__EXTENDED_INFO = 0;

	/**
	 * The number of structural features of the '<em>Extended Infos Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFOS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extended Infos Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFOS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfoTypeImpl <em>Extended Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfoTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getExtendedInfoType()
	 * @generated
	 */
	int EXTENDED_INFO_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFO_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFO_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFO_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Extended Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ObjectRefTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getObjectRefType()
	 * @generated
	 */
	int OBJECT_REF_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE__REF_ID = 0;

	/**
	 * The number of structural features of the '<em>Object Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.RemoteResourceTypeImpl <em>Remote Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.RemoteResourceTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getRemoteResourceType()
	 * @generated
	 */
	int REMOTE_RESOURCE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_RESOURCE_TYPE__HREF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_RESOURCE_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_RESOURCE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Remote Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_RESOURCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remote Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestsTypeImpl <em>Report Requests Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestsTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportRequestsType()
	 * @generated
	 */
	int REPORT_REQUESTS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Report Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUESTS_TYPE__REPORT_REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Report Requests Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUESTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Report Requests Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUESTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestTypeImpl <em>Report Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportRequestType()
	 * @generated
	 */
	int REPORT_REQUEST_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE__REMOTE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Report Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Report Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_REQUEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportsTypeImpl <em>Reports Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportsTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportsType()
	 * @generated
	 */
	int REPORTS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE__REPORT = 0;

	/**
	 * The number of structural features of the '<em>Reports Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reports Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl <em>Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl
	 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportType()
	 * @generated
	 */
	int REPORT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__REMOTE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType <em>Asset Report Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Report Collection Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType
	 * @generated
	 */
	EClass getAssetReportCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReportRequests <em>Report Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Requests</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReportRequests()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EReference getAssetReportCollectionType_ReportRequests();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assets</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAssets()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EReference getAssetReportCollectionType_Assets();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReports <em>Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reports</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReports()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EReference getAssetReportCollectionType_Reports();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getExtendedInfos <em>Extended Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Infos</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getExtendedInfos()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EReference getAssetReportCollectionType_ExtendedInfos();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getId()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EAttribute getAssetReportCollectionType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAnyAttribute()
	 * @see #getAssetReportCollectionType()
	 * @generated
	 */
	EAttribute getAssetReportCollectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetsType <em>Assets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assets Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetsType
	 * @generated
	 */
	EClass getAssetsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetsType#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetsType#getAsset()
	 * @see #getAssetsType()
	 * @generated
	 */
	EReference getAssetsType_Asset();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType
	 * @generated
	 */
	EClass getAssetType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAssetGroup <em>Asset Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Asset Group</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAssetGroup()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_AssetGroup();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAsset()
	 * @see #getAssetType()
	 * @generated
	 */
	EReference getAssetType_Asset();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getRemoteResource <em>Remote Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Resource</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType#getRemoteResource()
	 * @see #getAssetType()
	 * @generated
	 */
	EReference getAssetType_RemoteResource();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType#getId()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAnyAttribute()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAny()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Any();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidEndDate <em>Data Valid End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Valid End Date</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidEndDate()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_DataValidEndDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidStartDate <em>Data Valid Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Valid Start Date</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidStartDate()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_DataValidStartDate();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAnyAttribute()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType1 <em>Content Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type1</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType1
	 * @generated
	 */
	EClass getContentType1();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType1#getAny()
	 * @see #getContentType1()
	 * @generated
	 */
	EAttribute getContentType1_Any();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType1#getAnyAttribute()
	 * @see #getContentType1()
	 * @generated
	 */
	EAttribute getContentType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getAssetReportCollection <em>Asset Report Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset Report Collection</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getAssetReportCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssetReportCollection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getObjectRef <em>Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Ref</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getObjectRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getRemoteResource <em>Remote Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Resource</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getRemoteResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteResource();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType <em>Extended Infos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Infos Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType
	 * @generated
	 */
	EClass getExtendedInfosType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType#getExtendedInfo <em>Extended Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Info</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType#getExtendedInfo()
	 * @see #getExtendedInfosType()
	 * @generated
	 */
	EReference getExtendedInfosType_ExtendedInfo();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType <em>Extended Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Info Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType
	 * @generated
	 */
	EClass getExtendedInfoType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getAny()
	 * @see #getExtendedInfoType()
	 * @generated
	 */
	EAttribute getExtendedInfoType_Any();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getId()
	 * @see #getExtendedInfoType()
	 * @generated
	 */
	EAttribute getExtendedInfoType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType#getAnyAttribute()
	 * @see #getExtendedInfoType()
	 * @generated
	 */
	EAttribute getExtendedInfoType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType
	 * @generated
	 */
	EClass getObjectRefType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType#getRefId()
	 * @see #getObjectRefType()
	 * @generated
	 */
	EAttribute getObjectRefType_RefId();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType <em>Remote Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Resource Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType
	 * @generated
	 */
	EClass getRemoteResourceType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getHref()
	 * @see #getRemoteResourceType()
	 * @generated
	 */
	EAttribute getRemoteResourceType_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getType()
	 * @see #getRemoteResourceType()
	 * @generated
	 */
	EAttribute getRemoteResourceType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType#getAnyAttribute()
	 * @see #getRemoteResourceType()
	 * @generated
	 */
	EAttribute getRemoteResourceType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType <em>Report Requests Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Requests Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType
	 * @generated
	 */
	EClass getReportRequestsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType#getReportRequest <em>Report Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Request</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType#getReportRequest()
	 * @see #getReportRequestsType()
	 * @generated
	 */
	EReference getReportRequestsType_ReportRequest();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType <em>Report Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Request Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType
	 * @generated
	 */
	EClass getReportRequestType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getContent()
	 * @see #getReportRequestType()
	 * @generated
	 */
	EReference getReportRequestType_Content();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getRemoteResource <em>Remote Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Resource</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getRemoteResource()
	 * @see #getReportRequestType()
	 * @generated
	 */
	EReference getReportRequestType_RemoteResource();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getId()
	 * @see #getReportRequestType()
	 * @generated
	 */
	EAttribute getReportRequestType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType#getAnyAttribute()
	 * @see #getReportRequestType()
	 * @generated
	 */
	EAttribute getReportRequestType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportsType <em>Reports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reports Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportsType
	 * @generated
	 */
	EClass getReportsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportsType#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportsType#getReport()
	 * @see #getReportsType()
	 * @generated
	 */
	EReference getReportsType_Report();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType <em>Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Type</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType
	 * @generated
	 */
	EClass getReportType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType#getContent()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_Content();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getRemoteResource <em>Remote Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Resource</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType#getRemoteResource()
	 * @see #getReportType()
	 * @generated
	 */
	EReference getReportType_RemoteResource();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType#getId()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType#getAnyAttribute()
	 * @see #getReportType()
	 * @generated
	 */
	EAttribute getReportType_AnyAttribute();

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
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl <em>Asset Report Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetReportCollectionType()
		 * @generated
		 */
		EClass ASSET_REPORT_COLLECTION_TYPE = eINSTANCE.getAssetReportCollectionType();

		/**
		 * The meta object literal for the '<em><b>Report Requests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS = eINSTANCE.getAssetReportCollectionType_ReportRequests();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_REPORT_COLLECTION_TYPE__ASSETS = eINSTANCE.getAssetReportCollectionType_Assets();

		/**
		 * The meta object literal for the '<em><b>Reports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_REPORT_COLLECTION_TYPE__REPORTS = eINSTANCE.getAssetReportCollectionType_Reports();

		/**
		 * The meta object literal for the '<em><b>Extended Infos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS = eINSTANCE.getAssetReportCollectionType_ExtendedInfos();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_REPORT_COLLECTION_TYPE__ID = eINSTANCE.getAssetReportCollectionType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAssetReportCollectionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetsTypeImpl <em>Assets Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetsTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetsType()
		 * @generated
		 */
		EClass ASSETS_TYPE = eINSTANCE.getAssetsType();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSETS_TYPE__ASSET = eINSTANCE.getAssetsType_Asset();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl <em>Asset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getAssetType()
		 * @generated
		 */
		EClass ASSET_TYPE = eINSTANCE.getAssetType();

		/**
		 * The meta object literal for the '<em><b>Asset Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_TYPE__ASSET_GROUP = eINSTANCE.getAssetType_AssetGroup();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_TYPE__ASSET = eINSTANCE.getAssetType_Asset();

		/**
		 * The meta object literal for the '<em><b>Remote Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_TYPE__REMOTE_RESOURCE = eINSTANCE.getAssetType_RemoteResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_TYPE__ID = eINSTANCE.getAssetType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_TYPE__ANY_ATTRIBUTE = eINSTANCE.getAssetType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__ANY = eINSTANCE.getContentType_Any();

		/**
		 * The meta object literal for the '<em><b>Data Valid End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DATA_VALID_END_DATE = eINSTANCE.getContentType_DataValidEndDate();

		/**
		 * The meta object literal for the '<em><b>Data Valid Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DATA_VALID_START_DATE = eINSTANCE.getContentType_DataValidStartDate();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getContentType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentType1Impl <em>Content Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ContentType1Impl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getContentType1()
		 * @generated
		 */
		EClass CONTENT_TYPE1 = eINSTANCE.getContentType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE1__ANY = eINSTANCE.getContentType1_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getContentType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Asset Report Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSET_REPORT_COLLECTION = eINSTANCE.getDocumentRoot_AssetReportCollection();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_REF = eINSTANCE.getDocumentRoot_ObjectRef();

		/**
		 * The meta object literal for the '<em><b>Remote Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_RESOURCE = eINSTANCE.getDocumentRoot_RemoteResource();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfosTypeImpl <em>Extended Infos Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfosTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getExtendedInfosType()
		 * @generated
		 */
		EClass EXTENDED_INFOS_TYPE = eINSTANCE.getExtendedInfosType();

		/**
		 * The meta object literal for the '<em><b>Extended Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_INFOS_TYPE__EXTENDED_INFO = eINSTANCE.getExtendedInfosType_ExtendedInfo();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfoTypeImpl <em>Extended Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfoTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getExtendedInfoType()
		 * @generated
		 */
		EClass EXTENDED_INFO_TYPE = eINSTANCE.getExtendedInfoType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_INFO_TYPE__ANY = eINSTANCE.getExtendedInfoType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_INFO_TYPE__ID = eINSTANCE.getExtendedInfoType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_INFO_TYPE__ANY_ATTRIBUTE = eINSTANCE.getExtendedInfoType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ObjectRefTypeImpl <em>Object Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ObjectRefTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getObjectRefType()
		 * @generated
		 */
		EClass OBJECT_REF_TYPE = eINSTANCE.getObjectRefType();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REF_TYPE__REF_ID = eINSTANCE.getObjectRefType_RefId();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.RemoteResourceTypeImpl <em>Remote Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.RemoteResourceTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getRemoteResourceType()
		 * @generated
		 */
		EClass REMOTE_RESOURCE_TYPE = eINSTANCE.getRemoteResourceType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_RESOURCE_TYPE__HREF = eINSTANCE.getRemoteResourceType_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_RESOURCE_TYPE__TYPE = eINSTANCE.getRemoteResourceType_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_RESOURCE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getRemoteResourceType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestsTypeImpl <em>Report Requests Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestsTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportRequestsType()
		 * @generated
		 */
		EClass REPORT_REQUESTS_TYPE = eINSTANCE.getReportRequestsType();

		/**
		 * The meta object literal for the '<em><b>Report Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_REQUESTS_TYPE__REPORT_REQUEST = eINSTANCE.getReportRequestsType_ReportRequest();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestTypeImpl <em>Report Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportRequestType()
		 * @generated
		 */
		EClass REPORT_REQUEST_TYPE = eINSTANCE.getReportRequestType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_REQUEST_TYPE__CONTENT = eINSTANCE.getReportRequestType_Content();

		/**
		 * The meta object literal for the '<em><b>Remote Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_REQUEST_TYPE__REMOTE_RESOURCE = eINSTANCE.getReportRequestType_RemoteResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REQUEST_TYPE__ID = eINSTANCE.getReportRequestType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_REQUEST_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReportRequestType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportsTypeImpl <em>Reports Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportsTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportsType()
		 * @generated
		 */
		EClass REPORTS_TYPE = eINSTANCE.getReportsType();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORTS_TYPE__REPORT = eINSTANCE.getReportsType_Report();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl <em>Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl
		 * @see gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl#getReportType()
		 * @generated
		 */
		EClass REPORT_TYPE = eINSTANCE.getReportType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__CONTENT = eINSTANCE.getReportType_Content();

		/**
		 * The meta object literal for the '<em><b>Remote Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_TYPE__REMOTE_RESOURCE = eINSTANCE.getReportType_RemoteResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ID = eINSTANCE.getReportType_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReportType_AnyAttribute();

	}

} //_1Package
