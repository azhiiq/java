package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Selenium\\Maven_project\\src\\main\\java\\com\\properties\\Configuration.properties");
		
		FileInputStream fil =  new FileInputStream(f);
		p = new Properties();
		p.load(fil);
		
	}
	
	
	public String geturl() {
		
		String url = p.getProperty("geturl");
		
		return url;
		}
	
	
public String username() {
		
		String url = p.getProperty("username");
		
		return url;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
