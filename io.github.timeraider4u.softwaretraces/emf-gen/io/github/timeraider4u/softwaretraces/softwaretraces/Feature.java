/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getName
 * <em>Name</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getFeatures
 * <em>Features</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getTraces
 * <em>Traces</em>}</li>
 * </ul>
 *
 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends MyNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature#getName
	 * <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list.
	 * The list contents are of type
	 * {@link io.github.timeraider4u.softwaretraces.softwaretraces.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getFeature_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();
	
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference
	 * list.
	 * The list contents are of type
	 * {@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't
	 * clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getFeature_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();
	
} // Feature
