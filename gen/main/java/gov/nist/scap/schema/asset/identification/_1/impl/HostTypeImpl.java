/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.FqdnType;
import gov.nist.scap.schema.asset.identification._1.HostType;
import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl#getFqdn <em>Fqdn</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.HostTypeImpl#getIpAddress <em>Ip Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostTypeImpl extends MinimalEObjectImpl.Container implements HostType {
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
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType ipAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.HOST_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.HOST_TYPE__FQDN, oldFqdn, newFqdn);
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
				msgs = ((InternalEObject)fqdn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.HOST_TYPE__FQDN, null, msgs);
			if (newFqdn != null)
				msgs = ((InternalEObject)newFqdn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.HOST_TYPE__FQDN, null, msgs);
			msgs = basicSetFqdn(newFqdn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.HOST_TYPE__FQDN, newFqdn, newFqdn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.HOST_TYPE__IP_ADDRESS, oldIpAddress, newIpAddress);
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
				msgs = ((InternalEObject)ipAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.HOST_TYPE__IP_ADDRESS, null, msgs);
			if (newIpAddress != null)
				msgs = ((InternalEObject)newIpAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.HOST_TYPE__IP_ADDRESS, null, msgs);
			msgs = basicSetIpAddress(newIpAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.HOST_TYPE__IP_ADDRESS, newIpAddress, newIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.HOST_TYPE__FQDN:
				return basicSetFqdn(null, msgs);
			case _1Package.HOST_TYPE__IP_ADDRESS:
				return basicSetIpAddress(null, msgs);
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
			case _1Package.HOST_TYPE__FQDN:
				return getFqdn();
			case _1Package.HOST_TYPE__IP_ADDRESS:
				return getIpAddress();
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
			case _1Package.HOST_TYPE__FQDN:
				setFqdn((FqdnType)newValue);
				return;
			case _1Package.HOST_TYPE__IP_ADDRESS:
				setIpAddress((IpAddressType)newValue);
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
			case _1Package.HOST_TYPE__FQDN:
				setFqdn((FqdnType)null);
				return;
			case _1Package.HOST_TYPE__IP_ADDRESS:
				setIpAddress((IpAddressType)null);
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
			case _1Package.HOST_TYPE__FQDN:
				return fqdn != null;
			case _1Package.HOST_TYPE__IP_ADDRESS:
				return ipAddress != null;
		}
		return super.eIsSet(featureID);
	}

} //HostTypeImpl
