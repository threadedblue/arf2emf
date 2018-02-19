/**
 */
package gov.nist.scap.schema.asset.identification._1;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.OrganizationType#getWebsiteUrl <em>Website Url</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getOrganizationType()
 * @model extendedMetaData="name='organization-type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationType extends AssetType1 {
	/**
	 * Returns the value of the '<em><b>Organisation Name Details</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for organisation name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Name Details</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getOrganizationType_OrganisationNameDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationNameDetails' namespace='urn:oasis:names:tc:ciq:xsdschema:xNL:2.0'"
	 * @generated
	 */
	EList<OrganisationNameDetailsType> getOrganisationNameDetails();

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.EmailAddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An email address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getOrganizationType_EmailAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='email-address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EmailAddressType> getEmailAddress();

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.TelephoneNumberType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The telephone number. For a North American number, the number must be valid and the format
	 *                 must be XXX-XXX-XXXX where X is a digit. For an international number, the number must begin with a '+'
	 *                 symbol, followed by 7 to 15 digits. A space may be used between digits, as appropriate. For example: +88
	 *                 888 888 8 (this is following the ITU-T E.123 notation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getOrganizationType_TelephoneNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telephone-number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TelephoneNumberType1> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Website Url</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.WebsiteUrlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the website.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Website Url</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getOrganizationType_WebsiteUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='website-url' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WebsiteUrlType> getWebsiteUrl();

} // OrganizationType
