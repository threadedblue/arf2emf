/**
 */
package gov.nist.scap.schema.asset.identification._1;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getSyntheticId <em>Synthetic Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getLocations <em>Locations</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getExtendedInformation <em>Extended Information</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetType1()
 * @model abstract="true"
 *        extendedMetaData="name='asset-type' kind='elementOnly'"
 * @generated
 */
public interface AssetType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Synthetic Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.scap.schema.asset.identification._1.SyntheticIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the synthetic ID for the asset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synthetic Id</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetType1_SyntheticId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synthetic-id' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SyntheticIdType> getSyntheticId();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more locations where this asset resides
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetType1_Locations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locations' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationsType getLocations();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType value);

	/**
	 * Returns the value of the '<em><b>Extended Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a container to hold any addtional identifying information for an asset, as
	 *                         specified by the content creator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Information</em>' containment reference.
	 * @see #setExtendedInformation(ExtendedInformationType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetType1_ExtendedInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extended-information' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedInformationType getExtendedInformation();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getExtendedInformation <em>Extended Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Information</em>' containment reference.
	 * @see #getExtendedInformation()
	 * @generated
	 */
	void setExtendedInformation(ExtendedInformationType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the data was last known to be correct.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getAssetType1_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.AssetType1#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

} // AssetType1
