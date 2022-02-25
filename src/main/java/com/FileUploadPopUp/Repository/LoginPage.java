/**
 * 
 */
package com.FileUploadPopUp.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TG1670
 *
 */
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Upload Resume']")
	private WebElement FileUploadLink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFileUploadLink() {
		return FileUploadLink;
	}
	
	
	
	

}
