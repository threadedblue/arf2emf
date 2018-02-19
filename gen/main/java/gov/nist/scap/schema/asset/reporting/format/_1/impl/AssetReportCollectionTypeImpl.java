/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.AssetReportCollectionType;
import gov.nist.scap.schema.asset.reporting.format._1.AssetsType;
import gov.nist.scap.schema.asset.reporting.format._1.ExtendedInfosType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportsType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import gov.nist.scap.schema.reporting.core._1.impl.RelationshipsContainerTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Report Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getReportRequests <em>Report Requests</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getReports <em>Reports</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getExtendedInfos <em>Extended Infos</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.AssetReportCollectionTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetReportCollectionTypeImpl extends RelationshipsContainerTypeImpl implements AssetReportCollectionType {
	/**
	 * The cached value of the '{@link #getReportRequests() <em>Report Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportRequests()
	 * @generated
	 * @ordered
	 */
	protected ReportRequestsType reportRequests;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected AssetsType assets;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected ReportsType reports;

	/**
	 * The cached value of the '{@link #getExtendedInfos() <em>Extended Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInfos()
	 * @generated
	 * @ordered
	 */
	protected ExtendedInfosType extendedInfos;

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
	protected AssetReportCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.ASSET_REPORT_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportRequestsType getReportRequests() {
		return reportRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportRequests(ReportRequestsType newReportRequests, NotificationChain msgs) {
		ReportRequestsType oldReportRequests = reportRequests;
		reportRequests = newReportRequests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS, oldReportRequests, newReportRequests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportRequests(ReportRequestsType newReportRequests) {
		if (newReportRequests != reportRequests) {
			NotificationChain msgs = null;
			if (reportRequests != null)
				msgs = ((InternalEObject)reportRequests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS, null, msgs);
			if (newReportRequests != null)
				msgs = ((InternalEObject)newReportRequests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS, null, msgs);
			msgs = basicSetReportRequests(newReportRequests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS, newReportRequests, newReportRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsType getAssets() {
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssets(AssetsType newAssets, NotificationChain msgs) {
		AssetsType oldAssets = assets;
		assets = newAssets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS, oldAssets, newAssets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(AssetsType newAssets) {
		if (newAssets != assets) {
			NotificationChain msgs = null;
			if (assets != null)
				msgs = ((InternalEObject)assets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS, null, msgs);
			if (newAssets != null)
				msgs = ((InternalEObject)newAssets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS, null, msgs);
			msgs = basicSetAssets(newAssets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS, newAssets, newAssets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportsType getReports() {
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReports(ReportsType newReports, NotificationChain msgs) {
		ReportsType oldReports = reports;
		reports = newReports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS, oldReports, newReports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReports(ReportsType newReports) {
		if (newReports != reports) {
			NotificationChain msgs = null;
			if (reports != null)
				msgs = ((InternalEObject)reports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS, null, msgs);
			if (newReports != null)
				msgs = ((InternalEObject)newReports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS, null, msgs);
			msgs = basicSetReports(newReports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS, newReports, newReports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedInfosType getExtendedInfos() {
		return extendedInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedInfos(ExtendedInfosType newExtendedInfos, NotificationChain msgs) {
		ExtendedInfosType oldExtendedInfos = extendedInfos;
		extendedInfos = newExtendedInfos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS, oldExtendedInfos, newExtendedInfos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedInfos(ExtendedInfosType newExtendedInfos) {
		if (newExtendedInfos != extendedInfos) {
			NotificationChain msgs = null;
			if (extendedInfos != null)
				msgs = ((InternalEObject)extendedInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS, null, msgs);
			if (newExtendedInfos != null)
				msgs = ((InternalEObject)newExtendedInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS, null, msgs);
			msgs = basicSetExtendedInfos(newExtendedInfos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS, newExtendedInfos, newExtendedInfos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ASSET_REPORT_COLLECTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE);
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
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS:
				return basicSetReportRequests(null, msgs);
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS:
				return basicSetAssets(null, msgs);
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS:
				return basicSetReports(null, msgs);
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS:
				return basicSetExtendedInfos(null, msgs);
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS:
				return getReportRequests();
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS:
				return getAssets();
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS:
				return getReports();
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS:
				return getExtendedInfos();
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ID:
				return getId();
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS:
				setReportRequests((ReportRequestsType)newValue);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS:
				setAssets((AssetsType)newValue);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS:
				setReports((ReportsType)newValue);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS:
				setExtendedInfos((ExtendedInfosType)newValue);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ID:
				setId((String)newValue);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS:
				setReportRequests((ReportRequestsType)null);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS:
				setAssets((AssetsType)null);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS:
				setReports((ReportsType)null);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS:
				setExtendedInfos((ExtendedInfosType)null);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORT_REQUESTS:
				return reportRequests != null;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ASSETS:
				return assets != null;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__REPORTS:
				return reports != null;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__EXTENDED_INFOS:
				return extendedInfos != null;
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _1Package.ASSET_REPORT_COLLECTION_TYPE__ANY_ATTRIBUTE:
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

} //AssetReportCollectionTypeImpl
