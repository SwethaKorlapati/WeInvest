package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplorePortfolioPage {

	public static WebElement customise(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//a[text()='Customise'])"));
	}
	
	public static WebElement slider(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[@class='col-md-9']/input)[1]"));
	}
	
	public static WebElement reBalance(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[text() = 'Rebalance']"));
	}
	
	public static WebElement investNow(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[text() = 'Invest Now']"));
	}
	
	public static WebElement reset(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[text()='Reset']"));
	}
	
	public static WebElement addStock(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//a[text()='+ Add Stock'])[1]"));
	}
	
	public static WebElement btAddStock(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[text()='Add Stock'][@data-isin='BT'])[1]"));
	}
	
	public static WebElement done(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
	}
	
	public static WebElement checkBTPortfolio(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//a[text()='BT Group plc'])[2]"));
	}
}
