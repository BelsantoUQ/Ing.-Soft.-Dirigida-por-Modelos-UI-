/*
* 
*/
package filesystem.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import filesystem.diagram.edit.parts.ButtonEditPart;
import filesystem.diagram.edit.parts.ButtonNameEditPart;
import filesystem.diagram.edit.parts.LabelEditPart;
import filesystem.diagram.edit.parts.LabelNameEditPart;
import filesystem.diagram.edit.parts.TextInputEditPart;
import filesystem.diagram.edit.parts.TextInputNameEditPart;
import filesystem.diagram.edit.parts.Ui_DiagramEditPart;
import filesystem.diagram.edit.parts.UserInterface2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceEditPart;
import filesystem.diagram.edit.parts.UserInterfaceName2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceNameEditPart;
import filesystem.diagram.part.FilesystemDiagramEditorPlugin;
import filesystem.diagram.part.FilesystemVisualIDRegistry;
import filesystem.diagram.providers.FilesystemElementTypes;
import filesystem.diagram.providers.FilesystemParserProvider;

/**
 * @generated
 */
public class FilesystemNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		FilesystemDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		FilesystemDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FilesystemNavigatorItem && !isOwnView(((FilesystemNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof FilesystemNavigatorGroup) {
			FilesystemNavigatorGroup group = (FilesystemNavigatorGroup) element;
			return FilesystemDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof FilesystemNavigatorItem) {
			FilesystemNavigatorItem navigatorItem = (FilesystemNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?filesystem?Ui_Diagram", FilesystemElementTypes.Ui_Diagram_1000); //$NON-NLS-1$
		case UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?filesystem?UserInterface", //$NON-NLS-1$
					FilesystemElementTypes.UserInterface_2001);
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?filesystem?Label", FilesystemElementTypes.Label_3001); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?filesystem?Button", FilesystemElementTypes.Button_3002); //$NON-NLS-1$
		case TextInputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?filesystem?TextInput", FilesystemElementTypes.TextInput_3003); //$NON-NLS-1$
		case UserInterface2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?filesystem?UserInterface", FilesystemElementTypes.UserInterface_3004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FilesystemDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && FilesystemElementTypes.isKnownElementType(elementType)) {
			image = FilesystemElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof FilesystemNavigatorGroup) {
			FilesystemNavigatorGroup group = (FilesystemNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FilesystemNavigatorItem) {
			FilesystemNavigatorItem navigatorItem = (FilesystemNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000Text(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3001Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3002Text(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3003Text(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUi_Diagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = FilesystemParserProvider.getParser(FilesystemElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				FilesystemVisualIDRegistry.getType(UserInterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FilesystemDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3001Text(View view) {
		IParser parser = FilesystemParserProvider.getParser(FilesystemElementTypes.Label_3001,
				view.getElement() != null ? view.getElement() : view,
				FilesystemVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FilesystemDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3002Text(View view) {
		IParser parser = FilesystemParserProvider.getParser(FilesystemElementTypes.Button_3002,
				view.getElement() != null ? view.getElement() : view,
				FilesystemVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FilesystemDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3003Text(View view) {
		IParser parser = FilesystemParserProvider.getParser(FilesystemElementTypes.TextInput_3003,
				view.getElement() != null ? view.getElement() : view,
				FilesystemVisualIDRegistry.getType(TextInputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FilesystemDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_3004Text(View view) {
		IParser parser = FilesystemParserProvider.getParser(FilesystemElementTypes.UserInterface_3004,
				view.getElement() != null ? view.getElement() : view,
				FilesystemVisualIDRegistry.getType(UserInterfaceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FilesystemDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return Ui_DiagramEditPart.MODEL_ID.equals(FilesystemVisualIDRegistry.getModelID(view));
	}

}
