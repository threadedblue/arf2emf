/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1.IpV4Type1;
import gov.nist.scap.schema.asset.identification._1.IpV6Type1;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ip Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl#getIpV4 <em>Ip V4</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.IpAddressTypeImpl#getIpV6 <em>Ip V6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpAddressTypeImpl extends MinimalEObjectImpl.Container implements IpAddressType {
	/**
	 * The cached value of the '{@link #getIpV4() <em>Ip V4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV4()
	 * @generated
	 * @ordered
	 */
	protected IpV4Type1 ipV4;

	/**
	 * The cached value of the '{@link #getIpV6() <em>Ip V6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpV6()
	 * @generated
	 * @ordered
	 */
	protected IpV6Type1 ipV6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.IP_ADDRESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpV4Type1 getIpV4() {
		return ipV4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpV4(IpV4Type1 newIpV4, NotificationChain msgs) {
		IpV4Type1 oldIpV4 = ipV4;
		ipV4 = newIpV4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.IP_ADDRESS_TYPE__IP_V4, oldIpV4, newIpV4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpV4(IpV4Type1 newIpV4) {
		if (newIpV4 != ipV4) {
			NotificationChain msgs = null;
			if (ipV4 != null)
				msgs = ((InternalEObject)ipV4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_ADDRESS_TYPE__IP_V4, null, msgs);
			if (newIpV4 != null)
				msgs = ((InternalEObject)newIpV4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_ADDRESS_TYPE__IP_V4, null, msgs);
			msgs = basicSetIpV4(newIpV4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.IP_ADDRESS_TYPE__IP_V4, newIpV4, newIpV4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpV6Type1 getIpV6() {
		return ipV6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpV6(IpV6Type1 newIpV6, NotificationChain msgs) {
		IpV6Type1 oldIpV6 = ipV6;
		ipV6 = newIpV6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.IP_ADDRESS_TYPE__IP_V6, oldIpV6, newIpV6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpV6(IpV6Type1 newIpV6) {
		if (newIpV6 != ipV6) {
			NotificationChain msgs = null;
			if (ipV6 != null)
				msgs = ((InternalEObject)ipV6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_ADDRESS_TYPE__IP_V6, null, msgs);
			if (newIpV6 != null)
				msgs = ((InternalEObject)newIpV6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_ADDRESS_TYPE__IP_V6, null, msgs);
			msgs = basicSetIpV6(newIpV6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.IP_ADDRESS_TYPE__IP_V6, newIpV6, newIpV6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.IP_ADDRESS_TYPE__IP_V4:
				return basicSetIpV4(null, msgs);
			case _1Package.IP_ADDRESS_TYPE__IP_V6:
				return basicSetIpV6(null, msgs);
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
			case _1Package.IP_ADDRESS_TYPE__IP_V4:
				return getIpV4();
			case _1Package.IP_ADDRESS_TYPE__IP_V6:
				return getIpV6();
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
			case _1Package.IP_ADDRESS_TYPE__IP_V4:
				setIpV4((IpV4Type1)newValue);
				return;
			case _1Package.IP_ADDRESS_TYPE__IP_V6:
				setIpV6((IpV6Type1)newValue);
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
			case _1Package.IP_ADDRESS_TYPE__IP_V4:
				setIpV4((IpV4Type1)null);
				return;
			case _1Package.IP_ADDRESS_TYPE__IP_V6:
				setIpV6((IpV6Type1)null);
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
			case _1Package.IP_ADDRESS_TYPE__IP_V4:
				return ipV4 != null;
			case _1Package.IP_ADDRESS_TYPE__IP_V6:
				return ipV6 != null;
		}
		return super.eIsSet(featureID);
	}

} //IpAddressTypeImpl
