/**
 */
package oasis.names.tc.ciq.xsdschema.xAL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.AddressLineType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentLocalityType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfareType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.DependentThoroughfaresType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.FirmType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PostalCodeType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.PremiseType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareLeadingTypeType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNameType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberPrefixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberRangeType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberSuffixType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareNumberType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePostDirectionType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfarePreDirectionType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareTrailingTypeType;
import oasis.names.tc.ciq.xsdschema.xAL._2._0.ThoroughfareType;
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
 * An implementation of the model object '<em><b>Thoroughfare Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareNumberRange <em>Thoroughfare Number Range</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareName <em>Thoroughfare Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentThoroughfare <em>Dependent Thoroughfare</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentLocality <em>Dependent Locality</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getFirm <em>Firm</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentThoroughfares <em>Dependent Thoroughfares</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL._2._0.impl.ThoroughfareTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThoroughfareTypeImpl extends MinimalEObjectImpl.Container implements ThoroughfareType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getThoroughfareNumberPrefix() <em>Thoroughfare Number Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<ThoroughfareNumberPrefixType> thoroughfareNumberPrefix;

	/**
	 * The cached value of the '{@link #getThoroughfareNumberSuffix() <em>Thoroughfare Number Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareNumberSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<ThoroughfareNumberSuffixType> thoroughfareNumberSuffix;

	/**
	 * The cached value of the '{@link #getThoroughfarePreDirection() <em>Thoroughfare Pre Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfarePreDirection()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfarePreDirectionType thoroughfarePreDirection;

	/**
	 * The cached value of the '{@link #getThoroughfareLeadingType() <em>Thoroughfare Leading Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareLeadingType()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareLeadingTypeType thoroughfareLeadingType;

	/**
	 * The cached value of the '{@link #getThoroughfareName() <em>Thoroughfare Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareName()
	 * @generated
	 * @ordered
	 */
	protected EList<ThoroughfareNameType> thoroughfareName;

	/**
	 * The cached value of the '{@link #getThoroughfareTrailingType() <em>Thoroughfare Trailing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareTrailingType()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareTrailingTypeType thoroughfareTrailingType;

	/**
	 * The cached value of the '{@link #getThoroughfarePostDirection() <em>Thoroughfare Post Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfarePostDirection()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfarePostDirectionType thoroughfarePostDirection;

	/**
	 * The cached value of the '{@link #getDependentThoroughfare() <em>Dependent Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfare()
	 * @generated
	 * @ordered
	 */
	protected DependentThoroughfareType dependentThoroughfare;

	/**
	 * The cached value of the '{@link #getDependentLocality() <em>Dependent Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentLocality()
	 * @generated
	 * @ordered
	 */
	protected DependentLocalityType dependentLocality;

	/**
	 * The cached value of the '{@link #getPremise() <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremise()
	 * @generated
	 * @ordered
	 */
	protected PremiseType premise;

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
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected PostalCodeType postalCode;

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
	 * The default value of the '{@link #getDependentThoroughfares() <em>Dependent Thoroughfares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfares()
	 * @generated
	 * @ordered
	 */
	protected static final DependentThoroughfaresType DEPENDENT_THOROUGHFARES_EDEFAULT = DependentThoroughfaresType.YES;

	/**
	 * The cached value of the '{@link #getDependentThoroughfares() <em>Dependent Thoroughfares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfares()
	 * @generated
	 * @ordered
	 */
	protected DependentThoroughfaresType dependentThoroughfares = DEPENDENT_THOROUGHFARES_EDEFAULT;

	/**
	 * This is true if the Dependent Thoroughfares attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dependentThoroughfaresESet;

	/**
	 * The default value of the '{@link #getDependentThoroughfaresConnector() <em>Dependent Thoroughfares Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresConnector()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEPENDENT_THOROUGHFARES_CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentThoroughfaresConnector() <em>Dependent Thoroughfares Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresConnector()
	 * @generated
	 * @ordered
	 */
	protected Object dependentThoroughfaresConnector = DEPENDENT_THOROUGHFARES_CONNECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentThoroughfaresIndicator() <em>Dependent Thoroughfares Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEPENDENT_THOROUGHFARES_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentThoroughfaresIndicator() <em>Dependent Thoroughfares Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresIndicator()
	 * @generated
	 * @ordered
	 */
	protected Object dependentThoroughfaresIndicator = DEPENDENT_THOROUGHFARES_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentThoroughfaresType() <em>Dependent Thoroughfares Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresType()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEPENDENT_THOROUGHFARES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentThoroughfaresType() <em>Dependent Thoroughfares Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentThoroughfaresType()
	 * @generated
	 * @ordered
	 */
	protected Object dependentThoroughfaresType = DEPENDENT_THOROUGHFARES_TYPE_EDEFAULT;

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
	protected ThoroughfareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getThoroughfareType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _0Package.THOROUGHFARE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberType> getThoroughfareNumber() {
		return getGroup().list(_0Package.eINSTANCE.getThoroughfareType_ThoroughfareNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberRangeType> getThoroughfareNumberRange() {
		return getGroup().list(_0Package.eINSTANCE.getThoroughfareType_ThoroughfareNumberRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberPrefixType> getThoroughfareNumberPrefix() {
		if (thoroughfareNumberPrefix == null) {
			thoroughfareNumberPrefix = new EObjectContainmentEList<ThoroughfareNumberPrefixType>(ThoroughfareNumberPrefixType.class, this, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX);
		}
		return thoroughfareNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberSuffixType> getThoroughfareNumberSuffix() {
		if (thoroughfareNumberSuffix == null) {
			thoroughfareNumberSuffix = new EObjectContainmentEList<ThoroughfareNumberSuffixType>(ThoroughfareNumberSuffixType.class, this, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX);
		}
		return thoroughfareNumberSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePreDirectionType getThoroughfarePreDirection() {
		return thoroughfarePreDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfarePreDirection(ThoroughfarePreDirectionType newThoroughfarePreDirection, NotificationChain msgs) {
		ThoroughfarePreDirectionType oldThoroughfarePreDirection = thoroughfarePreDirection;
		thoroughfarePreDirection = newThoroughfarePreDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, oldThoroughfarePreDirection, newThoroughfarePreDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfarePreDirection(ThoroughfarePreDirectionType newThoroughfarePreDirection) {
		if (newThoroughfarePreDirection != thoroughfarePreDirection) {
			NotificationChain msgs = null;
			if (thoroughfarePreDirection != null)
				msgs = ((InternalEObject)thoroughfarePreDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, null, msgs);
			if (newThoroughfarePreDirection != null)
				msgs = ((InternalEObject)newThoroughfarePreDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, null, msgs);
			msgs = basicSetThoroughfarePreDirection(newThoroughfarePreDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, newThoroughfarePreDirection, newThoroughfarePreDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareLeadingTypeType getThoroughfareLeadingType() {
		return thoroughfareLeadingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareLeadingType(ThoroughfareLeadingTypeType newThoroughfareLeadingType, NotificationChain msgs) {
		ThoroughfareLeadingTypeType oldThoroughfareLeadingType = thoroughfareLeadingType;
		thoroughfareLeadingType = newThoroughfareLeadingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, oldThoroughfareLeadingType, newThoroughfareLeadingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareLeadingType(ThoroughfareLeadingTypeType newThoroughfareLeadingType) {
		if (newThoroughfareLeadingType != thoroughfareLeadingType) {
			NotificationChain msgs = null;
			if (thoroughfareLeadingType != null)
				msgs = ((InternalEObject)thoroughfareLeadingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, null, msgs);
			if (newThoroughfareLeadingType != null)
				msgs = ((InternalEObject)newThoroughfareLeadingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, null, msgs);
			msgs = basicSetThoroughfareLeadingType(newThoroughfareLeadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, newThoroughfareLeadingType, newThoroughfareLeadingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNameType> getThoroughfareName() {
		if (thoroughfareName == null) {
			thoroughfareName = new EObjectContainmentEList<ThoroughfareNameType>(ThoroughfareNameType.class, this, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME);
		}
		return thoroughfareName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareTrailingTypeType getThoroughfareTrailingType() {
		return thoroughfareTrailingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareTrailingType(ThoroughfareTrailingTypeType newThoroughfareTrailingType, NotificationChain msgs) {
		ThoroughfareTrailingTypeType oldThoroughfareTrailingType = thoroughfareTrailingType;
		thoroughfareTrailingType = newThoroughfareTrailingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, oldThoroughfareTrailingType, newThoroughfareTrailingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareTrailingType(ThoroughfareTrailingTypeType newThoroughfareTrailingType) {
		if (newThoroughfareTrailingType != thoroughfareTrailingType) {
			NotificationChain msgs = null;
			if (thoroughfareTrailingType != null)
				msgs = ((InternalEObject)thoroughfareTrailingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, null, msgs);
			if (newThoroughfareTrailingType != null)
				msgs = ((InternalEObject)newThoroughfareTrailingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, null, msgs);
			msgs = basicSetThoroughfareTrailingType(newThoroughfareTrailingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, newThoroughfareTrailingType, newThoroughfareTrailingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePostDirectionType getThoroughfarePostDirection() {
		return thoroughfarePostDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfarePostDirection(ThoroughfarePostDirectionType newThoroughfarePostDirection, NotificationChain msgs) {
		ThoroughfarePostDirectionType oldThoroughfarePostDirection = thoroughfarePostDirection;
		thoroughfarePostDirection = newThoroughfarePostDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, oldThoroughfarePostDirection, newThoroughfarePostDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfarePostDirection(ThoroughfarePostDirectionType newThoroughfarePostDirection) {
		if (newThoroughfarePostDirection != thoroughfarePostDirection) {
			NotificationChain msgs = null;
			if (thoroughfarePostDirection != null)
				msgs = ((InternalEObject)thoroughfarePostDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, null, msgs);
			if (newThoroughfarePostDirection != null)
				msgs = ((InternalEObject)newThoroughfarePostDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, null, msgs);
			msgs = basicSetThoroughfarePostDirection(newThoroughfarePostDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, newThoroughfarePostDirection, newThoroughfarePostDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentThoroughfareType getDependentThoroughfare() {
		return dependentThoroughfare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentThoroughfare(DependentThoroughfareType newDependentThoroughfare, NotificationChain msgs) {
		DependentThoroughfareType oldDependentThoroughfare = dependentThoroughfare;
		dependentThoroughfare = newDependentThoroughfare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE, oldDependentThoroughfare, newDependentThoroughfare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentThoroughfare(DependentThoroughfareType newDependentThoroughfare) {
		if (newDependentThoroughfare != dependentThoroughfare) {
			NotificationChain msgs = null;
			if (dependentThoroughfare != null)
				msgs = ((InternalEObject)dependentThoroughfare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE, null, msgs);
			if (newDependentThoroughfare != null)
				msgs = ((InternalEObject)newDependentThoroughfare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE, null, msgs);
			msgs = basicSetDependentThoroughfare(newDependentThoroughfare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE, newDependentThoroughfare, newDependentThoroughfare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityType getDependentLocality() {
		return dependentLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentLocality(DependentLocalityType newDependentLocality, NotificationChain msgs) {
		DependentLocalityType oldDependentLocality = dependentLocality;
		dependentLocality = newDependentLocality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY, oldDependentLocality, newDependentLocality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentLocality(DependentLocalityType newDependentLocality) {
		if (newDependentLocality != dependentLocality) {
			NotificationChain msgs = null;
			if (dependentLocality != null)
				msgs = ((InternalEObject)dependentLocality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY, null, msgs);
			if (newDependentLocality != null)
				msgs = ((InternalEObject)newDependentLocality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY, null, msgs);
			msgs = basicSetDependentLocality(newDependentLocality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY, newDependentLocality, newDependentLocality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseType getPremise() {
		return premise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremise(PremiseType newPremise, NotificationChain msgs) {
		PremiseType oldPremise = premise;
		premise = newPremise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__PREMISE, oldPremise, newPremise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremise(PremiseType newPremise) {
		if (newPremise != premise) {
			NotificationChain msgs = null;
			if (premise != null)
				msgs = ((InternalEObject)premise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__PREMISE, null, msgs);
			if (newPremise != null)
				msgs = ((InternalEObject)newPremise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__PREMISE, null, msgs);
			msgs = basicSetPremise(newPremise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__PREMISE, newPremise, newPremise));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__FIRM, oldFirm, newFirm);
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
				msgs = ((InternalEObject)firm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__FIRM, null, msgs);
			if (newFirm != null)
				msgs = ((InternalEObject)newFirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__FIRM, null, msgs);
			msgs = basicSetFirm(newFirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__FIRM, newFirm, newFirm));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.THOROUGHFARE_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.THOROUGHFARE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentThoroughfaresType getDependentThoroughfares() {
		return dependentThoroughfares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentThoroughfares(DependentThoroughfaresType newDependentThoroughfares) {
		DependentThoroughfaresType oldDependentThoroughfares = dependentThoroughfares;
		dependentThoroughfares = newDependentThoroughfares == null ? DEPENDENT_THOROUGHFARES_EDEFAULT : newDependentThoroughfares;
		boolean oldDependentThoroughfaresESet = dependentThoroughfaresESet;
		dependentThoroughfaresESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES, oldDependentThoroughfares, dependentThoroughfares, !oldDependentThoroughfaresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDependentThoroughfares() {
		DependentThoroughfaresType oldDependentThoroughfares = dependentThoroughfares;
		boolean oldDependentThoroughfaresESet = dependentThoroughfaresESet;
		dependentThoroughfares = DEPENDENT_THOROUGHFARES_EDEFAULT;
		dependentThoroughfaresESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES, oldDependentThoroughfares, DEPENDENT_THOROUGHFARES_EDEFAULT, oldDependentThoroughfaresESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDependentThoroughfares() {
		return dependentThoroughfaresESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDependentThoroughfaresConnector() {
		return dependentThoroughfaresConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentThoroughfaresConnector(Object newDependentThoroughfaresConnector) {
		Object oldDependentThoroughfaresConnector = dependentThoroughfaresConnector;
		dependentThoroughfaresConnector = newDependentThoroughfaresConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR, oldDependentThoroughfaresConnector, dependentThoroughfaresConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDependentThoroughfaresIndicator() {
		return dependentThoroughfaresIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentThoroughfaresIndicator(Object newDependentThoroughfaresIndicator) {
		Object oldDependentThoroughfaresIndicator = dependentThoroughfaresIndicator;
		dependentThoroughfaresIndicator = newDependentThoroughfaresIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR, oldDependentThoroughfaresIndicator, dependentThoroughfaresIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDependentThoroughfaresType() {
		return dependentThoroughfaresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentThoroughfaresType(Object newDependentThoroughfaresType) {
		Object oldDependentThoroughfaresType = dependentThoroughfaresType;
		dependentThoroughfaresType = newDependentThoroughfaresType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE, oldDependentThoroughfaresType, dependentThoroughfaresType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.THOROUGHFARE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE);
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
			case _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER:
				return ((InternalEList<?>)getThoroughfareNumber()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE:
				return ((InternalEList<?>)getThoroughfareNumberRange()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return ((InternalEList<?>)getThoroughfareNumberPrefix()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getThoroughfareNumberSuffix()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return basicSetThoroughfarePreDirection(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return basicSetThoroughfareLeadingType(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return ((InternalEList<?>)getThoroughfareName()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return basicSetThoroughfareTrailingType(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return basicSetThoroughfarePostDirection(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE:
				return basicSetDependentThoroughfare(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY:
				return basicSetDependentLocality(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__PREMISE:
				return basicSetPremise(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__FIRM:
				return basicSetFirm(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case _0Package.THOROUGHFARE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case _0Package.THOROUGHFARE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER:
				return getThoroughfareNumber();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE:
				return getThoroughfareNumberRange();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return getThoroughfareNumberPrefix();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return getThoroughfareNumberSuffix();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return getThoroughfarePreDirection();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return getThoroughfareLeadingType();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return getThoroughfareName();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return getThoroughfareTrailingType();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return getThoroughfarePostDirection();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE:
				return getDependentThoroughfare();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY:
				return getDependentLocality();
			case _0Package.THOROUGHFARE_TYPE__PREMISE:
				return getPremise();
			case _0Package.THOROUGHFARE_TYPE__FIRM:
				return getFirm();
			case _0Package.THOROUGHFARE_TYPE__POSTAL_CODE:
				return getPostalCode();
			case _0Package.THOROUGHFARE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES:
				return getDependentThoroughfares();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR:
				return getDependentThoroughfaresConnector();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR:
				return getDependentThoroughfaresIndicator();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE:
				return getDependentThoroughfaresType();
			case _0Package.THOROUGHFARE_TYPE__TYPE:
				return getType();
			case _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				getThoroughfareNumber().addAll((Collection<? extends ThoroughfareNumberType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE:
				getThoroughfareNumberRange().clear();
				getThoroughfareNumberRange().addAll((Collection<? extends ThoroughfareNumberRangeType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				getThoroughfareNumberPrefix().addAll((Collection<? extends ThoroughfareNumberPrefixType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				getThoroughfareNumberSuffix().addAll((Collection<? extends ThoroughfareNumberSuffixType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				setThoroughfarePreDirection((ThoroughfarePreDirectionType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				setThoroughfareLeadingType((ThoroughfareLeadingTypeType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				getThoroughfareName().clear();
				getThoroughfareName().addAll((Collection<? extends ThoroughfareNameType>)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				setThoroughfareTrailingType((ThoroughfareTrailingTypeType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				setThoroughfarePostDirection((ThoroughfarePostDirectionType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE:
				setDependentThoroughfare((DependentThoroughfareType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY:
				setDependentLocality((DependentLocalityType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__PREMISE:
				setPremise((PremiseType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__FIRM:
				setFirm((FirmType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES:
				setDependentThoroughfares((DependentThoroughfaresType)newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR:
				setDependentThoroughfaresConnector(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR:
				setDependentThoroughfaresIndicator(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE:
				setDependentThoroughfaresType(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__TYPE:
				setType(newValue);
				return;
			case _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__GROUP:
				getGroup().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE:
				getThoroughfareNumberRange().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				setThoroughfarePreDirection((ThoroughfarePreDirectionType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				setThoroughfareLeadingType((ThoroughfareLeadingTypeType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				getThoroughfareName().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				setThoroughfareTrailingType((ThoroughfareTrailingTypeType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				setThoroughfarePostDirection((ThoroughfarePostDirectionType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE:
				setDependentThoroughfare((DependentThoroughfareType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY:
				setDependentLocality((DependentLocalityType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__PREMISE:
				setPremise((PremiseType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__FIRM:
				setFirm((FirmType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case _0Package.THOROUGHFARE_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES:
				unsetDependentThoroughfares();
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR:
				setDependentThoroughfaresConnector(DEPENDENT_THOROUGHFARES_CONNECTOR_EDEFAULT);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR:
				setDependentThoroughfaresIndicator(DEPENDENT_THOROUGHFARES_INDICATOR_EDEFAULT);
				return;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE:
				setDependentThoroughfaresType(DEPENDENT_THOROUGHFARES_TYPE_EDEFAULT);
				return;
			case _0Package.THOROUGHFARE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.THOROUGHFARE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER:
				return !getThoroughfareNumber().isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE:
				return !getThoroughfareNumberRange().isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return thoroughfareNumberPrefix != null && !thoroughfareNumberPrefix.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return thoroughfareNumberSuffix != null && !thoroughfareNumberSuffix.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return thoroughfarePreDirection != null;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return thoroughfareLeadingType != null;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return thoroughfareName != null && !thoroughfareName.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return thoroughfareTrailingType != null;
			case _0Package.THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return thoroughfarePostDirection != null;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE:
				return dependentThoroughfare != null;
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_LOCALITY:
				return dependentLocality != null;
			case _0Package.THOROUGHFARE_TYPE__PREMISE:
				return premise != null;
			case _0Package.THOROUGHFARE_TYPE__FIRM:
				return firm != null;
			case _0Package.THOROUGHFARE_TYPE__POSTAL_CODE:
				return postalCode != null;
			case _0Package.THOROUGHFARE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES:
				return isSetDependentThoroughfares();
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR:
				return DEPENDENT_THOROUGHFARES_CONNECTOR_EDEFAULT == null ? dependentThoroughfaresConnector != null : !DEPENDENT_THOROUGHFARES_CONNECTOR_EDEFAULT.equals(dependentThoroughfaresConnector);
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR:
				return DEPENDENT_THOROUGHFARES_INDICATOR_EDEFAULT == null ? dependentThoroughfaresIndicator != null : !DEPENDENT_THOROUGHFARES_INDICATOR_EDEFAULT.equals(dependentThoroughfaresIndicator);
			case _0Package.THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE:
				return DEPENDENT_THOROUGHFARES_TYPE_EDEFAULT == null ? dependentThoroughfaresType != null : !DEPENDENT_THOROUGHFARES_TYPE_EDEFAULT.equals(dependentThoroughfaresType);
			case _0Package.THOROUGHFARE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case _0Package.THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", any: ");
		result.append(any);
		result.append(", dependentThoroughfares: ");
		if (dependentThoroughfaresESet) result.append(dependentThoroughfares); else result.append("<unset>");
		result.append(", dependentThoroughfaresConnector: ");
		result.append(dependentThoroughfaresConnector);
		result.append(", dependentThoroughfaresIndicator: ");
		result.append(dependentThoroughfaresIndicator);
		result.append(", dependentThoroughfaresType: ");
		result.append(dependentThoroughfaresType);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ThoroughfareTypeImpl
