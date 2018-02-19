/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.ComputingDeviceType;
import gov.nist.scap.schema.asset.identification._1.ConnectionsType;
import gov.nist.scap.schema.asset.identification._1.CpeType1;
import gov.nist.scap.schema.asset.identification._1.DistinguishedNameType;
import gov.nist.scap.schema.asset.identification._1.FqdnType;
import gov.nist.scap.schema.asset.identification._1.HostnameType1;
import gov.nist.scap.schema.asset.identification._1.MotherboardGuidType;
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
 * An implementation of the model object '<em><b>Computing Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getDistinguishedName <em>Distinguished Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getCpe <em>Cpe</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ComputingDeviceTypeImpl#getMotherboardGuid <em>Motherboard Guid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingDeviceTypeImpl extends ItAssetTypeImpl implements ComputingDeviceType {
	/**
	 * The cached value of the '{@link #getDistinguishedName() <em>Distinguished Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinguishedName()
	 * @generated
	 * @ordered
	 */
	protected DistinguishedNameType distinguishedName;

	/**
	 * The cached value of the '{@link #getCpe() <em>Cpe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpe()
	 * @generated
	 * @ordered
	 */
	protected EList<CpeType1> cpe;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected ConnectionsType connections;

	/**
	 * The cached value of the '{@link #getFqdn() <em>Fqdn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqdn()
	 * @generated
	 * @ordered
	 */
	protected FqdnType fqdn;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected HostnameType1 hostname;

	/**
	 * The cached value of the '{@link #getMotherboardGuid() <em>Motherboard Guid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotherboardGuid()
	 * @generated
	 * @ordered
	 */
	protected MotherboardGuidType motherboardGuid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.COMPUTING_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinguishedNameType getDistinguishedName() {
		return distinguishedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistinguishedName(DistinguishedNameType newDistinguishedName, NotificationChain msgs) {
		DistinguishedNameType oldDistinguishedName = distinguishedName;
		distinguishedName = newDistinguishedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME, oldDistinguishedName, newDistinguishedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinguishedName(DistinguishedNameType newDistinguishedName) {
		if (newDistinguishedName != distinguishedName) {
			NotificationChain msgs = null;
			if (distinguishedName != null)
				msgs = ((InternalEObject)distinguishedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME, null, msgs);
			if (newDistinguishedName != null)
				msgs = ((InternalEObject)newDistinguishedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME, null, msgs);
			msgs = basicSetDistinguishedName(newDistinguishedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME, newDistinguishedName, newDistinguishedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CpeType1> getCpe() {
		if (cpe == null) {
			cpe = new EObjectContainmentEList<CpeType1>(CpeType1.class, this, _1Package.COMPUTING_DEVICE_TYPE__CPE);
		}
		return cpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionsType getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(ConnectionsType newConnections, NotificationChain msgs) {
		ConnectionsType oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS, oldConnections, newConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(ConnectionsType newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject)connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject)newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS, newConnections, newConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FqdnType getFqdn() {
		return fqdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFqdn(FqdnType newFqdn, NotificationChain msgs) {
		FqdnType oldFqdn = fqdn;
		fqdn = newFqdn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__FQDN, oldFqdn, newFqdn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqdn(FqdnType newFqdn) {
		if (newFqdn != fqdn) {
			NotificationChain msgs = null;
			if (fqdn != null)
				msgs = ((InternalEObject)fqdn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__FQDN, null, msgs);
			if (newFqdn != null)
				msgs = ((InternalEObject)newFqdn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__FQDN, null, msgs);
			msgs = basicSetFqdn(newFqdn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__FQDN, newFqdn, newFqdn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostnameType1 getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostname(HostnameType1 newHostname, NotificationChain msgs) {
		HostnameType1 oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME, oldHostname, newHostname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(HostnameType1 newHostname) {
		if (newHostname != hostname) {
			NotificationChain msgs = null;
			if (hostname != null)
				msgs = ((InternalEObject)hostname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME, null, msgs);
			if (newHostname != null)
				msgs = ((InternalEObject)newHostname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME, null, msgs);
			msgs = basicSetHostname(newHostname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME, newHostname, newHostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotherboardGuidType getMotherboardGuid() {
		return motherboardGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotherboardGuid(MotherboardGuidType newMotherboardGuid, NotificationChain msgs) {
		MotherboardGuidType oldMotherboardGuid = motherboardGuid;
		motherboardGuid = newMotherboardGuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID, oldMotherboardGuid, newMotherboardGuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotherboardGuid(MotherboardGuidType newMotherboardGuid) {
		if (newMotherboardGuid != motherboardGuid) {
			NotificationChain msgs = null;
			if (motherboardGuid != null)
				msgs = ((InternalEObject)motherboardGuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID, null, msgs);
			if (newMotherboardGuid != null)
				msgs = ((InternalEObject)newMotherboardGuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID, null, msgs);
			msgs = basicSetMotherboardGuid(newMotherboardGuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID, newMotherboardGuid, newMotherboardGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME:
				return basicSetDistinguishedName(null, msgs);
			case _1Package.COMPUTING_DEVICE_TYPE__CPE:
				return ((InternalEList<?>)getCpe()).basicRemove(otherEnd, msgs);
			case _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS:
				return basicSetConnections(null, msgs);
			case _1Package.COMPUTING_DEVICE_TYPE__FQDN:
				return basicSetFqdn(null, msgs);
			case _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME:
				return basicSetHostname(null, msgs);
			case _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID:
				return basicSetMotherboardGuid(null, msgs);
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
			case _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME:
				return getDistinguishedName();
			case _1Package.COMPUTING_DEVICE_TYPE__CPE:
				return getCpe();
			case _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS:
				return getConnections();
			case _1Package.COMPUTING_DEVICE_TYPE__FQDN:
				return getFqdn();
			case _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME:
				return getHostname();
			case _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID:
				return getMotherboardGuid();
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
			case _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME:
				setDistinguishedName((DistinguishedNameType)newValue);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__CPE:
				getCpe().clear();
				getCpe().addAll((Collection<? extends CpeType1>)newValue);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS:
				setConnections((ConnectionsType)newValue);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__FQDN:
				setFqdn((FqdnType)newValue);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME:
				setHostname((HostnameType1)newValue);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID:
				setMotherboardGuid((MotherboardGuidType)newValue);
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
			case _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME:
				setDistinguishedName((DistinguishedNameType)null);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__CPE:
				getCpe().clear();
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS:
				setConnections((ConnectionsType)null);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__FQDN:
				setFqdn((FqdnType)null);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME:
				setHostname((HostnameType1)null);
				return;
			case _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID:
				setMotherboardGuid((MotherboardGuidType)null);
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
			case _1Package.COMPUTING_DEVICE_TYPE__DISTINGUISHED_NAME:
				return distinguishedName != null;
			case _1Package.COMPUTING_DEVICE_TYPE__CPE:
				return cpe != null && !cpe.isEmpty();
			case _1Package.COMPUTING_DEVICE_TYPE__CONNECTIONS:
				return connections != null;
			case _1Package.COMPUTING_DEVICE_TYPE__FQDN:
				return fqdn != null;
			case _1Package.COMPUTING_DEVICE_TYPE__HOSTNAME:
				return hostname != null;
			case _1Package.COMPUTING_DEVICE_TYPE__MOTHERBOARD_GUID:
				return motherboardGuid != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputingDeviceTypeImpl
