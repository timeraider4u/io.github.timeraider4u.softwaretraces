/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwareTracesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "softwaretraces";
	
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "https://timeraider4u.github.io/softwaretraces";
	
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "io.github.timeraider4u.softwaretraces";
	
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SoftwareTracesPackage eINSTANCE = io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl
			.init();
	
	/**
	 * The meta object id for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
	 * <em>My Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getMyNode()
	 * @generated
	 */
	int MY_NODE = 4;
	
	/**
	 * The number of structural features of the '<em>My Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_FEATURE_COUNT = 0;
	
	/**
	 * The number of operations of the '<em>My Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_OPERATION_COUNT = 0;
	
	/**
	 * The meta object id for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl
	 * <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;
	
	/**
	 * The feature id for the '<em><b>Resource File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL__RESOURCE_FILE_NAME = MY_NODE_FEATURE_COUNT + 0;
	
	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL__FEATURES = MY_NODE_FEATURE_COUNT + 1;
	
	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL__TRACES = MY_NODE_FEATURE_COUNT + 2;
	
	/**
	 * The feature id for the '<em><b>Last Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL__LAST_SELECTED = MY_NODE_FEATURE_COUNT + 3;
	
	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MY_NODE_FEATURE_COUNT + 4;
	
	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = MY_NODE_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.FeatureImpl
	 * <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.FeatureImpl
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;
	
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MY_NODE_FEATURE_COUNT + 0;
	
	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURES = MY_NODE_FEATURE_COUNT + 1;
	
	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__TRACES = MY_NODE_FEATURE_COUNT + 2;
	
	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MY_NODE_FEATURE_COUNT + 3;
	
	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = MY_NODE_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.TraceImpl
	 * <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.TraceImpl
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 2;
	
	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE__PROJECT_NAME = MY_NODE_FEATURE_COUNT + 0;
	
	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE__FILE_NAME = MY_NODE_FEATURE_COUNT + 1;
	
	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE__LINE_NUMBER = MY_NODE_FEATURE_COUNT + 2;
	
	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACES = MY_NODE_FEATURE_COUNT + 3;
	
	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = MY_NODE_FEATURE_COUNT + 4;
	
	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = MY_NODE_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
	 * <em>My Node Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getMyNodeVisitor()
	 * @generated
	 */
	int MY_NODE_VISITOR = 3;
	
	/**
	 * The number of structural features of the '<em>My Node Visitor</em>'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR_FEATURE_COUNT = 0;
	
	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR___VISIT__MODEL = 0;
	
	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR___VISIT__FEATURE = 1;
	
	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR___VISIT__TRACE = 2;
	
	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR___VISIT__MYNODE = 3;
	
	/**
	 * The number of operations of the '<em>My Node Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MY_NODE_VISITOR_OPERATION_COUNT = 4;
	
	/**
	 * Returns the meta object for class
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model
	 * <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Model</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Model
	 * @generated
	 */
	EClass getModel();
	
	/**
	 * Returns the meta object for the attribute
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getResourceFileName
	 * <em>Resource File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resource File Name</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Model#getResourceFileName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ResourceFileName();
	
	/**
	 * Returns the meta object for the containment reference list
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getFeatures
	 * <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Features</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Model#getFeatures()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Features();
	
	/**
	 * Returns the meta object for the containment reference list
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getTraces
	 * <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Traces</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Model#getTraces()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Traces();
	
	/**
	 * Returns the meta object for the reference
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getLastSelected
	 * <em>Last Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Last Selected</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Model#getLastSelected()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_LastSelected();
	
	/**
	 * Returns the meta object for class
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature
	 * <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Feature
	 * @generated
	 */
	EClass getFeature();
	
	/**
	 * Returns the meta object for the attribute
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getName
	 * <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();
	
	/**
	 * Returns the meta object for the containment reference list
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getFeatures
	 * <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Features</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Features();
	
	/**
	 * Returns the meta object for the containment reference list
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getTraces
	 * <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Traces</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getTraces()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Traces();
	
	/**
	 * Returns the meta object for class
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace
	 * <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Trace
	 * @generated
	 */
	EClass getTrace();
	
	/**
	 * Returns the meta object for the attribute
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getProjectName
	 * <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getProjectName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_ProjectName();
	
	/**
	 * Returns the meta object for the attribute
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getFileName
	 * <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getFileName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_FileName();
	
	/**
	 * Returns the meta object for the attribute
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getLineNumber
	 * <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getLineNumber()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_LineNumber();
	
	/**
	 * Returns the meta object for the containment reference list
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getTraces
	 * <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Traces</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getTraces()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Traces();
	
	/**
	 * Returns the meta object for class
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
	 * <em>My Node Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>My Node Visitor</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
	 * @generated
	 */
	EClass getMyNodeVisitor();
	
	/**
	 * Returns the meta object for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Model)
	 * <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Model)
	 * @generated
	 */
	EOperation getMyNodeVisitor__Visit__Model();
	
	/**
	 * Returns the meta object for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Feature)
	 * <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Feature)
	 * @generated
	 */
	EOperation getMyNodeVisitor__Visit__Feature();
	
	/**
	 * Returns the meta object for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Trace)
	 * <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.Trace)
	 * @generated
	 */
	EOperation getMyNodeVisitor__Visit__Trace();
	
	/**
	 * Returns the meta object for the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.MyNode)
	 * <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor#visit(io.github.timeraider4u.softwaretraces.softwaretraces.MyNode)
	 * @generated
	 */
	EOperation getMyNodeVisitor__Visit__MyNode();
	
	/**
	 * Returns the meta object for class
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
	 * <em>My Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>My Node</em>'.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
	 * @generated
	 */
	EClass getMyNode();
	
	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareTracesFactory getSoftwareTracesFactory();
	
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl
		 * <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();
		
		/**
		 * The meta object literal for the '<em><b>Resource File Name</b></em>'
		 * attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODEL__RESOURCE_FILE_NAME = eINSTANCE
				.getModel_ResourceFileName();
		
		/**
		 * The meta object literal for the '<em><b>Features</b></em>'
		 * containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL__FEATURES = eINSTANCE.getModel_Features();
		
		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment
		 * reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL__TRACES = eINSTANCE.getModel_Traces();
		
		/**
		 * The meta object literal for the '<em><b>Last Selected</b></em>'
		 * reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODEL__LAST_SELECTED = eINSTANCE.getModel_LastSelected();
		
		/**
		 * The meta object literal for the
		 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.FeatureImpl
		 * <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.FeatureImpl
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();
		
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();
		
		/**
		 * The meta object literal for the '<em><b>Features</b></em>'
		 * containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__FEATURES = eINSTANCE.getFeature_Features();
		
		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment
		 * reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__TRACES = eINSTANCE.getFeature_Traces();
		
		/**
		 * The meta object literal for the
		 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.TraceImpl
		 * <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.TraceImpl
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();
		
		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>'
		 * attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRACE__PROJECT_NAME = eINSTANCE.getTrace_ProjectName();
		
		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute
		 * feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRACE__FILE_NAME = eINSTANCE.getTrace_FileName();
		
		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>'
		 * attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRACE__LINE_NUMBER = eINSTANCE.getTrace_LineNumber();
		
		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment
		 * reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TRACE__TRACES = eINSTANCE.getTrace_Traces();
		
		/**
		 * The meta object literal for the
		 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
		 * <em>My Node Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getMyNodeVisitor()
		 * @generated
		 */
		EClass MY_NODE_VISITOR = eINSTANCE.getMyNodeVisitor();
		
		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MY_NODE_VISITOR___VISIT__MODEL = eINSTANCE
				.getMyNodeVisitor__Visit__Model();
		
		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MY_NODE_VISITOR___VISIT__FEATURE = eINSTANCE
				.getMyNodeVisitor__Visit__Feature();
		
		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MY_NODE_VISITOR___VISIT__TRACE = eINSTANCE
				.getMyNodeVisitor__Visit__Trace();
		
		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MY_NODE_VISITOR___VISIT__MYNODE = eINSTANCE
				.getMyNodeVisitor__Visit__MyNode();
		
		/**
		 * The meta object literal for the
		 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
		 * <em>My Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.MyNode
		 * @see io.github.timeraider4u.softwaretraces.softwaretraces.impl.SoftwareTracesPackageImpl#getMyNode()
		 * @generated
		 */
		EClass MY_NODE = eINSTANCE.getMyNode();
		
	}
	
} // SoftwareTracesPackage
