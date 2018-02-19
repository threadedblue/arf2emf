/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getJointPersonName <em>Joint Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getNameDetails <em>Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXNL <em>XNL</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function of the Person defined. Example: Managing Director, CEO, Marketing Manager, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_Function()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Joint Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container to define more than one person name. Example: Mrs Mary Johnson and Mr.Patrick Johnson
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Joint Person Name</em>' containment reference.
	 * @see #setJointPersonName(JointPersonNameType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_JointPersonName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JointPersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	JointPersonNameType getJointPersonName();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getJointPersonName <em>Joint Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint Person Name</em>' containment reference.
	 * @see #getJointPersonName()
	 * @generated
	 */
	void setJointPersonName(JointPersonNameType value);

	/**
	 * Returns the value of the '<em><b>Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for defining the name of a Person or an Organisation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Details</em>' containment reference.
	 * @see #setNameDetails(NameDetailsType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_NameDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NameDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	NameDetailsType getNameDetails();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getNameDetails <em>Name Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Details</em>' containment reference.
	 * @see #getNameDetails()
	 * @generated
	 */
	void setNameDetails(NameDetailsType value);

	/**
	 * Returns the value of the '<em><b>Organisation Name Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for organisation name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Name Details</em>' containment reference.
	 * @see #setOrganisationNameDetails(OrganisationNameDetailsType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_OrganisationNameDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganisationNameDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganisationNameDetailsType getOrganisationNameDetails();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getOrganisationNameDetails <em>Organisation Name Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Name Details</em>' containment reference.
	 * @see #getOrganisationNameDetails()
	 * @generated
	 */
	void setOrganisationNameDetails(OrganisationNameDetailsType value);

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for person name details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference.
	 * @see #setPersonName(PersonNameType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_PersonName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonNameType getPersonName();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getPersonName <em>Person Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' containment reference.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(PersonNameType value);

	/**
	 * Returns the value of the '<em><b>XNL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root element to define name of a Person or an Organisation  in detail
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XNL</em>' containment reference.
	 * @see #setXNL(XNLType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDocumentRoot_XNL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xNL' namespace='##targetNamespace'"
	 * @generated
	 */
	XNLType getXNL();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot#getXNL <em>XNL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XNL</em>' containment reference.
	 * @see #getXNL()
	 * @generated
	 */
	void setXNL(XNLType value);

} // DocumentRoot
