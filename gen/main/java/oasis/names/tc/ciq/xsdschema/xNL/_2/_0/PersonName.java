/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getPrecedingTitle <em>Preceding Title</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getTitle <em>Title</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getFirstName <em>First Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNamePrefix <em>Name Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getLastName <em>Last Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getOtherName <em>Other Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAlias <em>Alias</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGenerationIdentifier <em>Generation Identifier</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGeneralSuffix <em>General Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName()
 * @model extendedMetaData="name='PersonName' kind='elementOnly'"
 * @generated
 */
public interface PersonName extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Line</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name or part of a name defined as a free format text. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Line</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_NameLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameLineType> getNameLine();

	/**
	 * Returns the value of the '<em><b>Preceding Title</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * His Excellency,Estate of the Late ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preceding Title</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_PrecedingTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecedingTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrecedingTitleType> getPrecedingTitle();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greeting title. Example: Mr, Dr, Ms, Herr, etc. Can have multiple titles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the position of the name in a name string. Can be Given Name, Christian Name, Surname, family name, etc. Use the attribute "NameType" to define what type this name is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_FirstName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FirstName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FirstNameType> getFirstName();

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Middle name (essential part of the name for many nationalities). Represents the position of the name in the name string. Example: Sakthi in "Nivetha Sakthi Shantha". Can have multiple middle names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Middle Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_MiddleName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiddleName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MiddleNameType> getMiddleName();

	/**
	 * Returns the value of the '<em><b>Name Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * de, van, van de, von, etc. Example: Derick de Clarke
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Prefix</em>' containment reference.
	 * @see #setNamePrefix(NamePrefixType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_NamePrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamePrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	NamePrefixType getNamePrefix();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNamePrefix <em>Name Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Prefix</em>' containment reference.
	 * @see #getNamePrefix()
	 * @generated
	 */
	void setNamePrefix(NamePrefixType value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the position of the name in a name string. Can be Given Name, Christian Name, Surname, family name, etc. Use the attribute "NameType" to define what type this name is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_LastName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LastName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LastNameType> getLastName();

	/**
	 * Returns the value of the '<em><b>Other Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All other names, e.g.: Yousuf Khan al Hatab al Sayad
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_OtherName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherNameType> getOtherName();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nick Name, Pet name, etc..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AliasType> getAlias();

	/**
	 * Returns the value of the '<em><b>Generation Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jnr, Thr Third, III
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation Identifier</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_GenerationIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenerationIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenerationIdentifierType> getGenerationIdentifier();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Could be compressed initials - PhD, VC, QC
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_Suffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SuffixType> getSuffix();

	/**
	 * Returns the value of the '<em><b>General Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deceased, Retired ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Suffix</em>' containment reference.
	 * @see #setGeneralSuffix(GeneralSuffixType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_GeneralSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeneralSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralSuffixType getGeneralSuffix();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getGeneralSuffix <em>General Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Suffix</em>' containment reference.
	 * @see #getGeneralSuffix()
	 * @generated
	 */
	void setGeneralSuffix(GeneralSuffixType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name element code defined by postal standard groups like ECCMA, ADIS, UN/PROLIST for postal services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to another NameDetails element with no foreign key reinforcement. The referenced element may be out of the document and the document is still valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Details Key Ref</em>' attribute.
	 * @see #setNameDetailsKeyRef(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_NameDetailsKeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NameDetailsKeyRef'"
	 * @generated
	 */
	Object getNameDetailsKeyRef();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getNameDetailsKeyRef <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Details Key Ref</em>' attribute.
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 */
	void setNameDetailsKeyRef(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Name of a person. Example: Full name, Former Name, Known As, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName#getType <em>Type</em>}' attribute.
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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonName_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':15' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PersonName
