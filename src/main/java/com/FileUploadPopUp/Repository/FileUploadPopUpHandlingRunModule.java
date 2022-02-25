package com.FileUploadPopUp.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TRUGlobal.genericUtility.webDriverUtility;

/**
 * 
 * @author TG1670
 *
 */
public class FileUploadPopUpHandlingRunModule
{
	@Test
	public void VerifiHomePage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		webDriverUtility wb=new webDriverUtility();
		wb.waitUntilPageLoad(driver);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		LoginPage ln=new LoginPage(driver);
		ln.getFileUploadLink().sendKeys("D://Binu.docx");
		Thread.sleep(4000);
		

		
		
	}
}
