package com.TRUGlobal.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage 
{
	WebDriver driver;
	public CompanyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Company")
	private WebElement CompanyLink;
	
	@FindBy(linkText="About us")
	private WebElement AboutusLink;
	
	@FindBy(linkText="Employee Speak")
	private WebElement EmployeeSpeakLink;
	
	@FindBy(linkText="Happy Customers")
	private WebElement HappyCustomersLink;
	
	
	@FindBy(linkText="Life at TRUGlobal")
	private WebElement LifeatTRUGlobalLink;
	
	@FindBy(linkText="Blogs")
	private WebElement BlogsLink;
	
	@FindBy(linkText="Careers")
	private WebElement CareersLink;
	
	@FindBy(linkText="Contact Us")
	private WebElement ContactUsLink;
	
	
	
	
	
	
	
	public void CompanyEmpSpeak()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		EmployeeSpeakLink.click();	
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCompanyLink() {
		return CompanyLink;
	}

	public WebElement getAboutusLink() {
		return AboutusLink;
	}

	public WebElement getEmployeeSpeakLink() {
		return EmployeeSpeakLink;
	}

	public WebElement getHappyCustomersLink() {
		return HappyCustomersLink;
	}

	public WebElement getLifeatTRUGlobalLink() {
		return LifeatTRUGlobalLink;
	}

	public WebElement getBlogsLink() {
		return BlogsLink;
	}

	public WebElement getCareersLink() {
		return CareersLink;
	}

	public WebElement getContactUsLink() {
		return ContactUsLink;
	}

	public void CompanyHappyCustomersLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		HappyCustomersLink.click();	
	}
	
	public void CompanyLifeatTRUGlobalLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		LifeatTRUGlobalLink.click();	
	}
	
	public void CompanyBlogsLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		BlogsLink.click();	
	}
	
	public void CompanyCareersLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		CareersLink.click();	
	}
	
	public void CompanyContactUsLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(CompanyLink).perform();
		ContactUsLink.click();	
	}

}
