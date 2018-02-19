/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getAssetReportCollection <em>Asset Report Collection</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getRemoteResource <em>Remote Resource</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Asset Report Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The top-level report element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asset Report Collection</em>' containment reference.
	 * @see #setAssetReportCollection(AssetReportCollectionType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_AssetReportCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asset-report-collection' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetReportCollectionType getAssetReportCollection();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getAssetReportCollection <em>Asset Report Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Report Collection</em>' containment reference.
	 * @see #getAssetReportCollection()
	 * @generated
	 */
	void setAssetReportCollection(AssetReportCollectionType value);

	/**
	 * Returns the value of the '<em><b>Object Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report creators can embedding this element in a report with the @ref_id referencing the ID of an asset, report, or report request.  This element effectively acts as a pointer, allowing content produces to reference higher level ARF constructs in a report, without duplicating the data in that ARF construct.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Ref</em>' containment reference.
	 * @see #setObjectRef(ObjectRefType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_ObjectRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectRefType getObjectRef();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getObjectRef <em>Object Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref</em>' containment reference.
	 * @see #getObjectRef()
	 * @generated
	 */
	void setObjectRef(ObjectRefType value);

	/**
	 * Returns the value of the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to content stored external to this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Resource</em>' containment reference.
	 * @see #setRemoteResource(RemoteResourceType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getDocumentRoot_RemoteResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remote-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteResourceType getRemoteResource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot#getRemoteResource <em>Remote Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Resource</em>' containment reference.
	 * @see #getRemoteResource()
	 * @generated
	 */
	void setRemoteResource(RemoteResourceType value);

} // DocumentRoot
