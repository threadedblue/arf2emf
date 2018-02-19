/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.HostType;
import gov.nist.scap.schema.asset.identification._1.PortRangeType;
import gov.nist.scap.schema.asset.identification._1.PortType1;
import gov.nist.scap.schema.asset.identification._1.ProtocolType;
import gov.nist.scap.schema.asset.identification._1.ServiceType;
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
 * An implementation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl#getPortRange <em>Port Range</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.ServiceTypeImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeImpl extends ItAssetTypeImpl implements ServiceType {
	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected HostType host;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType1> port;

	/**
	 * The cached value of the '{@link #getPortRange() <em>Port Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRange()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRangeType> portRange;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.SERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(HostType newHost, NotificationChain msgs) {
		HostType oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SERVICE_TYPE__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(HostType newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SERVICE_TYPE__HOST, null, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SERVICE_TYPE__HOST, null, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SERVICE_TYPE__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType1> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<PortType1>(PortType1.class, this, _1Package.SERVICE_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRangeType> getPortRange() {
		if (portRange == null) {
			portRange = new EObjectContainmentEList<PortRangeType>(PortRangeType.class, this, _1Package.SERVICE_TYPE__PORT_RANGE);
		}
		return portRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolType newProtocol, NotificationChain msgs) {
		ProtocolType oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SERVICE_TYPE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolType newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SERVICE_TYPE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SERVICE_TYPE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SERVICE_TYPE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.SERVICE_TYPE__HOST:
				return basicSetHost(null, msgs);
			case _1Package.SERVICE_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case _1Package.SERVICE_TYPE__PORT_RANGE:
				return ((InternalEList<?>)getPortRange()).basicRemove(otherEnd, msgs);
			case _1Package.SERVICE_TYPE__PROTOCOL:
				return basicSetProtocol(null, msgs);
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
			case _1Package.SERVICE_TYPE__HOST:
				return getHost();
			case _1Package.SERVICE_TYPE__PORT:
				return getPort();
			case _1Package.SERVICE_TYPE__PORT_RANGE:
				return getPortRange();
			case _1Package.SERVICE_TYPE__PROTOCOL:
				return getProtocol();
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
			case _1Package.SERVICE_TYPE__HOST:
				setHost((HostType)newValue);
				return;
			case _1Package.SERVICE_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends PortType1>)newValue);
				return;
			case _1Package.SERVICE_TYPE__PORT_RANGE:
				getPortRange().clear();
				getPortRange().addAll((Collection<? extends PortRangeType>)newValue);
				return;
			case _1Package.SERVICE_TYPE__PROTOCOL:
				setProtocol((ProtocolType)newValue);
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
			case _1Package.SERVICE_TYPE__HOST:
				setHost((HostType)null);
				return;
			case _1Package.SERVICE_TYPE__PORT:
				getPort().clear();
				return;
			case _1Package.SERVICE_TYPE__PORT_RANGE:
				getPortRange().clear();
				return;
			case _1Package.SERVICE_TYPE__PROTOCOL:
				setProtocol((ProtocolType)null);
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
			case _1Package.SERVICE_TYPE__HOST:
				return host != null;
			case _1Package.SERVICE_TYPE__PORT:
				return port != null && !port.isEmpty();
			case _1Package.SERVICE_TYPE__PORT_RANGE:
				return portRange != null && !portRange.isEmpty();
			case _1Package.SERVICE_TYPE__PROTOCOL:
				return protocol != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceTypeImpl
