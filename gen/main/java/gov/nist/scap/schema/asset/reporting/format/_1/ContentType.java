/**
 */
package gov.nist.scap.schema.asset.reporting.format._1;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAny <em>Any</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidEndDate <em>Data Valid End Date</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidStartDate <em>Data Valid Start Date</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getContentType()
 * @model extendedMetaData="name='content_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getContentType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Data Valid End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Valid End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Valid End Date</em>' attribute.
	 * @see #setDataValidEndDate(XMLGregorianCalendar)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getContentType_DataValidEndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='data-valid-end-date'"
	 * @generated
	 */
	XMLGregorianCalendar getDataValidEndDate();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidEndDate <em>Data Valid End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Valid End Date</em>' attribute.
	 * @see #getDataValidEndDate()
	 * @generated
	 */
	void setDataValidEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Data Valid Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Valid Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Valid Start Date</em>' attribute.
	 * @see #setDataValidStartDate(XMLGregorianCalendar)
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getContentType_DataValidStartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='data-valid-start-date'"
	 * @generated
	 */
	XMLGregorianCalendar getDataValidStartDate();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.reporting.format._1.ContentType#getDataValidStartDate <em>Data Valid Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Valid Start Date</em>' attribute.
	 * @see #getDataValidStartDate()
	 * @generated
	 */
	void setDataValidStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A placeholder so that content creators can add attributes as desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.nist.scap.schema.asset.reporting.format._1._1Package#getContentType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ContentType
