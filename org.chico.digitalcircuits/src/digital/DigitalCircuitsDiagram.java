/**
 */
package digital;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuits Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.DigitalCircuitsDiagram#getGates <em>Gates</em>}</li>
 *   <li>{@link digital.DigitalCircuitsDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link digital.DigitalCircuitsDiagram#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getDigitalCircuitsDiagram()
 * @model
 * @generated
 */
public interface DigitalCircuitsDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link digital.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see digital.DigitalPackage#getDigitalCircuitsDiagram_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link digital.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see digital.DigitalPackage#getDigitalCircuitsDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link digital.StartEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see digital.DigitalPackage#getDigitalCircuitsDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<StartEnd> getNodes();

} // DigitalCircuitsDiagram
