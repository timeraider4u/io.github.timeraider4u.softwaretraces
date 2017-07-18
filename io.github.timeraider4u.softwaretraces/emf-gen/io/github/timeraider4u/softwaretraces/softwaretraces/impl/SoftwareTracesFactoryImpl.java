/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces.impl;

import io.github.timeraider4u.softwaretraces.softwaretraces.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SoftwareTracesFactoryImpl extends EFactoryImpl
		implements SoftwareTracesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static SoftwareTracesFactory init() {
		try {
			SoftwareTracesFactory theSoftwareTracesFactory = (SoftwareTracesFactory) EPackage.Registry.INSTANCE
					.getEFactory(SoftwareTracesPackage.eNS_URI);
			if (theSoftwareTracesFactory != null) {
				return theSoftwareTracesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareTracesFactoryImpl();
	}
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SoftwareTracesFactoryImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SoftwareTracesPackage.MODEL:
			return createModel();
		case SoftwareTracesPackage.FEATURE:
			return createFeature();
		case SoftwareTracesPackage.TRACE:
			return createTrace();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SoftwareTracesPackage getSoftwareTracesPackage() {
		return (SoftwareTracesPackage) getEPackage();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareTracesPackage getPackage() {
		return SoftwareTracesPackage.eINSTANCE;
	}
	
} // SoftwareTracesFactoryImpl
