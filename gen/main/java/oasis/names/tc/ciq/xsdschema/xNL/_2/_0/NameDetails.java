/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getJointPersonName <em>Joint Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPartyType <em>Party Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails()
 * @model extendedMetaData="name='NameDetails' kind='elementOnly'"
 * @generated
 */
public interface NameDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Line</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define name as a free format text. Use this when the type of the entity (person or organisation) is unknown, or not broken into individual elements or is beyond the provided types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Line</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_NameLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameLineType> getNameLine();

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for person name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_PersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container to define more than one person name. Example: Mrs Mary Johnson and Mr.Patrick Johnson
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Joint Person Name</em>' containment reference.
	 * @see #setJointPersonName(JointPersonNameType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_JointPersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JointPersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	JointPersonNameType getJointPersonName();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getJointPersonName <em>Joint Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint Person Name</em>' containment reference.
	 * @see #getJointPersonName()
	 * @generated
	 */
	void setJointPersonName(JointPersonNameType value);

	/**
	 * Returns the value of the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for organisation name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Name Details</em>' containment reference.
	 * @see #setOrganisationNameDetails(OrganisationNameDetailsType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_OrganisationNameDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationNameDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganisationNameDetailsType getOrganisationNameDetails();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getOrganisationNameDetails <em>Organisation Name Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Name Details</em>' containment reference.
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	void setOrganisationNameDetails(OrganisationNameDetailsType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name element code defined by postal standard groups like ECCMA, ADIS, UN/PROLIST for postal services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of entity i.e described namely, Person or an Organisation. An Organisation could be: Club, Association, Company, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Type</em>' attribute.
	 * @see #setPartyType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_PartyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PartyType'"
	 * @generated
	 */
	Object getPartyType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails#getPartyType <em>Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Type</em>' attribute.
	 * @see #getPartyType()
	 * @generated
	 */
	void setPartyType(Object value);

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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetails_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // NameDetails
