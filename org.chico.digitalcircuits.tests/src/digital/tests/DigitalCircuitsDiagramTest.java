/**
 */
package digital.tests;

import digital.DigitalCircuitsDiagram;
import digital.DigitalFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Circuits Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalCircuitsDiagramTest extends TestCase {

	/**
	 * The fixture for this Circuits Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalCircuitsDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalCircuitsDiagramTest.class);
	}

	/**
	 * Constructs a new Circuits Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalCircuitsDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Circuits Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DigitalCircuitsDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Circuits Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalCircuitsDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DigitalFactory.eINSTANCE.createDigitalCircuitsDiagram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DigitalCircuitsDiagramTest
