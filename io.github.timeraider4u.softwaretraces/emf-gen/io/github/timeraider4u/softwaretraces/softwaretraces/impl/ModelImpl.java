/**
 */
package io.github.timeraider4u.softwaretraces.softwaretraces.impl;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesPackage;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl#getResourceFileName
 * <em>Resource File Name</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl#getFeatures
 * <em>Features</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl#getTraces
 * <em>Traces</em>}</li>
 * <li>{@link io.github.timeraider4u.softwaretraces.softwaretraces.impl.ModelImpl#getLastSelected
 * <em>Last Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getResourceFileName() <em>Resource File
	 * Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_FILE_NAME_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getResourceFileName() <em>Resource File
	 * Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceFileName()
	 * @generated
	 * @ordered
	 */
	protected String resourceFileName = RESOURCE_FILE_NAME_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}'
	 * containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;
	
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}'
	 * containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;
	
	/**
	 * The cached value of the '{@link #getLastSelected() <em>Last
	 * Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLastSelected()
	 * @generated
	 * @ordered
	 */
	protected MyNode lastSelected;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareTracesPackage.Literals.MODEL;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResourceFileName() {
		return resourceFileName;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResourceFileName(String newResourceFileName) {
		String oldResourceFileName = resourceFileName;
		resourceFileName = newResourceFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareTracesPackage.MODEL__RESOURCE_FILE_NAME,
					oldResourceFileName, resourceFileName));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this,
					SoftwareTracesPackage.MODEL__FEATURES);
		}
		return features;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Trace>(Trace.class, this,
					SoftwareTracesPackage.MODEL__TRACES);
		}
		return traces;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MyNode getLastSelected() {
		if (lastSelected != null && lastSelected.eIsProxy()) {
			InternalEObject oldLastSelected = (InternalEObject) lastSelected;
			lastSelected = (MyNode) eResolveProxy(oldLastSelected);
			if (lastSelected != oldLastSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoftwareTracesPackage.MODEL__LAST_SELECTED,
							oldLastSelected, lastSelected));
			}
		}
		return lastSelected;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MyNode basicGetLastSelected() {
		return lastSelected;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLastSelected(MyNode newLastSelected) {
		MyNode oldLastSelected = lastSelected;
		lastSelected = newLastSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareTracesPackage.MODEL__LAST_SELECTED, oldLastSelected,
					lastSelected));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareTracesPackage.MODEL__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd,
					msgs);
		case SoftwareTracesPackage.MODEL__TRACES:
			return ((InternalEList<?>) getTraces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftwareTracesPackage.MODEL__RESOURCE_FILE_NAME:
			return getResourceFileName();
		case SoftwareTracesPackage.MODEL__FEATURES:
			return getFeatures();
		case SoftwareTracesPackage.MODEL__TRACES:
			return getTraces();
		case SoftwareTracesPackage.MODEL__LAST_SELECTED:
			if (resolve)
				return getLastSelected();
			return basicGetLastSelected();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoftwareTracesPackage.MODEL__RESOURCE_FILE_NAME:
			setResourceFileName((String) newValue);
			return;
		case SoftwareTracesPackage.MODEL__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case SoftwareTracesPackage.MODEL__TRACES:
			getTraces().clear();
			getTraces().addAll((Collection<? extends Trace>) newValue);
			return;
		case SoftwareTracesPackage.MODEL__LAST_SELECTED:
			setLastSelected((MyNode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SoftwareTracesPackage.MODEL__RESOURCE_FILE_NAME:
			setResourceFileName(RESOURCE_FILE_NAME_EDEFAULT);
			return;
		case SoftwareTracesPackage.MODEL__FEATURES:
			getFeatures().clear();
			return;
		case SoftwareTracesPackage.MODEL__TRACES:
			getTraces().clear();
			return;
		case SoftwareTracesPackage.MODEL__LAST_SELECTED:
			setLastSelected((MyNode) null);
			return;
		}
		super.eUnset(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SoftwareTracesPackage.MODEL__RESOURCE_FILE_NAME:
			return RESOURCE_FILE_NAME_EDEFAULT == null
					? resourceFileName != null
					: !RESOURCE_FILE_NAME_EDEFAULT.equals(resourceFileName);
		case SoftwareTracesPackage.MODEL__FEATURES:
			return features != null && !features.isEmpty();
		case SoftwareTracesPackage.MODEL__TRACES:
			return traces != null && !traces.isEmpty();
		case SoftwareTracesPackage.MODEL__LAST_SELECTED:
			return lastSelected != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resourceFileName: ");
		result.append(resourceFileName);
		result.append(')');
		return result.toString();
	}
	
} // ModelImpl
