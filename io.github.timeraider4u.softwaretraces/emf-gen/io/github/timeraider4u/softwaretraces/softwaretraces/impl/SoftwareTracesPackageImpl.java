/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces.impl;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNodeVisitor;
import io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesFactory;
import io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SoftwareTracesPackageImpl extends EPackageImpl
		implements SoftwareTracesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass featureEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass traceEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass myNodeVisitorEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass myNodeEClass = null;
	
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwareTracesPackageImpl() {
		super(eNS_URI, SoftwareTracesFactory.eINSTANCE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;
	
	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link SoftwareTracesPackage#eINSTANCE}
	 * when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwareTracesPackage init() {
		if (isInited)
			return (SoftwareTracesPackage) EPackage.Registry.INSTANCE
					.getEPackage(SoftwareTracesPackage.eNS_URI);
		
		// Obtain or create and register package
		SoftwareTracesPackageImpl theSoftwareTracesPackage = (SoftwareTracesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SoftwareTracesPackageImpl
						? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SoftwareTracesPackageImpl());
		
		isInited = true;
		
		// Create package meta-data objects
		theSoftwareTracesPackage.createPackageContents();
		
		// Initialize created meta-data
		theSoftwareTracesPackage.initializePackageContents();
		
		// Mark meta-data to indicate it can't be changed
		theSoftwareTracesPackage.freeze();
		
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwareTracesPackage.eNS_URI,
				theSoftwareTracesPackage);
		return theSoftwareTracesPackage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModel_ResourceFileName() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModel_Features() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModel_Traces() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModel_LastSelected() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFeature_Features() {
		return (EReference) featureEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFeature_Traces() {
		return (EReference) featureEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTrace_ProjectName() {
		return (EAttribute) traceEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTrace_FileName() {
		return (EAttribute) traceEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTrace_LineNumber() {
		return (EAttribute) traceEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTrace_Traces() {
		return (EReference) traceEClass.getEStructuralFeatures().get(3);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMyNodeVisitor() {
		return myNodeVisitorEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getMyNodeVisitor__Visit__Model() {
		return myNodeVisitorEClass.getEOperations().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getMyNodeVisitor__Visit__Feature() {
		return myNodeVisitorEClass.getEOperations().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getMyNodeVisitor__Visit__Trace() {
		return myNodeVisitorEClass.getEOperations().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getMyNodeVisitor__Visit__MyNode() {
		return myNodeVisitorEClass.getEOperations().get(3);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMyNode() {
		return myNodeEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SoftwareTracesFactory getSoftwareTracesFactory() {
		return (SoftwareTracesFactory) getEFactoryInstance();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;
	
	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;
		
		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__RESOURCE_FILE_NAME);
		createEReference(modelEClass, MODEL__FEATURES);
		createEReference(modelEClass, MODEL__TRACES);
		createEReference(modelEClass, MODEL__LAST_SELECTED);
		
		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__FEATURES);
		createEReference(featureEClass, FEATURE__TRACES);
		
		traceEClass = createEClass(TRACE);
		createEAttribute(traceEClass, TRACE__PROJECT_NAME);
		createEAttribute(traceEClass, TRACE__FILE_NAME);
		createEAttribute(traceEClass, TRACE__LINE_NUMBER);
		createEReference(traceEClass, TRACE__TRACES);
		
		myNodeVisitorEClass = createEClass(MY_NODE_VISITOR);
		createEOperation(myNodeVisitorEClass, MY_NODE_VISITOR___VISIT__MODEL);
		createEOperation(myNodeVisitorEClass, MY_NODE_VISITOR___VISIT__FEATURE);
		createEOperation(myNodeVisitorEClass, MY_NODE_VISITOR___VISIT__TRACE);
		createEOperation(myNodeVisitorEClass, MY_NODE_VISITOR___VISIT__MYNODE);
		
		myNodeEClass = createEClass(MY_NODE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;
	
	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;
		
		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		
		// Create type parameters
		
		// Set bounds for type parameters
		
		// Add supertypes to classes
		modelEClass.getESuperTypes().add(this.getMyNode());
		featureEClass.getESuperTypes().add(this.getMyNode());
		traceEClass.getESuperTypes().add(this.getMyNode());
		
		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_ResourceFileName(), ecorePackage.getEString(),
				"resourceFileName", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Features(), this.getFeature(), null, "features",
				null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Traces(), this.getTrace(), null, "traces", null,
				0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModel_LastSelected(), this.getMyNode(), null,
				"lastSelected", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFeature_Features(), this.getFeature(), null,
				"features", null, 0, -1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Traces(), this.getTrace(), null, "traces",
				null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrace_ProjectName(), ecorePackage.getEString(),
				"projectName", null, 0, 1, Trace.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrace_FileName(), ecorePackage.getEString(),
				"fileName", null, 0, 1, Trace.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrace_LineNumber(), ecorePackage.getEInt(),
				"lineNumber", null, 0, 1, Trace.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Traces(), this.getTrace(), null, "traces", null,
				0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		
		initEClass(myNodeVisitorEClass, MyNodeVisitor.class, "MyNodeVisitor",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		EOperation op = initEOperation(getMyNodeVisitor__Visit__Model(), null,
				"visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		
		op = initEOperation(getMyNodeVisitor__Visit__Feature(), null, "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		
		op = initEOperation(getMyNodeVisitor__Visit__Trace(), null, "visit", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrace(), "trace", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		
		op = initEOperation(getMyNodeVisitor__Visit__MyNode(), null, "visit", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMyNode(), "myNode", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		
		initEClass(myNodeEClass, MyNode.class, "MyNode", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		
		// Create resource
		createResource(eNS_URI);
	}
	
} // SoftwareTracesPackageImpl
