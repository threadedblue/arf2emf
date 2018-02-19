/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import gov.nist.scap.schema.asset.identification._1.AssetType1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAssetGroup <em>Asset Group</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAsset <em>Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getRemoteResource <em>Remote Resource</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType()
 * @model extendedMetaData="name='asset_._type' kind='elementOnly'"
 * @generated
 */
public interface AssetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes that are common to all assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Group</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType_AssetGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='asset:group' namespace='http://scap.nist.gov/schema/asset-identification/1.1'"
	 * @generated
	 */
	FeatureMap getAssetGroup();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds identifying attributes that are common to all assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType_Asset()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asset' namespace='http://scap.nist.gov/schema/asset-identification/1.1' group='http://scap.nist.gov/schema/asset-identification/1.1#asset:group'"
	 * @generated
	 */
	AssetType1 getAsset();

	/**
	 * Returns the value of the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to content stored external to this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Resource</em>' containment reference.
	 * @see #setRemoteResource(RemoteResourceType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType_RemoteResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remote-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteResourceType getRemoteResource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getRemoteResource <em>Remote Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Resource</em>' containment reference.
	 * @see #getRemoteResource()
	 * @generated
	 */
	void setRemoteResource(RemoteResourceType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal ID to identify this asset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A placeholder so that content creators can add attributes as
	 *                                         desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AssetType
