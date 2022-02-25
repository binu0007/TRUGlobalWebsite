package com.TRUGlobal.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverUtility 
{
	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitForElementVisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitAndClick(WebElement element) throws Throwable
	{
		int count=0;
		while(count<15)
		{
			try
			{
				element.click();
			}
			catch(Throwable e)
			{
				Thread.sleep(2000);
				count++;
			}
		}
	}
	public void select(WebElement element, int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void mouseOver(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	public void scrollToWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,)" + y+ ")", element);
	}
}
