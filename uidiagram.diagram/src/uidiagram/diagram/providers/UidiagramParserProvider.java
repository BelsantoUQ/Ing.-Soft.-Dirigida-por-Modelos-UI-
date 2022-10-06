/*
 * 
 */
package uidiagram.diagram.providers;

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

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AlertaDialogName2EditPart;
import uidiagram.diagram.edit.parts.AlertaDialogNameEditPart;
import uidiagram.diagram.edit.parts.BorderLayoutName2EditPart;
import uidiagram.diagram.edit.parts.BorderLayoutNameEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckboxName2EditPart;
import uidiagram.diagram.edit.parts.CheckboxNameEditPart;
import uidiagram.diagram.edit.parts.ColumnName2EditPart;
import uidiagram.diagram.edit.parts.ColumnName3EditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboName2EditPart;
import uidiagram.diagram.edit.parts.ComboNameEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.MenuBarName2EditPart;
import uidiagram.diagram.edit.parts.MenuBarNameEditPart;
import uidiagram.diagram.edit.parts.SimpleDialogName2EditPart;
import uidiagram.diagram.edit.parts.SimpleDialogNameEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.TexFieldName2EditPart;
import uidiagram.diagram.edit.parts.TexFieldNameEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceName_5008Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5008Parser() {
		if (userInterfaceName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getUserInterface_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5008Parser = parser;
		}
		return userInterfaceName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser comboName_5022Parser;

	/**
	* @generated
	*/
	private IParser getComboName_5022Parser() {
		if (comboName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboName_5022Parser = parser;
		}
		return comboName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser comboName_5021Parser;

	/**
	* @generated
	*/
	private IParser getComboName_5021Parser() {
		if (comboName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboName_5021Parser = parser;
		}
		return comboName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5020Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5020Parser() {
		if (groupName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5020Parser = parser;
		}
		return groupName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5019Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5019Parser() {
		if (tableName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5019Parser = parser;
		}
		return tableName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5018Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5018Parser() {
		if (columnName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5018Parser = parser;
		}
		return columnName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser menuBarName_5017Parser;

	/**
	* @generated
	*/
	private IParser getMenuBarName_5017Parser() {
		if (menuBarName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuBarName_5017Parser = parser;
		}
		return menuBarName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser borderLayoutName_5016Parser;

	/**
	* @generated
	*/
	private IParser getBorderLayoutName_5016Parser() {
		if (borderLayoutName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			borderLayoutName_5016Parser = parser;
		}
		return borderLayoutName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5009Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5009Parser() {
		if (labelName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5009Parser = parser;
		}
		return labelName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5010Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5010Parser() {
		if (buttonName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5010Parser = parser;
		}
		return buttonName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5011Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5011Parser() {
		if (textInputName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5011Parser = parser;
		}
		return textInputName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser texFieldName_5012Parser;

	/**
	* @generated
	*/
	private IParser getTexFieldName_5012Parser() {
		if (texFieldName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			texFieldName_5012Parser = parser;
		}
		return texFieldName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5013Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5013Parser() {
		if (checkboxName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5013Parser = parser;
		}
		return checkboxName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser alertaDialogName_5014Parser;

	/**
	* @generated
	*/
	private IParser getAlertaDialogName_5014Parser() {
		if (alertaDialogName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			alertaDialogName_5014Parser = parser;
		}
		return alertaDialogName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleDialogName_5015Parser;

	/**
	* @generated
	*/
	private IParser getSimpleDialogName_5015Parser() {
		if (simpleDialogName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleDialogName_5015Parser = parser;
		}
		return simpleDialogName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5023Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5023Parser() {
		if (groupName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5023Parser = parser;
		}
		return groupName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5024Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5024Parser() {
		if (tableName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5024Parser = parser;
		}
		return tableName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5025Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5025Parser() {
		if (columnName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5025Parser = parser;
		}
		return columnName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser menuBarName_5026Parser;

	/**
	* @generated
	*/
	private IParser getMenuBarName_5026Parser() {
		if (menuBarName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuBarName_5026Parser = parser;
		}
		return menuBarName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser borderLayoutName_5027Parser;

	/**
	* @generated
	*/
	private IParser getBorderLayoutName_5027Parser() {
		if (borderLayoutName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			borderLayoutName_5027Parser = parser;
		}
		return borderLayoutName_5027Parser;
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
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
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
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
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
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5003Parser = parser;
		}
		return textInputName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser texFieldName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTexFieldName_5004Parser() {
		if (texFieldName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			texFieldName_5004Parser = parser;
		}
		return texFieldName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5005Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5005Parser() {
		if (checkboxName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5005Parser = parser;
		}
		return checkboxName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser alertaDialogName_5006Parser;

	/**
	* @generated
	*/
	private IParser getAlertaDialogName_5006Parser() {
		if (alertaDialogName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			alertaDialogName_5006Parser = parser;
		}
		return alertaDialogName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleDialogName_5007Parser;

	/**
	* @generated
	*/
	private IParser getSimpleDialogName_5007Parser() {
		if (simpleDialogName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleDialogName_5007Parser = parser;
		}
		return simpleDialogName_5007Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5008Parser();
		case ComboNameEditPart.VISUAL_ID:
			return getComboName_5022Parser();
		case ComboName2EditPart.VISUAL_ID:
			return getComboName_5021Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5020Parser();
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5019Parser();
		case MenuBarNameEditPart.VISUAL_ID:
			return getMenuBarName_5017Parser();
		case BorderLayoutNameEditPart.VISUAL_ID:
			return getBorderLayoutName_5016Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5009Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5010Parser();
		case TextInputNameEditPart.VISUAL_ID:
			return getTextInputName_5011Parser();
		case TexFieldNameEditPart.VISUAL_ID:
			return getTexFieldName_5012Parser();
		case CheckboxNameEditPart.VISUAL_ID:
			return getCheckboxName_5013Parser();
		case AlertaDialogNameEditPart.VISUAL_ID:
			return getAlertaDialogName_5014Parser();
		case SimpleDialogNameEditPart.VISUAL_ID:
			return getSimpleDialogName_5015Parser();
		case ColumnNameEditPart.VISUAL_ID:
			return getColumnName_5018Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5023Parser();
		case TableName2EditPart.VISUAL_ID:
			return getTableName_5024Parser();
		case MenuBarName2EditPart.VISUAL_ID:
			return getMenuBarName_5026Parser();
		case BorderLayoutName2EditPart.VISUAL_ID:
			return getBorderLayoutName_5027Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5001Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5002Parser();
		case TextInputName2EditPart.VISUAL_ID:
			return getTextInputName_5003Parser();
		case TexFieldName2EditPart.VISUAL_ID:
			return getTexFieldName_5004Parser();
		case CheckboxName2EditPart.VISUAL_ID:
			return getCheckboxName_5005Parser();
		case AlertaDialogName2EditPart.VISUAL_ID:
			return getAlertaDialogName_5006Parser();
		case SimpleDialogName2EditPart.VISUAL_ID:
			return getSimpleDialogName_5007Parser();
		case ColumnName2EditPart.VISUAL_ID:
			return getColumnName_5025Parser();
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
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
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
