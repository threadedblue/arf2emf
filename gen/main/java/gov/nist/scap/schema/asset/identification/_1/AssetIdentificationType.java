/**
 */
package gov.nist.scap.schema.asset.identification._1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetIdentificationType#getAssetRef <em>Asset Ref</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetIdentificationType()
 * @model extendedMetaData="name='asset-identification-type' kind='elementOnly'"
 * @generated
 */
public interface AssetIdentificationType extends AssetsType {
	/**
	 * Returns the value of the '<em><b>Asset Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Ref</em>' attribute.
	 * @see #setAssetRef(String)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetIdentificationType_AssetRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='asset-ref'"
	 * @generated
	 */
	String getAssetRef();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.AssetIdentificationType#getAssetRef <em>Asset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Ref</em>' attribute.
	 * @see #getAssetRef()
	 * @generated
	 */
	void setAssetRef(String value);

} // AssetIdentificationType
