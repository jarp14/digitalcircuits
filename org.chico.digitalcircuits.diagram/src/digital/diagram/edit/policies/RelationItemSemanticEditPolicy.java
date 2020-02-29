/*
* 
*/
package digital.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import digital.diagram.edit.commands.RelationCreateCommand;
import digital.diagram.edit.commands.RelationReorientCommand;
import digital.diagram.edit.parts.RelationEditPart;
import digital.diagram.providers.DigitalElementTypes;

/**
 * @generated
 */
public class RelationItemSemanticEditPolicy extends DigitalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RelationItemSemanticEditPolicy() {
		super(DigitalElementTypes.Relation_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DigitalElementTypes.Relation_4001 == req.getElementType()) {
			return getGEFWrapper(new RelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DigitalElementTypes.Relation_4001 == req.getElementType()) {
			return getGEFWrapper(new RelationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RelationEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
