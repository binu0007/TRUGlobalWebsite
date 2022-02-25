package com.TRUGlobal.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage 
{
	WebDriver driver;
	public InsightsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Insights")
	private WebElement InsightsLink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getInsightsLink() {
		return InsightsLink;
	}

}
