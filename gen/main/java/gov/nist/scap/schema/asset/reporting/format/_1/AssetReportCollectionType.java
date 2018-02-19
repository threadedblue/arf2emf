/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Report Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReportRequests <em>Report Requests</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAssets <em>Assets</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReports <em>Reports</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getExtendedInfos <em>Extended Infos</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType()
 * @model extendedMetaData="name='asset-report-collection_._type' kind='elementOnly'"
 * @generated
 */
public interface AssetReportCollectionType extends RelationshipsContainerType {
	/**
	 * Returns the value of the '<em><b>Report Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains one or more requests for reports. Each report request must be referenced in a relationship on a report in the same asset-report-collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Requests</em>' containment reference.
	 * @see #setReportRequests(ReportRequestsType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_ReportRequests()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report-requests' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportRequestsType getReportRequests();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReportRequests <em>Report Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Requests</em>' containment reference.
	 * @see #getReportRequests()
	 * @generated
	 */
	void setReportRequests(ReportRequestsType value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the representation of one or more assets represented using the Asset Identification format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference.
	 * @see #setAssets(AssetsType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_Assets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assets' namespace='##targetNamespace'"
	 * @generated
	 */
	AssetsType getAssets();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getAssets <em>Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets</em>' containment reference.
	 * @see #getAssets()
	 * @generated
	 */
	void setAssets(AssetsType value);

	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains one or more reports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference.
	 * @see #setReports(ReportsType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_Reports()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reports' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportsType getReports();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getReports <em>Reports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reports</em>' containment reference.
	 * @see #getReports()
	 * @generated
	 */
	void setReports(ReportsType value);

	/**
	 * Returns the value of the '<em><b>Extended Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contain other information elements.  Used as an extension point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Infos</em>' containment reference.
	 * @see #setExtendedInfos(ExtendedInfosType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_ExtendedInfos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extended-infos' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedInfosType getExtendedInfos();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getExtendedInfos <em>Extended Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Infos</em>' containment reference.
	 * @see #getExtendedInfos()
	 * @generated
	 */
	void setExtendedInfos(ExtendedInfosType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id for this collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType#getId <em>Id</em>}' attribute.
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
	 * A placeholder so that content creators can add attributes as desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getAssetReportCollectionType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AssetReportCollectionType
