/**
 */
package gov.nist.scap.schema.asset.reporting.format._1.impl;

import gov.nist.scap.schema.asset.reporting.format._1.ContentType;
import gov.nist.scap.schema.asset.reporting.format._1._1Package;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl#getDataValidEndDate <em>Data Valid End Date</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl#getDataValidStartDate <em>Data Valid Start Date</em>}</li>
 *   <li>{@link gov.nist.scap.schema.asset.reporting.format._1.impl.ContentTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTypeImpl extends MinimalEObjectImpl.Container implements ContentType {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getDataValidEndDate() <em>Data Valid End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValidEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_VALID_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataValidEndDate() <em>Data Valid End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValidEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataValidEndDate = DATA_VALID_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataValidStartDate() <em>Data Valid Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValidStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_VALID_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataValidStartDate() <em>Data Valid Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValidStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataValidStartDate = DATA_VALID_START_DATE_EDEFAULT;

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
	protected ContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _1Package.CONTENT_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataValidEndDate() {
		return dataValidEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValidEndDate(XMLGregorianCalendar newDataValidEndDate) {
		XMLGregorianCalendar oldDataValidEndDate = dataValidEndDate;
		dataValidEndDate = newDataValidEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CONTENT_TYPE__DATA_VALID_END_DATE, oldDataValidEndDate, dataValidEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataValidStartDate() {
		return dataValidStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValidStartDate(XMLGregorianCalendar newDataValidStartDate) {
		XMLGregorianCalendar oldDataValidStartDate = dataValidStartDate;
		dataValidStartDate = newDataValidStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.CONTENT_TYPE__DATA_VALID_START_DATE, oldDataValidStartDate, dataValidStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _1Package.CONTENT_TYPE__ANY_ATTRIBUTE);
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
			case _1Package.CONTENT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _1Package.CONTENT_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.CONTENT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _1Package.CONTENT_TYPE__DATA_VALID_END_DATE:
				return getDataValidEndDate();
			case _1Package.CONTENT_TYPE__DATA_VALID_START_DATE:
				return getDataValidStartDate();
			case _1Package.CONTENT_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.CONTENT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _1Package.CONTENT_TYPE__DATA_VALID_END_DATE:
				setDataValidEndDate((XMLGregorianCalendar)newValue);
				return;
			case _1Package.CONTENT_TYPE__DATA_VALID_START_DATE:
				setDataValidStartDate((XMLGregorianCalendar)newValue);
				return;
			case _1Package.CONTENT_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.CONTENT_TYPE__ANY:
				getAny().clear();
				return;
			case _1Package.CONTENT_TYPE__DATA_VALID_END_DATE:
				setDataValidEndDate(DATA_VALID_END_DATE_EDEFAULT);
				return;
			case _1Package.CONTENT_TYPE__DATA_VALID_START_DATE:
				setDataValidStartDate(DATA_VALID_START_DATE_EDEFAULT);
				return;
			case _1Package.CONTENT_TYPE__ANY_ATTRIBUTE:
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
			case _1Package.CONTENT_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _1Package.CONTENT_TYPE__DATA_VALID_END_DATE:
				return DATA_VALID_END_DATE_EDEFAULT == null ? dataValidEndDate != null : !DATA_VALID_END_DATE_EDEFAULT.equals(dataValidEndDate);
			case _1Package.CONTENT_TYPE__DATA_VALID_START_DATE:
				return DATA_VALID_START_DATE_EDEFAULT == null ? dataValidStartDate != null : !DATA_VALID_START_DATE_EDEFAULT.equals(dataValidStartDate);
			case _1Package.CONTENT_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", dataValidEndDate: ");
		result.append(dataValidEndDate);
		result.append(", dataValidStartDate: ");
		result.append(dataValidStartDate);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ContentTypeImpl
