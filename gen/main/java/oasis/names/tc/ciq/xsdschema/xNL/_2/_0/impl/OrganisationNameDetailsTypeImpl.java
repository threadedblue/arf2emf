/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import java.util.Collection;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;
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
 * An implementation of the model object '<em><b>Organisation Name Details Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl#getOrganisationFormerName <em>Organisation Former Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl#getOrganisationKnownAs <em>Organisation Known As</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.OrganisationNameDetailsTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationNameDetailsTypeImpl extends OrganisationNameDetailsImpl implements OrganisationNameDetailsType {
	/**
	 * The cached value of the '{@link #getOrganisationFormerName() <em>Organisation Former Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationFormerName()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationFormerNameType> organisationFormerName;

	/**
	 * The cached value of the '{@link #getOrganisationKnownAs() <em>Organisation Known As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationKnownAs()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationKnownAsType> organisationKnownAs;

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
	protected OrganisationNameDetailsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.ORGANISATION_NAME_DETAILS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationFormerNameType> getOrganisationFormerName() {
		if (organisationFormerName == null) {
			organisationFormerName = new EObjectContainmentEList<OrganisationFormerNameType>(OrganisationFormerNameType.class, this, _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME);
		}
		return organisationFormerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationKnownAsType> getOrganisationKnownAs() {
		if (organisationKnownAs == null) {
			organisationKnownAs = new EObjectContainmentEList<OrganisationKnownAsType>(OrganisationKnownAsType.class, this, _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS);
		}
		return organisationKnownAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY);
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
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME:
				return ((InternalEList<?>)getOrganisationFormerName()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS:
				return ((InternalEList<?>)getOrganisationKnownAs()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY:
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
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME:
				return getOrganisationFormerName();
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS:
				return getOrganisationKnownAs();
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY:
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
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME:
				getOrganisationFormerName().clear();
				getOrganisationFormerName().addAll((Collection<? extends OrganisationFormerNameType>)newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS:
				getOrganisationKnownAs().clear();
				getOrganisationKnownAs().addAll((Collection<? extends OrganisationKnownAsType>)newValue);
				return;
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY:
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
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME:
				getOrganisationFormerName().clear();
				return;
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS:
				getOrganisationKnownAs().clear();
				return;
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY:
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
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME:
				return organisationFormerName != null && !organisationFormerName.isEmpty();
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS:
				return organisationKnownAs != null && !organisationKnownAs.isEmpty();
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE__ANY:
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

} //OrganisationNameDetailsTypeImpl
