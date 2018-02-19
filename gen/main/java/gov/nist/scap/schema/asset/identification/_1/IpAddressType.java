/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV4 <em>Ip V4</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV6 <em>Ip V6</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpAddressType()
 * @model extendedMetaData="name='ip-address-type' kind='elementOnly'"
 * @generated
 */
public interface IpAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip V4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip V4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4</em>' containment reference.
	 * @see #setIpV4(IpV4Type1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpAddressType_IpV4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ip-v4' namespace='##targetNamespace'"
	 * @generated
	 */
	IpV4Type1 getIpV4();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV4 <em>Ip V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4</em>' containment reference.
	 * @see #getIpV4()
	 * @generated
	 */
	void setIpV4(IpV4Type1 value);

	/**
	 * Returns the value of the '<em><b>Ip V6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip V6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V6</em>' containment reference.
	 * @see #setIpV6(IpV6Type1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpAddressType_IpV6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ip-v6' namespace='##targetNamespace'"
	 * @generated
	 */
	IpV6Type1 getIpV6();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.IpAddressType#getIpV6 <em>Ip V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V6</em>' containment reference.
	 * @see #getIpV6()
	 * @generated
	 */
	void setIpV6(IpV6Type1 value);

} // IpAddressType
