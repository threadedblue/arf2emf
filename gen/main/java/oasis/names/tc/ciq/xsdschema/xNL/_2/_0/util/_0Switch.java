/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.util;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.ADDRESSEE_INDICATOR_TYPE: {
				AddresseeIndicatorType addresseeIndicatorType = (AddresseeIndicatorType)theEObject;
				T result = caseAddresseeIndicatorType(addresseeIndicatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ALIAS_TYPE: {
				AliasType aliasType = (AliasType)theEObject;
				T result = caseAliasType(aliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DEPENDENCY_NAME_TYPE: {
				DependencyNameType dependencyNameType = (DependencyNameType)theEObject;
				T result = caseDependencyNameType(dependencyNameType);
				if (result == null) result = caseNameDetails(dependencyNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FIRST_NAME_TYPE: {
				FirstNameType firstNameType = (FirstNameType)theEObject;
				T result = caseFirstNameType(firstNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FORMER_NAME_TYPE: {
				FormerNameType formerNameType = (FormerNameType)theEObject;
				T result = caseFormerNameType(formerNameType);
				if (result == null) result = casePersonName(formerNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GENERAL_SUFFIX_TYPE: {
				GeneralSuffixType generalSuffixType = (GeneralSuffixType)theEObject;
				T result = caseGeneralSuffixType(generalSuffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.GENERATION_IDENTIFIER_TYPE: {
				GenerationIdentifierType generationIdentifierType = (GenerationIdentifierType)theEObject;
				T result = caseGenerationIdentifierType(generationIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.JOINT_PERSON_NAME_TYPE: {
				JointPersonNameType jointPersonNameType = (JointPersonNameType)theEObject;
				T result = caseJointPersonNameType(jointPersonNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.KNOWN_AS_TYPE: {
				KnownAsType knownAsType = (KnownAsType)theEObject;
				T result = caseKnownAsType(knownAsType);
				if (result == null) result = casePersonName(knownAsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.LAST_NAME_TYPE: {
				LastNameType lastNameType = (LastNameType)theEObject;
				T result = caseLastNameType(lastNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MIDDLE_NAME_TYPE: {
				MiddleNameType middleNameType = (MiddleNameType)theEObject;
				T result = caseMiddleNameType(middleNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NAME_DETAILS: {
				NameDetails nameDetails = (NameDetails)theEObject;
				T result = caseNameDetails(nameDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NAME_DETAILS_TYPE: {
				NameDetailsType nameDetailsType = (NameDetailsType)theEObject;
				T result = caseNameDetailsType(nameDetailsType);
				if (result == null) result = caseNameDetails(nameDetailsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NAME_LINE_TYPE: {
				NameLineType nameLineType = (NameLineType)theEObject;
				T result = caseNameLineType(nameLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.NAME_PREFIX_TYPE: {
				NamePrefixType namePrefixType = (NamePrefixType)theEObject;
				T result = caseNamePrefixType(namePrefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_FORMER_NAME_TYPE: {
				OrganisationFormerNameType organisationFormerNameType = (OrganisationFormerNameType)theEObject;
				T result = caseOrganisationFormerNameType(organisationFormerNameType);
				if (result == null) result = caseOrganisationNameDetails(organisationFormerNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_KNOWN_AS_TYPE: {
				OrganisationKnownAsType organisationKnownAsType = (OrganisationKnownAsType)theEObject;
				T result = caseOrganisationKnownAsType(organisationKnownAsType);
				if (result == null) result = caseOrganisationNameDetails(organisationKnownAsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_NAME_DETAILS: {
				OrganisationNameDetails organisationNameDetails = (OrganisationNameDetails)theEObject;
				T result = caseOrganisationNameDetails(organisationNameDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE: {
				OrganisationNameDetailsType organisationNameDetailsType = (OrganisationNameDetailsType)theEObject;
				T result = caseOrganisationNameDetailsType(organisationNameDetailsType);
				if (result == null) result = caseOrganisationNameDetails(organisationNameDetailsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_NAME_TYPE: {
				OrganisationNameType organisationNameType = (OrganisationNameType)theEObject;
				T result = caseOrganisationNameType(organisationNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.ORGANISATION_TYPE_TYPE: {
				OrganisationTypeType organisationTypeType = (OrganisationTypeType)theEObject;
				T result = caseOrganisationTypeType(organisationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.OTHER_NAME_TYPE: {
				OtherNameType otherNameType = (OtherNameType)theEObject;
				T result = caseOtherNameType(otherNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_NAME: {
				PersonName personName = (PersonName)theEObject;
				T result = casePersonName(personName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PERSON_NAME_TYPE: {
				PersonNameType personNameType = (PersonNameType)theEObject;
				T result = casePersonNameType(personNameType);
				if (result == null) result = casePersonName(personNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.PRECEDING_TITLE_TYPE: {
				PrecedingTitleType precedingTitleType = (PrecedingTitleType)theEObject;
				T result = casePrecedingTitleType(precedingTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SUFFIX_TYPE: {
				SuffixType suffixType = (SuffixType)theEObject;
				T result = caseSuffixType(suffixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.XNL_TYPE: {
				XNLType xnlType = (XNLType)theEObject;
				T result = caseXNLType(xnlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressee Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressee Indicator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddresseeIndicatorType(AddresseeIndicatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasType(AliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyNameType(DependencyNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstNameType(FirstNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Former Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Former Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormerNameType(FormerNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralSuffixType(GeneralSuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationIdentifierType(GenerationIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointPersonNameType(JointPersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Known As Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Known As Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnownAsType(KnownAsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastNameType(LastNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Middle Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Middle Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiddleNameType(MiddleNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameDetails(NameDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Details Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Details Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameDetailsType(NameDetailsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameLineType(NameLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Prefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamePrefixType(NamePrefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Former Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Former Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationFormerNameType(OrganisationFormerNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Known As Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Known As Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationKnownAsType(OrganisationKnownAsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Name Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Name Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationNameDetails(OrganisationNameDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Name Details Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Name Details Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationNameDetailsType(OrganisationNameDetailsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationNameType(OrganisationNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationTypeType(OrganisationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherNameType(OtherNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonName(PersonName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonNameType(PersonNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preceding Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preceding Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedingTitleType(PrecedingTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suffix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suffix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuffixType(SuffixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XNL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XNL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXNLType(XNLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch
