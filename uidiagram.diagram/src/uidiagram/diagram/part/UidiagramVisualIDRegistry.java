/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.Ui_Diagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AlertaDialog2EditPart;
import uidiagram.diagram.edit.parts.AlertaDialogEditPart;
import uidiagram.diagram.edit.parts.AlertaDialogName2EditPart;
import uidiagram.diagram.edit.parts.AlertaDialogNameEditPart;
import uidiagram.diagram.edit.parts.BorderLayout2EditPart;
import uidiagram.diagram.edit.parts.BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.BorderLayoutEditPart;
import uidiagram.diagram.edit.parts.BorderLayoutName2EditPart;
import uidiagram.diagram.edit.parts.BorderLayoutNameEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.Checkbox2EditPart;
import uidiagram.diagram.edit.parts.CheckboxEditPart;
import uidiagram.diagram.edit.parts.CheckboxName2EditPart;
import uidiagram.diagram.edit.parts.CheckboxNameEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.Column3EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnName2EditPart;
import uidiagram.diagram.edit.parts.ColumnName3EditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.Combo2EditPart;
import uidiagram.diagram.edit.parts.ComboComboLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ComboComboLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ComboEditPart;
import uidiagram.diagram.edit.parts.ComboName2EditPart;
import uidiagram.diagram.edit.parts.ComboNameEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.MenuBar2EditPart;
import uidiagram.diagram.edit.parts.MenuBarEditPart;
import uidiagram.diagram.edit.parts.MenuBarMenuBarLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.MenuBarMenuBarLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.MenuBarName2EditPart;
import uidiagram.diagram.edit.parts.MenuBarNameEditPart;
import uidiagram.diagram.edit.parts.SimpleDialog2EditPart;
import uidiagram.diagram.edit.parts.SimpleDialogEditPart;
import uidiagram.diagram.edit.parts.SimpleDialogName2EditPart;
import uidiagram.diagram.edit.parts.SimpleDialogNameEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.TableTableLstColumnsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstColumnsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TableTableLstWidgetsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstWidgetsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TexField2EditPart;
import uidiagram.diagram.edit.parts.TexFieldEditPart;
import uidiagram.diagram.edit.parts.TexFieldName2EditPart;
import uidiagram.diagram.edit.parts.TexFieldNameEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uidiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Ui_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUi_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Ui_Diagram) domainElement)) {
			return Ui_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return ComboEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayout2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexField2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialog2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialog2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			break;
		case ComboComboLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case ComboComboLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case TableTableLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case MenuBarMenuBarLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case TableTableLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case MenuBarMenuBarLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getCombo().isSuperTypeOf(domainElement.eClass())) {
				return Combo2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuBar().isSuperTypeOf(domainElement.eClass())) {
				return MenuBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBorderLayout().isSuperTypeOf(domainElement.eClass())) {
				return BorderLayoutEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTexField().isSuperTypeOf(domainElement.eClass())) {
				return TexFieldEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAlertaDialog().isSuperTypeOf(domainElement.eClass())) {
				return AlertaDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSimpleDialog().isSuperTypeOf(domainElement.eClass())) {
				return SimpleDialogEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			if (UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceEditPart.VISUAL_ID:
			if (UserInterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboEditPart.VISUAL_ID:
			if (ComboNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboComboLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Combo2EditPart.VISUAL_ID:
			if (ComboName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboComboLstWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuBarEditPart.VISUAL_ID:
			if (MenuBarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarMenuBarLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorderLayoutEditPart.VISUAL_ID:
			if (BorderLayoutNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInputEditPart.VISUAL_ID:
			if (TextInputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TexFieldEditPart.VISUAL_ID:
			if (TexFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckboxEditPart.VISUAL_ID:
			if (CheckboxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AlertaDialogEditPart.VISUAL_ID:
			if (AlertaDialogNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleDialogEditPart.VISUAL_ID:
			if (SimpleDialogNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table2EditPart.VISUAL_ID:
			if (TableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuBar2EditPart.VISUAL_ID:
			if (MenuBarName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarMenuBarLstWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorderLayout2EditPart.VISUAL_ID:
			if (BorderLayoutName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInput2EditPart.VISUAL_ID:
			if (TextInputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TexField2EditPart.VISUAL_ID:
			if (TexFieldName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Checkbox2EditPart.VISUAL_ID:
			if (CheckboxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AlertaDialog2EditPart.VISUAL_ID:
			if (AlertaDialogName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleDialog2EditPart.VISUAL_ID:
			if (SimpleDialogName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column2EditPart.VISUAL_ID:
			if (ColumnName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (ComboEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayout2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexField2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialog2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialog2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboComboLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboComboLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuBarMenuBarLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuBarMenuBarLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart.VISUAL_ID:
			if (Combo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorderLayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TexFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlertaDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleDialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Ui_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserInterfaceUserInterfaceLstWidgetsCompartmentEditPart.VISUAL_ID:
		case ComboComboLstWidgetsCompartmentEditPart.VISUAL_ID:
		case ComboComboLstWidgetsCompartment2EditPart.VISUAL_ID:
		case GroupGroupLstWidgetsCompartmentEditPart.VISUAL_ID:
		case TableTableLstWidgetsCompartmentEditPart.VISUAL_ID:
		case MenuBarMenuBarLstWidgetsCompartmentEditPart.VISUAL_ID:
		case BorderLayoutBorderLayoutLstWidgetsCompartmentEditPart.VISUAL_ID:
		case GroupGroupLstWidgetsCompartment2EditPart.VISUAL_ID:
		case TableTableLstWidgetsCompartment2EditPart.VISUAL_ID:
		case MenuBarMenuBarLstWidgetsCompartment2EditPart.VISUAL_ID:
		case BorderLayoutBorderLayoutLstWidgetsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return false;
		case Label2EditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case TextInput2EditPart.VISUAL_ID:
		case TexField2EditPart.VISUAL_ID:
		case Checkbox2EditPart.VISUAL_ID:
		case AlertaDialog2EditPart.VISUAL_ID:
		case SimpleDialog2EditPart.VISUAL_ID:
		case ColumnEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case TextInputEditPart.VISUAL_ID:
		case TexFieldEditPart.VISUAL_ID:
		case CheckboxEditPart.VISUAL_ID:
		case AlertaDialogEditPart.VISUAL_ID:
		case SimpleDialogEditPart.VISUAL_ID:
		case Column2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
