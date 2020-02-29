/**
 */
package digital;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.End#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getEnd()
 * @model annotation="gmf.node figure='polygon' polygon.x='0 20 220 220 20' polygon.y='5 0 0 10 10' resizable='false' label.icon='false' label='name' tool.small.bundle='org.chico.digitalcircuits.figures' tool.small.path='images/OUTPUT.gif' tool.name='Output' border.color='0,0,0' size='60,5'"
 * @generated
 */
public interface End extends StartEnd {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"OUTPUT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see digital.DigitalPackage#getEnd_Name()
	 * @model default="OUTPUT" changeable="false"
	 * @generated
	 */
	String getName();

} // End
