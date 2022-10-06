/*
 * 
 */
package uidiagram.diagram.providers;

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

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AlertaDialog2EditPart;
import uidiagram.diagram.edit.parts.AlertaDialogEditPart;
import uidiagram.diagram.edit.parts.BorderLayout2EditPart;
import uidiagram.diagram.edit.parts.BorderLayoutEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.Checkbox2EditPart;
import uidiagram.diagram.edit.parts.CheckboxEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.Column3EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.Combo2EditPart;
import uidiagram.diagram.edit.parts.ComboEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.MenuBar2EditPart;
import uidiagram.diagram.edit.parts.MenuBarEditPart;
import uidiagram.diagram.edit.parts.SimpleDialog2EditPart;
import uidiagram.diagram.edit.parts.SimpleDialogEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TexField2EditPart;
import uidiagram.diagram.edit.parts.TexFieldEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.Ui_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	public static IElementType Column_3027;

	/**
	* @generated
	*/
	public static final IElementType Ui_Diagram_1000 = getElementType("uidiagram.diagram.Ui_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("uidiagram.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Combo_3008 = getElementType("uidiagram.diagram.Combo_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Combo_3009 = getElementType("uidiagram.diagram.Combo_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3010 = getElementType("uidiagram.diagram.Group_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3011 = getElementType("uidiagram.diagram.Table_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3012 = getElementType("uidiagram.diagram.Column_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MenuBar_3013 = getElementType("uidiagram.diagram.MenuBar_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BorderLayout_3014 = getElementType("uidiagram.diagram.BorderLayout_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3015 = getElementType("uidiagram.diagram.Label_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3016 = getElementType("uidiagram.diagram.Button_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3017 = getElementType("uidiagram.diagram.TextInput_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TexField_3018 = getElementType("uidiagram.diagram.TexField_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3019 = getElementType("uidiagram.diagram.Checkbox_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AlertaDialog_3020 = getElementType("uidiagram.diagram.AlertaDialog_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleDialog_3021 = getElementType("uidiagram.diagram.SimpleDialog_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3022 = getElementType("uidiagram.diagram.Group_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3023 = getElementType("uidiagram.diagram.Table_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3024 = getElementType("uidiagram.diagram.Column_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MenuBar_3025 = getElementType("uidiagram.diagram.MenuBar_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BorderLayout_3026 = getElementType("uidiagram.diagram.BorderLayout_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3001 = getElementType("uidiagram.diagram.Label_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3002 = getElementType("uidiagram.diagram.Button_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3003 = getElementType("uidiagram.diagram.TextInput_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TexField_3004 = getElementType("uidiagram.diagram.TexField_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3005 = getElementType("uidiagram.diagram.Checkbox_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AlertaDialog_3006 = getElementType("uidiagram.diagram.AlertaDialog_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleDialog_3007 = getElementType("uidiagram.diagram.SimpleDialog_3007"); //$NON-NLS-1$

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

			elements.put(Ui_Diagram_1000, UidiagramPackage.eINSTANCE.getUi_Diagram());

			elements.put(UserInterface_2001, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(Combo_3008, UidiagramPackage.eINSTANCE.getCombo());

			elements.put(Combo_3009, UidiagramPackage.eINSTANCE.getCombo());

			elements.put(Group_3010, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Table_3011, UidiagramPackage.eINSTANCE.getTable());

			elements.put(MenuBar_3013, UidiagramPackage.eINSTANCE.getMenuBar());

			elements.put(BorderLayout_3014, UidiagramPackage.eINSTANCE.getBorderLayout());

			elements.put(Label_3015, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Button_3016, UidiagramPackage.eINSTANCE.getButton());

			elements.put(TextInput_3017, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(TexField_3018, UidiagramPackage.eINSTANCE.getTexField());

			elements.put(Checkbox_3019, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(AlertaDialog_3020, UidiagramPackage.eINSTANCE.getAlertaDialog());

			elements.put(SimpleDialog_3021, UidiagramPackage.eINSTANCE.getSimpleDialog());

			elements.put(Column_3012, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(Group_3022, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Table_3023, UidiagramPackage.eINSTANCE.getTable());

			elements.put(MenuBar_3025, UidiagramPackage.eINSTANCE.getMenuBar());

			elements.put(BorderLayout_3026, UidiagramPackage.eINSTANCE.getBorderLayout());

			elements.put(Label_3001, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Button_3002, UidiagramPackage.eINSTANCE.getButton());

			elements.put(TextInput_3003, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(TexField_3004, UidiagramPackage.eINSTANCE.getTexField());

			elements.put(Checkbox_3005, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(AlertaDialog_3006, UidiagramPackage.eINSTANCE.getAlertaDialog());

			elements.put(SimpleDialog_3007, UidiagramPackage.eINSTANCE.getSimpleDialog());

			elements.put(Column_3024, UidiagramPackage.eINSTANCE.getColumn());
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
			KNOWN_ELEMENT_TYPES.add(Combo_3008);
			KNOWN_ELEMENT_TYPES.add(Combo_3009);
			KNOWN_ELEMENT_TYPES.add(Group_3010);
			KNOWN_ELEMENT_TYPES.add(Table_3011);
			KNOWN_ELEMENT_TYPES.add(MenuBar_3013);
			KNOWN_ELEMENT_TYPES.add(BorderLayout_3014);
			KNOWN_ELEMENT_TYPES.add(Label_3015);
			KNOWN_ELEMENT_TYPES.add(Button_3016);
			KNOWN_ELEMENT_TYPES.add(TextInput_3017);
			KNOWN_ELEMENT_TYPES.add(TexField_3018);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3019);
			KNOWN_ELEMENT_TYPES.add(AlertaDialog_3020);
			KNOWN_ELEMENT_TYPES.add(SimpleDialog_3021);
			KNOWN_ELEMENT_TYPES.add(Column_3012);
			KNOWN_ELEMENT_TYPES.add(Group_3022);
			KNOWN_ELEMENT_TYPES.add(Table_3023);
			KNOWN_ELEMENT_TYPES.add(MenuBar_3025);
			KNOWN_ELEMENT_TYPES.add(BorderLayout_3026);
			KNOWN_ELEMENT_TYPES.add(Label_3001);
			KNOWN_ELEMENT_TYPES.add(Button_3002);
			KNOWN_ELEMENT_TYPES.add(TextInput_3003);
			KNOWN_ELEMENT_TYPES.add(TexField_3004);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3005);
			KNOWN_ELEMENT_TYPES.add(AlertaDialog_3006);
			KNOWN_ELEMENT_TYPES.add(SimpleDialog_3007);
			KNOWN_ELEMENT_TYPES.add(Column_3024);
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
		case ComboEditPart.VISUAL_ID:
			return Combo_3008;
		case Combo2EditPart.VISUAL_ID:
			return Combo_3009;
		case GroupEditPart.VISUAL_ID:
			return Group_3010;
		case TableEditPart.VISUAL_ID:
			return Table_3011;
		case MenuBarEditPart.VISUAL_ID:
			return MenuBar_3013;
		case BorderLayoutEditPart.VISUAL_ID:
			return BorderLayout_3014;
		case LabelEditPart.VISUAL_ID:
			return Label_3015;
		case ButtonEditPart.VISUAL_ID:
			return Button_3016;
		case TextInputEditPart.VISUAL_ID:
			return TextInput_3017;
		case TexFieldEditPart.VISUAL_ID:
			return TexField_3018;
		case CheckboxEditPart.VISUAL_ID:
			return Checkbox_3019;
		case AlertaDialogEditPart.VISUAL_ID:
			return AlertaDialog_3020;
		case SimpleDialogEditPart.VISUAL_ID:
			return SimpleDialog_3021;
		case ColumnEditPart.VISUAL_ID:
			return Column_3012;
		case Group2EditPart.VISUAL_ID:
			return Group_3022;
		case Table2EditPart.VISUAL_ID:
			return Table_3023;
		case MenuBar2EditPart.VISUAL_ID:
			return MenuBar_3025;
		case BorderLayout2EditPart.VISUAL_ID:
			return BorderLayout_3026;
		case Label2EditPart.VISUAL_ID:
			return Label_3001;
		case Button2EditPart.VISUAL_ID:
			return Button_3002;
		case TextInput2EditPart.VISUAL_ID:
			return TextInput_3003;
		case TexField2EditPart.VISUAL_ID:
			return TexField_3004;
		case Checkbox2EditPart.VISUAL_ID:
			return Checkbox_3005;
		case AlertaDialog2EditPart.VISUAL_ID:
			return AlertaDialog_3006;
		case SimpleDialog2EditPart.VISUAL_ID:
			return SimpleDialog_3007;
		case Column2EditPart.VISUAL_ID:
			return Column_3024;
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
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
