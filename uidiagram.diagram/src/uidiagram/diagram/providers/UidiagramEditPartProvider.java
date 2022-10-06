/*
 * 
 */
package uidiagram.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UidiagramEditPartFactory;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UidiagramEditPartProvider() {
		super(new UidiagramEditPartFactory(), UidiagramVisualIDRegistry.TYPED_INSTANCE, Ui_DiagramEditPart.MODEL_ID);
	}

}
