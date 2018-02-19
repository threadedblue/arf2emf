/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.EmailAddressType;
import gov.nist.scap.schema.asset.identification._1.OrganizationType;
import gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1;
import gov.nist.scap.schema.asset.identification._1.WebsiteUrlType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.OrganizationTypeImpl#getWebsiteUrl <em>Website Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationTypeImpl extends AssetType1Impl implements OrganizationType {
	/**
	 * The cached value of the '{@link #getOrganisationNameDetails() <em>Organisation Name Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationNameDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationNameDetailsType> organisationNameDetails;

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
	 * The cached value of the '{@link #getWebsiteUrl() <em>Website Url</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<WebsiteUrlType> websiteUrl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.ORGANIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationNameDetailsType> getOrganisationNameDetails() {
		if (organisationNameDetails == null) {
			organisationNameDetails = new EObjectContainmentEList<OrganisationNameDetailsType>(OrganisationNameDetailsType.class, this, _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS);
		}
		return organisationNameDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmailAddressType> getEmailAddress() {
		if (emailAddress == null) {
			emailAddress = new EObjectContainmentEList<EmailAddressType>(EmailAddressType.class, this, _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS);
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
			telephoneNumber = new EObjectContainmentEList<TelephoneNumberType1>(TelephoneNumberType1.class, this, _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebsiteUrlType> getWebsiteUrl() {
		if (websiteUrl == null) {
			websiteUrl = new EObjectContainmentEList<WebsiteUrlType>(WebsiteUrlType.class, this, _1Package.ORGANIZATION_TYPE__WEBSITE_URL);
		}
		return websiteUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS:
				return ((InternalEList<?>)getOrganisationNameDetails()).basicRemove(otherEnd, msgs);
			case _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				return ((InternalEList<?>)getEmailAddress()).basicRemove(otherEnd, msgs);
			case _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return ((InternalEList<?>)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case _1Package.ORGANIZATION_TYPE__WEBSITE_URL:
				return ((InternalEList<?>)getWebsiteUrl()).basicRemove(otherEnd, msgs);
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
			case _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS:
				return getOrganisationNameDetails();
			case _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
			case _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case _1Package.ORGANIZATION_TYPE__WEBSITE_URL:
				return getWebsiteUrl();
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
			case _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS:
				getOrganisationNameDetails().clear();
				getOrganisationNameDetails().addAll((Collection<? extends OrganisationNameDetailsType>)newValue);
				return;
			case _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection<? extends EmailAddressType>)newValue);
				return;
			case _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends TelephoneNumberType1>)newValue);
				return;
			case _1Package.ORGANIZATION_TYPE__WEBSITE_URL:
				getWebsiteUrl().clear();
				getWebsiteUrl().addAll((Collection<? extends WebsiteUrlType>)newValue);
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
			case _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS:
				getOrganisationNameDetails().clear();
				return;
			case _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case _1Package.ORGANIZATION_TYPE__WEBSITE_URL:
				getWebsiteUrl().clear();
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
			case _1Package.ORGANIZATION_TYPE__ORGANISATION_NAME_DETAILS:
				return organisationNameDetails != null && !organisationNameDetails.isEmpty();
			case _1Package.ORGANIZATION_TYPE__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case _1Package.ORGANIZATION_TYPE__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case _1Package.ORGANIZATION_TYPE__WEBSITE_URL:
				return websiteUrl != null && !websiteUrl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationTypeImpl
