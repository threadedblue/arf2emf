/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

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
 * An implementation of the model object '<em><b>Organisation Name Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getOrganisationType <em>Organisation Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationNameDetailsImpl extends MinimalEObjectImpl.Container implements OrganisationNameDetails {
	/**
	 * The cached value of the '{@link #getNameLine() <em>Name Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLine()
	 * @generated
	 * @ordered
	 */
	protected EList<NameLineType> nameLine;

	/**
	 * The cached value of the '{@link #getOrganisationName() <em>Organisation Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationName()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationNameType> organisationName;

	/**
	 * The cached value of the '{@link #getOrganisationType() <em>Organisation Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationType()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationTypeType> organisationType;

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
	protected OrganisationNameDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.ORGANISATION_NAME_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameLineType> getNameLine() {
		if (nameLine == null) {
			nameLine = new EObjectContainmentEList<NameLineType>(NameLineType.class, this, _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE);
		}
		return nameLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationNameType> getOrganisationName() {
		if (organisationName == null) {
			organisationName = new EObjectContainmentEList<OrganisationNameType>(OrganisationNameType.class, this, _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME);
		}
		return organisationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationTypeType> getOrganisationType() {
		if (organisationType == null) {
			organisationType = new EObjectContainmentEList<OrganisationTypeType>(OrganisationTypeType.class, this, _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE);
		}
		return organisationType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF, oldNameDetailsKeyRef, nameDetailsKeyRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.ORGANISATION_NAME_DETAILS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE);
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
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE:
				return ((InternalEList<?>)getNameLine()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME:
				return ((InternalEList<?>)getOrganisationName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE:
				return ((InternalEList<?>)getOrganisationType()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE:
				return getNameLine();
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME:
				return getOrganisationName();
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE:
				return getOrganisationType();
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF:
				return getNameDetailsKeyRef();
			case _0Package.ORGANISATION_NAME_DETAILS__TYPE:
				return getType();
			case _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE:
				getNameLine().clear();
				getNameLine().addAll((Collection<? extends NameLineType>)newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME:
				getOrganisationName().clear();
				getOrganisationName().addAll((Collection<? extends OrganisationNameType>)newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE:
				getOrganisationType().clear();
				getOrganisationType().addAll((Collection<? extends OrganisationTypeType>)newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__TYPE:
				setType(newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE:
				getNameLine().clear();
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME:
				getOrganisationName().clear();
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE:
				getOrganisationType().clear();
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(NAME_DETAILS_KEY_REF_EDEFAULT);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_LINE:
				return nameLine != null && !nameLine.isEmpty();
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_NAME:
				return organisationName != null && !organisationName.isEmpty();
			case _0Package.ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE:
				return organisationType != null && !organisationType.isEmpty();
			case _0Package.ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF:
				return NAME_DETAILS_KEY_REF_EDEFAULT == null ? nameDetailsKeyRef != null : !NAME_DETAILS_KEY_REF_EDEFAULT.equals(nameDetailsKeyRef);
			case _0Package.ORGANISATION_NAME_DETAILS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _0Package.ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE:
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
		result.append(" (nameDetailsKeyRef: ");
		result.append(nameDetailsKeyRef);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //OrganisationNameDetailsImpl
