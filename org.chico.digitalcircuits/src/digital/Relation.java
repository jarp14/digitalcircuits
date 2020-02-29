/**
 */
package digital;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link digital.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link digital.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see digital.DigitalPackage#getRelation()
 * @model annotation="gmf.link label='value' source='source' target='target' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.digitalcircuits.figures' tool.small.path='images/RELATION.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Relation extends Link, LinkableObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link digital.LinkableObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see digital.DigitalPackage#getRelation_Source()
	 * @model
	 * @generated
	 */
	EList<LinkableObject> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link digital.LinkableObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see digital.DigitalPackage#getRelation_Target()
	 * @model
	 * @generated
	 */
	EList<LinkableObject> getTarget();

} // Relation
