/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.util;

import gov.nist.scap.schema.asset.reporting.format._1.*;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package
 * @generated
 */
public class _1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _1Switch<Adapter> modelSwitch =
		new _1Switch<Adapter>() {
			@Override
			public Adapter caseAssetReportCollectionType(AssetReportCollectionType object) {
				return createAssetReportCollectionTypeAdapter();
			}
			@Override
			public Adapter caseAssetsType(AssetsType object) {
				return createAssetsTypeAdapter();
			}
			@Override
			public Adapter caseAssetType(AssetType object) {
				return createAssetTypeAdapter();
			}
			@Override
			public Adapter caseContentType(ContentType object) {
				return createContentTypeAdapter();
			}
			@Override
			public Adapter caseContentType1(ContentType1 object) {
				return createContentType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtendedInfosType(ExtendedInfosType object) {
				return createExtendedInfosTypeAdapter();
			}
			@Override
			public Adapter caseExtendedInfoType(ExtendedInfoType object) {
				return createExtendedInfoTypeAdapter();
			}
			@Override
			public Adapter caseObjectRefType(ObjectRefType object) {
				return createObjectRefTypeAdapter();
			}
			@Override
			public Adapter caseRemoteResourceType(RemoteResourceType object) {
				return createRemoteResourceTypeAdapter();
			}
			@Override
			public Adapter caseReportRequestsType(ReportRequestsType object) {
				return createReportRequestsTypeAdapter();
			}
			@Override
			public Adapter caseReportRequestType(ReportRequestType object) {
				return createReportRequestTypeAdapter();
			}
			@Override
			public Adapter caseReportsType(ReportsType object) {
				return createReportsTypeAdapter();
			}
			@Override
			public Adapter caseReportType(ReportType object) {
				return createReportTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipsContainerType(RelationshipsContainerType object) {
				return createRelationshipsContainerTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType <em>Asset Report Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType
	 * @generated
	 */
	public Adapter createAssetReportCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetsType <em>Assets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetsType
	 * @generated
	 */
	public Adapter createAssetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.AssetType
	 * @generated
	 */
	public Adapter createAssetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType
	 * @generated
	 */
	public Adapter createContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType1 <em>Content Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ContentType1
	 * @generated
	 */
	public Adapter createContentType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType <em>Extended Infos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType
	 * @generated
	 */
	public Adapter createExtendedInfosTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType <em>Extended Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType
	 * @generated
	 */
	public Adapter createExtendedInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType <em>Object Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType
	 * @generated
	 */
	public Adapter createObjectRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType <em>Remote Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType
	 * @generated
	 */
	public Adapter createRemoteResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType <em>Report Requests Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType
	 * @generated
	 */
	public Adapter createReportRequestsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType <em>Report Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType
	 * @generated
	 */
	public Adapter createReportRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportsType <em>Reports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportsType
	 * @generated
	 */
	public Adapter createReportsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.asset.reporting.format._1.ReportType <em>Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.asset.reporting.format._1.ReportType
	 * @generated
	 */
	public Adapter createReportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType <em>Relationships Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType
	 * @generated
	 */
	public Adapter createRelationshipsContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_1AdapterFactory
