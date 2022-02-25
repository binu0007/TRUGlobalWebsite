package com.TGApp.Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author TG1670
 *
 */
public class TGAppRunModule {
	@Test
	public void VerifiHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://10.60.20.18/tgaprdv9/");

		LoginPage ln = new LoginPage(driver);
		ln.getAdvancedBtn().click();
		ln.getProceedLinkBtn().click();

		ln.getUserNameTextLink().sendKeys("QA_TEST_USER");
		ln.getUserPasswordTextLink().sendKeys("qtU63432");
		ln.getLoginButtonLink().click();

		MyDSR dsr = new MyDSR(driver);
		dsr.getMenuLink().click();
		dsr.getMyProfileLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		dsr.getQuickSearcheLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		dsr.getMyTaskLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		Thread.sleep(4000);
		dsr.getMyActivityLink().click();
		Thread.sleep(4000);
		dsr.getMyDSRLink().click();
		Thread.sleep(4000);

		WebElement Parent = driver.findElement(By.xpath("//*[@id ='Iframe_control']//iframe[@id='iframe_item_65']"));

		driver.switchTo().frame(Parent);
		Thread.sleep(2000);

		dsr.getCreateDSRLink().click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main_menu_internal_ts_iframe");
		dsr.getClickOnCalendar().click();
		Thread.sleep(2000);
		dsr.getClickOnFeb().click();
		Thread.sleep(2000);
		dsr.getClickOnCreateDSR().click();
		Thread.sleep(2000);
	}
}
