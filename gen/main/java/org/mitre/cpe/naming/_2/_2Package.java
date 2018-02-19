/**
 */
package org.mitre.cpe.naming._2;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  
 * <!-- end-model-doc -->
 * @see org.mitre.cpe.naming._2._2Factory
 * @model kind="package"
 * @generated
 */
public interface _2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpe.mitre.org/naming/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_2Package eINSTANCE = org.mitre.cpe.naming._2.impl._2PackageImpl.init();

	/**
	 * The meta object id for the '<em>Cpe22 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mitre.cpe.naming._2.impl._2PackageImpl#getCpe22Type()
	 * @generated
	 */
	int CPE22_TYPE = 0;

	/**
	 * The meta object id for the '<em>Cpe23 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.mitre.cpe.naming._2.impl._2PackageImpl#getCpe23Type()
	 * @generated
	 */
	int CPE23_TYPE = 1;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cpe22 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cpe22 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cpe22Type' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='[c][pP][eE]:/[AHOaho]?(:[A-Za-z0-9\\._\\-~%25]*){0,6}'"
	 * @generated
	 */
	EDataType getCpe22Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Cpe23 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cpe23 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='cpe23Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='cpe:2\\.3:[aho\\*\\-](:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&amp;\'\\(\\)\\+,/:;&lt;=&gt;@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){5}(:(([a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?)|[\\*\\-]))(:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%25&amp;\'\\(\\)\\+,/:;&lt;=&gt;@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){4}'"
	 * @generated
	 */
	EDataType getCpe23Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_2Factory get_2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Cpe22 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.mitre.cpe.naming._2.impl._2PackageImpl#getCpe22Type()
		 * @generated
		 */
		EDataType CPE22_TYPE = eINSTANCE.getCpe22Type();

		/**
		 * The meta object literal for the '<em>Cpe23 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.mitre.cpe.naming._2.impl._2PackageImpl#getCpe23Type()
		 * @generated
		 */
		EDataType CPE23_TYPE = eINSTANCE.getCpe23Type();

	}

} //_2Package
