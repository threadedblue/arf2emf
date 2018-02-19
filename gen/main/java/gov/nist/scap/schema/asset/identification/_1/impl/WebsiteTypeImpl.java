/**
 */
package gov.nist.scap.schema.asset.identification._1.impl;

import gov.nist.scap.schema.asset.identification._1.DocumentRootType;
import gov.nist.scap.schema.asset.identification._1.LocaleType1;
import gov.nist.scap.schema.asset.identification._1.WebsiteType;
import gov.nist.scap.schema.asset.identification._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Website Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl#getDocumentRoot <em>Document Root</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.identification._1.impl.WebsiteTypeImpl#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsiteTypeImpl extends ItAssetTypeImpl implements WebsiteType {
	/**
	 * The cached value of the '{@link #getDocumentRoot() <em>Document Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoot()
	 * @generated
	 * @ordered
	 */
	protected DocumentRootType documentRoot;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected LocaleType1 locale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.WEBSITE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootType getDocumentRoot() {
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentRoot(DocumentRootType newDocumentRoot, NotificationChain msgs) {
		DocumentRootType oldDocumentRoot = documentRoot;
		documentRoot = newDocumentRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.WEBSITE_TYPE__DOCUMENT_ROOT, oldDocumentRoot, newDocumentRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRoot(DocumentRootType newDocumentRoot) {
		if (newDocumentRoot != documentRoot) {
			NotificationChain msgs = null;
			if (documentRoot != null)
				msgs = ((InternalEObject)documentRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.WEBSITE_TYPE__DOCUMENT_ROOT, null, msgs);
			if (newDocumentRoot != null)
				msgs = ((InternalEObject)newDocumentRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.WEBSITE_TYPE__DOCUMENT_ROOT, null, msgs);
			msgs = basicSetDocumentRoot(newDocumentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WEBSITE_TYPE__DOCUMENT_ROOT, newDocumentRoot, newDocumentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleType1 getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocale(LocaleType1 newLocale, NotificationChain msgs) {
		LocaleType1 oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.WEBSITE_TYPE__LOCALE, oldLocale, newLocale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(LocaleType1 newLocale) {
		if (newLocale != locale) {
			NotificationChain msgs = null;
			if (locale != null)
				msgs = ((InternalEObject)locale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.WEBSITE_TYPE__LOCALE, null, msgs);
			if (newLocale != null)
				msgs = ((InternalEObject)newLocale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.WEBSITE_TYPE__LOCALE, null, msgs);
			msgs = basicSetLocale(newLocale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WEBSITE_TYPE__LOCALE, newLocale, newLocale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.WEBSITE_TYPE__DOCUMENT_ROOT:
				return basicSetDocumentRoot(null, msgs);
			case _1Package.WEBSITE_TYPE__LOCALE:
				return basicSetLocale(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.WEBSITE_TYPE__DOCUMENT_ROOT:
				return getDocumentRoot();
			case _1Package.WEBSITE_TYPE__LOCALE:
				return getLocale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.WEBSITE_TYPE__DOCUMENT_ROOT:
				setDocumentRoot((DocumentRootType)newValue);
				return;
			case _1Package.WEBSITE_TYPE__LOCALE:
				setLocale((LocaleType1)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.WEBSITE_TYPE__DOCUMENT_ROOT:
				setDocumentRoot((DocumentRootType)null);
				return;
			case _1Package.WEBSITE_TYPE__LOCALE:
				setLocale((LocaleType1)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.WEBSITE_TYPE__DOCUMENT_ROOT:
				return documentRoot != null;
			case _1Package.WEBSITE_TYPE__LOCALE:
				return locale != null;
		}
		return super.eIsSet(featureID);
	}

} //WebsiteTypeImpl
