package com.propUtils;

import java.io.IOException;

public class App {
	
	private static final String filepath="/src/main/resources/App.properties";
	
	public static  String getBrowserName() throws IOException{
		String base=System.getProperty("user.dir");	
		return PropertiesUtils.getProperty(base+filepath,"browser_name");
	}
	
	public static  String getUrl(String env) throws IOException{
		String base=System.getProperty("user.dir");	
		return PropertiesUtils.getProperty(base+filepath,env+".url");
	}
	 public static void main(String[] args) throws IOException {
		 getBrowserName(); 
		
	}
	

}
