/**
 */
package gov.nist.scap.schema.asset.identification._1;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType()
 * @model extendedMetaData="name='port-range_._type' kind='empty'"
 * @generated
 */
public interface PortRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(BigInteger)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType_LowerBound()
	 * @model dataType="gov.nist.scap.schema.asset.identification._1.PortType" required="true"
	 *        extendedMetaData="kind='attribute' name='lower-bound'"
	 * @generated
	 */
	BigInteger getLowerBound();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(BigInteger value);

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
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getSource <em>Source</em>}' attribute.
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
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(BigInteger)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType_UpperBound()
	 * @model dataType="gov.nist.scap.schema.asset.identification._1.PortType" required="true"
	 *        extendedMetaData="kind='attribute' name='upper-bound'"
	 * @generated
	 */
	BigInteger getUpperBound();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.PortRangeType#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(BigInteger value);

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
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getPortRangeType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PortRangeType
