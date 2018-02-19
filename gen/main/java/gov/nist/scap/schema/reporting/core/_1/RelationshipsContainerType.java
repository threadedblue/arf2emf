/**
 */
package gov.nist.scap.schema.reporting.core._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipsContainerType()
 * @model extendedMetaData="name='relationships-container-type' kind='elementOnly'"
 * @generated
 */
public interface RelationshipsContainerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a collection of relationship elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference.
	 * @see #setRelationships(RelationshipsType)
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipsContainerType_Relationships()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationships' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipsType getRelationships();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType#getRelationships <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationships</em>' containment reference.
	 * @see #getRelationships()
	 * @generated
	 */
	void setRelationships(RelationshipsType value);

} // RelationshipsContainerType
