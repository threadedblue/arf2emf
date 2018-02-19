/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0;

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
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Factory
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
	String eNS_URI = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0";

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
	_0Package eINSTANCE = oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressDetailsImpl <em>Address Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressDetailsImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressDetails()
	 * @generated
	 */
	int ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Postal Service Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Address Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_LINES = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADMINISTRATIVE_AREA = 4;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__LOCALITY = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY = 7;

	/**
	 * The feature id for the '<em><b>Address Details Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_DETAILS_KEY = 8;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CODE = 10;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CURRENT_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__USAGE = 12;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_FROM_DATE = 13;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_TO_DATE = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressIdentifierTypeImpl <em>Address Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressIdentifierTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressIdentifierType()
	 * @generated
	 */
	int ADDRESS_IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__IDENTIFIER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Address Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Address Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLatitudeDirectionTypeImpl <em>Address Latitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLatitudeDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLatitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Latitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLatitudeTypeImpl <em>Address Latitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLatitudeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLatitudeType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLinesTypeImpl <em>Address Lines Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLinesTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLinesType()
	 * @generated
	 */
	int ADDRESS_LINES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Address Lines Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Address Lines Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLineTypeImpl <em>Address Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLineTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLineType()
	 * @generated
	 */
	int ADDRESS_LINE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLongitudeDirectionTypeImpl <em>Address Longitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLongitudeDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLongitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Longitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLongitudeTypeImpl <em>Address Longitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressLongitudeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressLongitudeType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AddressTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AdministrativeAreaNameTypeImpl <em>Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AdministrativeAreaNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAdministrativeAreaNameType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AdministrativeAreaTypeImpl <em>Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.AdministrativeAreaTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getAdministrativeAreaType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__LOCALITY = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.BarcodeTypeImpl <em>Barcode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.BarcodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getBarcodeType()
	 * @generated
	 */
	int BARCODE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Barcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Barcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.BuildingNameTypeImpl <em>Building Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.BuildingNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getBuildingNameType()
	 * @generated
	 */
	int BUILDING_NAME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Building Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Building Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryNameCodeTypeImpl <em>Country Name Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryNameCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getCountryNameCodeType()
	 * @generated
	 */
	int COUNTRY_NAME_CODE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country Name Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryNameTypeImpl <em>Country Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getCountryNameType()
	 * @generated
	 */
	int COUNTRY_NAME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryTypeImpl <em>Country Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.CountryTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Country Name Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME_CODE = 1;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADMINISTRATIVE_AREA = 3;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__LOCALITY = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__THOROUGHFARE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DepartmentNameTypeImpl <em>Department Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DepartmentNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDepartmentNameType()
	 * @generated
	 */
	int DEPARTMENT_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Department Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DepartmentTypeImpl <em>Department Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DepartmentTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDepartmentType()
	 * @generated
	 */
	int DEPARTMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Department Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__DEPARTMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__MAIL_STOP = 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__POSTAL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Department Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Department Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityNameTypeImpl <em>Dependent Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentLocalityNameType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependent Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityNumberTypeImpl <em>Dependent Locality Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentLocalityNumberType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependent Locality Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityTypeImpl <em>Dependent Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentLocalityTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentLocalityType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Dependent Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dependent Locality Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER = 4;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_OFFICE = 5;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__THOROUGHFARE = 7;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY = 9;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_CODE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__INDICATOR = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__TYPE = 14;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__USAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE = 16;

	/**
	 * The number of structural features of the '<em>Dependent Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Dependent Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentThoroughfareTypeImpl <em>Dependent Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DependentThoroughfareTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentThoroughfareType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Dependent Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Dependent Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.DocumentRootImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 22;

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
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_LINE = 4;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADMINISTRATIVE_AREA = 5;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPARTMENT = 7;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_BOX = 10;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_OFFICE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX = 14;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX = 15;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE = 16;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX = 18;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX = 19;

	/**
	 * The feature id for the '<em><b>XAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XAL = 20;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.EndorsementLineCodeTypeImpl <em>Endorsement Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.EndorsementLineCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getEndorsementLineCodeType()
	 * @generated
	 */
	int ENDORSEMENT_LINE_CODE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Endorsement Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Endorsement Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.FirmNameTypeImpl <em>Firm Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.FirmNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getFirmNameType()
	 * @generated
	 */
	int FIRM_NAME_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Firm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Firm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.FirmTypeImpl <em>Firm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.FirmTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getFirmType()
	 * @generated
	 */
	int FIRM_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Firm Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__FIRM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__MAIL_STOP = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Firm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Firm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.KeyLineCodeTypeImpl <em>Key Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.KeyLineCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getKeyLineCodeType()
	 * @generated
	 */
	int KEY_LINE_CODE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Key Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Key Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserIdentifierTypeImpl <em>Large Mail User Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserIdentifierTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getLargeMailUserIdentifierType()
	 * @generated
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Large Mail User Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Large Mail User Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserNameTypeImpl <em>Large Mail User Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getLargeMailUserNameType()
	 * @generated
	 */
	int LARGE_MAIL_USER_NAME_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Large Mail User Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Large Mail User Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserTypeImpl <em>Large Mail User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LargeMailUserTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getLargeMailUserType()
	 * @generated
	 */
	int LARGE_MAIL_USER_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Large Mail User Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Large Mail User Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__BUILDING_NAME = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POST_BOX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POSTAL_CODE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Large Mail User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Large Mail User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LocalityNameTypeImpl <em>Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LocalityNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getLocalityNameType()
	 * @generated
	 */
	int LOCALITY_NAME_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LocalityTypeImpl <em>Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.LocalityTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getLocalityType()
	 * @generated
	 */
	int LOCALITY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_BOX = 2;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LARGE_MAIL_USER = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__PREMISE = 7;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__DEPENDENT_LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__INDICATOR = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__USAGE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopNameTypeImpl <em>Mail Stop Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getMailStopNameType()
	 * @generated
	 */
	int MAIL_STOP_NAME_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail Stop Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopNumberTypeImpl <em>Mail Stop Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getMailStopNumberType()
	 * @generated
	 */
	int MAIL_STOP_NUMBER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__NAME_NUMBER_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail Stop Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopTypeImpl <em>Mail Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.MailStopTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getMailStopType()
	 * @generated
	 */
	int MAIL_STOP_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Mail Stop Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Mail Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mail Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeNumberExtensionTypeImpl <em>Postal Code Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeNumberExtensionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalCodeNumberExtensionType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Postal Code Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Postal Code Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeNumberTypeImpl <em>Postal Code Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalCodeNumberType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Code Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postal Code Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeTypeImpl <em>Postal Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalCodeType()
	 * @generated
	 */
	int POSTAL_CODE_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Code Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Postal Code Number Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Post Town</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POST_TOWN = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Postal Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteNameTypeImpl <em>Postal Route Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalRouteNameType()
	 * @generated
	 */
	int POSTAL_ROUTE_NAME_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Route Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postal Route Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteNumberTypeImpl <em>Postal Route Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalRouteNumberType()
	 * @generated
	 */
	int POSTAL_ROUTE_NUMBER_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Postal Route Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Postal Route Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl <em>Postal Route Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalRouteType()
	 * @generated
	 */
	int POSTAL_ROUTE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Route Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Postal Route Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Postal Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalServiceElementsTypeImpl <em>Postal Service Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalServiceElementsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostalServiceElementsType()
	 * @generated
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Address Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Endorsement Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Key Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Barcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE = 3;

	/**
	 * The feature id for the '<em><b>Sorting Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE = 4;

	/**
	 * The feature id for the '<em><b>Address Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE = 5;

	/**
	 * The feature id for the '<em><b>Address Latitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Address Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE = 7;

	/**
	 * The feature id for the '<em><b>Address Longitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION = 8;

	/**
	 * The feature id for the '<em><b>Supplementary Postal Service Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE = 12;

	/**
	 * The number of structural features of the '<em>Postal Service Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Postal Service Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberExtensionTypeImpl <em>Post Box Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberExtensionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostBoxNumberExtensionType()
	 * @generated
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Box Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberPrefixTypeImpl <em>Post Box Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostBoxNumberPrefixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Box Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberSuffixTypeImpl <em>Post Box Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostBoxNumberSuffixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Box Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberTypeImpl <em>Post Box Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostBoxNumberType()
	 * @generated
	 */
	int POST_BOX_NUMBER_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Box Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxTypeImpl <em>Post Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostBoxType()
	 * @generated
	 */
	int POST_BOX_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Box Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Post Box Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Post Box Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX = 3;

	/**
	 * The feature id for the '<em><b>Post Box Number Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__FIRM = 5;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POSTAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Post Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Post Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeNameTypeImpl <em>Post Office Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostOfficeNameType()
	 * @generated
	 */
	int POST_OFFICE_NAME_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Office Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Office Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeNumberTypeImpl <em>Post Office Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostOfficeNumberType()
	 * @generated
	 */
	int POST_OFFICE_NUMBER_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Office Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Post Office Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeTypeImpl <em>Post Office Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostOfficeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostOfficeType()
	 * @generated
	 */
	int POST_OFFICE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Office Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Office Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_BOX = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Post Office Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Post Office Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownNameTypeImpl <em>Post Town Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostTownNameType()
	 * @generated
	 */
	int POST_TOWN_NAME_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Town Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Town Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownSuffixTypeImpl <em>Post Town Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostTownSuffixType()
	 * @generated
	 */
	int POST_TOWN_SUFFIX_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Town Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Town Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownTypeImpl <em>Post Town Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostTownTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPostTownType()
	 * @generated
	 */
	int POST_TOWN_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Town Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Town Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_SUFFIX = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Post Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseLocationTypeImpl <em>Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseLocationTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseLocationType()
	 * @generated
	 */
	int PREMISE_LOCATION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNameTypeImpl <em>Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNameType()
	 * @generated
	 */
	int PREMISE_NAME_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberPrefixTypeImpl <em>Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberPrefixType()
	 * @generated
	 */
	int PREMISE_NUMBER_PREFIX_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeFromTypeImpl <em>Premise Number Range From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeFromTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberRangeFromType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Premise Number Range From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeToTypeImpl <em>Premise Number Range To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeToTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberRangeToType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Premise Number Range To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeTypeImpl <em>Premise Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberRangeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberRangeType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Premise Number Range From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Range To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Range Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE = 4;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__SEPARATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Premise Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberSuffixTypeImpl <em>Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberSuffixType()
	 * @generated
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberTypeImpl <em>Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseNumberType()
	 * @generated
	 */
	int PREMISE_NUMBER_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseTypeImpl <em>Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PremiseTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getPremiseType()
	 * @generated
	 */
	int PREMISE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Premise Number Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__BUILDING_NAME = 7;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__SUB_PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__FIRM = 9;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__MAIL_STOP = 10;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__POSTAL_CODE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY = 13;

	/**
	 * The feature id for the '<em><b>Premise Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY = 14;

	/**
	 * The feature id for the '<em><b>Premise Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Premise Thoroughfare Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SortingCodeTypeImpl <em>Sorting Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SortingCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSortingCodeType()
	 * @generated
	 */
	int SORTING_CODE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Sorting Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sorting Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubAdministrativeAreaNameTypeImpl <em>Sub Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubAdministrativeAreaNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubAdministrativeAreaNameType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubAdministrativeAreaTypeImpl <em>Sub Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubAdministrativeAreaTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubAdministrativeAreaType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__LOCALITY = 2;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__INDICATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sub Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseLocationTypeImpl <em>Sub Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseLocationTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseLocationType()
	 * @generated
	 */
	int SUB_PREMISE_LOCATION_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Sub Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNameTypeImpl <em>Sub Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseNameType()
	 * @generated
	 */
	int SUB_PREMISE_NAME_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberPrefixTypeImpl <em>Sub Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseNumberPrefixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberSuffixTypeImpl <em>Sub Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseNumberSuffixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberTypeImpl <em>Sub Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseNumberType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__PREMISE_NUMBER_SEPARATOR = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Sub Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl <em>Sub Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSubPremiseType()
	 * @generated
	 */
	int SUB_PREMISE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Sub Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__BUILDING_NAME = 6;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__FIRM = 7;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__MAIL_STOP = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Sub Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Sub Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SupplementaryPostalServiceDataTypeImpl <em>Supplementary Postal Service Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SupplementaryPostalServiceDataTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Supplementary Postal Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Supplementary Postal Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareLeadingTypeTypeImpl <em>Thoroughfare Leading Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareLeadingTypeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareLeadingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Leading Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Leading Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNameTypeImpl <em>Thoroughfare Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNameType()
	 * @generated
	 */
	int THOROUGHFARE_NAME_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberFromTypeImpl <em>Thoroughfare Number From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberFromTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberFromType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thoroughfare Number From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberPrefixTypeImpl <em>Thoroughfare Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberPrefixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberRangeTypeImpl <em>Thoroughfare Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberRangeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberRangeType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Number Range Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE = 6;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberSuffixTypeImpl <em>Thoroughfare Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberSuffixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl <em>Thoroughfare Number To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberToType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thoroughfare Number To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberTypeImpl <em>Thoroughfare Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareNumberType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfarePostDirectionTypeImpl <em>Thoroughfare Post Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfarePostDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfarePostDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Post Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Post Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfarePreDirectionTypeImpl <em>Thoroughfare Pre Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfarePreDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfarePreDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Pre Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Pre Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTrailingTypeTypeImpl <em>Thoroughfare Trailing Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTrailingTypeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareTrailingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Trailing Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Trailing Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl <em>Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getThoroughfareType()
	 * @generated
	 */
	int THOROUGHFARE_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 10;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE = 11;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_LOCALITY = 12;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__PREMISE = 13;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__FIRM = 14;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__POSTAL_CODE = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY = 16;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES = 17;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR = 18;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR = 19;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__TYPE = 21;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 22;

	/**
	 * The number of structural features of the '<em>Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.XALTypeImpl <em>XAL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.XALTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getXALType()
	 * @generated
	 */
	int XAL_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>XAL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>XAL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentThoroughfaresType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE = 85;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType <em>Indicator Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurenceType()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE = 86;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceType()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE = 87;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceType1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE1 = 88;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceType2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE2 = 89;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceType3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE3 = 90;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceType4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE4 = 91;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNameNumberOccurrenceType()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE = 92;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType <em>Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberOccurrenceType()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE = 93;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberRangeOccurenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE = 94;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberRangeOccurrenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE = 95;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeOccurrenceType()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE = 96;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeOccurrenceType1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE1 = 97;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType <em>Number Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeType()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE = 98;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1 <em>Number Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeType1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE1 = 99;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType <em>Range Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getRangeTypeType()
	 * @generated
	 */
	int RANGE_TYPE_TYPE = 100;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType <em>Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceType()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE = 101;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceType1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE1 = 102;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceType2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE2 = 103;

	/**
	 * The meta object id for the '<em>Dependent Thoroughfares Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getDependentThoroughfaresTypeObject()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Indicator Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceTypeObject1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT1 = 107;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceTypeObject2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT2 = 108;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceTypeObject3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT3 = 109;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getIndicatorOccurrenceTypeObject4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT4 = 110;

	/**
	 * The meta object id for the '<em>Name Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNameNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Number Range Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberRangeOccurenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Number Range Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberRangeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT1 = 116;

	/**
	 * The meta object id for the '<em>Number Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Number Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getNumberTypeTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT1 = 118;

	/**
	 * The meta object id for the '<em>Range Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getRangeTypeTypeObject()
	 * @generated
	 */
	int RANGE_TYPE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceTypeObject()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT1 = 121;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl#getTypeOccurrenceTypeObject2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT2 = 122;


	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails
	 * @generated
	 */
	EClass getAddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getPostalServiceElements <em>Postal Service Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Service Elements</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getPostalServiceElements()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_PostalServiceElements();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddress()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Address();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressLines <em>Address Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Lines</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressLines()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AddressLines();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCountry()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Country();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAdministrativeArea()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getLocality()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getThoroughfare()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAny()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressDetailsKey <em>Address Details Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Details Key</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressDetailsKey()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressDetailsKey();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAddressType()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCode()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCurrentStatus <em>Current Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Status</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getCurrentStatus()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_CurrentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getUsage()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Usage();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getValidFromDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getValidToDate <em>Valid To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To Date</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getValidToDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidToDate();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails#getAnyAttribute()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType <em>Address Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType
	 * @generated
	 */
	EClass getAddressIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getMixed()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getCode()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getIdentifierType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_IdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType#getAnyAttribute()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType <em>Address Latitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType
	 * @generated
	 */
	EClass getAddressLatitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getMixed()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getCode()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getType()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType <em>Address Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType
	 * @generated
	 */
	EClass getAddressLatitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getMixed()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getCode()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getType()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType#getAnyAttribute()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType <em>Address Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Lines Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType
	 * @generated
	 */
	EClass getAddressLinesType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAddressLine()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EReference getAddressLinesType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAny()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType#getAnyAttribute()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType <em>Address Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Line Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType
	 * @generated
	 */
	EClass getAddressLineType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getMixed()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getCode()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getType()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType#getAnyAttribute()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType <em>Address Longitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType
	 * @generated
	 */
	EClass getAddressLongitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getMixed()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getCode()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getType()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType <em>Address Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType
	 * @generated
	 */
	EClass getAddressLongitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getMixed()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getCode()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getType()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType#getAnyAttribute()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getMixed()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getCode()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getType()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType#getAnyAttribute()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType <em>Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType
	 * @generated
	 */
	EClass getAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getMixed()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getCode()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getType()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType#getAnyAttribute()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType <em>Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType
	 * @generated
	 */
	EClass getAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAddressLine()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAdministrativeAreaName <em>Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Administrative Area Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAdministrativeAreaName()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getSubAdministrativeArea <em>Sub Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getSubAdministrativeArea()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_SubAdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getLocality()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getPostOffice()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getPostalCode()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAny()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getIndicator()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getUsageType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType#getAnyAttribute()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType <em>Barcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barcode Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType
	 * @generated
	 */
	EClass getBarcodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getMixed()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getCode()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getType()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType#getAnyAttribute()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType <em>Building Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType
	 * @generated
	 */
	EClass getBuildingNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getMixed()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getCode()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getType()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getTypeOccurrence()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType#getAnyAttribute()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType <em>Country Name Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType
	 * @generated
	 */
	EClass getCountryNameCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getMixed()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getCode()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getScheme()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Scheme();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType#getAnyAttribute()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType <em>Country Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType
	 * @generated
	 */
	EClass getCountryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getMixed()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getCode()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getType()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType#getAnyAttribute()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType
	 * @generated
	 */
	EClass getCountryType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAddressLine()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getCountryNameCode <em>Country Name Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getCountryNameCode()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryNameCode();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getCountryName()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAdministrativeArea()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getLocality()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getThoroughfare()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAny()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType#getAnyAttribute()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType <em>Department Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType
	 * @generated
	 */
	EClass getDepartmentNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getMixed()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getCode()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getType()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType#getAnyAttribute()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType <em>Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType
	 * @generated
	 */
	EClass getDepartmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAddressLine()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getDepartmentName <em>Department Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getDepartmentName()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_DepartmentName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getMailStop()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getPostalCode()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAny()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getType()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType#getAnyAttribute()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType <em>Dependent Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType
	 * @generated
	 */
	EClass getDependentLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getMixed()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getCode()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getType()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType#getAnyAttribute()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType <em>Dependent Locality Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType
	 * @generated
	 */
	EClass getDependentLocalityNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getMixed()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getCode()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_NameNumberOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getAnyAttribute()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType <em>Dependent Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType
	 * @generated
	 */
	EClass getDependentLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAddressLine()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocalityName <em>Dependent Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Locality Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocalityName()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocalityNumber <em>Dependent Locality Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocalityNumber()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostBox()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getLargeMailUser()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostOffice()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostalRoute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getThoroughfare()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPremise()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getDependentLocality()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getPostalCode()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAny()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getConnector()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Connector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getIndicator()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getUsageType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType#getAnyAttribute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType <em>Dependent Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Thoroughfare Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType
	 * @generated
	 */
	EClass getDependentThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAddressLine()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfarePreDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareLeadingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareName()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfareTrailingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getThoroughfarePostDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAny()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType#getAnyAttribute()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAddressDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAddressLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getAdministrativeArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getCountryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getDepartment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getLocality()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostalCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPostOffice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremise()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getPremiseNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfare()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getThoroughfareNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXAL <em>XAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XAL</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot#getXAL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XAL();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType <em>Endorsement Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endorsement Line Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType
	 * @generated
	 */
	EClass getEndorsementLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getMixed()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getCode()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getType()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType#getAnyAttribute()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType <em>Firm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType
	 * @generated
	 */
	EClass getFirmNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getMixed()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getCode()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getType()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType#getAnyAttribute()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType <em>Firm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType
	 * @generated
	 */
	EClass getFirmType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAddressLine()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getFirmName <em>Firm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firm Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getFirmName()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_FirmName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getDepartment()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getMailStop()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getPostalCode()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAny()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getType()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType#getAnyAttribute()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType <em>Key Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Line Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType
	 * @generated
	 */
	EClass getKeyLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getMixed()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getCode()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getType()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType#getAnyAttribute()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType <em>Large Mail User Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType
	 * @generated
	 */
	EClass getLargeMailUserIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getMixed()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getCode()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getIndicator()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getType()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType#getAnyAttribute()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType <em>Large Mail User Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType
	 * @generated
	 */
	EClass getLargeMailUserNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getMixed()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getCode()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getType()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType#getAnyAttribute()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType <em>Large Mail User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType
	 * @generated
	 */
	EClass getLargeMailUserType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAddressLine()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getLargeMailUserName <em>Large Mail User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Large Mail User Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getLargeMailUserName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User Identifier</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getLargeMailUserIdentifier()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getBuildingName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getDepartment()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getPostBox()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getThoroughfare()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getPostalCode()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAny()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getType()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType#getAnyAttribute()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType <em>Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType
	 * @generated
	 */
	EClass getLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getMixed()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getCode()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getType()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType#getAnyAttribute()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType
	 * @generated
	 */
	EClass getLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAddressLine()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getLocalityName <em>Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locality Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getLocalityName()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostBox()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getLargeMailUser()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostOffice()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostalRoute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getThoroughfare()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPremise()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getDependentLocality()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getPostalCode()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAny()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getIndicator()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getUsageType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType#getAnyAttribute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType <em>Mail Stop Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType
	 * @generated
	 */
	EClass getMailStopNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getMixed()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getCode()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getType()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType#getAnyAttribute()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType <em>Mail Stop Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType
	 * @generated
	 */
	EClass getMailStopNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getMixed()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getCode()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getNameNumberSeparator <em>Name Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getNameNumberSeparator()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_NameNumberSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType#getAnyAttribute()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType <em>Mail Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType
	 * @generated
	 */
	EClass getMailStopType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAddressLine()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getMailStopName <em>Mail Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getMailStopName()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getMailStopNumber <em>Mail Stop Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getMailStopNumber()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopNumber();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAny()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getType()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType#getAnyAttribute()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType <em>Postal Code Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Extension Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType
	 * @generated
	 */
	EClass getPostalCodeNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getMixed()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getCode()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getType()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType#getAnyAttribute()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType <em>Postal Code Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType
	 * @generated
	 */
	EClass getPostalCodeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getMixed()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getCode()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getType()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType#getAnyAttribute()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType
	 * @generated
	 */
	EClass getPostalCodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAddressLine()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostalCodeNumber <em>Postal Code Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostalCodeNumber()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostalCodeNumberExtension <em>Postal Code Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number Extension</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostalCodeNumberExtension()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostTown <em>Post Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getPostTown()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostTown();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAny()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getType()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType#getAnyAttribute()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType <em>Postal Route Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType
	 * @generated
	 */
	EClass getPostalRouteNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getMixed()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getCode()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getType()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType#getAnyAttribute()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType <em>Postal Route Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType
	 * @generated
	 */
	EClass getPostalRouteNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getMixed()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getCode()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType#getAnyAttribute()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType <em>Postal Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType
	 * @generated
	 */
	EClass getPostalRouteType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAddressLine()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostalRouteName <em>Postal Route Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Route Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostalRouteName()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostalRouteNumber <em>Postal Route Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostalRouteNumber()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getPostBox()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostBox();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAny()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getType()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType#getAnyAttribute()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType <em>Postal Service Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Service Elements Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType
	 * @generated
	 */
	EClass getPostalServiceElementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressIdentifier <em>Address Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Identifier</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressIdentifier()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getEndorsementLineCode <em>Endorsement Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsement Line Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getEndorsementLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_EndorsementLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getKeyLineCode <em>Key Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Line Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getKeyLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_KeyLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getBarcode <em>Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Barcode</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getBarcode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_Barcode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getSortingCode <em>Sorting Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getSortingCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SortingCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLatitude <em>Address Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLatitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitude();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLatitudeDirection <em>Address Latitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLatitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitudeDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLongitude <em>Address Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLongitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitude();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLongitudeDirection <em>Address Longitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAddressLongitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitudeDirection();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getSupplementaryPostalServiceData <em>Supplementary Postal Service Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplementary Postal Service Data</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getSupplementaryPostalServiceData()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SupplementaryPostalServiceData();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAny()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getType()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType#getAnyAttribute()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType <em>Post Box Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Extension Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType
	 * @generated
	 */
	EClass getPostBoxNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getMixed()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType#getAnyAttribute()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType <em>Post Box Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType
	 * @generated
	 */
	EClass getPostBoxNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getMixed()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getCode()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType#getAnyAttribute()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType <em>Post Box Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType
	 * @generated
	 */
	EClass getPostBoxNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getMixed()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getCode()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType#getAnyAttribute()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType <em>Post Box Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType
	 * @generated
	 */
	EClass getPostBoxNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getMixed()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getCode()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType#getAnyAttribute()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType <em>Post Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType
	 * @generated
	 */
	EClass getPostBoxType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAddressLine()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumber <em>Post Box Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumber()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberPrefix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberSuffix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberExtension <em>Post Box Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Extension</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostBoxNumberExtension()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getFirm()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getPostalCode()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAny()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getIndicator()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getType()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType#getAnyAttribute()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType <em>Post Office Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType
	 * @generated
	 */
	EClass getPostOfficeNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getMixed()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getCode()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getType()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType#getAnyAttribute()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType <em>Post Office Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType
	 * @generated
	 */
	EClass getPostOfficeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getMixed()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getCode()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getIndicator()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getIndicatorOccurrence()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType#getAnyAttribute()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType <em>Post Office Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType
	 * @generated
	 */
	EClass getPostOfficeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAddressLine()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostOfficeName <em>Post Office Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Office Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostOfficeName()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostOfficeNumber <em>Post Office Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostOfficeNumber()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostalRoute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostBox()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getPostalCode()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAny()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getIndicator()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getType()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType#getAnyAttribute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType <em>Post Town Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType
	 * @generated
	 */
	EClass getPostTownNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getMixed()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getCode()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getType()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType#getAnyAttribute()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType <em>Post Town Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType
	 * @generated
	 */
	EClass getPostTownSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getMixed()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getCode()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType#getAnyAttribute()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType <em>Post Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType
	 * @generated
	 */
	EClass getPostTownType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getAddressLine()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getPostTownName <em>Post Town Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Town Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getPostTownName()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getPostTownSuffix <em>Post Town Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getPostTownSuffix()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getType()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType#getAnyAttribute()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType <em>Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Location Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType
	 * @generated
	 */
	EClass getPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getMixed()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getCode()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType#getAnyAttribute()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType <em>Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType
	 * @generated
	 */
	EClass getPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getMixed()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getCode()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getType()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getTypeOccurrence()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType#getAnyAttribute()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType <em>Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType
	 * @generated
	 */
	EClass getPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getValue()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Value();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getCode()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getType()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType#getAnyAttribute()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType <em>Premise Number Range From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range From Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType
	 * @generated
	 */
	EClass getPremiseNumberRangeFromType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getAddressLine()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumber()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType <em>Premise Number Range To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range To Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType
	 * @generated
	 */
	EClass getPremiseNumberRangeToType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getAddressLine()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumber()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType <em>Premise Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType
	 * @generated
	 */
	EClass getPremiseNumberRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getPremiseNumberRangeFrom <em>Premise Number Range From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getPremiseNumberRangeFrom()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getPremiseNumberRangeTo <em>Premise Number Range To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getPremiseNumberRangeTo()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeTo();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getIndicator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getIndicatorOccurence <em>Indicator Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getIndicatorOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_IndicatorOccurence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getNumberRangeOccurence <em>Number Range Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getNumberRangeOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_NumberRangeOccurence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getRangeType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getSeparator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType#getType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Type();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType <em>Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType
	 * @generated
	 */
	EClass getPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getMixed()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getCode()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getType()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType#getAnyAttribute()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType <em>Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType
	 * @generated
	 */
	EClass getPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getMixed()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getCode()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getIndicator()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getIndicatorOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getNumberType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getNumberTypeOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType#getAnyAttribute()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType <em>Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType
	 * @generated
	 */
	EClass getPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAddressLine()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseName <em>Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseLocation <em>Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseLocation()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumber()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberRange <em>Premise Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberRange()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberPrefix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseNumberSuffix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getBuildingName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getSubPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_SubPremise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getFirm()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getMailStop()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPostalCode()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Premise();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAny()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseDependency <em>Premise Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseDependency()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependency();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseDependencyType <em>Premise Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseDependencyType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Thoroughfare Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getPremiseThoroughfareConnector()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseThoroughfareConnector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType#getAnyAttribute()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType <em>Sorting Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType
	 * @generated
	 */
	EClass getSortingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType#getCode()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType#getType()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Type();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType <em>Sub Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType
	 * @generated
	 */
	EClass getSubAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getMixed()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getCode()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getType()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType <em>Sub Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType
	 * @generated
	 */
	EClass getSubAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAddressLine()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getSubAdministrativeAreaName <em>Sub Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Administrative Area Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getSubAdministrativeAreaName()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_SubAdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getLocality()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getPostOffice()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getPostalCode()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAny()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getIndicator()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getUsageType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType <em>Sub Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Location Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType
	 * @generated
	 */
	EClass getSubPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType#getMixed()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType#getCode()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Code();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType <em>Sub Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType
	 * @generated
	 */
	EClass getSubPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getMixed()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getCode()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getType()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getTypeOccurrence()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType#getAnyAttribute()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType <em>Sub Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType
	 * @generated
	 */
	EClass getSubPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getMixed()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getCode()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getType()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType#getAnyAttribute()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType <em>Sub Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType
	 * @generated
	 */
	EClass getSubPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getMixed()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getCode()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getType()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType#getAnyAttribute()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType <em>Sub Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType
	 * @generated
	 */
	EClass getSubPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getMixed()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getCode()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getIndicator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getIndicatorOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getNumberTypeOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getPremiseNumberSeparator <em>Premise Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Number Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getPremiseNumberSeparator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_PremiseNumberSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getType()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType#getAnyAttribute()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType <em>Sub Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType
	 * @generated
	 */
	EClass getSubPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAddressLine()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseName <em>Sub Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseLocation <em>Sub Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseLocation()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumber <em>Sub Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumber()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberPrefix <em>Sub Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberPrefix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberSuffix <em>Sub Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberSuffix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getBuildingName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getFirm()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getMailStop()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getPostalCode()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremise()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremise();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAny()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getType()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAnyAttribute()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType <em>Supplementary Postal Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplementary Postal Service Data Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType
	 * @generated
	 */
	EClass getSupplementaryPostalServiceDataType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getMixed()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getCode()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getType()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType#getAnyAttribute()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType <em>Thoroughfare Leading Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Leading Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType
	 * @generated
	 */
	EClass getThoroughfareLeadingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getMixed()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getCode()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getType()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType#getAnyAttribute()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType <em>Thoroughfare Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType
	 * @generated
	 */
	EClass getThoroughfareNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getMixed()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getCode()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getType()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType#getAnyAttribute()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType <em>Thoroughfare Number From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number From Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType
	 * @generated
	 */
	EClass getThoroughfareNumberFromType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getMixed()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getAddressLine()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getCode()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType#getAnyAttribute()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType <em>Thoroughfare Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType
	 * @generated
	 */
	EClass getThoroughfareNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getMixed()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getCode()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getType()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType#getAnyAttribute()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType <em>Thoroughfare Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType
	 * @generated
	 */
	EClass getThoroughfareNumberRangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getAddressLine()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getThoroughfareNumberFrom()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getThoroughfareNumberTo()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberTo();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getCode()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getIndicator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getNumberRangeOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_NumberRangeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getRangeType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getSeparator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType#getAnyAttribute()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType <em>Thoroughfare Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType
	 * @generated
	 */
	EClass getThoroughfareNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getMixed()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getCode()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getType()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType#getAnyAttribute()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType <em>Thoroughfare Number To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number To Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType
	 * @generated
	 */
	EClass getThoroughfareNumberToType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getMixed()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getAddressLine()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getCode()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType#getAnyAttribute()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType <em>Thoroughfare Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType
	 * @generated
	 */
	EClass getThoroughfareNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getMixed()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getCode()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getIndicator()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getNumberOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getNumberType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType#getAnyAttribute()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType <em>Thoroughfare Post Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Post Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType
	 * @generated
	 */
	EClass getThoroughfarePostDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getMixed()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getCode()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getType()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType <em>Thoroughfare Pre Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Pre Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType
	 * @generated
	 */
	EClass getThoroughfarePreDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getMixed()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getCode()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getType()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType <em>Thoroughfare Trailing Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Trailing Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType
	 * @generated
	 */
	EClass getThoroughfareTrailingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getMixed()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getCode()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getType()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType#getAnyAttribute()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType <em>Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType
	 * @generated
	 */
	EClass getThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAddressLine()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getGroup()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumber()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberRange <em>Thoroughfare Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Range</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberRange()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfarePreDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareLeadingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareName()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfareTrailingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getThoroughfarePostDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfare <em>Dependent Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfare()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentThoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentLocality()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getPremise()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getFirm()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getPostalCode()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAny()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfares()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfares();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresConnector()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresConnector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresIndicator()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getDependentThoroughfaresType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType#getAnyAttribute()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType <em>XAL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAL Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType
	 * @generated
	 */
	EClass getXALType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAddressDetails()
	 * @see #getXALType()
	 * @generated
	 */
	EReference getXALType_AddressDetails();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAny()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getVersion()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAnyAttribute()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependent Thoroughfares Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType
	 * @generated
	 */
	EEnum getDependentThoroughfaresType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType <em>Indicator Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType
	 * @generated
	 */
	EEnum getIndicatorOccurenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType2();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type3</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType3();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type4</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType4();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Number Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @generated
	 */
	EEnum getNameNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType <em>Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType
	 * @generated
	 */
	EEnum getNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType <em>Number Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType
	 * @generated
	 */
	EEnum getNumberTypeType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1 <em>Number Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1
	 * @generated
	 */
	EEnum getNumberTypeType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType <em>Range Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType
	 * @generated
	 */
	EEnum getRangeTypeType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType <em>Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType
	 * @generated
	 */
	EEnum getTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1
	 * @generated
	 */
	EEnum getTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2
	 * @generated
	 */
	EEnum getTypeOccurrenceType2();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType <em>Dependent Thoroughfares Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependent Thoroughfares Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType"
	 *        extendedMetaData="name='DependentThoroughfares_._type:Object' baseType='DependentThoroughfares_._type'"
	 * @generated
	 */
	EDataType getDependentThoroughfaresTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType <em>Indicator Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurenceType"
	 *        extendedMetaData="name='IndicatorOccurence_._type:Object' baseType='IndicatorOccurence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1 <em>Indicator Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType1"
	 *        extendedMetaData="name='IndicatorOccurrence_._1_._type:Object' baseType='IndicatorOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3 <em>Indicator Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType3"
	 *        extendedMetaData="name='IndicatorOccurrence_._3_._type:Object' baseType='IndicatorOccurrence_._3_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2 <em>Indicator Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType2"
	 *        extendedMetaData="name='IndicatorOccurrence_._2_._type:Object' baseType='IndicatorOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject2();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType <em>Indicator Occurrence Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object3</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType"
	 *        extendedMetaData="name='IndicatorOccurrence_._type:Object' baseType='IndicatorOccurrence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject3();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4 <em>Indicator Occurrence Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object4</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.IndicatorOccurrenceType4"
	 *        extendedMetaData="name='IndicatorOccurrence_._4_._type:Object' baseType='IndicatorOccurrence_._4_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject4();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType <em>Name Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Number Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType"
	 *        extendedMetaData="name='NameNumberOccurrence_._type:Object' baseType='NameNumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNameNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType <em>Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberOccurrenceType"
	 *        extendedMetaData="name='NumberOccurrence_._type:Object' baseType='NumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType <em>Number Range Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurenceType"
	 *        extendedMetaData="name='NumberRangeOccurence_._type:Object' baseType='NumberRangeOccurence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType <em>Number Range Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberRangeOccurrenceType"
	 *        extendedMetaData="name='NumberRangeOccurrence_._type:Object' baseType='NumberRangeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType <em>Number Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType"
	 *        extendedMetaData="name='NumberTypeOccurrence_._type:Object' baseType='NumberTypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeOccurrenceType1"
	 *        extendedMetaData="name='NumberTypeOccurrence_._1_._type:Object' baseType='NumberTypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType <em>Number Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType"
	 *        extendedMetaData="name='NumberType_._type:Object' baseType='NumberType_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1 <em>Number Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.NumberTypeType1"
	 *        extendedMetaData="name='NumberType_._1_._type:Object' baseType='NumberType_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType <em>Range Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Type Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.RangeTypeType"
	 *        extendedMetaData="name='RangeType_._type:Object' baseType='RangeType_._type'"
	 * @generated
	 */
	EDataType getRangeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType <em>Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType"
	 *        extendedMetaData="name='TypeOccurrence_._type:Object' baseType='TypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1 <em>Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType1"
	 *        extendedMetaData="name='TypeOccurrence_._1_._type:Object' baseType='TypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2 <em>Type Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL._2._0.TypeOccurrenceType2"
	 *        extendedMetaData="name='TypeOccurrence_._2_._type:Object' baseType='TypeOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

} //_0Package
