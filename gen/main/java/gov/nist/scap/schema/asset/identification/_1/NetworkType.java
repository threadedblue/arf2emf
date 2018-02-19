/**
 */
package gov.nist.scap.schema.asset.identification._1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getIpNetRange <em>Ip Net Range</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getCidr <em>Cidr</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkType()
 * @model extendedMetaData="name='network-type' kind='elementOnly'"
 * @generated
 */
public interface NetworkType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Network Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the network as commonly referred to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Name</em>' containment reference.
	 * @see #setNetworkName(NetworkNameType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkType_NetworkName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network-name' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkNameType getNetworkName();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getNetworkName <em>Network Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Name</em>' containment reference.
	 * @see #getNetworkName()
	 * @generated
	 */
	void setNetworkName(NetworkNameType value);

	/**
	 * Returns the value of the '<em><b>Ip Net Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and end IP addresses to indicate the range of IP addresses
	 *                                     covered by this network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Net Range</em>' containment reference.
	 * @see #setIpNetRange(IpNetRangeType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkType_IpNetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ip-net-range' namespace='##targetNamespace'"
	 * @generated
	 */
	IpNetRangeType getIpNetRange();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getIpNetRange <em>Ip Net Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Net Range</em>' containment reference.
	 * @see #getIpNetRange()
	 * @generated
	 */
	void setIpNetRange(IpNetRangeType value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classless inter-domain routing notation for the
	 *                                     network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cidr</em>' containment reference.
	 * @see #setCidr(CidrType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getNetworkType_Cidr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cidr' namespace='##targetNamespace'"
	 * @generated
	 */
	CidrType1 getCidr();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.NetworkType#getCidr <em>Cidr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' containment reference.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(CidrType1 value);

} // NetworkType
