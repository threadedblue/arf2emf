/**
 */
package gov.nist.scap.schema.asset.identification._1;

import javax.xml.datatype.XMLGregorianCalendar;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAsset <em>Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssetRelated <em>Asset Related</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssets <em>Assets</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getItAsset <em>It Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getComputingDevice <em>Computing Device</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getData <em>Data</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getDatabase <em>Database</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationPoint <em>Location Point</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationRegion <em>Location Region</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocations <em>Locations</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getNetwork <em>Network</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getServedBy <em>Served By</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSoftware <em>Software</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSyntheticId <em>Synthetic Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSystem <em>System</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsite <em>Website</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsiteUrl <em>Website Url</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes that are common to all assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Asset()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetType1 getAsset();

	/**
	 * Returns the value of the '<em><b>Asset Related</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Related</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Related</em>' containment reference.
	 * @see #setAssetRelated(AssetIdentificationType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_AssetRelated()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asset-related' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetIdentificationType getAssetRelated();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssetRelated <em>Asset Related</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Related</em>' containment reference.
	 * @see #getAssetRelated()
	 * @generated
	 */
	void setAssetRelated(AssetIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference.
	 * @see #setAssets(AssetsType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Assets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assets' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetsType getAssets();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getAssets <em>Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets</em>' containment reference.
	 * @see #getAssets()
	 * @generated
	 */
	void setAssets(AssetsType value);

	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a circuit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circuit</em>' containment reference.
	 * @see #setCircuit(CircuitType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Circuit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circuit' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	CircuitType getCircuit();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCircuit <em>Circuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' containment reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(CircuitType value);

	/**
	 * Returns the value of the '<em><b>It Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes that are common to all IT assets
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>It Asset</em>' containment reference.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_ItAsset()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='it-asset' namespace='##targetNamespace' affiliation='asset'"
	 * @generated
	 */
	ItAssetType getItAsset();

	/**
	 * Returns the value of the '<em><b>Computing Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a computing device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computing Device</em>' containment reference.
	 * @see #setComputingDevice(ComputingDeviceType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_ComputingDevice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='computing-device' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	ComputingDeviceType getComputingDevice();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getComputingDevice <em>Computing Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Device</em>' containment reference.
	 * @see #getComputingDevice()
	 * @generated
	 */
	void setComputingDevice(ComputingDeviceType value);

	/**
	 * Returns the value of the '<em><b>Cpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Common Platform Enumeration (CPE) name (CPE 2.2 URI or CPE 2.3 Formatted String).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpe</em>' containment reference.
	 * @see #setCpe(CpeType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Cpe()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cpe' namespace='##targetNamespace'"
	 * @generated
	 */
	CpeType1 getCpe();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getCpe <em>Cpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpe</em>' containment reference.
	 * @see #getCpe()
	 * @generated
	 */
	void setCpe(CpeType1 value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stub element to represent the identification of data. This element can be extended in
	 *                 the future for specific types of data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Data()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace' affiliation='asset'"
	 * @generated
	 */
	DataType getData();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(DatabaseType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Database()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	DatabaseType getDatabase();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An email address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' containment reference.
	 * @see #setEmailAddress(EmailAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_EmailAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email-address' namespace='##targetNamespace'"
	 * @generated
	 */
	EmailAddressType getEmailAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getEmailAddress <em>Email Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' containment reference.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(EmailAddressType value);

	/**
	 * Returns the value of the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fully qualified domain name for the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fqdn</em>' containment reference.
	 * @see #setFqdn(FqdnType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Fqdn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fqdn' namespace='##targetNamespace'"
	 * @generated
	 */
	FqdnType getFqdn();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getFqdn <em>Fqdn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fqdn</em>' containment reference.
	 * @see #getFqdn()
	 * @generated
	 */
	void setFqdn(FqdnType value);

	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An IP address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Address</em>' containment reference.
	 * @see #setIpAddress(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_IpAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ip-address' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getIpAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getIpAddress <em>Ip Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' containment reference.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(IpAddressType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLocation();

	/**
	 * Returns the value of the '<em><b>Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address where an asset is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Address</em>' containment reference.
	 * @see #setLocationAddress(AddressDetails)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_LocationAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location-address' namespace='##targetNamespace' affiliation='location'"
	 * @generated
	 */
	AddressDetails getLocationAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationAddress <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Address</em>' containment reference.
	 * @see #getLocationAddress()
	 * @generated
	 */
	void setLocationAddress(AddressDetails value);

	/**
	 * Returns the value of the '<em><b>Location Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The geographic point where an asset is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Point</em>' containment reference.
	 * @see #setLocationPoint(LocationPointType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_LocationPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location-point' namespace='##targetNamespace' affiliation='location'"
	 * @generated
	 */
	LocationPointType getLocationPoint();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationPoint <em>Location Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Point</em>' containment reference.
	 * @see #getLocationPoint()
	 * @generated
	 */
	void setLocationPoint(LocationPointType value);

	/**
	 * Returns the value of the '<em><b>Location Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region where an asset is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Region</em>' containment reference.
	 * @see #setLocationRegion(LocationRegionType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_LocationRegion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location-region' namespace='##targetNamespace' affiliation='location'"
	 * @generated
	 */
	LocationRegionType getLocationRegion();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocationRegion <em>Location Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Region</em>' containment reference.
	 * @see #getLocationRegion()
	 * @generated
	 */
	void setLocationRegion(LocationRegionType value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more locations where this asset resides
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Locations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locations' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationsType getLocations();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(NetworkType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Network()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	NetworkType getNetwork();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(NetworkType value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Organization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace' affiliation='asset'"
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(PersonType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Person()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace' affiliation='asset'"
	 * @generated
	 */
	PersonType getPerson();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(PersonType value);

	/**
	 * Returns the value of the '<em><b>Served By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service that is serving up the asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Served By</em>' containment reference.
	 * @see #setServedBy(ServiceType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_ServedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='served-by' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType getServedBy();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getServedBy <em>Served By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Served By</em>' containment reference.
	 * @see #getServedBy()
	 * @generated
	 */
	void setServedBy(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Service()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a software installation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(SoftwareType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Software()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='software' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	SoftwareType getSoftware();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(SoftwareType value);

	/**
	 * Returns the value of the '<em><b>Synthetic Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the synthetic ID for the asset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synthetic Id</em>' containment reference.
	 * @see #setSyntheticId(SyntheticIdType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_SyntheticId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synthetic-id' namespace='##targetNamespace'"
	 * @generated
	 */
	SyntheticIdType getSyntheticId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSyntheticId <em>Synthetic Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Id</em>' containment reference.
	 * @see #getSyntheticId()
	 * @generated
	 */
	void setSyntheticId(SyntheticIdType value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(SystemType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_System()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	SystemType getSystem();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemType value);

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The telephone number. For a North American number, the number must be valid and the format
	 *                 must be XXX-XXX-XXXX where X is a digit. For an international number, the number must begin with a '+'
	 *                 symbol, followed by 7 to 15 digits. A space may be used between digits, as appropriate. For example: +88
	 *                 888 888 8 (this is following the ITU-T E.123 notation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference.
	 * @see #setTelephoneNumber(TelephoneNumberType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_TelephoneNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='telephone-number' namespace='##targetNamespace'"
	 * @generated
	 */
	TelephoneNumberType1 getTelephoneNumber();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTelephoneNumber <em>Telephone Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Number</em>' containment reference.
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	void setTelephoneNumber(TelephoneNumberType1 value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes for a website.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Website</em>' containment reference.
	 * @see #setWebsite(WebsiteType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Website()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='website' namespace='##targetNamespace' affiliation='it-asset'"
	 * @generated
	 */
	WebsiteType getWebsite();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsite <em>Website</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' containment reference.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(WebsiteType value);

	/**
	 * Returns the value of the '<em><b>Website Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the website.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Website Url</em>' containment reference.
	 * @see #setWebsiteUrl(WebsiteUrlType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_WebsiteUrl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='website-url' namespace='##targetNamespace'"
	 * @generated
	 */
	WebsiteUrlType getWebsiteUrl();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getWebsiteUrl <em>Website Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Url</em>' containment reference.
	 * @see #getWebsiteUrl()
	 * @generated
	 */
	void setWebsiteUrl(WebsiteUrlType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the source of the information. The value of this field is left open to the
	 *                 content producer, but MAY include a synthetic ID of the asset which sourced the information, another ID
	 *                 of the source, or a description of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the data was last known to be correct.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDocumentRoot_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DocumentRoot#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

} // DocumentRoot
