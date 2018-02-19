/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getInstallationId <em>Installation Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSoftwareType()
 * @model extendedMetaData="name='software-type' kind='elementOnly'"
 * @generated
 */
public interface SoftwareType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Installation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any identifier for the software instance (installation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Installation Id</em>' containment reference.
	 * @see #setInstallationId(InstallationIdType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSoftwareType_InstallationId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='installation-id' namespace='##targetNamespace'"
	 * @generated
	 */
	InstallationIdType getInstallationId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getInstallationId <em>Installation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Id</em>' containment reference.
	 * @see #getInstallationId()
	 * @generated
	 */
	void setInstallationId(InstallationIdType value);

	/**
	 * Returns the value of the '<em><b>Cpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CPE name for the software (CPE 2.2 URI or CPE 2.3 Formatted String).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpe</em>' containment reference.
	 * @see #setCpe(CpeType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSoftwareType_Cpe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cpe' namespace='##targetNamespace'"
	 * @generated
	 */
	CpeType1 getCpe();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.SoftwareType#getCpe <em>Cpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpe</em>' containment reference.
	 * @see #getCpe()
	 * @generated
	 */
	void setCpe(CpeType1 value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.LicenseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The license key for the software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getSoftwareType_License()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LicenseType> getLicense();

} // SoftwareType
