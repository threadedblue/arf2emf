/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.identification._1.AssetType1;

import gov.nist.scap.schema.asset.reporting.format._1.AssetType;
import gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl#getAssetGroup <em>Asset Group</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl#getRemoteResource <em>Remote Resource</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetTypeImpl extends MinimalEObjectImpl.Container implements AssetType {
	/**
	 * The cached value of the '{@link #getAssetGroup() <em>Asset Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap assetGroup;

	/**
	 * The cached value of the '{@link #getRemoteResource() <em>Remote Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteResource()
	 * @generated
	 * @ordered
	 */
	protected RemoteResourceType remoteResource;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.ASSET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAssetGroup() {
		if (assetGroup == null) {
			assetGroup = new BasicFeatureMap(this, _1Package.ASSET_TYPE__ASSET_GROUP);
		}
		return assetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType1 getAsset() {
		return (AssetType1)getAssetGroup().get(_1Package.Literals.ASSET_TYPE__ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(AssetType1 newAsset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAssetGroup()).basicAdd(_1Package.Literals.ASSET_TYPE__ASSET, newAsset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteResourceType getRemoteResource() {
		return remoteResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteResource(RemoteResourceType newRemoteResource, NotificationChain msgs) {
		RemoteResourceType oldRemoteResource = remoteResource;
		remoteResource = newRemoteResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE__REMOTE_RESOURCE, oldRemoteResource, newRemoteResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteResource(RemoteResourceType newRemoteResource) {
		if (newRemoteResource != remoteResource) {
			NotificationChain msgs = null;
			if (remoteResource != null)
				msgs = ((InternalEObject)remoteResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE__REMOTE_RESOURCE, null, msgs);
			if (newRemoteResource != null)
				msgs = ((InternalEObject)newRemoteResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE__REMOTE_RESOURCE, null, msgs);
			msgs = basicSetRemoteResource(newRemoteResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE__REMOTE_RESOURCE, newRemoteResource, newRemoteResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _1Package.ASSET_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ASSET_TYPE__ASSET_GROUP:
				return ((InternalEList<?>)getAssetGroup()).basicRemove(otherEnd, msgs);
			case _1Package.ASSET_TYPE__ASSET:
				return basicSetAsset(null, msgs);
			case _1Package.ASSET_TYPE__REMOTE_RESOURCE:
				return basicSetRemoteResource(null, msgs);
			case _1Package.ASSET_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _1Package.ASSET_TYPE__ASSET_GROUP:
				if (coreType) return getAssetGroup();
				return ((FeatureMap.Internal)getAssetGroup()).getWrapper();
			case _1Package.ASSET_TYPE__ASSET:
				return getAsset();
			case _1Package.ASSET_TYPE__REMOTE_RESOURCE:
				return getRemoteResource();
			case _1Package.ASSET_TYPE__ID:
				return getId();
			case _1Package.ASSET_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _1Package.ASSET_TYPE__ASSET_GROUP:
				((FeatureMap.Internal)getAssetGroup()).set(newValue);
				return;
			case _1Package.ASSET_TYPE__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)newValue);
				return;
			case _1Package.ASSET_TYPE__ID:
				setId((String)newValue);
				return;
			case _1Package.ASSET_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _1Package.ASSET_TYPE__ASSET_GROUP:
				getAssetGroup().clear();
				return;
			case _1Package.ASSET_TYPE__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)null);
				return;
			case _1Package.ASSET_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _1Package.ASSET_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _1Package.ASSET_TYPE__ASSET_GROUP:
				return assetGroup != null && !assetGroup.isEmpty();
			case _1Package.ASSET_TYPE__ASSET:
				return getAsset() != null;
			case _1Package.ASSET_TYPE__REMOTE_RESOURCE:
				return remoteResource != null;
			case _1Package.ASSET_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _1Package.ASSET_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (assetGroup: ");
		result.append(assetGroup);
		result.append(", id: ");
		result.append(id);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AssetTypeImpl
