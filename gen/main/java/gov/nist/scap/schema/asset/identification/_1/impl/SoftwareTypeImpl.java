/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.CpeType1;
import gov.nist.scap.schema.asset.identification._1.InstallationIdType;
import gov.nist.scap.schema.asset.identification._1.LicenseType;
import gov.nist.scap.schema.asset.identification._1.SoftwareType;
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
 * An implementation of the model object '<em><b>Software Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl#getInstallationId <em>Installation Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.SoftwareTypeImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareTypeImpl extends ItAssetTypeImpl implements SoftwareType {
	/**
	 * The cached value of the '{@link #getInstallationId() <em>Installation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationId()
	 * @generated
	 * @ordered
	 */
	protected InstallationIdType installationId;

	/**
	 * The cached value of the '{@link #getCpe() <em>Cpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpe()
	 * @generated
	 * @ordered
	 */
	protected CpeType1 cpe;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected EList<LicenseType> license;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.SOFTWARE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstallationIdType getInstallationId() {
		return installationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstallationId(InstallationIdType newInstallationId, NotificationChain msgs) {
		InstallationIdType oldInstallationId = installationId;
		installationId = newInstallationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SOFTWARE_TYPE__INSTALLATION_ID, oldInstallationId, newInstallationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationId(InstallationIdType newInstallationId) {
		if (newInstallationId != installationId) {
			NotificationChain msgs = null;
			if (installationId != null)
				msgs = ((InternalEObject)installationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SOFTWARE_TYPE__INSTALLATION_ID, null, msgs);
			if (newInstallationId != null)
				msgs = ((InternalEObject)newInstallationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SOFTWARE_TYPE__INSTALLATION_ID, null, msgs);
			msgs = basicSetInstallationId(newInstallationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SOFTWARE_TYPE__INSTALLATION_ID, newInstallationId, newInstallationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpeType1 getCpe() {
		return cpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpe(CpeType1 newCpe, NotificationChain msgs) {
		CpeType1 oldCpe = cpe;
		cpe = newCpe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SOFTWARE_TYPE__CPE, oldCpe, newCpe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpe(CpeType1 newCpe) {
		if (newCpe != cpe) {
			NotificationChain msgs = null;
			if (cpe != null)
				msgs = ((InternalEObject)cpe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SOFTWARE_TYPE__CPE, null, msgs);
			if (newCpe != null)
				msgs = ((InternalEObject)newCpe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SOFTWARE_TYPE__CPE, null, msgs);
			msgs = basicSetCpe(newCpe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SOFTWARE_TYPE__CPE, newCpe, newCpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LicenseType> getLicense() {
		if (license == null) {
			license = new EObjectContainmentEList<LicenseType>(LicenseType.class, this, _1Package.SOFTWARE_TYPE__LICENSE);
		}
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.SOFTWARE_TYPE__INSTALLATION_ID:
				return basicSetInstallationId(null, msgs);
			case _1Package.SOFTWARE_TYPE__CPE:
				return basicSetCpe(null, msgs);
			case _1Package.SOFTWARE_TYPE__LICENSE:
				return ((InternalEList<?>)getLicense()).basicRemove(otherEnd, msgs);
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
			case _1Package.SOFTWARE_TYPE__INSTALLATION_ID:
				return getInstallationId();
			case _1Package.SOFTWARE_TYPE__CPE:
				return getCpe();
			case _1Package.SOFTWARE_TYPE__LICENSE:
				return getLicense();
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
			case _1Package.SOFTWARE_TYPE__INSTALLATION_ID:
				setInstallationId((InstallationIdType)newValue);
				return;
			case _1Package.SOFTWARE_TYPE__CPE:
				setCpe((CpeType1)newValue);
				return;
			case _1Package.SOFTWARE_TYPE__LICENSE:
				getLicense().clear();
				getLicense().addAll((Collection<? extends LicenseType>)newValue);
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
			case _1Package.SOFTWARE_TYPE__INSTALLATION_ID:
				setInstallationId((InstallationIdType)null);
				return;
			case _1Package.SOFTWARE_TYPE__CPE:
				setCpe((CpeType1)null);
				return;
			case _1Package.SOFTWARE_TYPE__LICENSE:
				getLicense().clear();
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
			case _1Package.SOFTWARE_TYPE__INSTALLATION_ID:
				return installationId != null;
			case _1Package.SOFTWARE_TYPE__CPE:
				return cpe != null;
			case _1Package.SOFTWARE_TYPE__LICENSE:
				return license != null && !license.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareTypeImpl
