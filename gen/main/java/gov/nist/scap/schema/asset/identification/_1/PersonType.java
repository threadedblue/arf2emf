/**
 */
package gov.nist.scap.schema.asset.identification._1;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PersonType#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PersonType#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PersonType#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PersonType#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPersonType()
 * @model extendedMetaData="name='person-type' kind='elementOnly'"
 * @generated
 */
public interface PersonType extends AssetType1 {
	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for person name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPersonType_PersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='urn:oasis:names:tc:ciq:xsdschema:xNL:2.0'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.EmailAddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An email address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPersonType_EmailAddress()
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
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPersonType_TelephoneNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telephone-number' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TelephoneNumberType1> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The birthdate of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birthdate</em>' containment reference.
	 * @see #setBirthdate(BirthdateType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPersonType_Birthdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='birthdate' namespace='##targetNamespace'"
	 * @generated
	 */
	BirthdateType getBirthdate();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PersonType#getBirthdate <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' containment reference.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(BirthdateType value);

} // PersonType
