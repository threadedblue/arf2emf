/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.ContentType;
import gov.nist.scap.schema.asset.reporting.format._1.RemoteResourceType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl#getRemoteResource <em>Remote Resource</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportTypeImpl extends MinimalEObjectImpl.Container implements ReportType {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected ContentType content;

	/**
	 * The cached value of the '{@link #getRemoteResource() <em>Remote Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteResource()
	 * @generated
	 * @ordered
	 */
	protected RemoteResourceType remoteResource;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(ContentType newContent, NotificationChain msgs) {
		ContentType oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REPORT_TYPE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(ContentType newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REPORT_TYPE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REPORT_TYPE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REPORT_TYPE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteResourceType getRemoteResource() {
		return remoteResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteResource(RemoteResourceType newRemoteResource, NotificationChain msgs) {
		RemoteResourceType oldRemoteResource = remoteResource;
		remoteResource = newRemoteResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REPORT_TYPE__REMOTE_RESOURCE, oldRemoteResource, newRemoteResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteResource(RemoteResourceType newRemoteResource) {
		if (newRemoteResource != remoteResource) {
			NotificationChain msgs = null;
			if (remoteResource != null)
				msgs = ((InternalEObject)remoteResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REPORT_TYPE__REMOTE_RESOURCE, null, msgs);
			if (newRemoteResource != null)
				msgs = ((InternalEObject)newRemoteResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REPORT_TYPE__REMOTE_RESOURCE, null, msgs);
			msgs = basicSetRemoteResource(newRemoteResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REPORT_TYPE__REMOTE_RESOURCE, newRemoteResource, newRemoteResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REPORT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _1Package.REPORT_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REPORT_TYPE__CONTENT:
				return basicSetContent(null, msgs);
			case _1Package.REPORT_TYPE__REMOTE_RESOURCE:
				return basicSetRemoteResource(null, msgs);
			case _1Package.REPORT_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _1Package.REPORT_TYPE__CONTENT:
				return getContent();
			case _1Package.REPORT_TYPE__REMOTE_RESOURCE:
				return getRemoteResource();
			case _1Package.REPORT_TYPE__ID:
				return getId();
			case _1Package.REPORT_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _1Package.REPORT_TYPE__CONTENT:
				setContent((ContentType)newValue);
				return;
			case _1Package.REPORT_TYPE__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)newValue);
				return;
			case _1Package.REPORT_TYPE__ID:
				setId((String)newValue);
				return;
			case _1Package.REPORT_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _1Package.REPORT_TYPE__CONTENT:
				setContent((ContentType)null);
				return;
			case _1Package.REPORT_TYPE__REMOTE_RESOURCE:
				setRemoteResource((RemoteResourceType)null);
				return;
			case _1Package.REPORT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _1Package.REPORT_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _1Package.REPORT_TYPE__CONTENT:
				return content != null;
			case _1Package.REPORT_TYPE__REMOTE_RESOURCE:
				return remoteResource != null;
			case _1Package.REPORT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _1Package.REPORT_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ReportTypeImpl
