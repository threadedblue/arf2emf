/**
 */
package gov.nist.scap.schema.asset.identification._1.util;

import gov.nist.scap.schema.asset.identification._1.*;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.asset.identification._1._1Package
 * @generated
 */
public class _1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
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
	protected _1Switch<Adapter> modelSwitch =
		new _1Switch<Adapter>() {
			@Override
			public Adapter caseAssetIdentificationType(AssetIdentificationType object) {
				return createAssetIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseAssetsType(AssetsType object) {
				return createAssetsTypeAdapter();
			}
			@Override
			public Adapter caseAssetType(AssetType object) {
				return createAssetTypeAdapter();
			}
			@Override
			public Adapter caseAssetType1(AssetType1 object) {
				return createAssetType1Adapter();
			}
			@Override
			public Adapter caseBirthdateType(BirthdateType object) {
				return createBirthdateTypeAdapter();
			}
			@Override
			public Adapter caseCidrType1(CidrType1 object) {
				return createCidrType1Adapter();
			}
			@Override
			public Adapter caseCircuitNameType(CircuitNameType object) {
				return createCircuitNameTypeAdapter();
			}
			@Override
			public Adapter caseCircuitType(CircuitType object) {
				return createCircuitTypeAdapter();
			}
			@Override
			public Adapter caseComputingDeviceType(ComputingDeviceType object) {
				return createComputingDeviceTypeAdapter();
			}
			@Override
			public Adapter caseConnectionsType(ConnectionsType object) {
				return createConnectionsTypeAdapter();
			}
			@Override
			public Adapter caseCpeType1(CpeType1 object) {
				return createCpeType1Adapter();
			}
			@Override
			public Adapter caseDatabaseType(DatabaseType object) {
				return createDatabaseTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDistinguishedNameType(DistinguishedNameType object) {
				return createDistinguishedNameTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentRootType(DocumentRootType object) {
				return createDocumentRootTypeAdapter();
			}
			@Override
			public Adapter caseEmailAddressType(EmailAddressType object) {
				return createEmailAddressTypeAdapter();
			}
			@Override
			public Adapter caseExtendedInformationType(ExtendedInformationType object) {
				return createExtendedInformationTypeAdapter();
			}
			@Override
			public Adapter caseFqdnType(FqdnType object) {
				return createFqdnTypeAdapter();
			}
			@Override
			public Adapter caseHostnameType1(HostnameType1 object) {
				return createHostnameType1Adapter();
			}
			@Override
			public Adapter caseHostType(HostType object) {
				return createHostTypeAdapter();
			}
			@Override
			public Adapter caseInstallationIdType(InstallationIdType object) {
				return createInstallationIdTypeAdapter();
			}
			@Override
			public Adapter caseInstanceNameType(InstanceNameType object) {
				return createInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseIpAddressType(IpAddressType object) {
				return createIpAddressTypeAdapter();
			}
			@Override
			public Adapter caseIpNetRangeType(IpNetRangeType object) {
				return createIpNetRangeTypeAdapter();
			}
			@Override
			public Adapter caseIpV4Type1(IpV4Type1 object) {
				return createIpV4Type1Adapter();
			}
			@Override
			public Adapter caseIpV6Type1(IpV6Type1 object) {
				return createIpV6Type1Adapter();
			}
			@Override
			public Adapter caseItAssetType(ItAssetType object) {
				return createItAssetTypeAdapter();
			}
			@Override
			public Adapter caseLicenseType(LicenseType object) {
				return createLicenseTypeAdapter();
			}
			@Override
			public Adapter caseLocaleType1(LocaleType1 object) {
				return createLocaleType1Adapter();
			}
			@Override
			public Adapter caseLocationPointType(LocationPointType object) {
				return createLocationPointTypeAdapter();
			}
			@Override
			public Adapter caseLocationRegionType(LocationRegionType object) {
				return createLocationRegionTypeAdapter();
			}
			@Override
			public Adapter caseLocationsType(LocationsType object) {
				return createLocationsTypeAdapter();
			}
			@Override
			public Adapter caseMacAddressType1(MacAddressType1 object) {
				return createMacAddressType1Adapter();
			}
			@Override
			public Adapter caseMotherboardGuidType(MotherboardGuidType object) {
				return createMotherboardGuidTypeAdapter();
			}
			@Override
			public Adapter caseNetworkInterfaceType(NetworkInterfaceType object) {
				return createNetworkInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseNetworkNameType(NetworkNameType object) {
				return createNetworkNameTypeAdapter();
			}
			@Override
			public Adapter caseNetworkType(NetworkType object) {
				return createNetworkTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationType(OrganizationType object) {
				return createOrganizationTypeAdapter();
			}
			@Override
			public Adapter casePersonType(PersonType object) {
				return createPersonTypeAdapter();
			}
			@Override
			public Adapter casePortRangeType(PortRangeType object) {
				return createPortRangeTypeAdapter();
			}
			@Override
			public Adapter casePortType1(PortType1 object) {
				return createPortType1Adapter();
			}
			@Override
			public Adapter caseProtocolType(ProtocolType object) {
				return createProtocolTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseSoftwareType(SoftwareType object) {
				return createSoftwareTypeAdapter();
			}
			@Override
			public Adapter caseSyntheticIdType(SyntheticIdType object) {
				return createSyntheticIdTypeAdapter();
			}
			@Override
			public Adapter caseSystemNameType(SystemNameType object) {
				return createSystemNameTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseTelephoneNumberType1(TelephoneNumberType1 object) {
				return createTelephoneNumberType1Adapter();
			}
			@Override
			public Adapter caseUrlType(UrlType object) {
				return createUrlTypeAdapter();
			}
			@Override
			public Adapter caseVersionType(VersionType object) {
				return createVersionTypeAdapter();
			}
			@Override
			public Adapter caseWebsiteType(WebsiteType object) {
				return createWebsiteTypeAdapter();
			}
			@Override
			public Adapter caseWebsiteUrlType(WebsiteUrlType object) {
				return createWebsiteUrlTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipsContainerType(RelationshipsContainerType object) {
				return createRelationshipsContainerTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.AssetIdentificationType <em>Asset Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetIdentificationType
	 * @generated
	 */
	public Adapter createAssetIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.AssetsType <em>Assets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetsType
	 * @generated
	 */
	public Adapter createAssetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType
	 * @generated
	 */
	public Adapter createAssetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.AssetType1 <em>Asset Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.AssetType1
	 * @generated
	 */
	public Adapter createAssetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.BirthdateType <em>Birthdate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.BirthdateType
	 * @generated
	 */
	public Adapter createBirthdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.CidrType1 <em>Cidr Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.CidrType1
	 * @generated
	 */
	public Adapter createCidrType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.CircuitNameType <em>Circuit Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitNameType
	 * @generated
	 */
	public Adapter createCircuitNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.CircuitType <em>Circuit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.CircuitType
	 * @generated
	 */
	public Adapter createCircuitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType <em>Computing Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ComputingDeviceType
	 * @generated
	 */
	public Adapter createComputingDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ConnectionsType <em>Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ConnectionsType
	 * @generated
	 */
	public Adapter createConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.CpeType1 <em>Cpe Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.CpeType1
	 * @generated
	 */
	public Adapter createCpeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.DatabaseType
	 * @generated
	 */
	public Adapter createDatabaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.DistinguishedNameType <em>Distinguished Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.DistinguishedNameType
	 * @generated
	 */
	public Adapter createDistinguishedNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.DocumentRootType <em>Document Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.DocumentRootType
	 * @generated
	 */
	public Adapter createDocumentRootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.EmailAddressType <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.EmailAddressType
	 * @generated
	 */
	public Adapter createEmailAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ExtendedInformationType <em>Extended Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ExtendedInformationType
	 * @generated
	 */
	public Adapter createExtendedInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.FqdnType <em>Fqdn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.FqdnType
	 * @generated
	 */
	public Adapter createFqdnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.HostnameType1 <em>Hostname Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.HostnameType1
	 * @generated
	 */
	public Adapter createHostnameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.HostType
	 * @generated
	 */
	public Adapter createHostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.InstallationIdType <em>Installation Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.InstallationIdType
	 * @generated
	 */
	public Adapter createInstallationIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.InstanceNameType <em>Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.InstanceNameType
	 * @generated
	 */
	public Adapter createInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType <em>Ip Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.IpAddressType
	 * @generated
	 */
	public Adapter createIpAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType <em>Ip Net Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.IpNetRangeType
	 * @generated
	 */
	public Adapter createIpNetRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.IpV4Type1 <em>Ip V4 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV4Type1
	 * @generated
	 */
	public Adapter createIpV4Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.IpV6Type1 <em>Ip V6 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.IpV6Type1
	 * @generated
	 */
	public Adapter createIpV6Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ItAssetType <em>It Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ItAssetType
	 * @generated
	 */
	public Adapter createItAssetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.LicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.LicenseType
	 * @generated
	 */
	public Adapter createLicenseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.LocaleType1 <em>Locale Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.LocaleType1
	 * @generated
	 */
	public Adapter createLocaleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType <em>Location Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationPointType
	 * @generated
	 */
	public Adapter createLocationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.LocationRegionType <em>Location Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationRegionType
	 * @generated
	 */
	public Adapter createLocationRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.LocationsType <em>Locations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.LocationsType
	 * @generated
	 */
	public Adapter createLocationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.MacAddressType1 <em>Mac Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.MacAddressType1
	 * @generated
	 */
	public Adapter createMacAddressType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.MotherboardGuidType <em>Motherboard Guid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.MotherboardGuidType
	 * @generated
	 */
	public Adapter createMotherboardGuidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType <em>Network Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType
	 * @generated
	 */
	public Adapter createNetworkInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.NetworkNameType <em>Network Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkNameType
	 * @generated
	 */
	public Adapter createNetworkNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.OrganizationType
	 * @generated
	 */
	public Adapter createOrganizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.PersonType
	 * @generated
	 */
	public Adapter createPersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType <em>Port Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.PortRangeType
	 * @generated
	 */
	public Adapter createPortRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.PortType1 <em>Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.PortType1
	 * @generated
	 */
	public Adapter createPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ProtocolType
	 * @generated
	 */
	public Adapter createProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.SoftwareType
	 * @generated
	 */
	public Adapter createSoftwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.SyntheticIdType <em>Synthetic Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.SyntheticIdType
	 * @generated
	 */
	public Adapter createSyntheticIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.SystemNameType <em>System Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemNameType
	 * @generated
	 */
	public Adapter createSystemNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1 <em>Telephone Number Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1
	 * @generated
	 */
	public Adapter createTelephoneNumberType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.UrlType
	 * @generated
	 */
	public Adapter createUrlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.VersionType
	 * @generated
	 */
	public Adapter createVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType <em>Website Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteType
	 * @generated
	 */
	public Adapter createWebsiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType <em>Website Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.identification._1.WebsiteUrlType
	 * @generated
	 */
	public Adapter createWebsiteUrlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType <em>Relationships Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType
	 * @generated
	 */
	public Adapter createRelationshipsContainerTypeAdapter() {
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

} //_1AdapterFactory
