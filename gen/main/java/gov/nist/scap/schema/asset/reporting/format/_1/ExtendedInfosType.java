/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Infos Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType#getExtendedInfo <em>Extended Info</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getExtendedInfosType()
 * @model extendedMetaData="name='extended-infos_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedInfosType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Info</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains other information.  Use as an extension point for data that does not fall into the categories defined in asset-report-collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Info</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getExtendedInfosType_ExtendedInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extended-info' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedInfoType> getExtendedInfo();

} // ExtendedInfosType
