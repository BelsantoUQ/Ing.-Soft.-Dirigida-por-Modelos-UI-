/*
* 
*/
package filesystem.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import filesystem.diagram.edit.commands.ButtonCreateCommand;
import filesystem.diagram.edit.commands.LabelCreateCommand;
import filesystem.diagram.edit.commands.TextInputCreateCommand;
import filesystem.diagram.edit.commands.UserInterface2CreateCommand;
import filesystem.diagram.providers.FilesystemElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLsWidgetsCompartment2ItemSemanticEditPolicy
		extends FilesystemBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLsWidgetsCompartment2ItemSemanticEditPolicy() {
		super(FilesystemElementTypes.UserInterface_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FilesystemElementTypes.Label_3001 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (FilesystemElementTypes.Button_3002 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (FilesystemElementTypes.TextInput_3003 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (FilesystemElementTypes.UserInterface_3004 == req.getElementType()) {
			return getGEFWrapper(new UserInterface2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
