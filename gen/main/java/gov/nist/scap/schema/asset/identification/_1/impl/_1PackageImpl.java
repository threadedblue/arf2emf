/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.AssetIdentificationType;
import gov.nist.scap.schema.asset.identification._1.AssetType;
import gov.nist.scap.schema.asset.identification._1.AssetType1;
import gov.nist.scap.schema.asset.identification._1.AssetsType;
import gov.nist.scap.schema.asset.identification._1.BirthdateType;
import gov.nist.scap.schema.asset.identification._1.CidrType1;
import gov.nist.scap.schema.asset.identification._1.CircuitNameType;
import gov.nist.scap.schema.asset.identification._1.CircuitType;
import gov.nist.scap.schema.asset.identification._1.ComputingDeviceType;
import gov.nist.scap.schema.asset.identification._1.ConnectionsType;
import gov.nist.scap.schema.asset.identification._1.CpeType1;
import gov.nist.scap.schema.asset.identification._1.DataType;
import gov.nist.scap.schema.asset.identification._1.DatabaseType;
import gov.nist.scap.schema.asset.identification._1.DistinguishedNameType;
import gov.nist.scap.schema.asset.identification._1.DocumentRoot;
import gov.nist.scap.schema.asset.identification._1.DocumentRootType;
import gov.nist.scap.schema.asset.identification._1.EmailAddressType;
import gov.nist.scap.schema.asset.identification._1.ExtendedInformationType;
import gov.nist.scap.schema.asset.identification._1.FqdnType;
import gov.nist.scap.schema.asset.identification._1.HostType;
import gov.nist.scap.schema.asset.identification._1.HostnameType1;
import gov.nist.scap.schema.asset.identification._1.InstallationIdType;
import gov.nist.scap.schema.asset.identification._1.InstanceNameType;
import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1.IpNetRangeType;
import gov.nist.scap.schema.asset.identification._1.IpV4Type1;
import gov.nist.scap.schema.asset.identification._1.IpV6Type1;
import gov.nist.scap.schema.asset.identification._1.ItAssetType;
import gov.nist.scap.schema.asset.identification._1.LicenseType;
import gov.nist.scap.schema.asset.identification._1.LocaleType1;
import gov.nist.scap.schema.asset.identification._1.LocationPointType;
import gov.nist.scap.schema.asset.identification._1.LocationRegionType;
import gov.nist.scap.schema.asset.identification._1.LocationsType;
import gov.nist.scap.schema.asset.identification._1.MacAddressType1;
import gov.nist.scap.schema.asset.identification._1.MotherboardGuidType;
import gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType;
import gov.nist.scap.schema.asset.identification._1.NetworkNameType;
import gov.nist.scap.schema.asset.identification._1.NetworkType;
import gov.nist.scap.schema.asset.identification._1.OrganizationType;
import gov.nist.scap.schema.asset.identification._1.PersonType;
import gov.nist.scap.schema.asset.identification._1.PortRangeType;
import gov.nist.scap.schema.asset.identification._1.PortType1;
import gov.nist.scap.schema.asset.identification._1.ProtocolType;
import gov.nist.scap.schema.asset.identification._1.ServiceType;
import gov.nist.scap.schema.asset.identification._1.SoftwareType;
import gov.nist.scap.schema.asset.identification._1.SyntheticIdType;
import gov.nist.scap.schema.asset.identification._1.SystemNameType;
import gov.nist.scap.schema.asset.identification._1.SystemType;
import gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1;
import gov.nist.scap.schema.asset.identification._1.UrlType;
import gov.nist.scap.schema.asset.identification._1.VersionType;
import gov.nist.scap.schema.asset.identification._1.WebsiteType;
import gov.nist.scap.schema.asset.identification._1.WebsiteUrlType;
import gov.nist.scap.schema.asset.identification._1._1Factory;
import gov.nist.scap.schema.asset.identification._1._1Package;

import gov.nist.scap.schema.asset.identification._1.util._1Validator;

import java.math.BigInteger;

import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mitre.cpe.naming._2._2Package;

import org.mitre.cpe.naming._2.impl._2PackageImpl;

import org.w3._1999.xlink.XlinkPackage;

