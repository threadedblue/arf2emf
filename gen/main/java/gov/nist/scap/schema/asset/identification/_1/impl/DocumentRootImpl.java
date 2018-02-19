/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.AssetIdentificationType;
import gov.nist.scap.schema.asset.identification._1.AssetType1;
import gov.nist.scap.schema.asset.identification._1.AssetsType;
import gov.nist.scap.schema.asset.identification._1.CircuitType;
import gov.nist.scap.schema.asset.identification._1.ComputingDeviceType;
import gov.nist.scap.schema.asset.identification._1.CpeType1;
import gov.nist.scap.schema.asset.identification._1.DataType;
import gov.nist.scap.schema.asset.identification._1.DatabaseType;
import gov.nist.scap.schema.asset.identification._1.DocumentRoot;
import gov.nist.scap.schema.asset.identification._1.EmailAddressType;
import gov.nist.scap.schema.asset.identification._1.FqdnType;
import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1.ItAssetType;
import gov.nist.scap.schema.asset.identification._1.LocationPointType;
import gov.nist.scap.schema.asset.identification._1.LocationRegionType;
import gov.nist.scap.schema.asset.identification._1.LocationsType;
import gov.nist.scap.schema.asset.identification._1.NetworkType;
import gov.nist.scap.schema.asset.identification._1.OrganizationType;
import gov.nist.scap.schema.asset.identification._1.PersonType;
import gov.nist.scap.schema.asset.identification._1.ServiceType;
import gov.nist.scap.schema.asset.identification._1.SoftwareType;
import gov.nist.scap.schema.asset.identification._1.SyntheticIdType;
import gov.nist.scap.schema.asset.identification._1.SystemType;
import gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1;
import gov.nist.scap.schema.asset.identification._1.WebsiteType;
import gov.nist.scap.schema.asset.identification._1.WebsiteUrlType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import javax.xml.datatype.XMLGregorianCalendar;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getAssetRelated <em>Asset Related</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getItAsset <em>It Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getComputingDevice <em>Computing Device</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getData <em>Data</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getLocationPoint <em>Location Point</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getLocationRegion <em>Location Region</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getServedBy <em>Served By</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getSyntheticId <em>Synthetic Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getSystem <em>System</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getWebsiteUrl <em>Website Url</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.DocumentRootImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _1Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType1 getAsset() {
		return (AssetType1)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(AssetType1 newAsset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ASSET, newAsset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetIdentificationType getAssetRelated() {
		return (AssetIdentificationType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ASSET_RELATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetRelated(AssetIdentificationType newAssetRelated, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ASSET_RELATED, newAssetRelated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetRelated(AssetIdentificationType newAssetRelated) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ASSET_RELATED, newAssetRelated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsType getAssets() {
		return (AssetsType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ASSETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssets(AssetsType newAssets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ASSETS, newAssets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(AssetsType newAssets) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ASSETS, newAssets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitType getCircuit() {
		return (CircuitType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CIRCUIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuit(CircuitType newCircuit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CIRCUIT, newCircuit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit(CircuitType newCircuit) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CIRCUIT, newCircuit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItAssetType getItAsset() {
		return (ItAssetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__IT_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItAsset(ItAssetType newItAsset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__IT_ASSET, newItAsset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingDeviceType getComputingDevice() {
		return (ComputingDeviceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__COMPUTING_DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingDevice(ComputingDeviceType newComputingDevice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__COMPUTING_DEVICE, newComputingDevice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingDevice(ComputingDeviceType newComputingDevice) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__COMPUTING_DEVICE, newComputingDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpeType1 getCpe() {
		return (CpeType1)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpe(CpeType1 newCpe, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CPE, newCpe, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpe(CpeType1 newCpe) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CPE, newCpe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getData() {
		return (DataType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataType newData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__DATA, newData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(DataType newData) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType getDatabase() {
		return (DatabaseType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__DATABASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(DatabaseType newDatabase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__DATABASE, newDatabase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseType newDatabase) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__DATABASE, newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddressType getEmailAddress() {
		return (EmailAddressType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmailAddress(EmailAddressType newEmailAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, newEmailAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailAddress(EmailAddressType newEmailAddress) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__EMAIL_ADDRESS, newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FqdnType getFqdn() {
		return (FqdnType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FQDN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFqdn(FqdnType newFqdn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FQDN, newFqdn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqdn(FqdnType newFqdn) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FQDN, newFqdn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getIpAddress() {
		return (IpAddressType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpAddress(IpAddressType newIpAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__IP_ADDRESS, newIpAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(IpAddressType newIpAddress) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__IP_ADDRESS, newIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLocation() {
		return (EObject)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(EObject newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressDetails getLocationAddress() {
		return (AddressDetails)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LOCATION_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAddress(AddressDetails newLocationAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LOCATION_ADDRESS, newLocationAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAddress(AddressDetails newLocationAddress) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__LOCATION_ADDRESS, newLocationAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPointType getLocationPoint() {
		return (LocationPointType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LOCATION_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationPoint(LocationPointType newLocationPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LOCATION_POINT, newLocationPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationPoint(LocationPointType newLocationPoint) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__LOCATION_POINT, newLocationPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRegionType getLocationRegion() {
		return (LocationRegionType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LOCATION_REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationRegion(LocationRegionType newLocationRegion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LOCATION_REGION, newLocationRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationRegion(LocationRegionType newLocationRegion) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__LOCATION_REGION, newLocationRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType getLocations() {
		return (LocationsType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType newLocations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LOCATIONS, newLocations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType newLocations) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__LOCATIONS, newLocations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType getNetwork() {
		return (NetworkType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(NetworkType newNetwork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NETWORK, newNetwork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(NetworkType newNetwork) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType getOrganization() {
		return (OrganizationType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationType newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(OrganizationType newOrganization) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType getPerson() {
		return (PersonType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(PersonType newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PERSON, newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(PersonType newPerson) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PERSON, newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getServedBy() {
		return (ServiceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SERVED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServedBy(ServiceType newServedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SERVED_BY, newServedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServedBy(ServiceType newServedBy) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SERVED_BY, newServedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getService() {
		return (ServiceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SERVICE, newService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceType newService) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareType getSoftware() {
		return (SoftwareType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SOFTWARE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(SoftwareType newSoftware, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SOFTWARE, newSoftware, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(SoftwareType newSoftware) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SOFTWARE, newSoftware);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntheticIdType getSyntheticId() {
		return (SyntheticIdType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SYNTHETIC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntheticId(SyntheticIdType newSyntheticId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SYNTHETIC_ID, newSyntheticId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheticId(SyntheticIdType newSyntheticId) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SYNTHETIC_ID, newSyntheticId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystem() {
		return (SystemType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemType newSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SYSTEM, newSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemType newSystem) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SYSTEM, newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumberType1 getTelephoneNumber() {
		return (TelephoneNumberType1)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelephoneNumber(TelephoneNumberType1 newTelephoneNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, newTelephoneNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephoneNumber(TelephoneNumberType1 newTelephoneNumber) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TELEPHONE_NUMBER, newTelephoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteType getWebsite() {
		return (WebsiteType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__WEBSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsite(WebsiteType newWebsite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__WEBSITE, newWebsite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(WebsiteType newWebsite) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__WEBSITE, newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteUrlType getWebsiteUrl() {
		return (WebsiteUrlType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__WEBSITE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsiteUrl(WebsiteUrlType newWebsiteUrl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__WEBSITE_URL, newWebsiteUrl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteUrl(WebsiteUrlType newWebsiteUrl) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__WEBSITE_URL, newWebsiteUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DOCUMENT_ROOT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DOCUMENT_ROOT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__ASSET:
				return basicSetAsset(null, msgs);
			case _1Package.DOCUMENT_ROOT__ASSET_RELATED:
				return basicSetAssetRelated(null, msgs);
			case _1Package.DOCUMENT_ROOT__ASSETS:
				return basicSetAssets(null, msgs);
			case _1Package.DOCUMENT_ROOT__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case _1Package.DOCUMENT_ROOT__IT_ASSET:
				return basicSetItAsset(null, msgs);
			case _1Package.DOCUMENT_ROOT__COMPUTING_DEVICE:
				return basicSetComputingDevice(null, msgs);
			case _1Package.DOCUMENT_ROOT__CPE:
				return basicSetCpe(null, msgs);
			case _1Package.DOCUMENT_ROOT__DATA:
				return basicSetData(null, msgs);
			case _1Package.DOCUMENT_ROOT__DATABASE:
				return basicSetDatabase(null, msgs);
			case _1Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return basicSetEmailAddress(null, msgs);
			case _1Package.DOCUMENT_ROOT__FQDN:
				return basicSetFqdn(null, msgs);
			case _1Package.DOCUMENT_ROOT__IP_ADDRESS:
				return basicSetIpAddress(null, msgs);
			case _1Package.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case _1Package.DOCUMENT_ROOT__LOCATION_ADDRESS:
				return basicSetLocationAddress(null, msgs);
			case _1Package.DOCUMENT_ROOT__LOCATION_POINT:
				return basicSetLocationPoint(null, msgs);
			case _1Package.DOCUMENT_ROOT__LOCATION_REGION:
				return basicSetLocationRegion(null, msgs);
			case _1Package.DOCUMENT_ROOT__LOCATIONS:
				return basicSetLocations(null, msgs);
			case _1Package.DOCUMENT_ROOT__NETWORK:
				return basicSetNetwork(null, msgs);
			case _1Package.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case _1Package.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case _1Package.DOCUMENT_ROOT__SERVED_BY:
				return basicSetServedBy(null, msgs);
			case _1Package.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case _1Package.DOCUMENT_ROOT__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case _1Package.DOCUMENT_ROOT__SYNTHETIC_ID:
				return basicSetSyntheticId(null, msgs);
			case _1Package.DOCUMENT_ROOT__SYSTEM:
				return basicSetSystem(null, msgs);
			case _1Package.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return basicSetTelephoneNumber(null, msgs);
			case _1Package.DOCUMENT_ROOT__WEBSITE:
				return basicSetWebsite(null, msgs);
			case _1Package.DOCUMENT_ROOT__WEBSITE_URL:
				return basicSetWebsiteUrl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _1Package.DOCUMENT_ROOT__ASSET:
				return getAsset();
			case _1Package.DOCUMENT_ROOT__ASSET_RELATED:
				return getAssetRelated();
			case _1Package.DOCUMENT_ROOT__ASSETS:
				return getAssets();
			case _1Package.DOCUMENT_ROOT__CIRCUIT:
				return getCircuit();
			case _1Package.DOCUMENT_ROOT__IT_ASSET:
				return getItAsset();
			case _1Package.DOCUMENT_ROOT__COMPUTING_DEVICE:
				return getComputingDevice();
			case _1Package.DOCUMENT_ROOT__CPE:
				return getCpe();
			case _1Package.DOCUMENT_ROOT__DATA:
				return getData();
			case _1Package.DOCUMENT_ROOT__DATABASE:
				return getDatabase();
			case _1Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return getEmailAddress();
			case _1Package.DOCUMENT_ROOT__FQDN:
				return getFqdn();
			case _1Package.DOCUMENT_ROOT__IP_ADDRESS:
				return getIpAddress();
			case _1Package.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case _1Package.DOCUMENT_ROOT__LOCATION_ADDRESS:
				return getLocationAddress();
			case _1Package.DOCUMENT_ROOT__LOCATION_POINT:
				return getLocationPoint();
			case _1Package.DOCUMENT_ROOT__LOCATION_REGION:
				return getLocationRegion();
			case _1Package.DOCUMENT_ROOT__LOCATIONS:
				return getLocations();
			case _1Package.DOCUMENT_ROOT__NETWORK:
				return getNetwork();
			case _1Package.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case _1Package.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case _1Package.DOCUMENT_ROOT__SERVED_BY:
				return getServedBy();
			case _1Package.DOCUMENT_ROOT__SERVICE:
				return getService();
			case _1Package.DOCUMENT_ROOT__SOFTWARE:
				return getSoftware();
			case _1Package.DOCUMENT_ROOT__SYNTHETIC_ID:
				return getSyntheticId();
			case _1Package.DOCUMENT_ROOT__SYSTEM:
				return getSystem();
			case _1Package.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case _1Package.DOCUMENT_ROOT__WEBSITE:
				return getWebsite();
			case _1Package.DOCUMENT_ROOT__WEBSITE_URL:
				return getWebsiteUrl();
			case _1Package.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case _1Package.DOCUMENT_ROOT__TIMESTAMP:
				return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ASSET_RELATED:
				setAssetRelated((AssetIdentificationType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ASSETS:
				setAssets((AssetsType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CIRCUIT:
				setCircuit((CircuitType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__COMPUTING_DEVICE:
				setComputingDevice((ComputingDeviceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__CPE:
				setCpe((CpeType1)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__DATA:
				setData((DataType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress((EmailAddressType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__FQDN:
				setFqdn((FqdnType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__IP_ADDRESS:
				setIpAddress((IpAddressType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_ADDRESS:
				setLocationAddress((AddressDetails)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_POINT:
				setLocationPoint((LocationPointType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_REGION:
				setLocationRegion((LocationRegionType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATIONS:
				setLocations((LocationsType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NETWORK:
				setNetwork((NetworkType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PERSON:
				setPerson((PersonType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SERVED_BY:
				setServedBy((ServiceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SOFTWARE:
				setSoftware((SoftwareType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SYNTHETIC_ID:
				setSyntheticId((SyntheticIdType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SYSTEM:
				setSystem((SystemType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				setTelephoneNumber((TelephoneNumberType1)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite((WebsiteType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__WEBSITE_URL:
				setWebsiteUrl((WebsiteUrlType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__SOURCE:
				setSource((String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _1Package.DOCUMENT_ROOT__ASSET_RELATED:
				setAssetRelated((AssetIdentificationType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ASSETS:
				setAssets((AssetsType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CIRCUIT:
				setCircuit((CircuitType)null);
				return;
			case _1Package.DOCUMENT_ROOT__COMPUTING_DEVICE:
				setComputingDevice((ComputingDeviceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__CPE:
				setCpe((CpeType1)null);
				return;
			case _1Package.DOCUMENT_ROOT__DATA:
				setData((DataType)null);
				return;
			case _1Package.DOCUMENT_ROOT__DATABASE:
				setDatabase((DatabaseType)null);
				return;
			case _1Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				setEmailAddress((EmailAddressType)null);
				return;
			case _1Package.DOCUMENT_ROOT__FQDN:
				setFqdn((FqdnType)null);
				return;
			case _1Package.DOCUMENT_ROOT__IP_ADDRESS:
				setIpAddress((IpAddressType)null);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_ADDRESS:
				setLocationAddress((AddressDetails)null);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_POINT:
				setLocationPoint((LocationPointType)null);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATION_REGION:
				setLocationRegion((LocationRegionType)null);
				return;
			case _1Package.DOCUMENT_ROOT__LOCATIONS:
				setLocations((LocationsType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NETWORK:
				setNetwork((NetworkType)null);
				return;
			case _1Package.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((OrganizationType)null);
				return;
			case _1Package.DOCUMENT_ROOT__PERSON:
				setPerson((PersonType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SERVED_BY:
				setServedBy((ServiceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SOFTWARE:
				setSoftware((SoftwareType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SYNTHETIC_ID:
				setSyntheticId((SyntheticIdType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SYSTEM:
				setSystem((SystemType)null);
				return;
			case _1Package.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				setTelephoneNumber((TelephoneNumberType1)null);
				return;
			case _1Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite((WebsiteType)null);
				return;
			case _1Package.DOCUMENT_ROOT__WEBSITE_URL:
				setWebsiteUrl((WebsiteUrlType)null);
				return;
			case _1Package.DOCUMENT_ROOT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case _1Package.DOCUMENT_ROOT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _1Package.DOCUMENT_ROOT__ASSET:
				return getAsset() != null;
			case _1Package.DOCUMENT_ROOT__ASSET_RELATED:
				return getAssetRelated() != null;
			case _1Package.DOCUMENT_ROOT__ASSETS:
				return getAssets() != null;
			case _1Package.DOCUMENT_ROOT__CIRCUIT:
				return getCircuit() != null;
			case _1Package.DOCUMENT_ROOT__IT_ASSET:
				return getItAsset() != null;
			case _1Package.DOCUMENT_ROOT__COMPUTING_DEVICE:
				return getComputingDevice() != null;
			case _1Package.DOCUMENT_ROOT__CPE:
				return getCpe() != null;
			case _1Package.DOCUMENT_ROOT__DATA:
				return getData() != null;
			case _1Package.DOCUMENT_ROOT__DATABASE:
				return getDatabase() != null;
			case _1Package.DOCUMENT_ROOT__EMAIL_ADDRESS:
				return getEmailAddress() != null;
			case _1Package.DOCUMENT_ROOT__FQDN:
				return getFqdn() != null;
			case _1Package.DOCUMENT_ROOT__IP_ADDRESS:
				return getIpAddress() != null;
			case _1Package.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case _1Package.DOCUMENT_ROOT__LOCATION_ADDRESS:
				return getLocationAddress() != null;
			case _1Package.DOCUMENT_ROOT__LOCATION_POINT:
				return getLocationPoint() != null;
			case _1Package.DOCUMENT_ROOT__LOCATION_REGION:
				return getLocationRegion() != null;
			case _1Package.DOCUMENT_ROOT__LOCATIONS:
				return getLocations() != null;
			case _1Package.DOCUMENT_ROOT__NETWORK:
				return getNetwork() != null;
			case _1Package.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case _1Package.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case _1Package.DOCUMENT_ROOT__SERVED_BY:
				return getServedBy() != null;
			case _1Package.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case _1Package.DOCUMENT_ROOT__SOFTWARE:
				return getSoftware() != null;
			case _1Package.DOCUMENT_ROOT__SYNTHETIC_ID:
				return getSyntheticId() != null;
			case _1Package.DOCUMENT_ROOT__SYSTEM:
				return getSystem() != null;
			case _1Package.DOCUMENT_ROOT__TELEPHONE_NUMBER:
				return getTelephoneNumber() != null;
			case _1Package.DOCUMENT_ROOT__WEBSITE:
				return getWebsite() != null;
			case _1Package.DOCUMENT_ROOT__WEBSITE_URL:
				return getWebsiteUrl() != null;
			case _1Package.DOCUMENT_ROOT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case _1Package.DOCUMENT_ROOT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", source: ");
		result.append(source);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
