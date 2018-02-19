/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Locality Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getDependentLocalityNumberType()
 * @model extendedMetaData="name='DependentLocalityNumber_._type' kind='mixed'"
 * @generated
 */
public interface DependentLocalityNumberType extends EObject {
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
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getDependentLocalityNumberType_Mixed()
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
	 * Used by postal services to encode the name of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getDependentLocalityNumberType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Name Number Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eg. SECTOR occurs before 5 in SECTOR 5
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Number Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @see #isSetNameNumberOccurrence()
	 * @see #unsetNameNumberOccurrence()
	 * @see #setNameNumberOccurrence(NameNumberOccurrenceType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getDependentLocalityNumberType_NameNumberOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NameNumberOccurrence'"
	 * @generated
	 */
	NameNumberOccurrenceType getNameNumberOccurrence();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Number Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0.NameNumberOccurrenceType
	 * @see #isSetNameNumberOccurrence()
	 * @see #unsetNameNumberOccurrence()
	 * @see #getNameNumberOccurrence()
	 * @generated
	 */
	void setNameNumberOccurrence(NameNumberOccurrenceType value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameNumberOccurrence()
	 * @see #getNameNumberOccurrence()
	 * @see #setNameNumberOccurrence(NameNumberOccurrenceType)
	 * @generated
	 */
	void unsetNameNumberOccurrence();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Number Occurrence</em>' attribute is set.
	 * @see #unsetNameNumberOccurrence()
	 * @see #getNameNumberOccurrence()
	 * @see #setNameNumberOccurrence(NameNumberOccurrenceType)
	 * @generated
	 */
	boolean isSetNameNumberOccurrence();

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
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getDependentLocalityNumberType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DependentLocalityNumberType
