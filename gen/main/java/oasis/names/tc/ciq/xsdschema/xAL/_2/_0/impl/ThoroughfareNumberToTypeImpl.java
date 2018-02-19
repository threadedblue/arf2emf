/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberToType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thoroughfare Number To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareNumberToTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThoroughfareNumberToTypeImpl extends MinimalEObjectImpl.Container implements ThoroughfareNumberToType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThoroughfareNumberToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getThoroughfareNumberToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		return getMixed().list(_0Package.eINSTANCE.getThoroughfareNumberToType_AddressLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberPrefixType> getThoroughfareNumberPrefix() {
		return getMixed().list(_0Package.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumberPrefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberType> getThoroughfareNumber() {
		return getMixed().list(_0Package.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberSuffixType> getThoroughfareNumberSuffix() {
		return getMixed().list(_0Package.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumberSuffix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_NUMBER_TO_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return ((InternalEList<?>)getThoroughfareNumberPrefix()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return ((InternalEList<?>)getThoroughfareNumber()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getThoroughfareNumberSuffix()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return getThoroughfareNumberPrefix();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return getThoroughfareNumber();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return getThoroughfareNumberSuffix();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				return getCode();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				getThoroughfareNumberPrefix().addAll((Collection<? extends ThoroughfareNumberPrefixType>)newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				getThoroughfareNumber().addAll((Collection<? extends ThoroughfareNumberType>)newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				getThoroughfareNumberSuffix().addAll((Collection<? extends ThoroughfareNumberSuffixType>)newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				setCode(newValue);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				getMixed().clear();
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return !getAddressLine().isEmpty();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return !getThoroughfareNumberPrefix().isEmpty();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return !getThoroughfareNumber().isEmpty();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return !getThoroughfareNumberSuffix().isEmpty();
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case _0Package.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", code: ");
		result.append(code);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ThoroughfareNumberToTypeImpl
