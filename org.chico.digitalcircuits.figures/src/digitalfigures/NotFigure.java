package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class NotFigure extends ImageFigure {
	public NotFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/NOT.gif").createImage(), 0);
	}
}