package digitalfigures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

public class BufferFigure extends ImageFigure {
	public BufferFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
			"images/BUFFER.gif").createImage(), 0);
	}
}