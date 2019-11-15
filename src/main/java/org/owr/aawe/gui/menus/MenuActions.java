package org.owr.aawe.gui.menus;

import org.owr.aawe.ResKey;

public enum MenuActions {
	
	Open, Exit, Save, SaveAs, New, Export, ComponentsSearch, ComponentsCreateNew, ComponentsImport, About, ComponentsUsed; 

	public ResKey getKey() {
		return new ResKey("menu.item."+this.name());
	}
}
