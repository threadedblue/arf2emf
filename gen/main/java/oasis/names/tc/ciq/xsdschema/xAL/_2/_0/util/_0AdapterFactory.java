/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.util;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseAddressDetails(AddressDetails object) {
				return createAddressDetailsAdapter();
			}
			@Override
			public Adapter caseAddressIdentifierType(AddressIdentifierType object) {
				return createAddressIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseAddressLatitudeDirectionType(AddressLatitudeDirectionType object) {
				return createAddressLatitudeDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAddressLatitudeType(AddressLatitudeType object) {
				return createAddressLatitudeTypeAdapter();
			}
			@Override
			public Adapter caseAddressLinesType(AddressLinesType object) {
				return createAddressLinesTypeAdapter();
			}
			@Override
			public Adapter caseAddressLineType(AddressLineType object) {
				return createAddressLineTypeAdapter();
			}
			@Override
			public Adapter caseAddressLongitudeDirectionType(AddressLongitudeDirectionType object) {
				return createAddressLongitudeDirectionTypeAdapter();
			}
			@Override
			public Adapter caseAddressLongitudeType(AddressLongitudeType object) {
				return createAddressLongitudeTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAdministrativeAreaNameType(AdministrativeAreaNameType object) {
				return createAdministrativeAreaNameTypeAdapter();
			}
			@Override
			public Adapter caseAdministrativeAreaType(AdministrativeAreaType object) {
				return createAdministrativeAreaTypeAdapter();
			}
			@Override
			public Adapter caseBarcodeType(BarcodeType object) {
				return createBarcodeTypeAdapter();
			}
			@Override
			public Adapter caseBuildingNameType(BuildingNameType object) {
				return createBuildingNameTypeAdapter();
			}
			@Override
			public Adapter caseCountryNameCodeType(CountryNameCodeType object) {
				return createCountryNameCodeTypeAdapter();
			}
			@Override
			public Adapter caseCountryNameType(CountryNameType object) {
				return createCountryNameTypeAdapter();
			}
			@Override
			public Adapter caseCountryType(CountryType object) {
				return createCountryTypeAdapter();
			}
			@Override
			public Adapter caseDepartmentNameType(DepartmentNameType object) {
				return createDepartmentNameTypeAdapter();
			}
			@Override
			public Adapter caseDepartmentType(DepartmentType object) {
				return createDepartmentTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityNameType(DependentLocalityNameType object) {
				return createDependentLocalityNameTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityNumberType(DependentLocalityNumberType object) {
				return createDependentLocalityNumberTypeAdapter();
			}
			@Override
			public Adapter caseDependentLocalityType(DependentLocalityType object) {
				return createDependentLocalityTypeAdapter();
			}
			@Override
			public Adapter caseDependentThoroughfareType(DependentThoroughfareType object) {
				return createDependentThoroughfareTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndorsementLineCodeType(EndorsementLineCodeType object) {
				return createEndorsementLineCodeTypeAdapter();
			}
			@Override
			public Adapter caseFirmNameType(FirmNameType object) {
				return createFirmNameTypeAdapter();
			}
			@Override
			public Adapter caseFirmType(FirmType object) {
				return createFirmTypeAdapter();
			}
			@Override
			public Adapter caseKeyLineCodeType(KeyLineCodeType object) {
				return createKeyLineCodeTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserIdentifierType(LargeMailUserIdentifierType object) {
				return createLargeMailUserIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserNameType(LargeMailUserNameType object) {
				return createLargeMailUserNameTypeAdapter();
			}
			@Override
			public Adapter caseLargeMailUserType(LargeMailUserType object) {
				return createLargeMailUserTypeAdapter();
			}
			@Override
			public Adapter caseLocalityNameType(LocalityNameType object) {
				return createLocalityNameTypeAdapter();
			}
			@Override
			public Adapter caseLocalityType(LocalityType object) {
				return createLocalityTypeAdapter();
			}
			@Override
			public Adapter caseMailStopNameType(MailStopNameType object) {
				return createMailStopNameTypeAdapter();
			}
			@Override
			public Adapter caseMailStopNumberType(MailStopNumberType object) {
				return createMailStopNumberTypeAdapter();
			}
			@Override
			public Adapter caseMailStopType(MailStopType object) {
				return createMailStopTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeNumberExtensionType(PostalCodeNumberExtensionType object) {
				return createPostalCodeNumberExtensionTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeNumberType(PostalCodeNumberType object) {
				return createPostalCodeNumberTypeAdapter();
			}
			@Override
			public Adapter casePostalCodeType(PostalCodeType object) {
				return createPostalCodeTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteNameType(PostalRouteNameType object) {
				return createPostalRouteNameTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteNumberType(PostalRouteNumberType object) {
				return createPostalRouteNumberTypeAdapter();
			}
			@Override
			public Adapter casePostalRouteType(PostalRouteType object) {
				return createPostalRouteTypeAdapter();
			}
			@Override
			public Adapter casePostalServiceElementsType(PostalServiceElementsType object) {
				return createPostalServiceElementsTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberExtensionType(PostBoxNumberExtensionType object) {
				return createPostBoxNumberExtensionTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberPrefixType(PostBoxNumberPrefixType object) {
				return createPostBoxNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberSuffixType(PostBoxNumberSuffixType object) {
				return createPostBoxNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter casePostBoxNumberType(PostBoxNumberType object) {
				return createPostBoxNumberTypeAdapter();
			}
			@Override
			public Adapter casePostBoxType(PostBoxType object) {
				return createPostBoxTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeNameType(PostOfficeNameType object) {
				return createPostOfficeNameTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeNumberType(PostOfficeNumberType object) {
				return createPostOfficeNumberTypeAdapter();
			}
			@Override
			public Adapter casePostOfficeType(PostOfficeType object) {
				return createPostOfficeTypeAdapter();
			}
			@Override
			public Adapter casePostTownNameType(PostTownNameType object) {
				return createPostTownNameTypeAdapter();
			}
			@Override
			public Adapter casePostTownSuffixType(PostTownSuffixType object) {
				return createPostTownSuffixTypeAdapter();
			}
			@Override
			public Adapter casePostTownType(PostTownType object) {
				return createPostTownTypeAdapter();
			}
			@Override
			public Adapter casePremiseLocationType(PremiseLocationType object) {
				return createPremiseLocationTypeAdapter();
			}
			@Override
			public Adapter casePremiseNameType(PremiseNameType object) {
				return createPremiseNameTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberPrefixType(PremiseNumberPrefixType object) {
				return createPremiseNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeFromType(PremiseNumberRangeFromType object) {
				return createPremiseNumberRangeFromTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeToType(PremiseNumberRangeToType object) {
				return createPremiseNumberRangeToTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberRangeType(PremiseNumberRangeType object) {
				return createPremiseNumberRangeTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberSuffixType(PremiseNumberSuffixType object) {
				return createPremiseNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter casePremiseNumberType(PremiseNumberType object) {
				return createPremiseNumberTypeAdapter();
			}
			@Override
			public Adapter casePremiseType(PremiseType object) {
				return createPremiseTypeAdapter();
			}
			@Override
			public Adapter caseSortingCodeType(SortingCodeType object) {
				return createSortingCodeTypeAdapter();
			}
			@Override
			public Adapter caseSubAdministrativeAreaNameType(SubAdministrativeAreaNameType object) {
				return createSubAdministrativeAreaNameTypeAdapter();
			}
			@Override
			public Adapter caseSubAdministrativeAreaType(SubAdministrativeAreaType object) {
				return createSubAdministrativeAreaTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseLocationType(SubPremiseLocationType object) {
				return createSubPremiseLocationTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNameType(SubPremiseNameType object) {
				return createSubPremiseNameTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberPrefixType(SubPremiseNumberPrefixType object) {
				return createSubPremiseNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberSuffixType(SubPremiseNumberSuffixType object) {
				return createSubPremiseNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseNumberType(SubPremiseNumberType object) {
				return createSubPremiseNumberTypeAdapter();
			}
			@Override
			public Adapter caseSubPremiseType(SubPremiseType object) {
				return createSubPremiseTypeAdapter();
			}
			@Override
			public Adapter caseSupplementaryPostalServiceDataType(SupplementaryPostalServiceDataType object) {
				return createSupplementaryPostalServiceDataTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareLeadingTypeType(ThoroughfareLeadingTypeType object) {
				return createThoroughfareLeadingTypeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNameType(ThoroughfareNameType object) {
				return createThoroughfareNameTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberFromType(ThoroughfareNumberFromType object) {
				return createThoroughfareNumberFromTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberPrefixType(ThoroughfareNumberPrefixType object) {
				return createThoroughfareNumberPrefixTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberRangeType(ThoroughfareNumberRangeType object) {
				return createThoroughfareNumberRangeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberSuffixType(ThoroughfareNumberSuffixType object) {
				return createThoroughfareNumberSuffixTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberToType(ThoroughfareNumberToType object) {
				return createThoroughfareNumberToTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareNumberType(ThoroughfareNumberType object) {
				return createThoroughfareNumberTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfarePostDirectionType(ThoroughfarePostDirectionType object) {
				return createThoroughfarePostDirectionTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfarePreDirectionType(ThoroughfarePreDirectionType object) {
				return createThoroughfarePreDirectionTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareTrailingTypeType(ThoroughfareTrailingTypeType object) {
				return createThoroughfareTrailingTypeTypeAdapter();
			}
			@Override
			public Adapter caseThoroughfareType(ThoroughfareType object) {
				return createThoroughfareTypeAdapter();
			}
			@Override
			public Adapter caseXALType(XALType object) {
				return createXALTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails
	 * @generated
	 */
	public Adapter createAddressDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType <em>Address Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressIdentifierType
	 * @generated
	 */
	public Adapter createAddressIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType <em>Address Latitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeDirectionType
	 * @generated
	 */
	public Adapter createAddressLatitudeDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType <em>Address Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLatitudeType
	 * @generated
	 */
	public Adapter createAddressLatitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType <em>Address Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLinesType
	 * @generated
	 */
	public Adapter createAddressLinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType <em>Address Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType
	 * @generated
	 */
	public Adapter createAddressLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType <em>Address Longitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeDirectionType
	 * @generated
	 */
	public Adapter createAddressLongitudeDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType <em>Address Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLongitudeType
	 * @generated
	 */
	public Adapter createAddressLongitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType <em>Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaNameType
	 * @generated
	 */
	public Adapter createAdministrativeAreaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType <em>Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.AdministrativeAreaType
	 * @generated
	 */
	public Adapter createAdministrativeAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType <em>Barcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BarcodeType
	 * @generated
	 */
	public Adapter createBarcodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType <em>Building Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType
	 * @generated
	 */
	public Adapter createBuildingNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType <em>Country Name Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameCodeType
	 * @generated
	 */
	public Adapter createCountryNameCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType <em>Country Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryNameType
	 * @generated
	 */
	public Adapter createCountryNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.CountryType
	 * @generated
	 */
	public Adapter createCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType <em>Department Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentNameType
	 * @generated
	 */
	public Adapter createDepartmentNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType <em>Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DepartmentType
	 * @generated
	 */
	public Adapter createDepartmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType <em>Dependent Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNameType
	 * @generated
	 */
	public Adapter createDependentLocalityNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType <em>Dependent Locality Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType
	 * @generated
	 */
	public Adapter createDependentLocalityNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType <em>Dependent Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType
	 * @generated
	 */
	public Adapter createDependentLocalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType <em>Dependent Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType
	 * @generated
	 */
	public Adapter createDependentThoroughfareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType <em>Endorsement Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.EndorsementLineCodeType
	 * @generated
	 */
	public Adapter createEndorsementLineCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType <em>Firm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmNameType
	 * @generated
	 */
	public Adapter createFirmNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType <em>Firm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType
	 * @generated
	 */
	public Adapter createFirmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType <em>Key Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.KeyLineCodeType
	 * @generated
	 */
	public Adapter createKeyLineCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType <em>Large Mail User Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserIdentifierType
	 * @generated
	 */
	public Adapter createLargeMailUserIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType <em>Large Mail User Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserNameType
	 * @generated
	 */
	public Adapter createLargeMailUserNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType <em>Large Mail User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LargeMailUserType
	 * @generated
	 */
	public Adapter createLargeMailUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType <em>Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityNameType
	 * @generated
	 */
	public Adapter createLocalityNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.LocalityType
	 * @generated
	 */
	public Adapter createLocalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType <em>Mail Stop Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNameType
	 * @generated
	 */
	public Adapter createMailStopNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType <em>Mail Stop Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopNumberType
	 * @generated
	 */
	public Adapter createMailStopNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType <em>Mail Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType
	 * @generated
	 */
	public Adapter createMailStopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType <em>Postal Code Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberExtensionType
	 * @generated
	 */
	public Adapter createPostalCodeNumberExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType <em>Postal Code Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeNumberType
	 * @generated
	 */
	public Adapter createPostalCodeNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType
	 * @generated
	 */
	public Adapter createPostalCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType <em>Postal Route Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType
	 * @generated
	 */
	public Adapter createPostalRouteNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType <em>Postal Route Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType
	 * @generated
	 */
	public Adapter createPostalRouteNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType <em>Postal Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType
	 * @generated
	 */
	public Adapter createPostalRouteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType <em>Postal Service Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalServiceElementsType
	 * @generated
	 */
	public Adapter createPostalServiceElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType <em>Post Box Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType
	 * @generated
	 */
	public Adapter createPostBoxNumberExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType <em>Post Box Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberPrefixType
	 * @generated
	 */
	public Adapter createPostBoxNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType <em>Post Box Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberSuffixType
	 * @generated
	 */
	public Adapter createPostBoxNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType <em>Post Box Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberType
	 * @generated
	 */
	public Adapter createPostBoxNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType <em>Post Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType
	 * @generated
	 */
	public Adapter createPostBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType <em>Post Office Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNameType
	 * @generated
	 */
	public Adapter createPostOfficeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType <em>Post Office Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeNumberType
	 * @generated
	 */
	public Adapter createPostOfficeNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType <em>Post Office Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostOfficeType
	 * @generated
	 */
	public Adapter createPostOfficeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType <em>Post Town Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownNameType
	 * @generated
	 */
	public Adapter createPostTownNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType <em>Post Town Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownSuffixType
	 * @generated
	 */
	public Adapter createPostTownSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType <em>Post Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PostTownType
	 * @generated
	 */
	public Adapter createPostTownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType <em>Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseLocationType
	 * @generated
	 */
	public Adapter createPremiseLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType <em>Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNameType
	 * @generated
	 */
	public Adapter createPremiseNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType <em>Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType
	 * @generated
	 */
	public Adapter createPremiseNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType <em>Premise Number Range From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeFromType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType <em>Premise Number Range To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType <em>Premise Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeType
	 * @generated
	 */
	public Adapter createPremiseNumberRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType <em>Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType
	 * @generated
	 */
	public Adapter createPremiseNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType <em>Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType
	 * @generated
	 */
	public Adapter createPremiseNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType <em>Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType
	 * @generated
	 */
	public Adapter createPremiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType <em>Sorting Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SortingCodeType
	 * @generated
	 */
	public Adapter createSortingCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType <em>Sub Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaNameType
	 * @generated
	 */
	public Adapter createSubAdministrativeAreaNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType <em>Sub Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubAdministrativeAreaType
	 * @generated
	 */
	public Adapter createSubAdministrativeAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType <em>Sub Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType
	 * @generated
	 */
	public Adapter createSubPremiseLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType <em>Sub Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType
	 * @generated
	 */
	public Adapter createSubPremiseNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType <em>Sub Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType
	 * @generated
	 */
	public Adapter createSubPremiseNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType <em>Sub Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType
	 * @generated
	 */
	public Adapter createSubPremiseNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType <em>Sub Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType
	 * @generated
	 */
	public Adapter createSubPremiseNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType <em>Sub Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType
	 * @generated
	 */
	public Adapter createSubPremiseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType <em>Supplementary Postal Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.SupplementaryPostalServiceDataType
	 * @generated
	 */
	public Adapter createSupplementaryPostalServiceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType <em>Thoroughfare Leading Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType
	 * @generated
	 */
	public Adapter createThoroughfareLeadingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType <em>Thoroughfare Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType
	 * @generated
	 */
	public Adapter createThoroughfareNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType <em>Thoroughfare Number From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberFromType
	 * @generated
	 */
	public Adapter createThoroughfareNumberFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType <em>Thoroughfare Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType
	 * @generated
	 */
	public Adapter createThoroughfareNumberPrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType <em>Thoroughfare Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType
	 * @generated
	 */
	public Adapter createThoroughfareNumberRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType <em>Thoroughfare Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType
	 * @generated
	 */
	public Adapter createThoroughfareNumberSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType <em>Thoroughfare Number To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType
	 * @generated
	 */
	public Adapter createThoroughfareNumberToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType <em>Thoroughfare Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType
	 * @generated
	 */
	public Adapter createThoroughfareNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType <em>Thoroughfare Post Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType
	 * @generated
	 */
	public Adapter createThoroughfarePostDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType <em>Thoroughfare Pre Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType
	 * @generated
	 */
	public Adapter createThoroughfarePreDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType <em>Thoroughfare Trailing Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType
	 * @generated
	 */
	public Adapter createThoroughfareTrailingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType <em>Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType
	 * @generated
	 */
	public Adapter createThoroughfareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType <em>XAL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType
	 * @generated
	 */
	public Adapter createXALTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory
