/**
 */
package gov.nist.scap.schema.asset.identification._1;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation <em>Elevation</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius <em>Radius</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType()
 * @model extendedMetaData="name='location-point_._type' kind='empty'"
 * @generated
 */
public interface LocationPointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation of the asset, specified in meters from sea level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #setElevation(double)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Elevation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='elevation'"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Unsets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevation()
	 * @see #getElevation()
	 * @see #setElevation(double)
	 * @generated
	 */
	void unsetElevation();

	/**
	 * Returns whether the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getElevation <em>Elevation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation</em>' attribute is set.
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @see #setElevation(double)
	 * @generated
	 */
	boolean isSetElevation();

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The latitude of the asset, defined between -90 (90 degrees South, inclusive) and
	 *                         90 (90 degrees North, inclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #setLatitude(double)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Latitude()
	 * @model unsettable="true" dataType="gov.nist.scap.schema.asset.identification._1.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='latitude'"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Unsets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	void unsetLatitude();

	/**
	 * Returns whether the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLatitude <em>Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Latitude</em>' attribute is set.
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	boolean isSetLatitude();

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The longitude of the asset, defined between -180 (180 degrees West, exclusive) and
	 *                         180 (180 degrees East, inclusive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #setLongitude(double)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Longitude()
	 * @model unsettable="true" dataType="gov.nist.scap.schema.asset.identification._1.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='longitude'"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Unsets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	void unsetLongitude();

	/**
	 * Returns whether the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getLongitude <em>Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitude</em>' attribute is set.
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	boolean isSetLongitude();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The radius of a horizontal circle centered on the point within which the asset
	 *                         resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(double)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Radius()
	 * @model unsettable="true" dataType="gov.nist.scap.schema.asset.identification._1.RadiusType"
	 *        extendedMetaData="kind='attribute' name='radius'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Unsets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	boolean isSetRadius();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the source of the information. The value of this field is left open to the
	 *                 content producer, but MAY include a synthetic ID of the asset which sourced the information, another ID
	 *                 of the source, or a description of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the data was last known to be correct.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.LocationPointType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getLocationPointType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // LocationPointType
