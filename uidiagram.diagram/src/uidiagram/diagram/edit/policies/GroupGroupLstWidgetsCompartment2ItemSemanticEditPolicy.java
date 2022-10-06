/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AlertaDialogCreateCommand;
import uidiagram.diagram.edit.commands.BorderLayoutCreateCommand;
import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckboxCreateCommand;
import uidiagram.diagram.edit.commands.ColumnCreateCommand;
import uidiagram.diagram.edit.commands.Combo2CreateCommand;
import uidiagram.diagram.edit.commands.GroupCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.MenuBarCreateCommand;
import uidiagram.diagram.edit.commands.SimpleDialogCreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.edit.commands.TexFieldCreateCommand;
import uidiagram.diagram.edit.commands.TextInputCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupGroupLstWidgetsCompartment2ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstWidgetsCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Group_3022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Combo_3009 == req.getElementType()) {
			return getGEFWrapper(new Combo2CreateCommand(req));
		}
		if (UidiagramElementTypes.Group_3010 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3011 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (UidiagramElementTypes.MenuBar_3013 == req.getElementType()) {
			return getGEFWrapper(new MenuBarCreateCommand(req));
		}
		if (UidiagramElementTypes.BorderLayout_3014 == req.getElementType()) {
			return getGEFWrapper(new BorderLayoutCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3015 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3016 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3017 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (UidiagramElementTypes.TexField_3018 == req.getElementType()) {
			return getGEFWrapper(new TexFieldCreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3019 == req.getElementType()) {
			return getGEFWrapper(new CheckboxCreateCommand(req));
		}
		if (UidiagramElementTypes.AlertaDialog_3020 == req.getElementType()) {
			return getGEFWrapper(new AlertaDialogCreateCommand(req));
		}
		if (UidiagramElementTypes.SimpleDialog_3021 == req.getElementType()) {
			return getGEFWrapper(new SimpleDialogCreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3012 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
