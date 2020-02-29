package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class OutputFigure extends ImageFigure {
	public OutputFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/Output.gif").createImage(), 0);
	}
}