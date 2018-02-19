/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.BirthdateType;
import gov.nist.scap.schema.asset.identification._1.EmailAddressType;
import gov.nist.scap.schema.asset.identification._1.PersonType;
import gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1;
import gov.nist.scap.schema.asset.identification._1._1Package;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.PersonTypeImpl#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonTypeImpl extends AssetType1Impl implements PersonType {
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
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailAddressType> emailAddress;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumberType1> telephoneNumber;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected BirthdateType birthdate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.PERSON_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PERSON_TYPE__PERSON_NAME, oldPersonName, newPersonName);
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
				msgs = ((InternalEObject)personName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PERSON_TYPE__PERSON_NAME, null, msgs);
			if (newPersonName != null)
				msgs = ((InternalEObject)newPersonName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PERSON_TYPE__PERSON_NAME, null, msgs);
			msgs = basicSetPersonName(newPersonName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PERSON_TYPE__PERSON_NAME, newPersonName, newPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmailAddressType> getEmailAddress() {
		if (emailAddress == null) {
			emailAddress = new EObjectContainmentEList<EmailAddressType>(EmailAddressType.class, this, _1Package.PERSON_TYPE__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelephoneNumberType1> getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList<TelephoneNumberType1>(TelephoneNumberType1.class, this, _1Package.PERSON_TYPE__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthdateType getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthdate(BirthdateType newBirthdate, NotificationChain msgs) {
		BirthdateType oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PERSON_TYPE__BIRTHDATE, oldBirthdate, newBirthdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(BirthdateType newBirthdate) {
		if (newBirthdate != birthdate) {
			NotificationChain msgs = null;
			if (birthdate != null)
				msgs = ((InternalEObject)birthdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PERSON_TYPE__BIRTHDATE, null, msgs);
			if (newBirthdate != null)
				msgs = ((InternalEObject)newBirthdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PERSON_TYPE__BIRTHDATE, null, msgs);
			msgs = basicSetBirthdate(newBirthdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PERSON_TYPE__BIRTHDATE, newBirthdate, newBirthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.PERSON_TYPE__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case _1Package.PERSON_TYPE__EMAIL_ADDRESS:
				return ((InternalEList<?>)getEmailAddress()).basicRemove(otherEnd, msgs);
			case _1Package.PERSON_TYPE__TELEPHONE_NUMBER:
				return ((InternalEList<?>)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case _1Package.PERSON_TYPE__BIRTHDATE:
				return basicSetBirthdate(null, msgs);
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
			case _1Package.PERSON_TYPE__PERSON_NAME:
				return getPersonName();
			case _1Package.PERSON_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
			case _1Package.PERSON_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case _1Package.PERSON_TYPE__BIRTHDATE:
				return getBirthdate();
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
			case _1Package.PERSON_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case _1Package.PERSON_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection<? extends EmailAddressType>)newValue);
				return;
			case _1Package.PERSON_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends TelephoneNumberType1>)newValue);
				return;
			case _1Package.PERSON_TYPE__BIRTHDATE:
				setBirthdate((BirthdateType)newValue);
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
			case _1Package.PERSON_TYPE__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case _1Package.PERSON_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case _1Package.PERSON_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case _1Package.PERSON_TYPE__BIRTHDATE:
				setBirthdate((BirthdateType)null);
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
			case _1Package.PERSON_TYPE__PERSON_NAME:
				return personName != null;
			case _1Package.PERSON_TYPE__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case _1Package.PERSON_TYPE__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case _1Package.PERSON_TYPE__BIRTHDATE:
				return birthdate != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonTypeImpl
