package org.owr.aawe.gui.menus;

import java.awt.event.ActionListener;

import javax.swing.JPopupMenu;

public class ContextMenu extends AbstractMenu<JPopupMenu> {

	public ContextMenu(ActionListener menuActionListener) {
		super(new JPopupMenu(), menuActionListener);
		menuBar.add(createItem(MenuActions.ComponentsSearch));

//		addMenuItem(MenuActions.ComponentsUsed)
		menuBar.add(createMenu(MenuActions.ComponentsUsed, createItem(MenuActions.ComponentsCreateNew)));
		menuBar.addSeparator();
		menuBar.add(createItem(MenuActions.ComponentsCreateNew));
		menuBar.addSeparator();
		menuBar.add(createItem(MenuActions.Export));

	}

//	private AbstractMenu<JMenu> subMenu() {
//		
//		
//		return new AbstractMenu<JMenu>(new JMenu(""), menuActionListener) {
//		};
//	}

}
