/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType;
import gov.nist.scap.schema.asset.reporting.format._1.DocumentRoot;
import gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType;
import gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getAssetReportCollection <em>Asset Report Collection</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getObjectRef <em>Object Ref</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.DocumentRootImpl#getRemoteResource <em>Remote Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _1Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetReportCollectionType getAssetReportCollection() {
		return (AssetReportCollectionType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetReportCollection(AssetReportCollectionType newAssetReportCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION, newAssetReportCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetReportCollection(AssetReportCollectionType newAssetReportCollection) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION, newAssetReportCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefType getObjectRef() {
		return (ObjectRefType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__OBJECT_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRef(ObjectRefType newObjectRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__OBJECT_REF, newObjectRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRef(ObjectRefType newObjectRef) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__OBJECT_REF, newObjectRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteResourceType getRemoteResource() {
		return (RemoteResourceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__REMOTE_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteResource(RemoteResourceType newRemoteResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__REMOTE_RESOURCE, newRemoteResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteResource(RemoteResourceType newRemoteResource) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__REMOTE_RESOURCE, newRemoteResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION:
				return basicSetAssetReportCollection(null, msgs);
			case _1Package.DOCUMENT_ROOT__OBJECT_REF:
				return basicSetObjectRef(null, msgs);
			case _1Package.DOCUMENT_ROOT__REMOTE_RESOURCE:
				return basicSetRemoteResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _1Package.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION:
				return getAssetReportCollection();
			case _1Package.DOCUMENT_ROOT__OBJECT_REF:
				return getObjectRef();
			case _1Package.DOCUMENT_ROOT__REMOTE_RESOURCE:
				return getRemoteResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION:
				setAssetReportCollection((AssetReportCollectionType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__OBJECT_REF:
				setObjectRef((ObjectRefType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _1Package.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION:
				setAssetReportCollection((AssetReportCollectionType)null);
				return;
			case _1Package.DOCUMENT_ROOT__OBJECT_REF:
				setObjectRef((ObjectRefType)null);
				return;
			case _1Package.DOCUMENT_ROOT__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _1Package.DOCUMENT_ROOT__ASSET_REPORT_COLLECTION:
				return getAssetReportCollection() != null;
			case _1Package.DOCUMENT_ROOT__OBJECT_REF:
				return getObjectRef() != null;
			case _1Package.DOCUMENT_ROOT__REMOTE_RESOURCE:
				return getRemoteResource() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
