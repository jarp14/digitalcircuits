/*
* 
*/
package digital.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import digital.DigitalCircuitsDiagram;
import digital.DigitalPackage;
import digital.diagram.edit.parts.AndEditPart;
import digital.diagram.edit.parts.AndNameTypeEditPart;
import digital.diagram.edit.parts.BufferEditPart;
import digital.diagram.edit.parts.BufferNameTypeEditPart;
import digital.diagram.edit.parts.DigitalCircuitsDiagramEditPart;
import digital.diagram.edit.parts.EndEditPart;
import digital.diagram.edit.parts.EndNameEditPart;
import digital.diagram.edit.parts.NandEditPart;
import digital.diagram.edit.parts.NandNameTypeEditPart;
import digital.diagram.edit.parts.NorEditPart;
import digital.diagram.edit.parts.NorNameTypeEditPart;
import digital.diagram.edit.parts.NotEditPart;
import digital.diagram.edit.parts.NotNameTypeEditPart;
import digital.diagram.edit.parts.OrEditPart;
import digital.diagram.edit.parts.OrNameTypeEditPart;
import digital.diagram.edit.parts.RelationEditPart;
import digital.diagram.edit.parts.RelationValueEditPart;
import digital.diagram.edit.parts.StartEditPart;
import digital.diagram.edit.parts.StartNameEditPart;
import digital.diagram.edit.parts.XnorEditPart;
import digital.diagram.edit.parts.XnorNameTypeEditPart;
import digital.diagram.edit.parts.XorEditPart;
import digital.diagram.edit.parts.XorNameTypeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DigitalVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.digitalcircuits.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DigitalCircuitsDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DigitalCircuitsDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return digital.diagram.part.DigitalVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DigitalDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DigitalPackage.eINSTANCE.getDigitalCircuitsDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DigitalCircuitsDiagram) domainElement)) {
			return DigitalCircuitsDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = digital.diagram.part.DigitalVisualIDRegistry.getModelID(containerView);
		if (!DigitalCircuitsDiagramEditPart.MODEL_ID.equals(containerModelID) && !"digital".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DigitalCircuitsDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = digital.diagram.part.DigitalVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DigitalCircuitsDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			if (DigitalPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return AndEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getBuffer().isSuperTypeOf(domainElement.eClass())) {
				return BufferEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getNand().isSuperTypeOf(domainElement.eClass())) {
				return NandEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getNor().isSuperTypeOf(domainElement.eClass())) {
				return NorEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return OrEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getXnor().isSuperTypeOf(domainElement.eClass())) {
				return XnorEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getXor().isSuperTypeOf(domainElement.eClass())) {
				return XorEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getStart().isSuperTypeOf(domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			if (DigitalPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = digital.diagram.part.DigitalVisualIDRegistry.getModelID(containerView);
		if (!DigitalCircuitsDiagramEditPart.MODEL_ID.equals(containerModelID) && !"digital".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DigitalCircuitsDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = digital.diagram.part.DigitalVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DigitalCircuitsDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			if (AndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BufferEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XnorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndEditPart.VISUAL_ID:
			if (AndNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BufferEditPart.VISUAL_ID:
			if (BufferNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NandEditPart.VISUAL_ID:
			if (NandNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NorEditPart.VISUAL_ID:
			if (NorNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotEditPart.VISUAL_ID:
			if (NotNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrEditPart.VISUAL_ID:
			if (OrNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XnorEditPart.VISUAL_ID:
			if (XnorNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XorEditPart.VISUAL_ID:
			if (XorNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartEditPart.VISUAL_ID:
			if (StartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndEditPart.VISUAL_ID:
			if (EndNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationEditPart.VISUAL_ID:
			if (RelationValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DigitalPackage.eINSTANCE.getRelation().isSuperTypeOf(domainElement.eClass())) {
			return RelationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DigitalCircuitsDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return false;
		case AndEditPart.VISUAL_ID:
		case BufferEditPart.VISUAL_ID:
		case NandEditPart.VISUAL_ID:
		case NorEditPart.VISUAL_ID:
		case NotEditPart.VISUAL_ID:
		case OrEditPart.VISUAL_ID:
		case XnorEditPart.VISUAL_ID:
		case XorEditPart.VISUAL_ID:
		case StartEditPart.VISUAL_ID:
		case EndEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return digital.diagram.part.DigitalVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return digital.diagram.part.DigitalVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return digital.diagram.part.DigitalVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return digital.diagram.part.DigitalVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return digital.diagram.part.DigitalVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return digital.diagram.part.DigitalVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
