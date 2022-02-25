package com.PopUpHandling.Repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TRUGlobal.genericUtility.webDriverUtility;

/**
 * 
 * @author TG1670
 *
 */
public class PopUpsHandlingRunModule {
	@Test
	public void VerifiHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		webDriverUtility wb = new webDriverUtility();
		wb.waitUntilPageLoad(driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		LoginPage ln = new LoginPage(driver);
		ln.getUserNameTextLink().sendKeys("truglobal@rediffmail.com");
		Thread.sleep(4000);
		ln.getLoginButtonLink().click();
		Thread.sleep(4000);
		// driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		ln.getPasswordTextLink().sendKeys("Tester123");
		Thread.sleep(4000);
		driver.quit();

//		Alert alert = driver.switchTo().alert();
//		System.out.println("AlertText:"+alert.getText());
//		alert.accept();
//		Thread.sleep(2000);

	}
}