import org.w3._1999.xlink.impl.XlinkPackageImpl;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1PackageImpl extends EPackageImpl implements _1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass birthdateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cidrType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingDeviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distinguishedNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fqdnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostnameType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installationIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipNetRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipV4Type1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipV6Type1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itAssetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macAddressType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motherboardGuidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntheticIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websiteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websiteUrlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cidrTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cpeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hostnameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipv4TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipv6TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType macAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType radiusTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType radiusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telephoneNumberTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl the_1Package_1 = (gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) : gov.nist.scap.schema.reporting.core._1._1Package.eINSTANCE);
		gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl the_1Package_2 = (gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.reporting.format._1._1Package.eINSTANCE);
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);
		oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) instanceof oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) : oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eINSTANCE);

		// Load packages
		the_0Package.loadPackage();

		// Create package meta-data objects
		the_1Package.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_1Package_1.createPackageContents();
		the_1Package_2.createPackageContents();
		the_2Package.createPackageContents();
		the_0Package_1.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_1Package_2.initializePackageContents();
		the_2Package.initializePackageContents();
		the_0Package_1.initializePackageContents();

		// Fix loaded packages
		the_0Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_1Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _1Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetIdentificationType() {
		return assetIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetIdentificationType_AssetRef() {
		return (EAttribute)assetIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetsType() {
		return assetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetsType_Asset() {
		return (EReference)assetsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetType() {
		return assetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_AssetGroup() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType_Asset() {
		return (EReference)assetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Id() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_AnyAttribute() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetType1() {
		return assetType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType1_SyntheticId() {
		return (EReference)assetType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType1_Locations() {
		return (EReference)assetType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType1_ExtendedInformation() {
		return (EReference)assetType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType1_Timestamp() {
		return (EAttribute)assetType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBirthdateType() {
		return birthdateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBirthdateType_Value() {
		return (EAttribute)birthdateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBirthdateType_Source() {
		return (EAttribute)birthdateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBirthdateType_Timestamp() {
		return (EAttribute)birthdateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBirthdateType_AnyAttribute() {
		return (EAttribute)birthdateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCidrType1() {
		return cidrType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCidrType1_Value() {
		return (EAttribute)cidrType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCidrType1_Source() {
		return (EAttribute)cidrType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCidrType1_Timestamp() {
		return (EAttribute)cidrType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCidrType1_AnyAttribute() {
		return (EAttribute)cidrType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitNameType() {
		return circuitNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitNameType_Value() {
		return (EAttribute)circuitNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitNameType_Source() {
		return (EAttribute)circuitNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitNameType_Timestamp() {
		return (EAttribute)circuitNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitNameType_AnyAttribute() {
		return (EAttribute)circuitNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitType() {
		return circuitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitType_CircuitName() {
		return (EReference)circuitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingDeviceType() {
		return computingDeviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_DistinguishedName() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_Cpe() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_Connections() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_Fqdn() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_Hostname() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingDeviceType_MotherboardGuid() {
		return (EReference)computingDeviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionsType() {
		return connectionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionsType_Connection() {
		return (EReference)connectionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpeType1() {
		return cpeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpeType1_Value() {
		return (EAttribute)cpeType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpeType1_Source() {
		return (EAttribute)cpeType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpeType1_Timestamp() {
		return (EAttribute)cpeType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpeType1_AnyAttribute() {
		return (EAttribute)cpeType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseType() {
		return databaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseType_InstanceName() {
		return (EReference)databaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistinguishedNameType() {
		return distinguishedNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinguishedNameType_Value() {
		return (EAttribute)distinguishedNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinguishedNameType_Source() {
		return (EAttribute)distinguishedNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinguishedNameType_Timestamp() {
		return (EAttribute)distinguishedNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistinguishedNameType_AnyAttribute() {
		return (EAttribute)distinguishedNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Asset() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssetRelated() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Assets() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Circuit() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ItAsset() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComputingDevice() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cpe() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Data() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Database() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmailAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fqdn() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IpAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationPoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationRegion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Locations() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Network() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Software() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SyntheticId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_System() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TelephoneNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Website() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WebsiteUrl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Source() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Timestamp() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRootType() {
		return documentRootTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRootType_Value() {
		return (EAttribute)documentRootTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRootType_Source() {
		return (EAttribute)documentRootTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRootType_Timestamp() {
		return (EAttribute)documentRootTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRootType_AnyAttribute() {
		return (EAttribute)documentRootTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailAddressType() {
		return emailAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Value() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Source() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_Timestamp() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddressType_AnyAttribute() {
		return (EAttribute)emailAddressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedInformationType() {
		return extendedInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedInformationType_Any() {
		return (EAttribute)extendedInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFqdnType() {
		return fqdnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFqdnType_Value() {
		return (EAttribute)fqdnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFqdnType_Source() {
		return (EAttribute)fqdnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFqdnType_Timestamp() {
		return (EAttribute)fqdnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFqdnType_AnyAttribute() {
		return (EAttribute)fqdnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostnameType1() {
		return hostnameType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnameType1_Value() {
		return (EAttribute)hostnameType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnameType1_Source() {
		return (EAttribute)hostnameType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnameType1_Timestamp() {
		return (EAttribute)hostnameType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnameType1_AnyAttribute() {
		return (EAttribute)hostnameType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostType() {
		return hostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostType_Fqdn() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostType_IpAddress() {
		return (EReference)hostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstallationIdType() {
		return installationIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstallationIdType_Value() {
		return (EAttribute)installationIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstallationIdType_Source() {
		return (EAttribute)installationIdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstallationIdType_Timestamp() {
		return (EAttribute)installationIdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstallationIdType_AnyAttribute() {
		return (EAttribute)installationIdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceNameType() {
		return instanceNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceNameType_Value() {
		return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceNameType_Source() {
		return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceNameType_Timestamp() {
		return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceNameType_AnyAttribute() {
		return (EAttribute)instanceNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpAddressType() {
		return ipAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIpAddressType_IpV4() {
		return (EReference)ipAddressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIpAddressType_IpV6() {
		return (EReference)ipAddressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpNetRangeType() {
		return ipNetRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIpNetRangeType_IpNetRangeStart() {
		return (EReference)ipNetRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIpNetRangeType_IpNetRangeEnd() {
		return (EReference)ipNetRangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpV4Type1() {
		return ipV4Type1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV4Type1_Value() {
		return (EAttribute)ipV4Type1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV4Type1_Source() {
		return (EAttribute)ipV4Type1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV4Type1_Timestamp() {
		return (EAttribute)ipV4Type1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV4Type1_AnyAttribute() {
		return (EAttribute)ipV4Type1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpV6Type1() {
		return ipV6Type1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV6Type1_Value() {
		return (EAttribute)ipV6Type1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV6Type1_Source() {
		return (EAttribute)ipV6Type1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV6Type1_Timestamp() {
		return (EAttribute)ipV6Type1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpV6Type1_AnyAttribute() {
		return (EAttribute)ipV6Type1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItAssetType() {
		return itAssetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicenseType() {
		return licenseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseType_Value() {
		return (EAttribute)licenseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseType_Source() {
		return (EAttribute)licenseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseType_Timestamp() {
		return (EAttribute)licenseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseType_AnyAttribute() {
		return (EAttribute)licenseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocaleType1() {
		return localeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType1_Value() {
		return (EAttribute)localeType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType1_Source() {
		return (EAttribute)localeType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType1_Timestamp() {
		return (EAttribute)localeType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocaleType1_AnyAttribute() {
		return (EAttribute)localeType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPointType() {
		return locationPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Elevation() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Latitude() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Longitude() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Radius() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Source() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_Timestamp() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPointType_AnyAttribute() {
		return (EAttribute)locationPointTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationRegionType() {
		return locationRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRegionType_Value() {
		return (EAttribute)locationRegionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRegionType_Source() {
		return (EAttribute)locationRegionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRegionType_Timestamp() {
		return (EAttribute)locationRegionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationRegionType_AnyAttribute() {
		return (EAttribute)locationRegionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationsType() {
		return locationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationsType_LocationGroup() {
		return (EAttribute)locationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationsType_Location() {
		return (EReference)locationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacAddressType1() {
		return macAddressType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacAddressType1_Value() {
		return (EAttribute)macAddressType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacAddressType1_Source() {
		return (EAttribute)macAddressType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacAddressType1_Timestamp() {
		return (EAttribute)macAddressType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacAddressType1_AnyAttribute() {
		return (EAttribute)macAddressType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotherboardGuidType() {
		return motherboardGuidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboardGuidType_Value() {
		return (EAttribute)motherboardGuidTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboardGuidType_Source() {
		return (EAttribute)motherboardGuidTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboardGuidType_Timestamp() {
		return (EAttribute)motherboardGuidTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboardGuidType_AnyAttribute() {
		return (EAttribute)motherboardGuidTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkInterfaceType() {
		return networkInterfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterfaceType_IpAddress() {
		return (EReference)networkInterfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterfaceType_MacAddress() {
		return (EReference)networkInterfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterfaceType_Url() {
		return (EReference)networkInterfaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterfaceType_SubnetMask() {
		return (EReference)networkInterfaceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInterfaceType_DefaultRoute() {
		return (EReference)networkInterfaceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkNameType() {
		return networkNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNameType_Value() {
		return (EAttribute)networkNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNameType_Source() {
		return (EAttribute)networkNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNameType_Timestamp() {
		return (EAttribute)networkNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNameType_AnyAttribute() {
		return (EAttribute)networkNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkType() {
		return networkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_NetworkName() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_IpNetRange() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Cidr() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationType() {
		return organizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_OrganisationNameDetails() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_EmailAddress() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_TelephoneNumber() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationType_WebsiteUrl() {
		return (EReference)organizationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonType() {
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_PersonName() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_EmailAddress() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_TelephoneNumber() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_Birthdate() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRangeType() {
		return portRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRangeType_LowerBound() {
		return (EAttribute)portRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRangeType_Source() {
		return (EAttribute)portRangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRangeType_Timestamp() {
		return (EAttribute)portRangeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRangeType_UpperBound() {
		return (EAttribute)portRangeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRangeType_AnyAttribute() {
		return (EAttribute)portRangeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType1() {
		return portType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType1_Value() {
		return (EAttribute)portType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType1_Source() {
		return (EAttribute)portType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType1_Timestamp() {
		return (EAttribute)portType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType1_AnyAttribute() {
		return (EAttribute)portType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolType() {
		return protocolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_Value() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_Source() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_Timestamp() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_AnyAttribute() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Host() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Port() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_PortRange() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Protocol() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareType() {
		return softwareTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareType_InstallationId() {
		return (EReference)softwareTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareType_Cpe() {
		return (EReference)softwareTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareType_License() {
		return (EReference)softwareTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntheticIdType() {
		return syntheticIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntheticIdType_Id() {
		return (EAttribute)syntheticIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntheticIdType_Resource() {
		return (EAttribute)syntheticIdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemNameType() {
		return systemNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemNameType_Value() {
		return (EAttribute)systemNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemNameType_Source() {
		return (EAttribute)systemNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemNameType_Timestamp() {
		return (EAttribute)systemNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemNameType_AnyAttribute() {
		return (EAttribute)systemNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemType_SystemName() {
		return (EReference)systemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemType_Version() {
		return (EReference)systemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelephoneNumberType1() {
		return telephoneNumberType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType1_Value() {
		return (EAttribute)telephoneNumberType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType1_Source() {
		return (EAttribute)telephoneNumberType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType1_Timestamp() {
		return (EAttribute)telephoneNumberType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumberType1_AnyAttribute() {
		return (EAttribute)telephoneNumberType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlType() {
		return urlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Value() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Source() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Timestamp() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_AnyAttribute() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionType() {
		return versionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionType_Value() {
		return (EAttribute)versionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionType_Source() {
		return (EAttribute)versionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionType_Timestamp() {
		return (EAttribute)versionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionType_AnyAttribute() {
		return (EAttribute)versionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsiteType() {
		return websiteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteType_DocumentRoot() {
		return (EReference)websiteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteType_Locale() {
		return (EReference)websiteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsiteUrlType() {
		return websiteUrlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteUrlType_Value() {
		return (EAttribute)websiteUrlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteUrlType_Source() {
		return (EAttribute)websiteUrlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteUrlType_Timestamp() {
		return (EAttribute)websiteUrlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteUrlType_AnyAttribute() {
		return (EAttribute)websiteUrlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCidrType() {
		return cidrTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCpeType() {
		return cpeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHostnameType() {
		return hostnameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpv4Type() {
		return ipv4TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpv6Type() {
		return ipv6TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatitudeType() {
		return latitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatitudeTypeObject() {
		return latitudeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocaleType() {
		return localeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongitudeType() {
		return longitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongitudeTypeObject() {
		return longitudeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMacAddressType() {
		return macAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortType() {
		return portTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRadiusType() {
		return radiusTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRadiusTypeObject() {
		return radiusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTelephoneNumberType() {
		return telephoneNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assetIdentificationTypeEClass = createEClass(ASSET_IDENTIFICATION_TYPE);
		createEAttribute(assetIdentificationTypeEClass, ASSET_IDENTIFICATION_TYPE__ASSET_REF);

		assetsTypeEClass = createEClass(ASSETS_TYPE);
		createEReference(assetsTypeEClass, ASSETS_TYPE__ASSET);

		assetTypeEClass = createEClass(ASSET_TYPE);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ASSET_GROUP);
		createEReference(assetTypeEClass, ASSET_TYPE__ASSET);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ID);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ANY_ATTRIBUTE);

		assetType1EClass = createEClass(ASSET_TYPE1);
		createEReference(assetType1EClass, ASSET_TYPE1__SYNTHETIC_ID);
		createEReference(assetType1EClass, ASSET_TYPE1__LOCATIONS);
		createEReference(assetType1EClass, ASSET_TYPE1__EXTENDED_INFORMATION);
		createEAttribute(assetType1EClass, ASSET_TYPE1__TIMESTAMP);

		birthdateTypeEClass = createEClass(BIRTHDATE_TYPE);
		createEAttribute(birthdateTypeEClass, BIRTHDATE_TYPE__VALUE);
		createEAttribute(birthdateTypeEClass, BIRTHDATE_TYPE__SOURCE);
		createEAttribute(birthdateTypeEClass, BIRTHDATE_TYPE__TIMESTAMP);
		createEAttribute(birthdateTypeEClass, BIRTHDATE_TYPE__ANY_ATTRIBUTE);

		cidrType1EClass = createEClass(CIDR_TYPE1);
		createEAttribute(cidrType1EClass, CIDR_TYPE1__VALUE);
		createEAttribute(cidrType1EClass, CIDR_TYPE1__SOURCE);
		createEAttribute(cidrType1EClass, CIDR_TYPE1__TIMESTAMP);
		createEAttribute(cidrType1EClass, CIDR_TYPE1__ANY_ATTRIBUTE);

		circuitNameTypeEClass = createEClass(CIRCUIT_NAME_TYPE);
		createEAttribute(circuitNameTypeEClass, CIRCUIT_NAME_TYPE__VALUE);
		createEAttribute(circuitNameTypeEClass, CIRCUIT_NAME_TYPE__SOURCE);
		createEAttribute(circuitNameTypeEClass, CIRCUIT_NAME_TYPE__TIMESTAMP);
		createEAttribute(circuitNameTypeEClass, CIRCUIT_NAME_TYPE__ANY_ATTRIBUTE);

		circuitTypeEClass = createEClass(CIRCUIT_TYPE);
		createEReference(circuitTypeEClass, CIRCUIT_TYPE__CIRCUIT_NAME);

		computingDeviceTypeEClass = createEClass(COMPUTING_DEVICE_TYPE);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__CPE);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__CONNECTIONS);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__FQDN);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__HOSTNAME);
		createEReference(computingDeviceTypeEClass, COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID);

		connectionsTypeEClass = createEClass(CONNECTIONS_TYPE);
		createEReference(connectionsTypeEClass, CONNECTIONS_TYPE__CONNECTION);

		cpeType1EClass = createEClass(CPE_TYPE1);
		createEAttribute(cpeType1EClass, CPE_TYPE1__VALUE);
		createEAttribute(cpeType1EClass, CPE_TYPE1__SOURCE);
		createEAttribute(cpeType1EClass, CPE_TYPE1__TIMESTAMP);
		createEAttribute(cpeType1EClass, CPE_TYPE1__ANY_ATTRIBUTE);

		databaseTypeEClass = createEClass(DATABASE_TYPE);
		createEReference(databaseTypeEClass, DATABASE_TYPE__INSTANCE_NAME);

		dataTypeEClass = createEClass(DATA_TYPE);

		distinguishedNameTypeEClass = createEClass(DISTINGUISHED_NAME_TYPE);
		createEAttribute(distinguishedNameTypeEClass, DISTINGUISHED_NAME_TYPE__VALUE);
		createEAttribute(distinguishedNameTypeEClass, DISTINGUISHED_NAME_TYPE__SOURCE);
		createEAttribute(distinguishedNameTypeEClass, DISTINGUISHED_NAME_TYPE__TIMESTAMP);
		createEAttribute(distinguishedNameTypeEClass, DISTINGUISHED_NAME_TYPE__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSET_RELATED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSETS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CIRCUIT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IT_ASSET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPUTING_DEVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATABASE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMAIL_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FQDN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IP_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION_POINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION_REGION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NETWORK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOFTWARE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYNTHETIC_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TELEPHONE_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEBSITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEBSITE_URL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOURCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TIMESTAMP);

		documentRootTypeEClass = createEClass(DOCUMENT_ROOT_TYPE);
		createEAttribute(documentRootTypeEClass, DOCUMENT_ROOT_TYPE__VALUE);
		createEAttribute(documentRootTypeEClass, DOCUMENT_ROOT_TYPE__SOURCE);
		createEAttribute(documentRootTypeEClass, DOCUMENT_ROOT_TYPE__TIMESTAMP);
		createEAttribute(documentRootTypeEClass, DOCUMENT_ROOT_TYPE__ANY_ATTRIBUTE);

		emailAddressTypeEClass = createEClass(EMAIL_ADDRESS_TYPE);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__VALUE);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__SOURCE);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__TIMESTAMP);
		createEAttribute(emailAddressTypeEClass, EMAIL_ADDRESS_TYPE__ANY_ATTRIBUTE);

		extendedInformationTypeEClass = createEClass(EXTENDED_INFORMATION_TYPE);
		createEAttribute(extendedInformationTypeEClass, EXTENDED_INFORMATION_TYPE__ANY);

		fqdnTypeEClass = createEClass(FQDN_TYPE);
		createEAttribute(fqdnTypeEClass, FQDN_TYPE__VALUE);
		createEAttribute(fqdnTypeEClass, FQDN_TYPE__SOURCE);
		createEAttribute(fqdnTypeEClass, FQDN_TYPE__TIMESTAMP);
		createEAttribute(fqdnTypeEClass, FQDN_TYPE__ANY_ATTRIBUTE);

		hostnameType1EClass = createEClass(HOSTNAME_TYPE1);
		createEAttribute(hostnameType1EClass, HOSTNAME_TYPE1__VALUE);
		createEAttribute(hostnameType1EClass, HOSTNAME_TYPE1__SOURCE);
		createEAttribute(hostnameType1EClass, HOSTNAME_TYPE1__TIMESTAMP);
		createEAttribute(hostnameType1EClass, HOSTNAME_TYPE1__ANY_ATTRIBUTE);

		hostTypeEClass = createEClass(HOST_TYPE);
		createEReference(hostTypeEClass, HOST_TYPE__FQDN);
		createEReference(hostTypeEClass, HOST_TYPE__IP_ADDRESS);

		installationIdTypeEClass = createEClass(INSTALLATION_ID_TYPE);
		createEAttribute(installationIdTypeEClass, INSTALLATION_ID_TYPE__VALUE);
		createEAttribute(installationIdTypeEClass, INSTALLATION_ID_TYPE__SOURCE);
		createEAttribute(installationIdTypeEClass, INSTALLATION_ID_TYPE__TIMESTAMP);
		createEAttribute(installationIdTypeEClass, INSTALLATION_ID_TYPE__ANY_ATTRIBUTE);

		instanceNameTypeEClass = createEClass(INSTANCE_NAME_TYPE);
		createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__VALUE);
		createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__SOURCE);
		createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__TIMESTAMP);
		createEAttribute(instanceNameTypeEClass, INSTANCE_NAME_TYPE__ANY_ATTRIBUTE);

		ipAddressTypeEClass = createEClass(IP_ADDRESS_TYPE);
		createEReference(ipAddressTypeEClass, IP_ADDRESS_TYPE__IP_V4);
		createEReference(ipAddressTypeEClass, IP_ADDRESS_TYPE__IP_V6);

		ipNetRangeTypeEClass = createEClass(IP_NET_RANGE_TYPE);
		createEReference(ipNetRangeTypeEClass, IP_NET_RANGE_TYPE__IP_NET_RANGE_START);
		createEReference(ipNetRangeTypeEClass, IP_NET_RANGE_TYPE__IP_NET_RANGE_END);

		ipV4Type1EClass = createEClass(IP_V4_TYPE1);
		createEAttribute(ipV4Type1EClass, IP_V4_TYPE1__VALUE);
		createEAttribute(ipV4Type1EClass, IP_V4_TYPE1__SOURCE);
		createEAttribute(ipV4Type1EClass, IP_V4_TYPE1__TIMESTAMP);
		createEAttribute(ipV4Type1EClass, IP_V4_TYPE1__ANY_ATTRIBUTE);

		ipV6Type1EClass = createEClass(IP_V6_TYPE1);
		createEAttribute(ipV6Type1EClass, IP_V6_TYPE1__VALUE);
		createEAttribute(ipV6Type1EClass, IP_V6_TYPE1__SOURCE);
		createEAttribute(ipV6Type1EClass, IP_V6_TYPE1__TIMESTAMP);
		createEAttribute(ipV6Type1EClass, IP_V6_TYPE1__ANY_ATTRIBUTE);

		itAssetTypeEClass = createEClass(IT_ASSET_TYPE);

		licenseTypeEClass = createEClass(LICENSE_TYPE);
		createEAttribute(licenseTypeEClass, LICENSE_TYPE__VALUE);
		createEAttribute(licenseTypeEClass, LICENSE_TYPE__SOURCE);
		createEAttribute(licenseTypeEClass, LICENSE_TYPE__TIMESTAMP);
		createEAttribute(licenseTypeEClass, LICENSE_TYPE__ANY_ATTRIBUTE);

		localeType1EClass = createEClass(LOCALE_TYPE1);
		createEAttribute(localeType1EClass, LOCALE_TYPE1__VALUE);
		createEAttribute(localeType1EClass, LOCALE_TYPE1__SOURCE);
		createEAttribute(localeType1EClass, LOCALE_TYPE1__TIMESTAMP);
		createEAttribute(localeType1EClass, LOCALE_TYPE1__ANY_ATTRIBUTE);

		locationPointTypeEClass = createEClass(LOCATION_POINT_TYPE);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__ELEVATION);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__LATITUDE);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__LONGITUDE);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__RADIUS);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__SOURCE);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__TIMESTAMP);
		createEAttribute(locationPointTypeEClass, LOCATION_POINT_TYPE__ANY_ATTRIBUTE);

		locationRegionTypeEClass = createEClass(LOCATION_REGION_TYPE);
		createEAttribute(locationRegionTypeEClass, LOCATION_REGION_TYPE__VALUE);
		createEAttribute(locationRegionTypeEClass, LOCATION_REGION_TYPE__SOURCE);
		createEAttribute(locationRegionTypeEClass, LOCATION_REGION_TYPE__TIMESTAMP);
		createEAttribute(locationRegionTypeEClass, LOCATION_REGION_TYPE__ANY_ATTRIBUTE);

		locationsTypeEClass = createEClass(LOCATIONS_TYPE);
		createEAttribute(locationsTypeEClass, LOCATIONS_TYPE__LOCATION_GROUP);
		createEReference(locationsTypeEClass, LOCATIONS_TYPE__LOCATION);

		macAddressType1EClass = createEClass(MAC_ADDRESS_TYPE1);
		createEAttribute(macAddressType1EClass, MAC_ADDRESS_TYPE1__VALUE);
		createEAttribute(macAddressType1EClass, MAC_ADDRESS_TYPE1__SOURCE);
		createEAttribute(macAddressType1EClass, MAC_ADDRESS_TYPE1__TIMESTAMP);
		createEAttribute(macAddressType1EClass, MAC_ADDRESS_TYPE1__ANY_ATTRIBUTE);

		motherboardGuidTypeEClass = createEClass(MOTHERBOARD_GUID_TYPE);
		createEAttribute(motherboardGuidTypeEClass, MOTHERBOARD_GUID_TYPE__VALUE);
		createEAttribute(motherboardGuidTypeEClass, MOTHERBOARD_GUID_TYPE__SOURCE);
		createEAttribute(motherboardGuidTypeEClass, MOTHERBOARD_GUID_TYPE__TIMESTAMP);
		createEAttribute(motherboardGuidTypeEClass, MOTHERBOARD_GUID_TYPE__ANY_ATTRIBUTE);

		networkInterfaceTypeEClass = createEClass(NETWORK_INTERFACE_TYPE);
		createEReference(networkInterfaceTypeEClass, NETWORK_INTERFACE_TYPE__IP_ADDRESS);
		createEReference(networkInterfaceTypeEClass, NETWORK_INTERFACE_TYPE__MAC_ADDRESS);
		createEReference(networkInterfaceTypeEClass, NETWORK_INTERFACE_TYPE__URL);
		createEReference(networkInterfaceTypeEClass, NETWORK_INTERFACE_TYPE__SUBNET_MASK);
		createEReference(networkInterfaceTypeEClass, NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE);

		networkNameTypeEClass = createEClass(NETWORK_NAME_TYPE);
		createEAttribute(networkNameTypeEClass, NETWORK_NAME_TYPE__VALUE);
		createEAttribute(networkNameTypeEClass, NETWORK_NAME_TYPE__SOURCE);
		createEAttribute(networkNameTypeEClass, NETWORK_NAME_TYPE__TIMESTAMP);
		createEAttribute(networkNameTypeEClass, NETWORK_NAME_TYPE__ANY_ATTRIBUTE);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEReference(networkTypeEClass, NETWORK_TYPE__NETWORK_NAME);
		createEReference(networkTypeEClass, NETWORK_TYPE__IP_NET_RANGE);
		createEReference(networkTypeEClass, NETWORK_TYPE__CIDR);

		organizationTypeEClass = createEClass(ORGANIZATION_TYPE);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__EMAIL_ADDRESS);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__TELEPHONE_NUMBER);
		createEReference(organizationTypeEClass, ORGANIZATION_TYPE__WEBSITE_URL);

		personTypeEClass = createEClass(PERSON_TYPE);
		createEReference(personTypeEClass, PERSON_TYPE__PERSON_NAME);
		createEReference(personTypeEClass, PERSON_TYPE__EMAIL_ADDRESS);
		createEReference(personTypeEClass, PERSON_TYPE__TELEPHONE_NUMBER);
		createEReference(personTypeEClass, PERSON_TYPE__BIRTHDATE);

		portRangeTypeEClass = createEClass(PORT_RANGE_TYPE);
		createEAttribute(portRangeTypeEClass, PORT_RANGE_TYPE__LOWER_BOUND);
		createEAttribute(portRangeTypeEClass, PORT_RANGE_TYPE__SOURCE);
		createEAttribute(portRangeTypeEClass, PORT_RANGE_TYPE__TIMESTAMP);
		createEAttribute(portRangeTypeEClass, PORT_RANGE_TYPE__UPPER_BOUND);
		createEAttribute(portRangeTypeEClass, PORT_RANGE_TYPE__ANY_ATTRIBUTE);

		portType1EClass = createEClass(PORT_TYPE1);
		createEAttribute(portType1EClass, PORT_TYPE1__VALUE);
		createEAttribute(portType1EClass, PORT_TYPE1__SOURCE);
		createEAttribute(portType1EClass, PORT_TYPE1__TIMESTAMP);
		createEAttribute(portType1EClass, PORT_TYPE1__ANY_ATTRIBUTE);

		protocolTypeEClass = createEClass(PROTOCOL_TYPE);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__VALUE);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__SOURCE);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__TIMESTAMP);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__ANY_ATTRIBUTE);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__HOST);
		createEReference(serviceTypeEClass, SERVICE_TYPE__PORT);
		createEReference(serviceTypeEClass, SERVICE_TYPE__PORT_RANGE);
		createEReference(serviceTypeEClass, SERVICE_TYPE__PROTOCOL);

		softwareTypeEClass = createEClass(SOFTWARE_TYPE);
		createEReference(softwareTypeEClass, SOFTWARE_TYPE__INSTALLATION_ID);
		createEReference(softwareTypeEClass, SOFTWARE_TYPE__CPE);
		createEReference(softwareTypeEClass, SOFTWARE_TYPE__LICENSE);

		syntheticIdTypeEClass = createEClass(SYNTHETIC_ID_TYPE);
		createEAttribute(syntheticIdTypeEClass, SYNTHETIC_ID_TYPE__ID);
		createEAttribute(syntheticIdTypeEClass, SYNTHETIC_ID_TYPE__RESOURCE);

		systemNameTypeEClass = createEClass(SYSTEM_NAME_TYPE);
		createEAttribute(systemNameTypeEClass, SYSTEM_NAME_TYPE__VALUE);
		createEAttribute(systemNameTypeEClass, SYSTEM_NAME_TYPE__SOURCE);
		createEAttribute(systemNameTypeEClass, SYSTEM_NAME_TYPE__TIMESTAMP);
		createEAttribute(systemNameTypeEClass, SYSTEM_NAME_TYPE__ANY_ATTRIBUTE);

		systemTypeEClass = createEClass(SYSTEM_TYPE);
		createEReference(systemTypeEClass, SYSTEM_TYPE__SYSTEM_NAME);
		createEReference(systemTypeEClass, SYSTEM_TYPE__VERSION);

		telephoneNumberType1EClass = createEClass(TELEPHONE_NUMBER_TYPE1);
		createEAttribute(telephoneNumberType1EClass, TELEPHONE_NUMBER_TYPE1__VALUE);
		createEAttribute(telephoneNumberType1EClass, TELEPHONE_NUMBER_TYPE1__SOURCE);
		createEAttribute(telephoneNumberType1EClass, TELEPHONE_NUMBER_TYPE1__TIMESTAMP);
		createEAttribute(telephoneNumberType1EClass, TELEPHONE_NUMBER_TYPE1__ANY_ATTRIBUTE);

		urlTypeEClass = createEClass(URL_TYPE);
		createEAttribute(urlTypeEClass, URL_TYPE__VALUE);
		createEAttribute(urlTypeEClass, URL_TYPE__SOURCE);
		createEAttribute(urlTypeEClass, URL_TYPE__TIMESTAMP);
		createEAttribute(urlTypeEClass, URL_TYPE__ANY_ATTRIBUTE);

		versionTypeEClass = createEClass(VERSION_TYPE);
		createEAttribute(versionTypeEClass, VERSION_TYPE__VALUE);
		createEAttribute(versionTypeEClass, VERSION_TYPE__SOURCE);
		createEAttribute(versionTypeEClass, VERSION_TYPE__TIMESTAMP);
		createEAttribute(versionTypeEClass, VERSION_TYPE__ANY_ATTRIBUTE);

		websiteTypeEClass = createEClass(WEBSITE_TYPE);
		createEReference(websiteTypeEClass, WEBSITE_TYPE__DOCUMENT_ROOT);
		createEReference(websiteTypeEClass, WEBSITE_TYPE__LOCALE);

		websiteUrlTypeEClass = createEClass(WEBSITE_URL_TYPE);
		createEAttribute(websiteUrlTypeEClass, WEBSITE_URL_TYPE__VALUE);
		createEAttribute(websiteUrlTypeEClass, WEBSITE_URL_TYPE__SOURCE);
		createEAttribute(websiteUrlTypeEClass, WEBSITE_URL_TYPE__TIMESTAMP);
		createEAttribute(websiteUrlTypeEClass, WEBSITE_URL_TYPE__ANY_ATTRIBUTE);

		// Create data types
		cidrTypeEDataType = createEDataType(CIDR_TYPE);
		cpeTypeEDataType = createEDataType(CPE_TYPE);
		hostnameTypeEDataType = createEDataType(HOSTNAME_TYPE);
		ipv4TypeEDataType = createEDataType(IPV4_TYPE);
		ipv6TypeEDataType = createEDataType(IPV6_TYPE);
		latitudeTypeEDataType = createEDataType(LATITUDE_TYPE);
		latitudeTypeObjectEDataType = createEDataType(LATITUDE_TYPE_OBJECT);
		localeTypeEDataType = createEDataType(LOCALE_TYPE);
		longitudeTypeEDataType = createEDataType(LONGITUDE_TYPE);
		longitudeTypeObjectEDataType = createEDataType(LONGITUDE_TYPE_OBJECT);
		macAddressTypeEDataType = createEDataType(MAC_ADDRESS_TYPE);
		portTypeEDataType = createEDataType(PORT_TYPE);
		radiusTypeEDataType = createEDataType(RADIUS_TYPE);
		radiusTypeObjectEDataType = createEDataType(RADIUS_TYPE_OBJECT);
		telephoneNumberTypeEDataType = createEDataType(TELEPHONE_NUMBER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		gov.nist.scap.schema.reporting.core._1._1Package the_1Package_1 = (gov.nist.scap.schema.reporting.core._1._1Package)EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI);
		_0Package the_0Package = (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);
		oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package)EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assetIdentificationTypeEClass.getESuperTypes().add(this.getAssetsType());
		assetsTypeEClass.getESuperTypes().add(the_1Package_1.getRelationshipsContainerType());
		circuitTypeEClass.getESuperTypes().add(this.getItAssetType());
		computingDeviceTypeEClass.getESuperTypes().add(this.getItAssetType());
		databaseTypeEClass.getESuperTypes().add(this.getItAssetType());
		dataTypeEClass.getESuperTypes().add(this.getAssetType1());
		itAssetTypeEClass.getESuperTypes().add(this.getAssetType1());
		networkTypeEClass.getESuperTypes().add(this.getItAssetType());
		organizationTypeEClass.getESuperTypes().add(this.getAssetType1());
		personTypeEClass.getESuperTypes().add(this.getAssetType1());
		serviceTypeEClass.getESuperTypes().add(this.getItAssetType());
		softwareTypeEClass.getESuperTypes().add(this.getItAssetType());
		systemTypeEClass.getESuperTypes().add(this.getItAssetType());
		websiteTypeEClass.getESuperTypes().add(this.getItAssetType());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetIdentificationTypeEClass, AssetIdentificationType.class, "AssetIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetIdentificationType_AssetRef(), theXMLTypePackage.getNCName(), "assetRef", null, 1, 1, AssetIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetsTypeEClass, AssetsType.class, "AssetsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetsType_Asset(), this.getAssetType(), null, "asset", null, 1, -1, AssetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetTypeEClass, AssetType.class, "AssetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetType_AssetGroup(), ecorePackage.getEFeatureMapEntry(), "assetGroup", null, 1, 1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetType_Asset(), this.getAssetType1(), null, "asset", null, 1, 1, AssetType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetType1EClass, AssetType1.class, "AssetType1", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetType1_SyntheticId(), this.getSyntheticIdType(), null, "syntheticId", null, 0, -1, AssetType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetType1_Locations(), this.getLocationsType(), null, "locations", null, 0, 1, AssetType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetType1_ExtendedInformation(), this.getExtendedInformationType(), null, "extendedInformation", null, 0, 1, AssetType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, AssetType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(birthdateTypeEClass, BirthdateType.class, "BirthdateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBirthdateType_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, BirthdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBirthdateType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, BirthdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBirthdateType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, BirthdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBirthdateType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, BirthdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cidrType1EClass, CidrType1.class, "CidrType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCidrType1_Value(), this.getCidrType(), "value", null, 0, 1, CidrType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCidrType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, CidrType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCidrType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, CidrType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCidrType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CidrType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circuitNameTypeEClass, CircuitNameType.class, "CircuitNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircuitNameType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, CircuitNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitNameType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, CircuitNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitNameType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, CircuitNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuitNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CircuitNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circuitTypeEClass, CircuitType.class, "CircuitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircuitType_CircuitName(), this.getCircuitNameType(), null, "circuitName", null, 0, 1, CircuitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingDeviceTypeEClass, ComputingDeviceType.class, "ComputingDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingDeviceType_DistinguishedName(), this.getDistinguishedNameType(), null, "distinguishedName", null, 0, 1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingDeviceType_Cpe(), this.getCpeType1(), null, "cpe", null, 0, -1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingDeviceType_Connections(), this.getConnectionsType(), null, "connections", null, 0, 1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingDeviceType_Fqdn(), this.getFqdnType(), null, "fqdn", null, 0, 1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingDeviceType_Hostname(), this.getHostnameType1(), null, "hostname", null, 0, 1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingDeviceType_MotherboardGuid(), this.getMotherboardGuidType(), null, "motherboardGuid", null, 0, 1, ComputingDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionsTypeEClass, ConnectionsType.class, "ConnectionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionsType_Connection(), this.getNetworkInterfaceType(), null, "connection", null, 1, -1, ConnectionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpeType1EClass, CpeType1.class, "CpeType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpeType1_Value(), this.getCpeType(), "value", null, 0, 1, CpeType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpeType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, CpeType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpeType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, CpeType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpeType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CpeType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseTypeEClass, DatabaseType.class, "DatabaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseType_InstanceName(), this.getInstanceNameType(), null, "instanceName", null, 0, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distinguishedNameTypeEClass, DistinguishedNameType.class, "DistinguishedNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistinguishedNameType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, DistinguishedNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistinguishedNameType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, DistinguishedNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistinguishedNameType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, DistinguishedNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistinguishedNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DistinguishedNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Asset(), this.getAssetType1(), null, "asset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssetRelated(), this.getAssetIdentificationType(), null, "assetRelated", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Assets(), this.getAssetsType(), null, "assets", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Circuit(), this.getCircuitType(), null, "circuit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ItAsset(), this.getItAssetType(), null, "itAsset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComputingDevice(), this.getComputingDeviceType(), null, "computingDevice", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cpe(), this.getCpeType1(), null, "cpe", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Data(), this.getDataType(), null, "data", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Database(), this.getDatabaseType(), null, "database", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fqdn(), this.getFqdnType(), null, "fqdn", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IpAddress(), this.getIpAddressType(), null, "ipAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Location(), ecorePackage.getEObject(), null, "location", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocationAddress(), the_0Package.getAddressDetails(), null, "locationAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocationPoint(), this.getLocationPointType(), null, "locationPoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocationRegion(), this.getLocationRegionType(), null, "locationRegion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Locations(), this.getLocationsType(), null, "locations", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Network(), this.getNetworkType(), null, "network", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Organization(), this.getOrganizationType(), null, "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Person(), this.getPersonType(), null, "person", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServedBy(), this.getServiceType(), null, "servedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Service(), this.getServiceType(), null, "service", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Software(), this.getSoftwareType(), null, "software", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SyntheticId(), this.getSyntheticIdType(), null, "syntheticId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_System(), this.getSystemType(), null, "system", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TelephoneNumber(), this.getTelephoneNumberType1(), null, "telephoneNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Website(), this.getWebsiteType(), null, "website", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WebsiteUrl(), this.getWebsiteUrlType(), null, "websiteUrl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootTypeEClass, DocumentRootType.class, "DocumentRootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRootType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, DocumentRootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRootType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, DocumentRootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRootType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, DocumentRootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRootType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DocumentRootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailAddressTypeEClass, EmailAddressType.class, "EmailAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddressType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailAddressType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, EmailAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedInformationTypeEClass, ExtendedInformationType.class, "ExtendedInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedInformationType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, ExtendedInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fqdnTypeEClass, FqdnType.class, "FqdnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFqdnType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, FqdnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFqdnType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, FqdnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFqdnType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, FqdnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFqdnType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, FqdnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostnameType1EClass, HostnameType1.class, "HostnameType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostnameType1_Value(), this.getHostnameType(), "value", null, 0, 1, HostnameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostnameType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, HostnameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostnameType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, HostnameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostnameType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, HostnameType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostTypeEClass, HostType.class, "HostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostType_Fqdn(), this.getFqdnType(), null, "fqdn", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostType_IpAddress(), this.getIpAddressType(), null, "ipAddress", null, 0, 1, HostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installationIdTypeEClass, InstallationIdType.class, "InstallationIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstallationIdType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, InstallationIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallationIdType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, InstallationIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallationIdType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, InstallationIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstallationIdType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, InstallationIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceNameTypeEClass, InstanceNameType.class, "InstanceNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceNameType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceNameType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceNameType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, InstanceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipAddressTypeEClass, IpAddressType.class, "IpAddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIpAddressType_IpV4(), this.getIpV4Type1(), null, "ipV4", null, 0, 1, IpAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIpAddressType_IpV6(), this.getIpV6Type1(), null, "ipV6", null, 0, 1, IpAddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipNetRangeTypeEClass, IpNetRangeType.class, "IpNetRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIpNetRangeType_IpNetRangeStart(), this.getIpAddressType(), null, "ipNetRangeStart", null, 1, 1, IpNetRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIpNetRangeType_IpNetRangeEnd(), this.getIpAddressType(), null, "ipNetRangeEnd", null, 1, 1, IpNetRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipV4Type1EClass, IpV4Type1.class, "IpV4Type1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpV4Type1_Value(), this.getIpv4Type(), "value", null, 0, 1, IpV4Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV4Type1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, IpV4Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV4Type1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, IpV4Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV4Type1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, IpV4Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ipV6Type1EClass, IpV6Type1.class, "IpV6Type1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpV6Type1_Value(), this.getIpv6Type(), "value", null, 0, 1, IpV6Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV6Type1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, IpV6Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV6Type1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, IpV6Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpV6Type1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, IpV6Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itAssetTypeEClass, ItAssetType.class, "ItAssetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(licenseTypeEClass, LicenseType.class, "LicenseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicenseType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LicenseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, LicenseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, LicenseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicenseType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LicenseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localeType1EClass, LocaleType1.class, "LocaleType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocaleType1_Value(), this.getLocaleType(), "value", null, 0, 1, LocaleType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocaleType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, LocaleType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocaleType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, LocaleType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocaleType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LocaleType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationPointTypeEClass, LocationPointType.class, "LocationPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationPointType_Elevation(), theXMLTypePackage.getDouble(), "elevation", null, 0, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_Latitude(), this.getLatitudeType(), "latitude", null, 1, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_Longitude(), this.getLongitudeType(), "longitude", null, 1, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_Radius(), this.getRadiusType(), "radius", null, 0, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationPointType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LocationPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationRegionTypeEClass, LocationRegionType.class, "LocationRegionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationRegionType_Value(), theXMLTypePackage.getNormalizedString(), "value", null, 0, 1, LocationRegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationRegionType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, LocationRegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationRegionType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, LocationRegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationRegionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LocationRegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationsTypeEClass, LocationsType.class, "LocationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationsType_LocationGroup(), ecorePackage.getEFeatureMapEntry(), "locationGroup", null, 1, -1, LocationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationsType_Location(), ecorePackage.getEObject(), null, "location", null, 1, -1, LocationsType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(macAddressType1EClass, MacAddressType1.class, "MacAddressType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacAddressType1_Value(), this.getMacAddressType(), "value", null, 0, 1, MacAddressType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacAddressType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, MacAddressType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacAddressType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, MacAddressType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacAddressType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MacAddressType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motherboardGuidTypeEClass, MotherboardGuidType.class, "MotherboardGuidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotherboardGuidType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, MotherboardGuidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboardGuidType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, MotherboardGuidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboardGuidType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, MotherboardGuidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboardGuidType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MotherboardGuidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceTypeEClass, NetworkInterfaceType.class, "NetworkInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkInterfaceType_IpAddress(), this.getIpAddressType(), null, "ipAddress", null, 0, 1, NetworkInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterfaceType_MacAddress(), this.getMacAddressType1(), null, "macAddress", null, 0, 1, NetworkInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterfaceType_Url(), this.getUrlType(), null, "url", null, 0, -1, NetworkInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterfaceType_SubnetMask(), this.getIpAddressType(), null, "subnetMask", null, 0, 1, NetworkInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterfaceType_DefaultRoute(), this.getIpAddressType(), null, "defaultRoute", null, 0, 1, NetworkInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkNameTypeEClass, NetworkNameType.class, "NetworkNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkNameType_Value(), theXMLTypePackage.getNormalizedString(), "value", null, 0, 1, NetworkNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkNameType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, NetworkNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkNameType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, NetworkNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NetworkNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkType_NetworkName(), this.getNetworkNameType(), null, "networkName", null, 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_IpNetRange(), this.getIpNetRangeType(), null, "ipNetRange", null, 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_Cidr(), this.getCidrType1(), null, "cidr", null, 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationTypeEClass, OrganizationType.class, "OrganizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationType_OrganisationNameDetails(), the_0Package_1.getOrganisationNameDetailsType(), null, "organisationNameDetails", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_TelephoneNumber(), this.getTelephoneNumberType1(), null, "telephoneNumber", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationType_WebsiteUrl(), this.getWebsiteUrlType(), null, "websiteUrl", null, 0, -1, OrganizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personTypeEClass, PersonType.class, "PersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonType_PersonName(), the_0Package_1.getPersonNameType(), null, "personName", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_EmailAddress(), this.getEmailAddressType(), null, "emailAddress", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_TelephoneNumber(), this.getTelephoneNumberType1(), null, "telephoneNumber", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Birthdate(), this.getBirthdateType(), null, "birthdate", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRangeTypeEClass, PortRangeType.class, "PortRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortRangeType_LowerBound(), this.getPortType(), "lowerBound", null, 1, 1, PortRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortRangeType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, PortRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortRangeType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, PortRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortRangeType_UpperBound(), this.getPortType(), "upperBound", null, 1, 1, PortRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortRangeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PortRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portType1EClass, PortType1.class, "PortType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType1_Value(), this.getPortType(), "value", null, 0, 1, PortType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, PortType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, PortType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PortType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolTypeEClass, ProtocolType.class, "ProtocolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceType_Host(), this.getHostType(), null, "host", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Port(), this.getPortType1(), null, "port", null, 0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_PortRange(), this.getPortRangeType(), null, "portRange", null, 0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Protocol(), this.getProtocolType(), null, "protocol", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareTypeEClass, SoftwareType.class, "SoftwareType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareType_InstallationId(), this.getInstallationIdType(), null, "installationId", null, 0, 1, SoftwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareType_Cpe(), this.getCpeType1(), null, "cpe", null, 0, 1, SoftwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareType_License(), this.getLicenseType(), null, "license", null, 0, -1, SoftwareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syntheticIdTypeEClass, SyntheticIdType.class, "SyntheticIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSyntheticIdType_Id(), theXMLTypePackage.getToken(), "id", null, 1, 1, SyntheticIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntheticIdType_Resource(), theXMLTypePackage.getAnyURI(), "resource", null, 1, 1, SyntheticIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemNameTypeEClass, SystemNameType.class, "SystemNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemNameType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, SystemNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemNameType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, SystemNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemNameType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, SystemNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SystemNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemType_SystemName(), this.getSystemNameType(), null, "systemName", null, 0, -1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemType_Version(), this.getVersionType(), null, "version", null, 0, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberType1EClass, TelephoneNumberType1.class, "TelephoneNumberType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneNumberType1_Value(), this.getTelephoneNumberType(), "value", null, 0, 1, TelephoneNumberType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType1_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, TelephoneNumberType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType1_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, TelephoneNumberType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumberType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TelephoneNumberType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlTypeEClass, UrlType.class, "UrlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionTypeEClass, VersionType.class, "VersionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websiteTypeEClass, WebsiteType.class, "WebsiteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebsiteType_DocumentRoot(), this.getDocumentRootType(), null, "documentRoot", null, 0, 1, WebsiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsiteType_Locale(), this.getLocaleType1(), null, "locale", null, 0, 1, WebsiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websiteUrlTypeEClass, WebsiteUrlType.class, "WebsiteUrlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsiteUrlType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, WebsiteUrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteUrlType_Source(), theXMLTypePackage.getString(), "source", null, 0, 1, WebsiteUrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteUrlType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, WebsiteUrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteUrlType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, WebsiteUrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(cidrTypeEDataType, String.class, "CidrType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cpeTypeEDataType, String.class, "CpeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hostnameTypeEDataType, String.class, "HostnameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipv4TypeEDataType, String.class, "Ipv4Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipv6TypeEDataType, String.class, "Ipv6Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latitudeTypeEDataType, double.class, "LatitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latitudeTypeObjectEDataType, Double.class, "LatitudeTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localeTypeEDataType, String.class, "LocaleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longitudeTypeEDataType, double.class, "LongitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longitudeTypeObjectEDataType, Double.class, "LongitudeTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(macAddressTypeEDataType, String.class, "MacAddressType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portTypeEDataType, BigInteger.class, "PortType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(radiusTypeEDataType, double.class, "RadiusType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(radiusTypeObjectEDataType, Double.class, "RadiusTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(telephoneNumberTypeEDataType, String.class, "TelephoneNumberType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\n            <schema>Asset Identification</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.1</version>\n            <date>2012-02-13</date>\n        \n\n            <schema>Reporting Core</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.0</version>\n            <date>2011-06-02</date>\n        \n\n            <schema>CPE 2.3 Naming</schema>\n            <author>Adam Halbardier</author>\n            <version>2.3</version>\n            <date>2011-07-29</date>\n        "
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (assetIdentificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asset-identification-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetIdentificationType_AssetRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "asset-ref"
		   });	
		addAnnotation
		  (assetsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "assets-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetsType_Asset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (assetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asset_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetType_AssetGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "asset:group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetType_Asset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset",
			 "namespace", "##targetNamespace",
			 "group", "asset:group"
		   });	
		addAnnotation
		  (getAssetType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getAssetType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (assetType1EClass, 
		   source, 
		   new String[] {
			 "name", "asset-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetType1_SyntheticId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synthetic-id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetType1_Locations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetType1_ExtendedInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extended-information",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (birthdateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "birthdate_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getBirthdateType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getBirthdateType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBirthdateType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBirthdateType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (cidrTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cidr-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))/([0-9]|[1-2][0-9]|3[0-2])"
		   });	
		addAnnotation
		  (cidrType1EClass, 
		   source, 
		   new String[] {
			 "name", "cidr_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCidrType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCidrType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCidrType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCidrType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (circuitNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "circuit-name_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCircuitNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCircuitNameType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCircuitNameType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCircuitNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (circuitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "circuit-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCircuitType_CircuitName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "circuit-name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (computingDeviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "computing-device-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getComputingDeviceType_DistinguishedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "distinguished-name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComputingDeviceType_Cpe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpe",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComputingDeviceType_Connections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connections",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComputingDeviceType_Fqdn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fqdn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComputingDeviceType_Hostname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hostname",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getComputingDeviceType_MotherboardGuid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "motherboard-guid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (connectionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "connections_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConnectionsType_Connection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connection",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cpeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cpe-type",
			 "memberTypes", "http://cpe.mitre.org/naming/2.0#cpe22Type http://cpe.mitre.org/naming/2.0#cpe23Type"
		   });	
		addAnnotation
		  (cpeType1EClass, 
		   source, 
		   new String[] {
			 "name", "cpe_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCpeType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getCpeType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCpeType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCpeType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (databaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "database-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDatabaseType_InstanceName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instance-name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "data-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (distinguishedNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "distinguished-name_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDistinguishedNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDistinguishedNameType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDistinguishedNameType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDistinguishedNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Asset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_AssetRelated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset-related",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Assets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assets",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Circuit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "circuit",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_ItAsset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "it-asset",
			 "namespace", "##targetNamespace",
			 "affiliation", "asset"
		   });	
		addAnnotation
		  (getDocumentRoot_ComputingDevice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "computing-device",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_Cpe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpe",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace",
			 "affiliation", "asset"
		   });	
		addAnnotation
		  (getDocumentRoot_Database(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Fqdn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fqdn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_IpAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_LocationAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location-address",
			 "namespace", "##targetNamespace",
			 "affiliation", "location"
		   });	
		addAnnotation
		  (getDocumentRoot_LocationPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location-point",
			 "namespace", "##targetNamespace",
			 "affiliation", "location"
		   });	
		addAnnotation
		  (getDocumentRoot_LocationRegion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location-region",
			 "namespace", "##targetNamespace",
			 "affiliation", "location"
		   });	
		addAnnotation
		  (getDocumentRoot_Locations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Network(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "network",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "organization",
			 "namespace", "##targetNamespace",
			 "affiliation", "asset"
		   });	
		addAnnotation
		  (getDocumentRoot_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "person",
			 "namespace", "##targetNamespace",
			 "affiliation", "asset"
		   });	
		addAnnotation
		  (getDocumentRoot_ServedBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "served-by",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_Software(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "software",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_SyntheticId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synthetic-id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_System(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "telephone-number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "website",
			 "namespace", "##targetNamespace",
			 "affiliation", "it-asset"
		   });	
		addAnnotation
		  (getDocumentRoot_WebsiteUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "website-url",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-root_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDocumentRootType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDocumentRootType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRootType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRootType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (emailAddressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "email-address_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getEmailAddressType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getEmailAddressType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEmailAddressType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEmailAddressType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (extendedInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extended-information_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExtendedInformationType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (fqdnTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fqdn_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getFqdnType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getFqdnType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFqdnType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFqdnType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (hostnameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "hostname-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[\\w\\-]+(\\.[\\w\\-]+){0,}"
		   });	
		addAnnotation
		  (hostnameType1EClass, 
		   source, 
		   new String[] {
			 "name", "hostname_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getHostnameType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getHostnameType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostnameType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostnameType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (hostTypeEClass, 
		   source, 
		   new String[] {
			 "name", "host_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getHostType_Fqdn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fqdn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getHostType_IpAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (installationIdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "installation-id_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getInstallationIdType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getInstallationIdType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstallationIdType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstallationIdType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (instanceNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "instance-name_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getInstanceNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getInstanceNameType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstanceNameType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstanceNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (ipAddressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ip-address-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIpAddressType_IpV4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-v4",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpAddressType_IpV6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-v6",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ipNetRangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ip-net-range_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIpNetRangeType_IpNetRangeStart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-net-range-start",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpNetRangeType_IpNetRangeEnd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-net-range-end",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ipv4TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ipv4-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))\\.([0-9]|[1-9][0-9]|1([0-9][0-9])|2([0-4][0-9]|5[0-5]))"
		   });	
		addAnnotation
		  (ipV4Type1EClass, 
		   source, 
		   new String[] {
			 "name", "ip-v4_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getIpV4Type1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getIpV4Type1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpV4Type1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpV4Type1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (ipv6TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ipv6-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}"
		   });	
		addAnnotation
		  (ipV6Type1EClass, 
		   source, 
		   new String[] {
			 "name", "ip-v6_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getIpV6Type1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getIpV6Type1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpV6Type1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIpV6Type1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (itAssetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "it-asset-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (latitudeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "latitude_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-90",
			 "maxInclusive", "90"
		   });	
		addAnnotation
		  (latitudeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "latitude_._type:Object",
			 "baseType", "latitude_._type"
		   });	
		addAnnotation
		  (licenseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "license_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLicenseType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLicenseType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLicenseType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLicenseType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (localeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "locale-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?"
		   });	
		addAnnotation
		  (localeType1EClass, 
		   source, 
		   new String[] {
			 "name", "locale_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLocaleType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLocaleType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocaleType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocaleType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (locationPointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "location-point_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLocationPointType_Elevation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elevation"
		   });	
		addAnnotation
		  (getLocationPointType_Latitude(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "latitude"
		   });	
		addAnnotation
		  (getLocationPointType_Longitude(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "longitude"
		   });	
		addAnnotation
		  (getLocationPointType_Radius(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "radius"
		   });	
		addAnnotation
		  (getLocationPointType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocationPointType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocationPointType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (locationRegionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "location-region_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLocationRegionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getLocationRegionType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocationRegionType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocationRegionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (locationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "locations_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLocationsType_LocationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "location:group",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLocationsType_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace",
			 "group", "location:group"
		   });	
		addAnnotation
		  (longitudeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "longitude_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minExclusive", "-180",
			 "maxInclusive", "180"
		   });	
		addAnnotation
		  (longitudeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "longitude_._type:Object",
			 "baseType", "longitude_._type"
		   });	
		addAnnotation
		  (macAddressTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "mac-address-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}"
		   });	
		addAnnotation
		  (macAddressType1EClass, 
		   source, 
		   new String[] {
			 "name", "mac-address_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getMacAddressType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getMacAddressType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMacAddressType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMacAddressType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (motherboardGuidTypeEClass, 
		   source, 
		   new String[] {
			 "name", "motherboard-guid_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getMotherboardGuidType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getMotherboardGuidType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMotherboardGuidType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMotherboardGuidType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (networkInterfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "network-interface-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkInterfaceType_IpAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkInterfaceType_MacAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mac-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkInterfaceType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkInterfaceType_SubnetMask(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subnet-mask",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkInterfaceType_DefaultRoute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "default-route",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (networkNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "network-name_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getNetworkNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getNetworkNameType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkNameType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (networkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "network-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkType_NetworkName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "network-name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkType_IpNetRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ip-net-range",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkType_Cidr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cidr",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (organizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "organization-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganizationType_OrganisationNameDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationNameDetails",
			 "namespace", "urn:oasis:names:tc:ciq:xsdschema:xNL:2.0"
		   });	
		addAnnotation
		  (getOrganizationType_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganizationType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "telephone-number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganizationType_WebsiteUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "website-url",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (personTypeEClass, 
		   source, 
		   new String[] {
			 "name", "person-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPersonType_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "urn:oasis:names:tc:ciq:xsdschema:xNL:2.0"
		   });	
		addAnnotation
		  (getPersonType_EmailAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email-address",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonType_TelephoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "telephone-number",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonType_Birthdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "birthdate",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (portRangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "port-range_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPortRangeType_LowerBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lower-bound"
		   });	
		addAnnotation
		  (getPortRangeType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPortRangeType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPortRangeType_UpperBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "upper-bound"
		   });	
		addAnnotation
		  (getPortRangeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (portTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "port-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxInclusive", "65535"
		   });	
		addAnnotation
		  (portType1EClass, 
		   source, 
		   new String[] {
			 "name", "port_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPortType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPortType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPortType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPortType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (protocolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "protocol_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getProtocolType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getProtocolType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProtocolType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getProtocolType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (radiusTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "radius_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "0"
		   });	
		addAnnotation
		  (radiusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "radius_._type:Object",
			 "baseType", "radius_._type"
		   });	
		addAnnotation
		  (serviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getServiceType_Host(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "host",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceType_Port(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceType_PortRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "port-range",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "protocol",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (softwareTypeEClass, 
		   source, 
		   new String[] {
			 "name", "software-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSoftwareType_InstallationId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "installation-id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSoftwareType_Cpe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpe",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSoftwareType_License(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "license",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (syntheticIdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "synthetic-id_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSyntheticIdType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getSyntheticIdType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resource"
		   });	
		addAnnotation
		  (systemNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "system-name_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getSystemNameType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getSystemNameType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemNameType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (systemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "system-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSystemType_SystemName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system-name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSystemType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (telephoneNumberTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "telephone-number-type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "(([2-9][0-8]\\d-[2-9]\\d{2}-[0-9]{4})|(\\+([0-9]%20?){6,14}[0-9]))"
		   });	
		addAnnotation
		  (telephoneNumberType1EClass, 
		   source, 
		   new String[] {
			 "name", "telephone-number_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getTelephoneNumberType1_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getTelephoneNumberType1_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTelephoneNumberType1_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTelephoneNumberType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (urlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "url_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getUrlType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getUrlType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUrlType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getUrlType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (versionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "version_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getVersionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getVersionType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVersionType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVersionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (websiteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "website-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWebsiteType_DocumentRoot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-root",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebsiteType_Locale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locale",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (websiteUrlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "website-url_._type",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getWebsiteUrlType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getWebsiteUrlType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebsiteUrlType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebsiteUrlType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });
	}

} //_1PackageImpl
