/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ReportsType#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportsType()
 * @model extendedMetaData="name='reports_._type' kind='elementOnly'"
 * @generated
 */
public interface ReportsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.reporting.format._1.ReportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a report, which is composed of zero or more relationships and a content payload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getReportsType_Report()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReportType> getReport();

} // ReportsType
