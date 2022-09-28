/*
 * 
 */
package filesystem.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import filesystem.FilesystemPackage;
import filesystem.diagram.edit.parts.ButtonNameEditPart;
import filesystem.diagram.edit.parts.LabelNameEditPart;
import filesystem.diagram.edit.parts.TextInputNameEditPart;
import filesystem.diagram.edit.parts.UserInterfaceName2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceNameEditPart;
import filesystem.diagram.parsers.MessageFormatParser;
import filesystem.diagram.part.FilesystemVisualIDRegistry;

/**
 * @generated
 */
public class FilesystemParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceName_5005Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5005Parser() {
		if (userInterfaceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5005Parser = parser;
		}
		return userInterfaceName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5001Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5001Parser() {
		if (labelName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5001Parser = parser;
		}
		return labelName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5002Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5002Parser() {
		if (buttonName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5002Parser = parser;
		}
		return buttonName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5003Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5003Parser() {
		if (textInputName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5003Parser = parser;
		}
		return textInputName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser userInterfaceName_5004Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5004Parser() {
		if (userInterfaceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FilesystemPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5004Parser = parser;
		}
		return userInterfaceName_5004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5005Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5001Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5002Parser();
		case TextInputNameEditPart.VISUAL_ID:
			return getTextInputName_5003Parser();
		case UserInterfaceName2EditPart.VISUAL_ID:
			return getUserInterfaceName_5004Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FilesystemVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FilesystemVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FilesystemElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
