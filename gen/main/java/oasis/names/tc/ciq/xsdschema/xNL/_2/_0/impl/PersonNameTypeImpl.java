/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl#getFormerName <em>Former Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl#getKnownAs <em>Known As</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.PersonNameTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonNameTypeImpl extends PersonNameImpl implements PersonNameType {
	/**
	 * The cached value of the '{@link #getFormerName() <em>Former Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormerName()
	 * @generated
	 * @ordered
	 */
	protected EList<FormerNameType> formerName;

	/**
	 * The cached value of the '{@link #getKnownAs() <em>Known As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownAs()
	 * @generated
	 * @ordered
	 */
	protected EList<KnownAsType> knownAs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.PERSON_NAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormerNameType> getFormerName() {
		if (formerName == null) {
			formerName = new EObjectContainmentEList<FormerNameType>(FormerNameType.class, this, _0Package.PERSON_NAME_TYPE__FORMER_NAME);
		}
		return formerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnownAsType> getKnownAs() {
		if (knownAs == null) {
			knownAs = new EObjectContainmentEList<KnownAsType>(KnownAsType.class, this, _0Package.PERSON_NAME_TYPE__KNOWN_AS);
		}
		return knownAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.PERSON_NAME_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_NAME_TYPE__FORMER_NAME:
				return ((InternalEList<?>)getFormerName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__KNOWN_AS:
				return ((InternalEList<?>)getKnownAs()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_NAME_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_NAME_TYPE__FORMER_NAME:
				return getFormerName();
			case _0Package.PERSON_NAME_TYPE__KNOWN_AS:
				return getKnownAs();
			case _0Package.PERSON_NAME_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case _0Package.PERSON_NAME_TYPE__FORMER_NAME:
				getFormerName().clear();
				getFormerName().addAll((Collection<? extends FormerNameType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__KNOWN_AS:
				getKnownAs().clear();
				getKnownAs().addAll((Collection<? extends KnownAsType>)newValue);
				return;
			case _0Package.PERSON_NAME_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case _0Package.PERSON_NAME_TYPE__FORMER_NAME:
				getFormerName().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__KNOWN_AS:
				getKnownAs().clear();
				return;
			case _0Package.PERSON_NAME_TYPE__ANY:
				getAny().clear();
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
			case _0Package.PERSON_NAME_TYPE__FORMER_NAME:
				return formerName != null && !formerName.isEmpty();
			case _0Package.PERSON_NAME_TYPE__KNOWN_AS:
				return knownAs != null && !knownAs.isEmpty();
			case _0Package.PERSON_NAME_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PersonNameTypeImpl
