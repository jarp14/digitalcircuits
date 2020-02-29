package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class AndFigure extends ImageFigure {
	public AndFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/AND.gif").createImage(), 0);
	}
}