/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.Function;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType;
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
 * An implementation of the model object '<em><b>Name Details Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl#getAddresseeIndicator <em>Addressee Indicator</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl#getDependencyName <em>Dependency Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsTypeImpl#getNameDetailsKey <em>Name Details Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameDetailsTypeImpl extends NameDetailsImpl implements NameDetailsType {
	/**
	 * The cached value of the '{@link #getAddresseeIndicator() <em>Addressee Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresseeIndicator()
	 * @generated
	 * @ordered
	 */
	protected AddresseeIndicatorType addresseeIndicator;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The cached value of the '{@link #getDependencyName() <em>Dependency Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyName()
	 * @generated
	 * @ordered
	 */
	protected DependencyNameType dependencyName;

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
	 * The default value of the '{@link #getNameDetailsKey() <em>Name Details Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_DETAILS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDetailsKey() <em>Name Details Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKey()
	 * @generated
	 * @ordered
	 */
	protected Object nameDetailsKey = NAME_DETAILS_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameDetailsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.NAME_DETAILS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddresseeIndicatorType getAddresseeIndicator() {
		return addresseeIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddresseeIndicator(AddresseeIndicatorType newAddresseeIndicator, NotificationChain msgs) {
		AddresseeIndicatorType oldAddresseeIndicator = addresseeIndicator;
		addresseeIndicator = newAddresseeIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR, oldAddresseeIndicator, newAddresseeIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddresseeIndicator(AddresseeIndicatorType newAddresseeIndicator) {
		if (newAddresseeIndicator != addresseeIndicator) {
			NotificationChain msgs = null;
			if (addresseeIndicator != null)
				msgs = ((InternalEObject)addresseeIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR, null, msgs);
			if (newAddresseeIndicator != null)
				msgs = ((InternalEObject)newAddresseeIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR, null, msgs);
			msgs = basicSetAddresseeIndicator(newAddresseeIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR, newAddresseeIndicator, newAddresseeIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyNameType getDependencyName() {
		return dependencyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyName(DependencyNameType newDependencyName, NotificationChain msgs) {
		DependencyNameType oldDependencyName = dependencyName;
		dependencyName = newDependencyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME, oldDependencyName, newDependencyName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyName(DependencyNameType newDependencyName) {
		if (newDependencyName != dependencyName) {
			NotificationChain msgs = null;
			if (dependencyName != null)
				msgs = ((InternalEObject)dependencyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME, null, msgs);
			if (newDependencyName != null)
				msgs = ((InternalEObject)newDependencyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME, null, msgs);
			msgs = basicSetDependencyName(newDependencyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME, newDependencyName, newDependencyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.NAME_DETAILS_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNameDetailsKey() {
		return nameDetailsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDetailsKey(Object newNameDetailsKey) {
		Object oldNameDetailsKey = nameDetailsKey;
		nameDetailsKey = newNameDetailsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS_TYPE__NAME_DETAILS_KEY, oldNameDetailsKey, nameDetailsKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR:
				return basicSetAddresseeIndicator(null, msgs);
			case _0Package.NAME_DETAILS_TYPE__FUNCTION:
				return basicSetFunction(null, msgs);
			case _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME:
				return basicSetDependencyName(null, msgs);
			case _0Package.NAME_DETAILS_TYPE__ANY:
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
			case _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR:
				return getAddresseeIndicator();
			case _0Package.NAME_DETAILS_TYPE__FUNCTION:
				return getFunction();
			case _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME:
				return getDependencyName();
			case _0Package.NAME_DETAILS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.NAME_DETAILS_TYPE__NAME_DETAILS_KEY:
				return getNameDetailsKey();
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
			case _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR:
				setAddresseeIndicator((AddresseeIndicatorType)newValue);
				return;
			case _0Package.NAME_DETAILS_TYPE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME:
				setDependencyName((DependencyNameType)newValue);
				return;
			case _0Package.NAME_DETAILS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.NAME_DETAILS_TYPE__NAME_DETAILS_KEY:
				setNameDetailsKey(newValue);
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
			case _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR:
				setAddresseeIndicator((AddresseeIndicatorType)null);
				return;
			case _0Package.NAME_DETAILS_TYPE__FUNCTION:
				setFunction((Function)null);
				return;
			case _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME:
				setDependencyName((DependencyNameType)null);
				return;
			case _0Package.NAME_DETAILS_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.NAME_DETAILS_TYPE__NAME_DETAILS_KEY:
				setNameDetailsKey(NAME_DETAILS_KEY_EDEFAULT);
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
			case _0Package.NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR:
				return addresseeIndicator != null;
			case _0Package.NAME_DETAILS_TYPE__FUNCTION:
				return function != null;
			case _0Package.NAME_DETAILS_TYPE__DEPENDENCY_NAME:
				return dependencyName != null;
			case _0Package.NAME_DETAILS_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.NAME_DETAILS_TYPE__NAME_DETAILS_KEY:
				return NAME_DETAILS_KEY_EDEFAULT == null ? nameDetailsKey != null : !NAME_DETAILS_KEY_EDEFAULT.equals(nameDetailsKey);
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
		result.append(", nameDetailsKey: ");
		result.append(nameDetailsKey);
		result.append(')');
		return result.toString();
	}

} //NameDetailsTypeImpl
