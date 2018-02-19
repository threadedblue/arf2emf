/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation Name Details Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationFormerName <em>Organisation Former Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getOrganisationKnownAs <em>Organisation Known As</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetailsType()
 * @model extendedMetaData="name='OrganisationNameDetails_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganisationNameDetailsType extends OrganisationNameDetails {
	/**
	 * Returns the value of the '<em><b>Organisation Former Name</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name history for the organisation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Former Name</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetailsType_OrganisationFormerName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationFormerName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganisationFormerNameType> getOrganisationFormerName();

	/**
	 * Returns the value of the '<em><b>Organisation Known As</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other names the organisation can be known under.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Known As</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetailsType_OrganisationKnownAs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganisationKnownAs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganisationKnownAsType> getOrganisationKnownAs();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this to import/use/reference name elements from other namespaces 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#getOrganisationNameDetailsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // OrganisationNameDetailsType
