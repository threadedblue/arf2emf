/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Premise Number Range To Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberRangeToType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getPremiseNumberRangeToType()
 * @model extendedMetaData="name='PremiseNumberRangeTo_._type' kind='elementOnly'"
 * @generated
 */
public interface PremiseNumberRangeToType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getPremiseNumberRangeToType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberPrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in A12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Prefix</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getPremiseNumberRangeToType_PremiseNumberPrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberPrefixType> getPremiseNumberPrefix();

	/**
	 * Returns the value of the '<em><b>Premise Number</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the identifier of the premise (house, building, etc). Premises in a street are often uniquely identified by means of consecutive identifiers. The identifier can be a number, a letter or any combination of the two.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getPremiseNumberRangeToType_PremiseNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PremiseNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberType> getPremiseNumber();

	/**
	 * Returns the value of the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseNumberSuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in 12A
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Suffix</em>' containment reference list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package#getPremiseNumberRangeToType_PremiseNumberSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberSuffixType> getPremiseNumberSuffix();

} // PremiseNumberRangeToType
