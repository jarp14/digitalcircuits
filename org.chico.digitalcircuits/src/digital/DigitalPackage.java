/**
 */
package digital;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see digital.DigitalFactory
 * @model kind="package"
 * @generated
 */
public interface DigitalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "digital";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "digital";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "digital";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DigitalPackage eINSTANCE = digital.impl.DigitalPackageImpl.init();

	/**
	 * The meta object id for the '{@link digital.impl.DigitalCircuitsDiagramImpl <em>Circuits Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.DigitalCircuitsDiagramImpl
	 * @see digital.impl.DigitalPackageImpl#getDigitalCircuitsDiagram()
	 * @generated
	 */
	int DIGITAL_CIRCUITS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CIRCUITS_DIAGRAM__GATES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CIRCUITS_DIAGRAM__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CIRCUITS_DIAGRAM__NODES = 2;

	/**
	 * The number of structural features of the '<em>Circuits Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CIRCUITS_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link digital.impl.LinkableObjectImpl <em>Linkable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.LinkableObjectImpl
	 * @see digital.impl.DigitalPackageImpl#getLinkableObject()
	 * @generated
	 */
	int LINKABLE_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Linkable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link digital.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.LinkImpl
	 * @see digital.impl.DigitalPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link digital.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.RelationImpl
	 * @see digital.impl.DigitalPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VALUE = LINK__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link digital.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.GateImpl
	 * @see digital.impl.DigitalPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = LINKABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = LINKABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link digital.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.AndImpl
	 * @see digital.impl.DigitalPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.BufferImpl
	 * @see digital.impl.DigitalPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INPUT = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OUTPUT = GATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = GATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link digital.impl.NandImpl <em>Nand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.NandImpl
	 * @see digital.impl.DigitalPackageImpl#getNand()
	 * @generated
	 */
	int NAND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Nand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.NorImpl <em>Nor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.NorImpl
	 * @see digital.impl.DigitalPackageImpl#getNor()
	 * @generated
	 */
	int NOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Nor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.NotImpl
	 * @see digital.impl.DigitalPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__INPUT = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OUTPUT = GATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = GATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link digital.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.OrImpl
	 * @see digital.impl.DigitalPackageImpl#getOr()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.XnorImpl <em>Xnor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.XnorImpl
	 * @see digital.impl.DigitalPackageImpl#getXnor()
	 * @generated
	 */
	int XNOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xnor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNOR_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.XorImpl
	 * @see digital.impl.DigitalPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__TYPE = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__INPUT_X = GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__INPUT_Y = GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OUTPUT_Z = GATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = GATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link digital.impl.StartEndImpl <em>Start End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.StartEndImpl
	 * @see digital.impl.DigitalPackageImpl#getStartEnd()
	 * @generated
	 */
	int START_END = 13;

	/**
	 * The number of structural features of the '<em>Start End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_FEATURE_COUNT = LINKABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link digital.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.StartImpl
	 * @see digital.impl.DigitalPackageImpl#getStart()
	 * @generated
	 */
	int START = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = START_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = START_END_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link digital.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.impl.EndImpl
	 * @see digital.impl.DigitalPackageImpl#getEnd()
	 * @generated
	 */
	int END = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = START_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = START_END_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link digital.Value <em>Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see digital.Value
	 * @see digital.impl.DigitalPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 16;


	/**
	 * Returns the meta object for class '{@link digital.DigitalCircuitsDiagram <em>Circuits Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuits Diagram</em>'.
	 * @see digital.DigitalCircuitsDiagram
	 * @generated
	 */
	EClass getDigitalCircuitsDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link digital.DigitalCircuitsDiagram#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see digital.DigitalCircuitsDiagram#getGates()
	 * @see #getDigitalCircuitsDiagram()
	 * @generated
	 */
	EReference getDigitalCircuitsDiagram_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link digital.DigitalCircuitsDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see digital.DigitalCircuitsDiagram#getLinks()
	 * @see #getDigitalCircuitsDiagram()
	 * @generated
	 */
	EReference getDigitalCircuitsDiagram_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link digital.DigitalCircuitsDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see digital.DigitalCircuitsDiagram#getNodes()
	 * @see #getDigitalCircuitsDiagram()
	 * @generated
	 */
	EReference getDigitalCircuitsDiagram_Nodes();

	/**
	 * Returns the meta object for class '{@link digital.LinkableObject <em>Linkable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable Object</em>'.
	 * @see digital.LinkableObject
	 * @generated
	 */
	EClass getLinkableObject();

	/**
	 * Returns the meta object for class '{@link digital.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see digital.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link digital.Link#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see digital.Link#getValue()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Value();

	/**
	 * Returns the meta object for class '{@link digital.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see digital.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference list '{@link digital.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see digital.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference list '{@link digital.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see digital.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link digital.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see digital.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link digital.Gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digital.Gate#getName()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Name();

	/**
	 * Returns the meta object for class '{@link digital.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see digital.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the attribute '{@link digital.And#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.And#getType()
	 * @see #getAnd()
	 * @generated
	 */
	EAttribute getAnd_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.And#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.And#getInput_x()
	 * @see #getAnd()
	 * @generated
	 */
	EAttribute getAnd_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.And#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.And#getInput_y()
	 * @see #getAnd()
	 * @generated
	 */
	EAttribute getAnd_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.And#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.And#getOutput_z()
	 * @see #getAnd()
	 * @generated
	 */
	EAttribute getAnd_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see digital.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the attribute '{@link digital.Buffer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Buffer#getType()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Buffer#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see digital.Buffer#getInput()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Input();

	/**
	 * Returns the meta object for the attribute '{@link digital.Buffer#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see digital.Buffer#getOutput()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Output();

	/**
	 * Returns the meta object for class '{@link digital.Nand <em>Nand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nand</em>'.
	 * @see digital.Nand
	 * @generated
	 */
	EClass getNand();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Nand#getType()
	 * @see #getNand()
	 * @generated
	 */
	EAttribute getNand_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nand#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.Nand#getInput_x()
	 * @see #getNand()
	 * @generated
	 */
	EAttribute getNand_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nand#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.Nand#getInput_y()
	 * @see #getNand()
	 * @generated
	 */
	EAttribute getNand_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nand#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.Nand#getOutput_z()
	 * @see #getNand()
	 * @generated
	 */
	EAttribute getNand_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.Nor <em>Nor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nor</em>'.
	 * @see digital.Nor
	 * @generated
	 */
	EClass getNor();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Nor#getType()
	 * @see #getNor()
	 * @generated
	 */
	EAttribute getNor_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nor#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.Nor#getInput_x()
	 * @see #getNor()
	 * @generated
	 */
	EAttribute getNor_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nor#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.Nor#getInput_y()
	 * @see #getNor()
	 * @generated
	 */
	EAttribute getNor_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.Nor#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.Nor#getOutput_z()
	 * @see #getNor()
	 * @generated
	 */
	EAttribute getNor_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see digital.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the attribute '{@link digital.Not#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Not#getType()
	 * @see #getNot()
	 * @generated
	 */
	EAttribute getNot_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Not#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see digital.Not#getInput()
	 * @see #getNot()
	 * @generated
	 */
	EAttribute getNot_Input();

	/**
	 * Returns the meta object for the attribute '{@link digital.Not#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see digital.Not#getOutput()
	 * @see #getNot()
	 * @generated
	 */
	EAttribute getNot_Output();

	/**
	 * Returns the meta object for class '{@link digital.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see digital.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the attribute '{@link digital.Or#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Or#getType()
	 * @see #getOr()
	 * @generated
	 */
	EAttribute getOr_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Or#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.Or#getInput_x()
	 * @see #getOr()
	 * @generated
	 */
	EAttribute getOr_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.Or#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.Or#getInput_y()
	 * @see #getOr()
	 * @generated
	 */
	EAttribute getOr_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.Or#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.Or#getOutput_z()
	 * @see #getOr()
	 * @generated
	 */
	EAttribute getOr_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.Xnor <em>Xnor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xnor</em>'.
	 * @see digital.Xnor
	 * @generated
	 */
	EClass getXnor();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xnor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Xnor#getType()
	 * @see #getXnor()
	 * @generated
	 */
	EAttribute getXnor_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xnor#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.Xnor#getInput_x()
	 * @see #getXnor()
	 * @generated
	 */
	EAttribute getXnor_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xnor#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.Xnor#getInput_y()
	 * @see #getXnor()
	 * @generated
	 */
	EAttribute getXnor_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xnor#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.Xnor#getOutput_z()
	 * @see #getXnor()
	 * @generated
	 */
	EAttribute getXnor_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see digital.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see digital.Xor#getType()
	 * @see #getXor()
	 * @generated
	 */
	EAttribute getXor_Type();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xor#getInput_x <em>Input x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input x</em>'.
	 * @see digital.Xor#getInput_x()
	 * @see #getXor()
	 * @generated
	 */
	EAttribute getXor_Input_x();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xor#getInput_y <em>Input y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input y</em>'.
	 * @see digital.Xor#getInput_y()
	 * @see #getXor()
	 * @generated
	 */
	EAttribute getXor_Input_y();

	/**
	 * Returns the meta object for the attribute '{@link digital.Xor#getOutput_z <em>Output z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output z</em>'.
	 * @see digital.Xor#getOutput_z()
	 * @see #getXor()
	 * @generated
	 */
	EAttribute getXor_Output_z();

	/**
	 * Returns the meta object for class '{@link digital.StartEnd <em>Start End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start End</em>'.
	 * @see digital.StartEnd
	 * @generated
	 */
	EClass getStartEnd();

	/**
	 * Returns the meta object for class '{@link digital.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see digital.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the attribute '{@link digital.Start#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digital.Start#getName()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Name();

	/**
	 * Returns the meta object for class '{@link digital.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see digital.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link digital.End#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see digital.End#getName()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Name();

	/**
	 * Returns the meta object for enum '{@link digital.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value</em>'.
	 * @see digital.Value
	 * @generated
	 */
	EEnum getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DigitalFactory getDigitalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link digital.impl.DigitalCircuitsDiagramImpl <em>Circuits Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.DigitalCircuitsDiagramImpl
		 * @see digital.impl.DigitalPackageImpl#getDigitalCircuitsDiagram()
		 * @generated
		 */
		EClass DIGITAL_CIRCUITS_DIAGRAM = eINSTANCE.getDigitalCircuitsDiagram();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_CIRCUITS_DIAGRAM__GATES = eINSTANCE.getDigitalCircuitsDiagram_Gates();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_CIRCUITS_DIAGRAM__LINKS = eINSTANCE.getDigitalCircuitsDiagram_Links();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_CIRCUITS_DIAGRAM__NODES = eINSTANCE.getDigitalCircuitsDiagram_Nodes();

		/**
		 * The meta object literal for the '{@link digital.impl.LinkableObjectImpl <em>Linkable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.LinkableObjectImpl
		 * @see digital.impl.DigitalPackageImpl#getLinkableObject()
		 * @generated
		 */
		EClass LINKABLE_OBJECT = eINSTANCE.getLinkableObject();

		/**
		 * The meta object literal for the '{@link digital.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.LinkImpl
		 * @see digital.impl.DigitalPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VALUE = eINSTANCE.getLink_Value();

		/**
		 * The meta object literal for the '{@link digital.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.RelationImpl
		 * @see digital.impl.DigitalPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link digital.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.GateImpl
		 * @see digital.impl.DigitalPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NAME = eINSTANCE.getGate_Name();

		/**
		 * The meta object literal for the '{@link digital.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.AndImpl
		 * @see digital.impl.DigitalPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND__TYPE = eINSTANCE.getAnd_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND__INPUT_X = eINSTANCE.getAnd_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND__INPUT_Y = eINSTANCE.getAnd_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND__OUTPUT_Z = eINSTANCE.getAnd_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.BufferImpl
		 * @see digital.impl.DigitalPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__TYPE = eINSTANCE.getBuffer_Type();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__INPUT = eINSTANCE.getBuffer_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__OUTPUT = eINSTANCE.getBuffer_Output();

		/**
		 * The meta object literal for the '{@link digital.impl.NandImpl <em>Nand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.NandImpl
		 * @see digital.impl.DigitalPackageImpl#getNand()
		 * @generated
		 */
		EClass NAND = eINSTANCE.getNand();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAND__TYPE = eINSTANCE.getNand_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAND__INPUT_X = eINSTANCE.getNand_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAND__INPUT_Y = eINSTANCE.getNand_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAND__OUTPUT_Z = eINSTANCE.getNand_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.NorImpl <em>Nor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.NorImpl
		 * @see digital.impl.DigitalPackageImpl#getNor()
		 * @generated
		 */
		EClass NOR = eINSTANCE.getNor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOR__TYPE = eINSTANCE.getNor_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOR__INPUT_X = eINSTANCE.getNor_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOR__INPUT_Y = eINSTANCE.getNor_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOR__OUTPUT_Z = eINSTANCE.getNor_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.NotImpl
		 * @see digital.impl.DigitalPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT__TYPE = eINSTANCE.getNot_Type();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT__INPUT = eINSTANCE.getNot_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT__OUTPUT = eINSTANCE.getNot_Output();

		/**
		 * The meta object literal for the '{@link digital.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.OrImpl
		 * @see digital.impl.DigitalPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__TYPE = eINSTANCE.getOr_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__INPUT_X = eINSTANCE.getOr_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__INPUT_Y = eINSTANCE.getOr_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__OUTPUT_Z = eINSTANCE.getOr_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.XnorImpl <em>Xnor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.XnorImpl
		 * @see digital.impl.DigitalPackageImpl#getXnor()
		 * @generated
		 */
		EClass XNOR = eINSTANCE.getXnor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNOR__TYPE = eINSTANCE.getXnor_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNOR__INPUT_X = eINSTANCE.getXnor_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNOR__INPUT_Y = eINSTANCE.getXnor_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNOR__OUTPUT_Z = eINSTANCE.getXnor_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.XorImpl
		 * @see digital.impl.DigitalPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOR__TYPE = eINSTANCE.getXor_Type();

		/**
		 * The meta object literal for the '<em><b>Input x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOR__INPUT_X = eINSTANCE.getXor_Input_x();

		/**
		 * The meta object literal for the '<em><b>Input y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOR__INPUT_Y = eINSTANCE.getXor_Input_y();

		/**
		 * The meta object literal for the '<em><b>Output z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XOR__OUTPUT_Z = eINSTANCE.getXor_Output_z();

		/**
		 * The meta object literal for the '{@link digital.impl.StartEndImpl <em>Start End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.StartEndImpl
		 * @see digital.impl.DigitalPackageImpl#getStartEnd()
		 * @generated
		 */
		EClass START_END = eINSTANCE.getStartEnd();

		/**
		 * The meta object literal for the '{@link digital.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.StartImpl
		 * @see digital.impl.DigitalPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__NAME = eINSTANCE.getStart_Name();

		/**
		 * The meta object literal for the '{@link digital.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.impl.EndImpl
		 * @see digital.impl.DigitalPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__NAME = eINSTANCE.getEnd_Name();

		/**
		 * The meta object literal for the '{@link digital.Value <em>Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see digital.Value
		 * @see digital.impl.DigitalPackageImpl#getValue()
		 * @generated
		 */
		EEnum VALUE = eINSTANCE.getValue();

	}

} //DigitalPackage
