/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

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
 * An implementation of the model object '<em><b>Person Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getPrecedingTitle <em>Preceding Title</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getNamePrefix <em>Name Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getOtherName <em>Other Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getGenerationIdentifier <em>Generation Identifier</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getGeneralSuffix <em>General Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getNameDetailsKeyRef <em>Name Details Key Ref</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonNameImpl extends MinimalEObjectImpl.Container implements PersonName {
	/**
	 * The cached value of the '{@link #getNameLine() <em>Name Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLine()
	 * @generated
	 * @ordered
	 */
	protected EList<NameLineType> nameLine;

	/**
	 * The cached value of the '{@link #getPrecedingTitle() <em>Preceding Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedingTitleType> precedingTitle;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<TitleType> title;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<FirstNameType> firstName;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected EList<MiddleNameType> middleName;

	/**
	 * The cached value of the '{@link #getNamePrefix() <em>Name Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected NamePrefixType namePrefix;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<LastNameType> lastName;

	/**
	 * The cached value of the '{@link #getOtherName() <em>Other Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherName()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherNameType> otherName;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<AliasType> alias;

	/**
	 * The cached value of the '{@link #getGenerationIdentifier() <em>Generation Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<GenerationIdentifierType> generationIdentifier;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<SuffixType> suffix;

	/**
	 * The cached value of the '{@link #getGeneralSuffix() <em>General Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralSuffix()
	 * @generated
	 * @ordered
	 */
	protected GeneralSuffixType generalSuffix;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameDetailsKeyRef() <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_DETAILS_KEY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDetailsKeyRef() <em>Name Details Key Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDetailsKeyRef()
	 * @generated
	 * @ordered
	 */
	protected Object nameDetailsKeyRef = NAME_DETAILS_KEY_REF_EDEFAULT;

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
	protected PersonNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.PERSON_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameLineType> getNameLine() {
		if (nameLine == null) {
			nameLine = new EObjectContainmentEList<NameLineType>(NameLineType.class, this, _0Package.PERSON_NAME__NAME_LINE);
		}
		return nameLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedingTitleType> getPrecedingTitle() {
		if (precedingTitle == null) {
			precedingTitle = new EObjectContainmentEList<PrecedingTitleType>(PrecedingTitleType.class, this, _0Package.PERSON_NAME__PRECEDING_TITLE);
		}
		return precedingTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		if (title == null) {
			title = new EObjectContainmentEList<TitleType>(TitleType.class, this, _0Package.PERSON_NAME__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FirstNameType> getFirstName() {
		if (firstName == null) {
			firstName = new EObjectContainmentEList<FirstNameType>(FirstNameType.class, this, _0Package.PERSON_NAME__FIRST_NAME);
		}
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiddleNameType> getMiddleName() {
		if (middleName == null) {
			middleName = new EObjectContainmentEList<MiddleNameType>(MiddleNameType.class, this, _0Package.PERSON_NAME__MIDDLE_NAME);
		}
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamePrefixType getNamePrefix() {
		return namePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePrefix(NamePrefixType newNamePrefix, NotificationChain msgs) {
		NamePrefixType oldNamePrefix = namePrefix;
		namePrefix = newNamePrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__NAME_PREFIX, oldNamePrefix, newNamePrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePrefix(NamePrefixType newNamePrefix) {
		if (newNamePrefix != namePrefix) {
			NotificationChain msgs = null;
			if (namePrefix != null)
				msgs = ((InternalEObject)namePrefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.PERSON_NAME__NAME_PREFIX, null, msgs);
			if (newNamePrefix != null)
				msgs = ((InternalEObject)newNamePrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.PERSON_NAME__NAME_PREFIX, null, msgs);
			msgs = basicSetNamePrefix(newNamePrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__NAME_PREFIX, newNamePrefix, newNamePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LastNameType> getLastName() {
		if (lastName == null) {
			lastName = new EObjectContainmentEList<LastNameType>(LastNameType.class, this, _0Package.PERSON_NAME__LAST_NAME);
		}
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherNameType> getOtherName() {
		if (otherName == null) {
			otherName = new EObjectContainmentEList<OtherNameType>(OtherNameType.class, this, _0Package.PERSON_NAME__OTHER_NAME);
		}
		return otherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasType> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<AliasType>(AliasType.class, this, _0Package.PERSON_NAME__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenerationIdentifierType> getGenerationIdentifier() {
		if (generationIdentifier == null) {
			generationIdentifier = new EObjectContainmentEList<GenerationIdentifierType>(GenerationIdentifierType.class, this, _0Package.PERSON_NAME__GENERATION_IDENTIFIER);
		}
		return generationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuffixType> getSuffix() {
		if (suffix == null) {
			suffix = new EObjectContainmentEList<SuffixType>(SuffixType.class, this, _0Package.PERSON_NAME__SUFFIX);
		}
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralSuffixType getGeneralSuffix() {
		return generalSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralSuffix(GeneralSuffixType newGeneralSuffix, NotificationChain msgs) {
		GeneralSuffixType oldGeneralSuffix = generalSuffix;
		generalSuffix = newGeneralSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__GENERAL_SUFFIX, oldGeneralSuffix, newGeneralSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralSuffix(GeneralSuffixType newGeneralSuffix) {
		if (newGeneralSuffix != generalSuffix) {
			NotificationChain msgs = null;
			if (generalSuffix != null)
				msgs = ((InternalEObject)generalSuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.PERSON_NAME__GENERAL_SUFFIX, null, msgs);
			if (newGeneralSuffix != null)
				msgs = ((InternalEObject)newGeneralSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.PERSON_NAME__GENERAL_SUFFIX, null, msgs);
			msgs = basicSetGeneralSuffix(newGeneralSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__GENERAL_SUFFIX, newGeneralSuffix, newGeneralSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNameDetailsKeyRef() {
		return nameDetailsKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDetailsKeyRef(Object newNameDetailsKeyRef) {
		Object oldNameDetailsKeyRef = nameDetailsKeyRef;
		nameDetailsKeyRef = newNameDetailsKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__NAME_DETAILS_KEY_REF, oldNameDetailsKeyRef, nameDetailsKeyRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.PERSON_NAME__ANY_ATTRIBUTE);
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
			case _0Package.PERSON_NAME__NAME_LINE:
				return ((InternalEList<?>)getNameLine()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__PRECEDING_TITLE:
				return ((InternalEList<?>)getPrecedingTitle()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__FIRST_NAME:
				return ((InternalEList<?>)getFirstName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__MIDDLE_NAME:
				return ((InternalEList<?>)getMiddleName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__NAME_PREFIX:
				return basicSetNamePrefix(null, msgs);
			case _0Package.PERSON_NAME__LAST_NAME:
				return ((InternalEList<?>)getLastName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__OTHER_NAME:
				return ((InternalEList<?>)getOtherName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__GENERATION_IDENTIFIER:
				return ((InternalEList<?>)getGenerationIdentifier()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__SUFFIX:
				return ((InternalEList<?>)getSuffix()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME__GENERAL_SUFFIX:
				return basicSetGeneralSuffix(null, msgs);
			case _0Package.PERSON_NAME__ANY_ATTRIBUTE:
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
			case _0Package.PERSON_NAME__NAME_LINE:
				return getNameLine();
			case _0Package.PERSON_NAME__PRECEDING_TITLE:
				return getPrecedingTitle();
			case _0Package.PERSON_NAME__TITLE:
				return getTitle();
			case _0Package.PERSON_NAME__FIRST_NAME:
				return getFirstName();
			case _0Package.PERSON_NAME__MIDDLE_NAME:
				return getMiddleName();
			case _0Package.PERSON_NAME__NAME_PREFIX:
				return getNamePrefix();
			case _0Package.PERSON_NAME__LAST_NAME:
				return getLastName();
			case _0Package.PERSON_NAME__OTHER_NAME:
				return getOtherName();
			case _0Package.PERSON_NAME__ALIAS:
				return getAlias();
			case _0Package.PERSON_NAME__GENERATION_IDENTIFIER:
				return getGenerationIdentifier();
			case _0Package.PERSON_NAME__SUFFIX:
				return getSuffix();
			case _0Package.PERSON_NAME__GENERAL_SUFFIX:
				return getGeneralSuffix();
			case _0Package.PERSON_NAME__CODE:
				return getCode();
			case _0Package.PERSON_NAME__NAME_DETAILS_KEY_REF:
				return getNameDetailsKeyRef();
			case _0Package.PERSON_NAME__TYPE:
				return getType();
			case _0Package.PERSON_NAME__ANY_ATTRIBUTE:
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
			case _0Package.PERSON_NAME__NAME_LINE:
				getNameLine().clear();
				getNameLine().addAll((Collection<? extends NameLineType>)newValue);
				return;
			case _0Package.PERSON_NAME__PRECEDING_TITLE:
				getPrecedingTitle().clear();
				getPrecedingTitle().addAll((Collection<? extends PrecedingTitleType>)newValue);
				return;
			case _0Package.PERSON_NAME__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case _0Package.PERSON_NAME__FIRST_NAME:
				getFirstName().clear();
				getFirstName().addAll((Collection<? extends FirstNameType>)newValue);
				return;
			case _0Package.PERSON_NAME__MIDDLE_NAME:
				getMiddleName().clear();
				getMiddleName().addAll((Collection<? extends MiddleNameType>)newValue);
				return;
			case _0Package.PERSON_NAME__NAME_PREFIX:
				setNamePrefix((NamePrefixType)newValue);
				return;
			case _0Package.PERSON_NAME__LAST_NAME:
				getLastName().clear();
				getLastName().addAll((Collection<? extends LastNameType>)newValue);
				return;
			case _0Package.PERSON_NAME__OTHER_NAME:
				getOtherName().clear();
				getOtherName().addAll((Collection<? extends OtherNameType>)newValue);
				return;
			case _0Package.PERSON_NAME__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends AliasType>)newValue);
				return;
			case _0Package.PERSON_NAME__GENERATION_IDENTIFIER:
				getGenerationIdentifier().clear();
				getGenerationIdentifier().addAll((Collection<? extends GenerationIdentifierType>)newValue);
				return;
			case _0Package.PERSON_NAME__SUFFIX:
				getSuffix().clear();
				getSuffix().addAll((Collection<? extends SuffixType>)newValue);
				return;
			case _0Package.PERSON_NAME__GENERAL_SUFFIX:
				setGeneralSuffix((GeneralSuffixType)newValue);
				return;
			case _0Package.PERSON_NAME__CODE:
				setCode(newValue);
				return;
			case _0Package.PERSON_NAME__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(newValue);
				return;
			case _0Package.PERSON_NAME__TYPE:
				setType(newValue);
				return;
			case _0Package.PERSON_NAME__ANY_ATTRIBUTE:
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
			case _0Package.PERSON_NAME__NAME_LINE:
				getNameLine().clear();
				return;
			case _0Package.PERSON_NAME__PRECEDING_TITLE:
				getPrecedingTitle().clear();
				return;
			case _0Package.PERSON_NAME__TITLE:
				getTitle().clear();
				return;
			case _0Package.PERSON_NAME__FIRST_NAME:
				getFirstName().clear();
				return;
			case _0Package.PERSON_NAME__MIDDLE_NAME:
				getMiddleName().clear();
				return;
			case _0Package.PERSON_NAME__NAME_PREFIX:
				setNamePrefix((NamePrefixType)null);
				return;
			case _0Package.PERSON_NAME__LAST_NAME:
				getLastName().clear();
				return;
			case _0Package.PERSON_NAME__OTHER_NAME:
				getOtherName().clear();
				return;
			case _0Package.PERSON_NAME__ALIAS:
				getAlias().clear();
				return;
			case _0Package.PERSON_NAME__GENERATION_IDENTIFIER:
				getGenerationIdentifier().clear();
				return;
			case _0Package.PERSON_NAME__SUFFIX:
				getSuffix().clear();
				return;
			case _0Package.PERSON_NAME__GENERAL_SUFFIX:
				setGeneralSuffix((GeneralSuffixType)null);
				return;
			case _0Package.PERSON_NAME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case _0Package.PERSON_NAME__NAME_DETAILS_KEY_REF:
				setNameDetailsKeyRef(NAME_DETAILS_KEY_REF_EDEFAULT);
				return;
			case _0Package.PERSON_NAME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _0Package.PERSON_NAME__ANY_ATTRIBUTE:
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
			case _0Package.PERSON_NAME__NAME_LINE:
				return nameLine != null && !nameLine.isEmpty();
			case _0Package.PERSON_NAME__PRECEDING_TITLE:
				return precedingTitle != null && !precedingTitle.isEmpty();
			case _0Package.PERSON_NAME__TITLE:
				return title != null && !title.isEmpty();
			case _0Package.PERSON_NAME__FIRST_NAME:
				return firstName != null && !firstName.isEmpty();
			case _0Package.PERSON_NAME__MIDDLE_NAME:
				return middleName != null && !middleName.isEmpty();
			case _0Package.PERSON_NAME__NAME_PREFIX:
				return namePrefix != null;
			case _0Package.PERSON_NAME__LAST_NAME:
				return lastName != null && !lastName.isEmpty();
			case _0Package.PERSON_NAME__OTHER_NAME:
				return otherName != null && !otherName.isEmpty();
			case _0Package.PERSON_NAME__ALIAS:
				return alias != null && !alias.isEmpty();
			case _0Package.PERSON_NAME__GENERATION_IDENTIFIER:
				return generationIdentifier != null && !generationIdentifier.isEmpty();
			case _0Package.PERSON_NAME__SUFFIX:
				return suffix != null && !suffix.isEmpty();
			case _0Package.PERSON_NAME__GENERAL_SUFFIX:
				return generalSuffix != null;
			case _0Package.PERSON_NAME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case _0Package.PERSON_NAME__NAME_DETAILS_KEY_REF:
				return NAME_DETAILS_KEY_REF_EDEFAULT == null ? nameDetailsKeyRef != null : !NAME_DETAILS_KEY_REF_EDEFAULT.equals(nameDetailsKeyRef);
			case _0Package.PERSON_NAME__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _0Package.PERSON_NAME__ANY_ATTRIBUTE:
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
		result.append(" (code: ");
		result.append(code);
		result.append(", nameDetailsKeyRef: ");
		result.append(nameDetailsKeyRef);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PersonNameImpl
