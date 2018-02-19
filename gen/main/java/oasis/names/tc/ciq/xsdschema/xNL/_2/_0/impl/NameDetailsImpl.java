/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;
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
 * An implementation of the model object '<em><b>Name Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getJointPersonName <em>Joint Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getPartyType <em>Party Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.NameDetailsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameDetailsImpl extends MinimalEObjectImpl.Container implements NameDetails {
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
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected PersonNameType personName;

	/**
	 * The cached value of the '{@link #getJointPersonName() <em>Joint Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointPersonName()
	 * @generated
	 * @ordered
	 */
	protected JointPersonNameType jointPersonName;

	/**
	 * The cached value of the '{@link #getOrganisationNameDetails() <em>Organisation Name Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationNameDetails()
	 * @generated
	 * @ordered
	 */
	protected OrganisationNameDetailsType organisationNameDetails;

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
	 * The default value of the '{@link #getPartyType() <em>Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyType()
	 * @generated
	 * @ordered
	 */
	protected static final Object PARTY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyType() <em>Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyType()
	 * @generated
	 * @ordered
	 */
	protected Object partyType = PARTY_TYPE_EDEFAULT;

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
	protected NameDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.NAME_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameLineType> getNameLine() {
		if (nameLine == null) {
			nameLine = new EObjectContainmentEList<NameLineType>(NameLineType.class, this, _0Package.NAME_DETAILS__NAME_LINE);
		}
		return nameLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		PersonNameType oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__PERSON_NAME, oldPersonName, newPersonName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(PersonNameType newPersonName) {
		if (newPersonName != personName) {
			NotificationChain msgs = null;
			if (personName != null)
				msgs = ((InternalEObject)personName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__PERSON_NAME, null, msgs);
			if (newPersonName != null)
				msgs = ((InternalEObject)newPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__PERSON_NAME, null, msgs);
			msgs = basicSetPersonName(newPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__PERSON_NAME, newPersonName, newPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPersonNameType getJointPersonName() {
		return jointPersonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointPersonName(JointPersonNameType newJointPersonName, NotificationChain msgs) {
		JointPersonNameType oldJointPersonName = jointPersonName;
		jointPersonName = newJointPersonName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__JOINT_PERSON_NAME, oldJointPersonName, newJointPersonName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointPersonName(JointPersonNameType newJointPersonName) {
		if (newJointPersonName != jointPersonName) {
			NotificationChain msgs = null;
			if (jointPersonName != null)
				msgs = ((InternalEObject)jointPersonName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__JOINT_PERSON_NAME, null, msgs);
			if (newJointPersonName != null)
				msgs = ((InternalEObject)newJointPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__JOINT_PERSON_NAME, null, msgs);
			msgs = basicSetJointPersonName(newJointPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__JOINT_PERSON_NAME, newJointPersonName, newJointPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationNameDetailsType getOrganisationNameDetails() {
		return organisationNameDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisationNameDetails(OrganisationNameDetailsType newOrganisationNameDetails, NotificationChain msgs) {
		OrganisationNameDetailsType oldOrganisationNameDetails = organisationNameDetails;
		organisationNameDetails = newOrganisationNameDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS, oldOrganisationNameDetails, newOrganisationNameDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisationNameDetails(OrganisationNameDetailsType newOrganisationNameDetails) {
		if (newOrganisationNameDetails != organisationNameDetails) {
			NotificationChain msgs = null;
			if (organisationNameDetails != null)
				msgs = ((InternalEObject)organisationNameDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS, null, msgs);
			if (newOrganisationNameDetails != null)
				msgs = ((InternalEObject)newOrganisationNameDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS, null, msgs);
			msgs = basicSetOrganisationNameDetails(newOrganisationNameDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS, newOrganisationNameDetails, newOrganisationNameDetails));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPartyType() {
		return partyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyType(Object newPartyType) {
		Object oldPartyType = partyType;
		partyType = newPartyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NAME_DETAILS__PARTY_TYPE, oldPartyType, partyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.NAME_DETAILS__ANY_ATTRIBUTE);
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
			case _0Package.NAME_DETAILS__NAME_LINE:
				return ((InternalEList<?>)getNameLine()).basicRemove(otherEnd, msgs);
			case _0Package.NAME_DETAILS__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case _0Package.NAME_DETAILS__JOINT_PERSON_NAME:
				return basicSetJointPersonName(null, msgs);
			case _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS:
				return basicSetOrganisationNameDetails(null, msgs);
			case _0Package.NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.NAME_DETAILS__NAME_LINE:
				return getNameLine();
			case _0Package.NAME_DETAILS__PERSON_NAME:
				return getPersonName();
			case _0Package.NAME_DETAILS__JOINT_PERSON_NAME:
				return getJointPersonName();
			case _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS:
				return getOrganisationNameDetails();
			case _0Package.NAME_DETAILS__CODE:
				return getCode();
			case _0Package.NAME_DETAILS__PARTY_TYPE:
				return getPartyType();
			case _0Package.NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.NAME_DETAILS__NAME_LINE:
				getNameLine().clear();
				getNameLine().addAll((Collection<? extends NameLineType>)newValue);
				return;
			case _0Package.NAME_DETAILS__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case _0Package.NAME_DETAILS__JOINT_PERSON_NAME:
				setJointPersonName((JointPersonNameType)newValue);
				return;
			case _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS:
				setOrganisationNameDetails((OrganisationNameDetailsType)newValue);
				return;
			case _0Package.NAME_DETAILS__CODE:
				setCode(newValue);
				return;
			case _0Package.NAME_DETAILS__PARTY_TYPE:
				setPartyType(newValue);
				return;
			case _0Package.NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.NAME_DETAILS__NAME_LINE:
				getNameLine().clear();
				return;
			case _0Package.NAME_DETAILS__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case _0Package.NAME_DETAILS__JOINT_PERSON_NAME:
				setJointPersonName((JointPersonNameType)null);
				return;
			case _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS:
				setOrganisationNameDetails((OrganisationNameDetailsType)null);
				return;
			case _0Package.NAME_DETAILS__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case _0Package.NAME_DETAILS__PARTY_TYPE:
				setPartyType(PARTY_TYPE_EDEFAULT);
				return;
			case _0Package.NAME_DETAILS__ANY_ATTRIBUTE:
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
			case _0Package.NAME_DETAILS__NAME_LINE:
				return nameLine != null && !nameLine.isEmpty();
			case _0Package.NAME_DETAILS__PERSON_NAME:
				return personName != null;
			case _0Package.NAME_DETAILS__JOINT_PERSON_NAME:
				return jointPersonName != null;
			case _0Package.NAME_DETAILS__ORGANISATION_NAME_DETAILS:
				return organisationNameDetails != null;
			case _0Package.NAME_DETAILS__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case _0Package.NAME_DETAILS__PARTY_TYPE:
				return PARTY_TYPE_EDEFAULT == null ? partyType != null : !PARTY_TYPE_EDEFAULT.equals(partyType);
			case _0Package.NAME_DETAILS__ANY_ATTRIBUTE:
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
		result.append(" (code: ");
		result.append(code);
		result.append(", partyType: ");
		result.append(partyType);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //NameDetailsImpl
