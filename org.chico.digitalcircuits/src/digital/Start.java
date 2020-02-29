/**
 */
package digital;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.Start#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getStart()
 * @model annotation="gmf.node figure='polygon' polygon.x='0 200 220 200 0' polygon.y='0 0 1 2 2' resizable='false' label.icon='false' label='name' tool.small.bundle='org.chico.digitalcircuits.figures' tool.small.path='images/INPUT.gif' tool.name='Input' border.color='0,0,0' size='60,5'"
 * @generated
 */
public interface Start extends StartEnd {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"INPUT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see digital.DigitalPackage#getStart_Name()
	 * @model default="INPUT" changeable="false"
	 * @generated
	 */
	String getName();

} // Start
