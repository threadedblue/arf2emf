/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.BuildingNameType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.MailStopType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseLocationType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNameType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberPrefixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberSuffixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseNumberType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.SubPremiseType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Premise Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremiseName <em>Sub Premise Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremiseLocation <em>Sub Premise Location</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremiseNumber <em>Sub Premise Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremiseNumberPrefix <em>Sub Premise Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremiseNumberSuffix <em>Sub Premise Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getFirm <em>Firm</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getMailStop <em>Mail Stop</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getSubPremise <em>Sub Premise</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.SubPremiseTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubPremiseTypeImpl extends MinimalEObjectImpl.Container implements SubPremiseType {
	/**
	 * The cached value of the '{@link #getAddressLine() <em>Address Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLine()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressLineType> addressLine;

	/**
	 * The cached value of the '{@link #getSubPremiseName() <em>Sub Premise Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremiseName()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPremiseNameType> subPremiseName;

	/**
	 * The cached value of the '{@link #getSubPremiseLocation() <em>Sub Premise Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremiseLocation()
	 * @generated
	 * @ordered
	 */
	protected SubPremiseLocationType subPremiseLocation;

	/**
	 * The cached value of the '{@link #getSubPremiseNumber() <em>Sub Premise Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremiseNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPremiseNumberType> subPremiseNumber;

	/**
	 * The cached value of the '{@link #getSubPremiseNumberPrefix() <em>Sub Premise Number Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremiseNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPremiseNumberPrefixType> subPremiseNumberPrefix;

	/**
	 * The cached value of the '{@link #getSubPremiseNumberSuffix() <em>Sub Premise Number Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremiseNumberSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPremiseNumberSuffixType> subPremiseNumberSuffix;

	/**
	 * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildingNameType> buildingName;

	/**
	 * The cached value of the '{@link #getFirm() <em>Firm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirm()
	 * @generated
	 * @ordered
	 */
	protected FirmType firm;

	/**
	 * The cached value of the '{@link #getMailStop() <em>Mail Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailStop()
	 * @generated
	 * @ordered
	 */
	protected MailStopType mailStop;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected PostalCodeType postalCode;

	/**
	 * The cached value of the '{@link #getSubPremise() <em>Sub Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremise()
	 * @generated
	 * @ordered
	 */
	protected SubPremiseType subPremise;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

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
	protected SubPremiseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSubPremiseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPremiseNameType> getSubPremiseName() {
		if (subPremiseName == null) {
			subPremiseName = new EObjectContainmentEList<SubPremiseNameType>(SubPremiseNameType.class, this, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME);
		}
		return subPremiseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseLocationType getSubPremiseLocation() {
		return subPremiseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPremiseLocation(SubPremiseLocationType newSubPremiseLocation, NotificationChain msgs) {
		SubPremiseLocationType oldSubPremiseLocation = subPremiseLocation;
		subPremiseLocation = newSubPremiseLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION, oldSubPremiseLocation, newSubPremiseLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPremiseLocation(SubPremiseLocationType newSubPremiseLocation) {
		if (newSubPremiseLocation != subPremiseLocation) {
			NotificationChain msgs = null;
			if (subPremiseLocation != null)
				msgs = ((InternalEObject)subPremiseLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION, null, msgs);
			if (newSubPremiseLocation != null)
				msgs = ((InternalEObject)newSubPremiseLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION, null, msgs);
			msgs = basicSetSubPremiseLocation(newSubPremiseLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION, newSubPremiseLocation, newSubPremiseLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPremiseNumberType> getSubPremiseNumber() {
		if (subPremiseNumber == null) {
			subPremiseNumber = new EObjectContainmentEList<SubPremiseNumberType>(SubPremiseNumberType.class, this, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER);
		}
		return subPremiseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPremiseNumberPrefixType> getSubPremiseNumberPrefix() {
		if (subPremiseNumberPrefix == null) {
			subPremiseNumberPrefix = new EObjectContainmentEList<SubPremiseNumberPrefixType>(SubPremiseNumberPrefixType.class, this, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX);
		}
		return subPremiseNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPremiseNumberSuffixType> getSubPremiseNumberSuffix() {
		if (subPremiseNumberSuffix == null) {
			subPremiseNumberSuffix = new EObjectContainmentEList<SubPremiseNumberSuffixType>(SubPremiseNumberSuffixType.class, this, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX);
		}
		return subPremiseNumberSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingNameType> getBuildingName() {
		if (buildingName == null) {
			buildingName = new EObjectContainmentEList<BuildingNameType>(BuildingNameType.class, this, _0Package.SUB_PREMISE_TYPE__BUILDING_NAME);
		}
		return buildingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmType getFirm() {
		return firm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirm(FirmType newFirm, NotificationChain msgs) {
		FirmType oldFirm = firm;
		firm = newFirm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__FIRM, oldFirm, newFirm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirm(FirmType newFirm) {
		if (newFirm != firm) {
			NotificationChain msgs = null;
			if (firm != null)
				msgs = ((InternalEObject)firm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__FIRM, null, msgs);
			if (newFirm != null)
				msgs = ((InternalEObject)newFirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__FIRM, null, msgs);
			msgs = basicSetFirm(newFirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__FIRM, newFirm, newFirm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailStopType getMailStop() {
		return mailStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMailStop(MailStopType newMailStop, NotificationChain msgs) {
		MailStopType oldMailStop = mailStop;
		mailStop = newMailStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__MAIL_STOP, oldMailStop, newMailStop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailStop(MailStopType newMailStop) {
		if (newMailStop != mailStop) {
			NotificationChain msgs = null;
			if (mailStop != null)
				msgs = ((InternalEObject)mailStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__MAIL_STOP, null, msgs);
			if (newMailStop != null)
				msgs = ((InternalEObject)newMailStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__MAIL_STOP, null, msgs);
			msgs = basicSetMailStop(newMailStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__MAIL_STOP, newMailStop, newMailStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalCodeType getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(PostalCodeType newPostalCode, NotificationChain msgs) {
		PostalCodeType oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(PostalCodeType newPostalCode) {
		if (newPostalCode != postalCode) {
			NotificationChain msgs = null;
			if (postalCode != null)
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseType getSubPremise() {
		return subPremise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPremise(SubPremiseType newSubPremise, NotificationChain msgs) {
		SubPremiseType oldSubPremise = subPremise;
		subPremise = newSubPremise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE, oldSubPremise, newSubPremise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPremise(SubPremiseType newSubPremise) {
		if (newSubPremise != subPremise) {
			NotificationChain msgs = null;
			if (subPremise != null)
				msgs = ((InternalEObject)subPremise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__SUB_PREMISE, null, msgs);
			if (newSubPremise != null)
				msgs = ((InternalEObject)newSubPremise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SUB_PREMISE_TYPE__SUB_PREMISE, null, msgs);
			msgs = basicSetSubPremise(newSubPremise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__SUB_PREMISE, newSubPremise, newSubPremise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.SUB_PREMISE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SUB_PREMISE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE);
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
			case _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME:
				return ((InternalEList<?>)getSubPremiseName()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION:
				return basicSetSubPremiseLocation(null, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER:
				return ((InternalEList<?>)getSubPremiseNumber()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX:
				return ((InternalEList<?>)getSubPremiseNumberPrefix()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getSubPremiseNumberSuffix()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__BUILDING_NAME:
				return ((InternalEList<?>)getBuildingName()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__FIRM:
				return basicSetFirm(null, msgs);
			case _0Package.SUB_PREMISE_TYPE__MAIL_STOP:
				return basicSetMailStop(null, msgs);
			case _0Package.SUB_PREMISE_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE:
				return basicSetSubPremise(null, msgs);
			case _0Package.SUB_PREMISE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME:
				return getSubPremiseName();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION:
				return getSubPremiseLocation();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER:
				return getSubPremiseNumber();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX:
				return getSubPremiseNumberPrefix();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX:
				return getSubPremiseNumberSuffix();
			case _0Package.SUB_PREMISE_TYPE__BUILDING_NAME:
				return getBuildingName();
			case _0Package.SUB_PREMISE_TYPE__FIRM:
				return getFirm();
			case _0Package.SUB_PREMISE_TYPE__MAIL_STOP:
				return getMailStop();
			case _0Package.SUB_PREMISE_TYPE__POSTAL_CODE:
				return getPostalCode();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE:
				return getSubPremise();
			case _0Package.SUB_PREMISE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.SUB_PREMISE_TYPE__TYPE:
				return getType();
			case _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME:
				getSubPremiseName().clear();
				getSubPremiseName().addAll((Collection<? extends SubPremiseNameType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION:
				setSubPremiseLocation((SubPremiseLocationType)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER:
				getSubPremiseNumber().clear();
				getSubPremiseNumber().addAll((Collection<? extends SubPremiseNumberType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX:
				getSubPremiseNumberPrefix().clear();
				getSubPremiseNumberPrefix().addAll((Collection<? extends SubPremiseNumberPrefixType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX:
				getSubPremiseNumberSuffix().clear();
				getSubPremiseNumberSuffix().addAll((Collection<? extends SubPremiseNumberSuffixType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				getBuildingName().addAll((Collection<? extends BuildingNameType>)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__FIRM:
				setFirm((FirmType)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__MAIL_STOP:
				setMailStop((MailStopType)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE:
				setSubPremise((SubPremiseType)newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__TYPE:
				setType(newValue);
				return;
			case _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME:
				getSubPremiseName().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION:
				setSubPremiseLocation((SubPremiseLocationType)null);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER:
				getSubPremiseNumber().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX:
				getSubPremiseNumberPrefix().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX:
				getSubPremiseNumberSuffix().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__FIRM:
				setFirm((FirmType)null);
				return;
			case _0Package.SUB_PREMISE_TYPE__MAIL_STOP:
				setMailStop((MailStopType)null);
				return;
			case _0Package.SUB_PREMISE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE:
				setSubPremise((SubPremiseType)null);
				return;
			case _0Package.SUB_PREMISE_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.SUB_PREMISE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.SUB_PREMISE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NAME:
				return subPremiseName != null && !subPremiseName.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION:
				return subPremiseLocation != null;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER:
				return subPremiseNumber != null && !subPremiseNumber.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX:
				return subPremiseNumberPrefix != null && !subPremiseNumberPrefix.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX:
				return subPremiseNumberSuffix != null && !subPremiseNumberSuffix.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__BUILDING_NAME:
				return buildingName != null && !buildingName.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__FIRM:
				return firm != null;
			case _0Package.SUB_PREMISE_TYPE__MAIL_STOP:
				return mailStop != null;
			case _0Package.SUB_PREMISE_TYPE__POSTAL_CODE:
				return postalCode != null;
			case _0Package.SUB_PREMISE_TYPE__SUB_PREMISE:
				return subPremise != null;
			case _0Package.SUB_PREMISE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.SUB_PREMISE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _0Package.SUB_PREMISE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SubPremiseTypeImpl
