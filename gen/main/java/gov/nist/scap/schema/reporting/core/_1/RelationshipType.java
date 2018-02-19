/**
 */
package gov.nist.scap.schema.reporting.core._1;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The relationship-type encapsulates a complete relationship from a subject to one or more
 *                 objects. It is the responsibility of the XML Schema adopting this type to implement the necessary
 *                 id/idref instances to ensure that @subject and ref refer to valid elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getRef <em>Ref</em>}</li>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope <em>Scope</em>}</li>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType()
 * @model extendedMetaData="name='relationship-type' kind='elementOnly'"
 * @generated
 */
public interface RelationshipType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must contain the ID of the object of the relationship being established. The
	 *                         implementing XML Schema of relationship-type SHOULD implement the necessary id/idref constructs
	 *                         to ensure a valid reference is constructed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute list.
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType_Ref()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRef();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"inclusive"</code>.
	 * The literals are from the enumeration {@link gov.nist.scap.schema.reporting.core._1.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how multiple <ref> elements should be interpreted in this
	 *                     relationship. If "inclusive" is specified, then the relationship being defined is between the
	 *                     subject and the collection of objects indicated by the <ref> elements (i.e. the
	 *                     relationship is not necessarily relevant for any one particular object being referenced, but for the
	 *                     collection of objects referenced). If "exclusive" is specified, then the relationship being defined
	 *                     is between the content payload and each object individually (i.e. this is the same as specifying
	 *                     multiple relationship elements, each with the same @type and subject).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(ScopeType)
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType_Scope()
	 * @model default="inclusive" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	ScopeType getScope();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see gov.nist.scap.schema.reporting.core._1.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeType value);

	/**
	 * Unsets the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	boolean isSetScope();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must contain the ID of the subject of the relationship being established. The
	 *                     implementing XML Schema of relationship-type SHOULD implement the necessary id/idref constructs to
	 *                     ensure a valid reference is constructed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType_Subject()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='subject'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of relationship (predicate) being defined between the subject and
	 *                     the object of the relationship. The value is a QName that should reference a term in a controlled
	 *                     vocabulary which is understood by both the producing and consuming parties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.reporting.core._1.RelationshipType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A placeholder so that content creators can add attributes as
	 *                     desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#getRelationshipType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RelationshipType
