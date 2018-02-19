/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getDistinguishedName <em>Distinguished Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getConnections <em>Connections</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getHostname <em>Hostname</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getMotherboardGuid <em>Motherboard Guid</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType()
 * @model extendedMetaData="name='computing-device-type' kind='elementOnly'"
 * @generated
 */
public interface ComputingDeviceType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Distinguished Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full X.500 distinguished name for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinguished Name</em>' containment reference.
	 * @see #setDistinguishedName(DistinguishedNameType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_DistinguishedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distinguished-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DistinguishedNameType getDistinguishedName();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getDistinguishedName <em>Distinguished Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinguished Name</em>' containment reference.
	 * @see #getDistinguishedName()
	 * @generated
	 */
	void setDistinguishedName(DistinguishedNameType value);

	/**
	 * Returns the value of the '<em><b>Cpe</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.CpeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware CPE name for the device (CPE 2.2 URI or CPE 2.3 Formatted String).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpe</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_Cpe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cpe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CpeType1> getCpe();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP network interface connections that exist for the device (regardless
	 *                                 of if the network interface is connected to a network or not).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #setConnections(ConnectionsType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_Connections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connections' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionsType getConnections();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(ConnectionsType value);

	/**
	 * Returns the value of the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fully qualified domain name for the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fqdn</em>' containment reference.
	 * @see #setFqdn(FqdnType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_Fqdn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fqdn' namespace='##targetNamespace'"
	 * @generated
	 */
	FqdnType getFqdn();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getFqdn <em>Fqdn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fqdn</em>' containment reference.
	 * @see #getFqdn()
	 * @generated
	 */
	void setFqdn(FqdnType value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hostname of the computing device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hostname</em>' containment reference.
	 * @see #setHostname(HostnameType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_Hostname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hostname' namespace='##targetNamespace'"
	 * @generated
	 */
	HostnameType1 getHostname();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getHostname <em>Hostname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' containment reference.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(HostnameType1 value);

	/**
	 * Returns the value of the '<em><b>Motherboard Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The motherboard globally unique identifier of the computing
	 *                                 device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Motherboard Guid</em>' containment reference.
	 * @see #setMotherboardGuid(MotherboardGuidType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getComputingDeviceType_MotherboardGuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='motherboard-guid' namespace='##targetNamespace'"
	 * @generated
	 */
	MotherboardGuidType getMotherboardGuid();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ComputingDeviceType#getMotherboardGuid <em>Motherboard Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motherboard Guid</em>' containment reference.
	 * @see #getMotherboardGuid()
	 * @generated
	 */
	void setMotherboardGuid(MotherboardGuidType value);

} // ComputingDeviceType
