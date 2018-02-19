/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getFormerName <em>Former Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getKnownAs <em>Known As</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonNameType()
 * @model extendedMetaData="name='PersonName_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonNameType extends PersonName {
	/**
	 * Returns the value of the '<em><b>Former Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Example: maiden name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Former Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonNameType_FormerName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FormerName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormerNameType> getFormerName();

	/**
	 * Returns the value of the '<em><b>Known As</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sometimes the same person is known under different unofficial or official names
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Known As</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonNameType_KnownAs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KnownAs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KnownAsType> getKnownAs();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this to import/use/reference name elements from other namespaces 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getPersonNameType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':18' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // PersonNameType
