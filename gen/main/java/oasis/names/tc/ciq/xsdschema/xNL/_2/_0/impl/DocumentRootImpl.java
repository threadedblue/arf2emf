/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.Function;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getJointPersonName <em>Joint Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getNameDetails <em>Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getOrganisationNameDetails <em>Organisation Name Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.impl.DocumentRootImpl#getXNL <em>XNL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _0Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return (Function)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__FUNCTION, newFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPersonNameType getJointPersonName() {
		return (JointPersonNameType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__JOINT_PERSON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointPersonName(JointPersonNameType newJointPersonName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__JOINT_PERSON_NAME, newJointPersonName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointPersonName(JointPersonNameType newJointPersonName) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__JOINT_PERSON_NAME, newJointPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameDetailsType getNameDetails() {
		return (NameDetailsType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__NAME_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameDetails(NameDetailsType newNameDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__NAME_DETAILS, newNameDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDetails(NameDetailsType newNameDetails) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__NAME_DETAILS, newNameDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationNameDetailsType getOrganisationNameDetails() {
		return (OrganisationNameDetailsType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisationNameDetails(OrganisationNameDetailsType newOrganisationNameDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS, newOrganisationNameDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisationNameDetails(OrganisationNameDetailsType newOrganisationNameDetails) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS, newOrganisationNameDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType getPersonName() {
		return (PersonNameType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__PERSON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonName(PersonNameType newPersonName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__PERSON_NAME, newPersonName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(PersonNameType newPersonName) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__PERSON_NAME, newPersonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNLType getXNL() {
		return (XNLType)getMixed().get(_0Package.Literals.DOCUMENT_ROOT__XNL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXNL(XNLType newXNL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_0Package.Literals.DOCUMENT_ROOT__XNL, newXNL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXNL(XNLType newXNL) {
		((FeatureMap.Internal)getMixed()).set(_0Package.Literals.DOCUMENT_ROOT__XNL, newXNL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ROOT__FUNCTION:
				return basicSetFunction(null, msgs);
			case _0Package.DOCUMENT_ROOT__JOINT_PERSON_NAME:
				return basicSetJointPersonName(null, msgs);
			case _0Package.DOCUMENT_ROOT__NAME_DETAILS:
				return basicSetNameDetails(null, msgs);
			case _0Package.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS:
				return basicSetOrganisationNameDetails(null, msgs);
			case _0Package.DOCUMENT_ROOT__PERSON_NAME:
				return basicSetPersonName(null, msgs);
			case _0Package.DOCUMENT_ROOT__XNL:
				return basicSetXNL(null, msgs);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _0Package.DOCUMENT_ROOT__FUNCTION:
				return getFunction();
			case _0Package.DOCUMENT_ROOT__JOINT_PERSON_NAME:
				return getJointPersonName();
			case _0Package.DOCUMENT_ROOT__NAME_DETAILS:
				return getNameDetails();
			case _0Package.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS:
				return getOrganisationNameDetails();
			case _0Package.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName();
			case _0Package.DOCUMENT_ROOT__XNL:
				return getXNL();
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _0Package.DOCUMENT_ROOT__FUNCTION:
				setFunction((Function)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__JOINT_PERSON_NAME:
				setJointPersonName((JointPersonNameType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__NAME_DETAILS:
				setNameDetails((NameDetailsType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS:
				setOrganisationNameDetails((OrganisationNameDetailsType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)newValue);
				return;
			case _0Package.DOCUMENT_ROOT__XNL:
				setXNL((XNLType)newValue);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _0Package.DOCUMENT_ROOT__FUNCTION:
				setFunction((Function)null);
				return;
			case _0Package.DOCUMENT_ROOT__JOINT_PERSON_NAME:
				setJointPersonName((JointPersonNameType)null);
				return;
			case _0Package.DOCUMENT_ROOT__NAME_DETAILS:
				setNameDetails((NameDetailsType)null);
				return;
			case _0Package.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS:
				setOrganisationNameDetails((OrganisationNameDetailsType)null);
				return;
			case _0Package.DOCUMENT_ROOT__PERSON_NAME:
				setPersonName((PersonNameType)null);
				return;
			case _0Package.DOCUMENT_ROOT__XNL:
				setXNL((XNLType)null);
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
			case _0Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _0Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _0Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _0Package.DOCUMENT_ROOT__FUNCTION:
				return getFunction() != null;
			case _0Package.DOCUMENT_ROOT__JOINT_PERSON_NAME:
				return getJointPersonName() != null;
			case _0Package.DOCUMENT_ROOT__NAME_DETAILS:
				return getNameDetails() != null;
			case _0Package.DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS:
				return getOrganisationNameDetails() != null;
			case _0Package.DOCUMENT_ROOT__PERSON_NAME:
				return getPersonName() != null;
			case _0Package.DOCUMENT_ROOT__XNL:
				return getXNL() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
