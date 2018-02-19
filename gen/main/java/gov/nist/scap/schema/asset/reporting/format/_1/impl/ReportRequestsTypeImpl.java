/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.ReportRequestType;
import gov.nist.scap.schema.asset.reporting.format._1.ReportRequestsType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Requests Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ReportRequestsTypeImpl#getReportRequest <em>Report Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportRequestsTypeImpl extends MinimalEObjectImpl.Container implements ReportRequestsType {
	/**
	 * The cached value of the '{@link #getReportRequest() <em>Report Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportRequestType> reportRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportRequestsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REPORT_REQUESTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportRequestType> getReportRequest() {
		if (reportRequest == null) {
			reportRequest = new EObjectContainmentEList<ReportRequestType>(ReportRequestType.class, this, _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST);
		}
		return reportRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST:
				return ((InternalEList<?>)getReportRequest()).basicRemove(otherEnd, msgs);
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
			case _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST:
				return getReportRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST:
				getReportRequest().clear();
				getReportRequest().addAll((Collection<? extends ReportRequestType>)newValue);
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
			case _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST:
				getReportRequest().clear();
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
			case _1Package.REPORT_REQUESTS_TYPE__REPORT_REQUEST:
				return reportRequest != null && !reportRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportRequestsTypeImpl
