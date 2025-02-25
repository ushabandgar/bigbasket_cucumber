package com.propUtils;

import java.io.IOException;

public class App {

	private static final String filepath = "/src/main/resources/App.properties";

	private static final String base = System.getProperty("user.dir");

	public static String getBrowserName() throws IOException {

		return PropertiesUtils.getProperty(base + filepath, "browser_name");
	}

	public static String getUrl(String env) throws IOException {

		return PropertiesUtils.getProperty(base + filepath, env + ".url");
	}

	public static boolean isOnGrid(){

		try {
			return Boolean.parseBoolean(PropertiesUtils.getProperty(base + filepath, "isOnGrid"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static void main(String[] args) throws IOException {
		getBrowserName();

	}

}
