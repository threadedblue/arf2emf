/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAddressDetails <em>Address Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getVersion <em>Version</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getXALType()
 * @model extendedMetaData="name='xAL_._type' kind='elementOnly'"
 * @generated
 */
public interface XALType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Details</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressDetails}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This container defines the details of the address. Can define multiple addresses including tracking address history
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Details</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getXALType_AddressDetails()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AddressDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressDetails> getAddressDetails();

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
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getXALType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific to DTD to specify the version number of DTD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getXALType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.XALType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

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
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getXALType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // XALType
