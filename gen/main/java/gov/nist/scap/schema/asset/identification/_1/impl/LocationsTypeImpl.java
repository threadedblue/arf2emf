/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.LocationsType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.LocationsTypeImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationsTypeImpl extends MinimalEObjectImpl.Container implements LocationsType {
	/**
	 * The cached value of the '{@link #getLocationGroup() <em>Location Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.LOCATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationGroup() {
		if (locationGroup == null) {
			locationGroup = new BasicFeatureMap(this, _1Package.LOCATIONS_TYPE__LOCATION_GROUP);
		}
		return locationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocation() {
		return getLocationGroup().list(_1Package.Literals.LOCATIONS_TYPE__LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.LOCATIONS_TYPE__LOCATION_GROUP:
				return ((InternalEList<?>)getLocationGroup()).basicRemove(otherEnd, msgs);
			case _1Package.LOCATIONS_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case _1Package.LOCATIONS_TYPE__LOCATION_GROUP:
				if (coreType) return getLocationGroup();
				return ((FeatureMap.Internal)getLocationGroup()).getWrapper();
			case _1Package.LOCATIONS_TYPE__LOCATION:
				return getLocation();
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
			case _1Package.LOCATIONS_TYPE__LOCATION_GROUP:
				((FeatureMap.Internal)getLocationGroup()).set(newValue);
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
			case _1Package.LOCATIONS_TYPE__LOCATION_GROUP:
				getLocationGroup().clear();
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
			case _1Package.LOCATIONS_TYPE__LOCATION_GROUP:
				return locationGroup != null && !locationGroup.isEmpty();
			case _1Package.LOCATIONS_TYPE__LOCATION:
				return !getLocation().isEmpty();
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
		result.append(" (locationGroup: ");
		result.append(locationGroup);
		result.append(')');
		return result.toString();
	}

} //LocationsTypeImpl
