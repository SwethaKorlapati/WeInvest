package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BaseClass {

	static WebDriver driver;
	
	public static WebDriver driverInitiatlization()
	{
		System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chromeDriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void waitForLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static SoftAssert verify(WebDriver driver)
	{
		SoftAssert a = new SoftAssert();
		return a;
	}
	
	
	
	
	
}
