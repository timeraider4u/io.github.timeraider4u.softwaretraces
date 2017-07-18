/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Node Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage#getMyNodeVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MyNodeVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(Model model);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(Feature feature);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(Trace trace);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(MyNode myNode);
	
} // MyNodeVisitor
