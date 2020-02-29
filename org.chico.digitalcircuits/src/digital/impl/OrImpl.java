/**
 */
package digital.impl;

import digital.DigitalPackage;
import digital.Or;
import digital.Value;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link digital.impl.OrImpl#getType <em>Type</em>}</li>
 *   <li>{@link digital.impl.OrImpl#getInput_x <em>Input x</em>}</li>
 *   <li>{@link digital.impl.OrImpl#getInput_y <em>Input y</em>}</li>
 *   <li>{@link digital.impl.OrImpl#getOutput_z <em>Output z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrImpl extends GateImpl implements Or {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "OR";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_x() <em>Input x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_x()
	 * @generated
	 * @ordered
	 */
	protected static final Value INPUT_X_EDEFAULT = Value.ZERO;

	/**
	 * The cached value of the '{@link #getInput_x() <em>Input x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_x()
	 * @generated
	 * @ordered
	 */
	protected Value input_x = INPUT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_y() <em>Input y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_y()
	 * @generated
	 * @ordered
	 */
	protected static final Value INPUT_Y_EDEFAULT = Value.ZERO;

	/**
	 * The cached value of the '{@link #getInput_y() <em>Input y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_y()
	 * @generated
	 * @ordered
	 */
	protected Value input_y = INPUT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_z() <em>Output z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_z()
	 * @generated
	 * @ordered
	 */
	protected static final Value OUTPUT_Z_EDEFAULT = Value.ZERO;

	/**
	 * The cached value of the '{@link #getOutput_z() <em>Output z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_z()
	 * @generated
	 * @ordered
	 */
	protected Value output_z = OUTPUT_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DigitalPackage.Literals.OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getInput_x() {
		return input_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_x(Value newInput_x) {
		Value oldInput_x = input_x;
		input_x = newInput_x == null ? INPUT_X_EDEFAULT : newInput_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DigitalPackage.OR__INPUT_X, oldInput_x, input_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getInput_y() {
		return input_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_y(Value newInput_y) {
		Value oldInput_y = input_y;
		input_y = newInput_y == null ? INPUT_Y_EDEFAULT : newInput_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DigitalPackage.OR__INPUT_Y, oldInput_y, input_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getOutput_z() {
		return output_z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_z(Value newOutput_z) {
		Value oldOutput_z = output_z;
		output_z = newOutput_z == null ? OUTPUT_Z_EDEFAULT : newOutput_z;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DigitalPackage.OR__OUTPUT_Z, oldOutput_z, output_z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int add(int input_x, int input_y) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DigitalPackage.OR__TYPE:
				return getType();
			case DigitalPackage.OR__INPUT_X:
				return getInput_x();
			case DigitalPackage.OR__INPUT_Y:
				return getInput_y();
			case DigitalPackage.OR__OUTPUT_Z:
				return getOutput_z();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DigitalPackage.OR__INPUT_X:
				setInput_x((Value)newValue);
				return;
			case DigitalPackage.OR__INPUT_Y:
				setInput_y((Value)newValue);
				return;
			case DigitalPackage.OR__OUTPUT_Z:
				setOutput_z((Value)newValue);
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
			case DigitalPackage.OR__INPUT_X:
				setInput_x(INPUT_X_EDEFAULT);
				return;
			case DigitalPackage.OR__INPUT_Y:
				setInput_y(INPUT_Y_EDEFAULT);
				return;
			case DigitalPackage.OR__OUTPUT_Z:
				setOutput_z(OUTPUT_Z_EDEFAULT);
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
			case DigitalPackage.OR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DigitalPackage.OR__INPUT_X:
				return input_x != INPUT_X_EDEFAULT;
			case DigitalPackage.OR__INPUT_Y:
				return input_y != INPUT_Y_EDEFAULT;
			case DigitalPackage.OR__OUTPUT_Z:
				return output_z != OUTPUT_Z_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", input_x: ");
		result.append(input_x);
		result.append(", input_y: ");
		result.append(input_y);
		result.append(", output_z: ");
		result.append(output_z);
		result.append(')');
		return result.toString();
	}

} //OrImpl
