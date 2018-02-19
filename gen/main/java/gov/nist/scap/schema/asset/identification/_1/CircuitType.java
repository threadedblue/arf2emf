/**
 */
package gov.nist.scap.schema.asset.identification._1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.CircuitType#getCircuitName <em>Circuit Name</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getCircuitType()
 * @model extendedMetaData="name='circuit-type' kind='elementOnly'"
 * @generated
 */
public interface CircuitType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Circuit Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The common name for the circult.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circuit Name</em>' containment reference.
	 * @see #setCircuitName(CircuitNameType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getCircuitType_CircuitName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='circuit-name' namespace='##targetNamespace'"
	 * @generated
	 */
	CircuitNameType getCircuitName();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.CircuitType#getCircuitName <em>Circuit Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Name</em>' containment reference.
	 * @see #getCircuitName()
	 * @generated
	 */
	void setCircuitName(CircuitNameType value);

} // CircuitType
