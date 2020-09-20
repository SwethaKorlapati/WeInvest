package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuggestionsPage {

	public static WebElement spdrValue(WebDriver driver)
	{
		return driver.findElement(By.xpath("(((//div[contains(@class,'col-xs-3')])[7])/span)[1]"));
	}
}
