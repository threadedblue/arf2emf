/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getNameType <em>Name Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType()
 * @model extendedMetaData="name='FirstName_._type' kind='mixed'"
 * @generated
 */
public interface FirstNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name element code defined by postal standard groups like ECCMA, ADIS, UN/PROLIST for postal services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Name Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the name type of first name. Example: Given Name, Christian Name, Father's Name, etc. In some countries, First name could be a Family Name or a SurName. Use this attribute to define the type for this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Type</em>' attribute.
	 * @see #setNameType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType_NameType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NameType'"
	 * @generated
	 */
	Object getNameType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getNameType <em>Name Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Type</em>' attribute.
	 * @see #getNameType()
	 * @generated
	 */
	void setNameType(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of first name. Example: Official, Un-official, abbreviation, initial, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType#getType <em>Type</em>}' attribute.
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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getFirstNameType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FirstNameType
