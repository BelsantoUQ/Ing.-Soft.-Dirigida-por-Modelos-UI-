/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case Ui_DiagramEditPart.VISUAL_ID:
				return new Ui_DiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceNameEditPart.VISUAL_ID:
				return new UserInterfaceNameEditPart(view);

			case ComboEditPart.VISUAL_ID:
				return new ComboEditPart(view);

			case ComboNameEditPart.VISUAL_ID:
				return new ComboNameEditPart(view);

			case Combo2EditPart.VISUAL_ID:
				return new Combo2EditPart(view);

			case ComboName2EditPart.VISUAL_ID:
				return new ComboName2EditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case MenuBarEditPart.VISUAL_ID:
				return new MenuBarEditPart(view);

			case MenuBarNameEditPart.VISUAL_ID:
				return new MenuBarNameEditPart(view);

			case BorderLayoutEditPart.VISUAL_ID:
				return new BorderLayoutEditPart(view);

			case BorderLayoutNameEditPart.VISUAL_ID:
				return new BorderLayoutNameEditPart(view);

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

			case TexFieldEditPart.VISUAL_ID:
				return new TexFieldEditPart(view);

			case TexFieldNameEditPart.VISUAL_ID:
				return new TexFieldNameEditPart(view);

			case CheckboxEditPart.VISUAL_ID:
				return new CheckboxEditPart(view);

			case CheckboxNameEditPart.VISUAL_ID:
				return new CheckboxNameEditPart(view);

			case AlertaDialogEditPart.VISUAL_ID:
				return new AlertaDialogEditPart(view);

			case AlertaDialogNameEditPart.VISUAL_ID:
				return new AlertaDialogNameEditPart(view);

			case SimpleDialogEditPart.VISUAL_ID:
				return new SimpleDialogEditPart(view);

			case SimpleDialogNameEditPart.VISUAL_ID:
				return new SimpleDialogNameEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnNameEditPart.VISUAL_ID:
				return new ColumnNameEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableName2EditPart.VISUAL_ID:
				return new TableName2EditPart(view);

			case MenuBar2EditPart.VISUAL_ID:
				return new MenuBar2EditPart(view);

			case MenuBarName2EditPart.VISUAL_ID:
				return new MenuBarName2EditPart(view);

			case BorderLayout2EditPart.VISUAL_ID:
				return new BorderLayout2EditPart(view);

			case BorderLayoutName2EditPart.VISUAL_ID:
				return new BorderLayoutName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelName2EditPart.VISUAL_ID:
				return new LabelName2EditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonName2EditPart.VISUAL_ID:
				return new ButtonName2EditPart(view);

			case TextInput2EditPart.VISUAL_ID:
				return new TextInput2EditPart(view);

			case TextInputName2EditPart.VISUAL_ID:
				return new TextInputName2EditPart(view);

			case TexField2EditPart.VISUAL_ID:
				return new TexField2EditPart(view);

			case TexFieldName2EditPart.VISUAL_ID:
				return new TexFieldName2EditPart(view);

			case Checkbox2EditPart.VISUAL_ID:
				return new Checkbox2EditPart(view);

			case CheckboxName2EditPart.VISUAL_ID:
				return new CheckboxName2EditPart(view);

			case AlertaDialog2EditPart.VISUAL_ID:
				return new AlertaDialog2EditPart(view);

			case AlertaDialogName2EditPart.VISUAL_ID:
				return new AlertaDialogName2EditPart(view);

			case SimpleDialog2EditPart.VISUAL_ID:
				return new SimpleDialog2EditPart(view);

			case SimpleDialogName2EditPart.VISUAL_ID:
				return new SimpleDialogName2EditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnName2EditPart.VISUAL_ID:
				return new ColumnName2EditPart(view);

			case UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart(view);

			case ComboComboLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new ComboComboLstWidgetsCompartmentEditPart(view);

			case ComboComboLstWidgetsCompartment2EditPart.VISUAL_ID:
				return new ComboComboLstWidgetsCompartment2EditPart(view);

			case GroupGroupLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new GroupGroupLstWidgetsCompartmentEditPart(view);

			case TableTableLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new TableTableLstWidgetsCompartmentEditPart(view);

			case MenuBarMenuBarLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new MenuBarMenuBarLstWidgetsCompartmentEditPart(view);

			case BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart.VISUAL_ID:
				return new BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart(view);

			case GroupGroupLstWidgetsCompartment2EditPart.VISUAL_ID:
				return new GroupGroupLstWidgetsCompartment2EditPart(view);

			case TableTableLstWidgetsCompartment2EditPart.VISUAL_ID:
				return new TableTableLstWidgetsCompartment2EditPart(view);

			case MenuBarMenuBarLstWidgetsCompartment2EditPart.VISUAL_ID:
				return new MenuBarMenuBarLstWidgetsCompartment2EditPart(view);

			case BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart.VISUAL_ID:
				return new BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart(view);
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
