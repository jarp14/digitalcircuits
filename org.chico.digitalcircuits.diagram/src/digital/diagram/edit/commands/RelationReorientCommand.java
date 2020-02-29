/*
 * 
 */
package digital.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import digital.DigitalCircuitsDiagram;
import digital.LinkableObject;
import digital.Relation;
import digital.diagram.edit.policies.DigitalBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public RelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Relation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof LinkableObject && newEnd instanceof LinkableObject)) {
			return false;
		}
		if (getLink().getTarget().size() != 1) {
			return false;
		}
		LinkableObject target = (LinkableObject) getLink().getTarget().get(0);
		if (!(getLink().eContainer() instanceof DigitalCircuitsDiagram)) {
			return false;
		}
		DigitalCircuitsDiagram container = (DigitalCircuitsDiagram) getLink().eContainer();
		return DigitalBaseItemSemanticEditPolicy.getLinkConstraints().canExistRelation_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof LinkableObject && newEnd instanceof LinkableObject)) {
			return false;
		}
		if (getLink().getSource().size() != 1) {
			return false;
		}
		LinkableObject source = (LinkableObject) getLink().getSource().get(0);
		if (!(getLink().eContainer() instanceof DigitalCircuitsDiagram)) {
			return false;
		}
		DigitalCircuitsDiagram container = (DigitalCircuitsDiagram) getLink().eContainer();
		return DigitalBaseItemSemanticEditPolicy.getLinkConstraints().canExistRelation_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getSource().remove(getOldSource());
		getLink().getSource().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTarget().remove(getOldTarget());
		getLink().getTarget().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Relation getLink() {
		return (Relation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected LinkableObject getOldSource() {
		return (LinkableObject) oldEnd;
	}

	/**
	* @generated
	*/
	protected LinkableObject getNewSource() {
		return (LinkableObject) newEnd;
	}

	/**
	* @generated
	*/
	protected LinkableObject getOldTarget() {
		return (LinkableObject) oldEnd;
	}

	/**
	* @generated
	*/
	protected LinkableObject getNewTarget() {
		return (LinkableObject) newEnd;
	}
}
