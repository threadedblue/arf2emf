/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.AssetType1;
import gov.nist.scap.schema.asset.identification._1.ExtendedInformationType;
import gov.nist.scap.schema.asset.identification._1.LocationsType;
import gov.nist.scap.schema.asset.identification._1.SyntheticIdType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl#getSyntheticId <em>Synthetic Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl#getLocations <em>Locations</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl#getExtendedInformation <em>Extended Information</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.AssetType1Impl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetType1Impl extends MinimalEObjectImpl.Container implements AssetType1 {
	/**
	 * The cached value of the '{@link #getSyntheticId() <em>Synthetic Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticId()
	 * @generated
	 * @ordered
	 */
	protected EList<SyntheticIdType> syntheticId;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected LocationsType locations;

	/**
	 * The cached value of the '{@link #getExtendedInformation() <em>Extended Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInformation()
	 * @generated
	 * @ordered
	 */
	protected ExtendedInformationType extendedInformation;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.ASSET_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SyntheticIdType> getSyntheticId() {
		if (syntheticId == null) {
			syntheticId = new EObjectContainmentEList<SyntheticIdType>(SyntheticIdType.class, this, _1Package.ASSET_TYPE1__SYNTHETIC_ID);
		}
		return syntheticId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType newLocations, NotificationChain msgs) {
		LocationsType oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE1__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE1__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE1__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE1__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedInformationType getExtendedInformation() {
		return extendedInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedInformation(ExtendedInformationType newExtendedInformation, NotificationChain msgs) {
		ExtendedInformationType oldExtendedInformation = extendedInformation;
		extendedInformation = newExtendedInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE1__EXTENDED_INFORMATION, oldExtendedInformation, newExtendedInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedInformation(ExtendedInformationType newExtendedInformation) {
		if (newExtendedInformation != extendedInformation) {
			NotificationChain msgs = null;
			if (extendedInformation != null)
				msgs = ((InternalEObject)extendedInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE1__EXTENDED_INFORMATION, null, msgs);
			if (newExtendedInformation != null)
				msgs = ((InternalEObject)newExtendedInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_TYPE1__EXTENDED_INFORMATION, null, msgs);
			msgs = basicSetExtendedInformation(newExtendedInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE1__EXTENDED_INFORMATION, newExtendedInformation, newExtendedInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_TYPE1__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ASSET_TYPE1__SYNTHETIC_ID:
				return ((InternalEList<?>)getSyntheticId()).basicRemove(otherEnd, msgs);
			case _1Package.ASSET_TYPE1__LOCATIONS:
				return basicSetLocations(null, msgs);
			case _1Package.ASSET_TYPE1__EXTENDED_INFORMATION:
				return basicSetExtendedInformation(null, msgs);
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
			case _1Package.ASSET_TYPE1__SYNTHETIC_ID:
				return getSyntheticId();
			case _1Package.ASSET_TYPE1__LOCATIONS:
				return getLocations();
			case _1Package.ASSET_TYPE1__EXTENDED_INFORMATION:
				return getExtendedInformation();
			case _1Package.ASSET_TYPE1__TIMESTAMP:
				return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.ASSET_TYPE1__SYNTHETIC_ID:
				getSyntheticId().clear();
				getSyntheticId().addAll((Collection<? extends SyntheticIdType>)newValue);
				return;
			case _1Package.ASSET_TYPE1__LOCATIONS:
				setLocations((LocationsType)newValue);
				return;
			case _1Package.ASSET_TYPE1__EXTENDED_INFORMATION:
				setExtendedInformation((ExtendedInformationType)newValue);
				return;
			case _1Package.ASSET_TYPE1__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
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
			case _1Package.ASSET_TYPE1__SYNTHETIC_ID:
				getSyntheticId().clear();
				return;
			case _1Package.ASSET_TYPE1__LOCATIONS:
				setLocations((LocationsType)null);
				return;
			case _1Package.ASSET_TYPE1__EXTENDED_INFORMATION:
				setExtendedInformation((ExtendedInformationType)null);
				return;
			case _1Package.ASSET_TYPE1__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case _1Package.ASSET_TYPE1__SYNTHETIC_ID:
				return syntheticId != null && !syntheticId.isEmpty();
			case _1Package.ASSET_TYPE1__LOCATIONS:
				return locations != null;
			case _1Package.ASSET_TYPE1__EXTENDED_INFORMATION:
				return extendedInformation != null;
			case _1Package.ASSET_TYPE1__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //AssetType1Impl
