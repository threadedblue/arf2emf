/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- end-model-doc -->
 * @see gov.nist.scap.schema.asset.identification._1._1Factory
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
	String eNS_URI = "http://scap.nist.gov/schema/asset-identification/1.1";

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
	_1Package eINSTANCE = gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetsTypeImpl <em>Assets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetsTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetsType()
	 * @generated
	 */
	int ASSETS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE__RELATIONSHIPS = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE__ASSET = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE_FEATURE_COUNT = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSETS_TYPE_OPERATION_COUNT = gov.nist.scap.schema.reporting.core._1._1Package.RELATIONSHIPS_CONTAINER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetIdentificationTypeImpl <em>Asset Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetIdentificationTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetIdentificationType()
	 * @generated
	 */
	int ASSET_IDENTIFICATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_IDENTIFICATION_TYPE__RELATIONSHIPS = ASSETS_TYPE__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_IDENTIFICATION_TYPE__ASSET = ASSETS_TYPE__ASSET;

	/**
	 * The feature id for the '<em><b>Asset Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_IDENTIFICATION_TYPE__ASSET_REF = ASSETS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asset Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_IDENTIFICATION_TYPE_FEATURE_COUNT = ASSETS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asset Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_IDENTIFICATION_TYPE_OPERATION_COUNT = ASSETS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetTypeImpl <em>Asset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetType()
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl <em>Asset Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetType1()
	 * @generated
	 */
	int ASSET_TYPE1 = 3;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1__SYNTHETIC_ID = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1__EXTENDED_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Asset Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.BirthdateTypeImpl <em>Birthdate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.BirthdateTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getBirthdateType()
	 * @generated
	 */
	int BIRTHDATE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Birthdate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Birthdate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIRTHDATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CidrType1Impl <em>Cidr Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.CidrType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCidrType1()
	 * @generated
	 */
	int CIDR_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Cidr Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cidr Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIDR_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CircuitNameTypeImpl <em>Circuit Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.CircuitNameTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCircuitNameType()
	 * @generated
	 */
	int CIRCUIT_NAME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Circuit Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Circuit Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ItAssetTypeImpl <em>It Asset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ItAssetTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getItAssetType()
	 * @generated
	 */
	int IT_ASSET_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE__SYNTHETIC_ID = ASSET_TYPE1__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE__LOCATIONS = ASSET_TYPE1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE__EXTENDED_INFORMATION = ASSET_TYPE1__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE__TIMESTAMP = ASSET_TYPE1__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>It Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE_FEATURE_COUNT = ASSET_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>It Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_ASSET_TYPE_OPERATION_COUNT = ASSET_TYPE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CircuitTypeImpl <em>Circuit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.CircuitTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCircuitType()
	 * @generated
	 */
	int CIRCUIT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Circuit Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE__CIRCUIT_NAME = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circuit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circuit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl <em>Computing Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getComputingDeviceType()
	 * @generated
	 */
	int COMPUTING_DEVICE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Distinguished Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__CPE = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__CONNECTIONS = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__FQDN = IT_ASSET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__HOSTNAME = IT_ASSET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Motherboard Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID = IT_ASSET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Computing Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Computing Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ConnectionsTypeImpl <em>Connections Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ConnectionsTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getConnectionsType()
	 * @generated
	 */
	int CONNECTIONS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_TYPE__CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connections Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connections Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CpeType1Impl <em>Cpe Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.CpeType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCpeType1()
	 * @generated
	 */
	int CPE_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Cpe Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cpe Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.DatabaseTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__INSTANCE_NAME = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.DataTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SYNTHETIC_ID = ASSET_TYPE1__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LOCATIONS = ASSET_TYPE1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENDED_INFORMATION = ASSET_TYPE1__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TIMESTAMP = ASSET_TYPE1__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ASSET_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ASSET_TYPE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DistinguishedNameTypeImpl <em>Distinguished Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.DistinguishedNameTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDistinguishedNameType()
	 * @generated
	 */
	int DISTINGUISHED_NAME_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Distinguished Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Distinguished Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINGUISHED_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

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
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSET = 3;

	/**
	 * The feature id for the '<em><b>Asset Related</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSET_RELATED = 4;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSETS = 5;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CIRCUIT = 6;

	/**
	 * The feature id for the '<em><b>It Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IT_ASSET = 7;

	/**
	 * The feature id for the '<em><b>Computing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPUTING_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Cpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CPE = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA = 10;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FQDN = 13;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IP_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 15;

	/**
	 * The feature id for the '<em><b>Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Location Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_POINT = 17;

	/**
	 * The feature id for the '<em><b>Location Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_REGION = 18;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATIONS = 19;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK = 20;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 21;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON = 22;

	/**
	 * The feature id for the '<em><b>Served By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVED_BY = 23;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE = 25;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYNTHETIC_ID = 26;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM = 27;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE_NUMBER = 28;

	/**
	 * The feature id for the '<em><b>Website</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSITE = 29;

	/**
	 * The feature id for the '<em><b>Website Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSITE_URL = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 31;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMESTAMP = 32;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootTypeImpl <em>Document Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.DocumentRootTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDocumentRootType()
	 * @generated
	 */
	int DOCUMENT_ROOT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Document Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.EmailAddressTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getEmailAddressType()
	 * @generated
	 */
	int EMAIL_ADDRESS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Email Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Email Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ExtendedInformationTypeImpl <em>Extended Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ExtendedInformationTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getExtendedInformationType()
	 * @generated
	 */
	int EXTENDED_INFORMATION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFORMATION_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extended Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFORMATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extended Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.FqdnTypeImpl <em>Fqdn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.FqdnTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getFqdnType()
	 * @generated
	 */
	int FQDN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Fqdn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fqdn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FQDN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.HostnameType1Impl <em>Hostname Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.HostnameType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostnameType1()
	 * @generated
	 */
	int HOSTNAME_TYPE1 = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Hostname Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hostname Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNAME_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl <em>Host Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostType()
	 * @generated
	 */
	int HOST_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__FQDN = 0;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__IP_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.InstallationIdTypeImpl <em>Installation Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.InstallationIdTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getInstallationIdType()
	 * @generated
	 */
	int INSTALLATION_ID_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Installation Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Installation Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.InstanceNameTypeImpl <em>Instance Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.InstanceNameTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getInstanceNameType()
	 * @generated
	 */
	int INSTANCE_NAME_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Instance Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Instance Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl <em>Ip Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpAddressType()
	 * @generated
	 */
	int IP_ADDRESS_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Ip V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDRESS_TYPE__IP_V4 = 0;

	/**
	 * The feature id for the '<em><b>Ip V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDRESS_TYPE__IP_V6 = 1;

	/**
	 * The number of structural features of the '<em>Ip Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDRESS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ip Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl <em>Ip Net Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpNetRangeType()
	 * @generated
	 */
	int IP_NET_RANGE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Ip Net Range Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NET_RANGE_TYPE__IP_NET_RANGE_START = 0;

	/**
	 * The feature id for the '<em><b>Ip Net Range End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NET_RANGE_TYPE__IP_NET_RANGE_END = 1;

	/**
	 * The number of structural features of the '<em>Ip Net Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NET_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ip Net Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NET_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpV4Type1Impl <em>Ip V4 Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.IpV4Type1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpV4Type1()
	 * @generated
	 */
	int IP_V4_TYPE1 = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Ip V4 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ip V4 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V4_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpV6Type1Impl <em>Ip V6 Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.IpV6Type1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpV6Type1()
	 * @generated
	 */
	int IP_V6_TYPE1 = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Ip V6 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ip V6 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_V6_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LicenseTypeImpl <em>License Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.LicenseTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLicenseType()
	 * @generated
	 */
	int LICENSE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>License Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>License Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocaleType1Impl <em>Locale Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.LocaleType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocaleType1()
	 * @generated
	 */
	int LOCALE_TYPE1 = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Locale Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Locale Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationPointTypeImpl <em>Location Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationPointTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationPointType()
	 * @generated
	 */
	int LOCATION_POINT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__ELEVATION = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__RADIUS = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Location Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Location Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationRegionTypeImpl <em>Location Region Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationRegionTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationRegionType()
	 * @generated
	 */
	int LOCATION_REGION_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Location Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REGION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationsType()
	 * @generated
	 */
	int LOCATIONS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE__LOCATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Locations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Locations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.MacAddressType1Impl <em>Mac Address Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.MacAddressType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMacAddressType1()
	 * @generated
	 */
	int MAC_ADDRESS_TYPE1 = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mac Address Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mac Address Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.MotherboardGuidTypeImpl <em>Motherboard Guid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.MotherboardGuidTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMotherboardGuidType()
	 * @generated
	 */
	int MOTHERBOARD_GUID_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Motherboard Guid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Motherboard Guid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_GUID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl <em>Network Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkInterfaceType()
	 * @generated
	 */
	int NETWORK_INTERFACE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE__IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE__MAC_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE__URL = 2;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE__SUBNET_MASK = 3;

	/**
	 * The feature id for the '<em><b>Default Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE = 4;

	/**
	 * The number of structural features of the '<em>Network Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkNameTypeImpl <em>Network Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkNameTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkNameType()
	 * @generated
	 */
	int NETWORK_NAME_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Network Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NETWORK_NAME = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip Net Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__IP_NET_RANGE = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__CIDR = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__SYNTHETIC_ID = ASSET_TYPE1__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__LOCATIONS = ASSET_TYPE1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__EXTENDED_INFORMATION = ASSET_TYPE1__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__TIMESTAMP = ASSET_TYPE1__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Organisation Name Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS = ASSET_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__EMAIL_ADDRESS = ASSET_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__TELEPHONE_NUMBER = ASSET_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Website Url</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__WEBSITE_URL = ASSET_TYPE1_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = ASSET_TYPE1_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_OPERATION_COUNT = ASSET_TYPE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl <em>Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPersonType()
	 * @generated
	 */
	int PERSON_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__SYNTHETIC_ID = ASSET_TYPE1__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__LOCATIONS = ASSET_TYPE1__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__EXTENDED_INFORMATION = ASSET_TYPE1__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__TIMESTAMP = ASSET_TYPE1__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__PERSON_NAME = ASSET_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__EMAIL_ADDRESS = ASSET_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__TELEPHONE_NUMBER = ASSET_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__BIRTHDATE = ASSET_TYPE1_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = ASSET_TYPE1_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_OPERATION_COUNT = ASSET_TYPE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PortRangeTypeImpl <em>Port Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.PortRangeTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortRangeType()
	 * @generated
	 */
	int PORT_RANGE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE__UPPER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Port Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Port Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PortType1Impl <em>Port Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.PortType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortType1()
	 * @generated
	 */
	int PORT_TYPE1 = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Port Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ProtocolTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__HOST = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PORT = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PORT_RANGE = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PROTOCOL = IT_ASSET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl <em>Software Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSoftwareType()
	 * @generated
	 */
	int SOFTWARE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Installation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__INSTALLATION_ID = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__CPE = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__LICENSE = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Software Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Software Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SyntheticIdTypeImpl <em>Synthetic Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.SyntheticIdTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSyntheticIdType()
	 * @generated
	 */
	int SYNTHETIC_ID_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_ID_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_ID_TYPE__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Synthetic Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_ID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Synthetic Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SystemNameTypeImpl <em>System Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.SystemNameTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSystemNameType()
	 * @generated
	 */
	int SYSTEM_NAME_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>System Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__SYSTEM_NAME = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__VERSION = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.TelephoneNumberType1Impl <em>Telephone Number Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.TelephoneNumberType1Impl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getTelephoneNumberType1()
	 * @generated
	 */
	int TELEPHONE_NUMBER_TYPE1 = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Telephone Number Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Telephone Number Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.UrlTypeImpl <em>Url Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.UrlTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getUrlType()
	 * @generated
	 */
	int URL_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.VersionTypeImpl <em>Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.VersionTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl <em>Website Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getWebsiteType()
	 * @generated
	 */
	int WEBSITE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__SYNTHETIC_ID = IT_ASSET_TYPE__SYNTHETIC_ID;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__LOCATIONS = IT_ASSET_TYPE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__EXTENDED_INFORMATION = IT_ASSET_TYPE__EXTENDED_INFORMATION;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__TIMESTAMP = IT_ASSET_TYPE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Document Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__DOCUMENT_ROOT = IT_ASSET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE__LOCALE = IT_ASSET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Website Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE_FEATURE_COUNT = IT_ASSET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Website Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_TYPE_OPERATION_COUNT = IT_ASSET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteUrlTypeImpl <em>Website Url Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl.WebsiteUrlTypeImpl
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getWebsiteUrlType()
	 * @generated
	 */
	int WEBSITE_URL_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Website Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Website Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Cidr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCidrType()
	 * @generated
	 */
	int CIDR_TYPE = 53;

	/**
	 * The meta object id for the '<em>Cpe Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCpeType()
	 * @generated
	 */
	int CPE_TYPE = 54;

	/**
	 * The meta object id for the '<em>Hostname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostnameType()
	 * @generated
	 */
	int HOSTNAME_TYPE = 55;

	/**
	 * The meta object id for the '<em>Ipv4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpv4Type()
	 * @generated
	 */
	int IPV4_TYPE = 56;

	/**
	 * The meta object id for the '<em>Ipv6 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpv6Type()
	 * @generated
	 */
	int IPV6_TYPE = 57;

	/**
	 * The meta object id for the '<em>Latitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLatitudeType()
	 * @generated
	 */
	int LATITUDE_TYPE = 58;

	/**
	 * The meta object id for the '<em>Latitude Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLatitudeTypeObject()
	 * @generated
	 */
	int LATITUDE_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Locale Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocaleType()
	 * @generated
	 */
	int LOCALE_TYPE = 60;

	/**
	 * The meta object id for the '<em>Longitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLongitudeType()
	 * @generated
	 */
	int LONGITUDE_TYPE = 61;

	/**
	 * The meta object id for the '<em>Longitude Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLongitudeTypeObject()
	 * @generated
	 */
	int LONGITUDE_TYPE_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Mac Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMacAddressType()
	 * @generated
	 */
	int MAC_ADDRESS_TYPE = 63;

	/**
	 * The meta object id for the '<em>Port Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 64;

	/**
	 * The meta object id for the '<em>Radius Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getRadiusType()
	 * @generated
	 */
	int RADIUS_TYPE = 65;

	/**
	 * The meta object id for the '<em>Radius Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getRadiusTypeObject()
	 * @generated
	 */
	int RADIUS_TYPE_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Telephone Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getTelephoneNumberType()
	 * @generated
	 */
	int TELEPHONE_NUMBER_TYPE = 67;


	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.AssetIdentificationType <em>Asset Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Identification Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetIdentificationType
	 * @generated
	 */
	EClass getAssetIdentificationType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.AssetIdentificationType#getAssetRef <em>Asset Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Ref</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetIdentificationType#getAssetRef()
	 * @see #getAssetIdentificationType()
	 * @generated
	 */
	EAttribute getAssetIdentificationType_AssetRef();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.AssetsType <em>Assets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assets Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetsType
	 * @generated
	 */
	EClass getAssetsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.AssetsType#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetsType#getAsset()
	 * @see #getAssetsType()
	 * @generated
	 */
	EReference getAssetsType_Asset();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType
	 * @generated
	 */
	EClass getAssetType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.AssetType#getAssetGroup <em>Asset Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Asset Group</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType#getAssetGroup()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_AssetGroup();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.AssetType#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType#getAsset()
	 * @see #getAssetType()
	 * @generated
	 */
	EReference getAssetType_Asset();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.AssetType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType#getId()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.AssetType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType#getAnyAttribute()
	 * @see #getAssetType()
	 * @generated
	 */
	EAttribute getAssetType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.AssetType1 <em>Asset Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1
	 * @generated
	 */
	EClass getAssetType1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getSyntheticId <em>Synthetic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synthetic Id</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1#getSyntheticId()
	 * @see #getAssetType1()
	 * @generated
	 */
	EReference getAssetType1_SyntheticId();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locations</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1#getLocations()
	 * @see #getAssetType1()
	 * @generated
	 */
	EReference getAssetType1_Locations();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getExtendedInformation <em>Extended Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Information</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1#getExtendedInformation()
	 * @see #getAssetType1()
	 * @generated
	 */
	EReference getAssetType1_ExtendedInformation();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1#getTimestamp()
	 * @see #getAssetType1()
	 * @generated
	 */
	EAttribute getAssetType1_Timestamp();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType <em>Birthdate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Birthdate Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType
	 * @generated
	 */
	EClass getBirthdateType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType#getValue()
	 * @see #getBirthdateType()
	 * @generated
	 */
	EAttribute getBirthdateType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType#getSource()
	 * @see #getBirthdateType()
	 * @generated
	 */
	EAttribute getBirthdateType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType#getTimestamp()
	 * @see #getBirthdateType()
	 * @generated
	 */
	EAttribute getBirthdateType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType#getAnyAttribute()
	 * @see #getBirthdateType()
	 * @generated
	 */
	EAttribute getBirthdateType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.CidrType1 <em>Cidr Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cidr Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1
	 * @generated
	 */
	EClass getCidrType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CidrType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1#getValue()
	 * @see #getCidrType1()
	 * @generated
	 */
	EAttribute getCidrType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CidrType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1#getSource()
	 * @see #getCidrType1()
	 * @generated
	 */
	EAttribute getCidrType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CidrType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1#getTimestamp()
	 * @see #getCidrType1()
	 * @generated
	 */
	EAttribute getCidrType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.CidrType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1#getAnyAttribute()
	 * @see #getCidrType1()
	 * @generated
	 */
	EAttribute getCidrType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType <em>Circuit Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Name Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType
	 * @generated
	 */
	EClass getCircuitNameType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType#getValue()
	 * @see #getCircuitNameType()
	 * @generated
	 */
	EAttribute getCircuitNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType#getSource()
	 * @see #getCircuitNameType()
	 * @generated
	 */
	EAttribute getCircuitNameType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType#getTimestamp()
	 * @see #getCircuitNameType()
	 * @generated
	 */
	EAttribute getCircuitNameType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType#getAnyAttribute()
	 * @see #getCircuitNameType()
	 * @generated
	 */
	EAttribute getCircuitNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.CircuitType <em>Circuit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitType
	 * @generated
	 */
	EClass getCircuitType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.CircuitType#getCircuitName <em>Circuit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circuit Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitType#getCircuitName()
	 * @see #getCircuitType()
	 * @generated
	 */
	EReference getCircuitType_CircuitName();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType <em>Computing Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Device Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType
	 * @generated
	 */
	EClass getComputingDeviceType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getDistinguishedName <em>Distinguished Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distinguished Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getDistinguishedName()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_DistinguishedName();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getCpe <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cpe</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getCpe()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_Cpe();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connections</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getConnections()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getFqdn <em>Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fqdn</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getFqdn()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_Fqdn();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hostname</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getHostname()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_Hostname();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getMotherboardGuid <em>Motherboard Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motherboard Guid</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getMotherboardGuid()
	 * @see #getComputingDeviceType()
	 * @generated
	 */
	EReference getComputingDeviceType_MotherboardGuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ConnectionsType <em>Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ConnectionsType
	 * @generated
	 */
	EClass getConnectionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.ConnectionsType#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ConnectionsType#getConnection()
	 * @see #getConnectionsType()
	 * @generated
	 */
	EReference getConnectionsType_Connection();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.CpeType1 <em>Cpe Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpe Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1
	 * @generated
	 */
	EClass getCpeType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CpeType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1#getValue()
	 * @see #getCpeType1()
	 * @generated
	 */
	EAttribute getCpeType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CpeType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1#getSource()
	 * @see #getCpeType1()
	 * @generated
	 */
	EAttribute getCpeType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.CpeType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1#getTimestamp()
	 * @see #getCpeType1()
	 * @generated
	 */
	EAttribute getCpeType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.CpeType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1#getAnyAttribute()
	 * @see #getCpeType1()
	 * @generated
	 */
	EAttribute getCpeType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DatabaseType
	 * @generated
	 */
	EClass getDatabaseType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DatabaseType#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DatabaseType#getInstanceName()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EReference getDatabaseType_InstanceName();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType <em>Distinguished Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinguished Name Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType
	 * @generated
	 */
	EClass getDistinguishedNameType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getValue()
	 * @see #getDistinguishedNameType()
	 * @generated
	 */
	EAttribute getDistinguishedNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getSource()
	 * @see #getDistinguishedNameType()
	 * @generated
	 */
	EAttribute getDistinguishedNameType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getTimestamp()
	 * @see #getDistinguishedNameType()
	 * @generated
	 */
	EAttribute getDistinguishedNameType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType#getAnyAttribute()
	 * @see #getDistinguishedNameType()
	 * @generated
	 */
	EAttribute getDistinguishedNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAsset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Asset();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssetRelated <em>Asset Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset Related</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssetRelated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssetRelated();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assets</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Assets();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circuit</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCircuit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Circuit();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getItAsset <em>It Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>It Asset</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getItAsset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItAsset();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getComputingDevice <em>Computing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computing Device</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getComputingDevice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComputingDevice();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCpe <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpe</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCpe()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cpe();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Data();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getDatabase()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Database();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Email Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getEmailAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmailAddress();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getFqdn <em>Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fqdn</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getFqdn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fqdn();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getIpAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IpAddress();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationAddress <em>Location Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocationAddress();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationPoint <em>Location Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Point</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocationPoint();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationRegion <em>Location Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Region</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocationRegion();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locations</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Locations();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getNetwork()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Network();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Person();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getServedBy <em>Served By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Served By</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getServedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServedBy();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSoftware()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Software();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSyntheticId <em>Synthetic Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synthetic Id</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSyntheticId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SyntheticId();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_System();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telephone Number</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTelephoneNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Website</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Website();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsiteUrl <em>Website Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Website Url</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsiteUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WebsiteUrl();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTimestamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Timestamp();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType <em>Document Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType
	 * @generated
	 */
	EClass getDocumentRootType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType#getValue()
	 * @see #getDocumentRootType()
	 * @generated
	 */
	EAttribute getDocumentRootType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType#getSource()
	 * @see #getDocumentRootType()
	 * @generated
	 */
	EAttribute getDocumentRootType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType#getTimestamp()
	 * @see #getDocumentRootType()
	 * @generated
	 */
	EAttribute getDocumentRootType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType#getAnyAttribute()
	 * @see #getDocumentRootType()
	 * @generated
	 */
	EAttribute getDocumentRootType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType
	 * @generated
	 */
	EClass getEmailAddressType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType#getValue()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType#getSource()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType#getTimestamp()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType#getAnyAttribute()
	 * @see #getEmailAddressType()
	 * @generated
	 */
	EAttribute getEmailAddressType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ExtendedInformationType <em>Extended Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Information Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ExtendedInformationType
	 * @generated
	 */
	EClass getExtendedInformationType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.ExtendedInformationType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ExtendedInformationType#getAny()
	 * @see #getExtendedInformationType()
	 * @generated
	 */
	EAttribute getExtendedInformationType_Any();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.FqdnType <em>Fqdn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fqdn Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType
	 * @generated
	 */
	EClass getFqdnType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.FqdnType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType#getValue()
	 * @see #getFqdnType()
	 * @generated
	 */
	EAttribute getFqdnType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.FqdnType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType#getSource()
	 * @see #getFqdnType()
	 * @generated
	 */
	EAttribute getFqdnType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.FqdnType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType#getTimestamp()
	 * @see #getFqdnType()
	 * @generated
	 */
	EAttribute getFqdnType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.FqdnType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType#getAnyAttribute()
	 * @see #getFqdnType()
	 * @generated
	 */
	EAttribute getFqdnType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1 <em>Hostname Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostname Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1
	 * @generated
	 */
	EClass getHostnameType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1#getValue()
	 * @see #getHostnameType1()
	 * @generated
	 */
	EAttribute getHostnameType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1#getSource()
	 * @see #getHostnameType1()
	 * @generated
	 */
	EAttribute getHostnameType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1#getTimestamp()
	 * @see #getHostnameType1()
	 * @generated
	 */
	EAttribute getHostnameType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1#getAnyAttribute()
	 * @see #getHostnameType1()
	 * @generated
	 */
	EAttribute getHostnameType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostType
	 * @generated
	 */
	EClass getHostType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.HostType#getFqdn <em>Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fqdn</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostType#getFqdn()
	 * @see #getHostType()
	 * @generated
	 */
	EReference getHostType_Fqdn();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.HostType#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.HostType#getIpAddress()
	 * @see #getHostType()
	 * @generated
	 */
	EReference getHostType_IpAddress();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType <em>Installation Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Id Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType
	 * @generated
	 */
	EClass getInstallationIdType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType#getValue()
	 * @see #getInstallationIdType()
	 * @generated
	 */
	EAttribute getInstallationIdType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType#getSource()
	 * @see #getInstallationIdType()
	 * @generated
	 */
	EAttribute getInstallationIdType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType#getTimestamp()
	 * @see #getInstallationIdType()
	 * @generated
	 */
	EAttribute getInstallationIdType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType#getAnyAttribute()
	 * @see #getInstallationIdType()
	 * @generated
	 */
	EAttribute getInstallationIdType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType <em>Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Name Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType
	 * @generated
	 */
	EClass getInstanceNameType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType#getValue()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType#getSource()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType#getTimestamp()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType#getAnyAttribute()
	 * @see #getInstanceNameType()
	 * @generated
	 */
	EAttribute getInstanceNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType <em>Ip Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip Address Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpAddressType
	 * @generated
	 */
	EClass getIpAddressType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV4 <em>Ip V4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V4</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV4()
	 * @see #getIpAddressType()
	 * @generated
	 */
	EReference getIpAddressType_IpV4();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV6 <em>Ip V6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V6</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV6()
	 * @see #getIpAddressType()
	 * @generated
	 */
	EReference getIpAddressType_IpV6();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType <em>Ip Net Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip Net Range Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpNetRangeType
	 * @generated
	 */
	EClass getIpNetRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeStart <em>Ip Net Range Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Net Range Start</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeStart()
	 * @see #getIpNetRangeType()
	 * @generated
	 */
	EReference getIpNetRangeType_IpNetRangeStart();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeEnd <em>Ip Net Range End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Net Range End</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeEnd()
	 * @see #getIpNetRangeType()
	 * @generated
	 */
	EReference getIpNetRangeType_IpNetRangeEnd();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1 <em>Ip V4 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip V4 Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1
	 * @generated
	 */
	EClass getIpV4Type1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1#getValue()
	 * @see #getIpV4Type1()
	 * @generated
	 */
	EAttribute getIpV4Type1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1#getSource()
	 * @see #getIpV4Type1()
	 * @generated
	 */
	EAttribute getIpV4Type1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1#getTimestamp()
	 * @see #getIpV4Type1()
	 * @generated
	 */
	EAttribute getIpV4Type1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1#getAnyAttribute()
	 * @see #getIpV4Type1()
	 * @generated
	 */
	EAttribute getIpV4Type1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1 <em>Ip V6 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip V6 Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1
	 * @generated
	 */
	EClass getIpV6Type1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1#getValue()
	 * @see #getIpV6Type1()
	 * @generated
	 */
	EAttribute getIpV6Type1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1#getSource()
	 * @see #getIpV6Type1()
	 * @generated
	 */
	EAttribute getIpV6Type1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1#getTimestamp()
	 * @see #getIpV6Type1()
	 * @generated
	 */
	EAttribute getIpV6Type1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1#getAnyAttribute()
	 * @see #getIpV6Type1()
	 * @generated
	 */
	EAttribute getIpV6Type1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ItAssetType <em>It Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>It Asset Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ItAssetType
	 * @generated
	 */
	EClass getItAssetType();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.LicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType
	 * @generated
	 */
	EClass getLicenseType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LicenseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType#getValue()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LicenseType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType#getSource()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LicenseType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType#getTimestamp()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.LicenseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType#getAnyAttribute()
	 * @see #getLicenseType()
	 * @generated
	 */
	EAttribute getLicenseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1 <em>Locale Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1
	 * @generated
	 */
	EClass getLocaleType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1#getValue()
	 * @see #getLocaleType1()
	 * @generated
	 */
	EAttribute getLocaleType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1#getSource()
	 * @see #getLocaleType1()
	 * @generated
	 */
	EAttribute getLocaleType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1#getTimestamp()
	 * @see #getLocaleType1()
	 * @generated
	 */
	EAttribute getLocaleType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1#getAnyAttribute()
	 * @see #getLocaleType1()
	 * @generated
	 */
	EAttribute getLocaleType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType <em>Location Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Point Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType
	 * @generated
	 */
	EClass getLocationPointType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Elevation();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Radius();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getSource()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getTimestamp()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType#getAnyAttribute()
	 * @see #getLocationPointType()
	 * @generated
	 */
	EAttribute getLocationPointType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType <em>Location Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Region Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType
	 * @generated
	 */
	EClass getLocationRegionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType#getValue()
	 * @see #getLocationRegionType()
	 * @generated
	 */
	EAttribute getLocationRegionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType#getSource()
	 * @see #getLocationRegionType()
	 * @generated
	 */
	EAttribute getLocationRegionType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType#getTimestamp()
	 * @see #getLocationRegionType()
	 * @generated
	 */
	EAttribute getLocationRegionType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType#getAnyAttribute()
	 * @see #getLocationRegionType()
	 * @generated
	 */
	EAttribute getLocationRegionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.LocationsType <em>Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locations Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationsType
	 * @generated
	 */
	EClass getLocationsType();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.LocationsType#getLocationGroup <em>Location Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Group</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationsType#getLocationGroup()
	 * @see #getLocationsType()
	 * @generated
	 */
	EAttribute getLocationsType_LocationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.LocationsType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationsType#getLocation()
	 * @see #getLocationsType()
	 * @generated
	 */
	EReference getLocationsType_Location();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1 <em>Mac Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Address Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1
	 * @generated
	 */
	EClass getMacAddressType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1#getValue()
	 * @see #getMacAddressType1()
	 * @generated
	 */
	EAttribute getMacAddressType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1#getSource()
	 * @see #getMacAddressType1()
	 * @generated
	 */
	EAttribute getMacAddressType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1#getTimestamp()
	 * @see #getMacAddressType1()
	 * @generated
	 */
	EAttribute getMacAddressType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1#getAnyAttribute()
	 * @see #getMacAddressType1()
	 * @generated
	 */
	EAttribute getMacAddressType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType <em>Motherboard Guid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motherboard Guid Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType
	 * @generated
	 */
	EClass getMotherboardGuidType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getValue()
	 * @see #getMotherboardGuidType()
	 * @generated
	 */
	EAttribute getMotherboardGuidType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getSource()
	 * @see #getMotherboardGuidType()
	 * @generated
	 */
	EAttribute getMotherboardGuidType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getTimestamp()
	 * @see #getMotherboardGuidType()
	 * @generated
	 */
	EAttribute getMotherboardGuidType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType#getAnyAttribute()
	 * @see #getMotherboardGuidType()
	 * @generated
	 */
	EAttribute getMotherboardGuidType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType <em>Network Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType
	 * @generated
	 */
	EClass getNetworkInterfaceType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getIpAddress()
	 * @see #getNetworkInterfaceType()
	 * @generated
	 */
	EReference getNetworkInterfaceType_IpAddress();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getMacAddress()
	 * @see #getNetworkInterfaceType()
	 * @generated
	 */
	EReference getNetworkInterfaceType_MacAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getUrl()
	 * @see #getNetworkInterfaceType()
	 * @generated
	 */
	EReference getNetworkInterfaceType_Url();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getSubnetMask <em>Subnet Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subnet Mask</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getSubnetMask()
	 * @see #getNetworkInterfaceType()
	 * @generated
	 */
	EReference getNetworkInterfaceType_SubnetMask();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getDefaultRoute <em>Default Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Route</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getDefaultRoute()
	 * @see #getNetworkInterfaceType()
	 * @generated
	 */
	EReference getNetworkInterfaceType_DefaultRoute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType <em>Network Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Name Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType
	 * @generated
	 */
	EClass getNetworkNameType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType#getValue()
	 * @see #getNetworkNameType()
	 * @generated
	 */
	EAttribute getNetworkNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType#getSource()
	 * @see #getNetworkNameType()
	 * @generated
	 */
	EAttribute getNetworkNameType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType#getTimestamp()
	 * @see #getNetworkNameType()
	 * @generated
	 */
	EAttribute getNetworkNameType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType#getAnyAttribute()
	 * @see #getNetworkNameType()
	 * @generated
	 */
	EAttribute getNetworkNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getNetworkName <em>Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkType#getNetworkName()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_NetworkName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getIpNetRange <em>Ip Net Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip Net Range</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkType#getIpNetRange()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_IpNetRange();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cidr</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkType#getCidr()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Cidr();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getOrganisationNameDetails <em>Organisation Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation Name Details</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType#getOrganisationNameDetails()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_OrganisationNameDetails();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType#getEmailAddress()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_EmailAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType#getTelephoneNumber()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getWebsiteUrl <em>Website Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Website Url</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType#getWebsiteUrl()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_WebsiteUrl();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType
	 * @generated
	 */
	EClass getPersonType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType#getPersonName()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_PersonName();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType#getEmailAddress()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_EmailAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType#getTelephoneNumber()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birthdate</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType#getBirthdate()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Birthdate();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType <em>Port Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Range Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType
	 * @generated
	 */
	EClass getPortRangeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType#getLowerBound()
	 * @see #getPortRangeType()
	 * @generated
	 */
	EAttribute getPortRangeType_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType#getSource()
	 * @see #getPortRangeType()
	 * @generated
	 */
	EAttribute getPortRangeType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType#getTimestamp()
	 * @see #getPortRangeType()
	 * @generated
	 */
	EAttribute getPortRangeType_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType#getUpperBound()
	 * @see #getPortRangeType()
	 * @generated
	 */
	EAttribute getPortRangeType_UpperBound();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType#getAnyAttribute()
	 * @see #getPortRangeType()
	 * @generated
	 */
	EAttribute getPortRangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.PortType1 <em>Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1
	 * @generated
	 */
	EClass getPortType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1#getValue()
	 * @see #getPortType1()
	 * @generated
	 */
	EAttribute getPortType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1#getSource()
	 * @see #getPortType1()
	 * @generated
	 */
	EAttribute getPortType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.PortType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1#getTimestamp()
	 * @see #getPortType1()
	 * @generated
	 */
	EAttribute getPortType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.PortType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1#getAnyAttribute()
	 * @see #getPortType1()
	 * @generated
	 */
	EAttribute getPortType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType
	 * @generated
	 */
	EClass getProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType#getValue()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType#getSource()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType#getTimestamp()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType#getAnyAttribute()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Host</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType#getHost()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType#getPort()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getPortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Range</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType#getPortRange()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_PortRange();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType#getProtocol()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_Protocol();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SoftwareType
	 * @generated
	 */
	EClass getSoftwareType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getInstallationId <em>Installation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Installation Id</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SoftwareType#getInstallationId()
	 * @see #getSoftwareType()
	 * @generated
	 */
	EReference getSoftwareType_InstallationId();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getCpe <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpe</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SoftwareType#getCpe()
	 * @see #getSoftwareType()
	 * @generated
	 */
	EReference getSoftwareType_Cpe();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>License</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SoftwareType#getLicense()
	 * @see #getSoftwareType()
	 * @generated
	 */
	EReference getSoftwareType_License();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.SyntheticIdType <em>Synthetic Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthetic Id Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SyntheticIdType
	 * @generated
	 */
	EClass getSyntheticIdType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.SyntheticIdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SyntheticIdType#getId()
	 * @see #getSyntheticIdType()
	 * @generated
	 */
	EAttribute getSyntheticIdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.SyntheticIdType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SyntheticIdType#getResource()
	 * @see #getSyntheticIdType()
	 * @generated
	 */
	EAttribute getSyntheticIdType_Resource();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType <em>System Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Name Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType
	 * @generated
	 */
	EClass getSystemNameType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType#getValue()
	 * @see #getSystemNameType()
	 * @generated
	 */
	EAttribute getSystemNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType#getSource()
	 * @see #getSystemNameType()
	 * @generated
	 */
	EAttribute getSystemNameType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType#getTimestamp()
	 * @see #getSystemNameType()
	 * @generated
	 */
	EAttribute getSystemNameType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType#getAnyAttribute()
	 * @see #getSystemNameType()
	 * @generated
	 */
	EAttribute getSystemNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.scap.schema.asset.identification._1.SystemType#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Name</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemType#getSystemName()
	 * @see #getSystemType()
	 * @generated
	 */
	EReference getSystemType_SystemName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.SystemType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemType#getVersion()
	 * @see #getSystemType()
	 * @generated
	 */
	EReference getSystemType_Version();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1 <em>Telephone Number Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number Type1</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1
	 * @generated
	 */
	EClass getTelephoneNumberType1();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getValue()
	 * @see #getTelephoneNumberType1()
	 * @generated
	 */
	EAttribute getTelephoneNumberType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getSource()
	 * @see #getTelephoneNumberType1()
	 * @generated
	 */
	EAttribute getTelephoneNumberType1_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getTimestamp()
	 * @see #getTelephoneNumberType1()
	 * @generated
	 */
	EAttribute getTelephoneNumberType1_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1#getAnyAttribute()
	 * @see #getTelephoneNumberType1()
	 * @generated
	 */
	EAttribute getTelephoneNumberType1_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType
	 * @generated
	 */
	EClass getUrlType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.UrlType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType#getValue()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.UrlType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType#getSource()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.UrlType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType#getTimestamp()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.UrlType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType#getAnyAttribute()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType
	 * @generated
	 */
	EClass getVersionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.VersionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType#getValue()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.VersionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType#getSource()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.VersionType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType#getTimestamp()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.VersionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType#getAnyAttribute()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType <em>Website Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteType
	 * @generated
	 */
	EClass getWebsiteType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Root</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteType#getDocumentRoot()
	 * @see #getWebsiteType()
	 * @generated
	 */
	EReference getWebsiteType_DocumentRoot();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locale</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteType#getLocale()
	 * @see #getWebsiteType()
	 * @generated
	 */
	EReference getWebsiteType_Locale();

	/**
	 * Returns the meta object for class '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType <em>Website Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website Url Type</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType
	 * @generated
	 */
	EClass getWebsiteUrlType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getValue()
	 * @see #getWebsiteUrlType()
	 * @generated
	 */
	EAttribute getWebsiteUrlType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getSource()
	 * @see #getWebsiteUrlType()
	 * @generated
	 */
	EAttribute getWebsiteUrlType_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getTimestamp()
	 * @see #getWebsiteUrlType()
	 * @generated
	 */
	EAttribute getWebsiteUrlType_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType#getAnyAttribute()
	 * @see #getWebsiteUrlType()
	 * @generated
	 */
	EAttribute getWebsiteUrlType_AnyAttribute();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cidr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cidr Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cidr-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))/([0-9]|[1-2][0-9]|3[0-2])'"
	 * @generated
	 */
	EDataType getCidrType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cpe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cpe Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cpe-type' memberTypes='http://cpe.mitre.org/naming/2.0#cpe22Type http://cpe.mitre.org/naming/2.0#cpe23Type'"
	 * @generated
	 */
	EDataType getCpeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hostname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hostname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hostname-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[\\w\\-]+(\\.[\\w\\-]+){0,}'"
	 * @generated
	 */
	EDataType getHostnameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ipv4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ipv4 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ipv4-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))'"
	 * @generated
	 */
	EDataType getIpv4Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ipv6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ipv6 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ipv6-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}'"
	 * @generated
	 */
	EDataType getIpv6Type();

	/**
	 * Returns the meta object for data type '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='latitude_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-90' maxInclusive='90'"
	 * @generated
	 */
	EDataType getLatitudeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Latitude Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='latitude_._type:Object' baseType='latitude_._type'"
	 * @generated
	 */
	EDataType getLatitudeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='locale-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?'"
	 * @generated
	 */
	EDataType getLocaleType();

	/**
	 * Returns the meta object for data type '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='longitude_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minExclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getLongitudeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Longitude Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='longitude_._type:Object' baseType='longitude_._type'"
	 * @generated
	 */
	EDataType getLongitudeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mac Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mac Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='mac-address-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}'"
	 * @generated
	 */
	EDataType getMacAddressType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='port-type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPortType();

	/**
	 * Returns the meta object for data type '<em>Radius Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Radius Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='radius_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0'"
	 * @generated
	 */
	EDataType getRadiusType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Radius Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Radius Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='radius_._type:Object' baseType='radius_._type'"
	 * @generated
	 */
	EDataType getRadiusTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Telephone Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Telephone Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='telephone-number-type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(([2-9][0-8]\\d-[2-9]\\d{2}-[0-9]{4})|(\\+([0-9]%20?){6,14}[0-9]))'"
	 * @generated
	 */
	EDataType getTelephoneNumberType();

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
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetIdentificationTypeImpl <em>Asset Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetIdentificationTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetIdentificationType()
		 * @generated
		 */
		EClass ASSET_IDENTIFICATION_TYPE = eINSTANCE.getAssetIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Asset Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_IDENTIFICATION_TYPE__ASSET_REF = eINSTANCE.getAssetIdentificationType_AssetRef();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetsTypeImpl <em>Assets Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetsTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetsType()
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
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetTypeImpl <em>Asset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetType()
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
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl <em>Asset Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getAssetType1()
		 * @generated
		 */
		EClass ASSET_TYPE1 = eINSTANCE.getAssetType1();

		/**
		 * The meta object literal for the '<em><b>Synthetic Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_TYPE1__SYNTHETIC_ID = eINSTANCE.getAssetType1_SyntheticId();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_TYPE1__LOCATIONS = eINSTANCE.getAssetType1_Locations();

		/**
		 * The meta object literal for the '<em><b>Extended Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_TYPE1__EXTENDED_INFORMATION = eINSTANCE.getAssetType1_ExtendedInformation();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_TYPE1__TIMESTAMP = eINSTANCE.getAssetType1_Timestamp();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.BirthdateTypeImpl <em>Birthdate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.BirthdateTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getBirthdateType()
		 * @generated
		 */
		EClass BIRTHDATE_TYPE = eINSTANCE.getBirthdateType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIRTHDATE_TYPE__VALUE = eINSTANCE.getBirthdateType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIRTHDATE_TYPE__SOURCE = eINSTANCE.getBirthdateType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIRTHDATE_TYPE__TIMESTAMP = eINSTANCE.getBirthdateType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIRTHDATE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getBirthdateType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CidrType1Impl <em>Cidr Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.CidrType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCidrType1()
		 * @generated
		 */
		EClass CIDR_TYPE1 = eINSTANCE.getCidrType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIDR_TYPE1__VALUE = eINSTANCE.getCidrType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIDR_TYPE1__SOURCE = eINSTANCE.getCidrType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIDR_TYPE1__TIMESTAMP = eINSTANCE.getCidrType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIDR_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getCidrType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CircuitNameTypeImpl <em>Circuit Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.CircuitNameTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCircuitNameType()
		 * @generated
		 */
		EClass CIRCUIT_NAME_TYPE = eINSTANCE.getCircuitNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_NAME_TYPE__VALUE = eINSTANCE.getCircuitNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_NAME_TYPE__SOURCE = eINSTANCE.getCircuitNameType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_NAME_TYPE__TIMESTAMP = eINSTANCE.getCircuitNameType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCircuitNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CircuitTypeImpl <em>Circuit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.CircuitTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCircuitType()
		 * @generated
		 */
		EClass CIRCUIT_TYPE = eINSTANCE.getCircuitType();

		/**
		 * The meta object literal for the '<em><b>Circuit Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_TYPE__CIRCUIT_NAME = eINSTANCE.getCircuitType_CircuitName();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl <em>Computing Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getComputingDeviceType()
		 * @generated
		 */
		EClass COMPUTING_DEVICE_TYPE = eINSTANCE.getComputingDeviceType();

		/**
		 * The meta object literal for the '<em><b>Distinguished Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME = eINSTANCE.getComputingDeviceType_DistinguishedName();

		/**
		 * The meta object literal for the '<em><b>Cpe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__CPE = eINSTANCE.getComputingDeviceType_Cpe();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__CONNECTIONS = eINSTANCE.getComputingDeviceType_Connections();

		/**
		 * The meta object literal for the '<em><b>Fqdn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__FQDN = eINSTANCE.getComputingDeviceType_Fqdn();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__HOSTNAME = eINSTANCE.getComputingDeviceType_Hostname();

		/**
		 * The meta object literal for the '<em><b>Motherboard Guid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID = eINSTANCE.getComputingDeviceType_MotherboardGuid();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ConnectionsTypeImpl <em>Connections Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ConnectionsTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getConnectionsType()
		 * @generated
		 */
		EClass CONNECTIONS_TYPE = eINSTANCE.getConnectionsType();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS_TYPE__CONNECTION = eINSTANCE.getConnectionsType_Connection();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.CpeType1Impl <em>Cpe Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.CpeType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCpeType1()
		 * @generated
		 */
		EClass CPE_TYPE1 = eINSTANCE.getCpeType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPE_TYPE1__VALUE = eINSTANCE.getCpeType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPE_TYPE1__SOURCE = eINSTANCE.getCpeType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPE_TYPE1__TIMESTAMP = eINSTANCE.getCpeType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPE_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getCpeType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.DatabaseTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDatabaseType()
		 * @generated
		 */
		EClass DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_TYPE__INSTANCE_NAME = eINSTANCE.getDatabaseType_InstanceName();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.DataTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DistinguishedNameTypeImpl <em>Distinguished Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.DistinguishedNameTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDistinguishedNameType()
		 * @generated
		 */
		EClass DISTINGUISHED_NAME_TYPE = eINSTANCE.getDistinguishedNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINGUISHED_NAME_TYPE__VALUE = eINSTANCE.getDistinguishedNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINGUISHED_NAME_TYPE__SOURCE = eINSTANCE.getDistinguishedNameType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINGUISHED_NAME_TYPE__TIMESTAMP = eINSTANCE.getDistinguishedNameType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINGUISHED_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDistinguishedNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSET = eINSTANCE.getDocumentRoot_Asset();

		/**
		 * The meta object literal for the '<em><b>Asset Related</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSET_RELATED = eINSTANCE.getDocumentRoot_AssetRelated();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSETS = eINSTANCE.getDocumentRoot_Assets();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CIRCUIT = eINSTANCE.getDocumentRoot_Circuit();

		/**
		 * The meta object literal for the '<em><b>It Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IT_ASSET = eINSTANCE.getDocumentRoot_ItAsset();

		/**
		 * The meta object literal for the '<em><b>Computing Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPUTING_DEVICE = eINSTANCE.getDocumentRoot_ComputingDevice();

		/**
		 * The meta object literal for the '<em><b>Cpe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CPE = eINSTANCE.getDocumentRoot_Cpe();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA = eINSTANCE.getDocumentRoot_Data();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATABASE = eINSTANCE.getDocumentRoot_Database();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMAIL_ADDRESS = eINSTANCE.getDocumentRoot_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Fqdn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FQDN = eINSTANCE.getDocumentRoot_Fqdn();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IP_ADDRESS = eINSTANCE.getDocumentRoot_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Location Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION_ADDRESS = eINSTANCE.getDocumentRoot_LocationAddress();

		/**
		 * The meta object literal for the '<em><b>Location Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION_POINT = eINSTANCE.getDocumentRoot_LocationPoint();

		/**
		 * The meta object literal for the '<em><b>Location Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION_REGION = eINSTANCE.getDocumentRoot_LocationRegion();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATIONS = eINSTANCE.getDocumentRoot_Locations();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NETWORK = eINSTANCE.getDocumentRoot_Network();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON = eINSTANCE.getDocumentRoot_Person();

		/**
		 * The meta object literal for the '<em><b>Served By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVED_BY = eINSTANCE.getDocumentRoot_ServedBy();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE = eINSTANCE.getDocumentRoot_Service();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOFTWARE = eINSTANCE.getDocumentRoot_Software();

		/**
		 * The meta object literal for the '<em><b>Synthetic Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYNTHETIC_ID = eINSTANCE.getDocumentRoot_SyntheticId();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM = eINSTANCE.getDocumentRoot_System();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TELEPHONE_NUMBER = eINSTANCE.getDocumentRoot_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEBSITE = eINSTANCE.getDocumentRoot_Website();

		/**
		 * The meta object literal for the '<em><b>Website Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WEBSITE_URL = eINSTANCE.getDocumentRoot_WebsiteUrl();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TIMESTAMP = eINSTANCE.getDocumentRoot_Timestamp();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootTypeImpl <em>Document Root Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.DocumentRootTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getDocumentRootType()
		 * @generated
		 */
		EClass DOCUMENT_ROOT_TYPE = eINSTANCE.getDocumentRootType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT_TYPE__VALUE = eINSTANCE.getDocumentRootType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT_TYPE__SOURCE = eINSTANCE.getDocumentRootType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT_TYPE__TIMESTAMP = eINSTANCE.getDocumentRootType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDocumentRootType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.EmailAddressTypeImpl <em>Email Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.EmailAddressTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getEmailAddressType()
		 * @generated
		 */
		EClass EMAIL_ADDRESS_TYPE = eINSTANCE.getEmailAddressType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__VALUE = eINSTANCE.getEmailAddressType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__SOURCE = eINSTANCE.getEmailAddressType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__TIMESTAMP = eINSTANCE.getEmailAddressType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_TYPE__ANY_ATTRIBUTE = eINSTANCE.getEmailAddressType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ExtendedInformationTypeImpl <em>Extended Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ExtendedInformationTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getExtendedInformationType()
		 * @generated
		 */
		EClass EXTENDED_INFORMATION_TYPE = eINSTANCE.getExtendedInformationType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_INFORMATION_TYPE__ANY = eINSTANCE.getExtendedInformationType_Any();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.FqdnTypeImpl <em>Fqdn Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.FqdnTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getFqdnType()
		 * @generated
		 */
		EClass FQDN_TYPE = eINSTANCE.getFqdnType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FQDN_TYPE__VALUE = eINSTANCE.getFqdnType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FQDN_TYPE__SOURCE = eINSTANCE.getFqdnType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FQDN_TYPE__TIMESTAMP = eINSTANCE.getFqdnType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FQDN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getFqdnType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.HostnameType1Impl <em>Hostname Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.HostnameType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostnameType1()
		 * @generated
		 */
		EClass HOSTNAME_TYPE1 = eINSTANCE.getHostnameType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTNAME_TYPE1__VALUE = eINSTANCE.getHostnameType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTNAME_TYPE1__SOURCE = eINSTANCE.getHostnameType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTNAME_TYPE1__TIMESTAMP = eINSTANCE.getHostnameType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSTNAME_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getHostnameType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl <em>Host Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostType()
		 * @generated
		 */
		EClass HOST_TYPE = eINSTANCE.getHostType();

		/**
		 * The meta object literal for the '<em><b>Fqdn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_TYPE__FQDN = eINSTANCE.getHostType_Fqdn();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_TYPE__IP_ADDRESS = eINSTANCE.getHostType_IpAddress();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.InstallationIdTypeImpl <em>Installation Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.InstallationIdTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getInstallationIdType()
		 * @generated
		 */
		EClass INSTALLATION_ID_TYPE = eINSTANCE.getInstallationIdType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_ID_TYPE__VALUE = eINSTANCE.getInstallationIdType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_ID_TYPE__SOURCE = eINSTANCE.getInstallationIdType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_ID_TYPE__TIMESTAMP = eINSTANCE.getInstallationIdType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_ID_TYPE__ANY_ATTRIBUTE = eINSTANCE.getInstallationIdType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.InstanceNameTypeImpl <em>Instance Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.InstanceNameTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getInstanceNameType()
		 * @generated
		 */
		EClass INSTANCE_NAME_TYPE = eINSTANCE.getInstanceNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_NAME_TYPE__VALUE = eINSTANCE.getInstanceNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_NAME_TYPE__SOURCE = eINSTANCE.getInstanceNameType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_NAME_TYPE__TIMESTAMP = eINSTANCE.getInstanceNameType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getInstanceNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl <em>Ip Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpAddressType()
		 * @generated
		 */
		EClass IP_ADDRESS_TYPE = eINSTANCE.getIpAddressType();

		/**
		 * The meta object literal for the '<em><b>Ip V4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_ADDRESS_TYPE__IP_V4 = eINSTANCE.getIpAddressType_IpV4();

		/**
		 * The meta object literal for the '<em><b>Ip V6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_ADDRESS_TYPE__IP_V6 = eINSTANCE.getIpAddressType_IpV6();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl <em>Ip Net Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpNetRangeType()
		 * @generated
		 */
		EClass IP_NET_RANGE_TYPE = eINSTANCE.getIpNetRangeType();

		/**
		 * The meta object literal for the '<em><b>Ip Net Range Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_NET_RANGE_TYPE__IP_NET_RANGE_START = eINSTANCE.getIpNetRangeType_IpNetRangeStart();

		/**
		 * The meta object literal for the '<em><b>Ip Net Range End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_NET_RANGE_TYPE__IP_NET_RANGE_END = eINSTANCE.getIpNetRangeType_IpNetRangeEnd();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpV4Type1Impl <em>Ip V4 Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.IpV4Type1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpV4Type1()
		 * @generated
		 */
		EClass IP_V4_TYPE1 = eINSTANCE.getIpV4Type1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V4_TYPE1__VALUE = eINSTANCE.getIpV4Type1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V4_TYPE1__SOURCE = eINSTANCE.getIpV4Type1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V4_TYPE1__TIMESTAMP = eINSTANCE.getIpV4Type1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V4_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getIpV4Type1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.IpV6Type1Impl <em>Ip V6 Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.IpV6Type1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpV6Type1()
		 * @generated
		 */
		EClass IP_V6_TYPE1 = eINSTANCE.getIpV6Type1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V6_TYPE1__VALUE = eINSTANCE.getIpV6Type1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V6_TYPE1__SOURCE = eINSTANCE.getIpV6Type1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V6_TYPE1__TIMESTAMP = eINSTANCE.getIpV6Type1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_V6_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getIpV6Type1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ItAssetTypeImpl <em>It Asset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ItAssetTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getItAssetType()
		 * @generated
		 */
		EClass IT_ASSET_TYPE = eINSTANCE.getItAssetType();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LicenseTypeImpl <em>License Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.LicenseTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLicenseType()
		 * @generated
		 */
		EClass LICENSE_TYPE = eINSTANCE.getLicenseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_TYPE__VALUE = eINSTANCE.getLicenseType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_TYPE__SOURCE = eINSTANCE.getLicenseType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_TYPE__TIMESTAMP = eINSTANCE.getLicenseType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLicenseType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocaleType1Impl <em>Locale Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.LocaleType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocaleType1()
		 * @generated
		 */
		EClass LOCALE_TYPE1 = eINSTANCE.getLocaleType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_TYPE1__VALUE = eINSTANCE.getLocaleType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_TYPE1__SOURCE = eINSTANCE.getLocaleType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_TYPE1__TIMESTAMP = eINSTANCE.getLocaleType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getLocaleType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationPointTypeImpl <em>Location Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationPointTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationPointType()
		 * @generated
		 */
		EClass LOCATION_POINT_TYPE = eINSTANCE.getLocationPointType();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__ELEVATION = eINSTANCE.getLocationPointType_Elevation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__LATITUDE = eINSTANCE.getLocationPointType_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__LONGITUDE = eINSTANCE.getLocationPointType_Longitude();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__RADIUS = eINSTANCE.getLocationPointType_Radius();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__SOURCE = eINSTANCE.getLocationPointType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__TIMESTAMP = eINSTANCE.getLocationPointType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_POINT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLocationPointType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationRegionTypeImpl <em>Location Region Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationRegionTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationRegionType()
		 * @generated
		 */
		EClass LOCATION_REGION_TYPE = eINSTANCE.getLocationRegionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_REGION_TYPE__VALUE = eINSTANCE.getLocationRegionType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_REGION_TYPE__SOURCE = eINSTANCE.getLocationRegionType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_REGION_TYPE__TIMESTAMP = eINSTANCE.getLocationRegionType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_REGION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLocationRegionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocationsType()
		 * @generated
		 */
		EClass LOCATIONS_TYPE = eINSTANCE.getLocationsType();

		/**
		 * The meta object literal for the '<em><b>Location Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATIONS_TYPE__LOCATION_GROUP = eINSTANCE.getLocationsType_LocationGroup();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATIONS_TYPE__LOCATION = eINSTANCE.getLocationsType_Location();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.MacAddressType1Impl <em>Mac Address Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.MacAddressType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMacAddressType1()
		 * @generated
		 */
		EClass MAC_ADDRESS_TYPE1 = eINSTANCE.getMacAddressType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ADDRESS_TYPE1__VALUE = eINSTANCE.getMacAddressType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ADDRESS_TYPE1__SOURCE = eINSTANCE.getMacAddressType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ADDRESS_TYPE1__TIMESTAMP = eINSTANCE.getMacAddressType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ADDRESS_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getMacAddressType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.MotherboardGuidTypeImpl <em>Motherboard Guid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.MotherboardGuidTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMotherboardGuidType()
		 * @generated
		 */
		EClass MOTHERBOARD_GUID_TYPE = eINSTANCE.getMotherboardGuidType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD_GUID_TYPE__VALUE = eINSTANCE.getMotherboardGuidType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD_GUID_TYPE__SOURCE = eINSTANCE.getMotherboardGuidType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD_GUID_TYPE__TIMESTAMP = eINSTANCE.getMotherboardGuidType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD_GUID_TYPE__ANY_ATTRIBUTE = eINSTANCE.getMotherboardGuidType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl <em>Network Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkInterfaceType()
		 * @generated
		 */
		EClass NETWORK_INTERFACE_TYPE = eINSTANCE.getNetworkInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_TYPE__IP_ADDRESS = eINSTANCE.getNetworkInterfaceType_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_TYPE__MAC_ADDRESS = eINSTANCE.getNetworkInterfaceType_MacAddress();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_TYPE__URL = eINSTANCE.getNetworkInterfaceType_Url();

		/**
		 * The meta object literal for the '<em><b>Subnet Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_TYPE__SUBNET_MASK = eINSTANCE.getNetworkInterfaceType_SubnetMask();

		/**
		 * The meta object literal for the '<em><b>Default Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE = eINSTANCE.getNetworkInterfaceType_DefaultRoute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkNameTypeImpl <em>Network Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkNameTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkNameType()
		 * @generated
		 */
		EClass NETWORK_NAME_TYPE = eINSTANCE.getNetworkNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_NAME_TYPE__VALUE = eINSTANCE.getNetworkNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_NAME_TYPE__SOURCE = eINSTANCE.getNetworkNameType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_NAME_TYPE__TIMESTAMP = eINSTANCE.getNetworkNameType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getNetworkNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getNetworkType()
		 * @generated
		 */
		EClass NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '<em><b>Network Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__NETWORK_NAME = eINSTANCE.getNetworkType_NetworkName();

		/**
		 * The meta object literal for the '<em><b>Ip Net Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__IP_NET_RANGE = eINSTANCE.getNetworkType_IpNetRange();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__CIDR = eINSTANCE.getNetworkType_Cidr();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getOrganizationType()
		 * @generated
		 */
		EClass ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '<em><b>Organisation Name Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS = eINSTANCE.getOrganizationType_OrganisationNameDetails();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__EMAIL_ADDRESS = eINSTANCE.getOrganizationType_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__TELEPHONE_NUMBER = eINSTANCE.getOrganizationType_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Website Url</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__WEBSITE_URL = eINSTANCE.getOrganizationType_WebsiteUrl();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl <em>Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPersonType()
		 * @generated
		 */
		EClass PERSON_TYPE = eINSTANCE.getPersonType();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__PERSON_NAME = eINSTANCE.getPersonType_PersonName();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__EMAIL_ADDRESS = eINSTANCE.getPersonType_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__TELEPHONE_NUMBER = eINSTANCE.getPersonType_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__BIRTHDATE = eINSTANCE.getPersonType_Birthdate();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PortRangeTypeImpl <em>Port Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.PortRangeTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortRangeType()
		 * @generated
		 */
		EClass PORT_RANGE_TYPE = eINSTANCE.getPortRangeType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE_TYPE__LOWER_BOUND = eINSTANCE.getPortRangeType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE_TYPE__SOURCE = eINSTANCE.getPortRangeType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE_TYPE__TIMESTAMP = eINSTANCE.getPortRangeType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE_TYPE__UPPER_BOUND = eINSTANCE.getPortRangeType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getPortRangeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.PortType1Impl <em>Port Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.PortType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortType1()
		 * @generated
		 */
		EClass PORT_TYPE1 = eINSTANCE.getPortType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE1__VALUE = eINSTANCE.getPortType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE1__SOURCE = eINSTANCE.getPortType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE1__TIMESTAMP = eINSTANCE.getPortType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getPortType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ProtocolTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getProtocolType()
		 * @generated
		 */
		EClass PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__VALUE = eINSTANCE.getProtocolType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__SOURCE = eINSTANCE.getProtocolType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__TIMESTAMP = eINSTANCE.getProtocolType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__ANY_ATTRIBUTE = eINSTANCE.getProtocolType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__HOST = eINSTANCE.getServiceType_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__PORT = eINSTANCE.getServiceType_Port();

		/**
		 * The meta object literal for the '<em><b>Port Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__PORT_RANGE = eINSTANCE.getServiceType_PortRange();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TYPE__PROTOCOL = eINSTANCE.getServiceType_Protocol();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl <em>Software Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSoftwareType()
		 * @generated
		 */
		EClass SOFTWARE_TYPE = eINSTANCE.getSoftwareType();

		/**
		 * The meta object literal for the '<em><b>Installation Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_TYPE__INSTALLATION_ID = eINSTANCE.getSoftwareType_InstallationId();

		/**
		 * The meta object literal for the '<em><b>Cpe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_TYPE__CPE = eINSTANCE.getSoftwareType_Cpe();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_TYPE__LICENSE = eINSTANCE.getSoftwareType_License();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SyntheticIdTypeImpl <em>Synthetic Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.SyntheticIdTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSyntheticIdType()
		 * @generated
		 */
		EClass SYNTHETIC_ID_TYPE = eINSTANCE.getSyntheticIdType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHETIC_ID_TYPE__ID = eINSTANCE.getSyntheticIdType_Id();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHETIC_ID_TYPE__RESOURCE = eINSTANCE.getSyntheticIdType_Resource();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SystemNameTypeImpl <em>System Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.SystemNameTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSystemNameType()
		 * @generated
		 */
		EClass SYSTEM_NAME_TYPE = eINSTANCE.getSystemNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_NAME_TYPE__VALUE = eINSTANCE.getSystemNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_NAME_TYPE__SOURCE = eINSTANCE.getSystemNameType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_NAME_TYPE__TIMESTAMP = eINSTANCE.getSystemNameType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_NAME_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSystemNameType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TYPE__SYSTEM_NAME = eINSTANCE.getSystemType_SystemName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TYPE__VERSION = eINSTANCE.getSystemType_Version();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.TelephoneNumberType1Impl <em>Telephone Number Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.TelephoneNumberType1Impl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getTelephoneNumberType1()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER_TYPE1 = eINSTANCE.getTelephoneNumberType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE1__VALUE = eINSTANCE.getTelephoneNumberType1_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE1__SOURCE = eINSTANCE.getTelephoneNumberType1_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE1__TIMESTAMP = eINSTANCE.getTelephoneNumberType1_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER_TYPE1__ANY_ATTRIBUTE = eINSTANCE.getTelephoneNumberType1_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.UrlTypeImpl <em>Url Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.UrlTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getUrlType()
		 * @generated
		 */
		EClass URL_TYPE = eINSTANCE.getUrlType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__VALUE = eINSTANCE.getUrlType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__SOURCE = eINSTANCE.getUrlType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__TIMESTAMP = eINSTANCE.getUrlType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__ANY_ATTRIBUTE = eINSTANCE.getUrlType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.VersionTypeImpl <em>Version Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.VersionTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getVersionType()
		 * @generated
		 */
		EClass VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TYPE__VALUE = eINSTANCE.getVersionType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TYPE__SOURCE = eINSTANCE.getVersionType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TYPE__TIMESTAMP = eINSTANCE.getVersionType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getVersionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl <em>Website Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getWebsiteType()
		 * @generated
		 */
		EClass WEBSITE_TYPE = eINSTANCE.getWebsiteType();

		/**
		 * The meta object literal for the '<em><b>Document Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE_TYPE__DOCUMENT_ROOT = eINSTANCE.getWebsiteType_DocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE_TYPE__LOCALE = eINSTANCE.getWebsiteType_Locale();

		/**
		 * The meta object literal for the '{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteUrlTypeImpl <em>Website Url Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl.WebsiteUrlTypeImpl
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getWebsiteUrlType()
		 * @generated
		 */
		EClass WEBSITE_URL_TYPE = eINSTANCE.getWebsiteUrlType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_URL_TYPE__VALUE = eINSTANCE.getWebsiteUrlType_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_URL_TYPE__SOURCE = eINSTANCE.getWebsiteUrlType_Source();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_URL_TYPE__TIMESTAMP = eINSTANCE.getWebsiteUrlType_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE_URL_TYPE__ANY_ATTRIBUTE = eINSTANCE.getWebsiteUrlType_AnyAttribute();

		/**
		 * The meta object literal for the '<em>Cidr Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCidrType()
		 * @generated
		 */
		EDataType CIDR_TYPE = eINSTANCE.getCidrType();

		/**
		 * The meta object literal for the '<em>Cpe Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getCpeType()
		 * @generated
		 */
		EDataType CPE_TYPE = eINSTANCE.getCpeType();

		/**
		 * The meta object literal for the '<em>Hostname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getHostnameType()
		 * @generated
		 */
		EDataType HOSTNAME_TYPE = eINSTANCE.getHostnameType();

		/**
		 * The meta object literal for the '<em>Ipv4 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpv4Type()
		 * @generated
		 */
		EDataType IPV4_TYPE = eINSTANCE.getIpv4Type();

		/**
		 * The meta object literal for the '<em>Ipv6 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getIpv6Type()
		 * @generated
		 */
		EDataType IPV6_TYPE = eINSTANCE.getIpv6Type();

		/**
		 * The meta object literal for the '<em>Latitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLatitudeType()
		 * @generated
		 */
		EDataType LATITUDE_TYPE = eINSTANCE.getLatitudeType();

		/**
		 * The meta object literal for the '<em>Latitude Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLatitudeTypeObject()
		 * @generated
		 */
		EDataType LATITUDE_TYPE_OBJECT = eINSTANCE.getLatitudeTypeObject();

		/**
		 * The meta object literal for the '<em>Locale Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLocaleType()
		 * @generated
		 */
		EDataType LOCALE_TYPE = eINSTANCE.getLocaleType();

		/**
		 * The meta object literal for the '<em>Longitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLongitudeType()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE = eINSTANCE.getLongitudeType();

		/**
		 * The meta object literal for the '<em>Longitude Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getLongitudeTypeObject()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE_OBJECT = eINSTANCE.getLongitudeTypeObject();

		/**
		 * The meta object literal for the '<em>Mac Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getMacAddressType()
		 * @generated
		 */
		EDataType MAC_ADDRESS_TYPE = eINSTANCE.getMacAddressType();

		/**
		 * The meta object literal for the '<em>Port Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getPortType()
		 * @generated
		 */
		EDataType PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Radius Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getRadiusType()
		 * @generated
		 */
		EDataType RADIUS_TYPE = eINSTANCE.getRadiusType();

		/**
		 * The meta object literal for the '<em>Radius Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getRadiusTypeObject()
		 * @generated
		 */
		EDataType RADIUS_TYPE_OBJECT = eINSTANCE.getRadiusTypeObject();

		/**
		 * The meta object literal for the '<em>Telephone Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl#getTelephoneNumberType()
		 * @generated
		 */
		EDataType TELEPHONE_NUMBER_TYPE = eINSTANCE.getTelephoneNumberType();

	}

} //_1Package
