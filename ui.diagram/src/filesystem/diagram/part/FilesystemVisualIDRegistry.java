/*
* 
*/
package filesystem.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import filesystem.FilesystemPackage;
import filesystem.Ui_Diagram;
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
import filesystem.diagram.edit.parts.UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FilesystemVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ui.diagram/debug/visualID"; //$NON-NLS-1$

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
		return filesystem.diagram.part.FilesystemVisualIDRegistry.getVisualID(view.getType());
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
				FilesystemDiagramEditorPlugin.getInstance()
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
		if (FilesystemPackage.eINSTANCE.getUi_Diagram().isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = filesystem.diagram.part.FilesystemVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"filesystem".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = filesystem.diagram.part.FilesystemVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Ui_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Ui_DiagramEditPart.VISUAL_ID:
			if (FilesystemPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID:
			if (FilesystemPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID:
			if (FilesystemPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (FilesystemPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterface2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = filesystem.diagram.part.FilesystemVisualIDRegistry.getModelID(containerView);
		if (!Ui_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"filesystem".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Ui_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = filesystem.diagram.part.FilesystemVisualIDRegistry.getVisualID(containerView);
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
			if (UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case UserInterface2EditPart.VISUAL_ID:
			if (UserInterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterface2EditPart.VISUAL_ID == nodeVisualID) {
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
		case UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID:
		case UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID:
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
		case LabelEditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case TextInputEditPart.VISUAL_ID:
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
			return filesystem.diagram.part.FilesystemVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return filesystem.diagram.part.FilesystemVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return filesystem.diagram.part.FilesystemVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return filesystem.diagram.part.FilesystemVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return filesystem.diagram.part.FilesystemVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return filesystem.diagram.part.FilesystemVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
