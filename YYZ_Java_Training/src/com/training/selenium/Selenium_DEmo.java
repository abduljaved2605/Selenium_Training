package com.training.selenium;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Selenium_DEmo {
	WebDriver driver;
	
		
	
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\com\\src\\main\\resources\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();



    
	
	}
	
	@Test
	public void verify()
	{
		driver.getTitle();
		System.out.println("Title of the browser"+driver.getTitle());
	}
	
	@Test
	public void close()
	{
		driver.close();
	}
	
	
		}

