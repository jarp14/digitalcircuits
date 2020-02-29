package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class XnorFigure extends ImageFigure {
	public XnorFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/XNOR.gif").createImage(), 0);
	}
}