/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1FactoryImpl extends EFactoryImpl implements _1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _1Factory init() {
		try {
			_1Factory the_1Factory = (_1Factory)EPackage.Registry.INSTANCE.getEFactory(_1Package.eNS_URI);
			if (the_1Factory != null) {
				return the_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _1Package.ASSET_REPORT_COLLECTION_TYPE: return createAssetReportCollectionType();
			case _1Package.ASSETS_TYPE: return createAssetsType();
			case _1Package.ASSET_TYPE: return createAssetType();
			case _1Package.CONTENT_TYPE: return createContentType();
			case _1Package.CONTENT_TYPE1: return createContentType1();
			case _1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _1Package.EXTENDED_INFOS_TYPE: return createExtendedInfosType();
			case _1Package.EXTENDED_INFO_TYPE: return createExtendedInfoType();
			case _1Package.OBJECT_REF_TYPE: return createObjectRefType();
			case _1Package.REMOTE_RESOURCE_TYPE: return createRemoteResourceType();
			case _1Package.REPORT_REQUESTS_TYPE: return createReportRequestsType();
			case _1Package.REPORT_REQUEST_TYPE: return createReportRequestType();
			case _1Package.REPORTS_TYPE: return createReportsType();
			case _1Package.REPORT_TYPE: return createReportType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetReportCollectionType createAssetReportCollectionType() {
		AssetReportCollectionTypeImpl assetReportCollectionType = new AssetReportCollectionTypeImpl();
		return assetReportCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsType createAssetsType() {
		AssetsTypeImpl assetsType = new AssetsTypeImpl();
		return assetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType createAssetType() {
		AssetTypeImpl assetType = new AssetTypeImpl();
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType1 createContentType1() {
		ContentType1Impl contentType1 = new ContentType1Impl();
		return contentType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedInfosType createExtendedInfosType() {
		ExtendedInfosTypeImpl extendedInfosType = new ExtendedInfosTypeImpl();
		return extendedInfosType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedInfoType createExtendedInfoType() {
		ExtendedInfoTypeImpl extendedInfoType = new ExtendedInfoTypeImpl();
		return extendedInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType createObjectRefType() {
		ObjectRefTypeImpl objectRefType = new ObjectRefTypeImpl();
		return objectRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteResourceType createRemoteResourceType() {
		RemoteResourceTypeImpl remoteResourceType = new RemoteResourceTypeImpl();
		return remoteResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRequestsType createReportRequestsType() {
		ReportRequestsTypeImpl reportRequestsType = new ReportRequestsTypeImpl();
		return reportRequestsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRequestType createReportRequestType() {
		ReportRequestTypeImpl reportRequestType = new ReportRequestTypeImpl();
		return reportRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportsType createReportsType() {
		ReportsTypeImpl reportsType = new ReportsTypeImpl();
		return reportsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportType createReportType() {
		ReportTypeImpl reportType = new ReportTypeImpl();
		return reportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Package get_1Package() {
		return (_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _1Package getPackage() {
		return _1Package.eINSTANCE;
	}

} //_1FactoryImpl
