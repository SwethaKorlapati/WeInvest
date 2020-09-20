package com.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

	static Properties props;
		
	//Read value of any property
	public static String getProperty(String key)
	{
		String filePath = System.getProperty("user.dir")+File.separator+"Properties"+File.separator+"config.properties";
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
