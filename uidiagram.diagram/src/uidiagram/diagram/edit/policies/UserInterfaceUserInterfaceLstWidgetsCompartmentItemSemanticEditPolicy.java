/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AlertaDialog2CreateCommand;
import uidiagram.diagram.edit.commands.BorderLayout2CreateCommand;
import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox2CreateCommand;
import uidiagram.diagram.edit.commands.Column2CreateCommand;
import uidiagram.diagram.edit.commands.Column3CreateCommand;
import uidiagram.diagram.edit.commands.ComboCreateCommand;
import uidiagram.diagram.edit.commands.Group2CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.MenuBar2CreateCommand;
import uidiagram.diagram.edit.commands.SimpleDialog2CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.edit.commands.TexField2CreateCommand;
import uidiagram.diagram.edit.commands.TextInput2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstWidgetsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstWidgetsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Combo_3008 == req.getElementType()) {
			return getGEFWrapper(new ComboCreateCommand(req));
		}
		if (UidiagramElementTypes.Group_3022 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3023 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		if (UidiagramElementTypes.MenuBar_3025 == req.getElementType()) {
			return getGEFWrapper(new MenuBar2CreateCommand(req));
		}
		if (UidiagramElementTypes.BorderLayout_3026 == req.getElementType()) {
			return getGEFWrapper(new BorderLayout2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3001 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3002 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3003 == req.getElementType()) {
			return getGEFWrapper(new TextInput2CreateCommand(req));
		}
		if (UidiagramElementTypes.TexField_3004 == req.getElementType()) {
			return getGEFWrapper(new TexField2CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3005 == req.getElementType()) {
			return getGEFWrapper(new Checkbox2CreateCommand(req));
		}
		if (UidiagramElementTypes.AlertaDialog_3006 == req.getElementType()) {
			return getGEFWrapper(new AlertaDialog2CreateCommand(req));
		}
		if (UidiagramElementTypes.SimpleDialog_3007 == req.getElementType()) {
			return getGEFWrapper(new SimpleDialog2CreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3024 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
