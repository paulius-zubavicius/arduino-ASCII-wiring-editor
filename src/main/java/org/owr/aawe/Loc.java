package org.owr.aawe;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Loc {

	private static ResourceBundle prop;

	private static final String RES_BASE_NAME = "translations/lang";

	static {
		prop = ResourceBundle.getBundle(RES_BASE_NAME, Locale.getDefault());
	}

	public static String translate(ResKey key) {
		return translate(key, "???" + key + "???");
	}

	public static String translate(ResKey key, String defaultVal) {
		try {
			return prop.getString(key.getKey());
		} catch (MissingResourceException e) {
			return defaultVal;
		}
	}

}
