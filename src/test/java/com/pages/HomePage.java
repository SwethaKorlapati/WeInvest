package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement exploreInvestmentIdeas(WebDriver driver)
	{
		return driver.findElement(By.id("btn-explore79"));
		
	}
	
}
