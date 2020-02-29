/*
 * 
 */
package digital.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import digital.DigitalPackage;
import digital.diagram.edit.parts.AndNameTypeEditPart;
import digital.diagram.edit.parts.BufferNameTypeEditPart;
import digital.diagram.edit.parts.EndNameEditPart;
import digital.diagram.edit.parts.NandNameTypeEditPart;
import digital.diagram.edit.parts.NorNameTypeEditPart;
import digital.diagram.edit.parts.NotNameTypeEditPart;
import digital.diagram.edit.parts.OrNameTypeEditPart;
import digital.diagram.edit.parts.RelationValueEditPart;
import digital.diagram.edit.parts.StartNameEditPart;
import digital.diagram.edit.parts.XnorNameTypeEditPart;
import digital.diagram.edit.parts.XorNameTypeEditPart;
import digital.diagram.parsers.MessageFormatParser;
import digital.diagram.part.DigitalVisualIDRegistry;

/**
 * @generated
 */
public class DigitalParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser andNameType_5001Parser;

	/**
	* @generated
	*/
	private IParser getAndNameType_5001Parser() {
		if (andNameType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getAnd_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			andNameType_5001Parser = parser;
		}
		return andNameType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser bufferNameType_5002Parser;

	/**
	* @generated
	*/
	private IParser getBufferNameType_5002Parser() {
		if (bufferNameType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getBuffer_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			bufferNameType_5002Parser = parser;
		}
		return bufferNameType_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser nandNameType_5003Parser;

	/**
	* @generated
	*/
	private IParser getNandNameType_5003Parser() {
		if (nandNameType_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getNand_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			nandNameType_5003Parser = parser;
		}
		return nandNameType_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser norNameType_5004Parser;

	/**
	* @generated
	*/
	private IParser getNorNameType_5004Parser() {
		if (norNameType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getNor_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			norNameType_5004Parser = parser;
		}
		return norNameType_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser notNameType_5005Parser;

	/**
	* @generated
	*/
	private IParser getNotNameType_5005Parser() {
		if (notNameType_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getNot_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			notNameType_5005Parser = parser;
		}
		return notNameType_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser orNameType_5006Parser;

	/**
	* @generated
	*/
	private IParser getOrNameType_5006Parser() {
		if (orNameType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getOr_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			orNameType_5006Parser = parser;
		}
		return orNameType_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser xnorNameType_5007Parser;

	/**
	* @generated
	*/
	private IParser getXnorNameType_5007Parser() {
		if (xnorNameType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getXnor_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			xnorNameType_5007Parser = parser;
		}
		return xnorNameType_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser xorNameType_5008Parser;

	/**
	* @generated
	*/
	private IParser getXorNameType_5008Parser() {
		if (xorNameType_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getGate_Name(),
					DigitalPackage.eINSTANCE.getXor_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}::{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}::{1}"); //$NON-NLS-1$
			xorNameType_5008Parser = parser;
		}
		return xorNameType_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser startName_5009Parser;

	/**
	* @generated
	*/
	private IParser getStartName_5009Parser() {
		if (startName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getStart_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startName_5009Parser = parser;
		}
		return startName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser endName_5010Parser;

	/**
	* @generated
	*/
	private IParser getEndName_5010Parser() {
		if (endName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { DigitalPackage.eINSTANCE.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5010Parser = parser;
		}
		return endName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser relationValue_6001Parser;

	/**
	* @generated
	*/
	private IParser getRelationValue_6001Parser() {
		if (relationValue_6001Parser == null) {
			EAttribute editableFeature = DigitalPackage.eINSTANCE.getLink_Value();
			EnumParser parser = new EnumParser(editableFeature);
			relationValue_6001Parser = parser;
		}
		return relationValue_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AndNameTypeEditPart.VISUAL_ID:
			return getAndNameType_5001Parser();
		case BufferNameTypeEditPart.VISUAL_ID:
			return getBufferNameType_5002Parser();
		case NandNameTypeEditPart.VISUAL_ID:
			return getNandNameType_5003Parser();
		case NorNameTypeEditPart.VISUAL_ID:
			return getNorNameType_5004Parser();
		case NotNameTypeEditPart.VISUAL_ID:
			return getNotNameType_5005Parser();
		case OrNameTypeEditPart.VISUAL_ID:
			return getOrNameType_5006Parser();
		case XnorNameTypeEditPart.VISUAL_ID:
			return getXnorNameType_5007Parser();
		case XorNameTypeEditPart.VISUAL_ID:
			return getXorNameType_5008Parser();
		case StartNameEditPart.VISUAL_ID:
			return getStartName_5009Parser();
		case EndNameEditPart.VISUAL_ID:
			return getEndName_5010Parser();

		case RelationValueEditPart.VISUAL_ID:
			return getRelationValue_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DigitalVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DigitalVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DigitalElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
