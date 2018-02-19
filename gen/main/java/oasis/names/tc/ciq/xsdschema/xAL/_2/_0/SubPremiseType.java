/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Premise Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseName <em>Sub Premise Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseLocation <em>Sub Premise Location</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumber <em>Sub Premise Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberPrefix <em>Sub Premise Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseNumberSuffix <em>Sub Premise Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getFirm <em>Firm</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getMailStop <em>Mail Stop</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremise <em>Sub Premise</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType()
 * @model extendedMetaData="name='SubPremiseType' kind='elementOnly'"
 * @generated
 */
public interface SubPremiseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Sub Premise Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the SubPremise
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremiseName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremiseName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubPremiseNameType> getSubPremiseName();

	/**
	 * Returns the value of the '<em><b>Sub Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the SubPremise Location. eg. LOBBY, BASEMENT, GROUND FLOOR, etc...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise Location</em>' containment reference.
	 * @see #setSubPremiseLocation(SubPremiseLocationType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremiseLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremiseLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	SubPremiseLocationType getSubPremiseLocation();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremiseLocation <em>Sub Premise Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Premise Location</em>' containment reference.
	 * @see #getSubPremiseLocation()
	 * @generated
	 */
	void setSubPremiseLocation(SubPremiseLocationType value);

	/**
	 * Returns the value of the '<em><b>Sub Premise Number</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Specification of the identifier of a sub-premise. Examples of sub-premises are apartments and suites. sub-premises in a building are often uniquely identified by means of consecutive
	 * identifiers. The identifier can be a number, a letter or any combination of the two. In the latter case, the identifier includes exactly one variable (range) part, which is either a 
	 * number or a single letter that is surrounded by fixed parts at the left (prefix) or the right (postfix).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise Number</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremiseNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremiseNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubPremiseNumberType> getSubPremiseNumber();

	/**
	 * Returns the value of the '<em><b>Sub Premise Number Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Prefix of the sub premise number. eg. A in A-12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise Number Prefix</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremiseNumberPrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremiseNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubPremiseNumberPrefixType> getSubPremiseNumberPrefix();

	/**
	 * Returns the value of the '<em><b>Sub Premise Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Suffix of the sub premise number. eg. A in 12A
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise Number Suffix</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremiseNumberSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremiseNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubPremiseNumberSuffixType> getSubPremiseNumberSuffix();

	/**
	 * Returns the value of the '<em><b>Building Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the building
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Building Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_BuildingName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BuildingNameType> getBuildingName();

	/**
	 * Returns the value of the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a firm, company, organization, etc. It can be specified as part of an address that contains a street or a postbox. It is therefore different from a large mail user address, which contains no street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Firm</em>' containment reference.
	 * @see #setFirm(FirmType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_Firm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Firm' namespace='##targetNamespace'"
	 * @generated
	 */
	FirmType getFirm();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getFirm <em>Firm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firm</em>' containment reference.
	 * @see #getFirm()
	 * @generated
	 */
	void setFirm(FirmType value);

	/**
	 * Returns the value of the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MailStop is where the the mail is delivered to within a premise/subpremise/firm or a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Stop</em>' containment reference.
	 * @see #setMailStop(MailStopType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_MailStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MailStop' namespace='##targetNamespace'"
	 * @generated
	 */
	MailStopType getMailStop();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getMailStop <em>Mail Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Stop</em>' containment reference.
	 * @see #getMailStop()
	 * @generated
	 */
	void setMailStop(MailStopType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

	/**
	 * Returns the value of the '<em><b>Sub Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a single sub-premise. Examples of sub-premises are apartments and suites. 
	 * Each sub-premise should be uniquely identifiable. SubPremiseType: Specification of the name of a sub-premise type. Possible values not limited to: Suite, Appartment, Floor, Unknown
	 * Multiple levels within a premise by recursively calling SubPremise Eg. Level 4, Suite 2, Block C
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise</em>' containment reference.
	 * @see #setSubPremise(SubPremiseType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_SubPremise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremise' namespace='##targetNamespace'"
	 * @generated
	 */
	SubPremiseType getSubPremise();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getSubPremise <em>Sub Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Premise</em>' containment reference.
	 * @see #getSubPremise()
	 * @generated
	 */
	void setSubPremise(SubPremiseType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getSubPremiseType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SubPremiseType
