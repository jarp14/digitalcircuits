/**
 */
package digital.impl;

import digital.DigitalCircuitsDiagram;
import digital.DigitalPackage;
import digital.Gate;
import digital.Link;
import digital.StartEnd;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuits Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link digital.impl.DigitalCircuitsDiagramImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link digital.impl.DigitalCircuitsDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link digital.impl.DigitalCircuitsDiagramImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalCircuitsDiagramImpl extends EObjectImpl implements DigitalCircuitsDiagram {
	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<StartEnd> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalCircuitsDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DigitalPackage.Literals.DIGITAL_CIRCUITS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartEnd> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<StartEnd>(StartEnd.class, this, DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES:
				return getGates();
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS:
				return getLinks();
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES:
				return getNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends StartEnd>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES:
				getGates().clear();
				return;
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES:
				getNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__GATES:
				return gates != null && !gates.isEmpty();
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case DigitalPackage.DIGITAL_CIRCUITS_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DigitalCircuitsDiagramImpl
