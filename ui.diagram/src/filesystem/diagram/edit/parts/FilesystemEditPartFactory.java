/*
 * 
 */
package filesystem.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import filesystem.diagram.part.FilesystemVisualIDRegistry;

/**
 * @generated
 */
public class FilesystemEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FilesystemVisualIDRegistry.getVisualID(view)) {

			case Ui_DiagramEditPart.VISUAL_ID:
				return new Ui_DiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceNameEditPart.VISUAL_ID:
				return new UserInterfaceNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case TextInputEditPart.VISUAL_ID:
				return new TextInputEditPart(view);

			case TextInputNameEditPart.VISUAL_ID:
				return new TextInputNameEditPart(view);

			case UserInterface2EditPart.VISUAL_ID:
				return new UserInterface2EditPart(view);

			case UserInterfaceName2EditPart.VISUAL_ID:
				return new UserInterfaceName2EditPart(view);

			case UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart(view);

			case UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
