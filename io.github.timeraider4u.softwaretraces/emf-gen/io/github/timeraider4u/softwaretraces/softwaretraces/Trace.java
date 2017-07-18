/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getProjectName
 * <em>Project Name</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getFileName
 * <em>File Name</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getLineNumber
 * <em>Line Number</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getTraces
 * <em>Traces</em>}</li>
 * </ul>
 *
 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends MyNode {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getTrace_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getProjectName
	 * <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);
	
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getTrace_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getFileName
	 * <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);
	
	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getTrace_LineNumber()
	 * @model
	 * @generated
	 */
	int getLineNumber();
	
	/**
	 * Sets the value of the
	 * '{@link io.github.timeraider4u.softwaretraces.softwaretraces.Trace#getLineNumber
	 * <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);
	
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
	 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getTrace_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();
	
} // Trace
