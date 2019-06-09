package com.CapsuleApplication.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile 
{
	public  static Properties properties;
	
	private static String Properties_File_Path="C:\\Users\\User\\eclipse-workspace\\CapsuleApplication\\src\\main\\java\\com\\CapsuleApplication\\ConfigFile\\properties.properties";
	
	public static String fetchProperties(String key) throws Exception
	{
			FileInputStream f = new FileInputStream(Properties_File_Path);
			Properties properties=new Properties();
			properties.load(f);
			return properties.getProperty(key);
	}
}
