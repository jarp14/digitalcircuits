package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class NandFigure extends ImageFigure {
	public NandFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/NAND.gif").createImage(), 0);
	}
}