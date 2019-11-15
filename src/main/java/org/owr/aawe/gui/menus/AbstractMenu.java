package org.owr.aawe.gui.menus;

import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.owr.aawe.Loc;

public abstract class AbstractMenu<M extends JComponent> {

	private ActionListener menuActionListener;
	protected M menuBar;

	public AbstractMenu(M menuBar, ActionListener menuActionListener) {
		this.menuActionListener = menuActionListener;
		this.menuBar = menuBar;
	}

	public M getMenu() {
		return menuBar;
	}

	protected JMenuItem createItem(MenuActions action) {
		JMenuItem menuItem = new JMenuItem(Loc.translate(action.getKey()));
		menuItem.setActionCommand(action.toString());
		menuItem.addActionListener(menuActionListener);
		return menuItem;
	}

	protected JMenu createMenu(MenuActions action, JMenuItem... items) {
		JMenu menu = new JMenu(Loc.translate(action.getKey()));
		menu.setActionCommand(action.toString());
		menu.addActionListener(menuActionListener);
		for (JMenuItem item : items) {
			item.addActionListener(menuActionListener);
			menu.add(item);
		}

		return menu;
	}

}
