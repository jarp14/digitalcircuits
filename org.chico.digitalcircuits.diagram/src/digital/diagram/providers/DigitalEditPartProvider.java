/*
 * 
 */
package digital.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import digital.diagram.edit.parts.DigitalCircuitsDiagramEditPart;
import digital.diagram.edit.parts.DigitalEditPartFactory;
import digital.diagram.part.DigitalVisualIDRegistry;

/**
 * @generated
 */
public class DigitalEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DigitalEditPartProvider() {
		super(new DigitalEditPartFactory(), DigitalVisualIDRegistry.TYPED_INSTANCE,
				DigitalCircuitsDiagramEditPart.MODEL_ID);
	}

}
