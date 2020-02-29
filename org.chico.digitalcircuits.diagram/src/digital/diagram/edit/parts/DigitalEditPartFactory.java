/*
 * 
 */
package digital.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import digital.diagram.part.DigitalVisualIDRegistry;

/**
 * @generated
 */
public class DigitalEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DigitalVisualIDRegistry.getVisualID(view)) {

			case DigitalCircuitsDiagramEditPart.VISUAL_ID:
				return new DigitalCircuitsDiagramEditPart(view);

			case AndEditPart.VISUAL_ID:
				return new AndEditPart(view);

			case AndNameTypeEditPart.VISUAL_ID:
				return new AndNameTypeEditPart(view);

			case BufferEditPart.VISUAL_ID:
				return new BufferEditPart(view);

			case BufferNameTypeEditPart.VISUAL_ID:
				return new BufferNameTypeEditPart(view);

			case NandEditPart.VISUAL_ID:
				return new NandEditPart(view);

			case NandNameTypeEditPart.VISUAL_ID:
				return new NandNameTypeEditPart(view);

			case NorEditPart.VISUAL_ID:
				return new NorEditPart(view);

			case NorNameTypeEditPart.VISUAL_ID:
				return new NorNameTypeEditPart(view);

			case NotEditPart.VISUAL_ID:
				return new NotEditPart(view);

			case NotNameTypeEditPart.VISUAL_ID:
				return new NotNameTypeEditPart(view);

			case OrEditPart.VISUAL_ID:
				return new OrEditPart(view);

			case OrNameTypeEditPart.VISUAL_ID:
				return new OrNameTypeEditPart(view);

			case XnorEditPart.VISUAL_ID:
				return new XnorEditPart(view);

			case XnorNameTypeEditPart.VISUAL_ID:
				return new XnorNameTypeEditPart(view);

			case XorEditPart.VISUAL_ID:
				return new XorEditPart(view);

			case XorNameTypeEditPart.VISUAL_ID:
				return new XorNameTypeEditPart(view);

			case StartEditPart.VISUAL_ID:
				return new StartEditPart(view);

			case StartNameEditPart.VISUAL_ID:
				return new StartNameEditPart(view);

			case EndEditPart.VISUAL_ID:
				return new EndEditPart(view);

			case EndNameEditPart.VISUAL_ID:
				return new EndNameEditPart(view);

			case RelationEditPart.VISUAL_ID:
				return new RelationEditPart(view);

			case RelationValueEditPart.VISUAL_ID:
				return new RelationValueEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
