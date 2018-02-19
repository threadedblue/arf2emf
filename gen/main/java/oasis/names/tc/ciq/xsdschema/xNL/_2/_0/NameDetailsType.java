/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Details Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAddresseeIndicator <em>Addressee Indicator</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getFunction <em>Function</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getDependencyName <em>Dependency Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getNameDetailsKey <em>Name Details Key</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType()
 * @model extendedMetaData="name='NameDetails_._type' kind='elementOnly'"
 * @generated
 */
public interface NameDetailsType extends NameDetails {
	/**
	 * Returns the value of the '<em><b>Addressee Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific for name and address where the addressee is specified. eg. ATTENTION, ter attentie van (in Holland), etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressee Indicator</em>' containment reference.
	 * @see #setAddresseeIndicator(AddresseeIndicatorType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType_AddresseeIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddresseeIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	AddresseeIndicatorType getAddresseeIndicator();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getAddresseeIndicator <em>Addressee Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressee Indicator</em>' containment reference.
	 * @see #getAddresseeIndicator()
	 * @generated
	 */
	void setAddresseeIndicator(AddresseeIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function of the Person defined. Example: Managing Director, CEO, Marketing Manager, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Dependency Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for a name of a dependent person or organisation. Example: Ram Kumar, C/O MSI Business Solutions
	 * DependencyType: Person-Person/Person-Organisation Relationship (care of, wife of, position, etc). Can have sublement with name structure or reference another top-level element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Name</em>' containment reference.
	 * @see #setDependencyName(DependencyNameType)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType_DependencyName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependencyName' namespace='##targetNamespace'"
	 * @generated
	 */
	DependencyNameType getDependencyName();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getDependencyName <em>Dependency Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Name</em>' containment reference.
	 * @see #getDependencyName()
	 * @generated
	 */
	void setDependencyName(DependencyNameType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this to import/use/reference name elements from other namespaces 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Name Details Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key identifier for the element for not reinforced references from other elements. Not required to be unique for the document to be valid, but application may get confused if not unique. Extend this schema adding unique contraint if needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Details Key</em>' attribute.
	 * @see #setNameDetailsKey(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getNameDetailsType_NameDetailsKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NameDetailsKey'"
	 * @generated
	 */
	Object getNameDetailsKey();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType#getNameDetailsKey <em>Name Details Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Details Key</em>' attribute.
	 * @see #getNameDetailsKey()
	 * @generated
	 */
	void setNameDetailsKey(Object value);

} // NameDetailsType
