/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1.MacAddressType1;
import gov.nist.scap.schema.asset.identification._1.NetworkInterfaceType;
import gov.nist.scap.schema.asset.identification._1.UrlType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Network Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.NetworkInterfaceTypeImpl#getDefaultRoute <em>Default Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceTypeImpl extends MinimalEObjectImpl.Container implements NetworkInterfaceType {
	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType ipAddress;

	/**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected MacAddressType1 macAddress;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlType> url;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType subnetMask;

	/**
	 * The cached value of the '{@link #getDefaultRoute() <em>Default Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRoute()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType defaultRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NETWORK_INTERFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpAddress(IpAddressType newIpAddress, NotificationChain msgs) {
		IpAddressType oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS, oldIpAddress, newIpAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(IpAddressType newIpAddress) {
		if (newIpAddress != ipAddress) {
			NotificationChain msgs = null;
			if (ipAddress != null)
				msgs = ((InternalEObject)ipAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS, null, msgs);
			if (newIpAddress != null)
				msgs = ((InternalEObject)newIpAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS, null, msgs);
			msgs = basicSetIpAddress(newIpAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS, newIpAddress, newIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacAddressType1 getMacAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacAddress(MacAddressType1 newMacAddress, NotificationChain msgs) {
		MacAddressType1 oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS, oldMacAddress, newMacAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacAddress(MacAddressType1 newMacAddress) {
		if (newMacAddress != macAddress) {
			NotificationChain msgs = null;
			if (macAddress != null)
				msgs = ((InternalEObject)macAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS, null, msgs);
			if (newMacAddress != null)
				msgs = ((InternalEObject)newMacAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS, null, msgs);
			msgs = basicSetMacAddress(newMacAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS, newMacAddress, newMacAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlType> getUrl() {
		if (url == null) {
			url = new EObjectContainmentEList<UrlType>(UrlType.class, this, _1Package.NETWORK_INTERFACE_TYPE__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubnetMask(IpAddressType newSubnetMask, NotificationChain msgs) {
		IpAddressType oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK, oldSubnetMask, newSubnetMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetMask(IpAddressType newSubnetMask) {
		if (newSubnetMask != subnetMask) {
			NotificationChain msgs = null;
			if (subnetMask != null)
				msgs = ((InternalEObject)subnetMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK, null, msgs);
			if (newSubnetMask != null)
				msgs = ((InternalEObject)newSubnetMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK, null, msgs);
			msgs = basicSetSubnetMask(newSubnetMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK, newSubnetMask, newSubnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getDefaultRoute() {
		return defaultRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultRoute(IpAddressType newDefaultRoute, NotificationChain msgs) {
		IpAddressType oldDefaultRoute = defaultRoute;
		defaultRoute = newDefaultRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE, oldDefaultRoute, newDefaultRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRoute(IpAddressType newDefaultRoute) {
		if (newDefaultRoute != defaultRoute) {
			NotificationChain msgs = null;
			if (defaultRoute != null)
				msgs = ((InternalEObject)defaultRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE, null, msgs);
			if (newDefaultRoute != null)
				msgs = ((InternalEObject)newDefaultRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE, null, msgs);
			msgs = basicSetDefaultRoute(newDefaultRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE, newDefaultRoute, newDefaultRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS:
				return basicSetIpAddress(null, msgs);
			case _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS:
				return basicSetMacAddress(null, msgs);
			case _1Package.NETWORK_INTERFACE_TYPE__URL:
				return ((InternalEList<?>)getUrl()).basicRemove(otherEnd, msgs);
			case _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK:
				return basicSetSubnetMask(null, msgs);
			case _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE:
				return basicSetDefaultRoute(null, msgs);
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
			case _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS:
				return getIpAddress();
			case _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS:
				return getMacAddress();
			case _1Package.NETWORK_INTERFACE_TYPE__URL:
				return getUrl();
			case _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK:
				return getSubnetMask();
			case _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE:
				return getDefaultRoute();
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
			case _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS:
				setIpAddress((IpAddressType)newValue);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS:
				setMacAddress((MacAddressType1)newValue);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__URL:
				getUrl().clear();
				getUrl().addAll((Collection<? extends UrlType>)newValue);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK:
				setSubnetMask((IpAddressType)newValue);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE:
				setDefaultRoute((IpAddressType)newValue);
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
			case _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS:
				setIpAddress((IpAddressType)null);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS:
				setMacAddress((MacAddressType1)null);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__URL:
				getUrl().clear();
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK:
				setSubnetMask((IpAddressType)null);
				return;
			case _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE:
				setDefaultRoute((IpAddressType)null);
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
			case _1Package.NETWORK_INTERFACE_TYPE__IP_ADDRESS:
				return ipAddress != null;
			case _1Package.NETWORK_INTERFACE_TYPE__MAC_ADDRESS:
				return macAddress != null;
			case _1Package.NETWORK_INTERFACE_TYPE__URL:
				return url != null && !url.isEmpty();
			case _1Package.NETWORK_INTERFACE_TYPE__SUBNET_MASK:
				return subnetMask != null;
			case _1Package.NETWORK_INTERFACE_TYPE__DEFAULT_ROUTE:
				return defaultRoute != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkInterfaceTypeImpl
