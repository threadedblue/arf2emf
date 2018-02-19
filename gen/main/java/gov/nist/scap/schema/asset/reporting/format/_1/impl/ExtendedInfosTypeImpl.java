/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType;
import gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Infos Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ExtendedInfosTypeImpl#getExtendedInfo <em>Extended Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedInfosTypeImpl extends MinimalEObjectImpl.Container implements ExtendedInfosType {
	/**
	 * The cached value of the '{@link #getExtendedInfo() <em>Extended Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedInfoType> extendedInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedInfosTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.EXTENDED_INFOS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedInfoType> getExtendedInfo() {
		if (extendedInfo == null) {
			extendedInfo = new EObjectContainmentEList<ExtendedInfoType>(ExtendedInfoType.class, this, _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO);
		}
		return extendedInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO:
				return ((InternalEList<?>)getExtendedInfo()).basicRemove(otherEnd, msgs);
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
			case _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO:
				return getExtendedInfo();
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
			case _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO:
				getExtendedInfo().clear();
				getExtendedInfo().addAll((Collection<? extends ExtendedInfoType>)newValue);
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
			case _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO:
				getExtendedInfo().clear();
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
			case _1Package.EXTENDED_INFOS_TYPE__EXTENDED_INFO:
				return extendedInfo != null && !extendedInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtendedInfosTypeImpl
