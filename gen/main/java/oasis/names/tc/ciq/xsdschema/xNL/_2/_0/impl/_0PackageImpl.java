/**
 */
package oasis.names.tc.ciq.xsdschema.xNL._2._0.impl;

import gov.nist.scap.schema.asset.identification._1._1Package;

import gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl;

import oasis.names.tc.ciq.xsdschema.xNL._2._0.AddresseeIndicatorType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.AliasType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.DependencyNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.DocumentRoot;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.FirstNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.FormerNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.Function;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.GeneralSuffixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.GenerationIdentifierType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.JointPersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.KnownAsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.LastNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.MiddleNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetails;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameDetailsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NameLineType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.NamePrefixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationFormerNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationKnownAsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetails;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameDetailsType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OrganisationTypeType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.OtherNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonName;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PersonNameType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.PrecedingTitleType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.SuffixType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.TitleType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0.XNLType;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Factory;
import oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mitre.cpe.naming._2._2Package;

import org.mitre.cpe.naming._2.impl._2PackageImpl;

import org.w3._1999.xlink.XlinkPackage;

import org.w3._1999.xlink.impl.XlinkPackageImpl;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0PackageImpl extends EPackageImpl implements _0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addresseeIndicatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formerNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointPersonNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knownAsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middleNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameDetailsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameLineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namePrefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationFormerNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationKnownAsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationNameDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationNameDetailsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedingTitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xnlTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _0PackageImpl() {
		super(eNS_URI, _0Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _0Package init() {
		if (isInited) return (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);

		// Obtain or create and register package
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _0PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package.eNS_URI) instanceof oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package.eNS_URI) : oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) : _1Package.eINSTANCE);
		gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl the_1Package_1 = (gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) : gov.nist.scap.schema.reporting.core._1._1Package.eINSTANCE);
		gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl the_1Package_2 = (gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.reporting.format._1._1Package.eINSTANCE);
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);

		// Load packages
		the_0Package_1.loadPackage();

		// Create package meta-data objects
		the_0Package.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_1Package.createPackageContents();
		the_1Package_1.createPackageContents();
		the_1Package_2.createPackageContents();
		the_2Package.createPackageContents();

		// Initialize created meta-data
		the_0Package.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_1Package.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_1Package_2.initializePackageContents();
		the_2Package.initializePackageContents();

		// Fix loaded packages
		the_0Package_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		the_0Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_0Package.eNS_URI, the_0Package);
		return the_0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddresseeIndicatorType() {
		return addresseeIndicatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddresseeIndicatorType_Mixed() {
		return (EAttribute)addresseeIndicatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddresseeIndicatorType_Code() {
		return (EAttribute)addresseeIndicatorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddresseeIndicatorType_AnyAttribute() {
		return (EAttribute)addresseeIndicatorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasType() {
		return aliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Mixed() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Code() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_NameType() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Type() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_AnyAttribute() {
		return (EAttribute)aliasTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyNameType() {
		return dependencyNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyNameType_Any() {
		return (EAttribute)dependencyNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyNameType_DependencyType() {
		return (EAttribute)dependencyNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyNameType_NameDetailsKeyRef() {
		return (EAttribute)dependencyNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Function() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JointPersonName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NameDetails() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrganisationNameDetails() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XNL() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstNameType() {
		return firstNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNameType_Mixed() {
		return (EAttribute)firstNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNameType_Code() {
		return (EAttribute)firstNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNameType_NameType() {
		return (EAttribute)firstNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNameType_Type() {
		return (EAttribute)firstNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstNameType_AnyAttribute() {
		return (EAttribute)firstNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormerNameType() {
		return formerNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormerNameType_Any() {
		return (EAttribute)formerNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormerNameType_ValidFrom() {
		return (EAttribute)formerNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormerNameType_ValidTo() {
		return (EAttribute)formerNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Mixed() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Code() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_AnyAttribute() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralSuffixType() {
		return generalSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSuffixType_Mixed() {
		return (EAttribute)generalSuffixTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSuffixType_Code() {
		return (EAttribute)generalSuffixTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSuffixType_Type() {
		return (EAttribute)generalSuffixTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralSuffixType_AnyAttribute() {
		return (EAttribute)generalSuffixTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationIdentifierType() {
		return generationIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationIdentifierType_Mixed() {
		return (EAttribute)generationIdentifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationIdentifierType_Code() {
		return (EAttribute)generationIdentifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationIdentifierType_Type() {
		return (EAttribute)generationIdentifierTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationIdentifierType_AnyAttribute() {
		return (EAttribute)generationIdentifierTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJointPersonNameType() {
		return jointPersonNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointPersonNameType_Group() {
		return (EAttribute)jointPersonNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointPersonNameType_NameLine() {
		return (EReference)jointPersonNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJointPersonNameType_PersonName() {
		return (EReference)jointPersonNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointPersonNameType_Any() {
		return (EAttribute)jointPersonNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointPersonNameType_Code() {
		return (EAttribute)jointPersonNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointPersonNameType_JointNameConnector() {
		return (EAttribute)jointPersonNameTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJointPersonNameType_AnyAttribute() {
		return (EAttribute)jointPersonNameTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnownAsType() {
		return knownAsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnownAsType_Any() {
		return (EAttribute)knownAsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnownAsType_ValidFrom() {
		return (EAttribute)knownAsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnownAsType_ValidTo() {
		return (EAttribute)knownAsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastNameType() {
		return lastNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNameType_Mixed() {
		return (EAttribute)lastNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNameType_Code() {
		return (EAttribute)lastNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNameType_NameType() {
		return (EAttribute)lastNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNameType_Type() {
		return (EAttribute)lastNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLastNameType_AnyAttribute() {
		return (EAttribute)lastNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddleNameType() {
		return middleNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddleNameType_Mixed() {
		return (EAttribute)middleNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddleNameType_Code() {
		return (EAttribute)middleNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddleNameType_NameType() {
		return (EAttribute)middleNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddleNameType_Type() {
		return (EAttribute)middleNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddleNameType_AnyAttribute() {
		return (EAttribute)middleNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameDetails() {
		return nameDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetails_NameLine() {
		return (EReference)nameDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetails_PersonName() {
		return (EReference)nameDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetails_JointPersonName() {
		return (EReference)nameDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetails_OrganisationNameDetails() {
		return (EReference)nameDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDetails_Code() {
		return (EAttribute)nameDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDetails_PartyType() {
		return (EAttribute)nameDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDetails_AnyAttribute() {
		return (EAttribute)nameDetailsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameDetailsType() {
		return nameDetailsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetailsType_AddresseeIndicator() {
		return (EReference)nameDetailsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetailsType_Function() {
		return (EReference)nameDetailsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDetailsType_DependencyName() {
		return (EReference)nameDetailsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDetailsType_Any() {
		return (EAttribute)nameDetailsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDetailsType_NameDetailsKey() {
		return (EAttribute)nameDetailsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameLineType() {
		return nameLineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameLineType_Mixed() {
		return (EAttribute)nameLineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameLineType_Code() {
		return (EAttribute)nameLineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameLineType_NameType() {
		return (EAttribute)nameLineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameLineType_Type() {
		return (EAttribute)nameLineTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameLineType_AnyAttribute() {
		return (EAttribute)nameLineTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamePrefixType() {
		return namePrefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamePrefixType_Mixed() {
		return (EAttribute)namePrefixTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamePrefixType_Code() {
		return (EAttribute)namePrefixTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamePrefixType_NameType() {
		return (EAttribute)namePrefixTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamePrefixType_Type() {
		return (EAttribute)namePrefixTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamePrefixType_AnyAttribute() {
		return (EAttribute)namePrefixTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationFormerNameType() {
		return organisationFormerNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationFormerNameType_Any() {
		return (EAttribute)organisationFormerNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationFormerNameType_ValidFrom() {
		return (EAttribute)organisationFormerNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationFormerNameType_ValidTo() {
		return (EAttribute)organisationFormerNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationKnownAsType() {
		return organisationKnownAsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationKnownAsType_Any() {
		return (EAttribute)organisationKnownAsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationKnownAsType_ValidFrom() {
		return (EAttribute)organisationKnownAsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationKnownAsType_ValidTo() {
		return (EAttribute)organisationKnownAsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationNameDetails() {
		return organisationNameDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationNameDetails_NameLine() {
		return (EReference)organisationNameDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationNameDetails_OrganisationName() {
		return (EReference)organisationNameDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationNameDetails_OrganisationType() {
		return (EReference)organisationNameDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameDetails_NameDetailsKeyRef() {
		return (EAttribute)organisationNameDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameDetails_Type() {
		return (EAttribute)organisationNameDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameDetails_AnyAttribute() {
		return (EAttribute)organisationNameDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationNameDetailsType() {
		return organisationNameDetailsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationNameDetailsType_OrganisationFormerName() {
		return (EReference)organisationNameDetailsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationNameDetailsType_OrganisationKnownAs() {
		return (EReference)organisationNameDetailsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameDetailsType_Any() {
		return (EAttribute)organisationNameDetailsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationNameType() {
		return organisationNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameType_Mixed() {
		return (EAttribute)organisationNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameType_Code() {
		return (EAttribute)organisationNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameType_NameType() {
		return (EAttribute)organisationNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameType_Type() {
		return (EAttribute)organisationNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationNameType_AnyAttribute() {
		return (EAttribute)organisationNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationTypeType() {
		return organisationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationTypeType_Mixed() {
		return (EAttribute)organisationTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationTypeType_Code() {
		return (EAttribute)organisationTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationTypeType_NameType() {
		return (EAttribute)organisationTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationTypeType_Type() {
		return (EAttribute)organisationTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisationTypeType_AnyAttribute() {
		return (EAttribute)organisationTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherNameType() {
		return otherNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherNameType_Mixed() {
		return (EAttribute)otherNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherNameType_Code() {
		return (EAttribute)otherNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherNameType_NameType() {
		return (EAttribute)otherNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherNameType_Type() {
		return (EAttribute)otherNameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherNameType_AnyAttribute() {
		return (EAttribute)otherNameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonName() {
		return personNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_NameLine() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_PrecedingTitle() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_Title() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_FirstName() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_MiddleName() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_NamePrefix() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_LastName() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_OtherName() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_Alias() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_GenerationIdentifier() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_Suffix() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonName_GeneralSuffix() {
		return (EReference)personNameEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonName_Code() {
		return (EAttribute)personNameEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonName_NameDetailsKeyRef() {
		return (EAttribute)personNameEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonName_Type() {
		return (EAttribute)personNameEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonName_AnyAttribute() {
		return (EAttribute)personNameEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameType() {
		return personNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_FormerName() {
		return (EReference)personNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonNameType_KnownAs() {
		return (EReference)personNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameType_Any() {
		return (EAttribute)personNameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedingTitleType() {
		return precedingTitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedingTitleType_Mixed() {
		return (EAttribute)precedingTitleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedingTitleType_Code() {
		return (EAttribute)precedingTitleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedingTitleType_Type() {
		return (EAttribute)precedingTitleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedingTitleType_AnyAttribute() {
		return (EAttribute)precedingTitleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuffixType() {
		return suffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuffixType_Mixed() {
		return (EAttribute)suffixTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuffixType_Code() {
		return (EAttribute)suffixTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuffixType_Type() {
		return (EAttribute)suffixTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuffixType_AnyAttribute() {
		return (EAttribute)suffixTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Mixed() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Code() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Type() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_AnyAttribute() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXNLType() {
		return xnlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXNLType_NameDetails() {
		return (EReference)xnlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXNLType_Any() {
		return (EAttribute)xnlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXNLType_Version() {
		return (EAttribute)xnlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXNLType_AnyAttribute() {
		return (EAttribute)xnlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Factory get_0Factory() {
		return (_0Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addresseeIndicatorTypeEClass = createEClass(ADDRESSEE_INDICATOR_TYPE);
		createEAttribute(addresseeIndicatorTypeEClass, ADDRESSEE_INDICATOR_TYPE__MIXED);
		createEAttribute(addresseeIndicatorTypeEClass, ADDRESSEE_INDICATOR_TYPE__CODE);
		createEAttribute(addresseeIndicatorTypeEClass, ADDRESSEE_INDICATOR_TYPE__ANY_ATTRIBUTE);

		aliasTypeEClass = createEClass(ALIAS_TYPE);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__MIXED);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__CODE);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__NAME_TYPE);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__TYPE);
		createEAttribute(aliasTypeEClass, ALIAS_TYPE__ANY_ATTRIBUTE);

		dependencyNameTypeEClass = createEClass(DEPENDENCY_NAME_TYPE);
		createEAttribute(dependencyNameTypeEClass, DEPENDENCY_NAME_TYPE__ANY);
		createEAttribute(dependencyNameTypeEClass, DEPENDENCY_NAME_TYPE__DEPENDENCY_TYPE);
		createEAttribute(dependencyNameTypeEClass, DEPENDENCY_NAME_TYPE__NAME_DETAILS_KEY_REF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FUNCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__JOINT_PERSON_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAME_DETAILS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANISATION_NAME_DETAILS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XNL);

		firstNameTypeEClass = createEClass(FIRST_NAME_TYPE);
		createEAttribute(firstNameTypeEClass, FIRST_NAME_TYPE__MIXED);
		createEAttribute(firstNameTypeEClass, FIRST_NAME_TYPE__CODE);
		createEAttribute(firstNameTypeEClass, FIRST_NAME_TYPE__NAME_TYPE);
		createEAttribute(firstNameTypeEClass, FIRST_NAME_TYPE__TYPE);
		createEAttribute(firstNameTypeEClass, FIRST_NAME_TYPE__ANY_ATTRIBUTE);

		formerNameTypeEClass = createEClass(FORMER_NAME_TYPE);
		createEAttribute(formerNameTypeEClass, FORMER_NAME_TYPE__ANY);
		createEAttribute(formerNameTypeEClass, FORMER_NAME_TYPE__VALID_FROM);
		createEAttribute(formerNameTypeEClass, FORMER_NAME_TYPE__VALID_TO);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__MIXED);
		createEAttribute(functionEClass, FUNCTION__CODE);
		createEAttribute(functionEClass, FUNCTION__ANY_ATTRIBUTE);

		generalSuffixTypeEClass = createEClass(GENERAL_SUFFIX_TYPE);
		createEAttribute(generalSuffixTypeEClass, GENERAL_SUFFIX_TYPE__MIXED);
		createEAttribute(generalSuffixTypeEClass, GENERAL_SUFFIX_TYPE__CODE);
		createEAttribute(generalSuffixTypeEClass, GENERAL_SUFFIX_TYPE__TYPE);
		createEAttribute(generalSuffixTypeEClass, GENERAL_SUFFIX_TYPE__ANY_ATTRIBUTE);

		generationIdentifierTypeEClass = createEClass(GENERATION_IDENTIFIER_TYPE);
		createEAttribute(generationIdentifierTypeEClass, GENERATION_IDENTIFIER_TYPE__MIXED);
		createEAttribute(generationIdentifierTypeEClass, GENERATION_IDENTIFIER_TYPE__CODE);
		createEAttribute(generationIdentifierTypeEClass, GENERATION_IDENTIFIER_TYPE__TYPE);
		createEAttribute(generationIdentifierTypeEClass, GENERATION_IDENTIFIER_TYPE__ANY_ATTRIBUTE);

		jointPersonNameTypeEClass = createEClass(JOINT_PERSON_NAME_TYPE);
		createEAttribute(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__GROUP);
		createEReference(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__NAME_LINE);
		createEReference(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__PERSON_NAME);
		createEAttribute(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__ANY);
		createEAttribute(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__CODE);
		createEAttribute(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__JOINT_NAME_CONNECTOR);
		createEAttribute(jointPersonNameTypeEClass, JOINT_PERSON_NAME_TYPE__ANY_ATTRIBUTE);

		knownAsTypeEClass = createEClass(KNOWN_AS_TYPE);
		createEAttribute(knownAsTypeEClass, KNOWN_AS_TYPE__ANY);
		createEAttribute(knownAsTypeEClass, KNOWN_AS_TYPE__VALID_FROM);
		createEAttribute(knownAsTypeEClass, KNOWN_AS_TYPE__VALID_TO);

		lastNameTypeEClass = createEClass(LAST_NAME_TYPE);
		createEAttribute(lastNameTypeEClass, LAST_NAME_TYPE__MIXED);
		createEAttribute(lastNameTypeEClass, LAST_NAME_TYPE__CODE);
		createEAttribute(lastNameTypeEClass, LAST_NAME_TYPE__NAME_TYPE);
		createEAttribute(lastNameTypeEClass, LAST_NAME_TYPE__TYPE);
		createEAttribute(lastNameTypeEClass, LAST_NAME_TYPE__ANY_ATTRIBUTE);

		middleNameTypeEClass = createEClass(MIDDLE_NAME_TYPE);
		createEAttribute(middleNameTypeEClass, MIDDLE_NAME_TYPE__MIXED);
		createEAttribute(middleNameTypeEClass, MIDDLE_NAME_TYPE__CODE);
		createEAttribute(middleNameTypeEClass, MIDDLE_NAME_TYPE__NAME_TYPE);
		createEAttribute(middleNameTypeEClass, MIDDLE_NAME_TYPE__TYPE);
		createEAttribute(middleNameTypeEClass, MIDDLE_NAME_TYPE__ANY_ATTRIBUTE);

		nameDetailsEClass = createEClass(NAME_DETAILS);
		createEReference(nameDetailsEClass, NAME_DETAILS__NAME_LINE);
		createEReference(nameDetailsEClass, NAME_DETAILS__PERSON_NAME);
		createEReference(nameDetailsEClass, NAME_DETAILS__JOINT_PERSON_NAME);
		createEReference(nameDetailsEClass, NAME_DETAILS__ORGANISATION_NAME_DETAILS);
		createEAttribute(nameDetailsEClass, NAME_DETAILS__CODE);
		createEAttribute(nameDetailsEClass, NAME_DETAILS__PARTY_TYPE);
		createEAttribute(nameDetailsEClass, NAME_DETAILS__ANY_ATTRIBUTE);

		nameDetailsTypeEClass = createEClass(NAME_DETAILS_TYPE);
		createEReference(nameDetailsTypeEClass, NAME_DETAILS_TYPE__ADDRESSEE_INDICATOR);
		createEReference(nameDetailsTypeEClass, NAME_DETAILS_TYPE__FUNCTION);
		createEReference(nameDetailsTypeEClass, NAME_DETAILS_TYPE__DEPENDENCY_NAME);
		createEAttribute(nameDetailsTypeEClass, NAME_DETAILS_TYPE__ANY);
		createEAttribute(nameDetailsTypeEClass, NAME_DETAILS_TYPE__NAME_DETAILS_KEY);

		nameLineTypeEClass = createEClass(NAME_LINE_TYPE);
		createEAttribute(nameLineTypeEClass, NAME_LINE_TYPE__MIXED);
		createEAttribute(nameLineTypeEClass, NAME_LINE_TYPE__CODE);
		createEAttribute(nameLineTypeEClass, NAME_LINE_TYPE__NAME_TYPE);
		createEAttribute(nameLineTypeEClass, NAME_LINE_TYPE__TYPE);
		createEAttribute(nameLineTypeEClass, NAME_LINE_TYPE__ANY_ATTRIBUTE);

		namePrefixTypeEClass = createEClass(NAME_PREFIX_TYPE);
		createEAttribute(namePrefixTypeEClass, NAME_PREFIX_TYPE__MIXED);
		createEAttribute(namePrefixTypeEClass, NAME_PREFIX_TYPE__CODE);
		createEAttribute(namePrefixTypeEClass, NAME_PREFIX_TYPE__NAME_TYPE);
		createEAttribute(namePrefixTypeEClass, NAME_PREFIX_TYPE__TYPE);
		createEAttribute(namePrefixTypeEClass, NAME_PREFIX_TYPE__ANY_ATTRIBUTE);

		organisationFormerNameTypeEClass = createEClass(ORGANISATION_FORMER_NAME_TYPE);
		createEAttribute(organisationFormerNameTypeEClass, ORGANISATION_FORMER_NAME_TYPE__ANY);
		createEAttribute(organisationFormerNameTypeEClass, ORGANISATION_FORMER_NAME_TYPE__VALID_FROM);
		createEAttribute(organisationFormerNameTypeEClass, ORGANISATION_FORMER_NAME_TYPE__VALID_TO);

		organisationKnownAsTypeEClass = createEClass(ORGANISATION_KNOWN_AS_TYPE);
		createEAttribute(organisationKnownAsTypeEClass, ORGANISATION_KNOWN_AS_TYPE__ANY);
		createEAttribute(organisationKnownAsTypeEClass, ORGANISATION_KNOWN_AS_TYPE__VALID_FROM);
		createEAttribute(organisationKnownAsTypeEClass, ORGANISATION_KNOWN_AS_TYPE__VALID_TO);

		organisationNameDetailsEClass = createEClass(ORGANISATION_NAME_DETAILS);
		createEReference(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__NAME_LINE);
		createEReference(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__ORGANISATION_NAME);
		createEReference(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__ORGANISATION_TYPE);
		createEAttribute(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__NAME_DETAILS_KEY_REF);
		createEAttribute(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__TYPE);
		createEAttribute(organisationNameDetailsEClass, ORGANISATION_NAME_DETAILS__ANY_ATTRIBUTE);

		organisationNameDetailsTypeEClass = createEClass(ORGANISATION_NAME_DETAILS_TYPE);
		createEReference(organisationNameDetailsTypeEClass, ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_FORMER_NAME);
		createEReference(organisationNameDetailsTypeEClass, ORGANISATION_NAME_DETAILS_TYPE__ORGANISATION_KNOWN_AS);
		createEAttribute(organisationNameDetailsTypeEClass, ORGANISATION_NAME_DETAILS_TYPE__ANY);

		organisationNameTypeEClass = createEClass(ORGANISATION_NAME_TYPE);
		createEAttribute(organisationNameTypeEClass, ORGANISATION_NAME_TYPE__MIXED);
		createEAttribute(organisationNameTypeEClass, ORGANISATION_NAME_TYPE__CODE);
		createEAttribute(organisationNameTypeEClass, ORGANISATION_NAME_TYPE__NAME_TYPE);
		createEAttribute(organisationNameTypeEClass, ORGANISATION_NAME_TYPE__TYPE);
		createEAttribute(organisationNameTypeEClass, ORGANISATION_NAME_TYPE__ANY_ATTRIBUTE);

		organisationTypeTypeEClass = createEClass(ORGANISATION_TYPE_TYPE);
		createEAttribute(organisationTypeTypeEClass, ORGANISATION_TYPE_TYPE__MIXED);
		createEAttribute(organisationTypeTypeEClass, ORGANISATION_TYPE_TYPE__CODE);
		createEAttribute(organisationTypeTypeEClass, ORGANISATION_TYPE_TYPE__NAME_TYPE);
		createEAttribute(organisationTypeTypeEClass, ORGANISATION_TYPE_TYPE__TYPE);
		createEAttribute(organisationTypeTypeEClass, ORGANISATION_TYPE_TYPE__ANY_ATTRIBUTE);

		otherNameTypeEClass = createEClass(OTHER_NAME_TYPE);
		createEAttribute(otherNameTypeEClass, OTHER_NAME_TYPE__MIXED);
		createEAttribute(otherNameTypeEClass, OTHER_NAME_TYPE__CODE);
		createEAttribute(otherNameTypeEClass, OTHER_NAME_TYPE__NAME_TYPE);
		createEAttribute(otherNameTypeEClass, OTHER_NAME_TYPE__TYPE);
		createEAttribute(otherNameTypeEClass, OTHER_NAME_TYPE__ANY_ATTRIBUTE);

		personNameEClass = createEClass(PERSON_NAME);
		createEReference(personNameEClass, PERSON_NAME__NAME_LINE);
		createEReference(personNameEClass, PERSON_NAME__PRECEDING_TITLE);
		createEReference(personNameEClass, PERSON_NAME__TITLE);
		createEReference(personNameEClass, PERSON_NAME__FIRST_NAME);
		createEReference(personNameEClass, PERSON_NAME__MIDDLE_NAME);
		createEReference(personNameEClass, PERSON_NAME__NAME_PREFIX);
		createEReference(personNameEClass, PERSON_NAME__LAST_NAME);
		createEReference(personNameEClass, PERSON_NAME__OTHER_NAME);
		createEReference(personNameEClass, PERSON_NAME__ALIAS);
		createEReference(personNameEClass, PERSON_NAME__GENERATION_IDENTIFIER);
		createEReference(personNameEClass, PERSON_NAME__SUFFIX);
		createEReference(personNameEClass, PERSON_NAME__GENERAL_SUFFIX);
		createEAttribute(personNameEClass, PERSON_NAME__CODE);
		createEAttribute(personNameEClass, PERSON_NAME__NAME_DETAILS_KEY_REF);
		createEAttribute(personNameEClass, PERSON_NAME__TYPE);
		createEAttribute(personNameEClass, PERSON_NAME__ANY_ATTRIBUTE);

		personNameTypeEClass = createEClass(PERSON_NAME_TYPE);
		createEReference(personNameTypeEClass, PERSON_NAME_TYPE__FORMER_NAME);
		createEReference(personNameTypeEClass, PERSON_NAME_TYPE__KNOWN_AS);
		createEAttribute(personNameTypeEClass, PERSON_NAME_TYPE__ANY);

		precedingTitleTypeEClass = createEClass(PRECEDING_TITLE_TYPE);
		createEAttribute(precedingTitleTypeEClass, PRECEDING_TITLE_TYPE__MIXED);
		createEAttribute(precedingTitleTypeEClass, PRECEDING_TITLE_TYPE__CODE);
		createEAttribute(precedingTitleTypeEClass, PRECEDING_TITLE_TYPE__TYPE);
		createEAttribute(precedingTitleTypeEClass, PRECEDING_TITLE_TYPE__ANY_ATTRIBUTE);

		suffixTypeEClass = createEClass(SUFFIX_TYPE);
		createEAttribute(suffixTypeEClass, SUFFIX_TYPE__MIXED);
		createEAttribute(suffixTypeEClass, SUFFIX_TYPE__CODE);
		createEAttribute(suffixTypeEClass, SUFFIX_TYPE__TYPE);
		createEAttribute(suffixTypeEClass, SUFFIX_TYPE__ANY_ATTRIBUTE);

		titleTypeEClass = createEClass(TITLE_TYPE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__MIXED);
		createEAttribute(titleTypeEClass, TITLE_TYPE__CODE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__TYPE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__ANY_ATTRIBUTE);

		xnlTypeEClass = createEClass(XNL_TYPE);
		createEReference(xnlTypeEClass, XNL_TYPE__NAME_DETAILS);
		createEAttribute(xnlTypeEClass, XNL_TYPE__ANY);
		createEAttribute(xnlTypeEClass, XNL_TYPE__VERSION);
		createEAttribute(xnlTypeEClass, XNL_TYPE__ANY_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dependencyNameTypeEClass.getESuperTypes().add(this.getNameDetails());
		formerNameTypeEClass.getESuperTypes().add(this.getPersonName());
		knownAsTypeEClass.getESuperTypes().add(this.getPersonName());
		nameDetailsTypeEClass.getESuperTypes().add(this.getNameDetails());
		organisationFormerNameTypeEClass.getESuperTypes().add(this.getOrganisationNameDetails());
		organisationKnownAsTypeEClass.getESuperTypes().add(this.getOrganisationNameDetails());
		organisationNameDetailsTypeEClass.getESuperTypes().add(this.getOrganisationNameDetails());
		personNameTypeEClass.getESuperTypes().add(this.getPersonName());

		// Initialize classes, features, and operations; add parameters
		initEClass(addresseeIndicatorTypeEClass, AddresseeIndicatorType.class, "AddresseeIndicatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddresseeIndicatorType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AddresseeIndicatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddresseeIndicatorType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, AddresseeIndicatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddresseeIndicatorType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AddresseeIndicatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasTypeEClass, AliasType.class, "AliasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAliasType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAliasType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAliasType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAliasType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAliasType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyNameTypeEClass, DependencyNameType.class, "DependencyNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyNameType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DependencyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyNameType_DependencyType(), theXMLTypePackage.getAnySimpleType(), "dependencyType", null, 0, 1, DependencyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyNameType_NameDetailsKeyRef(), theXMLTypePackage.getAnySimpleType(), "nameDetailsKeyRef", null, 0, 1, DependencyNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Function(), this.getFunction(), null, "function", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_JointPersonName(), this.getJointPersonNameType(), null, "jointPersonName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NameDetails(), this.getNameDetailsType(), null, "nameDetails", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrganisationNameDetails(), this.getOrganisationNameDetailsType(), null, "organisationNameDetails", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PersonName(), this.getPersonNameType(), null, "personName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XNL(), this.getXNLType(), null, "xNL", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(firstNameTypeEClass, FirstNameType.class, "FirstNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, FirstNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirstNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, FirstNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirstNameType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, FirstNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirstNameType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, FirstNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirstNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, FirstNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formerNameTypeEClass, FormerNameType.class, "FormerNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormerNameType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, FormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormerNameType_ValidFrom(), theXMLTypePackage.getAnySimpleType(), "validFrom", null, 0, 1, FormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormerNameType_ValidTo(), theXMLTypePackage.getAnySimpleType(), "validTo", null, 0, 1, FormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalSuffixTypeEClass, GeneralSuffixType.class, "GeneralSuffixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralSuffixType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, GeneralSuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSuffixType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, GeneralSuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSuffixType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, GeneralSuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralSuffixType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GeneralSuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationIdentifierTypeEClass, GenerationIdentifierType.class, "GenerationIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationIdentifierType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, GenerationIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationIdentifierType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, GenerationIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationIdentifierType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, GenerationIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationIdentifierType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GenerationIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jointPersonNameTypeEClass, JointPersonNameType.class, "JointPersonNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJointPersonNameType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, JointPersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointPersonNameType_NameLine(), this.getNameLineType(), null, "nameLine", null, 0, -1, JointPersonNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJointPersonNameType_PersonName(), this.getPersonNameType(), null, "personName", null, 0, -1, JointPersonNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJointPersonNameType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, JointPersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJointPersonNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, JointPersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJointPersonNameType_JointNameConnector(), theXMLTypePackage.getAnySimpleType(), "jointNameConnector", null, 0, 1, JointPersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJointPersonNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, JointPersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knownAsTypeEClass, KnownAsType.class, "KnownAsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKnownAsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnownAsType_ValidFrom(), theXMLTypePackage.getAnySimpleType(), "validFrom", null, 0, 1, KnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnownAsType_ValidTo(), theXMLTypePackage.getAnySimpleType(), "validTo", null, 0, 1, KnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lastNameTypeEClass, LastNameType.class, "LastNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLastNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LastNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLastNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, LastNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLastNameType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, LastNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLastNameType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, LastNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLastNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LastNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(middleNameTypeEClass, MiddleNameType.class, "MiddleNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiddleNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, MiddleNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiddleNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, MiddleNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiddleNameType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, MiddleNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiddleNameType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, MiddleNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiddleNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MiddleNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameDetailsEClass, NameDetails.class, "NameDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameDetails_NameLine(), this.getNameLineType(), null, "nameLine", null, 0, -1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameDetails_PersonName(), this.getPersonNameType(), null, "personName", null, 0, 1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameDetails_JointPersonName(), this.getJointPersonNameType(), null, "jointPersonName", null, 0, 1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameDetails_OrganisationNameDetails(), this.getOrganisationNameDetailsType(), null, "organisationNameDetails", null, 0, 1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameDetails_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameDetails_PartyType(), theXMLTypePackage.getAnySimpleType(), "partyType", null, 0, 1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameDetails_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameDetailsTypeEClass, NameDetailsType.class, "NameDetailsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameDetailsType_AddresseeIndicator(), this.getAddresseeIndicatorType(), null, "addresseeIndicator", null, 0, 1, NameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameDetailsType_Function(), this.getFunction(), null, "function", null, 0, 1, NameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameDetailsType_DependencyName(), this.getDependencyNameType(), null, "dependencyName", null, 0, 1, NameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameDetailsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, NameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameDetailsType_NameDetailsKey(), theXMLTypePackage.getAnySimpleType(), "nameDetailsKey", null, 0, 1, NameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameLineTypeEClass, NameLineType.class, "NameLineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameLineType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NameLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameLineType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, NameLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameLineType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, NameLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameLineType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, NameLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameLineType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NameLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namePrefixTypeEClass, NamePrefixType.class, "NamePrefixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamePrefixType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NamePrefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamePrefixType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, NamePrefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamePrefixType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, NamePrefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamePrefixType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, NamePrefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamePrefixType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NamePrefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationFormerNameTypeEClass, OrganisationFormerNameType.class, "OrganisationFormerNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisationFormerNameType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OrganisationFormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationFormerNameType_ValidFrom(), theXMLTypePackage.getAnySimpleType(), "validFrom", null, 0, 1, OrganisationFormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationFormerNameType_ValidTo(), theXMLTypePackage.getAnySimpleType(), "validTo", null, 0, 1, OrganisationFormerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationKnownAsTypeEClass, OrganisationKnownAsType.class, "OrganisationKnownAsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisationKnownAsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OrganisationKnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationKnownAsType_ValidFrom(), theXMLTypePackage.getAnySimpleType(), "validFrom", null, 0, 1, OrganisationKnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationKnownAsType_ValidTo(), theXMLTypePackage.getAnySimpleType(), "validTo", null, 0, 1, OrganisationKnownAsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationNameDetailsEClass, OrganisationNameDetails.class, "OrganisationNameDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationNameDetails_NameLine(), this.getNameLineType(), null, "nameLine", null, 0, -1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationNameDetails_OrganisationName(), this.getOrganisationNameType(), null, "organisationName", null, 0, -1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationNameDetails_OrganisationType(), this.getOrganisationTypeType(), null, "organisationType", null, 0, -1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameDetails_NameDetailsKeyRef(), theXMLTypePackage.getAnySimpleType(), "nameDetailsKeyRef", null, 0, 1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameDetails_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameDetails_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OrganisationNameDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationNameDetailsTypeEClass, OrganisationNameDetailsType.class, "OrganisationNameDetailsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationNameDetailsType_OrganisationFormerName(), this.getOrganisationFormerNameType(), null, "organisationFormerName", null, 0, -1, OrganisationNameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationNameDetailsType_OrganisationKnownAs(), this.getOrganisationKnownAsType(), null, "organisationKnownAs", null, 0, -1, OrganisationNameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameDetailsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, OrganisationNameDetailsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationNameTypeEClass, OrganisationNameType.class, "OrganisationNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisationNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, OrganisationNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, OrganisationNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, OrganisationNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, OrganisationNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OrganisationNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationTypeTypeEClass, OrganisationTypeType.class, "OrganisationTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisationTypeType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, OrganisationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationTypeType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, OrganisationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationTypeType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, OrganisationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationTypeType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, OrganisationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganisationTypeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OrganisationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherNameTypeEClass, OtherNameType.class, "OtherNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, OtherNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherNameType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, OtherNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherNameType_NameType(), theXMLTypePackage.getAnySimpleType(), "nameType", null, 0, 1, OtherNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherNameType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, OtherNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OtherNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personNameEClass, PersonName.class, "PersonName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonName_NameLine(), this.getNameLineType(), null, "nameLine", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_PrecedingTitle(), this.getPrecedingTitleType(), null, "precedingTitle", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_Title(), this.getTitleType(), null, "title", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_FirstName(), this.getFirstNameType(), null, "firstName", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_MiddleName(), this.getMiddleNameType(), null, "middleName", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_NamePrefix(), this.getNamePrefixType(), null, "namePrefix", null, 0, 1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_LastName(), this.getLastNameType(), null, "lastName", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_OtherName(), this.getOtherNameType(), null, "otherName", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_Alias(), this.getAliasType(), null, "alias", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_GenerationIdentifier(), this.getGenerationIdentifierType(), null, "generationIdentifier", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_Suffix(), this.getSuffixType(), null, "suffix", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonName_GeneralSuffix(), this.getGeneralSuffixType(), null, "generalSuffix", null, 0, 1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonName_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonName_NameDetailsKeyRef(), theXMLTypePackage.getAnySimpleType(), "nameDetailsKeyRef", null, 0, 1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonName_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonName_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PersonName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personNameTypeEClass, PersonNameType.class, "PersonNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonNameType_FormerName(), this.getFormerNameType(), null, "formerName", null, 0, -1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonNameType_KnownAs(), this.getKnownAsType(), null, "knownAs", null, 0, -1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PersonNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedingTitleTypeEClass, PrecedingTitleType.class, "PrecedingTitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedingTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PrecedingTitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedingTitleType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, PrecedingTitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedingTitleType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, PrecedingTitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedingTitleType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PrecedingTitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suffixTypeEClass, SuffixType.class, "SuffixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuffixType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuffixType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, SuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuffixType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, SuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuffixType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SuffixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeEClass, TitleType.class, "TitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_Code(), theXMLTypePackage.getAnySimpleType(), "code", null, 0, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xnlTypeEClass, XNLType.class, "XNLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXNLType_NameDetails(), this.getNameDetailsType(), null, "nameDetails", null, 1, -1, XNLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXNLType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, XNLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXNLType_Version(), theXMLTypePackage.getAnySimpleType(), "version", null, 0, 1, XNLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXNLType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, XNLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (addresseeIndicatorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AddresseeIndicator_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAddresseeIndicatorType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getAddresseeIndicatorType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getAddresseeIndicatorType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });	
		addAnnotation
		  (aliasTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Alias_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAliasType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getAliasType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getAliasType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getAliasType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getAliasType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (dependencyNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DependencyName_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDependencyNameType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getDependencyNameType_DependencyType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DependencyType"
		   });	
		addAnnotation
		  (getDependencyNameType_NameDetailsKeyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameDetailsKeyRef"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Function",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_JointPersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JointPersonName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_NameDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameDetails",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OrganisationNameDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationNameDetails",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_XNL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xNL",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (firstNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FirstName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getFirstNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getFirstNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getFirstNameType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getFirstNameType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getFirstNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (formerNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FormerName_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFormerNameType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":16",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getFormerNameType_ValidFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidFrom"
		   });	
		addAnnotation
		  (getFormerNameType_ValidTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidTo"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "name", "Function",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getFunction_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getFunction_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getFunction_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "strict"
		   });	
		addAnnotation
		  (generalSuffixTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeneralSuffix_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getGeneralSuffixType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getGeneralSuffixType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getGeneralSuffixType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getGeneralSuffixType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (generationIdentifierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GenerationIdentifier_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getGenerationIdentifierType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getGenerationIdentifierType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getGenerationIdentifierType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getGenerationIdentifierType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (jointPersonNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "JointPersonName_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getJointPersonNameType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getJointPersonNameType_NameLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameLine",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getJointPersonNameType_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getJointPersonNameType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getJointPersonNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getJointPersonNameType_JointNameConnector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "JointNameConnector"
		   });	
		addAnnotation
		  (getJointPersonNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (knownAsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KnownAs_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getKnownAsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":16",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getKnownAsType_ValidFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidFrom"
		   });	
		addAnnotation
		  (getKnownAsType_ValidTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidTo"
		   });	
		addAnnotation
		  (lastNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LastName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getLastNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getLastNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getLastNameType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getLastNameType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getLastNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (middleNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MiddleName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getMiddleNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getMiddleNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getMiddleNameType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getMiddleNameType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getMiddleNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (nameDetailsEClass, 
		   source, 
		   new String[] {
			 "name", "NameDetails",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNameDetails_NameLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameLine",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetails_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersonName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetails_JointPersonName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JointPersonName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetails_OrganisationNameDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationNameDetails",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetails_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getNameDetails_PartyType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PartyType"
		   });	
		addAnnotation
		  (getNameDetails_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (nameDetailsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NameDetails_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNameDetailsType_AddresseeIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddresseeIndicator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetailsType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Function",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetailsType_DependencyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DependencyName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNameDetailsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getNameDetailsType_NameDetailsKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameDetailsKey"
		   });	
		addAnnotation
		  (nameLineTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NameLineType",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNameLineType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getNameLineType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getNameLineType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getNameLineType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getNameLineType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (namePrefixTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NamePrefix_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNamePrefixType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getNamePrefixType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getNamePrefixType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getNamePrefixType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getNamePrefixType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (organisationFormerNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationFormerName_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganisationFormerNameType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getOrganisationFormerNameType_ValidFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidFrom"
		   });	
		addAnnotation
		  (getOrganisationFormerNameType_ValidTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidTo"
		   });	
		addAnnotation
		  (organisationKnownAsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationKnownAs_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganisationKnownAsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":6",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getOrganisationKnownAsType_ValidFrom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidFrom"
		   });	
		addAnnotation
		  (getOrganisationKnownAsType_ValidTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValidTo"
		   });	
		addAnnotation
		  (organisationNameDetailsEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationNameDetails",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_NameLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameLine",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_OrganisationName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_OrganisationType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_NameDetailsKeyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameDetailsKeyRef"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getOrganisationNameDetails_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":5",
			 "processing", "strict"
		   });	
		addAnnotation
		  (organisationNameDetailsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationNameDetails_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrganisationNameDetailsType_OrganisationFormerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationFormerName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganisationNameDetailsType_OrganisationKnownAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrganisationKnownAs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOrganisationNameDetailsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":8",
			 "processing", "strict"
		   });	
		addAnnotation
		  (organisationNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOrganisationNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getOrganisationNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getOrganisationNameType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getOrganisationNameType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getOrganisationNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (organisationTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrganisationType_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOrganisationTypeType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getOrganisationTypeType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getOrganisationTypeType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getOrganisationTypeType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getOrganisationTypeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (otherNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OtherName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOtherNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getOtherNameType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getOtherNameType_NameType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameType"
		   });	
		addAnnotation
		  (getOtherNameType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getOtherNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (personNameEClass, 
		   source, 
		   new String[] {
			 "name", "PersonName",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPersonName_NameLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameLine",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_PrecedingTitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PrecedingTitle",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FirstName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_MiddleName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MiddleName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_NamePrefix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamePrefix",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_LastName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LastName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_OtherName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OtherName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_Alias(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Alias",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_GenerationIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GenerationIdentifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_Suffix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Suffix",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_GeneralSuffix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeneralSuffix",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonName_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getPersonName_NameDetailsKeyRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NameDetailsKeyRef"
		   });	
		addAnnotation
		  (getPersonName_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getPersonName_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":15",
			 "processing", "strict"
		   });	
		addAnnotation
		  (personNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonName_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPersonNameType_FormerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FormerName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonNameType_KnownAs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KnownAs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPersonNameType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":18",
			 "processing", "strict"
		   });	
		addAnnotation
		  (precedingTitleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PrecedingTitle_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getPrecedingTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getPrecedingTitleType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getPrecedingTitleType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getPrecedingTitleType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (suffixTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Suffix_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSuffixType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getSuffixType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getSuffixType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getSuffixType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (titleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Title_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getTitleType_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Code"
		   });	
		addAnnotation
		  (getTitleType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });	
		addAnnotation
		  (getTitleType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });	
		addAnnotation
		  (xnlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xNL_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getXNLType_NameDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NameDetails",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getXNLType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getXNLType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Version"
		   });	
		addAnnotation
		  (getXNLType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "strict"
		   });
	}

} //_0PackageImpl
