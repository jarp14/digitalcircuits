/**
 */
package digital.impl;

import digital.And;
import digital.Buffer;
import digital.DigitalCircuitsDiagram;
import digital.DigitalFactory;
import digital.DigitalPackage;
import digital.End;
import digital.Gate;
import digital.Link;
import digital.LinkableObject;
import digital.Nand;
import digital.Nor;
import digital.Not;
import digital.Or;
import digital.Relation;
import digital.Start;
import digital.StartEnd;
import digital.Value;
import digital.Xnor;
import digital.Xor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalPackageImpl extends EPackageImpl implements DigitalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalCircuitsDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass norEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xnorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see digital.DigitalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DigitalPackageImpl() {
		super(eNS_URI, DigitalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DigitalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DigitalPackage init() {
		if (isInited) return (DigitalPackage)EPackage.Registry.INSTANCE.getEPackage(DigitalPackage.eNS_URI);

		// Obtain or create and register package
		DigitalPackageImpl theDigitalPackage = (DigitalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DigitalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DigitalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDigitalPackage.createPackageContents();

		// Initialize created meta-data
		theDigitalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDigitalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DigitalPackage.eNS_URI, theDigitalPackage);
		return theDigitalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalCircuitsDiagram() {
		return digitalCircuitsDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalCircuitsDiagram_Gates() {
		return (EReference)digitalCircuitsDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalCircuitsDiagram_Links() {
		return (EReference)digitalCircuitsDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalCircuitsDiagram_Nodes() {
		return (EReference)digitalCircuitsDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkableObject() {
		return linkableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Value() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_Name() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnd_Type() {
		return (EAttribute)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnd_Input_x() {
		return (EAttribute)andEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnd_Input_y() {
		return (EAttribute)andEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnd_Output_z() {
		return (EAttribute)andEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Type() {
		return (EAttribute)bufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Input() {
		return (EAttribute)bufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Output() {
		return (EAttribute)bufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNand() {
		return nandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNand_Type() {
		return (EAttribute)nandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNand_Input_x() {
		return (EAttribute)nandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNand_Input_y() {
		return (EAttribute)nandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNand_Output_z() {
		return (EAttribute)nandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNor() {
		return norEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNor_Type() {
		return (EAttribute)norEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNor_Input_x() {
		return (EAttribute)norEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNor_Input_y() {
		return (EAttribute)norEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNor_Output_z() {
		return (EAttribute)norEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNot_Type() {
		return (EAttribute)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNot_Input() {
		return (EAttribute)notEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNot_Output() {
		return (EAttribute)notEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOr_Type() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOr_Input_x() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOr_Input_y() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOr_Output_z() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXnor() {
		return xnorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXnor_Type() {
		return (EAttribute)xnorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXnor_Input_x() {
		return (EAttribute)xnorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXnor_Input_y() {
		return (EAttribute)xnorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXnor_Output_z() {
		return (EAttribute)xnorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXor_Type() {
		return (EAttribute)xorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXor_Input_x() {
		return (EAttribute)xorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXor_Input_y() {
		return (EAttribute)xorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXor_Output_z() {
		return (EAttribute)xorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEnd() {
		return startEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Name() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Name() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValue() {
		return valueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalFactory getDigitalFactory() {
		return (DigitalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		digitalCircuitsDiagramEClass = createEClass(DIGITAL_CIRCUITS_DIAGRAM);
		createEReference(digitalCircuitsDiagramEClass, DIGITAL_CIRCUITS_DIAGRAM__GATES);
		createEReference(digitalCircuitsDiagramEClass, DIGITAL_CIRCUITS_DIAGRAM__LINKS);
		createEReference(digitalCircuitsDiagramEClass, DIGITAL_CIRCUITS_DIAGRAM__NODES);

		linkableObjectEClass = createEClass(LINKABLE_OBJECT);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__VALUE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__NAME);

		andEClass = createEClass(AND);
		createEAttribute(andEClass, AND__TYPE);
		createEAttribute(andEClass, AND__INPUT_X);
		createEAttribute(andEClass, AND__INPUT_Y);
		createEAttribute(andEClass, AND__OUTPUT_Z);

		bufferEClass = createEClass(BUFFER);
		createEAttribute(bufferEClass, BUFFER__TYPE);
		createEAttribute(bufferEClass, BUFFER__INPUT);
		createEAttribute(bufferEClass, BUFFER__OUTPUT);

		nandEClass = createEClass(NAND);
		createEAttribute(nandEClass, NAND__TYPE);
		createEAttribute(nandEClass, NAND__INPUT_X);
		createEAttribute(nandEClass, NAND__INPUT_Y);
		createEAttribute(nandEClass, NAND__OUTPUT_Z);

		norEClass = createEClass(NOR);
		createEAttribute(norEClass, NOR__TYPE);
		createEAttribute(norEClass, NOR__INPUT_X);
		createEAttribute(norEClass, NOR__INPUT_Y);
		createEAttribute(norEClass, NOR__OUTPUT_Z);

		notEClass = createEClass(NOT);
		createEAttribute(notEClass, NOT__TYPE);
		createEAttribute(notEClass, NOT__INPUT);
		createEAttribute(notEClass, NOT__OUTPUT);

		orEClass = createEClass(OR);
		createEAttribute(orEClass, OR__TYPE);
		createEAttribute(orEClass, OR__INPUT_X);
		createEAttribute(orEClass, OR__INPUT_Y);
		createEAttribute(orEClass, OR__OUTPUT_Z);

		xnorEClass = createEClass(XNOR);
		createEAttribute(xnorEClass, XNOR__TYPE);
		createEAttribute(xnorEClass, XNOR__INPUT_X);
		createEAttribute(xnorEClass, XNOR__INPUT_Y);
		createEAttribute(xnorEClass, XNOR__OUTPUT_Z);

		xorEClass = createEClass(XOR);
		createEAttribute(xorEClass, XOR__TYPE);
		createEAttribute(xorEClass, XOR__INPUT_X);
		createEAttribute(xorEClass, XOR__INPUT_Y);
		createEAttribute(xorEClass, XOR__OUTPUT_Z);

		startEndEClass = createEClass(START_END);

		startEClass = createEClass(START);
		createEAttribute(startEClass, START__NAME);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__NAME);

		// Create enums
		valueEEnum = createEEnum(VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(this.getLink());
		relationEClass.getESuperTypes().add(this.getLinkableObject());
		gateEClass.getESuperTypes().add(this.getLinkableObject());
		andEClass.getESuperTypes().add(this.getGate());
		bufferEClass.getESuperTypes().add(this.getGate());
		nandEClass.getESuperTypes().add(this.getGate());
		norEClass.getESuperTypes().add(this.getGate());
		notEClass.getESuperTypes().add(this.getGate());
		orEClass.getESuperTypes().add(this.getGate());
		xnorEClass.getESuperTypes().add(this.getGate());
		xorEClass.getESuperTypes().add(this.getGate());
		startEndEClass.getESuperTypes().add(this.getLinkableObject());
		startEClass.getESuperTypes().add(this.getStartEnd());
		endEClass.getESuperTypes().add(this.getStartEnd());

		// Initialize classes and features; add operations and parameters
		initEClass(digitalCircuitsDiagramEClass, DigitalCircuitsDiagram.class, "DigitalCircuitsDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalCircuitsDiagram_Gates(), this.getGate(), null, "gates", null, 0, -1, DigitalCircuitsDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalCircuitsDiagram_Links(), this.getLink(), null, "links", null, 0, -1, DigitalCircuitsDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalCircuitsDiagram_Nodes(), this.getStartEnd(), null, "nodes", null, 0, -1, DigitalCircuitsDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkableObjectEClass, LinkableObject.class, "LinkableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Value(), this.getValue(), "value", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Source(), this.getLinkableObject(), null, "source", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getLinkableObject(), null, "target", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Name(), ecorePackage.getEString(), "name", "[name]", 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnd_Type(), ecorePackage.getEString(), "type", "AND", 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnd_Input_x(), this.getValue(), "input_x", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnd_Input_y(), this.getValue(), "input_y", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnd_Output_z(), this.getValue(), "output_z", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuffer_Type(), ecorePackage.getEString(), "type", "BUFFER", 0, 1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuffer_Input(), this.getValue(), "input", null, 0, 1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuffer_Output(), this.getValue(), "output", null, 0, 1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nandEClass, Nand.class, "Nand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNand_Type(), ecorePackage.getEString(), "type", "NAND", 0, 1, Nand.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNand_Input_x(), this.getValue(), "input_x", null, 0, 1, Nand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNand_Input_y(), this.getValue(), "input_y", null, 0, 1, Nand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNand_Output_z(), this.getValue(), "output_z", null, 0, 1, Nand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(norEClass, Nor.class, "Nor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNor_Type(), ecorePackage.getEString(), "type", "NOR", 0, 1, Nor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNor_Input_x(), this.getValue(), "input_x", null, 0, 1, Nor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNor_Input_y(), this.getValue(), "input_y", null, 0, 1, Nor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNor_Output_z(), this.getValue(), "output_z", null, 0, 1, Nor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNot_Type(), ecorePackage.getEString(), "type", "NOT", 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNot_Input(), this.getValue(), "input", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNot_Output(), this.getValue(), "output", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOr_Type(), ecorePackage.getEString(), "type", "OR", 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOr_Input_x(), this.getValue(), "input_x", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOr_Input_y(), this.getValue(), "input_y", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOr_Output_z(), this.getValue(), "output_z", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(orEClass, ecorePackage.getEInt(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input_x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "input_y", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xnorEClass, Xnor.class, "Xnor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXnor_Type(), ecorePackage.getEString(), "type", "XNOR", 0, 1, Xnor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXnor_Input_x(), this.getValue(), "input_x", null, 0, 1, Xnor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXnor_Input_y(), this.getValue(), "input_y", null, 0, 1, Xnor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXnor_Output_z(), this.getValue(), "output_z", null, 0, 1, Xnor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXor_Type(), ecorePackage.getEString(), "type", "XOR", 0, 1, Xor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXor_Input_x(), this.getValue(), "input_x", null, 0, 1, Xor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXor_Input_y(), this.getValue(), "input_y", null, 0, 1, Xor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXor_Output_z(), this.getValue(), "output_z", null, 0, 1, Xor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEndEClass, StartEnd.class, "StartEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStart_Name(), ecorePackage.getEString(), "name", "INPUT", 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_Name(), ecorePackage.getEString(), "name", "OUTPUT", 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(valueEEnum, Value.class, "Value");
		addEEnumLiteral(valueEEnum, Value.ZERO);
		addEEnumLiteral(valueEEnum, Value.ONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (digitalCircuitsDiagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (relationEClass, 
		   source, 
		   new String[] {
			 "label", "value",
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "color", "0,0,0",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/RELATION.gif",
			 "source.constraint", "self <> oppositeEnd",
			 "target.constraint", "self <> oppositeEnd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (andEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/AND.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/AND.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (bufferEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/BUFFER.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/BUFFER.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (nandEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/NAND.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/NAND.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (norEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/NOR.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/NOR.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (notEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/NOT.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/NOT.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (orEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/OR.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/OR.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (xnorEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/XNOR.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/XNOR.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (xorEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "label.pattern", "{0}::{1}",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/org.chico.digitalcircuits/icons/XOR.svg",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/XOR.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (startEClass, 
		   source, 
		   new String[] {
			 "figure", "polygon",
			 "polygon.x", "0 200 220 200 0",
			 "polygon.y", "0 0 1 2 2",
			 "resizable", "false",
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/INPUT.gif",
			 "tool.name", "Input",
			 "border.color", "0,0,0",
			 "size", "60,5"
		   });	
		addAnnotation
		  (endEClass, 
		   source, 
		   new String[] {
			 "figure", "polygon",
			 "polygon.x", "0 20 220 220 20",
			 "polygon.y", "5 0 0 10 10",
			 "resizable", "false",
			 "label.icon", "false",
			 "label", "name",
			 "tool.small.bundle", "org.chico.digitalcircuits.figures",
			 "tool.small.path", "images/OUTPUT.gif",
			 "tool.name", "Output",
			 "border.color", "0,0,0",
			 "size", "60,5"
		   });
	}

} //DigitalPackageImpl
