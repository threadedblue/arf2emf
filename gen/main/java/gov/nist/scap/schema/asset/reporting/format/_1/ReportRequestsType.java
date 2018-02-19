/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Requests Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType#getReportRequest <em>Report Request</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportRequestsType()
 * @model extendedMetaData="name='report-requests_._type' kind='elementOnly'"
 * @generated
 */
public interface ReportRequestsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Report Request</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Request</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportRequestsType_ReportRequest()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='report-request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReportRequestType> getReportRequest();

} // ReportRequestsType
