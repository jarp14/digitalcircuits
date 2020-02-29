
/*
 * 
 */
package digital.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import digital.diagram.providers.DigitalElementTypes;

/**
 * @generated
 */
public class DigitalPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createLogicGates1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Logic Gates" palette tool group
	* @generated
	*/
	private PaletteContainer createLogicGates1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.LogicGates1Group_title);
		paletteContainer.setId("createLogicGates1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnd1CreationTool());
		paletteContainer.add(createBuffer2CreationTool());
		paletteContainer.add(createNand3CreationTool());
		paletteContainer.add(createNor4CreationTool());
		paletteContainer.add(createNot5CreationTool());
		paletteContainer.add(createOr6CreationTool());
		paletteContainer.add(createXnor7CreationTool());
		paletteContainer.add(createXor8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInput1CreationTool());
		paletteContainer.add(createOutput2CreationTool());
		paletteContainer.add(createRelation3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnd1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.And1CreationTool_title,
				Messages.And1CreationTool_desc, Collections.singletonList(DigitalElementTypes.And_2001));
		entry.setId("createAnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/AND.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBuffer2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Buffer2CreationTool_title,
				Messages.Buffer2CreationTool_desc, Collections.singletonList(DigitalElementTypes.Buffer_2002));
		entry.setId("createBuffer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/BUFFER.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNand3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Nand3CreationTool_title,
				Messages.Nand3CreationTool_desc, Collections.singletonList(DigitalElementTypes.Nand_2003));
		entry.setId("createNand3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/NAND.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNor4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Nor4CreationTool_title,
				Messages.Nor4CreationTool_desc, Collections.singletonList(DigitalElementTypes.Nor_2004));
		entry.setId("createNor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/NOR.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNot5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Not5CreationTool_title,
				Messages.Not5CreationTool_desc, Collections.singletonList(DigitalElementTypes.Not_2005));
		entry.setId("createNot5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/NOT.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOr6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Or6CreationTool_title,
				Messages.Or6CreationTool_desc, Collections.singletonList(DigitalElementTypes.Or_2006));
		entry.setId("createOr6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/OR.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createXnor7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Xnor7CreationTool_title,
				Messages.Xnor7CreationTool_desc, Collections.singletonList(DigitalElementTypes.Xnor_2007));
		entry.setId("createXnor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/XNOR.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createXor8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Xor8CreationTool_title,
				Messages.Xor8CreationTool_desc, Collections.singletonList(DigitalElementTypes.Xor_2008));
		entry.setId("createXor8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/XOR.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input1CreationTool_title,
				Messages.Input1CreationTool_desc, Collections.singletonList(DigitalElementTypes.Start_2009));
		entry.setId("createInput1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/INPUT.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutput2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Output2CreationTool_title,
				Messages.Output2CreationTool_desc, Collections.singletonList(DigitalElementTypes.End_2010));
		entry.setId("createOutput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DigitalDiagramEditorPlugin.findImageDescriptor("/org.chico.digitalcircuits.figures/images/OUTPUT.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelation3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Relation3CreationTool_title,
				Messages.Relation3CreationTool_desc, Collections.singletonList(DigitalElementTypes.Relation_4001));
		entry.setId("createRelation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DigitalDiagramEditorPlugin
				.findImageDescriptor("/org.chico.digitalcircuits.figures/images/RELATION.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
