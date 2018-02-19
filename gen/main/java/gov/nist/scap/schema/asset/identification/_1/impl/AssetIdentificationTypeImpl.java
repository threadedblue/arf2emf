/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.AssetIdentificationType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.AssetIdentificationTypeImpl#getAssetRef <em>Asset Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetIdentificationTypeImpl extends AssetsTypeImpl implements AssetIdentificationType {
	/**
	 * The default value of the '{@link #getAssetRef() <em>Asset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetRef() <em>Asset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRef()
	 * @generated
	 * @ordered
	 */
	protected String assetRef = ASSET_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.ASSET_IDENTIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetRef() {
		return assetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetRef(String newAssetRef) {
		String oldAssetRef = assetRef;
		assetRef = newAssetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_IDENTIFICATION_TYPE__ASSET_REF, oldAssetRef, assetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.ASSET_IDENTIFICATION_TYPE__ASSET_REF:
				return getAssetRef();
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
			case _1Package.ASSET_IDENTIFICATION_TYPE__ASSET_REF:
				setAssetRef((String)newValue);
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
			case _1Package.ASSET_IDENTIFICATION_TYPE__ASSET_REF:
				setAssetRef(ASSET_REF_EDEFAULT);
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
			case _1Package.ASSET_IDENTIFICATION_TYPE__ASSET_REF:
				return ASSET_REF_EDEFAULT == null ? assetRef != null : !ASSET_REF_EDEFAULT.equals(assetRef);
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
		result.append(" (assetRef: ");
		result.append(assetRef);
		result.append(')');
		return result.toString();
	}

} //AssetIdentificationTypeImpl
