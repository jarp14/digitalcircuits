/*
 * 
 */
package digital.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import digital.diagram.providers.DigitalElementTypes;
import digital.diagram.providers.DigitalModelingAssistantProvider;

/**
 * @generated
 */
public class DigitalModelingAssistantProviderOfDigitalCircuitsDiagramEditPart extends DigitalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
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
		return types;
	}

}
