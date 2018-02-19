/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType;
import gov.nist.scap.schema.asset.reporting.format._1.AssetType;
import gov.nist.scap.schema.asset.reporting.format._1.AssetsType;
import gov.nist.scap.schema.asset.reporting.format._1.ContentType;
import gov.nist.scap.schema.asset.reporting.format._1.ContentType1;
import gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot;
import gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType;
import gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType;
import gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType;
import gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportsType;
import gov.nist.scap.schema.asset.reporting.format._1._1Factory;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mitre.cpe.naming._2._2Package;

import org.mitre.cpe.naming._2.impl._2PackageImpl;

import org.w3._1999.xlink.XlinkPackage;

import org.w3._1999.xlink.impl.XlinkPackageImpl;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1PackageImpl extends EPackageImpl implements _1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetReportCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedInfosTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportRequestsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl the_1Package_1 = (gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.identification._1._1Package.eINSTANCE);
		gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl the_1Package_2 = (gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) : gov.nist.scap.schema.reporting.core._1._1Package.eINSTANCE);
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);
		oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) instanceof oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) : oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eINSTANCE);

		// Load packages
		the_0Package.loadPackage();

		// Create package meta-data objects
		the_1Package.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_1Package_1.createPackageContents();
		the_1Package_2.createPackageContents();
		the_2Package.createPackageContents();
		the_0Package_1.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_1Package_2.initializePackageContents();
		the_2Package.initializePackageContents();
		the_0Package_1.initializePackageContents();

		// Fix loaded packages
		the_0Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetReportCollectionType() {
		return assetReportCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetReportCollectionType_ReportRequests() {
		return (EReference)assetReportCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetReportCollectionType_Assets() {
		return (EReference)assetReportCollectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetReportCollectionType_Reports() {
		return (EReference)assetReportCollectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetReportCollectionType_ExtendedInfos() {
		return (EReference)assetReportCollectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetReportCollectionType_Id() {
		return (EAttribute)assetReportCollectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetReportCollectionType_AnyAttribute() {
		return (EAttribute)assetReportCollectionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetsType() {
		return assetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetsType_Asset() {
		return (EReference)assetsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetType() {
		return assetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_AssetGroup() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType_Asset() {
		return (EReference)assetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssetType_RemoteResource() {
		return (EReference)assetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_Id() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssetType_AnyAttribute() {
		return (EAttribute)assetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType() {
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Any() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_DataValidEndDate() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_DataValidStartDate() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_AnyAttribute() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType1() {
		return contentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType1_Any() {
		return (EAttribute)contentType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType1_AnyAttribute() {
		return (EAttribute)contentType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AssetReportCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemoteResource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedInfosType() {
		return extendedInfosTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedInfosType_ExtendedInfo() {
		return (EReference)extendedInfosTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedInfoType() {
		return extendedInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedInfoType_Any() {
		return (EAttribute)extendedInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedInfoType_Id() {
		return (EAttribute)extendedInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedInfoType_AnyAttribute() {
		return (EAttribute)extendedInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefType() {
		return objectRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectRefType_RefId() {
		return (EAttribute)objectRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteResourceType() {
		return remoteResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteResourceType_Href() {
		return (EAttribute)remoteResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteResourceType_Type() {
		return (EAttribute)remoteResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteResourceType_AnyAttribute() {
		return (EAttribute)remoteResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportRequestsType() {
		return reportRequestsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportRequestsType_ReportRequest() {
		return (EReference)reportRequestsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportRequestType() {
		return reportRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportRequestType_Content() {
		return (EReference)reportRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportRequestType_RemoteResource() {
		return (EReference)reportRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportRequestType_Id() {
		return (EAttribute)reportRequestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportRequestType_AnyAttribute() {
		return (EAttribute)reportRequestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportsType() {
		return reportsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportsType_Report() {
		return (EReference)reportsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportType() {
		return reportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_Content() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_RemoteResource() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Id() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_AnyAttribute() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assetReportCollectionTypeEClass = createEClass(ASSET_REPORT_COLLECTION_TYPE);
		createEReference(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS);
		createEReference(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__ASSETS);
		createEReference(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__REPORTS);
		createEReference(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS);
		createEAttribute(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__ID);
		createEAttribute(assetReportCollectionTypeEClass, ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE);

		assetsTypeEClass = createEClass(ASSETS_TYPE);
		createEReference(assetsTypeEClass, ASSETS_TYPE__ASSET);

		assetTypeEClass = createEClass(ASSET_TYPE);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ASSET_GROUP);
		createEReference(assetTypeEClass, ASSET_TYPE__ASSET);
		createEReference(assetTypeEClass, ASSET_TYPE__REMOTE_RESOURCE);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ID);
		createEAttribute(assetTypeEClass, ASSET_TYPE__ANY_ATTRIBUTE);

		contentTypeEClass = createEClass(CONTENT_TYPE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__ANY);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__DATA_VALID_END_DATE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__DATA_VALID_START_DATE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__ANY_ATTRIBUTE);

		contentType1EClass = createEClass(CONTENT_TYPE1);
		createEAttribute(contentType1EClass, CONTENT_TYPE1__ANY);
		createEAttribute(contentType1EClass, CONTENT_TYPE1__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSET_REPORT_COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_RESOURCE);

		extendedInfosTypeEClass = createEClass(EXTENDED_INFOS_TYPE);
		createEReference(extendedInfosTypeEClass, EXTENDED_INFOS_TYPE__EXTENDED_INFO);

		extendedInfoTypeEClass = createEClass(EXTENDED_INFO_TYPE);
		createEAttribute(extendedInfoTypeEClass, EXTENDED_INFO_TYPE__ANY);
		createEAttribute(extendedInfoTypeEClass, EXTENDED_INFO_TYPE__ID);
		createEAttribute(extendedInfoTypeEClass, EXTENDED_INFO_TYPE__ANY_ATTRIBUTE);

		objectRefTypeEClass = createEClass(OBJECT_REF_TYPE);
		createEAttribute(objectRefTypeEClass, OBJECT_REF_TYPE__REF_ID);

		remoteResourceTypeEClass = createEClass(REMOTE_RESOURCE_TYPE);
		createEAttribute(remoteResourceTypeEClass, REMOTE_RESOURCE_TYPE__HREF);
		createEAttribute(remoteResourceTypeEClass, REMOTE_RESOURCE_TYPE__TYPE);
		createEAttribute(remoteResourceTypeEClass, REMOTE_RESOURCE_TYPE__ANY_ATTRIBUTE);

		reportRequestsTypeEClass = createEClass(REPORT_REQUESTS_TYPE);
		createEReference(reportRequestsTypeEClass, REPORT_REQUESTS_TYPE__REPORT_REQUEST);

		reportRequestTypeEClass = createEClass(REPORT_REQUEST_TYPE);
		createEReference(reportRequestTypeEClass, REPORT_REQUEST_TYPE__CONTENT);
		createEReference(reportRequestTypeEClass, REPORT_REQUEST_TYPE__REMOTE_RESOURCE);
		createEAttribute(reportRequestTypeEClass, REPORT_REQUEST_TYPE__ID);
		createEAttribute(reportRequestTypeEClass, REPORT_REQUEST_TYPE__ANY_ATTRIBUTE);

		reportsTypeEClass = createEClass(REPORTS_TYPE);
		createEReference(reportsTypeEClass, REPORTS_TYPE__REPORT);

		reportTypeEClass = createEClass(REPORT_TYPE);
		createEReference(reportTypeEClass, REPORT_TYPE__CONTENT);
		createEReference(reportTypeEClass, REPORT_TYPE__REMOTE_RESOURCE);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ID);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ANY_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		gov.nist.scap.schema.reporting.core._1._1Package the_1Package_2 = (gov.nist.scap.schema.reporting.core._1._1Package)EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		gov.nist.scap.schema.asset.identification._1._1Package the_1Package_1 = (gov.nist.scap.schema.asset.identification._1._1Package)EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assetReportCollectionTypeEClass.getESuperTypes().add(the_1Package_2.getRelationshipsContainerType());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetReportCollectionTypeEClass, AssetReportCollectionType.class, "AssetReportCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetReportCollectionType_ReportRequests(), this.getReportRequestsType(), null, "reportRequests", null, 0, 1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetReportCollectionType_Assets(), this.getAssetsType(), null, "assets", null, 0, 1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetReportCollectionType_Reports(), this.getReportsType(), null, "reports", null, 1, 1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetReportCollectionType_ExtendedInfos(), this.getExtendedInfosType(), null, "extendedInfos", null, 0, 1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetReportCollectionType_Id(), theXMLTypePackage.getNCName(), "id", null, 0, 1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetReportCollectionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AssetReportCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetsTypeEClass, AssetsType.class, "AssetsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetsType_Asset(), this.getAssetType(), null, "asset", null, 1, -1, AssetsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetTypeEClass, AssetType.class, "AssetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetType_AssetGroup(), ecorePackage.getEFeatureMapEntry(), "assetGroup", null, 0, 1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetType_Asset(), the_1Package_1.getAssetType1(), null, "asset", null, 0, 1, AssetType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssetType_RemoteResource(), this.getRemoteResourceType(), null, "remoteResource", null, 0, 1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTypeEClass, ContentType.class, "ContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_DataValidEndDate(), theXMLTypePackage.getDate(), "dataValidEndDate", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_DataValidStartDate(), theXMLTypePackage.getDate(), "dataValidStartDate", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentType1EClass, ContentType1.class, "ContentType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ContentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType1_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ContentType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AssetReportCollection(), this.getAssetReportCollectionType(), null, "assetReportCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectRef(), this.getObjectRefType(), null, "objectRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteResource(), this.getRemoteResourceType(), null, "remoteResource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extendedInfosTypeEClass, ExtendedInfosType.class, "ExtendedInfosType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedInfosType_ExtendedInfo(), this.getExtendedInfoType(), null, "extendedInfo", null, 1, -1, ExtendedInfosType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedInfoTypeEClass, ExtendedInfoType.class, "ExtendedInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedInfoType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, ExtendedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedInfoType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, ExtendedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedInfoType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ExtendedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefTypeEClass, ObjectRefType.class, "ObjectRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRefType_RefId(), theXMLTypePackage.getNCName(), "refId", null, 0, 1, ObjectRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteResourceTypeEClass, RemoteResourceType.class, "RemoteResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteResourceType_Href(), theXlinkPackage.getHrefType(), "href", null, 1, 1, RemoteResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteResourceType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 1, 1, RemoteResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteResourceType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RemoteResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportRequestsTypeEClass, ReportRequestsType.class, "ReportRequestsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportRequestsType_ReportRequest(), this.getReportRequestType(), null, "reportRequest", null, 1, -1, ReportRequestsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportRequestTypeEClass, ReportRequestType.class, "ReportRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportRequestType_Content(), this.getContentType1(), null, "content", null, 0, 1, ReportRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportRequestType_RemoteResource(), this.getRemoteResourceType(), null, "remoteResource", null, 0, 1, ReportRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRequestType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, ReportRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportRequestType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReportRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportsTypeEClass, ReportsType.class, "ReportsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportsType_Report(), this.getReportType(), null, "report", null, 1, -1, ReportsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportTypeEClass, ReportType.class, "ReportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportType_Content(), this.getContentType(), null, "content", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportType_RemoteResource(), this.getRemoteResourceType(), null, "remoteResource", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\n            <schema>Asset Reporting Format</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.1</version>\n            <date>2012-02-13</date>\n            <sch:schema xmlns:sch=\"http://purl.oclc.org/dsdl/schematron\" queryBinding=\"xslt2\">\n                <sch:ns prefix=\"xml\" uri=\"http://www.w3.org/XML/1998/namespace\"/>\n                <sch:ns prefix=\"xsd\" uri=\"http://www.w3.org/2001/XMLSchema\"/>\n                <sch:ns prefix=\"arf\" uri=\"http://scap.nist.gov/schema/asset-reporting-format/1.1\"/>\n                <sch:ns prefix=\"core\" uri=\"http://scap.nist.gov/schema/reporting-core/1.1\"/>\n                <sch:ns prefix=\"ai\" uri=\"http://scap.nist.gov/schema/asset-identification/1.1\"/>\n                <sch:ns prefix=\"fn\" uri=\"http://www.w3.org/2005/xpath-functions\"/>\n                <sch:ns prefix=\"xcf\" uri=\"nist:scap:arf:xslt:function\"/>\n                <sch:pattern>\n                    <!-- 2011-11-29 - Correcting defect.  The namespace is updated to match the namespace specified in NIST IR 7694, Section 6.1 -->\n                    <!-- <sch:let name=\"arf-namespace\" value=\"string(\'http://scap.nist.gov/vocabulary/arf/relationships/1.0#\')\"/> -->\n                    <sch:let name=\"arf-namespace\" value=\"string(\'http://scap.nist.gov/specifications/arf/vocabulary/relationships/1.0#\')\"/>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'isAbout\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'retrievedFrom\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'createdBy\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'hasSource\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'recordedBy\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'initiatedBy\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:assets/arf:asset[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'asset\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'createdFor\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:report-requests/arf:report-request[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'report-request\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                    <sch:rule context=\"core:relationship[fn:resolve-QName(@type, current()) eq fn:QName($arf-namespace,\'hasMetadata\' )]\">\n                        <sch:assert test=\"exists(ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq current()/@subject])\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-domain(current(),\'report\')\"/>\n                        </sch:assert>\n                        <sch:assert test=\"every $m in core:ref satisfies current()/ancestor::arf:asset-report-collection/arf:reports/arf:report[@id eq $m]\">\n                            <sch:value-of select=\"xcf:controlled-vocab-error-range(current(),\'report\')\"/>\n                        </sch:assert>\n                    </sch:rule>\n                </sch:pattern>\n                <xsl:function xmlns=\"http://www.w3.org/1999/XSL/Transform\" xmlns:fn=\"http://www.w3.org/2005/xpath-functions\" xmlns:xcf=\"nist:scap:arf:xslt:function\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" name=\"xcf:controlled-vocab-error-domain\">\n                    <xsl:param name=\"node\"/>\n                    <xsl:param name=\"refName\"/>\n                    <xsl:value-of select=\"concat(concat(concat(concat(string(\'All @subject attribute in a relationship of type \'),namespace-uri-from-QName(resolve-QName($node/@type, $node))),local-name-from-QName(resolve-QName($node/@type, $node))),string(\' must reference a \')),$refName)\"/>\n                </xsl:function>\n                <xsl:function xmlns=\"http://www.w3.org/1999/XSL/Transform\" xmlns:fn=\"http://www.w3.org/2005/xpath-functions\" xmlns:xcf=\"nist:scap:arf:xslt:function\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" name=\"xcf:controlled-vocab-error-range\">\n                    <xsl:param name=\"node\"/>\n                    <xsl:param name=\"refName\"/>\n                    <xsl:value-of select=\"concat(concat(concat(concat(string(\'All &lt;ref&gt; elements in a relationship of type \'),namespace-uri-from-QName(resolve-QName($node/@type, $node))),local-name-from-QName(resolve-QName($node/@type, $node))),string(\' must reference a \')),$refName)\"/>\n                </xsl:function>\n            </sch:schema>\n        \n\n            <schema>Asset Identification</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.1</version>\n            <date>2012-02-13</date>\n        \n\n            <schema>Reporting Core</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.0</version>\n            <date>2011-06-02</date>\n        \n\n            <schema>CPE 2.3 Naming</schema>\n            <author>Adam Halbardier</author>\n            <version>2.3</version>\n            <date>2011-07-29</date>\n        "
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (assetReportCollectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asset-report-collection_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_ReportRequests(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report-requests",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_Assets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assets",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_Reports(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reports",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_ExtendedInfos(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extended-infos",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getAssetReportCollectionType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (assetsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "assets_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetsType_Asset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (assetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asset_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssetType_AssetGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "asset:group",
			 "namespace", "http://scap.nist.gov/schema/asset-identification/1.1"
		   });	
		addAnnotation
		  (getAssetType_Asset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset",
			 "namespace", "http://scap.nist.gov/schema/asset-identification/1.1",
			 "group", "http://scap.nist.gov/schema/asset-identification/1.1#asset:group"
		   });	
		addAnnotation
		  (getAssetType_RemoteResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "remote-resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAssetType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getAssetType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (contentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "content_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContentType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getContentType_DataValidEndDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-valid-end-date"
		   });	
		addAnnotation
		  (getContentType_DataValidStartDate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-valid-start-date"
		   });	
		addAnnotation
		  (getContentType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (contentType1EClass, 
		   source, 
		   new String[] {
			 "name", "content_._1_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContentType1_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getContentType1_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "strict"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_AssetReportCollection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asset-report-collection",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ObjectRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object-ref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_RemoteResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "remote-resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (extendedInfosTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extended-infos_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExtendedInfosType_ExtendedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extended-info",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (extendedInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extended-info_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExtendedInfoType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getExtendedInfoType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getExtendedInfoType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });	
		addAnnotation
		  (objectRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "object-ref_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getObjectRefType_RefId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref-id"
		   });	
		addAnnotation
		  (remoteResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "remote-resource_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRemoteResourceType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getRemoteResourceType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getRemoteResourceType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });	
		addAnnotation
		  (reportRequestsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "report-requests_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReportRequestsType_ReportRequest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report-request",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (reportRequestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReportRequestType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReportRequestType_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReportRequestType_RemoteResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "remote-resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReportRequestType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getReportRequestType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (reportsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reports_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReportsType_Report(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (reportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReportType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReportType_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReportType_RemoteResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "remote-resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReportType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getReportType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });
	}

} //_1PackageImpl
