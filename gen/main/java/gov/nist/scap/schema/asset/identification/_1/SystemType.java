/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.SystemType#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.SystemType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSystemType()
 * @model extendedMetaData="name='system-type' kind='elementOnly'"
 * @generated
 */
public interface SystemType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.SystemNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the system. It is possible that a system have multiple names,
	 *                                 or even abbreviated names. Each one of those names may be captured
	 *                                 here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSystemType_SystemName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemNameType> getSystemName();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(VersionType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSystemType_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.SystemType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

} // SystemType
