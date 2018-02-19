/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.SystemNameType;
import gov.nist.scap.schema.asset.identification._1.SystemType;
import gov.nist.scap.schema.asset.identification._1.VersionType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.SystemTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemTypeImpl extends ItAssetTypeImpl implements SystemType {
	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemNameType> systemName;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionType version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.SYSTEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemNameType> getSystemName() {
		if (systemName == null) {
			systemName = new EObjectContainmentEList<SystemNameType>(SystemNameType.class, this, _1Package.SYSTEM_TYPE__SYSTEM_NAME);
		}
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(VersionType newVersion, NotificationChain msgs) {
		VersionType oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SYSTEM_TYPE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(VersionType newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SYSTEM_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SYSTEM_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SYSTEM_TYPE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.SYSTEM_TYPE__SYSTEM_NAME:
				return ((InternalEList<?>)getSystemName()).basicRemove(otherEnd, msgs);
			case _1Package.SYSTEM_TYPE__VERSION:
				return basicSetVersion(null, msgs);
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
			case _1Package.SYSTEM_TYPE__SYSTEM_NAME:
				return getSystemName();
			case _1Package.SYSTEM_TYPE__VERSION:
				return getVersion();
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
			case _1Package.SYSTEM_TYPE__SYSTEM_NAME:
				getSystemName().clear();
				getSystemName().addAll((Collection<? extends SystemNameType>)newValue);
				return;
			case _1Package.SYSTEM_TYPE__VERSION:
				setVersion((VersionType)newValue);
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
			case _1Package.SYSTEM_TYPE__SYSTEM_NAME:
				getSystemName().clear();
				return;
			case _1Package.SYSTEM_TYPE__VERSION:
				setVersion((VersionType)null);
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
			case _1Package.SYSTEM_TYPE__SYSTEM_NAME:
				return systemName != null && !systemName.isEmpty();
			case _1Package.SYSTEM_TYPE__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemTypeImpl
