/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.CidrType1;
import gov.nist.scap.schema.asset.identification._1.IpNetRangeType;
import gov.nist.scap.schema.asset.identification._1.NetworkNameType;
import gov.nist.scap.schema.asset.identification._1.NetworkType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl#getIpNetRange <em>Ip Net Range</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkTypeImpl#getCidr <em>Cidr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkTypeImpl extends ItAssetTypeImpl implements NetworkType {
	/**
	 * The cached value of the '{@link #getNetworkName() <em>Network Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected NetworkNameType networkName;

	/**
	 * The cached value of the '{@link #getIpNetRange() <em>Ip Net Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpNetRange()
	 * @generated
	 * @ordered
	 */
	protected IpNetRangeType ipNetRange;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected CidrType1 cidr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NETWORK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNameType getNetworkName() {
		return networkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkName(NetworkNameType newNetworkName, NotificationChain msgs) {
		NetworkNameType oldNetworkName = networkName;
		networkName = newNetworkName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__NETWORK_NAME, oldNetworkName, newNetworkName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkName(NetworkNameType newNetworkName) {
		if (newNetworkName != networkName) {
			NotificationChain msgs = null;
			if (networkName != null)
				msgs = ((InternalEObject)networkName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__NETWORK_NAME, null, msgs);
			if (newNetworkName != null)
				msgs = ((InternalEObject)newNetworkName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__NETWORK_NAME, null, msgs);
			msgs = basicSetNetworkName(newNetworkName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__NETWORK_NAME, newNetworkName, newNetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpNetRangeType getIpNetRange() {
		return ipNetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpNetRange(IpNetRangeType newIpNetRange, NotificationChain msgs) {
		IpNetRangeType oldIpNetRange = ipNetRange;
		ipNetRange = newIpNetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__IP_NET_RANGE, oldIpNetRange, newIpNetRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpNetRange(IpNetRangeType newIpNetRange) {
		if (newIpNetRange != ipNetRange) {
			NotificationChain msgs = null;
			if (ipNetRange != null)
				msgs = ((InternalEObject)ipNetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__IP_NET_RANGE, null, msgs);
			if (newIpNetRange != null)
				msgs = ((InternalEObject)newIpNetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__IP_NET_RANGE, null, msgs);
			msgs = basicSetIpNetRange(newIpNetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__IP_NET_RANGE, newIpNetRange, newIpNetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CidrType1 getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCidr(CidrType1 newCidr, NotificationChain msgs) {
		CidrType1 oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__CIDR, oldCidr, newCidr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidr(CidrType1 newCidr) {
		if (newCidr != cidr) {
			NotificationChain msgs = null;
			if (cidr != null)
				msgs = ((InternalEObject)cidr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__CIDR, null, msgs);
			if (newCidr != null)
				msgs = ((InternalEObject)newCidr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_TYPE__CIDR, null, msgs);
			msgs = basicSetCidr(newCidr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_TYPE__CIDR, newCidr, newCidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NETWORK_TYPE__NETWORK_NAME:
				return basicSetNetworkName(null, msgs);
			case _1Package.NETWORK_TYPE__IP_NET_RANGE:
				return basicSetIpNetRange(null, msgs);
			case _1Package.NETWORK_TYPE__CIDR:
				return basicSetCidr(null, msgs);
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
			case _1Package.NETWORK_TYPE__NETWORK_NAME:
				return getNetworkName();
			case _1Package.NETWORK_TYPE__IP_NET_RANGE:
				return getIpNetRange();
			case _1Package.NETWORK_TYPE__CIDR:
				return getCidr();
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
			case _1Package.NETWORK_TYPE__NETWORK_NAME:
				setNetworkName((NetworkNameType)newValue);
				return;
			case _1Package.NETWORK_TYPE__IP_NET_RANGE:
				setIpNetRange((IpNetRangeType)newValue);
				return;
			case _1Package.NETWORK_TYPE__CIDR:
				setCidr((CidrType1)newValue);
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
			case _1Package.NETWORK_TYPE__NETWORK_NAME:
				setNetworkName((NetworkNameType)null);
				return;
			case _1Package.NETWORK_TYPE__IP_NET_RANGE:
				setIpNetRange((IpNetRangeType)null);
				return;
			case _1Package.NETWORK_TYPE__CIDR:
				setCidr((CidrType1)null);
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
			case _1Package.NETWORK_TYPE__NETWORK_NAME:
				return networkName != null;
			case _1Package.NETWORK_TYPE__IP_NET_RANGE:
				return ipNetRange != null;
			case _1Package.NETWORK_TYPE__CIDR:
				return cidr != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkTypeImpl
