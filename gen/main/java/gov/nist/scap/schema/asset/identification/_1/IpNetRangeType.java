/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip Net Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeStart <em>Ip Net Range Start</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeEnd <em>Ip Net Range End</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpNetRangeType()
 * @model extendedMetaData="name='ip-net-range_._type' kind='elementOnly'"
 * @generated
 */
public interface IpNetRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip Net Range Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting IP address in the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Net Range Start</em>' containment reference.
	 * @see #setIpNetRangeStart(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpNetRangeType_IpNetRangeStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ip-net-range-start' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getIpNetRangeStart();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeStart <em>Ip Net Range Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Net Range Start</em>' containment reference.
	 * @see #getIpNetRangeStart()
	 * @generated
	 */
	void setIpNetRangeStart(IpAddressType value);

	/**
	 * Returns the value of the '<em><b>Ip Net Range End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending IP address in the network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Net Range End</em>' containment reference.
	 * @see #setIpNetRangeEnd(IpAddressType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getIpNetRangeType_IpNetRangeEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ip-net-range-end' namespace='##targetNamespace'"
	 * @generated
	 */
	IpAddressType getIpNetRangeEnd();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.IpNetRangeType#getIpNetRangeEnd <em>Ip Net Range End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Net Range End</em>' containment reference.
	 * @see #getIpNetRangeEnd()
	 * @generated
	 */
	void setIpNetRangeEnd(IpAddressType value);

} // IpNetRangeType
