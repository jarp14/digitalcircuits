/*
* 
*/
package digital.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import digital.diagram.part.DigitalDiagramEditorPlugin;
import digital.diagram.part.DigitalVisualIDRegistry;
import digital.diagram.providers.DigitalElementTypes;
import digital.diagram.providers.DigitalParserProvider;

/**
 * @generated
 */
public class DigitalNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DigitalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DigitalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DigitalNavigatorItem && !isOwnView(((DigitalNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DigitalNavigatorGroup) {
			DigitalNavigatorGroup group = (DigitalNavigatorGroup) element;
			return DigitalDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DigitalNavigatorItem) {
			DigitalNavigatorItem navigatorItem = (DigitalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?digital?DigitalCircuitsDiagram", //$NON-NLS-1$
					DigitalElementTypes.DigitalCircuitsDiagram_1000);
		case AndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?And", DigitalElementTypes.And_2001); //$NON-NLS-1$
		case BufferEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Buffer", DigitalElementTypes.Buffer_2002); //$NON-NLS-1$
		case NandEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Nand", DigitalElementTypes.Nand_2003); //$NON-NLS-1$
		case NorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Nor", DigitalElementTypes.Nor_2004); //$NON-NLS-1$
		case NotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Not", DigitalElementTypes.Not_2005); //$NON-NLS-1$
		case OrEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Or", DigitalElementTypes.Or_2006); //$NON-NLS-1$
		case XnorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Xnor", DigitalElementTypes.Xnor_2007); //$NON-NLS-1$
		case XorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Xor", DigitalElementTypes.Xor_2008); //$NON-NLS-1$
		case StartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?Start", DigitalElementTypes.Start_2009); //$NON-NLS-1$
		case EndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?digital?End", DigitalElementTypes.End_2010); //$NON-NLS-1$
		case RelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?digital?Relation", DigitalElementTypes.Relation_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DigitalDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DigitalElementTypes.isKnownElementType(elementType)) {
			image = DigitalElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DigitalNavigatorGroup) {
			DigitalNavigatorGroup group = (DigitalNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DigitalNavigatorItem) {
			DigitalNavigatorItem navigatorItem = (DigitalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DigitalVisualIDRegistry.getVisualID(view)) {
		case DigitalCircuitsDiagramEditPart.VISUAL_ID:
			return getDigitalCircuitsDiagram_1000Text(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_2001Text(view);
		case BufferEditPart.VISUAL_ID:
			return getBuffer_2002Text(view);
		case NandEditPart.VISUAL_ID:
			return getNand_2003Text(view);
		case NorEditPart.VISUAL_ID:
			return getNor_2004Text(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2005Text(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2006Text(view);
		case XnorEditPart.VISUAL_ID:
			return getXnor_2007Text(view);
		case XorEditPart.VISUAL_ID:
			return getXor_2008Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2009Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2010Text(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDigitalCircuitsDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAnd_2001Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.And_2001,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(AndNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBuffer_2002Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Buffer_2002,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(BufferNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNand_2003Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Nand_2003,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(NandNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNor_2004Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Nor_2004,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(NorNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNot_2005Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Not_2005,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(NotNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOr_2006Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Or_2006,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(OrNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getXnor_2007Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Xnor_2007,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(XnorNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getXor_2008Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Xor_2008,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(XorNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStart_2009Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Start_2009,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(StartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnd_2010Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.End_2010,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(EndNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelation_4001Text(View view) {
		IParser parser = DigitalParserProvider.getParser(DigitalElementTypes.Relation_4001,
				view.getElement() != null ? view.getElement() : view,
				DigitalVisualIDRegistry.getType(RelationValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DigitalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DigitalCircuitsDiagramEditPart.MODEL_ID.equals(DigitalVisualIDRegistry.getModelID(view));
	}

}
