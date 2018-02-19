/**
 */
package gov.nist.scap.schema.asset.identification._1.util;

import gov.nist.scap.schema.asset.identification._1.*;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.mitre.cpe.naming._2._2Package;

import org.mitre.cpe.naming._2.util._2Validator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.asset.identification._1._1Package
 * @generated
 */
public class _1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _1Validator INSTANCE = new _1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.nist.scap.schema.asset.identification._1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _2Validator __2Validator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		__2Validator = _2Validator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _1Package.ASSET_IDENTIFICATION_TYPE:
				return validateAssetIdentificationType((AssetIdentificationType)value, diagnostics, context);
			case _1Package.ASSETS_TYPE:
				return validateAssetsType((AssetsType)value, diagnostics, context);
			case _1Package.ASSET_TYPE:
				return validateAssetType((AssetType)value, diagnostics, context);
			case _1Package.ASSET_TYPE1:
				return validateAssetType1((AssetType1)value, diagnostics, context);
			case _1Package.BIRTHDATE_TYPE:
				return validateBirthdateType((BirthdateType)value, diagnostics, context);
			case _1Package.CIDR_TYPE1:
				return validateCidrType1((CidrType1)value, diagnostics, context);
			case _1Package.CIRCUIT_NAME_TYPE:
				return validateCircuitNameType((CircuitNameType)value, diagnostics, context);
			case _1Package.CIRCUIT_TYPE:
				return validateCircuitType((CircuitType)value, diagnostics, context);
			case _1Package.COMPUTING_DEVICE_TYPE:
				return validateComputingDeviceType((ComputingDeviceType)value, diagnostics, context);
			case _1Package.CONNECTIONS_TYPE:
				return validateConnectionsType((ConnectionsType)value, diagnostics, context);
			case _1Package.CPE_TYPE1:
				return validateCpeType1((CpeType1)value, diagnostics, context);
			case _1Package.DATABASE_TYPE:
				return validateDatabaseType((DatabaseType)value, diagnostics, context);
			case _1Package.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case _1Package.DISTINGUISHED_NAME_TYPE:
				return validateDistinguishedNameType((DistinguishedNameType)value, diagnostics, context);
			case _1Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _1Package.DOCUMENT_ROOT_TYPE:
				return validateDocumentRootType((DocumentRootType)value, diagnostics, context);
			case _1Package.EMAIL_ADDRESS_TYPE:
				return validateEmailAddressType((EmailAddressType)value, diagnostics, context);
			case _1Package.EXTENDED_INFORMATION_TYPE:
				return validateExtendedInformationType((ExtendedInformationType)value, diagnostics, context);
			case _1Package.FQDN_TYPE:
				return validateFqdnType((FqdnType)value, diagnostics, context);
			case _1Package.HOSTNAME_TYPE1:
				return validateHostnameType1((HostnameType1)value, diagnostics, context);
			case _1Package.HOST_TYPE:
				return validateHostType((HostType)value, diagnostics, context);
			case _1Package.INSTALLATION_ID_TYPE:
				return validateInstallationIdType((InstallationIdType)value, diagnostics, context);
			case _1Package.INSTANCE_NAME_TYPE:
				return validateInstanceNameType((InstanceNameType)value, diagnostics, context);
			case _1Package.IP_ADDRESS_TYPE:
				return validateIpAddressType((IpAddressType)value, diagnostics, context);
			case _1Package.IP_NET_RANGE_TYPE:
				return validateIpNetRangeType((IpNetRangeType)value, diagnostics, context);
			case _1Package.IP_V4_TYPE1:
				return validateIpV4Type1((IpV4Type1)value, diagnostics, context);
			case _1Package.IP_V6_TYPE1:
				return validateIpV6Type1((IpV6Type1)value, diagnostics, context);
			case _1Package.IT_ASSET_TYPE:
				return validateItAssetType((ItAssetType)value, diagnostics, context);
			case _1Package.LICENSE_TYPE:
				return validateLicenseType((LicenseType)value, diagnostics, context);
			case _1Package.LOCALE_TYPE1:
				return validateLocaleType1((LocaleType1)value, diagnostics, context);
			case _1Package.LOCATION_POINT_TYPE:
				return validateLocationPointType((LocationPointType)value, diagnostics, context);
			case _1Package.LOCATION_REGION_TYPE:
				return validateLocationRegionType((LocationRegionType)value, diagnostics, context);
			case _1Package.LOCATIONS_TYPE:
				return validateLocationsType((LocationsType)value, diagnostics, context);
			case _1Package.MAC_ADDRESS_TYPE1:
				return validateMacAddressType1((MacAddressType1)value, diagnostics, context);
			case _1Package.MOTHERBOARD_GUID_TYPE:
				return validateMotherboardGuidType((MotherboardGuidType)value, diagnostics, context);
			case _1Package.NETWORK_INTERFACE_TYPE:
				return validateNetworkInterfaceType((NetworkInterfaceType)value, diagnostics, context);
			case _1Package.NETWORK_NAME_TYPE:
				return validateNetworkNameType((NetworkNameType)value, diagnostics, context);
			case _1Package.NETWORK_TYPE:
				return validateNetworkType((NetworkType)value, diagnostics, context);
			case _1Package.ORGANIZATION_TYPE:
				return validateOrganizationType((OrganizationType)value, diagnostics, context);
			case _1Package.PERSON_TYPE:
				return validatePersonType((PersonType)value, diagnostics, context);
			case _1Package.PORT_RANGE_TYPE:
				return validatePortRangeType((PortRangeType)value, diagnostics, context);
			case _1Package.PORT_TYPE1:
				return validatePortType1((PortType1)value, diagnostics, context);
			case _1Package.PROTOCOL_TYPE:
				return validateProtocolType((ProtocolType)value, diagnostics, context);
			case _1Package.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case _1Package.SOFTWARE_TYPE:
				return validateSoftwareType((SoftwareType)value, diagnostics, context);
			case _1Package.SYNTHETIC_ID_TYPE:
				return validateSyntheticIdType((SyntheticIdType)value, diagnostics, context);
			case _1Package.SYSTEM_NAME_TYPE:
				return validateSystemNameType((SystemNameType)value, diagnostics, context);
			case _1Package.SYSTEM_TYPE:
				return validateSystemType((SystemType)value, diagnostics, context);
			case _1Package.TELEPHONE_NUMBER_TYPE1:
				return validateTelephoneNumberType1((TelephoneNumberType1)value, diagnostics, context);
			case _1Package.URL_TYPE:
				return validateUrlType((UrlType)value, diagnostics, context);
			case _1Package.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			case _1Package.WEBSITE_TYPE:
				return validateWebsiteType((WebsiteType)value, diagnostics, context);
			case _1Package.WEBSITE_URL_TYPE:
				return validateWebsiteUrlType((WebsiteUrlType)value, diagnostics, context);
			case _1Package.CIDR_TYPE:
				return validateCidrType((String)value, diagnostics, context);
			case _1Package.CPE_TYPE:
				return validateCpeType((String)value, diagnostics, context);
			case _1Package.HOSTNAME_TYPE:
				return validateHostnameType((String)value, diagnostics, context);
			case _1Package.IPV4_TYPE:
				return validateIpv4Type((String)value, diagnostics, context);
			case _1Package.IPV6_TYPE:
				return validateIpv6Type((String)value, diagnostics, context);
			case _1Package.LATITUDE_TYPE:
				return validateLatitudeType((Double)value, diagnostics, context);
			case _1Package.LATITUDE_TYPE_OBJECT:
				return validateLatitudeTypeObject((Double)value, diagnostics, context);
			case _1Package.LOCALE_TYPE:
				return validateLocaleType((String)value, diagnostics, context);
			case _1Package.LONGITUDE_TYPE:
				return validateLongitudeType((Double)value, diagnostics, context);
			case _1Package.LONGITUDE_TYPE_OBJECT:
				return validateLongitudeTypeObject((Double)value, diagnostics, context);
			case _1Package.MAC_ADDRESS_TYPE:
				return validateMacAddressType((String)value, diagnostics, context);
			case _1Package.PORT_TYPE:
				return validatePortType((BigInteger)value, diagnostics, context);
			case _1Package.RADIUS_TYPE:
				return validateRadiusType((Double)value, diagnostics, context);
			case _1Package.RADIUS_TYPE_OBJECT:
				return validateRadiusTypeObject((Double)value, diagnostics, context);
			case _1Package.TELEPHONE_NUMBER_TYPE:
				return validateTelephoneNumberType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetIdentificationType(AssetIdentificationType assetIdentificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assetIdentificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetsType(AssetsType assetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetType(AssetType assetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetType1(AssetType1 assetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assetType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthdateType(BirthdateType birthdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(birthdateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCidrType1(CidrType1 cidrType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cidrType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircuitNameType(CircuitNameType circuitNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circuitNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircuitType(CircuitType circuitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circuitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingDeviceType(ComputingDeviceType computingDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computingDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionsType(ConnectionsType connectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpeType1(CpeType1 cpeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseType(DatabaseType databaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistinguishedNameType(DistinguishedNameType distinguishedNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distinguishedNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRootType(DocumentRootType documentRootType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRootType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType(EmailAddressType emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emailAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedInformationType(ExtendedInformationType extendedInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFqdnType(FqdnType fqdnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fqdnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostnameType1(HostnameType1 hostnameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hostnameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostType(HostType hostType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstallationIdType(InstallationIdType installationIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(installationIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceNameType(InstanceNameType instanceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressType(IpAddressType ipAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpNetRangeType(IpNetRangeType ipNetRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipNetRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV4Type1(IpV4Type1 ipV4Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipV4Type1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpV6Type1(IpV6Type1 ipV6Type1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ipV6Type1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItAssetType(ItAssetType itAssetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itAssetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseType(LicenseType licenseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licenseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType1(LocaleType1 localeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPointType(LocationPointType locationPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationRegionType(LocationRegionType locationRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationsType(LocationsType locationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacAddressType1(MacAddressType1 macAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macAddressType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotherboardGuidType(MotherboardGuidType motherboardGuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motherboardGuidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInterfaceType(NetworkInterfaceType networkInterfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkInterfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkNameType(NetworkNameType networkNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkType(NetworkType networkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationType(OrganizationType organizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonType(PersonType personType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortRangeType(PortRangeType portRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType1(PortType1 portType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolType(ProtocolType protocolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareType(SoftwareType softwareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyntheticIdType(SyntheticIdType syntheticIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syntheticIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemNameType(SystemNameType systemNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemType(SystemType systemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberType1(TelephoneNumberType1 telephoneNumberType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumberType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType(UrlType urlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsiteType(WebsiteType websiteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(websiteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsiteUrlType(WebsiteUrlType websiteUrlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(websiteUrlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCidrType(String cidrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCidrType_Pattern(cidrType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCidrType_Pattern
	 */
	public static final  PatternMatcher [][] CIDR_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))/([0-9]|[1-2][0-9]|3[0-2])")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cidr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCidrType_Pattern(String cidrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.CIDR_TYPE, cidrType, CIDR_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpeType(String cpeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCpeType_MemberTypes(cpeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Cpe Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpeType_MemberTypes(String cpeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_2Package.Literals.CPE22_TYPE.isInstance(cpeType)) {
				if (__2Validator.validateCpe22Type(cpeType, tempDiagnostics, context)) return true;
			}
			if (_2Package.Literals.CPE23_TYPE.isInstance(cpeType)) {
				if (__2Validator.validateCpe23Type(cpeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_2Package.Literals.CPE22_TYPE.isInstance(cpeType)) {
				if (__2Validator.validateCpe22Type(cpeType, null, context)) return true;
			}
			if (_2Package.Literals.CPE23_TYPE.isInstance(cpeType)) {
				if (__2Validator.validateCpe23Type(cpeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostnameType(String hostnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHostnameType_Pattern(hostnameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHostnameType_Pattern
	 */
	public static final  PatternMatcher [][] HOSTNAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\w\\-]+(\\.[\\w\\-]+){0,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hostname Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostnameType_Pattern(String hostnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.HOSTNAME_TYPE, hostnameType, HOSTNAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpv4Type(String ipv4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpv4Type_Pattern(ipv4Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpv4Type_Pattern
	 */
	public static final  PatternMatcher [][] IPV4_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ipv4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpv4Type_Pattern(String ipv4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.IPV4_TYPE, ipv4Type, IPV4_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpv6Type(String ipv6Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpv6Type_Pattern(ipv6Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpv6Type_Pattern
	 */
	public static final  PatternMatcher [][] IPV6_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ipv6 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpv6Type_Pattern(String ipv6Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.IPV6_TYPE, ipv6Type, IPV6_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatitudeType_Min(latitudeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatitudeType_Max(latitudeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeType_Min
	 */
	public static final double LATITUDE_TYPE__MIN__VALUE = -90.0;

	/**
	 * Validates the Min constraint of '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType_Min(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeType >= LATITUDE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_1Package.Literals.LATITUDE_TYPE, latitudeType, LATITUDE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatitudeType_Max
	 */
	public static final double LATITUDE_TYPE__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeType_Max(double latitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latitudeType <= LATITUDE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(_1Package.Literals.LATITUDE_TYPE, latitudeType, LATITUDE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatitudeTypeObject(Double latitudeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatitudeType_Min(latitudeTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatitudeType_Max(latitudeTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType(String localeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLocaleType_Pattern(localeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLocaleType_Pattern
	 */
	public static final  PatternMatcher [][] LOCALE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Locale Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType_Pattern(String localeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.LOCALE_TYPE, localeType, LOCALE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLongitudeType_Min(longitudeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongitudeType_Max(longitudeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeType_Min
	 */
	public static final double LONGITUDE_TYPE__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType_Min(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeType > LONGITUDE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_1Package.Literals.LONGITUDE_TYPE, longitudeType, LONGITUDE_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLongitudeType_Max
	 */
	public static final double LONGITUDE_TYPE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeType_Max(double longitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = longitudeType <= LONGITUDE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(_1Package.Literals.LONGITUDE_TYPE, longitudeType, LONGITUDE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongitudeTypeObject(Double longitudeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLongitudeType_Min(longitudeTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongitudeType_Max(longitudeTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacAddressType(String macAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMacAddressType_Pattern(macAddressType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMacAddressType_Pattern
	 */
	public static final  PatternMatcher [][] MAC_ADDRESS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mac Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacAddressType_Pattern(String macAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.MAC_ADDRESS_TYPE, macAddressType, MAC_ADDRESS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(BigInteger portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortType_Min(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortType_Max(portType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortType_Min
	 */
	public static final BigInteger PORT_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType_Min(BigInteger portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portType.compareTo(PORT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_1Package.Literals.PORT_TYPE, portType, PORT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortType_Max
	 */
	public static final BigInteger PORT_TYPE__MAX__VALUE = new BigInteger("65535");

	/**
	 * Validates the Max constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType_Max(BigInteger portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portType.compareTo(PORT_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_1Package.Literals.PORT_TYPE, portType, PORT_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiusType(double radiusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRadiusType_Min(radiusType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRadiusType_Min
	 */
	public static final double RADIUS_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Radius Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiusType_Min(double radiusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = radiusType >= RADIUS_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_1Package.Literals.RADIUS_TYPE, radiusType, RADIUS_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiusTypeObject(Double radiusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRadiusType_Min(radiusTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberType(String telephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTelephoneNumberType_Pattern(telephoneNumberType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTelephoneNumberType_Pattern
	 */
	public static final  PatternMatcher [][] TELEPHONE_NUMBER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([2-9][0-8]\\d-[2-9]\\d{2}-[0-9]{4})|(\\+([0-9] ?){6,14}[0-9]))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Telephone Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumberType_Pattern(String telephoneNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_1Package.Literals.TELEPHONE_NUMBER_TYPE, telephoneNumberType, TELEPHONE_NUMBER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_1Validator
