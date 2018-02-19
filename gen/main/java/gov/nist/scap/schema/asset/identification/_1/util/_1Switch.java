/**
 */
package gov.nist.scap.schema.asset.identification._1.util;

import gov.nist.scap.schema.asset.identification._1.*;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

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
 * @see gov.nist.scap.schema.asset.identification._1._1Package
 * @generated
 */
public class _1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Switch() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
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
			case _1Package.ASSET_IDENTIFICATION_TYPE: {
				AssetIdentificationType assetIdentificationType = (AssetIdentificationType)theEObject;
				T result = caseAssetIdentificationType(assetIdentificationType);
				if (result == null) result = caseAssetsType(assetIdentificationType);
				if (result == null) result = caseRelationshipsContainerType(assetIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ASSETS_TYPE: {
				AssetsType assetsType = (AssetsType)theEObject;
				T result = caseAssetsType(assetsType);
				if (result == null) result = caseRelationshipsContainerType(assetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ASSET_TYPE: {
				AssetType assetType = (AssetType)theEObject;
				T result = caseAssetType(assetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ASSET_TYPE1: {
				AssetType1 assetType1 = (AssetType1)theEObject;
				T result = caseAssetType1(assetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BIRTHDATE_TYPE: {
				BirthdateType birthdateType = (BirthdateType)theEObject;
				T result = caseBirthdateType(birthdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CIDR_TYPE1: {
				CidrType1 cidrType1 = (CidrType1)theEObject;
				T result = caseCidrType1(cidrType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CIRCUIT_NAME_TYPE: {
				CircuitNameType circuitNameType = (CircuitNameType)theEObject;
				T result = caseCircuitNameType(circuitNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CIRCUIT_TYPE: {
				CircuitType circuitType = (CircuitType)theEObject;
				T result = caseCircuitType(circuitType);
				if (result == null) result = caseItAssetType(circuitType);
				if (result == null) result = caseAssetType1(circuitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPUTING_DEVICE_TYPE: {
				ComputingDeviceType computingDeviceType = (ComputingDeviceType)theEObject;
				T result = caseComputingDeviceType(computingDeviceType);
				if (result == null) result = caseItAssetType(computingDeviceType);
				if (result == null) result = caseAssetType1(computingDeviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONNECTIONS_TYPE: {
				ConnectionsType connectionsType = (ConnectionsType)theEObject;
				T result = caseConnectionsType(connectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CPE_TYPE1: {
				CpeType1 cpeType1 = (CpeType1)theEObject;
				T result = caseCpeType1(cpeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DATABASE_TYPE: {
				DatabaseType databaseType = (DatabaseType)theEObject;
				T result = caseDatabaseType(databaseType);
				if (result == null) result = caseItAssetType(databaseType);
				if (result == null) result = caseAssetType1(databaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseAssetType1(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DISTINGUISHED_NAME_TYPE: {
				DistinguishedNameType distinguishedNameType = (DistinguishedNameType)theEObject;
				T result = caseDistinguishedNameType(distinguishedNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT_TYPE: {
				DocumentRootType documentRootType = (DocumentRootType)theEObject;
				T result = caseDocumentRootType(documentRootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EMAIL_ADDRESS_TYPE: {
				EmailAddressType emailAddressType = (EmailAddressType)theEObject;
				T result = caseEmailAddressType(emailAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EXTENDED_INFORMATION_TYPE: {
				ExtendedInformationType extendedInformationType = (ExtendedInformationType)theEObject;
				T result = caseExtendedInformationType(extendedInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FQDN_TYPE: {
				FqdnType fqdnType = (FqdnType)theEObject;
				T result = caseFqdnType(fqdnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.HOSTNAME_TYPE1: {
				HostnameType1 hostnameType1 = (HostnameType1)theEObject;
				T result = caseHostnameType1(hostnameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.HOST_TYPE: {
				HostType hostType = (HostType)theEObject;
				T result = caseHostType(hostType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INSTALLATION_ID_TYPE: {
				InstallationIdType installationIdType = (InstallationIdType)theEObject;
				T result = caseInstallationIdType(installationIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INSTANCE_NAME_TYPE: {
				InstanceNameType instanceNameType = (InstanceNameType)theEObject;
				T result = caseInstanceNameType(instanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IP_ADDRESS_TYPE: {
				IpAddressType ipAddressType = (IpAddressType)theEObject;
				T result = caseIpAddressType(ipAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IP_NET_RANGE_TYPE: {
				IpNetRangeType ipNetRangeType = (IpNetRangeType)theEObject;
				T result = caseIpNetRangeType(ipNetRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IP_V4_TYPE1: {
				IpV4Type1 ipV4Type1 = (IpV4Type1)theEObject;
				T result = caseIpV4Type1(ipV4Type1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IP_V6_TYPE1: {
				IpV6Type1 ipV6Type1 = (IpV6Type1)theEObject;
				T result = caseIpV6Type1(ipV6Type1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IT_ASSET_TYPE: {
				ItAssetType itAssetType = (ItAssetType)theEObject;
				T result = caseItAssetType(itAssetType);
				if (result == null) result = caseAssetType1(itAssetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LICENSE_TYPE: {
				LicenseType licenseType = (LicenseType)theEObject;
				T result = caseLicenseType(licenseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOCALE_TYPE1: {
				LocaleType1 localeType1 = (LocaleType1)theEObject;
				T result = caseLocaleType1(localeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOCATION_POINT_TYPE: {
				LocationPointType locationPointType = (LocationPointType)theEObject;
				T result = caseLocationPointType(locationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOCATION_REGION_TYPE: {
				LocationRegionType locationRegionType = (LocationRegionType)theEObject;
				T result = caseLocationRegionType(locationRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOCATIONS_TYPE: {
				LocationsType locationsType = (LocationsType)theEObject;
				T result = caseLocationsType(locationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MAC_ADDRESS_TYPE1: {
				MacAddressType1 macAddressType1 = (MacAddressType1)theEObject;
				T result = caseMacAddressType1(macAddressType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MOTHERBOARD_GUID_TYPE: {
				MotherboardGuidType motherboardGuidType = (MotherboardGuidType)theEObject;
				T result = caseMotherboardGuidType(motherboardGuidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NETWORK_INTERFACE_TYPE: {
				NetworkInterfaceType networkInterfaceType = (NetworkInterfaceType)theEObject;
				T result = caseNetworkInterfaceType(networkInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NETWORK_NAME_TYPE: {
				NetworkNameType networkNameType = (NetworkNameType)theEObject;
				T result = caseNetworkNameType(networkNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NETWORK_TYPE: {
				NetworkType networkType = (NetworkType)theEObject;
				T result = caseNetworkType(networkType);
				if (result == null) result = caseItAssetType(networkType);
				if (result == null) result = caseAssetType1(networkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ORGANIZATION_TYPE: {
				OrganizationType organizationType = (OrganizationType)theEObject;
				T result = caseOrganizationType(organizationType);
				if (result == null) result = caseAssetType1(organizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				T result = casePersonType(personType);
				if (result == null) result = caseAssetType1(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_RANGE_TYPE: {
				PortRangeType portRangeType = (PortRangeType)theEObject;
				T result = casePortRangeType(portRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_TYPE1: {
				PortType1 portType1 = (PortType1)theEObject;
				T result = casePortType1(portType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PROTOCOL_TYPE: {
				ProtocolType protocolType = (ProtocolType)theEObject;
				T result = caseProtocolType(protocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = caseItAssetType(serviceType);
				if (result == null) result = caseAssetType1(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SOFTWARE_TYPE: {
				SoftwareType softwareType = (SoftwareType)theEObject;
				T result = caseSoftwareType(softwareType);
				if (result == null) result = caseItAssetType(softwareType);
				if (result == null) result = caseAssetType1(softwareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SYNTHETIC_ID_TYPE: {
				SyntheticIdType syntheticIdType = (SyntheticIdType)theEObject;
				T result = caseSyntheticIdType(syntheticIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SYSTEM_NAME_TYPE: {
				SystemNameType systemNameType = (SystemNameType)theEObject;
				T result = caseSystemNameType(systemNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = caseItAssetType(systemType);
				if (result == null) result = caseAssetType1(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TELEPHONE_NUMBER_TYPE1: {
				TelephoneNumberType1 telephoneNumberType1 = (TelephoneNumberType1)theEObject;
				T result = caseTelephoneNumberType1(telephoneNumberType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.URL_TYPE: {
				UrlType urlType = (UrlType)theEObject;
				T result = caseUrlType(urlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VERSION_TYPE: {
				VersionType versionType = (VersionType)theEObject;
				T result = caseVersionType(versionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WEBSITE_TYPE: {
				WebsiteType websiteType = (WebsiteType)theEObject;
				T result = caseWebsiteType(websiteType);
				if (result == null) result = caseItAssetType(websiteType);
				if (result == null) result = caseAssetType1(websiteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WEBSITE_URL_TYPE: {
				WebsiteUrlType websiteUrlType = (WebsiteUrlType)theEObject;
				T result = caseWebsiteUrlType(websiteUrlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetIdentificationType(AssetIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetsType(AssetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetType(AssetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetType1(AssetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthdate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthdate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthdateType(BirthdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cidr Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cidr Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCidrType1(CidrType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitNameType(CircuitNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitType(CircuitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingDeviceType(ComputingDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionsType(ConnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpe Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpe Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpeType1(CpeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseType(DatabaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distinguished Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distinguished Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistinguishedNameType(DistinguishedNameType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRootType(DocumentRootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailAddressType(EmailAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedInformationType(ExtendedInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fqdn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fqdn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFqdnType(FqdnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostname Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostname Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostnameType1(HostnameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostType(HostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallationIdType(InstallationIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceNameType(InstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpAddressType(IpAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip Net Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip Net Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpNetRangeType(IpNetRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip V4 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip V4 Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpV4Type1(IpV4Type1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip V6 Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip V6 Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpV6Type1(IpV6Type1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>It Asset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>It Asset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItAssetType(ItAssetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseType(LicenseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locale Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locale Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocaleType1(LocaleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPointType(LocationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationRegionType(LocationRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationsType(LocationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mac Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mac Address Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacAddressType1(MacAddressType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motherboard Guid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motherboard Guid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotherboardGuidType(MotherboardGuidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterfaceType(NetworkInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkNameType(NetworkNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkType(NetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationType(OrganizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRangeType(PortRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType1(PortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolType(ProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareType(SoftwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthetic Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthetic Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntheticIdType(SyntheticIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemNameType(SystemNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Number Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Number Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneNumberType1(TelephoneNumberType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlType(UrlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionType(VersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Website Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Website Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebsiteType(WebsiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Website Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Website Url Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebsiteUrlType(WebsiteUrlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationships Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationships Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipsContainerType(RelationshipsContainerType object) {
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

} //_1Switch
