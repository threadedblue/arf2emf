/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.util;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.ADDRESS_DETAILS: {
				AddressDetails addressDetails = (AddressDetails)theEObject;
				T result = caseAddressDetails(addressDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_IDENTIFIER_TYPE: {
				AddressIdentifierType addressIdentifierType = (AddressIdentifierType)theEObject;
				T result = caseAddressIdentifierType(addressIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LATITUDE_DIRECTION_TYPE: {
				AddressLatitudeDirectionType addressLatitudeDirectionType = (AddressLatitudeDirectionType)theEObject;
				T result = caseAddressLatitudeDirectionType(addressLatitudeDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LATITUDE_TYPE: {
				AddressLatitudeType addressLatitudeType = (AddressLatitudeType)theEObject;
				T result = caseAddressLatitudeType(addressLatitudeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LINES_TYPE: {
				AddressLinesType addressLinesType = (AddressLinesType)theEObject;
				T result = caseAddressLinesType(addressLinesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LINE_TYPE: {
				AddressLineType addressLineType = (AddressLineType)theEObject;
				T result = caseAddressLineType(addressLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LONGITUDE_DIRECTION_TYPE: {
				AddressLongitudeDirectionType addressLongitudeDirectionType = (AddressLongitudeDirectionType)theEObject;
				T result = caseAddressLongitudeDirectionType(addressLongitudeDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_LONGITUDE_TYPE: {
				AddressLongitudeType addressLongitudeType = (AddressLongitudeType)theEObject;
				T result = caseAddressLongitudeType(addressLongitudeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADMINISTRATIVE_AREA_NAME_TYPE: {
				AdministrativeAreaNameType administrativeAreaNameType = (AdministrativeAreaNameType)theEObject;
				T result = caseAdministrativeAreaNameType(administrativeAreaNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ADMINISTRATIVE_AREA_TYPE: {
				AdministrativeAreaType administrativeAreaType = (AdministrativeAreaType)theEObject;
				T result = caseAdministrativeAreaType(administrativeAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BARCODE_TYPE: {
				BarcodeType barcodeType = (BarcodeType)theEObject;
				T result = caseBarcodeType(barcodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.BUILDING_NAME_TYPE: {
				BuildingNameType buildingNameType = (BuildingNameType)theEObject;
				T result = caseBuildingNameType(buildingNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.COUNTRY_NAME_CODE_TYPE: {
				CountryNameCodeType countryNameCodeType = (CountryNameCodeType)theEObject;
				T result = caseCountryNameCodeType(countryNameCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.COUNTRY_NAME_TYPE: {
				CountryNameType countryNameType = (CountryNameType)theEObject;
				T result = caseCountryNameType(countryNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.COUNTRY_TYPE: {
				CountryType countryType = (CountryType)theEObject;
				T result = caseCountryType(countryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPARTMENT_NAME_TYPE: {
				DepartmentNameType departmentNameType = (DepartmentNameType)theEObject;
				T result = caseDepartmentNameType(departmentNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPARTMENT_TYPE: {
				DepartmentType departmentType = (DepartmentType)theEObject;
				T result = caseDepartmentType(departmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPENDENT_LOCALITY_NAME_TYPE: {
				DependentLocalityNameType dependentLocalityNameType = (DependentLocalityNameType)theEObject;
				T result = caseDependentLocalityNameType(dependentLocalityNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPENDENT_LOCALITY_NUMBER_TYPE: {
				DependentLocalityNumberType dependentLocalityNumberType = (DependentLocalityNumberType)theEObject;
				T result = caseDependentLocalityNumberType(dependentLocalityNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPENDENT_LOCALITY_TYPE: {
				DependentLocalityType dependentLocalityType = (DependentLocalityType)theEObject;
				T result = caseDependentLocalityType(dependentLocalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPENDENT_THOROUGHFARE_TYPE: {
				DependentThoroughfareType dependentThoroughfareType = (DependentThoroughfareType)theEObject;
				T result = caseDependentThoroughfareType(dependentThoroughfareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ENDORSEMENT_LINE_CODE_TYPE: {
				EndorsementLineCodeType endorsementLineCodeType = (EndorsementLineCodeType)theEObject;
				T result = caseEndorsementLineCodeType(endorsementLineCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FIRM_NAME_TYPE: {
				FirmNameType firmNameType = (FirmNameType)theEObject;
				T result = caseFirmNameType(firmNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FIRM_TYPE: {
				FirmType firmType = (FirmType)theEObject;
				T result = caseFirmType(firmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.KEY_LINE_CODE_TYPE: {
				KeyLineCodeType keyLineCodeType = (KeyLineCodeType)theEObject;
				T result = caseKeyLineCodeType(keyLineCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LARGE_MAIL_USER_IDENTIFIER_TYPE: {
				LargeMailUserIdentifierType largeMailUserIdentifierType = (LargeMailUserIdentifierType)theEObject;
				T result = caseLargeMailUserIdentifierType(largeMailUserIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LARGE_MAIL_USER_NAME_TYPE: {
				LargeMailUserNameType largeMailUserNameType = (LargeMailUserNameType)theEObject;
				T result = caseLargeMailUserNameType(largeMailUserNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LARGE_MAIL_USER_TYPE: {
				LargeMailUserType largeMailUserType = (LargeMailUserType)theEObject;
				T result = caseLargeMailUserType(largeMailUserType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCALITY_NAME_TYPE: {
				LocalityNameType localityNameType = (LocalityNameType)theEObject;
				T result = caseLocalityNameType(localityNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LOCALITY_TYPE: {
				LocalityType localityType = (LocalityType)theEObject;
				T result = caseLocalityType(localityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MAIL_STOP_NAME_TYPE: {
				MailStopNameType mailStopNameType = (MailStopNameType)theEObject;
				T result = caseMailStopNameType(mailStopNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MAIL_STOP_NUMBER_TYPE: {
				MailStopNumberType mailStopNumberType = (MailStopNumberType)theEObject;
				T result = caseMailStopNumberType(mailStopNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MAIL_STOP_TYPE: {
				MailStopType mailStopType = (MailStopType)theEObject;
				T result = caseMailStopType(mailStopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_CODE_NUMBER_EXTENSION_TYPE: {
				PostalCodeNumberExtensionType postalCodeNumberExtensionType = (PostalCodeNumberExtensionType)theEObject;
				T result = casePostalCodeNumberExtensionType(postalCodeNumberExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_CODE_NUMBER_TYPE: {
				PostalCodeNumberType postalCodeNumberType = (PostalCodeNumberType)theEObject;
				T result = casePostalCodeNumberType(postalCodeNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_CODE_TYPE: {
				PostalCodeType postalCodeType = (PostalCodeType)theEObject;
				T result = casePostalCodeType(postalCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_ROUTE_NAME_TYPE: {
				PostalRouteNameType postalRouteNameType = (PostalRouteNameType)theEObject;
				T result = casePostalRouteNameType(postalRouteNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_ROUTE_NUMBER_TYPE: {
				PostalRouteNumberType postalRouteNumberType = (PostalRouteNumberType)theEObject;
				T result = casePostalRouteNumberType(postalRouteNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_ROUTE_TYPE: {
				PostalRouteType postalRouteType = (PostalRouteType)theEObject;
				T result = casePostalRouteType(postalRouteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POSTAL_SERVICE_ELEMENTS_TYPE: {
				PostalServiceElementsType postalServiceElementsType = (PostalServiceElementsType)theEObject;
				T result = casePostalServiceElementsType(postalServiceElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE: {
				PostBoxNumberExtensionType postBoxNumberExtensionType = (PostBoxNumberExtensionType)theEObject;
				T result = casePostBoxNumberExtensionType(postBoxNumberExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_BOX_NUMBER_PREFIX_TYPE: {
				PostBoxNumberPrefixType postBoxNumberPrefixType = (PostBoxNumberPrefixType)theEObject;
				T result = casePostBoxNumberPrefixType(postBoxNumberPrefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_BOX_NUMBER_SUFFIX_TYPE: {
				PostBoxNumberSuffixType postBoxNumberSuffixType = (PostBoxNumberSuffixType)theEObject;
				T result = casePostBoxNumberSuffixType(postBoxNumberSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_BOX_NUMBER_TYPE: {
				PostBoxNumberType postBoxNumberType = (PostBoxNumberType)theEObject;
				T result = casePostBoxNumberType(postBoxNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_BOX_TYPE: {
				PostBoxType postBoxType = (PostBoxType)theEObject;
				T result = casePostBoxType(postBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_OFFICE_NAME_TYPE: {
				PostOfficeNameType postOfficeNameType = (PostOfficeNameType)theEObject;
				T result = casePostOfficeNameType(postOfficeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_OFFICE_NUMBER_TYPE: {
				PostOfficeNumberType postOfficeNumberType = (PostOfficeNumberType)theEObject;
				T result = casePostOfficeNumberType(postOfficeNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_OFFICE_TYPE: {
				PostOfficeType postOfficeType = (PostOfficeType)theEObject;
				T result = casePostOfficeType(postOfficeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_TOWN_NAME_TYPE: {
				PostTownNameType postTownNameType = (PostTownNameType)theEObject;
				T result = casePostTownNameType(postTownNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_TOWN_SUFFIX_TYPE: {
				PostTownSuffixType postTownSuffixType = (PostTownSuffixType)theEObject;
				T result = casePostTownSuffixType(postTownSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.POST_TOWN_TYPE: {
				PostTownType postTownType = (PostTownType)theEObject;
				T result = casePostTownType(postTownType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_LOCATION_TYPE: {
				PremiseLocationType premiseLocationType = (PremiseLocationType)theEObject;
				T result = casePremiseLocationType(premiseLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NAME_TYPE: {
				PremiseNameType premiseNameType = (PremiseNameType)theEObject;
				T result = casePremiseNameType(premiseNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_PREFIX_TYPE: {
				PremiseNumberPrefixType premiseNumberPrefixType = (PremiseNumberPrefixType)theEObject;
				T result = casePremiseNumberPrefixType(premiseNumberPrefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_RANGE_FROM_TYPE: {
				PremiseNumberRangeFromType premiseNumberRangeFromType = (PremiseNumberRangeFromType)theEObject;
				T result = casePremiseNumberRangeFromType(premiseNumberRangeFromType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_RANGE_TO_TYPE: {
				PremiseNumberRangeToType premiseNumberRangeToType = (PremiseNumberRangeToType)theEObject;
				T result = casePremiseNumberRangeToType(premiseNumberRangeToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_RANGE_TYPE: {
				PremiseNumberRangeType premiseNumberRangeType = (PremiseNumberRangeType)theEObject;
				T result = casePremiseNumberRangeType(premiseNumberRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_SUFFIX_TYPE: {
				PremiseNumberSuffixType premiseNumberSuffixType = (PremiseNumberSuffixType)theEObject;
				T result = casePremiseNumberSuffixType(premiseNumberSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_NUMBER_TYPE: {
				PremiseNumberType premiseNumberType = (PremiseNumberType)theEObject;
				T result = casePremiseNumberType(premiseNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PREMISE_TYPE: {
				PremiseType premiseType = (PremiseType)theEObject;
				T result = casePremiseType(premiseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SORTING_CODE_TYPE: {
				SortingCodeType sortingCodeType = (SortingCodeType)theEObject;
				T result = caseSortingCodeType(sortingCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_ADMINISTRATIVE_AREA_NAME_TYPE: {
				SubAdministrativeAreaNameType subAdministrativeAreaNameType = (SubAdministrativeAreaNameType)theEObject;
				T result = caseSubAdministrativeAreaNameType(subAdministrativeAreaNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_ADMINISTRATIVE_AREA_TYPE: {
				SubAdministrativeAreaType subAdministrativeAreaType = (SubAdministrativeAreaType)theEObject;
				T result = caseSubAdministrativeAreaType(subAdministrativeAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_LOCATION_TYPE: {
				SubPremiseLocationType subPremiseLocationType = (SubPremiseLocationType)theEObject;
				T result = caseSubPremiseLocationType(subPremiseLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_NAME_TYPE: {
				SubPremiseNameType subPremiseNameType = (SubPremiseNameType)theEObject;
				T result = caseSubPremiseNameType(subPremiseNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_NUMBER_PREFIX_TYPE: {
				SubPremiseNumberPrefixType subPremiseNumberPrefixType = (SubPremiseNumberPrefixType)theEObject;
				T result = caseSubPremiseNumberPrefixType(subPremiseNumberPrefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_NUMBER_SUFFIX_TYPE: {
				SubPremiseNumberSuffixType subPremiseNumberSuffixType = (SubPremiseNumberSuffixType)theEObject;
				T result = caseSubPremiseNumberSuffixType(subPremiseNumberSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_NUMBER_TYPE: {
				SubPremiseNumberType subPremiseNumberType = (SubPremiseNumberType)theEObject;
				T result = caseSubPremiseNumberType(subPremiseNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUB_PREMISE_TYPE: {
				SubPremiseType subPremiseType = (SubPremiseType)theEObject;
				T result = caseSubPremiseType(subPremiseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE: {
				SupplementaryPostalServiceDataType supplementaryPostalServiceDataType = (SupplementaryPostalServiceDataType)theEObject;
				T result = caseSupplementaryPostalServiceDataType(supplementaryPostalServiceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_LEADING_TYPE_TYPE: {
				ThoroughfareLeadingTypeType thoroughfareLeadingTypeType = (ThoroughfareLeadingTypeType)theEObject;
				T result = caseThoroughfareLeadingTypeType(thoroughfareLeadingTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NAME_TYPE: {
				ThoroughfareNameType thoroughfareNameType = (ThoroughfareNameType)theEObject;
				T result = caseThoroughfareNameType(thoroughfareNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_FROM_TYPE: {
				ThoroughfareNumberFromType thoroughfareNumberFromType = (ThoroughfareNumberFromType)theEObject;
				T result = caseThoroughfareNumberFromType(thoroughfareNumberFromType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_PREFIX_TYPE: {
				ThoroughfareNumberPrefixType thoroughfareNumberPrefixType = (ThoroughfareNumberPrefixType)theEObject;
				T result = caseThoroughfareNumberPrefixType(thoroughfareNumberPrefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_RANGE_TYPE: {
				ThoroughfareNumberRangeType thoroughfareNumberRangeType = (ThoroughfareNumberRangeType)theEObject;
				T result = caseThoroughfareNumberRangeType(thoroughfareNumberRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_SUFFIX_TYPE: {
				ThoroughfareNumberSuffixType thoroughfareNumberSuffixType = (ThoroughfareNumberSuffixType)theEObject;
				T result = caseThoroughfareNumberSuffixType(thoroughfareNumberSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE: {
				ThoroughfareNumberToType thoroughfareNumberToType = (ThoroughfareNumberToType)theEObject;
				T result = caseThoroughfareNumberToType(thoroughfareNumberToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_NUMBER_TYPE: {
				ThoroughfareNumberType thoroughfareNumberType = (ThoroughfareNumberType)theEObject;
				T result = caseThoroughfareNumberType(thoroughfareNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_POST_DIRECTION_TYPE: {
				ThoroughfarePostDirectionType thoroughfarePostDirectionType = (ThoroughfarePostDirectionType)theEObject;
				T result = caseThoroughfarePostDirectionType(thoroughfarePostDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_PRE_DIRECTION_TYPE: {
				ThoroughfarePreDirectionType thoroughfarePreDirectionType = (ThoroughfarePreDirectionType)theEObject;
				T result = caseThoroughfarePreDirectionType(thoroughfarePreDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_TRAILING_TYPE_TYPE: {
				ThoroughfareTrailingTypeType thoroughfareTrailingTypeType = (ThoroughfareTrailingTypeType)theEObject;
				T result = caseThoroughfareTrailingTypeType(thoroughfareTrailingTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.THOROUGHFARE_TYPE: {
				ThoroughfareType thoroughfareType = (ThoroughfareType)theEObject;
				T result = caseThoroughfareType(thoroughfareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.XAL_TYPE: {
				XALType xalType = (XALType)theEObject;
				T result = caseXALType(xalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressDetails(AddressDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressIdentifierType(AddressIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Latitude Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Latitude Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLatitudeDirectionType(AddressLatitudeDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Latitude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLatitudeType(AddressLatitudeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Lines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Lines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLinesType(AddressLinesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLineType(AddressLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Longitude Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Longitude Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLongitudeDirectionType(AddressLongitudeDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Longitude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLongitudeType(AddressLongitudeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Area Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Area Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeAreaNameType(AdministrativeAreaNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeAreaType(AdministrativeAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barcode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barcode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarcodeType(BarcodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingNameType(BuildingNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Name Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Name Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryNameCodeType(CountryNameCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryNameType(CountryNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryType(CountryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartmentNameType(DepartmentNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartmentType(DepartmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Locality Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Locality Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentLocalityNameType(DependentLocalityNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Locality Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Locality Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentLocalityNumberType(DependentLocalityNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Locality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Locality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentLocalityType(DependentLocalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Thoroughfare Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Thoroughfare Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentThoroughfareType(DependentThoroughfareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endorsement Line Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endorsement Line Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndorsementLineCodeType(EndorsementLineCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firm Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firm Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmNameType(FirmNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmType(FirmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Line Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Line Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyLineCodeType(KeyLineCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Mail User Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Mail User Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeMailUserIdentifierType(LargeMailUserIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Mail User Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Mail User Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeMailUserNameType(LargeMailUserNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Mail User Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Mail User Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeMailUserType(LargeMailUserType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locality Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locality Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalityNameType(LocalityNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalityType(LocalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mail Stop Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mail Stop Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailStopNameType(MailStopNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mail Stop Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mail Stop Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailStopNumberType(MailStopNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mail Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mail Stop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailStopType(MailStopType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Code Number Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Code Number Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalCodeNumberExtensionType(PostalCodeNumberExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Code Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Code Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalCodeNumberType(PostalCodeNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalCodeType(PostalCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Route Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Route Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalRouteNameType(PostalRouteNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Route Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Route Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalRouteNumberType(PostalRouteNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Route Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Route Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalRouteType(PostalRouteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Service Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Service Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalServiceElementsType(PostalServiceElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Box Number Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Box Number Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostBoxNumberExtensionType(PostBoxNumberExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Box Number Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Box Number Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostBoxNumberPrefixType(PostBoxNumberPrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Box Number Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Box Number Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostBoxNumberSuffixType(PostBoxNumberSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Box Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Box Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostBoxNumberType(PostBoxNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostBoxType(PostBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Office Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Office Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostOfficeNameType(PostOfficeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Office Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Office Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostOfficeNumberType(PostOfficeNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Office Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Office Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostOfficeType(PostOfficeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Town Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Town Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostTownNameType(PostTownNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Town Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Town Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostTownSuffixType(PostTownSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Town Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Town Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostTownType(PostTownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseLocationType(PremiseLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNameType(PremiseNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberPrefixType(PremiseNumberPrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Range From Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Range From Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberRangeFromType(PremiseNumberRangeFromType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Range To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Range To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberRangeToType(PremiseNumberRangeToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberRangeType(PremiseNumberRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberSuffixType(PremiseNumberSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseNumberType(PremiseNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremiseType(PremiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorting Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorting Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortingCodeType(SortingCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Administrative Area Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Administrative Area Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubAdministrativeAreaNameType(SubAdministrativeAreaNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Administrative Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Administrative Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubAdministrativeAreaType(SubAdministrativeAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseLocationType(SubPremiseLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseNameType(SubPremiseNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Number Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Number Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseNumberPrefixType(SubPremiseNumberPrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Number Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Number Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseNumberSuffixType(SubPremiseNumberSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseNumberType(SubPremiseNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Premise Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Premise Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPremiseType(SubPremiseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplementary Postal Service Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplementary Postal Service Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplementaryPostalServiceDataType(SupplementaryPostalServiceDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Leading Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Leading Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareLeadingTypeType(ThoroughfareLeadingTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNameType(ThoroughfareNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number From Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number From Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberFromType(ThoroughfareNumberFromType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberPrefixType(ThoroughfareNumberPrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberRangeType(ThoroughfareNumberRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberSuffixType(ThoroughfareNumberSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberToType(ThoroughfareNumberToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareNumberType(ThoroughfareNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Post Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Post Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfarePostDirectionType(ThoroughfarePostDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Pre Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Pre Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfarePreDirectionType(ThoroughfarePreDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Trailing Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Trailing Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareTrailingTypeType(ThoroughfareTrailingTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thoroughfare Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thoroughfare Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThoroughfareType(ThoroughfareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XAL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XAL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXALType(XALType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch
