
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

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
		paletteContainer.add(createAlertaDialog1CreationTool());
		paletteContainer.add(createBorderLayout2CreationTool());
		paletteContainer.add(createButton3CreationTool());
		paletteContainer.add(createCheckbox4CreationTool());
		paletteContainer.add(createColumn5CreationTool());
		paletteContainer.add(createCombo6CreationTool());
		paletteContainer.add(createGroup7CreationTool());
		paletteContainer.add(createLabel8CreationTool());
		paletteContainer.add(createMenuBar9CreationTool());
		paletteContainer.add(createSimpleDialog10CreationTool());
		paletteContainer.add(createTable11CreationTool());
		paletteContainer.add(createTexField12CreationTool());
		paletteContainer.add(createTextInput13CreationTool());
		paletteContainer.add(createUserInterface14CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlertaDialog1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.AlertaDialog_3020);
		types.add(UidiagramElementTypes.AlertaDialog_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AlertaDialog1CreationTool_title,
				Messages.AlertaDialog1CreationTool_desc, types);
		entry.setId("createAlertaDialog1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.AlertaDialog_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBorderLayout2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.BorderLayout_3014);
		types.add(UidiagramElementTypes.BorderLayout_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BorderLayout2CreationTool_title,
				Messages.BorderLayout2CreationTool_desc, types);
		entry.setId("createBorderLayout2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.BorderLayout_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3016);
		types.add(UidiagramElementTypes.Button_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button3CreationTool_title,
				Messages.Button3CreationTool_desc, types);
		entry.setId("createButton3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckbox4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Checkbox_3019);
		types.add(UidiagramElementTypes.Checkbox_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Checkbox4CreationTool_title,
				Messages.Checkbox4CreationTool_desc, types);
		entry.setId("createCheckbox4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Checkbox_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Column_3012);
		types.add(UidiagramElementTypes.Column_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column5CreationTool_title,
				Messages.Column5CreationTool_desc, types);
		entry.setId("createColumn5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCombo6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Combo_3008);
		types.add(UidiagramElementTypes.Combo_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Combo6CreationTool_title,
				Messages.Combo6CreationTool_desc, types);
		entry.setId("createCombo6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Combo_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Group_3010);
		types.add(UidiagramElementTypes.Group_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group7CreationTool_title,
				Messages.Group7CreationTool_desc, types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Group_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3015);
		types.add(UidiagramElementTypes.Label_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label8CreationTool_title,
				Messages.Label8CreationTool_desc, types);
		entry.setId("createLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMenuBar9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.MenuBar_3013);
		types.add(UidiagramElementTypes.MenuBar_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MenuBar9CreationTool_title,
				Messages.MenuBar9CreationTool_desc, types);
		entry.setId("createMenuBar9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.MenuBar_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleDialog10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.SimpleDialog_3021);
		types.add(UidiagramElementTypes.SimpleDialog_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleDialog10CreationTool_title,
				Messages.SimpleDialog10CreationTool_desc, types);
		entry.setId("createSimpleDialog10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.SimpleDialog_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Table_3011);
		types.add(UidiagramElementTypes.Table_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table11CreationTool_title,
				Messages.Table11CreationTool_desc, types);
		entry.setId("createTable11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTexField12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TexField_3018);
		types.add(UidiagramElementTypes.TexField_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TexField12CreationTool_title,
				Messages.TexField12CreationTool_desc, types);
		entry.setId("createTexField12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TexField_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TextInput_3017);
		types.add(UidiagramElementTypes.TextInput_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput13CreationTool_title,
				Messages.TextInput13CreationTool_desc, types);
		entry.setId("createTextInput13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TextInput_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface14CreationTool_title,
				Messages.UserInterface14CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
