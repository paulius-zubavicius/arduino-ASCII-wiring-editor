package org.owr.aawe.gui.menus;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import org.owr.aawe.Loc;

public class MainMenuBar extends AbstractMenu<JMenuBar> {

	public MainMenuBar(ActionListener menuActionListener) {
		super(new JMenuBar(), menuActionListener);

		URL url = ClassLoader.getSystemClassLoader().getResource("img/menu/menu.png");

		menuBar.add(projectMenu());
		menuBar.add(componentsMenu());
		menuBar.add(aboutMenu());
	}

	private JMenu aboutMenu() {
		JMenu menu = new JMenu("About");
		menu.add(createItem(MenuActions.About));
		return menu;
	}

	private JMenu componentsMenu() {
		JMenu menu = new JMenu("Components");

		menu.add(createItem(MenuActions.ComponentsSearch));
		menu.addSeparator();
		menu.add(createItem(MenuActions.ComponentsCreateNew));
		menu.addSeparator();
		menu.add(createItem(MenuActions.ComponentsImport));

		return menu;
	}

	private JMenu projectMenu() {
		JMenu menu = new JMenu("Project");

		menu.add(createItem(MenuActions.New));
		menu.add(createItem(MenuActions.Open));
		menu.addSeparator();
		menu.add(createItem(MenuActions.Save));
		menu.add(createItem(MenuActions.SaveAs));
		menu.addSeparator();
		menu.add(createItem(MenuActions.Export));
		menu.addSeparator();
		menu.add(createItem(MenuActions.Exit));

		return menu;
	}

//	// Build the first menu.
//	JMenu menu = new JMenu("Project");
//	menu.setMnemonic(KeyEvent.VK_A);
//	menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
//	add(menu);
//
//	// a group of JMenuItems
//	JMenuItem menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
//	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
//	menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
//	menu.add(menuItem);
//
//	menuItem = new JMenuItem("Both text and icon", new ImageIcon(url));
//	menuItem.setMnemonic(KeyEvent.VK_B);
//	menu.add(menuItem);
//
//	menuItem = new JMenuItem(new ImageIcon(url));
//	menuItem.setMnemonic(KeyEvent.VK_D);
//	menu.add(menuItem);
//
//	// a group of radio button menu items
//	menu.addSeparator();
//	ButtonGroup group = new ButtonGroup();
//	JRadioButtonMenuItem rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
//	rbMenuItem.setSelected(true);
//	rbMenuItem.setMnemonic(KeyEvent.VK_R);
//	group.add(rbMenuItem);
//	menu.add(rbMenuItem);
//
//	rbMenuItem = new JRadioButtonMenuItem("Another one");
//	rbMenuItem.setMnemonic(KeyEvent.VK_O);
//	group.add(rbMenuItem);
//	menu.add(rbMenuItem);
//
//	// a group of check box menu items
//	menu.addSeparator();
//	JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
//	cbMenuItem.setMnemonic(KeyEvent.VK_C);
//	menu.add(cbMenuItem);
//
//	cbMenuItem = new JCheckBoxMenuItem("Another one");
//	cbMenuItem.setMnemonic(KeyEvent.VK_H);
//	menu.add(cbMenuItem);
//
//	// a submenu
//	menu.addSeparator();
//	JMenu submenu = new JMenu("A submenu");
//	submenu.setMnemonic(KeyEvent.VK_S);
//
//	menuItem = new JMenuItem("An item in the submenu");
//	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
//	submenu.add(menuItem);
//
//	menuItem = new JMenuItem("Another item");
//	submenu.add(menuItem);
//	menu.add(submenu);
//
//	// Build second menu in the menu bar.
//	menu = new JMenu("Another Menu");
//	menu.setMnemonic(KeyEvent.VK_N);
//	menu.getAccessibleContext().setAccessibleDescription("This menu does nothing");
//	menu.addActionListener(e -> System.exit(0));
//	add(menu);

}
