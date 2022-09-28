
/*
 * 
 */
package filesystem.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import filesystem.diagram.providers.FilesystemElementTypes;

/**
 * @generated
 */
public class FilesystemPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createLabel2CreationTool());
		paletteContainer.add(createTextInput3CreationTool());
		paletteContainer.add(createUserInterface4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, Collections.singletonList(FilesystemElementTypes.Button_3002));
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes.getImageDescriptor(FilesystemElementTypes.Button_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label2CreationTool_title,
				Messages.Label2CreationTool_desc, Collections.singletonList(FilesystemElementTypes.Label_3001));
		entry.setId("createLabel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes.getImageDescriptor(FilesystemElementTypes.Label_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput3CreationTool_title,
				Messages.TextInput3CreationTool_desc, Collections.singletonList(FilesystemElementTypes.TextInput_3003));
		entry.setId("createTextInput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes.getImageDescriptor(FilesystemElementTypes.TextInput_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FilesystemElementTypes.UserInterface_2001);
		types.add(FilesystemElementTypes.UserInterface_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface4CreationTool_title,
				Messages.UserInterface4CreationTool_desc, types);
		entry.setId("createUserInterface4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FilesystemElementTypes.getImageDescriptor(FilesystemElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
