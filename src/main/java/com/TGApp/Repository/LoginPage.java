/**
 * 
 */
package com.TGApp.Repository;

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

	@FindBy(xpath = "//input[@id='id_sc_field_login']")
	private WebElement UserNameTextLink;

	@FindBy(id = "id_sc_field_password")
	private WebElement UserPasswordTextLink;

	@FindBy(id = "sub_form_b")
	private WebElement LoginButtonLink;

	@FindBy(id = "details-button")
	private WebElement advancedBtn;

	@FindBy(id = "proceed-link")
	private WebElement proceedLinkBtn;

	public WebElement getAdvancedBtn() {
		return advancedBtn;
	}

	public WebElement getProceedLinkBtn() {
		return proceedLinkBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserNameTextLink() {
		return UserNameTextLink;
	}

	public WebElement getUserPasswordTextLink() {
		return UserPasswordTextLink;
	}

	public WebElement getLoginButtonLink() {
		return LoginButtonLink;
	}

}
