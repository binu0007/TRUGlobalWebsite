package com.TRUGlobal.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesEngineeringServices 
{
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEngineeringServicesLink() {
		return EngineeringServicesLink;
	}

	public WebElement getSupportMaintenanceLink() {
		return SupportMaintenanceLink;
	}

	public WebElement getEnterpriseDevOpsLink() {
		return EnterpriseDevOpsLink;
	}

	public WebElement getApplicationEngineeringLink() {
		return ApplicationEngineeringLink;
	}

	public WebElement getProductDesignDevelopmentLink() {
		return ProductDesignDevelopmentLink;
	}

	public WebElement getProductStrategyLink() {
		return ProductStrategyLink;
	}

	public WebElement getManufacturingExecutionSystemLink() {
		return ManufacturingExecutionSystemLink;
	}

	public WebElement getPLMServicesLink() {
		return PLMServicesLink;
	}

	WebDriver driver;
	public ServicesEngineeringServices(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Engineering Services")
	private WebElement EngineeringServicesLink;
	
	@FindBy(linkText="Support & Maintenance")
	private WebElement SupportMaintenanceLink;
	
	@FindBy(linkText="Enterprise DevOps")
	private WebElement EnterpriseDevOpsLink;
	
	@FindBy(linkText="Application Engineering")
	private WebElement ApplicationEngineeringLink;
	
	@FindBy(linkText="Product Design & Development")
	private WebElement ProductDesignDevelopmentLink;
	
	@FindBy(linkText="Product Strategy")
	private WebElement ProductStrategyLink;
	
	@FindBy(linkText="Manufacturing Execution System (MES)")
	private WebElement ManufacturingExecutionSystemLink;
	
	@FindBy(linkText="PLM Services")
	private WebElement PLMServicesLink;
	
	@FindBy(linkText="Services")
	private WebElement ServicesLink;
	
	public WebElement getServicesLink() {
		return ServicesLink;
	}

}
