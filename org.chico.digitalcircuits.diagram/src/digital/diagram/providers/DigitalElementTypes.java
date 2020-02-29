/*
 * 
 */
package digital.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import digital.DigitalPackage;
import digital.diagram.edit.parts.AndEditPart;
import digital.diagram.edit.parts.BufferEditPart;
import digital.diagram.edit.parts.DigitalCircuitsDiagramEditPart;
import digital.diagram.edit.parts.EndEditPart;
import digital.diagram.edit.parts.NandEditPart;
import digital.diagram.edit.parts.NorEditPart;
import digital.diagram.edit.parts.NotEditPart;
import digital.diagram.edit.parts.OrEditPart;
import digital.diagram.edit.parts.RelationEditPart;
import digital.diagram.edit.parts.StartEditPart;
import digital.diagram.edit.parts.XnorEditPart;
import digital.diagram.edit.parts.XorEditPart;
import digital.diagram.part.DigitalDiagramEditorPlugin;

/**
 * @generated
 */
public class DigitalElementTypes {

	/**
	* @generated
	*/
	private DigitalElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DigitalDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DigitalCircuitsDiagram_1000 = getElementType(
			"org.chico.digitalcircuits.diagram.DigitalCircuitsDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType And_2001 = getElementType("org.chico.digitalcircuits.diagram.And_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Buffer_2002 = getElementType("org.chico.digitalcircuits.diagram.Buffer_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Nand_2003 = getElementType("org.chico.digitalcircuits.diagram.Nand_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Nor_2004 = getElementType("org.chico.digitalcircuits.diagram.Nor_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Not_2005 = getElementType("org.chico.digitalcircuits.diagram.Not_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Or_2006 = getElementType("org.chico.digitalcircuits.diagram.Or_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Xnor_2007 = getElementType("org.chico.digitalcircuits.diagram.Xnor_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Xor_2008 = getElementType("org.chico.digitalcircuits.diagram.Xor_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Start_2009 = getElementType("org.chico.digitalcircuits.diagram.Start_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_2010 = getElementType("org.chico.digitalcircuits.diagram.End_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relation_4001 = getElementType("org.chico.digitalcircuits.diagram.Relation_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DigitalCircuitsDiagram_1000, DigitalPackage.eINSTANCE.getDigitalCircuitsDiagram());

			elements.put(And_2001, DigitalPackage.eINSTANCE.getAnd());

			elements.put(Buffer_2002, DigitalPackage.eINSTANCE.getBuffer());

			elements.put(Nand_2003, DigitalPackage.eINSTANCE.getNand());

			elements.put(Nor_2004, DigitalPackage.eINSTANCE.getNor());

			elements.put(Not_2005, DigitalPackage.eINSTANCE.getNot());

			elements.put(Or_2006, DigitalPackage.eINSTANCE.getOr());

			elements.put(Xnor_2007, DigitalPackage.eINSTANCE.getXnor());

			elements.put(Xor_2008, DigitalPackage.eINSTANCE.getXor());

			elements.put(Start_2009, DigitalPackage.eINSTANCE.getStart());

			elements.put(End_2010, DigitalPackage.eINSTANCE.getEnd());

			elements.put(Relation_4001, DigitalPackage.eINSTANCE.getRelation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DigitalCircuitsDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(And_2001);
			KNOWN_ELEMENT_TYPES.add(Buffer_2002);
			KNOWN_ELEMENT_TYPES.add(Nand_2003);
			KNOWN_ELEMENT_TYPES.add(Nor_2004);
			KNOWN_ELEMENT_TYPES.add(Not_2005);
			KNOWN_ELEMENT_TYPES.add(Or_2006);
			KNOWN_ELEMENT_TYPES.add(Xnor_2007);
			KNOWN_ELEMENT_TYPES.add(Xor_2008);
			KNOWN_ELEMENT_TYPES.add(Start_2009);
			KNOWN_ELEMENT_TYPES.add(End_2010);
			KNOWN_ELEMENT_TYPES.add(Relation_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return DigitalCircuitsDiagram_1000;
		case AndEditPart.VISUAL_ID:
			return And_2001;
		case BufferEditPart.VISUAL_ID:
			return Buffer_2002;
		case NandEditPart.VISUAL_ID:
			return Nand_2003;
		case NorEditPart.VISUAL_ID:
			return Nor_2004;
		case NotEditPart.VISUAL_ID:
			return Not_2005;
		case OrEditPart.VISUAL_ID:
			return Or_2006;
		case XnorEditPart.VISUAL_ID:
			return Xnor_2007;
		case XorEditPart.VISUAL_ID:
			return Xor_2008;
		case StartEditPart.VISUAL_ID:
			return Start_2009;
		case EndEditPart.VISUAL_ID:
			return End_2010;
		case RelationEditPart.VISUAL_ID:
			return Relation_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return digital.diagram.providers.DigitalElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return digital.diagram.providers.DigitalElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return digital.diagram.providers.DigitalElementTypes.getElement(elementTypeAdapter);
		}
	};

}
