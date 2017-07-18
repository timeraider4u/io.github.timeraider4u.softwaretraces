/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getResourceFileName
 * <em>Resource File Name</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getFeatures
 * <em>Features</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getTraces
 * <em>Traces</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getLastSelected
 * <em>Last Selected</em>}</li>
 * </ul>
 *
 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends MyNode {
	/**
	 * Returns the value of the '<em><b>Resource File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource File Name</em>' attribute isn't
	 * clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resource File Name</em>' attribute.
	 * @see #setResourceFileName(String)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getModel_ResourceFileName()
	 * @model
	 * @generated
	 */
	String getResourceFileName();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getResourceFileName
	 * <em>Resource File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource File Name</em>' attribute.
	 * @see #getResourceFileName()
	 * @generated
	 */
	void setResourceFileName(String value);
	
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
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getModel_Features()
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
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getModel_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();
	
	/**
	 * Returns the value of the '<em><b>Last Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Last Selected</em>' reference.
	 * @see #setLastSelected(MyNode)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getModel_LastSelected()
	 * @model
	 * @generated
	 */
	MyNode getLastSelected();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Model#getLastSelected
	 * <em>Last Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Last Selected</em>' reference.
	 * @see #getLastSelected()
	 * @generated
	 */
	void setLastSelected(MyNode value);
	
} // Model
