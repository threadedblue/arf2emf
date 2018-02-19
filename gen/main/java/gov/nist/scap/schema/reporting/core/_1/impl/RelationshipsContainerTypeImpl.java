/**
 */
package gov.nist.scap.schema.reporting.core._1.impl;

import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;
import gov.nist.scap.schema.reporting.core._1.RelationshipsType;
import gov.nist.scap.schema.reporting.core._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationships Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipsContainerTypeImpl extends MinimalEObjectImpl.Container implements RelationshipsContainerType {
	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected RelationshipsType relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipsContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.RELATIONSHIPS_CONTAINER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsType getRelationships() {
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationships(RelationshipsType newRelationships, NotificationChain msgs) {
		RelationshipsType oldRelationships = relationships;
		relationships = newRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS, oldRelationships, newRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationships(RelationshipsType newRelationships) {
		if (newRelationships != relationships) {
			NotificationChain msgs = null;
			if (relationships != null)
				msgs = ((InternalEObject)relationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS, null, msgs);
			if (newRelationships != null)
				msgs = ((InternalEObject)newRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS, null, msgs);
			msgs = basicSetRelationships(newRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS, newRelationships, newRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
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
			case _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS:
				return getRelationships();
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
			case _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)newValue);
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
			case _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS:
				setRelationships((RelationshipsType)null);
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
			case _1Package.RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS:
				return relationships != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipsContainerTypeImpl
