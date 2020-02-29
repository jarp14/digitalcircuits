package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class NorFigure extends ImageFigure {
	public NorFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/NOR.gif").createImage(), 0);
	}
}