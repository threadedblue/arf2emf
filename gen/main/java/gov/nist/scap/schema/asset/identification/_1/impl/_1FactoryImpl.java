/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.*;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mitre.cpe.naming._2._2Factory;
import org.mitre.cpe.naming._2._2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1FactoryImpl extends EFactoryImpl implements _1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _1Factory init() {
		try {
			_1Factory the_1Factory = (_1Factory)EPackage.Registry.INSTANCE.getEFactory(_1Package.eNS_URI);
			if (the_1Factory != null) {
				return the_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _1Package.ASSET_IDENTIFICATION_TYPE: return createAssetIdentificationType();
			case _1Package.ASSETS_TYPE: return createAssetsType();
			case _1Package.ASSET_TYPE: return createAssetType();
			case _1Package.BIRTHDATE_TYPE: return createBirthdateType();
			case _1Package.CIDR_TYPE1: return createCidrType1();
			case _1Package.CIRCUIT_NAME_TYPE: return createCircuitNameType();
			case _1Package.CIRCUIT_TYPE: return createCircuitType();
			case _1Package.COMPUTING_DEVICE_TYPE: return createComputingDeviceType();
			case _1Package.CONNECTIONS_TYPE: return createConnectionsType();
			case _1Package.CPE_TYPE1: return createCpeType1();
			case _1Package.DATABASE_TYPE: return createDatabaseType();
			case _1Package.DATA_TYPE: return createDataType();
			case _1Package.DISTINGUISHED_NAME_TYPE: return createDistinguishedNameType();
			case _1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _1Package.DOCUMENT_ROOT_TYPE: return createDocumentRootType();
			case _1Package.EMAIL_ADDRESS_TYPE: return createEmailAddressType();
			case _1Package.EXTENDED_INFORMATION_TYPE: return createExtendedInformationType();
			case _1Package.FQDN_TYPE: return createFqdnType();
			case _1Package.HOSTNAME_TYPE1: return createHostnameType1();
			case _1Package.HOST_TYPE: return createHostType();
			case _1Package.INSTALLATION_ID_TYPE: return createInstallationIdType();
			case _1Package.INSTANCE_NAME_TYPE: return createInstanceNameType();
			case _1Package.IP_ADDRESS_TYPE: return createIpAddressType();
			case _1Package.IP_NET_RANGE_TYPE: return createIpNetRangeType();
			case _1Package.IP_V4_TYPE1: return createIpV4Type1();
			case _1Package.IP_V6_TYPE1: return createIpV6Type1();
			case _1Package.LICENSE_TYPE: return createLicenseType();
			case _1Package.LOCALE_TYPE1: return createLocaleType1();
			case _1Package.LOCATION_POINT_TYPE: return createLocationPointType();
			case _1Package.LOCATION_REGION_TYPE: return createLocationRegionType();
			case _1Package.LOCATIONS_TYPE: return createLocationsType();
			case _1Package.MAC_ADDRESS_TYPE1: return createMacAddressType1();
			case _1Package.MOTHERBOARD_GUID_TYPE: return createMotherboardGuidType();
			case _1Package.NETWORK_INTERFACE_TYPE: return createNetworkInterfaceType();
			case _1Package.NETWORK_NAME_TYPE: return createNetworkNameType();
			case _1Package.NETWORK_TYPE: return createNetworkType();
			case _1Package.ORGANIZATION_TYPE: return createOrganizationType();
			case _1Package.PERSON_TYPE: return createPersonType();
			case _1Package.PORT_RANGE_TYPE: return createPortRangeType();
			case _1Package.PORT_TYPE1: return createPortType1();
			case _1Package.PROTOCOL_TYPE: return createProtocolType();
			case _1Package.SERVICE_TYPE: return createServiceType();
			case _1Package.SOFTWARE_TYPE: return createSoftwareType();
			case _1Package.SYNTHETIC_ID_TYPE: return createSyntheticIdType();
			case _1Package.SYSTEM_NAME_TYPE: return createSystemNameType();
			case _1Package.SYSTEM_TYPE: return createSystemType();
			case _1Package.TELEPHONE_NUMBER_TYPE1: return createTelephoneNumberType1();
			case _1Package.URL_TYPE: return createUrlType();
			case _1Package.VERSION_TYPE: return createVersionType();
			case _1Package.WEBSITE_TYPE: return createWebsiteType();
			case _1Package.WEBSITE_URL_TYPE: return createWebsiteUrlType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _1Package.CIDR_TYPE:
				return createCidrTypeFromString(eDataType, initialValue);
			case _1Package.CPE_TYPE:
				return createCpeTypeFromString(eDataType, initialValue);
			case _1Package.HOSTNAME_TYPE:
				return createHostnameTypeFromString(eDataType, initialValue);
			case _1Package.IPV4_TYPE:
				return createIpv4TypeFromString(eDataType, initialValue);
			case _1Package.IPV6_TYPE:
				return createIpv6TypeFromString(eDataType, initialValue);
			case _1Package.LATITUDE_TYPE:
				return createLatitudeTypeFromString(eDataType, initialValue);
			case _1Package.LATITUDE_TYPE_OBJECT:
				return createLatitudeTypeObjectFromString(eDataType, initialValue);
			case _1Package.LOCALE_TYPE:
				return createLocaleTypeFromString(eDataType, initialValue);
			case _1Package.LONGITUDE_TYPE:
				return createLongitudeTypeFromString(eDataType, initialValue);
			case _1Package.LONGITUDE_TYPE_OBJECT:
				return createLongitudeTypeObjectFromString(eDataType, initialValue);
			case _1Package.MAC_ADDRESS_TYPE:
				return createMacAddressTypeFromString(eDataType, initialValue);
			case _1Package.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case _1Package.RADIUS_TYPE:
				return createRadiusTypeFromString(eDataType, initialValue);
			case _1Package.RADIUS_TYPE_OBJECT:
				return createRadiusTypeObjectFromString(eDataType, initialValue);
			case _1Package.TELEPHONE_NUMBER_TYPE:
				return createTelephoneNumberTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _1Package.CIDR_TYPE:
				return convertCidrTypeToString(eDataType, instanceValue);
			case _1Package.CPE_TYPE:
				return convertCpeTypeToString(eDataType, instanceValue);
			case _1Package.HOSTNAME_TYPE:
				return convertHostnameTypeToString(eDataType, instanceValue);
			case _1Package.IPV4_TYPE:
				return convertIpv4TypeToString(eDataType, instanceValue);
			case _1Package.IPV6_TYPE:
				return convertIpv6TypeToString(eDataType, instanceValue);
			case _1Package.LATITUDE_TYPE:
				return convertLatitudeTypeToString(eDataType, instanceValue);
			case _1Package.LATITUDE_TYPE_OBJECT:
				return convertLatitudeTypeObjectToString(eDataType, instanceValue);
			case _1Package.LOCALE_TYPE:
				return convertLocaleTypeToString(eDataType, instanceValue);
			case _1Package.LONGITUDE_TYPE:
				return convertLongitudeTypeToString(eDataType, instanceValue);
			case _1Package.LONGITUDE_TYPE_OBJECT:
				return convertLongitudeTypeObjectToString(eDataType, instanceValue);
			case _1Package.MAC_ADDRESS_TYPE:
				return convertMacAddressTypeToString(eDataType, instanceValue);
			case _1Package.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case _1Package.RADIUS_TYPE:
				return convertRadiusTypeToString(eDataType, instanceValue);
			case _1Package.RADIUS_TYPE_OBJECT:
				return convertRadiusTypeObjectToString(eDataType, instanceValue);
			case _1Package.TELEPHONE_NUMBER_TYPE:
				return convertTelephoneNumberTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetIdentificationType createAssetIdentificationType() {
		AssetIdentificationTypeImpl assetIdentificationType = new AssetIdentificationTypeImpl();
		return assetIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsType createAssetsType() {
		AssetsTypeImpl assetsType = new AssetsTypeImpl();
		return assetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType createAssetType() {
		AssetTypeImpl assetType = new AssetTypeImpl();
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthdateType createBirthdateType() {
		BirthdateTypeImpl birthdateType = new BirthdateTypeImpl();
		return birthdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CidrType1 createCidrType1() {
		CidrType1Impl cidrType1 = new CidrType1Impl();
		return cidrType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitNameType createCircuitNameType() {
		CircuitNameTypeImpl circuitNameType = new CircuitNameTypeImpl();
		return circuitNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitType createCircuitType() {
		CircuitTypeImpl circuitType = new CircuitTypeImpl();
		return circuitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingDeviceType createComputingDeviceType() {
		ComputingDeviceTypeImpl computingDeviceType = new ComputingDeviceTypeImpl();
		return computingDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionsType createConnectionsType() {
		ConnectionsTypeImpl connectionsType = new ConnectionsTypeImpl();
		return connectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpeType1 createCpeType1() {
		CpeType1Impl cpeType1 = new CpeType1Impl();
		return cpeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseType() {
		DatabaseTypeImpl databaseType = new DatabaseTypeImpl();
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinguishedNameType createDistinguishedNameType() {
		DistinguishedNameTypeImpl distinguishedNameType = new DistinguishedNameTypeImpl();
		return distinguishedNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootType createDocumentRootType() {
		DocumentRootTypeImpl documentRootType = new DocumentRootTypeImpl();
		return documentRootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddressType createEmailAddressType() {
		EmailAddressTypeImpl emailAddressType = new EmailAddressTypeImpl();
		return emailAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedInformationType createExtendedInformationType() {
		ExtendedInformationTypeImpl extendedInformationType = new ExtendedInformationTypeImpl();
		return extendedInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FqdnType createFqdnType() {
		FqdnTypeImpl fqdnType = new FqdnTypeImpl();
		return fqdnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostnameType1 createHostnameType1() {
		HostnameType1Impl hostnameType1 = new HostnameType1Impl();
		return hostnameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType createHostType() {
		HostTypeImpl hostType = new HostTypeImpl();
		return hostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstallationIdType createInstallationIdType() {
		InstallationIdTypeImpl installationIdType = new InstallationIdTypeImpl();
		return installationIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceNameType createInstanceNameType() {
		InstanceNameTypeImpl instanceNameType = new InstanceNameTypeImpl();
		return instanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType createIpAddressType() {
		IpAddressTypeImpl ipAddressType = new IpAddressTypeImpl();
		return ipAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpNetRangeType createIpNetRangeType() {
		IpNetRangeTypeImpl ipNetRangeType = new IpNetRangeTypeImpl();
		return ipNetRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpV4Type1 createIpV4Type1() {
		IpV4Type1Impl ipV4Type1 = new IpV4Type1Impl();
		return ipV4Type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpV6Type1 createIpV6Type1() {
		IpV6Type1Impl ipV6Type1 = new IpV6Type1Impl();
		return ipV6Type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseType createLicenseType() {
		LicenseTypeImpl licenseType = new LicenseTypeImpl();
		return licenseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleType1 createLocaleType1() {
		LocaleType1Impl localeType1 = new LocaleType1Impl();
		return localeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPointType createLocationPointType() {
		LocationPointTypeImpl locationPointType = new LocationPointTypeImpl();
		return locationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRegionType createLocationRegionType() {
		LocationRegionTypeImpl locationRegionType = new LocationRegionTypeImpl();
		return locationRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType createLocationsType() {
		LocationsTypeImpl locationsType = new LocationsTypeImpl();
		return locationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacAddressType1 createMacAddressType1() {
		MacAddressType1Impl macAddressType1 = new MacAddressType1Impl();
		return macAddressType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotherboardGuidType createMotherboardGuidType() {
		MotherboardGuidTypeImpl motherboardGuidType = new MotherboardGuidTypeImpl();
		return motherboardGuidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterfaceType createNetworkInterfaceType() {
		NetworkInterfaceTypeImpl networkInterfaceType = new NetworkInterfaceTypeImpl();
		return networkInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNameType createNetworkNameType() {
		NetworkNameTypeImpl networkNameType = new NetworkNameTypeImpl();
		return networkNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkType() {
		NetworkTypeImpl networkType = new NetworkTypeImpl();
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationType() {
		OrganizationTypeImpl organizationType = new OrganizationTypeImpl();
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRangeType createPortRangeType() {
		PortRangeTypeImpl portRangeType = new PortRangeTypeImpl();
		return portRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType1 createPortType1() {
		PortType1Impl portType1 = new PortType1Impl();
		return portType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType createProtocolType() {
		ProtocolTypeImpl protocolType = new ProtocolTypeImpl();
		return protocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareType createSoftwareType() {
		SoftwareTypeImpl softwareType = new SoftwareTypeImpl();
		return softwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntheticIdType createSyntheticIdType() {
		SyntheticIdTypeImpl syntheticIdType = new SyntheticIdTypeImpl();
		return syntheticIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemNameType createSystemNameType() {
		SystemNameTypeImpl systemNameType = new SystemNameTypeImpl();
		return systemNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType1 createTelephoneNumberType1() {
		TelephoneNumberType1Impl telephoneNumberType1 = new TelephoneNumberType1Impl();
		return telephoneNumberType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlType createUrlType() {
		UrlTypeImpl urlType = new UrlTypeImpl();
		return urlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionType() {
		VersionTypeImpl versionType = new VersionTypeImpl();
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteType createWebsiteType() {
		WebsiteTypeImpl websiteType = new WebsiteTypeImpl();
		return websiteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteUrlType createWebsiteUrlType() {
		WebsiteUrlTypeImpl websiteUrlType = new WebsiteUrlTypeImpl();
		return websiteUrlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCidrTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCidrTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCpeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)_2Factory.eINSTANCE.createFromString(_2Package.Literals.CPE22_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)_2Factory.eINSTANCE.createFromString(_2Package.Literals.CPE23_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCpeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2Package.Literals.CPE22_TYPE.isInstance(instanceValue)) {
			try {
				String value = _2Factory.eINSTANCE.convertToString(_2Package.Literals.CPE22_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2Package.Literals.CPE23_TYPE.isInstance(instanceValue)) {
			try {
				String value = _2Factory.eINSTANCE.convertToString(_2Package.Literals.CPE23_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHostnameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostnameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpv4TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpv4TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpv6TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpv6TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatitudeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLatitudeTypeFromString(_1Package.Literals.LATITUDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLatitudeTypeToString(_1Package.Literals.LATITUDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocaleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLongitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLongitudeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLongitudeTypeFromString(_1Package.Literals.LONGITUDE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLongitudeTypeToString(_1Package.Literals.LONGITUDE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMacAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPortTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createRadiusTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadiusTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createRadiusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRadiusTypeFromString(_1Package.Literals.RADIUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadiusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRadiusTypeToString(_1Package.Literals.RADIUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTelephoneNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelephoneNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Package get_1Package() {
		return (_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _1Package getPackage() {
		return _1Package.eINSTANCE;
	}

} //_1FactoryImpl
