/**
 */
package gov.nist.scap.schema.reporting.core._1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gov.nist.scap.schema.reporting.core._1._1Package
 * @generated
 */
public interface _1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_1Factory eINSTANCE = gov.nist.scap.schema.reporting.core._1.impl._1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relationships Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationships Container Type</em>'.
	 * @generated
	 */
	RelationshipsContainerType createRelationshipsContainerType();

	/**
	 * Returns a new object of class '<em>Relationships Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationships Type</em>'.
	 * @generated
	 */
	RelationshipsType createRelationshipsType();

	/**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
	RelationshipType createRelationshipType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_1Package get_1Package();

} //_1Factory
