package com.TRUGlobal.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage 
{
	WebDriver driver;
	public ServicesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Services")
	private WebElement ServicesLink;
	
	@FindBy(linkText="Robotic Process Automation")
	private WebElement RoboticProcessAutomationLink;
	
	@FindBy(linkText="Artificial Intelligence")
	private WebElement ArtificialIntelligenceLink;
	
	@FindBy(linkText="Machine Learning")
	private WebElement MachineLearningLink;
	
	@FindBy(linkText="Internet of Things")
	private WebElement InternetofThingsLink;
	
	@FindBy(linkText="Mobility")
	private WebElement MobilityLink;
	
	@FindBy(linkText="Chatbot")
	private WebElement ChatbotLink;
	
	@FindBy(linkText="Digital Experience")
	private WebElement DigitalExperienceLink;
	
	@FindBy(linkText="Digital Security")
	private WebElement DigitalSecurityLink;
	
	
	public WebElement getRoboticProcessAutomationLink() {
		return RoboticProcessAutomationLink;
	}
	public WebElement getArtificialIntelligenceLink() {
		return ArtificialIntelligenceLink;
	}
	public WebElement getMachineLearningLink() {
		return MachineLearningLink;
	}
	public WebElement getInternetofThingsLink() {
		return InternetofThingsLink;
	}
	public WebElement getMobilityLink() {
		return MobilityLink;
	}
	public WebElement getChatbotLink() {
		return ChatbotLink;
	}
	public WebElement getDigitalExperienceLink() {
		return DigitalExperienceLink;
	}
	public WebElement getDigitalSecurityLink() {
		return DigitalSecurityLink;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getServicesLink() {
		return ServicesLink;
	}

}
