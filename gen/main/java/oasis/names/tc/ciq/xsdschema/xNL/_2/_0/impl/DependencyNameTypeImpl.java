/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl#getDependencyType <em>Dependency Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DependencyNameTypeImpl#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyNameTypeImpl extends NameDetailsImpl implements DependencyNameType {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyType()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEPENDENCY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyType()
	 * @generated
	 * @ordered
	 */
	protected Object dependencyType = DEPENDENCY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameDetailsKeyRef() <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_DETAILS_KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDetailsKeyRef() <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 * @ordered
	 */
	protected Object nameDetailsKeyRef = NAME_DETAILS_KEY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.DEPENDENCY_NAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.DEPENDENCY_NAME_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDependencyType() {
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyType(Object newDependencyType) {
		Object oldDependencyType = dependencyType;
		dependencyType = newDependencyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE, oldDependencyType, dependencyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNameDetailsKeyRef() {
		return nameDetailsKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDetailsKeyRef(Object newNameDetailsKeyRef) {
		Object oldNameDetailsKeyRef = nameDetailsKeyRef;
		nameDetailsKeyRef = newNameDetailsKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF, oldNameDetailsKeyRef, nameDetailsKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DEPENDENCY_NAME_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case _0Package.DEPENDENCY_NAME_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE:
				return getDependencyType();
			case _0Package.DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF:
				return getNameDetailsKeyRef();
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
			case _0Package.DEPENDENCY_NAME_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE:
				setDependencyType(newValue);
				return;
			case _0Package.DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(newValue);
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
			case _0Package.DEPENDENCY_NAME_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE:
				setDependencyType(DEPENDENCY_TYPE_EDEFAULT);
				return;
			case _0Package.DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(NAME_DETAILS_KEY_REF_EDEFAULT);
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
			case _0Package.DEPENDENCY_NAME_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE:
				return DEPENDENCY_TYPE_EDEFAULT == null ? dependencyType != null : !DEPENDENCY_TYPE_EDEFAULT.equals(dependencyType);
			case _0Package.DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF:
				return NAME_DETAILS_KEY_REF_EDEFAULT == null ? nameDetailsKeyRef != null : !NAME_DETAILS_KEY_REF_EDEFAULT.equals(nameDetailsKeyRef);
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
		result.append(" (any: ");
		result.append(any);
		result.append(", dependencyType: ");
		result.append(dependencyType);
		result.append(", nameDetailsKeyRef: ");
		result.append(nameDetailsKeyRef);
		result.append(')');
		return result.toString();
	}

} //DependencyNameTypeImpl
