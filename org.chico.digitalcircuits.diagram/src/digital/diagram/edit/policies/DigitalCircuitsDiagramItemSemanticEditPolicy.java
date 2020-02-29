/*
* 
*/
package digital.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import digital.diagram.edit.commands.AndCreateCommand;
import digital.diagram.edit.commands.BufferCreateCommand;
import digital.diagram.edit.commands.EndCreateCommand;
import digital.diagram.edit.commands.NandCreateCommand;
import digital.diagram.edit.commands.NorCreateCommand;
import digital.diagram.edit.commands.NotCreateCommand;
import digital.diagram.edit.commands.OrCreateCommand;
import digital.diagram.edit.commands.StartCreateCommand;
import digital.diagram.edit.commands.XnorCreateCommand;
import digital.diagram.edit.commands.XorCreateCommand;
import digital.diagram.providers.DigitalElementTypes;

/**
 * @generated
 */
public class DigitalCircuitsDiagramItemSemanticEditPolicy extends DigitalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DigitalCircuitsDiagramItemSemanticEditPolicy() {
		super(DigitalElementTypes.DigitalCircuitsDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DigitalElementTypes.And_2001 == req.getElementType()) {
			return getGEFWrapper(new AndCreateCommand(req));
		}
		if (DigitalElementTypes.Buffer_2002 == req.getElementType()) {
			return getGEFWrapper(new BufferCreateCommand(req));
		}
		if (DigitalElementTypes.Nand_2003 == req.getElementType()) {
			return getGEFWrapper(new NandCreateCommand(req));
		}
		if (DigitalElementTypes.Nor_2004 == req.getElementType()) {
			return getGEFWrapper(new NorCreateCommand(req));
		}
		if (DigitalElementTypes.Not_2005 == req.getElementType()) {
			return getGEFWrapper(new NotCreateCommand(req));
		}
		if (DigitalElementTypes.Or_2006 == req.getElementType()) {
			return getGEFWrapper(new OrCreateCommand(req));
		}
		if (DigitalElementTypes.Xnor_2007 == req.getElementType()) {
			return getGEFWrapper(new XnorCreateCommand(req));
		}
		if (DigitalElementTypes.Xor_2008 == req.getElementType()) {
			return getGEFWrapper(new XorCreateCommand(req));
		}
		if (DigitalElementTypes.Start_2009 == req.getElementType()) {
			return getGEFWrapper(new StartCreateCommand(req));
		}
		if (DigitalElementTypes.End_2010 == req.getElementType()) {
			return getGEFWrapper(new EndCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
