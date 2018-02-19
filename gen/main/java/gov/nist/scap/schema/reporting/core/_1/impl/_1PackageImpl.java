/**
 */
package gov.nist.scap.schema.reporting.core._1.impl;

import gov.nist.scap.schema.reporting.core._1.RelationshipType;
import gov.nist.scap.schema.reporting.core._1.RelationshipsContainerType;
import gov.nist.scap.schema.reporting.core._1.RelationshipsType;
import gov.nist.scap.schema.reporting.core._1.ScopeType;
import gov.nist.scap.schema.reporting.core._1._1Factory;
import gov.nist.scap.schema.reporting.core._1._1Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package;

import oasis.names.tc.ciq.xsdschema.xAL._2._0.impl._0PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class _1PackageImpl extends EPackageImpl implements _1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipsContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeTypeObjectEDataType = null;

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
	 * @see gov.nist.scap.schema.reporting.core._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI) : _0Package.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl the_1Package_1 = (gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.identification._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.identification._1._1Package.eINSTANCE);
		gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl the_1Package_2 = (gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) instanceof gov.nist.scap.schema.asset.reporting.format._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI) : gov.nist.scap.schema.asset.reporting.format._1._1Package.eINSTANCE);
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);
		oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl the_0Package_1 = (oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) instanceof oasis.names.tc.ciq.xsdschema.xNL._2._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI) : oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eINSTANCE);

		// Load packages
		the_0Package.loadPackage();

		// Create package meta-data objects
		the_1Package.createPackageContents();
		theXlinkPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_1Package_1.createPackageContents();
		the_1Package_2.createPackageContents();
		the_2Package.createPackageContents();
		the_0Package_1.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_1Package_2.initializePackageContents();
		the_2Package.initializePackageContents();
		the_0Package_1.initializePackageContents();

		// Fix loaded packages
		the_0Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipsContainerType() {
		return relationshipsContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsContainerType_Relationships() {
		return (EReference)relationshipsContainerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipsType() {
		return relationshipsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipsType_Relationship() {
		return (EReference)relationshipsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Ref() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Scope() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Subject() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_Type() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_AnyAttribute() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeType() {
		return scopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScopeTypeObject() {
		return scopeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
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
		relationshipsContainerTypeEClass = createEClass(RELATIONSHIPS_CONTAINER_TYPE);
		createEReference(relationshipsContainerTypeEClass, RELATIONSHIPS_CONTAINER_TYPE__RELATIONSHIPS);

		relationshipsTypeEClass = createEClass(RELATIONSHIPS_TYPE);
		createEReference(relationshipsTypeEClass, RELATIONSHIPS_TYPE__RELATIONSHIP);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__REF);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__SCOPE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__SUBJECT);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__TYPE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__ANY_ATTRIBUTE);

		// Create enums
		scopeTypeEEnum = createEEnum(SCOPE_TYPE);

		// Create data types
		scopeTypeObjectEDataType = createEDataType(SCOPE_TYPE_OBJECT);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(relationshipsContainerTypeEClass, RelationshipsContainerType.class, "RelationshipsContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipsContainerType_Relationships(), this.getRelationshipsType(), null, "relationships", null, 0, 1, RelationshipsContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipsTypeEClass, RelationshipsType.class, "RelationshipsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipsType_Relationship(), this.getRelationshipType(), null, "relationship", null, 1, -1, RelationshipsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipType_Ref(), theXMLTypePackage.getNCName(), "ref", null, 1, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_Scope(), this.getScopeType(), "scope", "inclusive", 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_Subject(), theXMLTypePackage.getNCName(), "subject", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_Type(), theXMLTypePackage.getQName(), "type", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeTypeEEnum, ScopeType.class, "ScopeType");
		addEEnumLiteral(scopeTypeEEnum, ScopeType.INCLUSIVE);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.EXCLUSIVE);

		// Initialize data types
		initEDataType(scopeTypeObjectEDataType, ScopeType.class, "ScopeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
			 "appinfo", "\n            <schema>Reporting Core</schema>\n            <author>David Waltermire, Adam Halbardier, John Wunder</author>\n            <version>1.1.0</version>\n            <date>2011-06-02</date>\n        "
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
		  (relationshipsContainerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationships-container-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRelationshipsContainerType_Relationships(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relationships",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (relationshipsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationships_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRelationshipsType_Relationship(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relationship",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (relationshipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationship-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRelationshipType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRelationshipType_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });	
		addAnnotation
		  (getRelationshipType_Subject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subject"
		   });	
		addAnnotation
		  (getRelationshipType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getRelationshipType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":4",
			 "processing", "strict"
		   });	
		addAnnotation
		  (scopeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "scope_._type"
		   });	
		addAnnotation
		  (scopeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "scope_._type:Object",
			 "baseType", "scope_._type"
		   });
	}

} //_1PackageImpl
