/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getContent <em>Content</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getRemoteResource <em>Remote Resource</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportType()
 * @model extendedMetaData="name='ReportType' kind='elementOnly'"
 * @generated
 */
public interface ReportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the content of the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ContentType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportType_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentType getContent();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ContentType value);

	/**
	 * Returns the value of the '<em><b>Remote Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to content stored external to this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Resource</em>' containment reference.
	 * @see #setRemoteResource(RemoteResourceType)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportType_RemoteResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remote-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteResourceType getRemoteResource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getRemoteResource <em>Remote Resource</em>}' containment reference.
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
	 * An internal ID to identify this report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType#getId <em>Id</em>}' attribute.
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
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ReportType
