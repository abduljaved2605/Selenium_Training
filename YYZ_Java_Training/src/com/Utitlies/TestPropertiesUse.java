package com.Utitlies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesUse {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src\\com\\Utitlies\\Application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser =prop.getProperty("Browser");
		String URL =prop.getProperty("URL");
		
		System.out.println("*******   "+browser);
		System.out.println("*******   "+URL);
		
	}
}
