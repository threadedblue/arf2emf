/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Known As Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidTo <em>Valid To</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getKnownAsType()
 * @model extendedMetaData="name='KnownAs_._type' kind='elementOnly'"
 * @generated
 */
public interface KnownAsType extends PersonName {
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
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getKnownAsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':16' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first date when the name is valid. Inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getKnownAsType_ValidFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='ValidFrom'"
	 * @generated
	 */
	Object getValidFrom();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Object value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last date when the name is valid. Inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #setValidTo(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getKnownAsType_ValidTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='ValidTo'"
	 * @generated
	 */
	Object getValidTo();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(Object value);

} // KnownAsType
