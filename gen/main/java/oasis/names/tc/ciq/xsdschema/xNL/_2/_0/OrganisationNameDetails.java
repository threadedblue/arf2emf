/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation Name Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getOrganisationType <em>Organisation Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails()
 * @model extendedMetaData="name='OrganisationNameDetails' kind='elementOnly'"
 * @generated
 */
public interface OrganisationNameDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Line</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format text that defines the organisation name or parts of it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Line</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_NameLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameLineType> getNameLine();

	/**
	 * Returns the value of the '<em><b>Organisation Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the organisation. Example: MSI Business Solutions in "MSI Business Solutions Pty. Ltd" or the whole name itself 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_OrganisationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganisationNameType> getOrganisationName();

	/**
	 * Returns the value of the '<em><b>Organisation Type</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the legal status of an organisation. Example: Pty, Ltd, GmbH, etc. Pty. Ltd. in "XYZ Pty. Ltd"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Type</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_OrganisationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganisationTypeType> getOrganisationType();

	/**
	 * Returns the value of the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to another NameDetails element with no foreign key reinforcement. The referenced element may be out of the document and the document is still valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Details Key Ref</em>' attribute.
	 * @see #setNameDetailsKeyRef(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_NameDetailsKeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NameDetailsKeyRef'"
	 * @generated
	 */
	Object getNameDetailsKeyRef();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getNameDetailsKeyRef <em>Name Details Key Ref</em>}' attribute.
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
	 * Type of Organisation Name. Example: Former name, Known as, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails#getType <em>Type</em>}' attribute.
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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetails_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // OrganisationNameDetails
