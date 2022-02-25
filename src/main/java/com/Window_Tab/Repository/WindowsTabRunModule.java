package com.Window_Tab.Repository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author TG1670
 *
 */
public class WindowsTabRunModule {
	@Test
	public void VerifiHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String parentWindow = driver.getWindowHandle();
		String selectNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		FacebookTabWindowPage fb = new FacebookTabWindowPage(driver);
		fb.getSignUpLink().sendKeys(selectNewTab);
		fb.getLogInLink().sendKeys(selectNewTab);
		fb.getMessengerLink().sendKeys(selectNewTab);
		fb.getFacebookLiteTextLink().sendKeys(selectNewTab);
		fb.getWatchLink().sendKeys(selectNewTab);
		fb.getFacebookPayLink().sendKeys(selectNewTab);

		Set<String> AllopensWind = driver.getWindowHandles();
		Iterator<String> itr = AllopensWind.iterator();

		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			Thread.sleep(3000);
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}
}
