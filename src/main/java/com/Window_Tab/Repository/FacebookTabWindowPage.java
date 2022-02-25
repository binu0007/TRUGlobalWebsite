/**
 * 
 */
package com.Window_Tab.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TG1670
 *
 */
public class FacebookTabWindowPage {
	WebDriver driver;

	public FacebookTabWindowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement SignUpLink;

	@FindBy(xpath = "//a[text()='Log In']")
	private WebElement LogInLink;

	@FindBy(xpath = "//a[text()='Messenger']")
	private WebElement MessengerLink;

	@FindBy(xpath = "//a[text()='Facebook Lite']")
	private WebElement FacebookLiteTextLink;

	@FindBy(xpath = "//a[text()='Watch']")
	private WebElement WatchLink;

	@FindBy(xpath = "//a[text()='Facebook Pay']")
	private WebElement FacebookPayLink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignUpLink() {
		return SignUpLink;
	}

	public WebElement getLogInLink() {
		return LogInLink;
	}

	public WebElement getMessengerLink() {
		return MessengerLink;
	}

	public WebElement getFacebookLiteTextLink() {
		return FacebookLiteTextLink;
	}

	public WebElement getWatchLink() {
		return WatchLink;
	}

	public WebElement getFacebookPayLink() {
		return FacebookPayLink;
	}

}
