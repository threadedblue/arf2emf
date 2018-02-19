/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getUrl <em>Url</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getDefaultRoute <em>Default Route</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType()
 * @model extendedMetaData="name='network-interface-type' kind='elementOnly'"
 * @generated
 */
public interface NetworkInterfaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address for this network interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Address</em>' containment reference.
	 * @see #setIpAddress(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType_IpAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ip-address' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getIpAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getIpAddress <em>Ip Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' containment reference.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(IpAddressType value);

	/**
	 * Returns the value of the '<em><b>Mac Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MAC address associated with this network interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mac Address</em>' containment reference.
	 * @see #setMacAddress(MacAddressType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType_MacAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mac-address' namespace='##targetNamespace'"
	 * @generated
	 */
	MacAddressType1 getMacAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getMacAddress <em>Mac Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' containment reference.
	 * @see #getMacAddress()
	 * @generated
	 */
	void setMacAddress(MacAddressType1 value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.UrlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL in a relevant DNS server for this IP address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UrlType> getUrl();

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subnet mask address for this network interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' containment reference.
	 * @see #setSubnetMask(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType_SubnetMask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subnet-mask' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getSubnetMask();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getSubnetMask <em>Subnet Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' containment reference.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(IpAddressType value);

	/**
	 * Returns the value of the '<em><b>Default Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address for the default gateway of this connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Route</em>' containment reference.
	 * @see #setDefaultRoute(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkInterfaceType_DefaultRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-route' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getDefaultRoute();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType#getDefaultRoute <em>Default Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Route</em>' containment reference.
	 * @see #getDefaultRoute()
	 * @generated
	 */
	void setDefaultRoute(IpAddressType value);

} // NetworkInterfaceType
