/**
 */
package digital;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.Or#getType <em>Type</em>}</li>
 *   <li>{@link digital.Or#getInput_x <em>Input x</em>}</li>
 *   <li>{@link digital.Or#getInput_y <em>Input y</em>}</li>
 *   <li>{@link digital.Or#getOutput_z <em>Output z</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getOr()
 * @model annotation="gmf.node label='name,type' label.pattern='{0}::{1}' label.icon='false' figure='svg' svg.uri='platform:/plugin/org.chico.digitalcircuits/icons/OR.svg' tool.small.bundle='org.chico.digitalcircuits.figures' tool.small.path='images/OR.gif' label.placement='external'"
 * @generated
 */
public interface Or extends Gate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see digital.DigitalPackage#getOr_Type()
	 * @model default="OR" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Input x</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input x</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input x</em>' attribute.
	 * @see digital.Value
	 * @see #setInput_x(Value)
	 * @see digital.DigitalPackage#getOr_Input_x()
	 * @model
	 * @generated
	 */
	Value getInput_x();

	/**
	 * Sets the value of the '{@link digital.Or#getInput_x <em>Input x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input x</em>' attribute.
	 * @see digital.Value
	 * @see #getInput_x()
	 * @generated
	 */
	void setInput_x(Value value);

	/**
	 * Returns the value of the '<em><b>Input y</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input y</em>' attribute.
	 * @see digital.Value
	 * @see #setInput_y(Value)
	 * @see digital.DigitalPackage#getOr_Input_y()
	 * @model
	 * @generated
	 */
	Value getInput_y();

	/**
	 * Sets the value of the '{@link digital.Or#getInput_y <em>Input y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input y</em>' attribute.
	 * @see digital.Value
	 * @see #getInput_y()
	 * @generated
	 */
	void setInput_y(Value value);

	/**
	 * Returns the value of the '<em><b>Output z</b></em>' attribute.
	 * The literals are from the enumeration {@link digital.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output z</em>' attribute.
	 * @see digital.Value
	 * @see #setOutput_z(Value)
	 * @see digital.DigitalPackage#getOr_Output_z()
	 * @model
	 * @generated
	 */
	Value getOutput_z();

	/**
	 * Sets the value of the '{@link digital.Or#getOutput_z <em>Output z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output z</em>' attribute.
	 * @see digital.Value
	 * @see #getOutput_z()
	 * @generated
	 */
	void setOutput_z(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int add(int input_x, int input_y);

} // Or
