/**
 */
package org.mitre.cpe.naming._2.impl;

import gov.nist.scap.schema.asset.identification._1._1Package;

import gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl;

import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mitre.cpe.naming._2._2Factory;
import org.mitre.cpe.naming._2._2Package;

import org.mitre.cpe.naming._2.util._2Validator;

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
public class _2PackageImpl extends EPackageImpl implements _2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cpe22TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cpe23TypeEDataType = null;

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
	 * @see org.mitre.cpe.naming._2._2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _2PackageImpl() {
		super(eNS_URI, _2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _2Package init() {
		if (isInited) return (_2Package)EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI);

		// Obtain or create and register package
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _2PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) : _1Package.eINSTANCE);
		gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl the_1Package_1 = (gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.reporting.core._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI) : gov.nist.scap.schema.reporting.core._1._1Package.eINSTANCE);
		gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl the_1Package_2 = (gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.reporting.format._1._1Package.eINSTANCE);
		oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) instanceof oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) : oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eINSTANCE);

		// Load packages
		the_0Package.loadPackage();

		// Create package meta-data objects
		the_2Package.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_1Package.createPackageContents();
		the_1Package_1.createPackageContents();
		the_1Package_2.createPackageContents();
		the_0Package_1.createPackageContents();

		// Initialize created meta-data
		the_2Package.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_1Package.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_1Package_2.initializePackageContents();
		the_0Package_1.initializePackageContents();

		// Fix loaded packages
		the_0Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_2Package.eNS_URI, the_2Package);
		return the_2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCpe22Type() {
		return cpe22TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCpe23Type() {
		return cpe23TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2Factory get_2Factory() {
		return (_2Factory)getEFactoryInstance();
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

		// Create data types
		cpe22TypeEDataType = createEDataType(CPE22_TYPE);
		cpe23TypeEDataType = createEDataType(CPE23_TYPE);
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

		// Initialize data types
		initEDataType(cpe22TypeEDataType, String.class, "Cpe22Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cpe23TypeEDataType, String.class, "Cpe23Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\n            <schema>CPE 2.3 Naming</schema>\n            <author>Adam Halbardier</author>\n            <version>2.3</version>\n            <date>2011-07-29</date>\n        "
		   });
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
		  (cpe22TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cpe22Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI",
			 "pattern", "[c][pP][eE]:/[AHOaho]?(:[A-Za-z0-9\\._\\-~%25]*){0,6}"
		   });	
		addAnnotation
		  (cpe23TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cpe23Type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "cpe:2\\.3:[aho\\*\\-](:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&\'\\(\\)\\+,/:;<=>@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){5}(:(([a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?)|[\\*\\-]))(:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&\'\\(\\)\\+,/:;<=>@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){4}"
		   });
	}

} //_2PackageImpl
