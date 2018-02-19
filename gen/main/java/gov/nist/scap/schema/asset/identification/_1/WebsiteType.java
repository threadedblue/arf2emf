/**
 */
package gov.nist.scap.schema.asset.identification._1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getDocumentRoot <em>Document Root</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see gov.nist.scap.schema.asset.identification._1._1Package#getWebsiteType()
 * @model extendedMetaData="name='website-type' kind='elementOnly'"
 * @generated
 */
public interface WebsiteType extends ItAssetType {
	/**
	 * Returns the value of the '<em><b>Document Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The absolute path to the document root location of the website on the
	 *                                 host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Root</em>' containment reference.
	 * @see #setDocumentRoot(DocumentRootType)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getWebsiteType_DocumentRoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document-root' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentRootType getDocumentRoot();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getDocumentRoot <em>Document Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Root</em>' containment reference.
	 * @see #getDocumentRoot()
	 * @generated
	 */
	void setDocumentRoot(DocumentRootType value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The locale of the website represented as an RFC 5646 language, and optionally, region code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale</em>' containment reference.
	 * @see #setLocale(LocaleType1)
	 * @see gov.nist.scap.schema.asset.identification._1._1Package#getWebsiteType_Locale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locale' namespace='##targetNamespace'"
	 * @generated
	 */
	LocaleType1 getLocale();

	/**
	 * Sets the value of the '{@link gov.nist.scap.schema.asset.identification._1.WebsiteType#getLocale <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' containment reference.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(LocaleType1 value);

} // WebsiteType
