/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.impl;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxNumberExtensionType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Box Number Extension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberExtensionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberExtensionTypeImpl#getNumberExtensionSeparator <em>Number Extension Separator</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostBoxNumberExtensionTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostBoxNumberExtensionTypeImpl extends MinimalEObjectImpl.Container implements PostBoxNumberExtensionType {
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
	 * The default value of the '{@link #getNumberExtensionSeparator() <em>Number Extension Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberExtensionSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUMBER_EXTENSION_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberExtensionSeparator() <em>Number Extension Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberExtensionSeparator()
	 * @generated
	 * @ordered
	 */
	protected Object numberExtensionSeparator = NUMBER_EXTENSION_SEPARATOR_EDEFAULT;

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
	protected PostBoxNumberExtensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPostBoxNumberExtensionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumberExtensionSeparator() {
		return numberExtensionSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberExtensionSeparator(Object newNumberExtensionSeparator) {
		Object oldNumberExtensionSeparator = numberExtensionSeparator;
		numberExtensionSeparator = newNumberExtensionSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR, oldNumberExtensionSeparator, numberExtensionSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE);
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
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR:
				return getNumberExtensionSeparator();
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR:
				setNumberExtensionSeparator(newValue);
				return;
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED:
				getMixed().clear();
				return;
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR:
				setNumberExtensionSeparator(NUMBER_EXTENSION_SEPARATOR_EDEFAULT);
				return;
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR:
				return NUMBER_EXTENSION_SEPARATOR_EDEFAULT == null ? numberExtensionSeparator != null : !NUMBER_EXTENSION_SEPARATOR_EDEFAULT.equals(numberExtensionSeparator);
			case _0Package.POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE:
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
		result.append(", numberExtensionSeparator: ");
		result.append(numberExtensionSeparator);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostBoxNumberExtensionTypeImpl
