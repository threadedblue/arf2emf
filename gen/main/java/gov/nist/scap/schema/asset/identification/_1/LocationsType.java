/**
 */
package gov.nist.scap.schema.asset.identification._1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationsType#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationsType#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationsType()
 * @model extendedMetaData="name='locations_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base for a subtitution group for elements that contain location
	 *                             information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Group</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationsType_LocationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='location:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationGroup();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base for a subtitution group for elements that contain location
	 *                             information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationsType_Location()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace' group='location:group'"
	 * @generated
	 */
	EList<EObject> getLocation();

} // LocationsType
