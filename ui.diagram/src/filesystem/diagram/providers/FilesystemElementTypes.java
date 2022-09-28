/*
 * 
 */
package filesystem.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import filesystem.FilesystemPackage;
import filesystem.diagram.edit.parts.ButtonEditPart;
import filesystem.diagram.edit.parts.LabelEditPart;
import filesystem.diagram.edit.parts.TextInputEditPart;
import filesystem.diagram.edit.parts.Ui_DiagramEditPart;
import filesystem.diagram.edit.parts.UserInterface2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceEditPart;
import filesystem.diagram.part.FilesystemDiagramEditorPlugin;

/**
 * @generated
 */
public class FilesystemElementTypes {

	/**
	* @generated
	*/
	private FilesystemElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FilesystemDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Ui_Diagram_1000 = getElementType("ui.diagram.Ui_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("ui.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3001 = getElementType("ui.diagram.Label_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3002 = getElementType("ui.diagram.Button_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3003 = getElementType("ui.diagram.TextInput_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_3004 = getElementType("ui.diagram.UserInterface_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Ui_Diagram_1000, FilesystemPackage.eINSTANCE.getUi_Diagram());

			elements.put(UserInterface_2001, FilesystemPackage.eINSTANCE.getUserInterface());

			elements.put(Label_3001, FilesystemPackage.eINSTANCE.getLabel());

			elements.put(Button_3002, FilesystemPackage.eINSTANCE.getButton());

			elements.put(TextInput_3003, FilesystemPackage.eINSTANCE.getTextInput());

			elements.put(UserInterface_3004, FilesystemPackage.eINSTANCE.getUserInterface());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Ui_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Label_3001);
			KNOWN_ELEMENT_TYPES.add(Button_3002);
			KNOWN_ELEMENT_TYPES.add(TextInput_3003);
			KNOWN_ELEMENT_TYPES.add(UserInterface_3004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return Ui_Diagram_1000;
		case UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case LabelEditPart.VISUAL_ID:
			return Label_3001;
		case ButtonEditPart.VISUAL_ID:
			return Button_3002;
		case TextInputEditPart.VISUAL_ID:
			return TextInput_3003;
		case UserInterface2EditPart.VISUAL_ID:
			return UserInterface_3004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return filesystem.diagram.providers.FilesystemElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return filesystem.diagram.providers.FilesystemElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return filesystem.diagram.providers.FilesystemElementTypes.getElement(elementTypeAdapter);
		}
	};

}
