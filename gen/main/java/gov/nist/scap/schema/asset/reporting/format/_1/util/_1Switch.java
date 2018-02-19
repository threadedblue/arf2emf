/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.util;

import gov.nist.scap.schema.asset.reporting.format._1.*;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package
 * @generated
 */
public class _1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Switch() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _1Package.ASSET_REPORT_COLLECTION_TYPE: {
				AssetReportCollectionType assetReportCollectionType = (AssetReportCollectionType)theEObject;
				T result = caseAssetReportCollectionType(assetReportCollectionType);
				if (result == null) result = caseRelationshipsContainerType(assetReportCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ASSETS_TYPE: {
				AssetsType assetsType = (AssetsType)theEObject;
				T result = caseAssetsType(assetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ASSET_TYPE: {
				AssetType assetType = (AssetType)theEObject;
				T result = caseAssetType(assetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONTENT_TYPE: {
				ContentType contentType = (ContentType)theEObject;
				T result = caseContentType(contentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONTENT_TYPE1: {
				ContentType1 contentType1 = (ContentType1)theEObject;
				T result = caseContentType1(contentType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EXTENDED_INFOS_TYPE: {
				ExtendedInfosType extendedInfosType = (ExtendedInfosType)theEObject;
				T result = caseExtendedInfosType(extendedInfosType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EXTENDED_INFO_TYPE: {
				ExtendedInfoType extendedInfoType = (ExtendedInfoType)theEObject;
				T result = caseExtendedInfoType(extendedInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.OBJECT_REF_TYPE: {
				ObjectRefType objectRefType = (ObjectRefType)theEObject;
				T result = caseObjectRefType(objectRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOTE_RESOURCE_TYPE: {
				RemoteResourceType remoteResourceType = (RemoteResourceType)theEObject;
				T result = caseRemoteResourceType(remoteResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPORT_REQUESTS_TYPE: {
				ReportRequestsType reportRequestsType = (ReportRequestsType)theEObject;
				T result = caseReportRequestsType(reportRequestsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPORT_REQUEST_TYPE: {
				ReportRequestType reportRequestType = (ReportRequestType)theEObject;
				T result = caseReportRequestType(reportRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPORTS_TYPE: {
				ReportsType reportsType = (ReportsType)theEObject;
				T result = caseReportsType(reportsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPORT_TYPE: {
				ReportType reportType = (ReportType)theEObject;
				T result = caseReportType(reportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Report Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Report Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetReportCollectionType(AssetReportCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetsType(AssetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetType(AssetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentType(ContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentType1(ContentType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Infos Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Infos Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedInfosType(ExtendedInfosType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedInfoType(ExtendedInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectRefType(ObjectRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteResourceType(RemoteResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Requests Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Requests Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportRequestsType(ReportRequestsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportRequestType(ReportRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportsType(ReportsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportType(ReportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationships Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationships Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipsContainerType(RelationshipsContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_1Switch
