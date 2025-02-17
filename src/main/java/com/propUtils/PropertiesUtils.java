package com.propUtils;


	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesUtils {
		
		
		public static String getProperty(String filepath,String key) throws IOException {
			FileInputStream fis;
			String base=System.getProperty("user.dir");
			System.out.println(base);
			fis =new FileInputStream(filepath);
			Properties prop=new Properties();
			prop.load(fis);
			String value=prop.getProperty(key);
			return value;
		
			
		}

	}



