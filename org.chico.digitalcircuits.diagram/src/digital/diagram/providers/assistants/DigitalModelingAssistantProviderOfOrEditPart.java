/*
 * 
 */
package digital.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import digital.diagram.edit.parts.AndEditPart;
import digital.diagram.edit.parts.BufferEditPart;
import digital.diagram.edit.parts.EndEditPart;
import digital.diagram.edit.parts.NandEditPart;
import digital.diagram.edit.parts.NorEditPart;
import digital.diagram.edit.parts.NotEditPart;
import digital.diagram.edit.parts.OrEditPart;
import digital.diagram.edit.parts.StartEditPart;
import digital.diagram.edit.parts.XnorEditPart;
import digital.diagram.edit.parts.XorEditPart;
import digital.diagram.providers.DigitalElementTypes;
import digital.diagram.providers.DigitalModelingAssistantProvider;

/**
 * @generated
 */
public class DigitalModelingAssistantProviderOfOrEditPart extends DigitalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((OrEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(OrEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DigitalElementTypes.Relation_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((OrEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(OrEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AndEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof BufferEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof NandEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof NorEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof OrEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof XnorEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof XorEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof StartEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		if (targetEditPart instanceof EndEditPart) {
			types.add(DigitalElementTypes.Relation_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((OrEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(OrEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DigitalElementTypes.Relation_4001) {
			types.add(DigitalElementTypes.And_2001);
			types.add(DigitalElementTypes.Buffer_2002);
			types.add(DigitalElementTypes.Nand_2003);
			types.add(DigitalElementTypes.Nor_2004);
			types.add(DigitalElementTypes.Not_2005);
			types.add(DigitalElementTypes.Or_2006);
			types.add(DigitalElementTypes.Xnor_2007);
			types.add(DigitalElementTypes.Xor_2008);
			types.add(DigitalElementTypes.Start_2009);
			types.add(DigitalElementTypes.End_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((OrEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(OrEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DigitalElementTypes.Relation_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((OrEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(OrEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DigitalElementTypes.Relation_4001) {
			types.add(DigitalElementTypes.And_2001);
			types.add(DigitalElementTypes.Buffer_2002);
			types.add(DigitalElementTypes.Nand_2003);
			types.add(DigitalElementTypes.Nor_2004);
			types.add(DigitalElementTypes.Not_2005);
			types.add(DigitalElementTypes.Or_2006);
			types.add(DigitalElementTypes.Xnor_2007);
			types.add(DigitalElementTypes.Xor_2008);
			types.add(DigitalElementTypes.Start_2009);
			types.add(DigitalElementTypes.End_2010);
		}
		return types;
	}

}
