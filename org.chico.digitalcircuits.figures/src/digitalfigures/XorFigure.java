package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class XorFigure extends ImageFigure {
	public XorFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/XOR.gif").createImage(), 0);
	}
}