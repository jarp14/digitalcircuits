/*
 * 
 */
package digital.diagram.providers;

import digital.diagram.part.DigitalDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DigitalDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			DigitalDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
