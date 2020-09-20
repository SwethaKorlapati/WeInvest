package com.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

	static Properties props;
	static String filePath = "C:\\Users\\nagaswetha.korlapati\\Desktop\\Workspace\\WeInvest_Assignment\\src\\main\\java\\com\\config\\config.properties";
	
	//Read value of any property
	public static String getProperty(String key)
	{
		return getProperties(filePath).getProperty(key);
	}
	
	//Get properties file
	public static Properties getProperties(String path)
	{
		try
		{
		BufferedReader r = new BufferedReader(new FileReader(path));
		props = new Properties();
		props.load(r);
		r.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return props;
		
	}
	
	
	
	
	
	
	
	
}
