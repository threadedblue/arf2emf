/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0FactoryImpl extends EFactoryImpl implements _0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _0Factory init() {
		try {
			_0Factory the_0Factory = (_0Factory)EPackage.Registry.INSTANCE.getEFactory(_0Package.eNS_URI);
			if (the_0Factory != null) {
				return the_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _0Package.ADDRESSEE_INDICATOR_TYPE: return createAddresseeIndicatorType();
			case _0Package.ALIAS_TYPE: return createAliasType();
			case _0Package.DEPENDENCY_NAME_TYPE: return createDependencyNameType();
			case _0Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _0Package.FIRST_NAME_TYPE: return createFirstNameType();
			case _0Package.FORMER_NAME_TYPE: return createFormerNameType();
			case _0Package.FUNCTION: return createFunction();
			case _0Package.GENERAL_SUFFIX_TYPE: return createGeneralSuffixType();
			case _0Package.GENERATION_IDENTIFIER_TYPE: return createGenerationIdentifierType();
			case _0Package.JOINT_PERSON_NAME_TYPE: return createJointPersonNameType();
			case _0Package.KNOWN_AS_TYPE: return createKnownAsType();
			case _0Package.LAST_NAME_TYPE: return createLastNameType();
			case _0Package.MIDDLE_NAME_TYPE: return createMiddleNameType();
			case _0Package.NAME_DETAILS: return createNameDetails();
			case _0Package.NAME_DETAILS_TYPE: return createNameDetailsType();
			case _0Package.NAME_LINE_TYPE: return createNameLineType();
			case _0Package.NAME_PREFIX_TYPE: return createNamePrefixType();
			case _0Package.ORGANISATION_FORMER_NAME_TYPE: return createOrganisationFormerNameType();
			case _0Package.ORGANISATION_KNOWN_AS_TYPE: return createOrganisationKnownAsType();
			case _0Package.ORGANISATION_NAME_DETAILS: return createOrganisationNameDetails();
			case _0Package.ORGANISATION_NAME_DETAILS_TYPE: return createOrganisationNameDetailsType();
			case _0Package.ORGANISATION_NAME_TYPE: return createOrganisationNameType();
			case _0Package.ORGANISATION_TYPE_TYPE: return createOrganisationTypeType();
			case _0Package.OTHER_NAME_TYPE: return createOtherNameType();
			case _0Package.PERSON_NAME: return createPersonName();
			case _0Package.PERSON_NAME_TYPE: return createPersonNameType();
			case _0Package.PRECEDING_TITLE_TYPE: return createPrecedingTitleType();
			case _0Package.SUFFIX_TYPE: return createSuffixType();
			case _0Package.TITLE_TYPE: return createTitleType();
			case _0Package.XNL_TYPE: return createXNLType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddresseeIndicatorType createAddresseeIndicatorType() {
		AddresseeIndicatorTypeImpl addresseeIndicatorType = new AddresseeIndicatorTypeImpl();
		return addresseeIndicatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType createAliasType() {
		AliasTypeImpl aliasType = new AliasTypeImpl();
		return aliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyNameType createDependencyNameType() {
		DependencyNameTypeImpl dependencyNameType = new DependencyNameTypeImpl();
		return dependencyNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstNameType createFirstNameType() {
		FirstNameTypeImpl firstNameType = new FirstNameTypeImpl();
		return firstNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormerNameType createFormerNameType() {
		FormerNameTypeImpl formerNameType = new FormerNameTypeImpl();
		return formerNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralSuffixType createGeneralSuffixType() {
		GeneralSuffixTypeImpl generalSuffixType = new GeneralSuffixTypeImpl();
		return generalSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationIdentifierType createGenerationIdentifierType() {
		GenerationIdentifierTypeImpl generationIdentifierType = new GenerationIdentifierTypeImpl();
		return generationIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPersonNameType createJointPersonNameType() {
		JointPersonNameTypeImpl jointPersonNameType = new JointPersonNameTypeImpl();
		return jointPersonNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnownAsType createKnownAsType() {
		KnownAsTypeImpl knownAsType = new KnownAsTypeImpl();
		return knownAsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastNameType createLastNameType() {
		LastNameTypeImpl lastNameType = new LastNameTypeImpl();
		return lastNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddleNameType createMiddleNameType() {
		MiddleNameTypeImpl middleNameType = new MiddleNameTypeImpl();
		return middleNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameDetails createNameDetails() {
		NameDetailsImpl nameDetails = new NameDetailsImpl();
		return nameDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameDetailsType createNameDetailsType() {
		NameDetailsTypeImpl nameDetailsType = new NameDetailsTypeImpl();
		return nameDetailsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameLineType createNameLineType() {
		NameLineTypeImpl nameLineType = new NameLineTypeImpl();
		return nameLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamePrefixType createNamePrefixType() {
		NamePrefixTypeImpl namePrefixType = new NamePrefixTypeImpl();
		return namePrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationFormerNameType createOrganisationFormerNameType() {
		OrganisationFormerNameTypeImpl organisationFormerNameType = new OrganisationFormerNameTypeImpl();
		return organisationFormerNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationKnownAsType createOrganisationKnownAsType() {
		OrganisationKnownAsTypeImpl organisationKnownAsType = new OrganisationKnownAsTypeImpl();
		return organisationKnownAsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationNameDetails createOrganisationNameDetails() {
		OrganisationNameDetailsImpl organisationNameDetails = new OrganisationNameDetailsImpl();
		return organisationNameDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationNameDetailsType createOrganisationNameDetailsType() {
		OrganisationNameDetailsTypeImpl organisationNameDetailsType = new OrganisationNameDetailsTypeImpl();
		return organisationNameDetailsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationNameType createOrganisationNameType() {
		OrganisationNameTypeImpl organisationNameType = new OrganisationNameTypeImpl();
		return organisationNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationTypeType createOrganisationTypeType() {
		OrganisationTypeTypeImpl organisationTypeType = new OrganisationTypeTypeImpl();
		return organisationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherNameType createOtherNameType() {
		OtherNameTypeImpl otherNameType = new OtherNameTypeImpl();
		return otherNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonName createPersonName() {
		PersonNameImpl personName = new PersonNameImpl();
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonNameType createPersonNameType() {
		PersonNameTypeImpl personNameType = new PersonNameTypeImpl();
		return personNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedingTitleType createPrecedingTitleType() {
		PrecedingTitleTypeImpl precedingTitleType = new PrecedingTitleTypeImpl();
		return precedingTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixType createSuffixType() {
		SuffixTypeImpl suffixType = new SuffixTypeImpl();
		return suffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNLType createXNLType() {
		XNLTypeImpl xnlType = new XNLTypeImpl();
		return xnlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Package get_0Package() {
		return (_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _0Package getPackage() {
		return _0Package.eINSTANCE;
	}

} //_0FactoryImpl
