package com.Window_Tab.Repository;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tester {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		String selectNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).sendKeys(selectNewTab);
		driver.findElement(By.xpath("//a[text()='Log In']")).sendKeys(selectNewTab);
		driver.findElement(By.xpath("//a[text()='Messenger']")).sendKeys(selectNewTab);
		driver.findElement(By.xpath("//a[text()='Facebook Lite']")).sendKeys(selectNewTab);
		driver.findElement(By.xpath("//a[text()='Watch']")).sendKeys(selectNewTab);
		driver.findElement(By.xpath("//a[text()='Facebook Pay']")).sendKeys(selectNewTab);
		
		Set<String> AllopensWind=driver.getWindowHandles();
		Iterator<String> itr=AllopensWind.iterator();
		
		while(itr.hasNext())
		{
			String window = itr.next();
			driver.switchTo().window(window);
			Thread.sleep(3000);
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}

}
