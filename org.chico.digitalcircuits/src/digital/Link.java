/**
 */
package digital;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.Link#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see digital.Value
	 * @see #setValue(Value)
	 * @see digital.DigitalPackage#getLink_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link digital.Link#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see digital.Value
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Link
