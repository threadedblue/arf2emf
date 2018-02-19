/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.HostType#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.HostType#getIpAddress <em>Ip Address</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getHostType()
 * @model extendedMetaData="name='host_._type' kind='elementOnly'"
 * @generated
 */
public interface HostType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fqdn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fully qualified domain name for the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fqdn</em>' containment reference.
	 * @see #setFqdn(FqdnType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getHostType_Fqdn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fqdn' namespace='##targetNamespace'"
	 * @generated
	 */
	FqdnType getFqdn();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.HostType#getFqdn <em>Fqdn</em>}' containment reference.
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
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getHostType_IpAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ip-address' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getIpAddress();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.HostType#getIpAddress <em>Ip Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' containment reference.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(IpAddressType value);

} // HostType
