package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	
	Properties pro;
	public ReadConfig() 
	{
		
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fil = new FileInputStream(src);
			pro = new Properties();
			try {
				pro.load(fil);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
							
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromepath()
	{
		String Chromepath=pro.getProperty("Chromepath");
		return Chromepath;
	}
	public String getIEpath()
	{
		String IEpath=pro.getProperty("IEpath");
		return IEpath;
	}
	
}
