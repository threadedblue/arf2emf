/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.IpAddressType;
import gov.nist.scap.schema.asset.identification._1.IpNetRangeType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ip Net Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl#getIpNetRangeStart <em>Ip Net Range Start</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.IpNetRangeTypeImpl#getIpNetRangeEnd <em>Ip Net Range End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpNetRangeTypeImpl extends MinimalEObjectImpl.Container implements IpNetRangeType {
	/**
	 * The cached value of the '{@link #getIpNetRangeStart() <em>Ip Net Range Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpNetRangeStart()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType ipNetRangeStart;

	/**
	 * The cached value of the '{@link #getIpNetRangeEnd() <em>Ip Net Range End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpNetRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected IpAddressType ipNetRangeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpNetRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.IP_NET_RANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getIpNetRangeStart() {
		return ipNetRangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpNetRangeStart(IpAddressType newIpNetRangeStart, NotificationChain msgs) {
		IpAddressType oldIpNetRangeStart = ipNetRangeStart;
		ipNetRangeStart = newIpNetRangeStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START, oldIpNetRangeStart, newIpNetRangeStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpNetRangeStart(IpAddressType newIpNetRangeStart) {
		if (newIpNetRangeStart != ipNetRangeStart) {
			NotificationChain msgs = null;
			if (ipNetRangeStart != null)
				msgs = ((InternalEObject)ipNetRangeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START, null, msgs);
			if (newIpNetRangeStart != null)
				msgs = ((InternalEObject)newIpNetRangeStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START, null, msgs);
			msgs = basicSetIpNetRangeStart(newIpNetRangeStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START, newIpNetRangeStart, newIpNetRangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddressType getIpNetRangeEnd() {
		return ipNetRangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIpNetRangeEnd(IpAddressType newIpNetRangeEnd, NotificationChain msgs) {
		IpAddressType oldIpNetRangeEnd = ipNetRangeEnd;
		ipNetRangeEnd = newIpNetRangeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END, oldIpNetRangeEnd, newIpNetRangeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpNetRangeEnd(IpAddressType newIpNetRangeEnd) {
		if (newIpNetRangeEnd != ipNetRangeEnd) {
			NotificationChain msgs = null;
			if (ipNetRangeEnd != null)
				msgs = ((InternalEObject)ipNetRangeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END, null, msgs);
			if (newIpNetRangeEnd != null)
				msgs = ((InternalEObject)newIpNetRangeEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END, null, msgs);
			msgs = basicSetIpNetRangeEnd(newIpNetRangeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END, newIpNetRangeEnd, newIpNetRangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START:
				return basicSetIpNetRangeStart(null, msgs);
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END:
				return basicSetIpNetRangeEnd(null, msgs);
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
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START:
				return getIpNetRangeStart();
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END:
				return getIpNetRangeEnd();
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
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START:
				setIpNetRangeStart((IpAddressType)newValue);
				return;
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END:
				setIpNetRangeEnd((IpAddressType)newValue);
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
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START:
				setIpNetRangeStart((IpAddressType)null);
				return;
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END:
				setIpNetRangeEnd((IpAddressType)null);
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
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_START:
				return ipNetRangeStart != null;
			case _1Package.IP_NET_RANGE_TYPE__IP_NET_RANGE_END:
				return ipNetRangeEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //IpNetRangeTypeImpl
