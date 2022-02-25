/**
 * 
 */
package com.PopUpHandling.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TG1670
 *
 */
public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login1")
	private WebElement UserNameTextLink;

	@FindBy(id = "password")
	private WebElement PasswordTextLink;

	public WebElement getPasswordTextLink() {
		return PasswordTextLink;
	}

	@FindBy(name = "proceed")
	private WebElement LoginButtonLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserNameTextLink() {
		return UserNameTextLink;
	}

	public WebElement getLoginButtonLink() {
		return LoginButtonLink;
	}

}
