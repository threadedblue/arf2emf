/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType#getRefId <em>Ref Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getObjectRefType()
 * @model extendedMetaData="name='object-ref_._type' kind='empty'"
 * @generated
 */
public interface ObjectRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Id</em>' attribute.
	 * @see #setRefId(String)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getObjectRefType_RefId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='ref-id'"
	 * @generated
	 */
	String getRefId();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ObjectRefType#getRefId <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Id</em>' attribute.
	 * @see #getRefId()
	 * @generated
	 */
	void setRefId(String value);

} // ObjectRefType
