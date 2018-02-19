/**
 */
package gov.nist.scap.schema.reporting.core._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipsType#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipsType()
 * @model extendedMetaData="name='relationships_._type' kind='elementOnly'"
 * @generated
 */
public interface RelationshipsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.reporting.core._1.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipsType_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationshipType> getRelationship();

} // RelationshipsType
