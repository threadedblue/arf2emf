/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getNameLine <em>Name Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getJointNameConnector <em>Joint Name Connector</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.JointPersonNameTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointPersonNameTypeImpl extends MinimalEObjectImpl.Container implements JointPersonNameType {
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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	 * The default value of the '{@link #getJointNameConnector() <em>Joint Name Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointNameConnector()
	 * @generated
	 * @ordered
	 */
	protected static final Object JOINT_NAME_CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJointNameConnector() <em>Joint Name Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointNameConnector()
	 * @generated
	 * @ordered
	 */
	protected Object jointNameConnector = JOINT_NAME_CONNECTOR_EDEFAULT;

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
	protected JointPersonNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.JOINT_PERSON_NAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _0Package.JOINT_PERSON_NAME_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameLineType> getNameLine() {
		return getGroup().list(_0Package.Literals.JOINT_PERSON_NAME_TYPE__NAME_LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameType> getPersonName() {
		return getGroup().list(_0Package.Literals.JOINT_PERSON_NAME_TYPE__PERSON_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.JOINT_PERSON_NAME_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.JOINT_PERSON_NAME_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJointNameConnector() {
		return jointNameConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointNameConnector(Object newJointNameConnector) {
		Object oldJointNameConnector = jointNameConnector;
		jointNameConnector = newJointNameConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR, oldJointNameConnector, jointNameConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE);
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
			case _0Package.JOINT_PERSON_NAME_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JOINT_PERSON_NAME_TYPE__NAME_LINE:
				return ((InternalEList<?>)getNameLine()).basicRemove(otherEnd, msgs);
			case _0Package.JOINT_PERSON_NAME_TYPE__PERSON_NAME:
				return ((InternalEList<?>)getPersonName()).basicRemove(otherEnd, msgs);
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.JOINT_PERSON_NAME_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _0Package.JOINT_PERSON_NAME_TYPE__NAME_LINE:
				return getNameLine();
			case _0Package.JOINT_PERSON_NAME_TYPE__PERSON_NAME:
				return getPersonName();
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _0Package.JOINT_PERSON_NAME_TYPE__CODE:
				return getCode();
			case _0Package.JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR:
				return getJointNameConnector();
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.JOINT_PERSON_NAME_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__NAME_LINE:
				getNameLine().clear();
				getNameLine().addAll((Collection<? extends NameLineType>)newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__PERSON_NAME:
				getPersonName().clear();
				getPersonName().addAll((Collection<? extends PersonNameType>)newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__CODE:
				setCode(newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR:
				setJointNameConnector(newValue);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.JOINT_PERSON_NAME_TYPE__GROUP:
				getGroup().clear();
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__NAME_LINE:
				getNameLine().clear();
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__PERSON_NAME:
				getPersonName().clear();
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY:
				getAny().clear();
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR:
				setJointNameConnector(JOINT_NAME_CONNECTOR_EDEFAULT);
				return;
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _0Package.JOINT_PERSON_NAME_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _0Package.JOINT_PERSON_NAME_TYPE__NAME_LINE:
				return !getNameLine().isEmpty();
			case _0Package.JOINT_PERSON_NAME_TYPE__PERSON_NAME:
				return !getPersonName().isEmpty();
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _0Package.JOINT_PERSON_NAME_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case _0Package.JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR:
				return JOINT_NAME_CONNECTOR_EDEFAULT == null ? jointNameConnector != null : !JOINT_NAME_CONNECTOR_EDEFAULT.equals(jointNameConnector);
			case _0Package.JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE:
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
		result.append(", code: ");
		result.append(code);
		result.append(", jointNameConnector: ");
		result.append(jointNameConnector);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //JointPersonNameTypeImpl
