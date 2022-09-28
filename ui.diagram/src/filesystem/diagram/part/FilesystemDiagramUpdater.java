/*
* 
*/
package filesystem.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import filesystem.ModelElement;
import filesystem.Ui_Diagram;
import filesystem.UserInterface;
import filesystem.diagram.edit.parts.ButtonEditPart;
import filesystem.diagram.edit.parts.LabelEditPart;
import filesystem.diagram.edit.parts.TextInputEditPart;
import filesystem.diagram.edit.parts.Ui_DiagramEditPart;
import filesystem.diagram.edit.parts.UserInterface2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceEditPart;
import filesystem.diagram.edit.parts.UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart;
import filesystem.diagram.edit.parts.UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart;

/**
 * @generated
 */
public class FilesystemDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<FilesystemNodeDescriptor> getSemanticChildren(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000SemanticChildren(view);
		case UserInterfaceUserInterfaceLsWidgetsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLsWidgetsCompartment_7001SemanticChildren(view);
		case UserInterfaceUserInterfaceLsWidgetsCompartment2EditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLsWidgetsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FilesystemNodeDescriptor> getUi_Diagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Ui_Diagram modelElement = (Ui_Diagram) view.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDrives().iterator(); it.hasNext();) {
			UserInterface childElement = (UserInterface) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserInterfaceEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FilesystemNodeDescriptor> getUserInterfaceUserInterfaceLsWidgetsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLsWidgets().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FilesystemNodeDescriptor> getUserInterfaceUserInterfaceLsWidgetsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<FilesystemNodeDescriptor> result = new LinkedList<FilesystemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLsWidgets().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = FilesystemVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserInterface2EditPart.VISUAL_ID) {
				result.add(new FilesystemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<FilesystemLinkDescriptor> getContainedLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case Ui_DiagramEditPart.VISUAL_ID:
			return getUi_Diagram_1000ContainedLinks(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3001ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3002ContainedLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3003ContainedLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FilesystemLinkDescriptor> getIncomingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3001IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3002IncomingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3003IncomingLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<FilesystemLinkDescriptor> getOutgoingLinks(View view) {
		switch (FilesystemVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3001OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3002OutgoingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3003OutgoingLinks(view);
		case UserInterface2EditPart.VISUAL_ID:
			return getUserInterface_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUi_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getLabel_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getButton_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getTextInput_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getLabel_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getButton_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getTextInput_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getLabel_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getButton_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getTextInput_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FilesystemLinkDescriptor> getUserInterface_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<FilesystemNodeDescriptor> getSemanticChildren(View view) {
			return FilesystemDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<FilesystemLinkDescriptor> getContainedLinks(View view) {
			return FilesystemDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<FilesystemLinkDescriptor> getIncomingLinks(View view) {
			return FilesystemDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<FilesystemLinkDescriptor> getOutgoingLinks(View view) {
			return FilesystemDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
