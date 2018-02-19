/**
 */
package gov.nist.scap.schema.asset.identification._1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.DatabaseType#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDatabaseType()
 * @model extendedMetaData="name='database-type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the database instance being identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' containment reference.
	 * @see #setInstanceName(InstanceNameType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getDatabaseType_InstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance-name' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceNameType getInstanceName();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.DatabaseType#getInstanceName <em>Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' containment reference.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(InstanceNameType value);

} // DatabaseType
