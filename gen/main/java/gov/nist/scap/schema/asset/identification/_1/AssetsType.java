/**
 */
package gov.nist.scap.schema.asset.identification._1;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetsType#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetsType()
 * @model extendedMetaData="name='assets-type' kind='elementOnly'"
 * @generated
 */
public interface AssetsType extends RelationshipsContainerType {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.AssetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetsType_Asset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='asset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssetType> getAsset();

} // AssetsType
