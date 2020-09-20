package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeatherPortfolioPage {

	public static WebElement customizePortfolio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//a[text()='Customize Portfolio'])[1]"));
	}
}
