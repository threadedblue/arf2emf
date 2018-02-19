/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.CircuitNameType;
import gov.nist.scap.schema.asset.identification._1.CircuitType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.CircuitTypeImpl#getCircuitName <em>Circuit Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitTypeImpl extends ItAssetTypeImpl implements CircuitType {
	/**
	 * The cached value of the '{@link #getCircuitName() <em>Circuit Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitName()
	 * @generated
	 * @ordered
	 */
	protected CircuitNameType circuitName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.CIRCUIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitNameType getCircuitName() {
		return circuitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitName(CircuitNameType newCircuitName, NotificationChain msgs) {
		CircuitNameType oldCircuitName = circuitName;
		circuitName = newCircuitName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.CIRCUIT_TYPE__CIRCUIT_NAME, oldCircuitName, newCircuitName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitName(CircuitNameType newCircuitName) {
		if (newCircuitName != circuitName) {
			NotificationChain msgs = null;
			if (circuitName != null)
				msgs = ((InternalEObject)circuitName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.CIRCUIT_TYPE__CIRCUIT_NAME, null, msgs);
			if (newCircuitName != null)
				msgs = ((InternalEObject)newCircuitName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.CIRCUIT_TYPE__CIRCUIT_NAME, null, msgs);
			msgs = basicSetCircuitName(newCircuitName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CIRCUIT_TYPE__CIRCUIT_NAME, newCircuitName, newCircuitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CIRCUIT_TYPE__CIRCUIT_NAME:
				return basicSetCircuitName(null, msgs);
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
			case _1Package.CIRCUIT_TYPE__CIRCUIT_NAME:
				return getCircuitName();
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
			case _1Package.CIRCUIT_TYPE__CIRCUIT_NAME:
				setCircuitName((CircuitNameType)newValue);
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
			case _1Package.CIRCUIT_TYPE__CIRCUIT_NAME:
				setCircuitName((CircuitNameType)null);
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
			case _1Package.CIRCUIT_TYPE__CIRCUIT_NAME:
				return circuitName != null;
		}
		return super.eIsSet(featureID);
	}

} //CircuitTypeImpl
