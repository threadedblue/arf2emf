/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getDependencyType <em>Dependency Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDependencyNameType()
 * @model extendedMetaData="name='DependencyName_._type' kind='elementOnly'"
 * @generated
 */
public interface DependencyNameType extends NameDetails {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this to import/use/reference elements from other namespaces 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDependencyNameType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the dependency: in trust of, on behalf of, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Type</em>' attribute.
	 * @see #setDependencyType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDependencyNameType_DependencyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='DependencyType'"
	 * @generated
	 */
	Object getDependencyType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getDependencyType <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Type</em>' attribute.
	 * @see #getDependencyType()
	 * @generated
	 */
	void setDependencyType(Object value);

	/**
	 * Returns the value of the '<em><b>Name Details Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to another NameDetails element with no foreign key reinforcement. The referenced element may be out of the document and the document is still valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Details Key Ref</em>' attribute.
	 * @see #setNameDetailsKeyRef(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getDependencyNameType_NameDetailsKeyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NameDetailsKeyRef'"
	 * @generated
	 */
	Object getNameDetailsKeyRef();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType#getNameDetailsKeyRef <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Details Key Ref</em>' attribute.
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 */
	void setNameDetailsKeyRef(Object value);

} // DependencyNameType
