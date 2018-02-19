/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.util;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseAddresseeIndicatorType(AddresseeIndicatorType object) {
				return createAddresseeIndicatorTypeAdapter();
			}
			@Override
			public Adapter caseAliasType(AliasType object) {
				return createAliasTypeAdapter();
			}
			@Override
			public Adapter caseDependencyNameType(DependencyNameType object) {
				return createDependencyNameTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFirstNameType(FirstNameType object) {
				return createFirstNameTypeAdapter();
			}
			@Override
			public Adapter caseFormerNameType(FormerNameType object) {
				return createFormerNameTypeAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseGeneralSuffixType(GeneralSuffixType object) {
				return createGeneralSuffixTypeAdapter();
			}
			@Override
			public Adapter caseGenerationIdentifierType(GenerationIdentifierType object) {
				return createGenerationIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseJointPersonNameType(JointPersonNameType object) {
				return createJointPersonNameTypeAdapter();
			}
			@Override
			public Adapter caseKnownAsType(KnownAsType object) {
				return createKnownAsTypeAdapter();
			}
			@Override
			public Adapter caseLastNameType(LastNameType object) {
				return createLastNameTypeAdapter();
			}
			@Override
			public Adapter caseMiddleNameType(MiddleNameType object) {
				return createMiddleNameTypeAdapter();
			}
			@Override
			public Adapter caseNameDetails(NameDetails object) {
				return createNameDetailsAdapter();
			}
			@Override
			public Adapter caseNameDetailsType(NameDetailsType object) {
				return createNameDetailsTypeAdapter();
			}
			@Override
			public Adapter caseNameLineType(NameLineType object) {
				return createNameLineTypeAdapter();
			}
			@Override
			public Adapter caseNamePrefixType(NamePrefixType object) {
				return createNamePrefixTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationFormerNameType(OrganisationFormerNameType object) {
				return createOrganisationFormerNameTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationKnownAsType(OrganisationKnownAsType object) {
				return createOrganisationKnownAsTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationNameDetails(OrganisationNameDetails object) {
				return createOrganisationNameDetailsAdapter();
			}
			@Override
			public Adapter caseOrganisationNameDetailsType(OrganisationNameDetailsType object) {
				return createOrganisationNameDetailsTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationNameType(OrganisationNameType object) {
				return createOrganisationNameTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationTypeType(OrganisationTypeType object) {
				return createOrganisationTypeTypeAdapter();
			}
			@Override
			public Adapter caseOtherNameType(OtherNameType object) {
				return createOtherNameTypeAdapter();
			}
			@Override
			public Adapter casePersonName(PersonName object) {
				return createPersonNameAdapter();
			}
			@Override
			public Adapter casePersonNameType(PersonNameType object) {
				return createPersonNameTypeAdapter();
			}
			@Override
			public Adapter casePrecedingTitleType(PrecedingTitleType object) {
				return createPrecedingTitleTypeAdapter();
			}
			@Override
			public Adapter caseSuffixType(SuffixType object) {
				return createSuffixTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseXNLType(XNLType object) {
				return createXNLTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType <em>Addressee Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType
	 * @generated
	 */
	public Adapter createAddresseeIndicatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType
	 * @generated
	 */
	public Adapter createAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType <em>Dependency Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType
	 * @generated
	 */
	public Adapter createDependencyNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType <em>First Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType
	 * @generated
	 */
	public Adapter createFirstNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType <em>Former Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType
	 * @generated
	 */
	public Adapter createFormerNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType <em>General Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType
	 * @generated
	 */
	public Adapter createGeneralSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType <em>Generation Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType
	 * @generated
	 */
	public Adapter createGenerationIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType <em>Joint Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType
	 * @generated
	 */
	public Adapter createJointPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType <em>Known As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType
	 * @generated
	 */
	public Adapter createKnownAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType <em>Last Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType
	 * @generated
	 */
	public Adapter createLastNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType <em>Middle Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType
	 * @generated
	 */
	public Adapter createMiddleNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails <em>Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails
	 * @generated
	 */
	public Adapter createNameDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType <em>Name Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType
	 * @generated
	 */
	public Adapter createNameDetailsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType <em>Name Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType
	 * @generated
	 */
	public Adapter createNameLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType <em>Name Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType
	 * @generated
	 */
	public Adapter createNamePrefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType <em>Organisation Former Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType
	 * @generated
	 */
	public Adapter createOrganisationFormerNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType <em>Organisation Known As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType
	 * @generated
	 */
	public Adapter createOrganisationKnownAsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails <em>Organisation Name Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails
	 * @generated
	 */
	public Adapter createOrganisationNameDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType <em>Organisation Name Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType
	 * @generated
	 */
	public Adapter createOrganisationNameDetailsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType <em>Organisation Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType
	 * @generated
	 */
	public Adapter createOrganisationNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType <em>Organisation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType
	 * @generated
	 */
	public Adapter createOrganisationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType <em>Other Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType
	 * @generated
	 */
	public Adapter createOtherNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName
	 * @generated
	 */
	public Adapter createPersonNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType <em>Person Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType
	 * @generated
	 */
	public Adapter createPersonNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType <em>Preceding Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType
	 * @generated
	 */
	public Adapter createPrecedingTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType <em>Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType
	 * @generated
	 */
	public Adapter createSuffixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType <em>XNL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType
	 * @generated
	 */
	public Adapter createXNLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_0AdapterFactory
