/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostBoxType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNameType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteNumberType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalRouteType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Route Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getPostalRouteName <em>Postal Route Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getPostalRouteNumber <em>Postal Route Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.PostalRouteTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalRouteTypeImpl extends MinimalEObjectImpl.Container implements PostalRouteType {
	/**
	 * The cached value of the '{@link #getAddressLine() <em>Address Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLine()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressLineType> addressLine;

	/**
	 * The cached value of the '{@link #getPostalRouteName() <em>Postal Route Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalRouteName()
	 * @generated
	 * @ordered
	 */
	protected EList<PostalRouteNameType> postalRouteName;

	/**
	 * The cached value of the '{@link #getPostalRouteNumber() <em>Postal Route Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalRouteNumber()
	 * @generated
	 * @ordered
	 */
	protected PostalRouteNumberType postalRouteNumber;

	/**
	 * The cached value of the '{@link #getPostBox() <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected PostBoxType postBox;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

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
	protected PostalRouteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPostalRouteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostalRouteNameType> getPostalRouteName() {
		if (postalRouteName == null) {
			postalRouteName = new EObjectContainmentEList<PostalRouteNameType>(PostalRouteNameType.class, this, _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME);
		}
		return postalRouteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalRouteNumberType getPostalRouteNumber() {
		return postalRouteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalRouteNumber(PostalRouteNumberType newPostalRouteNumber, NotificationChain msgs) {
		PostalRouteNumberType oldPostalRouteNumber = postalRouteNumber;
		postalRouteNumber = newPostalRouteNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER, oldPostalRouteNumber, newPostalRouteNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalRouteNumber(PostalRouteNumberType newPostalRouteNumber) {
		if (newPostalRouteNumber != postalRouteNumber) {
			NotificationChain msgs = null;
			if (postalRouteNumber != null)
				msgs = ((InternalEObject)postalRouteNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER, null, msgs);
			if (newPostalRouteNumber != null)
				msgs = ((InternalEObject)newPostalRouteNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER, null, msgs);
			msgs = basicSetPostalRouteNumber(newPostalRouteNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER, newPostalRouteNumber, newPostalRouteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxType getPostBox() {
		return postBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBox(PostBoxType newPostBox, NotificationChain msgs) {
		PostBoxType oldPostBox = postBox;
		postBox = newPostBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.POSTAL_ROUTE_TYPE__POST_BOX, oldPostBox, newPostBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBox(PostBoxType newPostBox) {
		if (newPostBox != postBox) {
			NotificationChain msgs = null;
			if (postBox != null)
				msgs = ((InternalEObject)postBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.POSTAL_ROUTE_TYPE__POST_BOX, null, msgs);
			if (newPostBox != null)
				msgs = ((InternalEObject)newPostBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.POSTAL_ROUTE_TYPE__POST_BOX, null, msgs);
			msgs = basicSetPostBox(newPostBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.POSTAL_ROUTE_TYPE__POST_BOX, newPostBox, newPostBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.POSTAL_ROUTE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.POSTAL_ROUTE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE);
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
			case _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME:
				return ((InternalEList<?>)getPostalRouteName()).basicRemove(otherEnd, msgs);
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER:
				return basicSetPostalRouteNumber(null, msgs);
			case _0Package.POSTAL_ROUTE_TYPE__POST_BOX:
				return basicSetPostBox(null, msgs);
			case _0Package.POSTAL_ROUTE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME:
				return getPostalRouteName();
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER:
				return getPostalRouteNumber();
			case _0Package.POSTAL_ROUTE_TYPE__POST_BOX:
				return getPostBox();
			case _0Package.POSTAL_ROUTE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.POSTAL_ROUTE_TYPE__TYPE:
				return getType();
			case _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME:
				getPostalRouteName().clear();
				getPostalRouteName().addAll((Collection<? extends PostalRouteNameType>)newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER:
				setPostalRouteNumber((PostalRouteNumberType)newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POST_BOX:
				setPostBox((PostBoxType)newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__TYPE:
				setType(newValue);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME:
				getPostalRouteName().clear();
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER:
				setPostalRouteNumber((PostalRouteNumberType)null);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__POST_BOX:
				setPostBox((PostBoxType)null);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.POSTAL_ROUTE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.POSTAL_ROUTE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME:
				return postalRouteName != null && !postalRouteName.isEmpty();
			case _0Package.POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER:
				return postalRouteNumber != null;
			case _0Package.POSTAL_ROUTE_TYPE__POST_BOX:
				return postBox != null;
			case _0Package.POSTAL_ROUTE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.POSTAL_ROUTE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _0Package.POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostalRouteTypeImpl
