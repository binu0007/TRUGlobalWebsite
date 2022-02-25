package com.TRUGlobal.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiseEnterpriseTransformation
{
	WebDriver driver;
	public ServiseEnterpriseTransformation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Services")
	private WebElement ServicesLink;
	
	public WebElement getServicesLink() {
		return ServicesLink;
	}
	@FindBy(linkText="Oracle Solutions")
	private WebElement OracleSolutionsLink;
	
	@FindBy(linkText="SAP Solutions")
	private WebElement SAPSolutionsLink;
	
	@FindBy(linkText="Microsoft")
	private WebElement MicrosoftLink;
	
	@FindBy(linkText="Salesforce")
	private WebElement SalesforceLink;
	
	
	
	@FindBy(linkText="Enterprise Integration")
	private WebElement EnterpriseIntegrationLink;
	
	@FindBy(linkText="Portals & Collaborations")
	private WebElement PortalsCollaborationsLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOracleSolutionsLink() {
		return OracleSolutionsLink;
	}

	public WebElement getSAPSolutionsLink() {
		return SAPSolutionsLink;
	}

	public WebElement getMicrosoftLink() {
		return MicrosoftLink;
	}

	public WebElement getSalesforceLink() {
		return SalesforceLink;
	}

	public WebElement getEnterpriseIntegrationLink() {
		return EnterpriseIntegrationLink;
	}

	public WebElement getPortalsCollaborationsLink() {
		return PortalsCollaborationsLink;
	}
	

	
	

}
