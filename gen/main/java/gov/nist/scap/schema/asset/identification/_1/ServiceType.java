/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getHost <em>Host</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getPort <em>Port</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getPortRange <em>Port Range</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getServiceType()
 * @model extendedMetaData="name='service-type' kind='elementOnly'"
 * @generated
 */
public interface ServiceType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hostname or IP address where the service is hosted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' containment reference.
	 * @see #setHost(HostType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getServiceType_Host()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
	 * @generated
	 */
	HostType getHost();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getHost <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' containment reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(HostType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.PortType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port to which the service is bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getServiceType_Port()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PortType1> getPort();

	/**
	 * Returns the value of the '<em><b>Port Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.PortRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inclusive port range to which the service is
	 *                                     bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Range</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getServiceType_PortRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-range' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PortRangeType> getPortRange();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol used to interact with the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ProtocolType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getServiceType_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.ServiceType#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

} // ServiceType
