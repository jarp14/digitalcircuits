/**
 */
package digital;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.Not#getType <em>Type</em>}</li>
 *   <li>{@link digital.Not#getInput <em>Input</em>}</li>
 *   <li>{@link digital.Not#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getNot()
 * @model annotation="gmf.node label='name,type' label.pattern='{0}::{1}' label.icon='false' figure='svg' svg.uri='platform:/plugin/org.chico.digitalcircuits/icons/NOT.svg' tool.small.bundle='org.chico.digitalcircuits.figures' tool.small.path='images/NOT.gif' label.placement='external'"
 * @generated
 */
public interface Not extends Gate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NOT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see digital.DigitalPackage#getNot_Type()
	 * @model default="NOT" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see digital.Value
	 * @see #setInput(Value)
	 * @see digital.DigitalPackage#getNot_Input()
	 * @model
	 * @generated
	 */
	Value getInput();

	/**
	 * Sets the value of the '{@link digital.Not#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see digital.Value
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Value value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see digital.Value
	 * @see #setOutput(Value)
	 * @see digital.DigitalPackage#getNot_Output()
	 * @model
	 * @generated
	 */
	Value getOutput();

	/**
	 * Sets the value of the '{@link digital.Not#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see digital.Value
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Value value);

} // Not
