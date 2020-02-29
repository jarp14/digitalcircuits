/*
* 
*/
package digital.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import digital.And;
import digital.Buffer;
import digital.DigitalCircuitsDiagram;
import digital.DigitalPackage;
import digital.End;
import digital.Gate;
import digital.LinkableObject;
import digital.Nand;
import digital.Nor;
import digital.Not;
import digital.Or;
import digital.Relation;
import digital.Start;
import digital.StartEnd;
import digital.Xnor;
import digital.Xor;
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
import digital.diagram.providers.DigitalElementTypes;

/**
 * @generated
 */
public class DigitalDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DigitalNodeDescriptor> getSemanticChildren(View view) {
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return getDigitalCircuitsDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DigitalNodeDescriptor> getDigitalCircuitsDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DigitalCircuitsDiagram modelElement = (DigitalCircuitsDiagram) view.getElement();
		LinkedList<DigitalNodeDescriptor> result = new LinkedList<DigitalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGates().iterator(); it.hasNext();) {
			Gate childElement = (Gate) it.next();
			int visualID = DigitalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BufferEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NandEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NorEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XnorEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XorEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			StartEnd childElement = (StartEnd) it.next();
			int visualID = DigitalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new DigitalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DigitalLinkDescriptor> getContainedLinks(View view) {
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return getDigitalCircuitsDiagram_1000ContainedLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_2001ContainedLinks(view);
		case BufferEditPart.VISUAL_ID:
			return getBuffer_2002ContainedLinks(view);
		case NandEditPart.VISUAL_ID:
			return getNand_2003ContainedLinks(view);
		case NorEditPart.VISUAL_ID:
			return getNor_2004ContainedLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2005ContainedLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2006ContainedLinks(view);
		case XnorEditPart.VISUAL_ID:
			return getXnor_2007ContainedLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_2008ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2009ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2010ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DigitalLinkDescriptor> getIncomingLinks(View view) {
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case AndEditPart.VISUAL_ID:
			return getAnd_2001IncomingLinks(view);
		case BufferEditPart.VISUAL_ID:
			return getBuffer_2002IncomingLinks(view);
		case NandEditPart.VISUAL_ID:
			return getNand_2003IncomingLinks(view);
		case NorEditPart.VISUAL_ID:
			return getNor_2004IncomingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2005IncomingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2006IncomingLinks(view);
		case XnorEditPart.VISUAL_ID:
			return getXnor_2007IncomingLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_2008IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2009IncomingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2010IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DigitalLinkDescriptor> getOutgoingLinks(View view) {
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case AndEditPart.VISUAL_ID:
			return getAnd_2001OutgoingLinks(view);
		case BufferEditPart.VISUAL_ID:
			return getBuffer_2002OutgoingLinks(view);
		case NandEditPart.VISUAL_ID:
			return getNand_2003OutgoingLinks(view);
		case NorEditPart.VISUAL_ID:
			return getNor_2004OutgoingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2005OutgoingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2006OutgoingLinks(view);
		case XnorEditPart.VISUAL_ID:
			return getXnor_2007OutgoingLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_2008OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2009OutgoingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2010OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getDigitalCircuitsDiagram_1000ContainedLinks(View view) {
		DigitalCircuitsDiagram modelElement = (DigitalCircuitsDiagram) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getAnd_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getBuffer_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNand_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNor_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNot_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getOr_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXnor_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXor_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getStart_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getEnd_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getRelation_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getAnd_2001IncomingLinks(View view) {
		And modelElement = (And) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getBuffer_2002IncomingLinks(View view) {
		Buffer modelElement = (Buffer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNand_2003IncomingLinks(View view) {
		Nand modelElement = (Nand) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNor_2004IncomingLinks(View view) {
		Nor modelElement = (Nor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNot_2005IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getOr_2006IncomingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXnor_2007IncomingLinks(View view) {
		Xnor modelElement = (Xnor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXor_2008IncomingLinks(View view) {
		Xor modelElement = (Xor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getStart_2009IncomingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getEnd_2010IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getRelation_4001IncomingLinks(View view) {
		Relation modelElement = (Relation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getAnd_2001OutgoingLinks(View view) {
		And modelElement = (And) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getBuffer_2002OutgoingLinks(View view) {
		Buffer modelElement = (Buffer) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNand_2003OutgoingLinks(View view) {
		Nand modelElement = (Nand) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNor_2004OutgoingLinks(View view) {
		Nor modelElement = (Nor) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getNot_2005OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getOr_2006OutgoingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXnor_2007OutgoingLinks(View view) {
		Xnor modelElement = (Xnor) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getXor_2008OutgoingLinks(View view) {
		Xor modelElement = (Xor) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getStart_2009OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getEnd_2010OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DigitalLinkDescriptor> getRelation_4001OutgoingLinks(View view) {
		Relation modelElement = (Relation) view.getElement();
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DigitalLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			DigitalCircuitsDiagram container) {
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DigitalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof LinkableObject) {
				continue;
			}
			LinkableObject dst = (LinkableObject) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof LinkableObject) {
				continue;
			}
			LinkableObject src = (LinkableObject) theSource;
			result.add(new DigitalLinkDescriptor(src, dst, link, DigitalElementTypes.Relation_4001,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DigitalLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(LinkableObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DigitalPackage.eINSTANCE.getRelation_Target()
					|| false == setting.getEObject() instanceof Relation) {
				continue;
			}
			Relation link = (Relation) setting.getEObject();
			if (RelationEditPart.VISUAL_ID != DigitalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof LinkableObject) {
				continue;
			}
			LinkableObject src = (LinkableObject) theSource;
			result.add(new DigitalLinkDescriptor(src, target, link, DigitalElementTypes.Relation_4001,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DigitalLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_4001(
			LinkableObject source) {
		DigitalCircuitsDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DigitalCircuitsDiagram) {
				container = (DigitalCircuitsDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DigitalLinkDescriptor> result = new LinkedList<DigitalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DigitalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof LinkableObject) {
				continue;
			}
			LinkableObject dst = (LinkableObject) theTarget;
			List sources = link.getSource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof LinkableObject) {
				continue;
			}
			LinkableObject src = (LinkableObject) theSource;
			if (src != source) {
				continue;
			}
			result.add(new DigitalLinkDescriptor(src, dst, link, DigitalElementTypes.Relation_4001,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DigitalNodeDescriptor> getSemanticChildren(View view) {
			return DigitalDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DigitalLinkDescriptor> getContainedLinks(View view) {
			return DigitalDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DigitalLinkDescriptor> getIncomingLinks(View view) {
			return DigitalDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DigitalLinkDescriptor> getOutgoingLinks(View view) {
			return DigitalDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
